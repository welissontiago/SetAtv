package model.entites;

import java.util.Objects;

public class Users {

	private Integer code;

	public Users() {

	}

	public Users(Integer code) {
		this.code = code;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(code, other.code);
	}
	

}
