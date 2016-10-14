import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by tuoniao on 2016/10/11.
 * �޸�����
 */
public class Demo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("username", "qq");
        map.put("passWord", "123");
        map.put("userID", "1");
        map.put("email", "qq@qq.com");

        /*
        ��һ����forѭ��
         */
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }


        /*
        �ڶ����õ���
         */
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry<String, String> entry1 = (Map.Entry<String, String>)i.next();
            System.out.println(entry1.getKey() + "==" + entry1.getValue());
        }


        /*
        ��keySet()����
        */
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            String key;
            String value;
            key = it.next().toString();
            value = map.get(key);
            System.out.println(key + "--" + value);
        }


        /*
        ��entrySet()����
        */
        Iterator it1 = map.entrySet().iterator();
        System.out.println(map.entrySet().size());
        String key;
        String value;
        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry)it1.next();
            key = entry.getKey().toString();
            value = entry.getValue().toString();
            System.out.println(key + "====" + value);
        }


    }
}
