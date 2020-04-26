import java.util.List;

public class Test {
    public static void main(String[] args) {
        int numUser = 3;
        int numSubChannel = 15;

        List<List<Integer>> tmp = new distributeSubChannels().distributeSubChannels(numUser,numSubChannel);
        int i = 0;
        for(List<Integer> each : tmp){
            System.out.println("---Case"+(i++)+"---");
            for(Integer eachone : each)
                System.out.print(eachone + "-");
            System.out.println();
        }
    }
}
