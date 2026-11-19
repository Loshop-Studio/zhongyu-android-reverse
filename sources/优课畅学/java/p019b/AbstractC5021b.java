package p019b;

/* renamed from: b.b */
/* loaded from: classes.dex */
public abstract class AbstractC5021b {

    /* renamed from: a */
    public static final String f2103a = "_COROUTINE";

    /* renamed from: b */
    public static final StackTraceElement m2061b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f2103a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
