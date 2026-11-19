package p171h3;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.blankj.utilcode.util.Utils;
import com.friday.lecture.floatwindow.studentdemo.StudentDemoListLayout;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: h3.k */
/* loaded from: classes4.dex */
public final class C9467k {

    /* renamed from: d */
    public static final a f21876d = new a(null);

    /* renamed from: e */
    public static final int f21877e = 8;

    /* renamed from: f */
    public static final InterfaceC10773d f21878f = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: h3.j
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C9467k.m18644b();
        }
    });

    /* renamed from: a */
    public final Context f21879a;

    /* renamed from: b */
    public StudentDemoListLayout f21880b;

    /* renamed from: c */
    public final WindowManager f21881c;

    /* renamed from: h3.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C9467k m18649a() {
            return (C9467k) C9467k.f21878f.getValue();
        }

        public a() {
        }
    }

    public C9467k(Context context) {
        this.f21879a = context;
        Object systemService = context.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f21881c = (WindowManager) systemService;
    }

    /* renamed from: b */
    public static final C9467k m18644b() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C9467k(app);
    }

    /* renamed from: d */
    public final void m18646d() {
        try {
            this.f21881c.removeViewImmediate(this.f21880b);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void m18647e() {
        if (this.f21880b != null) {
            this.f21880b = new StudentDemoListLayout(this.f21879a);
        }
    }

    /* renamed from: f */
    public final void m18648f() {
        if (this.f21880b == null) {
            this.f21880b = new StudentDemoListLayout(this.f21879a);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.screenOrientation = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.flags = 1280;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
        layoutParams.format = 1;
        this.f21881c.addView(this.f21880b, layoutParams);
    }
}
