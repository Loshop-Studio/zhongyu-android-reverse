package p187i3;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;
import com.blankj.utilcode.util.Utils;
import com.friday.common.classtest.MqttResponse;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: i3.q */
/* loaded from: classes4.dex */
public final class C9594q {

    /* renamed from: d */
    public static final a f22108d = new a(null);

    /* renamed from: e */
    public static final int f22109e = 8;

    /* renamed from: f */
    public static final InterfaceC10773d f22110f = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: i3.p
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C9594q.m18818b();
        }
    });

    /* renamed from: a */
    public final Context f22111a;

    /* renamed from: b */
    public ViewAnswerObjectiveLayout f22112b;

    /* renamed from: c */
    public final WindowManager f22113c;

    /* renamed from: i3.q$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C9594q m18824a() {
            return (C9594q) C9594q.f22110f.getValue();
        }

        public a() {
        }
    }

    public C9594q(Context context) {
        this.f22111a = context;
        Object systemService = context.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f22113c = (WindowManager) systemService;
    }

    /* renamed from: b */
    public static final C9594q m18818b() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C9594q(app);
    }

    /* renamed from: d */
    public final void m18820d(int i10, int i11, MqttResponse.Student student, List list) {
        AbstractC9979u.m20294g(list, "list");
        ViewAnswerObjectiveLayout viewAnswerObjectiveLayout = this.f22112b;
        if (viewAnswerObjectiveLayout != null) {
            viewAnswerObjectiveLayout.m6716s(i10, i11, student, list);
        }
    }

    /* renamed from: e */
    public final void m18821e() {
        try {
            this.f22113c.removeViewImmediate(this.f22112b);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m18822f() {
        if (this.f22112b != null) {
            this.f22112b = new ViewAnswerObjectiveLayout(this.f22111a);
        }
    }

    /* renamed from: g */
    public final void m18823g() {
        if (this.f22112b == null) {
            this.f22112b = new ViewAnswerObjectiveLayout(this.f22111a);
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
        layoutParams.format = 1;
        this.f22113c.addView(this.f22112b, layoutParams);
    }
}
