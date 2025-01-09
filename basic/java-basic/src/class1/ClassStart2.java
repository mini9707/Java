package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + "나이 : " + studentAges[i] + "성적 : " + studentGrade[i]);
        }

        // ClassStart1 클래스보다 추가해야 할 코드양이 적다
        // 그러나, 데이터가 많을 때 한 학생의 데이터를 변경할 때 인덱스에 맞게 삭제해야 하는 경우
        // 데이터를 삭제하는데 주의가 필요하다 (불편)
    }
}
