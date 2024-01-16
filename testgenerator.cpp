#include <cstdlib>
#include <ctime>
#include <cstdio>
#include <iostream>
#include <vector>
#include <random>
using namespace std;

int main(){
    random_device rd;
    std::mt19937 rng(rd());
    for(uint32_t i=0;i<30;++i){
        uint32_t random_num=rng()%10+1;
        uint32_t d_or_i=rng()%6+1;
        if(d_or_i<=4){
            cout << "i" << random_num << " ";
        }
        else{
            cout << "d" << random_num << " ";           
        }
    }
    cout << "p\n";

}