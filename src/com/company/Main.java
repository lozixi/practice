package com.company;

import sun.dc.pr.PRError;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * 打印内容
     *
     * @param index  索引
     * @param object 对象
     */
    public static void print(int index, Object object) {
        System.out.println(String.format("{%d},%s", index, object.toString()));
    }

    public static void demoOperation() {
        print(1, 5 + 2);
        print(2, 5 - 2);
        print(3, 5 * 2);
        print(4, 5 / 2);
        print(5, 5 % 2);
        print(6, 5 << 2);
        print(7, 5 >> 2);
        print(8, 5 >>> 2);
        print(9, 5 | 2);
        print(10, 5 ^ 2);
}
    public static void demoList(){
        List<String> strList = new ArrayList<String>(10);
        for(int i=0;i<4;i++){
            strList.add(String.valueOf(i));
        }

        List<String> strListB = new ArrayList<String>(10);
        for(int i=0;i<4;i++){
            strList.add(String.valueOf(i*i));
        }
        strList.addAll(strListB);
        print(1,strList);
        strList.remove(0);
        print(2,strList);
        strList.remove(String.valueOf(1));
        print(3,strList);

        Collections.reverse(strList);
        print(4,strList);
        Collections.sort((strList));
        print(5,strList);
        //比较器排序
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(6,strList);

        for(String obj:strList){
            print(7,obj);
        }
        for(int i=0;i<strList.size();i++){
            print(8,strList.get(i));
        }

        int[] arr = new int[]{1,2,3};
        print(9,arr[2]);
    }
    public static void demoMapTable(){
        Map<String,String> map = new HashMap<String, String>();
        for (int i=0;i<4;i++){
            map.put(String.valueOf(i),String.valueOf(i*i));
        }
        print(1,map);

        for (Map.Entry<String,String> entry :map.entrySet()) {
            print(2,entry.getKey()+"="+entry.getValue());
        }

        print(3,map.values());
        print(4,map.keySet());
        print(5,map.get("3"));
        print(6,map.containsKey("A"));
    }
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for (int i=0;i<4;i++){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);

        strSet.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(2,strSet);

        for (String value:strSet){
            print(3,value);
        }
    }
    public static void demoException(){
        try{
            int k=2;
            //k = k/0;
            if(k==2){
                throw new Exception("我故意");
            }
        }catch (Exception e){
            print(2,e.getMessage());
        }finally {
            print(3,"finally");
        }
    }
    public static void oo(){
//        Animal animal = new Animal("tom",2);
//        animal.say();
        Animal human = new Human("li",3,"China");
        human.say();
    }

    public static void demoFunction(){
        Random random = new Random();
        //random.setSeed(2);
        print(1,random.nextInt(1000));

        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,5});
        Collections.shuffle(array);
        print(2,array);

        Date date = new Date();
        print(4,date);
        print(5,date.getTime());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(6,df.format(date));

        print(7,UUID.randomUUID());
        print(8,Math.log(10));
        print(9,Math.min(3,10));
        print(10,Math.max(3,10));
//        print(8,Math.sqrt(10));
       // print(11,Math.ceil(2.2));//double
        print(12,Math.floor(2.2));//double
    }
    public static void main(String[] args) {
        // write your code here
        //print(1, "hello world");
        //demoOperation();
        //demoList();
        //demoMapTable();
        //demoSet();
        //demoException();
        //oo();
        demoFunction();
    }
}
