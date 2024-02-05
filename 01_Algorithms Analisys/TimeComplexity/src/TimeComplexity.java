import java.util.Scanner;
public class TimeComplexity {
    static long start;
    static long end;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of iterations for the loops");
        int n= sc.nextInt();
        sc.close();
        start = 0;
        end = 0;
        Thread.sleep(1000);
        SingleLoop(n);
        DoubleNestedLoop(n);
        TripleNestedLoop(n);

    }

    public static long SingleLoop(int nested1)  throws InterruptedException {
        long instructions = 0;
        start = System.nanoTime();// Get the current time
        System.out.println("Start: "+start);
        for (int i = 0; i < nested1; i++) {
            instructions += 2;
        }
        instructions /=2;
        end = System.nanoTime();// Get the current time
        System.out.println("END:   "+end);
        System.out.println("Instructions " + instructions);// Print the Instructions
        System.out.println("Time: " + (end - start)/(1000*1000) + " ms");// Print the time
        System.out.println("Time: " + (end - start)/(1000) + " micro seg");// Print the time
        clearTime();
        return instructions;
    }

    public static long DoubleNestedLoop(int nested2) throws InterruptedException {
        long instructions = 0;
        System.out.println("=================Double Nested Loop===================");
        start = System.nanoTime();// Get the current time
        System.out.println("Start: "+start);
        for (int i = 0; i < nested2; i++) {
            for (int j = 0; j < nested2; j++) {
                instructions += 1;
            }
        }
        end = System.nanoTime();// Get the current time
        System.out.println("END:   "+end);
        System.out.println("Time: " + (end - start)/(1000*1000) + " ms");// Print the time
        System.out.println("Time: " + (end - start)/(1000) + " micro seg");// Print the time
        System.out.println("Instructions " + instructions);// Print the Instructions
        clearTime();
        return instructions;
    }

    public static long TripleNestedLoop(int nested3) throws InterruptedException {
        long instructions = 0;
        System.out.println("=================Triple Nested Loop===================");
        start = System.nanoTime();// Get the current time  
        System.out.println("Start: "+start);
        for (int i = 0; i < nested3; i++) {
            for (int j = 0; j < nested3; j++) {
                for (int k = 0; k < nested3; k++) {
                    instructions += 1;
                }
            }
        }
        end = System.nanoTime();// Get the current time
        System.out.println("END:   "+end);
        System.out.println("Time: " + (end - start)/(1000*1000) + " ms");// Print the time
        System.out.println("Time: " + (end - start)/(1000) + " micro seg");// Print the time
        System.out.println("Instructions " + instructions);// Print the Instructions
        clearTime();
        return instructions;
    }

    public static void clearTime() throws InterruptedException {
        // Clear garbage
        System.gc();
        start = 0;
        end = 0;
        Thread.sleep(1000);
    }
}
