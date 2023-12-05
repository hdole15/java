public class OuterClass {
    
    public static class InnerClass {
        private int innerField;

        public InnerClass(int innerField) {
            this.innerField = innerField;
        }

        public void displayInnerField() {
            System.out.println("Inner Field: " + innerField);
        }
    }

    public static void main(String[] args) {
        InnerClass innerObj = new InnerClass(42);

        innerObj.displayInnerField();
    }
}
