public class Main {
    public static void main(String[] args) {

        String languageCode = "en";
       switch (languageCode){
        case "en": System.out.println("англ");
        break;
           case "de": System.out.println("немецкий");
               break;
           case "jp": System.out.println("японский");
               break;
           case "tr": System.out.println("турецкий");
               break;
           case "he": System.out.println("иврит");
               break;
    }

        String languageCod = "en";
        if (languageCod.equals("en")) {
            System.out.println("англ");
        } else if (languageCod.equals("de")) {
            System.out.println("немецкий");
        } else if (languageCod.equals("jp")) {
            System.out.println("японский");
        } else if (languageCod.equals("tr")) {
            System.out.println("турецкий");
        } else if (languageCod.equals("he")) {
            System.out.println("иврит");
        }






    }
}