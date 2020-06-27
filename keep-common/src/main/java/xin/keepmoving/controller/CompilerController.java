package xin.keepmoving.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.tools.*;
import java.io.IOException;
import java.util.Arrays;

/**
 * <p>@author: NirvanaFire(nirvanafire@gmail.com)
 * <p>@description: keep-one
 * <p>@since: v1.1
 **/
@RestController
@RequestMapping("/compiler")
public class CompilerController {

    @RequestMapping("/compileString")
    public String compileString(@RequestParam String javaStr) {

        return "success";
    }

    public static void main(String[] args) throws IOException {

        /*JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try (StandardJavaFileManager fm = compiler.getStandardFileManager(null, null, null)) {
            // fm.getJava
        }*/

        m1();
    }

    public static void m1() throws IOException {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(diagnostics, null, null);
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromStrings(Arrays.asList("Foo.java"));
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnostics, null, null, compilationUnits);
        Boolean success = task.call();
        fileManager.close();
        System.out.println("Success: " + success);
    }
}
