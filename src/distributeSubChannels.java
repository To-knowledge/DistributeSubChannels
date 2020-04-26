import java.util.ArrayList;
import java.util.List;

public class distributeSubChannels {
    List<Integer> oneCase = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> distributeSubChannels(int numUser, int numChannel){
        backTrack(numUser,numChannel);
        return result;
    }

    private void backTrack(int numUser, int numChannel){
        //回溯结束条件
        if(numUser == 1){
            oneCase.add(numChannel);
            result.add(new ArrayList<>(oneCase));
            oneCase.remove(oneCase.size()-1);
            return;
        }
        //把i个信道分配给当前用户
        for(int i = 0; i <= numChannel; i++){
            //递归之前的操作
            oneCase.add(i);
            //递归
            backTrack(numUser - 1, numChannel - i);
            //递归之后的操作
            oneCase.remove(oneCase.size() - 1);
        }
    }
}
