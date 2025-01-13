package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + "나이 : " + studentAges[i] + "성적 : " + studentGrade[i]);
        }

        // ClassStart1 문제점을 배열로 해결
        // 수정해야할 코드 양이 줄었지만 수정할 때 인덱스에 맞게 수정해야 함
        // 사람이 관리하기 좋은 방식이 아님
    }
}
