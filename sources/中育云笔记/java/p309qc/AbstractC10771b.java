package p309qc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9979u;
import p439zc.AbstractC12038b;

/* renamed from: qc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10771b {
    /* renamed from: a */
    public static void m22973a(Throwable th, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(th, "<this>");
        AbstractC9979u.m20294g(exception, "exception");
        if (th != exception) {
            AbstractC12038b.f28412a.mo278a(th, exception);
        }
    }

    /* renamed from: b */
    public static String m22974b(Throwable th) {
        AbstractC9979u.m20294g(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }
}
