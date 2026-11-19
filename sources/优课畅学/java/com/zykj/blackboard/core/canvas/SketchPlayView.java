package com.zykj.blackboard.core.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zykj.blackboard.core.canvas.view.ActiveView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.canvas.view.FixView;
import com.zykj.blackboard.core.canvas.view.MaskView;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.play.IPlayPageControl;
import com.zykj.blackboard.core.play.PlayControl;
import com.zykj.blackboard.utils.BoardBox;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class SketchPlayView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private final ActiveView activeLayer;
    private final BackgroundView backgroundLayer;
    private final FixView fixLayer;
    private final MaskView maskLayer;
    private PlayControl playControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.backgroundLayer = backgroundView;
        FixView fixView = new FixView(context, attributeSet, 0, 4, null);
        this.fixLayer = fixView;
        ActiveView activeView = new ActiveView(context, attributeSet, 0, 4, null);
        this.activeLayer = activeView;
        MaskView maskView = new MaskView(context, attributeSet, 0, 4, null);
        this.maskLayer = maskView;
        addView(backgroundView);
        addView(fixView);
        addView(activeView);
        addView(maskView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ready$lambda-2, reason: not valid java name */
    public static final void m27420ready$lambda2(SketchPlayView this$0, InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callBack, "$callBack");
        BoardBox boardBox = BoardBox.INSTANCE;
        Context context = this$0.getContext();
        AbstractC9133u.m16132f(context, "context");
        boardBox.init(context);
        PlayControl playControl = new PlayControl(new RenderLayer(this$0.backgroundLayer, this$0.fixLayer, this$0.activeLayer, this$0.maskLayer));
        callBack.invoke(playControl);
        this$0.playControl = playControl;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PlayControl playControl = this.playControl;
        if (playControl != null) {
            playControl.release();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PlayControl playControl;
        IPlayPageControl currentPlayPageControl;
        if (motionEvent == null || (playControl = this.playControl) == null || (currentPlayPageControl = playControl.getCurrentPlayPageControl()) == null) {
            return true;
        }
        currentPlayPageControl.onTouchEvent(motionEvent);
        return true;
    }

    public final void ready(final InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(callBack, "callBack");
        this.fixLayer.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.a
            @Override // java.lang.Runnable
            public final void run() {
                SketchPlayView.m27420ready$lambda2(this.f8687a, callBack);
            }
        });
    }
}
