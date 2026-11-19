package p312z4;

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
import p023b5.C5112b;
import p023b5.C5115e;
import p023b5.C5119i;
import p023b5.C5120j;
import p179m5.InterfaceC8977m;
import p263u5.C9685d;

/* renamed from: z4.c */
/* loaded from: classes4.dex */
public final class C10000c extends FrameLayout {

    /* renamed from: a */
    public final BackgroundView f18016a;

    /* renamed from: b */
    public final C5115e f18017b;

    /* renamed from: c */
    public final C5112b f18018c;

    /* renamed from: d */
    public final C5119i f18019d;

    /* renamed from: e */
    public PlayControl f18020e;

    /* renamed from: f */
    public Map f18021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10000c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18021f = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.f18016a = backgroundView;
        C5115e c5115e = new C5115e(context, attributeSet, 0, 4, null);
        this.f18017b = c5115e;
        C5112b c5112b = new C5112b(context, attributeSet, 0, 4, null);
        this.f18018c = c5112b;
        C5119i c5119i = new C5119i(context, attributeSet, 0, 4, null);
        this.f18019d = c5119i;
        addView(backgroundView);
        addView(c5115e);
        addView(c5112b);
        addView(c5119i);
    }

    /* renamed from: c */
    public static final void m17357c(C10000c this$0, Function1 callBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        C9685d c9685d = C9685d.f17121a;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        c9685d.m16166g(context);
        PlayControl playControl = new PlayControl(new C5120j(this$0.f18016a, this$0.f18017b, this$0.f18018c, this$0.f18019d));
        callBack.invoke(playControl);
        this$0.f18020e = playControl;
    }

    /* renamed from: b */
    public final void m17358b(final Function1 callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.f18017b.post(new Runnable() { // from class: z4.b
            @Override // java.lang.Runnable
            public final void run() {
                C10000c.m17357c(this.f18014a, callBack);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayControl playControl = this.f18020e;
        if (playControl != null) {
            playControl.m7912n();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PlayControl playControl;
        InterfaceC8977m interfaceC8977mMo7907a;
        if (motionEvent == null || (playControl = this.f18020e) == null || (interfaceC8977mMo7907a = playControl.mo7907a()) == null) {
            return true;
        }
        interfaceC8977mMo7907a.mo7916a(motionEvent);
        return true;
    }
}
