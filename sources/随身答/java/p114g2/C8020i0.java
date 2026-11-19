package p114g2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p176m2.AbstractC8959h;

/* renamed from: g2.i0 */
/* loaded from: classes4.dex */
public class C8020i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    public static C8020i0 f13565g = new C8020i0();

    /* renamed from: a */
    public final int f13566a = 3000;

    /* renamed from: b */
    public boolean f13567b = false;

    /* renamed from: c */
    public boolean f13568c = true;

    /* renamed from: d */
    public Handler f13569d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public ArrayList f13570e = new ArrayList();

    /* renamed from: f */
    public a f13571f = new a();

    /* renamed from: g2.i0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C8020i0.this.f13567b || !C8020i0.this.f13568c) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> still foreground.");
                return;
            }
            C8020i0.this.f13567b = false;
            AbstractC8959h.m14293c("MobclickRT", "--->>> went background.");
            for (int i9 = 0; i9 < C8020i0.this.f13570e.size(); i9++) {
                ((InterfaceC8022j0) C8020i0.this.f13570e.get(i9)).mo6012n();
            }
        }
    }

    /* renamed from: a */
    public static C8020i0 m12601a() {
        return f13565g;
    }

    /* renamed from: b */
    public static void m12602b(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f13565g);
        }
    }

    /* renamed from: c */
    public synchronized void m12607c(InterfaceC8022j0 interfaceC8022j0) {
        if (interfaceC8022j0 != null) {
            this.f13570e.add(interfaceC8022j0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f13568c = true;
        a aVar = this.f13571f;
        if (aVar != null) {
            this.f13569d.removeCallbacks(aVar);
            this.f13569d.postDelayed(this.f13571f, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f13568c = false;
        this.f13567b = true;
        a aVar = this.f13571f;
        if (aVar != null) {
            this.f13569d.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
