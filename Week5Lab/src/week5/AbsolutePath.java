package week5;

public class AbsolutePath {

    public static String ensureAbsolute(String arg) {
        if (arg.startsWith("/")) {
            return arg;
        }

        return System.getProperty("user.dir") + "/" + arg;
    }

    public static String[] absoluteSplitPath(String s) {
        String[] components = SplitPathName.splitPath(s);
        components[0] = ensureAbsolute(components[0]);
        return components;
    }

    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            String[] components = absoluteSplitPath(args[i]);

            System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
        }
    }

}