package com.zykj.blackboard.core.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/SketchPlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ld6/s;", "onDetachedFromWindow", "()V", "Lkotlin/Function1;", "Lcom/zykj/blackboard/core/play/IPlayControl;", "callBack", "ready", "(Lr6/c;)V", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "backgroundLayer", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "Lcom/zykj/blackboard/core/canvas/view/FixView;", "fixLayer", "Lcom/zykj/blackboard/core/canvas/view/FixView;", "Lcom/zykj/blackboard/core/canvas/view/ActiveView;", "activeLayer", "Lcom/zykj/blackboard/core/canvas/view/ActiveView;", "Lcom/zykj/blackboard/core/canvas/view/MaskView;", "maskLayer", "Lcom/zykj/blackboard/core/canvas/view/MaskView;", "Lcom/zykj/blackboard/core/play/PlayControl;", "playControl", "Lcom/zykj/blackboard/core/play/PlayControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchPlayView extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final ActiveView activeLayer;

    @NotNull
    private final BackgroundView backgroundLayer;

    @NotNull
    private final FixView fixLayer;

    @NotNull
    private final MaskView maskLayer;

    @Nullable
    private PlayControl playControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.backgroundLayer = backgroundView;
        int i = 4;
        AbstractC5824e abstractC5824e = null;
        int i8 = 0;
        FixView fixView = new FixView(context, attributeSet, i8, i, abstractC5824e);
        this.fixLayer = fixView;
        ActiveView activeView = new ActiveView(context, attributeSet, 0, 4, null);
        this.activeLayer = activeView;
        MaskView maskView = new MaskView(context, attributeSet, i8, i, abstractC5824e);
        this.maskLayer = maskView;
        addView(backgroundView);
        addView(fixView);
        addView(activeView);
        addView(maskView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ready$lambda-2, reason: not valid java name */
    public static final void m13749ready$lambda2(SketchPlayView this$0, InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callBack, "$callBack");
        BoardBox boardBox = BoardBox.INSTANCE;
        Context context = this$0.getContext();
        AbstractC5830k.m5329f(context, "context");
        boardBox.init(context);
        PlayControl playControl = new PlayControl(new RenderLayer(this$0.backgroundLayer, this$0.fixLayer, this$0.activeLayer, this$0.maskLayer));
        callBack.invoke(playControl);
        this$0.playControl = playControl;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
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
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        PlayControl playControl;
        IPlayPageControl currentPlayPageControl;
        if (event == null || (playControl = this.playControl) == null || (currentPlayPageControl = playControl.getCurrentPlayPageControl()) == null) {
            return true;
        }
        currentPlayPageControl.onTouchEvent(event);
        return true;
    }

    public final void ready(@NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(callBack, "callBack");
        this.fixLayer.post(new RunnableC4256c(this, callBack));
    }
}
