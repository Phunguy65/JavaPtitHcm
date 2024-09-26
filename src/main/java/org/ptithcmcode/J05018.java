package org.ptithcmcode;

/**
 * J05018:
 * 
 * @author PNguyen
 * 
 * Trường THCS XYZ lập bảng điểm tổng kết cho học sinh. Có 10 môn học lần lượt gồm: Toán, Tiếng Việt, Ngoại ngữ, Vật lý, Hóa học, Sinh học, Lịch Sử, Địa, Giáo dục công dân và môn Công nghệ. Trong đó môn Toán và Tiếng Việt tính hệ số 2, các môn còn lại hệ số 1.
 *
 * Học sinh được xếp hạng theo điểm trung bình:
 *
 *     Từ 9 trở lên: loại XUAT SAC
 *     Từ 8 đến 8.9: loại GIOI
 *     Từ 7 đến 7.9: loại KHA
 *     Từ 5 đến 6.9: loại TB
 *     Dưới 5: loai YEU
 *
 * Hãy lập bảng điểm tổng kết và sắp xếp theo điểm trung bình giảm dần.
 *
 * Input
 *
 * Dòng đầu ghi số học sinh (không quá 50).
 *
 * Thông tin về mỗi học sinh có hai dòng: dòng đầu là họ tên (độ dài không quá 50), dòng thứ 2 gồm 10 số thực trong đoạn [0..10] lần lượt là điểm 10 môn theo đúng thứ tự đã mô tả.
 *
 * Output
 *
 * Danh sách đã sắp xếp được ghi ra bao gồm các thông tin:
 *
 *     Mã học sinh (tự động gán tăng dần theo thứ tự nhập, bắt đầu là HS01)
 *     Họ và tên
 *     Điểm trung bình (với 1 chữ số phần thập phân)
 *     Xếp loại
 *
 * Trong trường hợp điểm trung bình bằng nhau thì học sinh nào có mã học sinh nhỏ hơn sẽ xếp trên.
 *
 * Ví dụ
 */
public class J05018 {
    
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int t = Integer.parseInt(sc.nextLine());
            
            java.util.List<StudentV4> students = new java.util.ArrayList<>();
            
            while(t-- > 0) {
                StudentV4 student = new StudentV4(sc.nextLine(), java.util.Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray());
                students.add(student);
            }
            
            students.stream().sorted().forEach(System.out::println);
        }
    }
}

class StudentV4 implements Comparable<StudentV4> {
    private static int count = 0;

    private String id;

    private String name;

    private double[] scores;

    {
        count++;
        
        if(count < 10) {
            id = "HS0" + count;
        } else {
            id = "HS" + count;
        }
    }

    public StudentV4(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i] * (i < 2 ? 2 : 1);
        }
        return sum / 12;
    }

    public String getRank() {
        double avg = getAverage();
        if (avg >= 9) {
            return "XUAT SAC";
        } else if (avg >= 8) {
            return "GIOI";
        } else if (avg >= 7) {
            return "KHA";
        } else if (avg >= 5) {
            return "TB";
        }
        return "YEU";
    }

    @Override
    public int compareTo(StudentV4 o) {
        int c = Double.compare(o.getAverage(), getAverage());
        if (c == 0) {
            return id.compareTo(o.id);
        }
        return c;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", id, name, getAverage(), getRank());
    }
}

