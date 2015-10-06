package compiler.IR;

public class MJChar extends MJExpression{
	
	private String value;

	public MJChar(String string) {
		this.value = string;
	}

	public String getValue() {
		return this.value;
	}
}
