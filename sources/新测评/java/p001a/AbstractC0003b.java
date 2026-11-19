package p001a;

/* renamed from: a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0003b {

    /* renamed from: a */
    public static final String f8a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m11b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f8a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* renamed from: c */
    public static final String m12c() {
        return f8a;
    }
}
