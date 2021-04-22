package multichat;

public class SameNickname extends Exception{
	public SameNickname() {
		super("닉네임 중복");
	}
}
