public class Table {
        public void a(int n) {
            for (int i = 1; i < 10; i++) {
                System.out.println(i * n);
            }
        }

        public static void main(String[] args) {
            Table table = new Table();
            for (int i = 2; i < 10; i++) {
                table.a(i);
            }
        }
    }
