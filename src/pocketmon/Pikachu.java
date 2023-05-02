package pocketmon;

public class Pikachu extends Pocketmon {
	String pocketmonName;
	
	public Pikachu(String pocketmoNickName) {
		super(pocketmoNickName);
		
		super.pocketmonName = "피카츄";
		super.pocketmonAttribute = "전기";
		super.pocketmonSellPoint = 5;
	}

	@Override
	public String showPocketmon() {
		
		return  "피카츄 |" + pocketmonNickName + "|" +  pocketmonAttribute + "| 체력 : " + pocketmonHealth + "| 레벨 : " + pocketmonLevel + "| 공격력 : " +  pocketmonAttackPoint; 
	}

	@Override
	public void monsterballIn() {
		System.out.println("피카츄를 들여보냈다!");
	}

	@Override
	public void monsterballOut() {
		System.out.println("피카츄를 꺼냈다!");
	}
	
	
	
}
