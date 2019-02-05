package enumeration;

public enum Langage {

	JAVA ("Le langage Java","Eclipse"),
	CPlus ("Le langage C++","Visual studio"),
	C ("Le langage C","Code block"),
	PHP ("Le langage PHP","PS Pad");
	
	private String name = "";
	private String editor = "";
	
	private Langage(String name, String editor) {
		this.name = name;
		this.editor = editor;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String getEditor() {
		return editor;
	}
}
