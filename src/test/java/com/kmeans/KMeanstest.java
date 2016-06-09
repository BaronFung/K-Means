package test.java.com.kmeans;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.com.kmeans.Kmeans;
import main.java.com.kmeans.Kmeans_data;
import main.java.com.kmeans.Kmeans_param;

public class KMeanstest {
     @Test
     public void test(){
    	 double[][] points = { { 0, 0 }, { 4, 10 }, { 1, 1 }, { 5, 8 } }; // 测试数据，四个二维的点
 		Kmeans_data data = new Kmeans_data(points, 4, 2); // 初始化数据结构
 		Kmeans_param param = new Kmeans_param(); // 初始化参数结构
 		param.initCenterMehtod = Kmeans_param.CENTER_RANDOM; // 设置聚类中心点的初始化模式为随机模式
 		Kmeans.doKmeans(2, data, param);
 		int[] testdata={0,1,0,1};
 		assertArrayEquals(testdata, data.labels);
     }


}
