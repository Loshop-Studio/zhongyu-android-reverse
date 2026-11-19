package com.friday.lecture.floatwindow.homework;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.WindowManager;
import com.blankj.utilcode.util.Utils;
import com.friday.lecture.floatwindow.homework.C6148b;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: com.friday.lecture.floatwindow.homework.b */
/* loaded from: classes4.dex */
public final class C6148b {

    /* renamed from: d */
    public static final a f8768d = new a(null);

    /* renamed from: e */
    public static final int f8769e = 8;

    /* renamed from: f */
    public static final InterfaceC10773d f8770f = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: f3.p
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C6148b.m6618c();
        }
    });

    /* renamed from: a */
    public final Context f8771a;

    /* renamed from: b */
    public final InterfaceC10773d f8772b = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: f3.q
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C6148b.m6620j(this.f21447c);
        }
    });

    /* renamed from: c */
    public HomeworkLayout f8773c;

    /* renamed from: com.friday.lecture.floatwindow.homework.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C6148b m6626a() {
            return (C6148b) C6148b.f8770f.getValue();
        }

        public a() {
        }
    }

    public C6148b(Context context) {
        this.f8771a = context;
    }

    /* renamed from: c */
    public static final C6148b m6618c() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C6148b(app);
    }

    /* renamed from: j */
    public static final WindowManager m6620j(C6148b c6148b) {
        Object systemService = c6148b.f8771a.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* renamed from: e */
    public final WindowManager m6621e() {
        return (WindowManager) this.f8772b.getValue();
    }

    /* renamed from: f */
    public final void m6622f(Bitmap bitmap) {
        HomeworkLayout homeworkLayout = this.f8773c;
        if (homeworkLayout != null) {
            homeworkLayout.m6612y(bitmap);
        }
    }

    /* renamed from: g */
    public final void m6623g() {
        try {
            WindowManager windowManagerM6621e = m6621e();
            if (windowManagerM6621e != null) {
                windowManagerM6621e.removeViewImmediate(this.f8773c);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: h */
    public final void m6624h() {
        if (this.f8773c != null) {
            this.f8773c = new HomeworkLayout(this.f8771a);
        }
    }

    /* renamed from: i */
    public final void m6625i() {
        if (this.f8773c == null) {
            this.f8773c = new HomeworkLayout(this.f8771a);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.screenOrientation = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.gravity = 17;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = 1;
        WindowManager windowManagerM6621e = m6621e();
        if (windowManagerM6621e != null) {
            windowManagerM6621e.addView(this.f8773c, layoutParams);
        }
    }
}
