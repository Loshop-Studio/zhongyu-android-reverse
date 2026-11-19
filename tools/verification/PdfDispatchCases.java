package local.zy.pdfprogress;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONArray;
import org.json.JSONObject;

/** Drive the actual and reconstructed invokeSuspend methods with the same DAO and flow continuations. */
final class PdfDispatchCases {
    private final ClassLoader loader;
    private final boolean cloud;
    private final String pkg;
    private final Class<?> model, entity, action, continuation;
    private final Object unit, suspended, page, failure;
    private final String writeMethod, readMethod;

    PdfDispatchCases(ClassLoader loader, boolean cloud) throws Exception {
        this.loader = loader;
        this.cloud = cloud;
        pkg = cloud ? "com.friday.document.viewmodel." : "com.zykj.study.viewmodels.";
        model = type(pkg + (cloud ? "PdfViewerViewModel" : "PDFViewModel"));
        action = type(pkg + "a");
        entity = type(cloud ? "com.friday.common.entity.PdfEntity" : "com.zykj.study.data.PdfEntity");
        continuation = type(cloud ? "vc.c" : "m7.c");
        unit = type(cloud ? "qc.q" : "h7.p").getField("a").get(null);
        suspended = type(cloud ? "wc.a" : "n7.a").getMethod("f").invoke(null);
        page = entity.getConstructor(String.class, int.class, int.class).newInstance("/local.pdf", 7, 12);
        failure = type("kotlin.b")
                      .getMethod("a", Throwable.class)
                      .invoke(null, new IllegalArgumentException("fixture"));
        writeMethod = cloud ? "a" : "insertPdf";
        readMethod = cloud ? "b" : "queryPdf";
    }
    private Class<?> type(String name) throws Exception {
        return loader.loadClass(name);
    }
    private static void check(boolean ok, String context) {
        if (!ok)
            throw new AssertionError(context);
    }
    private JSONObject trace(Class<?> dispatch, String scenario) throws Exception {
        JSONArray calls = new JSONArray(), yields = new JSONArray();
        Class<?> daoType = model.getConstructors()[0].getParameterTypes()[0];
        Object dao = Proxy.newProxyInstance(loader, new Class<?>[] {daoType}, (p, m, a) -> {
            if (m.getName().equals(readMethod)) {
                check(a[0].equals("/local.pdf"), "read key");
                calls.put("lookup");
                return scenario.contains("lookup-wait") ? suspended
                    : scenario.contains("missing")      ? null
                                                        : page;
            }
            if (m.getName().equals(writeMethod)) {
                check(page.equals(a[0]), "write entity");
                calls.put("insert");
                return scenario.contains("save-wait") ? suspended : unit;
            }
            throw new UnsupportedOperationException(m.getName());
        });
        Object vm = model.getConstructors()[0].newInstance(dao);
        Field stream = model.getDeclaredField("b");
        stream.setAccessible(true);
        Object sink = Proxy.newProxyInstance(loader, new Class<?>[] {stream.getType()}, (p, m, a) -> {
            check(m.getName().equals("emit"), "flow operation " + m.getName());
            Object actual = a[0].getClass().getMethod("a").invoke(a[0]);
            check(scenario.contains("missing") ? actual == null : page.equals(actual), "emitted entity");
            calls.put(actual == null ? "emit-missing" : "emit-page");
            return scenario.contains("emit-wait") ? suspended : unit;
        });
        stream.set(vm, sink);
        boolean save = scenario.startsWith("save");
        Object event = scenario.equals("unknown-action") ? null
                                                         : type(pkg + (save ? "a$b" : "a$a"))
                                                               .getConstructor(save ? entity : String.class)
                                                               .newInstance(save ? page : "/local.pdf");
        Constructor<?> ctor = dispatch.getDeclaredConstructor(action, model, continuation);
        ctor.setAccessible(true);
        Object task = ctor.newInstance(event, vm, null);
        Method step = dispatch.getDeclaredMethod("invokeSuspend", Object.class);
        step.setAccessible(true);
        Field label = dispatch.getDeclaredField(cloud ? "d" : "b");
        label.setAccessible(true);
        if (scenario.equals("invalid-label"))
            label.setInt(task, 9);
        Object input = unit;
        String outcome = null;
        for (int i = 0; i < 4; i++) {
            Object returned;
            try {
                returned = step.invoke(task, input);
            } catch (InvocationTargetException e) {
                outcome = e.getCause().getClass().getName();
                break;
            }
            if (returned == unit) {
                outcome = "unit";
                break;
            }
            check(returned == suspended, "unexpected return");
            int state = label.getInt(task);
            yields.put(state);
            input = scenario.endsWith("fail") ? failure
                : state == 1                  ? (scenario.contains("missing") ? null : page)
                                              : unit;
        }
        String wanted = scenario.equals("invalid-label") ? "java.lang.IllegalStateException"
            : scenario.equals("unknown-action")          ? "kotlin.NoWhenBranchMatchedException"
            : scenario.endsWith("fail")                  ? "java.lang.IllegalArgumentException"
                                                         : "unit";
        check(wanted.equals(outcome), scenario + " ended with " + outcome);
        return new JSONObject().put("calls", calls).put("suspension_labels", yields).put("outcome", outcome);
    }
    JSONObject verify() throws Exception {
        Class<?> original = type(model.getName() + "$dispatch$1");
        Class<?> recovered = type("local.zy.compare." + (cloud ? "RecoveredCloud" : "RecoveredStudy"));
        String[] scenarios = {"lookup", "missing", "lookup-wait", "missing-lookup-wait", "emit-wait",
            "lookup-wait-emit-wait", "lookup-wait-fail", "emit-wait-fail", "save", "save-wait",
            "save-wait-fail", "invalid-label", "unknown-action"};
        JSONObject rows = new JSONObject();
        for (String scenario : scenarios) {
            JSONObject a = trace(original, scenario), b = trace(recovered, scenario);
            check(a.toString().equals(b.toString()), scenario + " " + a + " / " + b);
            rows.put(scenario, a);
        }
        return rows;
    }
}
