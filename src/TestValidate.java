public class TestValidate {
    public static void main(String[] args) {
        String[] arrString = new String[5];
        arrString[0] = "C0318G";
        arrString[1] = "P0318dd3G";
        arrString[2] = "A0318L";
        arrString[3] = "M0318A";
        arrString[4] = "C031G8G";
        Validate validate = new Validate();
        for (String string : arrString) {
            System.out.println(validate.validateClassName(string));
        }
    }
}
