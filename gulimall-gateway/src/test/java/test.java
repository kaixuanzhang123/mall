import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class test {
//    public static void main(String[] args) throws Exception {
//        //用于获取到本java进程，进而获取总线程数
//        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
//        String jvmName = runtimeBean.getName();
//        System.out.println("JVM Name = " + jvmName);
//        long pid = Long.valueOf(jvmName.split("@")[0]);
//        System.out.println("JVM PID  = " + pid);
//        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
//        int n = 30000;
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,20,1000, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
//        for (int i = 0; i < n; i++) {
//
//            for(int j=0;j<10;j++){
//                executor.execute(()->{
//                    System.out.println("当前线程总数为："+bean.getThreadCount());
//                });
//            }
//        }
//        Thread.sleep(10000);
//        System.out.println("线程总数为 = " + bean.getThreadCount());
//    }

    public static void main(String[] args) {
        writeFile("sssssssssssss");
    }
    public static boolean writeFile(String content) {
        String filename = "C:\\Users\\Lenovo\\Desktop\\1.txt";
        try {
            File f = new File(filename);
            if (!f.exists()) {
                f.createNewFile();
            }
            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f));

            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter writer = new BufferedWriter(fileWriter, 16384);
            //BufferedWriter writer = new BufferedWriter(write);
            List<String> list=new ArrayList<>();
            list.add("ss");
            list.add("dd");
            writer.write(list.toString());
            //writer.write(content);
            writer.flush();
            write.close();

            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
