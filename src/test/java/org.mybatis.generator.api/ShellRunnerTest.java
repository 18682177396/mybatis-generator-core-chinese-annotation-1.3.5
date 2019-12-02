package org.mybatis.generator.api;


import org.junit.Test;

public class ShellRunnerTest {

    @Test
    public void testMain(){
        ShellRunner runner = new ShellRunner();
        //取得根目录路径
        String rootPath = runner.getClass().getResource("/").getFile().toString();
        //当前目录路径
        String[] arg = new String[]{"-configfile", rootPath + "generatorConfig.xml", "-overwrite"};
        //String[] arg = new String[]{"-configfile", rootPath + "test/generatorConfigForMySql.xml", "-overwrite"};
        ShellRunner.main(arg);
    }
}
