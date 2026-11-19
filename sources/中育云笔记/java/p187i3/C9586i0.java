package p187i3;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.blankj.utilcode.util.Utils;
import com.friday.common.classtest.MqttResponse;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

/* renamed from: i3.i0 */
/* loaded from: classes4.dex */
public final class C9586i0 {

    /* renamed from: d */
    public static final a f22097d = new a(null);

    /* renamed from: e */
    public static final int f22098e = 8;

    /* renamed from: f */
    public static final InterfaceC10773d f22099f = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23256c, new InterfaceC9529a() { // from class: i3.h0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return C9586i0.m18810b();
        }
    });

    /* renamed from: a */
    public final Context f22100a;

    /* renamed from: b */
    public ViewAnswerSubjectiveLayout f22101b;

    /* renamed from: c */
    public final WindowManager f22102c;

    /* renamed from: i3.i0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C9586i0 m18816a() {
            return (C9586i0) C9586i0.f22099f.getValue();
        }

        public a() {
        }
    }

    public C9586i0(Context context) {
        this.f22100a = context;
        Object systemService = context.getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f22102c = (WindowManager) systemService;
    }

    /* renamed from: b */
    public static final C9586i0 m18810b() {
        Application app = Utils.getApp();
        AbstractC9979u.m20293f(app, "getApp(...)");
        return new C9586i0(app);
    }

    /* renamed from: d */
    public final void m18812d(String str, MqttResponse.Student student) {
        AbstractC9979u.m20294g(str, "str");
        ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout = this.f22101b;
        if (viewAnswerSubjectiveLayout != null) {
            viewAnswerSubjectiveLayout.m6766M(new SubjectiveHomeworkAnswer(str, student, null, 4, null));
        }
    }

    /* renamed from: e */
    public final void m18813e() {
        try {
            this.f22102c.removeViewImmediate(this.f22101b);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m18814f() {
        if (this.f22101b != null) {
            this.f22101b = new ViewAnswerSubjectiveLayout(this.f22100a);
        }
    }

    /* renamed from: g */
    public final void m18815g() {
        if (this.f22101b == null) {
            this.f22101b = new ViewAnswerSubjectiveLayout(this.f22100a);
        }
        this.f22102c.getDefaultDisplay().getMetrics(new DisplayMetrics());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.screenOrientation = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.gravity = 17;
        layoutParams.flags = 1280;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = 1;
        this.f22102c.addView(this.f22101b, layoutParams);
    }
}
