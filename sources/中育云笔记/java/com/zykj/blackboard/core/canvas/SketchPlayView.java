package com.zykj.blackboard.core.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.zykj.blackboard.core.canvas.SketchPlayView;
import com.zykj.blackboard.core.canvas.view.ActiveView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.canvas.view.FixView;
import com.zykj.blackboard.core.canvas.view.MaskView;
import com.zykj.blackboard.core.play.PlayControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10341d;
import p178ha.InterfaceC9516m;
import p181hd.InterfaceC9540l;
import p390w9.C11719h;

/* loaded from: classes5.dex */
public final class SketchPlayView extends FrameLayout {

    /* renamed from: c */
    public final BackgroundView f17927c;

    /* renamed from: d */
    public final FixView f17928d;

    /* renamed from: e */
    public final ActiveView f17929e;

    /* renamed from: f */
    public final MaskView f17930f;

    /* renamed from: g */
    public PlayControl f17931g;

    /* renamed from: h */
    public Map f17932h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        this.f17932h = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.f17927c = backgroundView;
        FixView fixView = new FixView(context, attributeSet, 0, 4, null);
        this.f17928d = fixView;
        ActiveView activeView = new ActiveView(context, attributeSet, 0, 4, null);
        this.f17929e = activeView;
        MaskView maskView = new MaskView(context, attributeSet, 0, 4, null);
        this.f17930f = maskView;
        addView(backgroundView);
        addView(fixView);
        addView(activeView);
        addView(maskView);
    }

    /* renamed from: c */
    public static final void m13896c(SketchPlayView this$0, InterfaceC9540l callBack) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callBack, "$callBack");
        C10341d c10341d = C10341d.f24644a;
        Context context = this$0.getContext();
        AbstractC9979u.m20293f(context, "context");
        c10341d.m21627g(context);
        PlayControl playControl = new PlayControl(new C11719h(this$0.f17927c, this$0.f17928d, this$0.f17929e, this$0.f17930f));
        callBack.invoke(playControl);
        this$0.f17931g = playControl;
    }

    /* renamed from: b */
    public final void m13897b(final InterfaceC9540l callBack) {
        AbstractC9979u.m20294g(callBack, "callBack");
        this.f17928d.post(new Runnable() { // from class: u9.b
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayView.m13896c(this.f27192c, callBack);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayControl playControl = this.f17931g;
        if (playControl != null) {
            playControl.m14536n();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PlayControl playControl;
        InterfaceC9516m interfaceC9516mMo14531a;
        if (motionEvent == null || (playControl = this.f17931g) == null || (interfaceC9516mMo14531a = playControl.mo14531a()) == null) {
            return true;
        }
        interfaceC9516mMo14531a.mo14540a(motionEvent);
        return true;
    }
}
