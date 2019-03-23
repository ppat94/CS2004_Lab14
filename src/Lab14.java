import java.util.ArrayList;


public class Lab14 {

	public static void main(String[] args) {

		ArrayList<Integer> clusters = new ArrayList<>();
		ArrayList<Integer> clusterResult = new ArrayList<>();
		double[][] arrayListClusters;

		// I changed the ranges to 1-25, 26-75 and 76-100 for the respective 'for' loops for 14.4 Exercise 1
		for (int i = 1; i <= 50; i++) {
			clusters.add(0);
		}
		for (int j = 51; j <= 100; j++) {
			clusters.add(1);
		}
		for (int k = 101; k <= 150; k++) {
			clusters.add(2);
		}
		//System.out.println(clusters);
	
	// Comment out these lines to test with the CLusterLab text file
//	arrayListClusters = KMeans.ReadArrayFile("C://Users/Parth/Desktop/ClusterLab.txt", ",");
//	
//	KMeans kMeansObj = new KMeans(arrayListClusters, 3, 100);
//	clusterResult = kMeansObj.RunIter(3, 10, clusters, true);
		
	arrayListClusters = KMeans.ReadArrayFile("C://Users/Parth/Desktop/bezdekIris.txt", ",");
	
	KMeans kMeansObj = new KMeans(arrayListClusters, 4, 150);
	clusterResult = kMeansObj.RunIter(3, 10, clusters, true);
	System.out.println(clusterResult);
		
	}

}
