package StaticExamples;

class TestBlocks {
    static{
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}

public class StaticBlocks {
    public static void main(String[] args) {
        TestBlocks t = new TestBlocks();
        System.out.println("Main");
    }
}
