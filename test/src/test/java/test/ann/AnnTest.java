package test.ann;

public class AnnTest {

	@B(target=AnnMap.class,tableName="test",type="select")
	public AnnMap findOne(long id){
		return null;
	}
}
