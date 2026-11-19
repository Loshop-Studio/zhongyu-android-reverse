package p215k2;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.work.WorkRequest;
import com.blankj.utilcode.util.ThreadUtils;
import com.friday.common.R$dimen;
import com.friday.common.R$id;
import com.friday.common.R$layout;

/* renamed from: k2.k */
/* loaded from: classes3.dex */
public class C9793k {

    /* renamed from: e */
    public static volatile C9793k f22983e;

    /* renamed from: a */
    public View f22984a;

    /* renamed from: b */
    public TextView f22985b;

    /* renamed from: c */
    public WindowManager.LayoutParams f22986c;

    /* renamed from: d */
    public WindowManager f22987d;

    public C9793k(Context context) {
        View viewInflate = View.inflate(context.getApplicationContext(), R$layout.app_toast, null);
        this.f22984a = viewInflate;
        this.f22985b = (TextView) viewInflate.findViewById(R$id.tv_toast);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f22986c = layoutParams;
        layoutParams.gravity = 17;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = -3;
        layoutParams.width = (int) context.getResources().getDimension(R$dimen.view_120);
        this.f22986c.height = (int) context.getResources().getDimension(R$dimen.view_30);
        this.f22986c.flags = 152;
        this.f22987d = (WindowManager) this.f22984a.getContext().getSystemService("window");
    }

    /* renamed from: a */
    public static /* synthetic */ void m19769a(final C9793k c9793k) throws InterruptedException {
        c9793k.getClass();
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.g
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19774f(this.f22979c);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m19770b(C9793k c9793k) {
        c9793k.getClass();
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m19771c(C9793k c9793k) {
        c9793k.getClass();
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m19772d(final C9793k c9793k) throws InterruptedException {
        c9793k.getClass();
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.i
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19770b(this.f22981c);
            }
        });
    }

    /* renamed from: e */
    public static /* synthetic */ void m19773e(final C9793k c9793k, String str) {
        c9793k.f22985b.setText(str);
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
        c9793k.f22987d.addView(c9793k.f22984a, c9793k.f22986c);
        new Thread(new Runnable() { // from class: k2.d
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9793k.m19772d(this.f22975c);
            }
        }).start();
    }

    /* renamed from: f */
    public static /* synthetic */ void m19774f(C9793k c9793k) {
        c9793k.getClass();
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m19775g(final C9793k c9793k) throws InterruptedException {
        c9793k.getClass();
        try {
            Thread.sleep(WorkRequest.MIN_BACKOFF_MILLIS);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.j
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19771c(this.f22982c);
            }
        });
    }

    /* renamed from: h */
    public static /* synthetic */ void m19776h(final C9793k c9793k, String str) {
        c9793k.f22985b.setText(str);
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
        c9793k.f22987d.addView(c9793k.f22984a, c9793k.f22986c);
        new Thread(new Runnable() { // from class: k2.h
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9793k.m19775g(this.f22980c);
            }
        }).start();
    }

    /* renamed from: i */
    public static /* synthetic */ void m19777i(C9793k c9793k) {
        c9793k.getClass();
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m19778j(final C9793k c9793k, String str) {
        c9793k.f22985b.setText(str);
        try {
            c9793k.f22987d.removeViewImmediate(c9793k.f22984a);
        } catch (Exception unused) {
        }
        c9793k.f22987d.addView(c9793k.f22984a, c9793k.f22986c);
        new Thread(new Runnable() { // from class: k2.c
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                C9793k.m19769a(this.f22974c);
            }
        }).start();
    }

    /* renamed from: k */
    public static C9793k m19779k(Context context) {
        if (f22983e == null) {
            synchronized (C9793k.class) {
                try {
                    if (f22983e == null) {
                        f22983e = new C9793k(context);
                    }
                } finally {
                }
            }
        }
        return f22983e;
    }

    /* renamed from: l */
    public void m19780l() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.f
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19777i(this.f22978c);
            }
        });
    }

    /* renamed from: m */
    public void m19781m(final String str) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.b
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19773e(this.f22972c, str);
            }
        });
    }

    /* renamed from: n */
    public void m19782n(final String str) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.a
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19778j(this.f22970c, str);
            }
        });
    }

    /* renamed from: o */
    public void m19783o(final String str) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: k2.e
            @Override // java.lang.Runnable
            public final void run() {
                C9793k.m19776h(this.f22976c, str);
            }
        });
    }
}
