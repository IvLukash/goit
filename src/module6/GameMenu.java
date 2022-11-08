package module6;

public class GameMenu {

    public void act(MenuItem item) {
        System.out.println(item.getAction());
    }

    public static abstract class MenuItem {
        public abstract String getAction();
    }

    public static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    public static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    public static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }
}
