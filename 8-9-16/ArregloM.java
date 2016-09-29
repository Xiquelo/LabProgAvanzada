class ArregloM
{
	public static void main(String []args)
	{
		int a[][]={{1,3},{5,10}};
		int b[][]={{5,8},{8,10}};
		int result[][]=new int[2][2];
		int i,j;

		result[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
		result[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
		result[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
		result[1][1]=a[1][0]*b[1][0]+a[1][1]*b[1][1];

		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(result[i][j]+"");
			}
		System.out.println();
		}
	}
}