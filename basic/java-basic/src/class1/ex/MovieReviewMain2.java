package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview movieReview2 = new MovieReview("어바웃타임", "인생 시간영화!");

        MovieReview[] movieArrays = new MovieReview[]{movieReview1, movieReview2};

        for (MovieReview array : movieArrays) {
            System.out.println("영화 제목 : " + array.title + ", 리뷰 : " + array.review);
        }
    }
}
