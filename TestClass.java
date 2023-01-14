import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class TestClass{static char[][] c = {{'+','+', '+' } , {'+', '+', '+' } , {'+', '+', '+' }};static int[] xh = new int [10];static int[][] dl = new int[20][3];
static int maxd = 0; static int[] mostd = new int[20]; static int[] attacklist = new int[9]; static int[] attackchance = new int[9]; static int maxa = 0; static int[] mosta = new int[20];
static int best = 0; static int user;
static void print(String s) {System.out.print(s);}
static void print(int s) {System.out.print(s);}
static void print(double s) {System.out.print(s);}
static void print(float s) {System.out.print(s);}
static void print(char s) {System.out.print(s);}
static void findxh() {
	for(int i = 0,k=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(c[i][j]=='x') {
				xh[k]=(i+1)*10+(j+1);k++;
			}
		}
	}
}
static void finddl() {
	for(int p=0,k=0,i =0;xh[i]!=0;i++) {
/////////////////////(((((((11)))/////////////////
if(xh[i]==11) {
if(c[0][1]!='o') {
if(c[0][2]!='o') {
	dl[p][k]=11;dl[p][k+1]=12;dl[p][k+2]=13;p++;
}
}
if(c[1][0]!='o') {
if(c[2][0]!='o') {
	dl[p][k]=11;dl[p][k+1]=21;dl[p][k+2]=31;p++;
}
}
if(c[1][1]!='o') {
if(c[2][2]!='o') {
	dl[p][k]=11;dl[p][k+1]=22;dl[p][k+2]=33;p++;
}
}
}
///////////////////////////(((((((((13))))//////////////
if(xh[i]==13) {
if(c[0][1]!='o') {
if(c[0][0]!='o') {
dl[p][k]=11;dl[p][k+1]=12;dl[p][k+2]=13;p++;
}
}
if(c[1][2]!='o') {
if(c[2][2]!='o') {
dl[p][k]=13;dl[p][k+1]=23;dl[p][k+2]=33;p++;
}
}
if(c[1][1]!='o') {
if(c[2][0]!='o') {
dl[p][k]=13;dl[p][k+1]=22;dl[p][k+2]=31;p++;
}
}
}
/////////////////////((((((((((((31))))////////////////
if(xh[i]==31) {
if(c[2][1]!='o') {
if(c[2][2]!='o') {
dl[p][k]=31;dl[p][k+1]=32;dl[p][k+2]=33;p++;
}
}
if(c[0][0]!='o') {
if(c[1][0]!='o') {
dl[p][k]=11;dl[p][k+1]=21;dl[p][k+2]=31;p++;
}
}
if(c[1][1]!='o') {
if(c[0][2]!='o') {
dl[p][k]=13;dl[p][k+1]=22;dl[p][k+2]=31;p++;
}
}
}
/////////////////////((((((((((((33))))////////////////
if(xh[i]==33) {
if(c[2][0]!='o') {
if(c[2][1]!='o') {
dl[p][k]=31;dl[p][k+1]=32;dl[p][k+2]=33;p++;
}
}
if(c[0][2]!='o') {
if(c[1][2]!='o') {
dl[p][k]=13;dl[p][k+1]=23;dl[p][k+2]=33;p++;
}
}
if(c[1][1]!='o') {
if(c[0][0]!='o') {
dl[p][k]=11;dl[p][k+1]=22;dl[p][k+2]=33;p++;
}
}
}
//++++++++++++++++++++++12+++++++++++++++++++++++
if(xh[i]==12) {
if(c[0][0]!='o') {
if(c[0][2]!='o') {
dl[p][k]=11;dl[p][k+1]=12;dl[p][k+2]=13;p++;
}
}
if(c[1][1]!='o') {
if(c[2][1]!='o') {
dl[p][k]=12;dl[p][k+1]=22;dl[p][k+2]=32;p++;
}
}
}
//++++++++++++++++++++++23+++++++++++++++++++++++
if(xh[i]==23) {
if(c[0][2]!='o') {
if(c[2][2]!='o') {
dl[p][k]=13;dl[p][k+1]=23;dl[p][k+2]=33;p++;
}
}
if(c[1][1]!='o') {
if(c[1][0]!='o') {
dl[p][k]=21;dl[p][k+1]=22;dl[p][k+2]=23;p++;
}
}
}
//++++++++++++++++++++++32+++++++++++++++++++++++
if(xh[i]==32) {
if(c[2][0]!='o') {
if(c[2][2]!='o') {
dl[p][k]=31;dl[p][k+1]=32;dl[p][k+2]=33;p++;
}
}
if(c[0][1]!='o') {
if(c[1][1]!='o') {
dl[p][k]=12;dl[p][k+1]=22;dl[p][k+2]=32;p++;
}
}
}
//++++++++++++++++++++++21+++++++++++++++++++++++
if(xh[i]==21) {
if(c[0][0]!='o') {
if(c[2][0]!='o') {
dl[p][k]=11;dl[p][k+1]=21;dl[p][k+2]=31;p++;
}
}
if(c[1][1]!='o') {
if(c[1][2]!='o') {
dl[p][k]=21;dl[p][k+1]=22;dl[p][k+2]=23;p++;
}
}
}
///////////MIDDLE////////////////////////////////
if(xh[i]==22) {
if(c[0][0]!='o') {
if(c[2][2]!='o') {
dl[p][k]=11;dl[p][k+1]=22;dl[p][k+2]=33;p++;
}
}
if(c[0][2]!='o') {
if(c[2][0]!='o') {
dl[p][k]=13;dl[p][k+1]=22;dl[p][k+2]=31;p++;
}
}
if(c[1][0]!='o') {
if(c[1][2]!='o') {
dl[p][k]=21;dl[p][k+1]=22;dl[p][k+2]=23;p++;
}
}
if(c[0][1]!='o') {
if(c[2][1]!='o') {
dl[p][k]=12;dl[p][k+1]=22;dl[p][k+2]=32;p++;
}
}
}
}
}
static void removeudl() {
	for(int i=0;xh[i]!=0;i++) {
		for(int p =0;dl[p][0]!=0;p++) {
			for(int y =0;y<3;y++)
				if(xh[i]==dl[p][y]) {
					dl[p][y]=88;
				}
			}
		}
}
static void findmaxd() {
	for(int p =0;dl[p][0]!=0;p++) {
		for(int k=0;k<3;k++) {
		if(dl[p][k]==88) {continue;}
		int t =0;	
		for(int i =0;dl[i][0]!=0;i++) {
				for(int j =0;j<3;j++) {
					if(dl[p][k]==dl[i][j]) {
						t++;
					}
				}
			} maxd = (t>maxd) ? t : maxd;
		}
	}
}
static void findmostd() {
	for(int p =0,f=0;dl[p][0]!=0;p++) {
		for(int k=0;k<3;k++) {
		if(dl[p][k]==88) {continue;}
		int t =0;	
		for(int i =0;dl[i][0]!=0;i++) {
				for(int j =0;j<3;j++) {
					if(dl[p][k]==dl[i][j]) {
						t++;
					}
				}
			}if(t==maxd) {mostd[f]=dl[p][k];f++; }
		}
	}
	for(int i=0;mostd[i]!=0;i++) {
		for(int j = i+1;mostd[j]!=0;j++) {
			if(mostd[i]==mostd[j]) {
				mostd[j]=88;
			}
		}
	}
}
static void findattacklist() {
	for(int i =0,k=0;i<3;i++) {
		for(int j =0;j<3;j++) {
			if(c[i][j]=='+') {
				attacklist[k]=(i+1)*10+(j+1);k++;
			}
		}
	}	
}
static void findattackchance() {
	for(int i =0;attacklist[i]!=0;i++) {
		/////////////     ((11))  ////////////////////
		if(attacklist[i]==11) {
			if(c[0][1]!='x') {
				if(c[0][2]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
						}
						if(c[0][1]=='o') {
						attackchance[i]++;
						}
						if(c[0][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][0]!='x') {
				if(c[2][0]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][0]=='o') {
						attackchance[i]++;
					}				
					if(c[2][0]=='o') {
						attackchance[i]++;
					}					
				}
			}
			if(c[1][1]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}
						}
			}
			
		}
		/////////////     ((13))  ////////////////////
		if(attacklist[i]==13) {
			if(c[0][1]!='x') {
				if(c[0][0]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
						}
						if(c[0][1]=='o') {
						attackchance[i]++;
						}
						if(c[0][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][2]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[0][2]=='o') {
						attackchance[i]++;
					}		
					if(c[1][2]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}					
				}
			}
			if(c[1][1]!='x') {
				if(c[2][0]!='x') {
					attackchance[i]++;
					if(c[0][2]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][0]=='o') {
						attackchance[i]++;
					}
						}
			}
			
		}
		/////////////     ((33))  ////////////////////
		if(attacklist[i]==33) {
			if(c[0][2]!='x') {
				if(c[1][2]!='x') {
					attackchance[i]++;
					if(c[0][2]=='o') {
						attackchance[i]++;
						}
						if(c[1][2]=='o') {
						attackchance[i]++;
						}
						if(c[2][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[2][0]!='x') {
				if(c[2][1]!='x') {
					attackchance[i]++;
					if(c[2][0]=='o') {
						attackchance[i]++;
					}		
					if(c[2][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}					
				}
			}
			if(c[1][1]!='x') {
				if(c[0][0]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}
						}
			}
			
		}	
		/////////////     ((31))  ////////////////////
		if(attacklist[i]==31) {
			if(c[0][0]!='x') {
				if(c[1][0]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
						}
						if(c[1][0]=='o') {
						attackchance[i]++;
						}
						if(c[2][0]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[2][1]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[2][0]=='o') {
						attackchance[i]++;
					}		
					if(c[2][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}					
				}
			}
			if(c[1][1]!='x') {
				if(c[0][2]!='x') {
					attackchance[i]++;
					if(c[2][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[0][2]=='o') {
						attackchance[i]++;
					}
						}
			}
			
		}
		////////////////(((12))//////////////
		if(attacklist[i]==12) {
			if(c[0][0]!='x') {
				if(c[0][2]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
						}
						if(c[0][1]=='o') {
						attackchance[i]++;
						}
						if(c[0][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][1]!='x') {
				if(c[2][1]!='x') {
					attackchance[i]++;
					if(c[0][1]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][1]=='o') {
						attackchance[i]++;
					}					
				}
			}
			
		}
		////////////////(((23))//////////////
		if(attacklist[i]==23) {
			if(c[0][2]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[0][2]=='o') {
						attackchance[i]++;
						}
						if(c[1][2]=='o') {
						attackchance[i]++;
						}
						if(c[2][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][1]!='x') {
				if(c[1][0]!='x') {
					attackchance[i]++;
					if(c[1][2]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[1][0]=='o') {
						attackchance[i]++;
					}					
				}
			}
			
		}
		////////////////(((32))//////////////
		if(attacklist[i]==32) {
			if(c[2][0]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[2][0]=='o') {
						attackchance[i]++;
						}
						if(c[2][1]=='o') {
						attackchance[i]++;
						}
						if(c[2][2]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][1]!='x') {
				if(c[0][1]!='x') {
					attackchance[i]++;
					if(c[0][1]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][1]=='o') {
						attackchance[i]++;
					}					
				}
			}
			
		}	
		////////////////((( 21 ))//////////////
		if(attacklist[i]==21) {
			if(c[0][0]!='x') {
				if(c[2][0]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
						}
						if(c[1][0]=='o') {
						attackchance[i]++;
						}
						if(c[2][0]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][1]!='x') {
				if(c[1][2]!='x') {
					attackchance[i]++;
					if(c[1][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[1][2]=='o') {
						attackchance[i]++;
					}					
				}
			}		
		}	
	////////////////////////////  22  //////////////////////////////
		if(attacklist[i]==22) {
			if(c[0][1]!='x') {
				if(c[2][1]!='x') {
					attackchance[i]++;
					if(c[0][1]=='o') {
						attackchance[i]++;
						}
						if(c[1][1]=='o') {
						attackchance[i]++;
						}
						if(c[2][1]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[1][0]!='x') {
				if(c[1][2]!='x') {
					attackchance[i]++;
					if(c[1][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[1][2]=='o') {
						attackchance[i]++;
					}					
				}
			}
			if(c[0][2]!='x') {
				if(c[2][0]!='x') {
					attackchance[i]++;
					if(c[0][2]=='o') {
						attackchance[i]++;
						}
						if(c[1][1]=='o') {
						attackchance[i]++;
						}
						if(c[2][0]=='o') {
			    		attackchance[i]++;
						}	
				}
			}
			if(c[0][0]!='x') {
				if(c[2][2]!='x') {
					attackchance[i]++;
					if(c[0][0]=='o') {
						attackchance[i]++;
					}		
					if(c[1][1]=='o') {
						attackchance[i]++;
					}				
					if(c[2][2]=='o') {
						attackchance[i]++;
					}					
				}
			}
		}
	}
}
static void findmaxa() {
	for(int i=0;i<attackchance.length;i++) {
		maxa = (attackchance[i]>maxa) ? attackchance[i] : maxa;
	}
}
static void findmosta() {
	for(int i =0,k=0;i<attackchance.length;i++) {
		if(attackchance[i]==maxa) {
			mosta[k] = attacklist[i];k++;
		}
	}
}
static void findbest() {
	for(int i=0;mostd[i]!=0;i++) {
		if(best!=0) {break;}
		for(int j =0;mosta[j]!=0;j++) {
			if(mostd[i]==mosta[j]) {
				best = mostd[i];break;
			}
		}
	}	
}
static void restartall() {
	for(int i=0;i<xh.length;i++) {
		xh[i]=0;}

	for(int i=0;i<20;i++) {
		dl[i][0]=0;dl[i][1]=0;dl[i][2]=0;}

	maxd=0;maxa=0;best=0;

	for(int i=0;i<20;i++) {
		mostd[i]=0;mosta[i]=0;
	}

	for(int i=0;i<9;i++) {
	attacklist[i]=0;attackchance[i]=0;	
	}
}
static void play() {
	findxh();
	finddl();
	removeudl();
	findmaxd();
	findmostd();
	findattacklist();
	findattackchance();
	findmaxa();
	findmosta();
	findbest();

}
static void checkWinner() {
	if(c[0][0]=='x'&&c[0][1]=='x'&&c[0][2]=='x') {
		System.out.println("X player win the game");
		return;
	}else if(c[1][0]=='x'&&c[1][1]=='x'&&c[1][2]=='x') {
		System.out.println("X player win the game");
		return;
	}else if(c[2][0]=='x'&&c[2][1]=='x'&&c[2][2]=='x'){
		System.out.println("X player win the game");
		return;
	}
	
	if(c[0][0]=='x'&&c[1][0]=='x'&&c[2][0]=='x') {
		System.out.println("X player win the game");
		return;
	}else if(c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x') {
		System.out.println("X player win the game");
		return;
	}else if(c[0][2]=='x'&&c[1][2]=='x'&&c[2][2]=='x') {
		System.out.println("X player win the game");
		return;
	}
	
	if(c[0][0]=='x'&&c[1][1]=='x'&&c[2][2]=='x') {
		System.out.println("X player win the game");
		return;
	}else if(c[0][2]=='x'&&c[1][1]=='x'&&c[2][0]=='x') {
		System.out.println("X player win the game");
		return;
	}
	
	
	
	
	if(c[0][0]=='o'&&c[0][1]=='o'&&c[0][2]=='o') {
		System.out.println("Computer win the game");
		return;
	}else if(c[1][0]=='o'&&c[1][1]=='o'&&c[1][2]=='o') {
		System.out.println("Computer win the game");
		return;
	}else if(c[2][0]=='o'&&c[2][1]=='o'&&c[2][2]=='o'){
		System.out.println("Computer win the game");
		return;
	}
	
	if(c[0][0]=='o'&&c[1][0]=='o'&&c[2][0]=='o') {
		System.out.println("Computer win the game");
		return;
	}else if(c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o') {
		System.out.println("Computer win the game");
		return;
	}else if(c[0][2]=='o'&&c[1][2]=='o'&&c[2][2]=='o') {
		System.out.println("Computer win the game");
		return;
	}
	
	if(c[0][0]=='o'&&c[1][1]=='o'&&c[2][2]=='o') {
		System.out.println("Computer win the game");
		return;
	}else if(c[0][2]=='o'&&c[1][1]=='o'&&c[2][0]=='o') {
		System.out.println("Computer win the game");
		return;
	}
}
static void showmosta() {
	for(int i=0;mosta[i]!=0;i++) {
		print(mosta[i]);print("  ");
	}
}
static void showattackchance() {
	for(int i=0;i<attackchance.length;i++) {
		print(attackchance[i]);print("  ");
	}
}
static void showattacklist() {
	for(int i=0;attacklist[i]!=0;i++) {
		print(attacklist[i]);print("  ");
	}
}
static void showmostd() {
	for(int i=0;mostd[i]!=0;i++) {
		print(mostd[i]);print("  ");
	}
}
static void showdl() {
	for(int i=0;i<20;i++) {
		if(dl[i][0]==0) {break;}
		for(int j=0;j<3;j++) {
			if(dl[i][j]!='o') {
				print(dl[i][j]);print("  ");
			}
		}print("\n");
	}
}
static void showxh() {
	for(int i=0;xh[i]!=0;i++) {
		print(xh[i] + "  ");
	}
}
static void showc() {	
	for(int i =0;i<3;i++) {
		for(int j =0;j<3;j++) {
			print(c[i][j]);print(" ");
		}
	print("\n");}
}

public static void main(String[] args) {
Scanner s = new Scanner(System.in); int a; int b;
showc();print("\n");
user = s.nextInt(); a = (user/10)-1; b = (user%10)-1; c[a][b]='x';
play();
best = (best==0)?mosta[0]:best; a = (best/10)-1; b = (best%10)-1;
c[a][b]='o';
showc();print("\n");
///////////////////////////////////////////////////////////////////
restartall();
user = s.nextInt(); a = (user/10)-1; b = (user%10)-1; c[a][b]='x';
play();
best = (best==0)?mostd[0]:best; a = (best/10)-1; b = (best%10)-1;
if((c[0][2]=='x' && c[2][0]=='x') || (c[0][0]=='x' && c[2][2]=='x')){
	c[0][1]='o';
}else if(c[2][1]=='x' && c[1][1]=='x'){
c[0][1]='o';
}else if((c[1][1]=='x' && c[1][2]=='x')) {
	c[1][0]='o';
}else {
	c[a][b]='o';
}
showc();print("\n");
///////////////////////////////////////////////////////////////////////22   33   12    32
restartall();
user = s.nextInt(); a = (user/10)-1; b = (user%10)-1; c[a][b]='x';
play();
if(mostd[0]==88 ) {
	mostd[0]=mostd[1];
}
best = (best==0)?mostd[0]:best; a = (best/10)-1; b = (best%10)-1;
c[a][b]='o';
showc();print("\n");
checkWinner();
////////////////////////////////////////////////////////////////////////11  33   13
restartall();
user = s.nextInt(); a = (user/10)-1; b = (user%10)-1; c[a][b]='x';
play();
if(mostd[0]==88 ) {
	if(mostd[1]==88) {
		mostd[0]=mostd[2];
	}else {
		mostd[0]=mostd[1];
	}
}
best = (best==0)?mostd[0]:best; a = (best/10)-1; b = (best%10)-1;
c[a][b]='o';
showc();print("\n");
checkWinner();
}
}
