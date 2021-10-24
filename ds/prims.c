#include<stdio.h>
#define INFI 32767


int main()
{
    int a,b,u,v,n,i,j,ne=1;
    int alreadyVisited[10]={0},min,mincost=0,cost[10][10];

    printf("\nEnter the number of nodes:");
    scanf("%d",&n);

    printf("\nEnter the adjacency matrix:\n");

    for(i=1;i<=n;i++){
        for(j=1;j<=n;j++) {
            scanf("%d",&cost[i][j]);
            if(cost[i][j]==0)
                cost[i][j]=INFI;
        }
    }

    alreadyVisited[1]=1;

    while(ne < n)
    {
        for(i=1,min=INFI;i<=n;i++) 
            for(j=1;j<=n;j++) 
                if(cost[i][j]< min) 
                    if(alreadyVisited[i]!=0) {
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                    }

        if(alreadyVisited[u]==0 || alreadyVisited[v]==0) {
            printf("\nEdge %d:(%d %d)",ne++,a,b);
            printf("\nWeight:%d", min);
            mincost+=min;
            alreadyVisited[b]=1;
        }
        printf("\n");
        cost[a][b]=cost[b][a]=INFI;
    }

    printf("\nMin cost=%d\n",mincost);

}
