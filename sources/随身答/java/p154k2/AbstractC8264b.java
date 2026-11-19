package p154k2;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.framework.AbstractC6782a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p310z2.InterfaceC9994e;

/* renamed from: k2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC8264b {

    /* renamed from: a */
    public static String f14367a = "delayed_transmission_flag_new";

    /* renamed from: e */
    public static ScheduledExecutorService f14371e;

    /* renamed from: f */
    public static Context f14372f;

    /* renamed from: b */
    public static CopyOnWriteArrayList f14368b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static int f14369c = 0;

    /* renamed from: d */
    public static boolean f14370d = false;

    /* renamed from: g */
    public static int f14373g = 0;

    /* renamed from: h */
    public static Runnable f14374h = new a();

    /* renamed from: k2.b$a */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (AbstractC8264b.f14369c == 0 || AbstractC8264b.f14373g >= 10) {
                    if (!AbstractC8264b.f14370d) {
                        boolean unused = AbstractC8264b.f14370d = true;
                        AbstractC8264b.m13323f(AbstractC8264b.f14372f);
                    }
                    if (AbstractC8264b.f14371e != null) {
                        AbstractC8264b.f14371e.shutdown();
                        ScheduledExecutorService unused2 = AbstractC8264b.f14371e = null;
                    }
                }
                AbstractC8264b.m13329l();
            } catch (Exception unused3) {
            }
        }
    }

    /* renamed from: f */
    public static synchronized void m13323f(Context context) {
        try {
            AbstractC6782a.m6279m(true);
            CopyOnWriteArrayList copyOnWriteArrayList = f14368b;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = f14368b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9994e) it.next()).mo14756a();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static void m13324g(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f14367a, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean(f14367a, true);
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public static boolean m13327j(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f14367a, 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getBoolean(f14367a, false);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ int m13329l() {
        int i9 = f14373g;
        f14373g = i9 + 1;
        return i9;
    }

    /* renamed from: m */
    public static void m13330m(Context context) {
        if (context == null) {
            return;
        }
        f14372f = context;
        try {
            if (f14369c < 1) {
                AbstractC6782a.m6279m(true);
                return;
            }
            if (m13327j(context)) {
                AbstractC6782a.m6279m(true);
                return;
            }
            AbstractC6782a.m6279m(false);
            m13324g(context);
            if (f14371e == null) {
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                f14371e = scheduledExecutorServiceNewScheduledThreadPool;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(f14374h, 0L, 100L, TimeUnit.MILLISECONDS);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: n */
    public static synchronized void m13331n() {
        try {
            f14369c++;
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static synchronized void m13332o(InterfaceC9994e interfaceC9994e) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            CopyOnWriteArrayList copyOnWriteArrayList2 = f14368b;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.add(interfaceC9994e);
            }
            if (AbstractC6782a.m6273g() && (copyOnWriteArrayList = f14368b) != null && copyOnWriteArrayList.size() > 0) {
                Iterator it = f14368b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9994e) it.next()).mo14756a();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: p */
    public static synchronized void m13333p() {
        try {
            f14369c--;
        } catch (Exception unused) {
        }
    }

    /* renamed from: q */
    public static synchronized void m13334q(InterfaceC9994e interfaceC9994e) {
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = f14368b;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(interfaceC9994e);
            }
        } catch (Exception unused) {
        }
    }
}
