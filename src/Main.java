public class Main {
    public static void main(String[] args) {

        int totalPrice = 0;
        int countJavaBook = 0;

        Book bookList[] = new Book[10];
        for (int i = 0; i < 10; i++) {
            bookList[i] = new Book();
        }

        bookList[0] = new ProgrammingBook("BookCode1", "Java", 200000, "author1", "Java", "Angular");
        bookList[1] = new ProgrammingBook("BookCode2", "ProgramBook2", 300000, "author2", "PHP", "Laravel");
        bookList[2] = new ProgrammingBook("BookCode3", "ProgramBook3", 500000, "author3", "Python", "Django");
        bookList[3] = new ProgrammingBook("BookCode4", "ProgramBook4", 600000, "author1", "Javascript", "React");
        bookList[4] = new ProgrammingBook("BookCode5", "ProgramBook5", 800000, "author1", "Java", "Spring");

        bookList[5] = new FictionBook("BookCode6", "FictionBook1", 400000, "Author6", "Comedy");
        bookList[6] = new FictionBook("BookCode7", "FictionBook2", 700000, "Author7", "Anime");
        bookList[7] = new FictionBook("BookCode8", "FictionBook3", 900000, "Author8", "Action");
        bookList[8] = new FictionBook("BookCode9", "FictionBook4", 100000, "Author9", "Horror");
        bookList[9] = new FictionBook("BookCode10", "FictionBook5", 500000, "Author10", "Adventure");

        for (int i = 0; i < bookList.length; i++) {
            totalPrice += bookList[i].getPrice();
            if (bookList[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) bookList[i]).getLanguage().equalsIgnoreCase("Java")) {
                    countJavaBook++;
                }
            }
        }

        System.out.println("Tổng tiền của 10 cuốn sách là " + totalPrice + " đồng" +
                "\nSố sách PrgrammingBook có language \"Java\" là: " + countJavaBook);
    }
}
