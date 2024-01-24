package com.exp1.Exp1Springboot.domain;

public class Exp {

		private String id;
		private String name;
		private String address;
		private String salary;
		
		
		
		public Exp() {
			super();
		}



		public Exp(String id, String name, String address, String salary) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public String getSalary() {
			return salary;
		}



		public void setSalary(String salary) {
			this.salary = salary;
		}



		@Override
		public String toString() {
			return "Exp [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}


		


		
		
		
		
}
