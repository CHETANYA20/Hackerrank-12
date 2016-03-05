//https://www.hackerrank.com/challenges/cipher

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
    int n,k,i,j=0,count=0;
    char s[2000001],or[1000001],temp,temp1;
    scanf("%d %d",&n,&k);
    scanf("%s",s);
    //temp=(int)s[0]-'0';
   // printf("%d")
    or[0]=s[0];
    if(or[0]=='1')
        count++;
    for(i=1;i<n;i++){
        if(i<k){
        if(s[i]=='1'){
            if(count%2)
                or[i]='0';
            else
                or[i]='1',count++;
        }
        else{
            if(count%2)
                or[i]='1',count++;
            else
                or[i]='0';
        }
        }
        else{
            if(or[j++]=='1')
                count--;
        if(s[i]=='1'){
            if(count%2)
                or[i]='0';
            else
                or[i]='1',count++;
        }
        else{
            if(count%2)
                or[i]='1',count++;
            else
                or[i]='0';
        }  
        }
            
    }
    printf("%s",or);
    return 0;
}
