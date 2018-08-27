package line.bot;

import entity.Bundle;

public class MissingException extends Exception{
	public Object getErrorInfo() {
		return new Bundle();
	}
}
