
public class PRO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos los String
		String mensaje="Paquito es el tio mas guapo que conozco";
		String mensajeCodificado="";
		String temporal="";
		//Convertimos el mensaje a mayúsculas
		mensajeCodificado=mensaje.toUpperCase();
		
		for(int i=0;i<mensaje.length();i=i+2){
		//si i+1 es igual que la longitud de mensaje codificado, guardamos en temporal la letra que está en esa posición
			if(i+1==mensajeCodificado.length()){

					temporal=temporal+mensajeCodificado.charAt(i);

			}else{
		//si no lo es, guardamos en temporal la letra siguiente a la posición en la que se está y la letra en esa posición
		temporal=temporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);

			}

		}
		//guardamos en temporal lo que hay en mensaje codificado y imprimimos mensaje codificado
		mensajeCodificado=temporal;
		System.out.println(mensajeCodificado);
		//DECODIFICADOR
		//creamos un string para guardar el mensaje cuando lo vayamos decodificando
		String temporal2="";
		
		for (int j=0;j<mensajeCodificado.length();j=j+2){
			//si j+1 es igual que la longitud del mensaje codificado guardamos en temporal2 la letra que hay en esa posición
			if (j+1==mensajeCodificado.length()){
				temporal2=temporal2+mensajeCodificado.charAt(j);
			}else{
				//sino guardamos en temporal2 la letra siguiente a esa posición más la letra en esa posición
				temporal2=temporal2+mensajeCodificado.charAt(j+1)+mensajeCodificado.charAt(j);
			}
		}
		//guardamos en mensaje codificado lo que hay en temporal2 y imprimimos el mensaje codificado(que ahora será el decodificado)
		mensajeCodificado=temporal2;
		mensajeCodificado=mensajeCodificado.toLowerCase();
		System.out.println(mensajeCodificado);

	}
}
		

	
	

		



		

