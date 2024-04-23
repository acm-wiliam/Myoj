package com.yws;

import com.yws.utils.CustomStringJavaCompiler;
import org.junit.jupiter.api.Test;

public class TestJavaCompiler {

    @Test
    void judge(){
        String code = "public class HelloWorld {\n" +
                "    public static void main(String []args) {\n" +
                "\t\tfor(int i=0; i < 1; i++){\n" +
                "\t\t\t       System.out.println(\"Hello World!\");\n" +
                "\t\t}\n" +
                "    }\n" +
                "}";
        CustomStringJavaCompiler compiler = new CustomStringJavaCompiler(code);
        boolean res = compiler.compiler();
        if (res) {
            System.out.println("编译成功");
            System.out.println("compilerTakeTime：" + compiler.getCompilerTakeTime());
            try {
                compiler.runMainMethod();
                System.out.println("runTakeTime：" + compiler.getRunTakeTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(compiler.getRunResult());
            System.out.println("诊断信息：" + compiler.getCompilerMessage());
        } else {
            System.out.println("编译失败");
            System.out.println(compiler.getCompilerMessage());
        }
        System.out.println("\t");
        System.out.println("asdf"+"\t"+"asdfasf");
        System.out.println("a"+"\t"+"asdfasf");
        System.out.println("asdsafsadfs"+"\t"+"asdfasf");
    }
}
