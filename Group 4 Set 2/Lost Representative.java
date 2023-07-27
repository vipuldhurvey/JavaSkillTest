#include<bits/stdc++.h>
using namespace std;

void dfs(int i, int j, vector<vector<int>>& arr, vector<vector<bool>>& vis, int& size){
    if(i<0 || j<0 || i>=arr.size() || j>=arr[0].size() || arr[i][j]==0 || vis[i][j])
        return;
    vis[i][j]=true;
    ++size;
    dfs(i-1,j,arr,vis,size);
    dfs(i+1,j,arr,vis,size);
    dfs(i,j-1,arr,vis,size);
    dfs(i,j+1,arr,vis,size);
}
int main(){
    int T;
    cin>>T;
    while(T--){
        int n;
        cin>>n;
        vector<vector<int>> arr(n,vector<int>(n));
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                cin>>arr[i][j];
        int p;
        cin>>p;
        bool flag=0;
        vector<vector<bool>> vis(n,vector<bool>(n,false));
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1 && !vis[i][j]){
                    int s=0;
                    dfs(i,j,arr,vis,s);
                    if(s==p){
                        cout<<i<<" "<<j<<"\n";
                        flag=true;
                    }
                }
            }
            if(flag)
                break;
        }
        if(!flag)
            cout<<"-1 -1\n";
    }
    return 0;
}