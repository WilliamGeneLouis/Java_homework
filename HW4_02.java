import java.util.Random;

public class HW4_02{
    public static void main(String[] args){
        new get_random_num();
    }
}

class get_random_num{

    public get_random_num(){

        int [] array = new int[20];

        String str1 = " ";
        String str = " ";

        for (int i = 0; i < 20 ; i++){
            Random array_ele = new Random();
            array[i] = 10 + array_ele.nextInt(80);
            for (int j = 0; j < i; j++){ // 检测是否是重复的数字
                if(array[i] == array[j]){
                    i--; // 如果出现重复的数字就让i等一下
                    break;
                }
            }
        }

        for(int i= 0; i < 19; i++){
            if(i != 0){
                String x = array[i] + ", ";
                str1 = x + str1;
            }else{
                String x = array[i] +" ";
                str1 = x + str1;
            }
        }

        System.out.println("将生成的随机数组输出： " + str1);

        // 对数组进行排序
        for(int i = 0; i < 20; i ++){
            for(int j = 0; j < i; j ++)
            {
                if (array[j] <= array[i]) {
                    array[i] = array[i];
                }
                else {
                    int tmp;
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }

        for(int i = 0; i < 19; i++){
            if(i != 0){
                String y = array[i] + ", ";
                str = y + str;
            }else{
                String y = array[i] +" ";
                str = y + str;
            }
        }

        System.out.println("将生成的随机数组进行排序输出：" + str);


    }
}
