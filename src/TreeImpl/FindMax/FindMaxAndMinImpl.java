package TreeImpl.FindMax;

public class FindMaxAndMinImpl {
	
	
		public static int findMaxValue(Node node) {
			
			if (node==null)
				return Integer.MIN_VALUE;
			
			int currentNodeData=node.data;
			
		
			int leftNodeData=findMaxValue(node.leftNode);
			
			int rightNodeData=findMaxValue(node.rightNode);
			System.out.println("+++++++++++"+leftNodeData);
			System.out.println("+++++++++++"+rightNodeData);
			int value=Math.max(Math.max(leftNodeData, rightNodeData), currentNodeData);
			System.out.println("+++++++++++"+value);
			return value;
			
		}
		
		
		public static int findMinValue(Node node) {
			
			if (node==null)
				return Integer.MAX_VALUE;
			
			int currentNodeData=node.data;
			int leftNodeData=findMinValue(node.leftNode);
			int rightNodeData=findMinValue(node.rightNode);
			return Math.min(currentNodeData, Math.min(leftNodeData, rightNodeData));
			
		}

}
