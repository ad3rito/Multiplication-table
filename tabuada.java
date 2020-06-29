Scanner sc = new Scanner(System.in);
int num ;
String pergunta = "Escolha um numero para visualizar a tabuada : ";
int admitirNumero(String p) {
int x = 0;
System.out.print(p);
x = sc.nextInt();
return x;
}
void tabuadaDos(int x){
int ct;
for(ct=0; ct<=10; ct++)
System.out.printf("\n\t%d x %d = %d ",x,ct,x*ct);
}
void main() {
num = admitirNumero(pergunta);
tabuadaDos(num);
System.out.println();
}
main()