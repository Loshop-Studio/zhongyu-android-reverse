package p000a.p031h.p032b;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: a.h.b.d */
/* loaded from: classes.dex */
public class RunnableC0189d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f1420b;

    /* renamed from: c */
    public final /* synthetic */ Object f1421c;

    public RunnableC0189d(Object obj, Object obj2) {
        this.f1420b = obj;
        this.f1421c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Boolean bool = Boolean.FALSE;
        try {
            Method method = C0188c.f1406d;
            if (method != null) {
                method.invoke(this.f1420b, this.f1421c, bool, "AppCompat recreation");
            } else {
                C0188c.f1407e.invoke(this.f1420b, this.f1421c, bool);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
