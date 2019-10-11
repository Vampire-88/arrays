package cn.sxt.array;

import java.util.List;

class A {
		private String name;
		private List<A> children;

        		public void setName(String name) {
        			this.name = name;
       		}

     		public String getName() {
       			return name;
        		}

       		public void setChildren(List<A> children) {
       			this.children.add((A) children);
       			for(A a:children){
       			    
                }
      		}

        		public List<A> getChildren() {
        		return children;
        		}
}