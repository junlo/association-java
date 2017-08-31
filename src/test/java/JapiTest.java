import com.dounine.japi.JapiClient;
import com.dounine.japi.JapiClientStorage;
import com.dounine.japi.JapiClientTransfer;
import com.dounine.japi.core.IProject;
import com.dounine.japi.core.impl.ProjectImpl;

import java.io.IOException;

public class JapiTest {
	public static void main(String[] args) throws IOException {
		JapiClient.setClassLoader(JapiTest.class);
		JapiClient.setPrefixPath("/home/lgq/github/");//路径前缀
		JapiClient.setpostfixPath("/src/main/java");
		JapiClient.setProjectJavaPath("association-java");//主项目位置
		JapiClient.setActionReletivePath("com/bjike/authcode");//主项目action位置

		JapiClient.setFlushServer(true);
		JapiClient.setIncludePackages(new String[]{"com.bjike"});//可以准确快速搜索
		IProject project = ProjectImpl.init();
		JapiClientStorage japiClientStorage = JapiClientStorage.getInstance();
		japiClientStorage.setProject(project);
		japiClientStorage.autoSaveToDisk();
		new JapiClientTransfer().autoTransfer(japiClientStorage);
	}

}
