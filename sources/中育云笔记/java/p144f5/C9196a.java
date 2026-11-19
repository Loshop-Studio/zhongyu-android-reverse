package p144f5;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f5.a */
/* loaded from: classes5.dex */
public class C9196a {

    /* renamed from: b */
    public static final C9196a f21449b = new C9196a();

    /* renamed from: c */
    public static final Object f21450c = new Object();

    /* renamed from: a */
    public List f21451a = new ArrayList(1);

    /* renamed from: a */
    public void m18076a(Activity activity) {
        synchronized (f21450c) {
            try {
                for (Activity activity2 : this.f21451a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f21451a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m18077b(Activity activity) {
        synchronized (f21450c) {
            this.f21451a.remove(activity);
        }
    }
}
