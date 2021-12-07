package org.howard.edu.lsp.assignment7;

	public class Term {
		private int coef ;
		private int exponent;

		Term(int coef , int exponent) {
			this.coef  = coef ;
			this.exponent = exponent;
		}

		public int getcoef () {
			return coef ;
		}

		public void setcoef (int coef ) {
			this.coef  = coef ;
		}

		public int getExponent() {
			return exponent;
		}

		public void setExponent(int exponent) {
			this.exponent = exponent;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			String str;
			String coeff="";
			if (exponent ==0){
				str="";
			}
			else if  (exponent ==1){
				str="x";
			}
			else{
				str="x^"+String.valueOf(exponent);
			}
			if (coef  !=1){
				coeff =String.valueOf(coef );
			}
			if (coef ==0){
				return "";
			}
			return coeff+str;
		}
	}



