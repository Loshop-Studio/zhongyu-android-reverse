package p123h7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9133u;
import p223q7.AbstractC9843b;

/* renamed from: h7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8722b {
    /* renamed from: a */
    public static void m14228a(Throwable th, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(th, "<this>");
        AbstractC9133u.m16133g(exception, "exception");
        if (th != exception) {
            AbstractC9843b.f19648a.mo18364a(th, exception);
        }
    }

    /* renamed from: b */
    public static String m14229b(Throwable th) {
        AbstractC9133u.m16133g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }
}
