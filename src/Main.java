public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    }
    public static void main(String[] args) {
        Author Bulgakov = new Author("Михаил","Булгаков");
        printSeparator();
        System.out.println("Автор - " + Bulgakov.getName() + " " + Bulgakov.getSurname());
        System.out.println(Bulgakov.toString());
        Book dogHeart = new Book("Собачье сердце", Bulgakov, 1925);
        Book dogHeart2  = new Book("Собачье сердце", Bulgakov, 1925);
        System.out.println(dogHeart2.equals(dogHeart));
        System.out.println(dogHeart.hashCode());
        System.out.println(dogHeart2.hashCode());
        System.out.println(" Название книги - " + dogHeart.getName() );
        System.out.println("Год издания - " + dogHeart.getYear());
        printSeparator();
        Author Gogol = new Author("Николай","Гоголь");
        System.out.println("Автор - " + Gogol.getName() + " " + Gogol.getSurname());
        Book Viy = new Book("Вий",Gogol,1834);
        System.out.println("Название книги - " + Viy.getName());
        System.out.println(" Год издания - " + Viy.getYear());
        Viy.setYear(1835);
        System.out.println("Год издания - " + Viy.getYear());
        printSeparator();


    }
    }
