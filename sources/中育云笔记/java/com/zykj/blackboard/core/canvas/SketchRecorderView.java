package com.zykj.blackboard.core.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.canvas.view.ActiveView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.canvas.view.FixView;
import com.zykj.blackboard.core.canvas.view.MaskView;
import com.zykj.blackboard.core.edit.BoardControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10338a;
import na.C10341d;
import na.C10345h;
import na.C10346i;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p307q9.C10762b;
import p390w9.C11719h;
import p422y9.InterfaceC11935n;

/* loaded from: classes5.dex */
public final class SketchRecorderView extends FrameLayout {

    /* renamed from: c */
    public final BackgroundView f17933c;

    /* renamed from: d */
    public final FixView f17934d;

    /* renamed from: e */
    public final ActiveView f17935e;

    /* renamed from: f */
    public final MaskView f17936f;

    /* renamed from: g */
    public final C11719h f17937g;

    /* renamed from: h */
    public BoardControl f17938h;

    /* renamed from: i */
    public Map f17939i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
        this.f17939i = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.f17933c = backgroundView;
        FixView fixView = new FixView(context, attributeSet, 0, 4, null);
        this.f17934d = fixView;
        ActiveView activeView = new ActiveView(context, attributeSet, 0, 4, null);
        this.f17935e = activeView;
        MaskView maskView = new MaskView(context, attributeSet, 0, 4, null);
        this.f17936f = maskView;
        this.f17937g = new C11719h(backgroundView, fixView, activeView, maskView);
        C10341d.f24644a.m21627g(context);
        C10338a.f24640a.m21619b(context);
        addView(backgroundView);
        addView(fixView);
        addView(activeView);
        addView(maskView);
    }

    /* renamed from: c */
    public static final void m13899c(SketchRecorderView this$0, String dirPath, InterfaceC9545q success, InterfaceC9540l error) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(dirPath, "$dirPath");
        AbstractC9979u.m20294g(success, "$success");
        AbstractC9979u.m20294g(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.f17937g);
        LogUtils.m3888i("[SketchRecorderView]:ready -> dirPath:" + dirPath + ", w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        C10762b config = boardControl.getConfig();
        Context context = this$0.getContext();
        AbstractC9979u.m20293f(context, "context");
        config.m22905l0(new C10345h(context));
        boardControl.m14442t(dirPath, new SketchRecorderView$ready$1$1$1(this$0, success, boardControl), new SketchRecorderView$ready$1$1$2(this$0, error));
        this$0.f17938h = boardControl;
    }

    /* renamed from: b */
    public final void m13900b(final String dirPath, final InterfaceC9545q success, final InterfaceC9540l error) {
        AbstractC9979u.m20294g(dirPath, "dirPath");
        AbstractC9979u.m20294g(success, "success");
        AbstractC9979u.m20294g(error, "error");
        this.f17934d.post(new Runnable() { // from class: u9.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m13899c(this.f27194c, dirPath, success, error);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BoardControl boardControl = this.f17938h;
        if (boardControl != null) {
            boardControl.m14444x();
        }
        C10346i.f24652a.m21639a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BoardControl boardControl;
        InterfaceC11935n interfaceC11935nMo14431b;
        if (motionEvent == null || (boardControl = this.f17938h) == null || (interfaceC11935nMo14431b = boardControl.mo14431b()) == null) {
            return true;
        }
        interfaceC11935nMo14431b.mo14456a(motionEvent);
        return true;
    }
}
