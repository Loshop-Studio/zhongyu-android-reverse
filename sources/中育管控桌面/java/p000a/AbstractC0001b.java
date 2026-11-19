package p000a;

/* renamed from: a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0001b {

    /* renamed from: a */
    public static final String f0a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m3b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f0a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    /* renamed from: c */
    public static final String m4c() {
        return f0a;
    }
}
