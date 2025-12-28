package Java_Slenium_concepts;

public class excelreaderfile {

excel reader = new excel Reader();
list<map<string, string>> list = reader.getdata(excelpath, sheetname)
	
  name =list.get(rownumber).get("username");

}
