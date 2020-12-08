#include<stdio.h>
#define INFI 32767


int main()
{
    int a, b, u, v, n, i, j, ne=1;
    int alreadyVisited[10]={0},min,mincost=0,cost[10][10];

    printf("\nEnter the number of nodes:");
    scanf("%d",&n);

    printf("\nEnter matrix:\n");

    for(i=1; i<=n; i++){
        for(j=1; j<=n; j++) {
            scanf("%d",&cost[i][j]);
            if(cost[i][j]==0)
                cost[i][j]=INFI;
        }
    }

    alreadyVisited[1]=1;
       j1 j2 j3
    i1 7  8   9
    i2 4  5   6
    i3 1  2   3

    while(ne < n)
    {
    	min=INFI;
        for(i=1; i<=n; i++) {
            for(j=1; j <= n; j++) {
            	printf("Looping %d\n", cost[i][j]);
                if(cost[i][j] < min){
                	printf("Less than possible\n"); 
                    if(alreadyVisited[i] != 0) {
                    	printf("min changed to :%d\n", cost[i][j]);
                        min = cost[i][j];
                        a = u = i;
                        b = v = j;
                    }
                 }
            }
         }
	printf("min >>%d, u = %d, v = %d\n", min, u, v);
        if(alreadyVisited[u]==0 || alreadyVisited[v]==0) {
            printf("\n -- Edge %d:(%d %d)",ne++,a,b);
            printf("\n -- Weight:%d", min);
            mincost+=min;
            alreadyVisited[b]=1;
        }
        printf("\n");
        cost[a][b]=cost[b][a]=INFI;
    }

    printf("\nMin cost=%d\n",mincost);

}
