package p131j4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.play.PlayControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7342c;
import p155l4.C8497b;
import p155l4.C8500e;
import p155l4.C8504i;
import p155l4.C8505j;
import p275w4.InterfaceC9748m;

/* renamed from: j4.c */
/* loaded from: classes4.dex */
public final class C7794c extends FrameLayout {

    /* renamed from: a */
    public final BackgroundView f13446a;

    /* renamed from: b */
    public final C8500e f13447b;

    /* renamed from: c */
    public final C8497b f13448c;

    /* renamed from: d */
    public final C8504i f13449d;

    /* renamed from: e */
    public PlayControl f13450e;

    /* renamed from: f */
    public Map f13451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7794c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13451f = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.f13446a = backgroundView;
        C8500e c8500e = new C8500e(context, attributeSet, 0, 4, null);
        this.f13447b = c8500e;
        C8497b c8497b = new C8497b(context, attributeSet, 0, 4, null);
        this.f13448c = c8497b;
        C8504i c8504i = new C8504i(context, attributeSet, 0, 4, null);
        this.f13449d = c8504i;
        addView(backgroundView);
        addView(c8500e);
        addView(c8497b);
        addView(c8504i);
    }

    /* renamed from: c */
    public static final void m13201c(C7794c this$0, Function1 callBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        C7342c c7342c = C7342c.f11908a;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c7342c.m11745c(context);
        PlayControl playControl = new PlayControl(new C8505j(this$0.f13446a, this$0.f13447b, this$0.f13448c, this$0.f13449d));
        callBack.invoke(playControl);
        this$0.f13450e = playControl;
    }

    /* renamed from: b */
    public final void m13202b(final Function1 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f13447b.post(new Runnable() { // from class: j4.b
            @Override // java.lang.Runnable
            public final void run() {
                C7794c.m13201c(this.f13444a, callBack);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayControl playControl = this.f13450e;
        if (playControl != null) {
            playControl.m6800n();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PlayControl playControl;
        InterfaceC9748m interfaceC9748mMo6795a;
        if (motionEvent == null || (playControl = this.f13450e) == null || (interfaceC9748mMo6795a = playControl.mo6795a()) == null) {
            return true;
        }
        interfaceC9748mMo6795a.mo6804a(motionEvent);
        return true;
    }
}
