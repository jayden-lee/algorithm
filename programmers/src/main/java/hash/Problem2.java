package hash;

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {
//        String[] phoneBook = {"123", "12", "1"};
        String[] phoneBook = {"123", "456", "789"};
        boolean find = solution(phoneBook);
        System.out.println(find);
    }

    public static boolean solution(String[] phone_book) {
        // 전화번호 길이 값에 따른 순서가 중구난방인 경우에 startsWith 메서드를 적용할 수 없음
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            final String basePhone = phone_book[i];
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(basePhone)) {
                    return false;
                }
            }
        }

        return true;
    }
}
