package co.edu.javeriana.ast;

import co.edu.javeriana.context.Context;

public class Return implements ASTNode {

	private ASTNode param;
	private Object value;
	
	public Return(ASTNode param) {
		super();
		this.param = param;
		this.value = null;
	}
	
	public Return() {
		super();
		this.param = null;
		this.value = null;
	}

	@Override
	public Object execute(Context context)
	{	
		if(this.param != null)
		{
			this.value = new Object(); 
			value = param.execute(context);
		}
		return this;
	}

	public Object getValue() {
		return value;
	}

	public ASTNode getParam() {
		return param;
	}

	public void setParam(ASTNode param) {
		this.param = param;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	

}
