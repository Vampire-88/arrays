package cn.sxt.array;



public class TextArrayCopy {
    public static void main(String[] args) {

        //测试数组删除
        String[] str = {"aa","bb","cc","dd","ee"};
        Delete(str,3);
        System.out.print("\n"+"################");
        //测试数组扩容
        String[] str_1 = {"aa","bb","cc","dd","ee","ff"};
        extendRange(str_1,5);
        System.out.print("\n"+"################");
        //测试数组插入
        String[] str_2 = {"aa","bb","cc","dd","ee","ff","gg"};
        insert(str_2,2,"ww");
    }

    public static void textCopy(){
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,0,2);
       for(String temp:s2){
           System.out.println(temp);
     }
    }
//删除数组中指定位置的索引
    public static String[] Delete(String[] s,int index){
        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1]=null;
        for(String temp:s){
            System.out.print(temp+" ");
        }
        return s;

    }
//数组扩容（本质上还是数组拷贝，拷贝到更大的数组）
     public static String[] extendRange(String[] s,int add){
        String[] str1 = new String[s.length+add];
        System.arraycopy(s,0,str1,0,s.length);
         System.out.print("\n");
         for(String temp:str1){
             System.out.print(temp+" ");
         }
        return str1;
     }
//数组插入（本质上是数组扩容后再拷贝数据）
     public static String[] insert(String[] s,int socket,String date){
        String[] str2 = new String[s.length+1];
        System.arraycopy(s,socket+1,str2,socket+2,s.length-socket-1);
        System.arraycopy(s,0,str2,0,socket+1);
        str2[socket+1]=date;
         System.out.print("\n");
         for(String temp:str2){
             System.out.print(temp+" ");
         }
        return str2;
     }

}
