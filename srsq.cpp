#include<bits/stdc++.h>
using namespace std;
#define ll long long int
#define str string
#define pb push_back
#define vc vector
#define ci cin
#define co cout

int main()
{
      ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll n,q;
    cin>>n>>q;
    ll dp[n+100],a[n+10];
    dp[0]=0;
    for(int i=1;i<=n;i++)
    {
        cin>>a[i];
        if(i==1)
            dp[i]=a[i];
        else
            dp[i]=dp[i-1]+a[i];
    }
    while(q--)
    {
        ll l,r;
        cin>>l>>r;
        cout<<dp[r]-dp[l-1]<<"\n";
    }


}
