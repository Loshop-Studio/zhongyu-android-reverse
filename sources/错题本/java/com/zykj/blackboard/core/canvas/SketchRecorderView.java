package com.zykj.blackboard.core.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.view.ActiveView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.canvas.view.FixView;
import com.zykj.blackboard.core.canvas.view.MaskView;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.edit.BoardControl;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.utils.AppContext;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.blackboard.utils.DefaultTextEditView;
import com.zykj.blackboard.utils.EventBus;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0013d;
import p006a5.RunnableC0017h;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0017\u001a\u00020\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0017\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/SketchRecorderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "dirPath", "Lkotlin/Function3;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "", "Ld6/s;", "success", "Lkotlin/Function1;", "", "error", "ready", "(Ljava/lang/String;Lr6/f;Lr6/c;)V", "callBack", "(Lr6/c;Lr6/c;)V", "onDetachedFromWindow", "()V", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "backgroundLayer", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "Lcom/zykj/blackboard/core/canvas/view/FixView;", "fixLayer", "Lcom/zykj/blackboard/core/canvas/view/FixView;", "Lcom/zykj/blackboard/core/canvas/view/ActiveView;", "activeLayer", "Lcom/zykj/blackboard/core/canvas/view/ActiveView;", "Lcom/zykj/blackboard/core/canvas/view/MaskView;", "maskLayer", "Lcom/zykj/blackboard/core/canvas/view/MaskView;", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "Lcom/zykj/blackboard/core/edit/BoardControl;", "boardControl", "Lcom/zykj/blackboard/core/edit/BoardControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchRecorderView extends FrameLayout {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final ActiveView activeLayer;

    @NotNull
    private final BackgroundView backgroundLayer;

    @Nullable
    private BoardControl boardControl;

    @NotNull
    private final FixView fixLayer;

    @NotNull
    private final MaskView maskLayer;

    @NotNull
    private final RenderLayer renderLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
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
        ActiveView activeView = new ActiveView(context, attributeSet, i8, i, abstractC5824e);
        this.activeLayer = activeView;
        MaskView maskView = new MaskView(context, attributeSet, i8, i, abstractC5824e);
        this.maskLayer = maskView;
        this.renderLayer = new RenderLayer(backgroundView, fixView, activeView, maskView);
        BoardBox.INSTANCE.init(context);
        AppContext.INSTANCE.init(context);
        addView(backgroundView);
        addView(fixView);
        addView(activeView);
        addView(maskView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ready$lambda-2, reason: not valid java name */
    public static final void m13750ready$lambda2(SketchRecorderView this$0, String dirPath, InterfaceC6474f success, InterfaceC6471c error) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(dirPath, "$dirPath");
        AbstractC5830k.m5330g(success, "$success");
        AbstractC5830k.m5330g(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        StringBuilder sbM100y = AbstractC0037f.m100y("[SketchRecorderView]:ready -> dirPath:", dirPath, ", w:");
        sbM100y.append(this$0.getWidth());
        sbM100y.append(", h:");
        sbM100y.append(this$0.getHeight());
        AbstractC3387g.m2342e(sbM100y.toString());
        BoardConfig boardConfig = boardControl.getBoardConfig();
        Context context = this$0.getContext();
        AbstractC5830k.m5329f(context, "context");
        boardConfig.setTextEditView(new DefaultTextEditView(context));
        boardControl.loadDir(dirPath, new SketchRecorderView$ready$1$1$1(this$0, success, boardControl), new SketchRecorderView$ready$1$1$2(this$0, error));
        this$0.boardControl = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ready$lambda-4, reason: not valid java name */
    public static final void m13751ready$lambda4(SketchRecorderView this$0, InterfaceC6471c callBack, InterfaceC6471c error) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callBack, "$callBack");
        AbstractC5830k.m5330g(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        AbstractC3387g.m2342e("[SketchRecorderView]:ready -> w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        BoardConfig boardConfig = boardControl.getBoardConfig();
        Context context = this$0.getContext();
        AbstractC5830k.m5329f(context, "context");
        boardConfig.setTextEditView(new DefaultTextEditView(context));
        File externalCacheDir = this$0.getContext().getExternalCacheDir();
        String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
        if (absolutePath == null) {
            absolutePath = "";
        }
        String absolutePath2 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath2, "File(\n                  …           ).absolutePath");
        boardControl.loadDir(absolutePath2, new SketchRecorderView$ready$2$1$1(this$0, callBack, boardControl), new SketchRecorderView$ready$2$1$2(this$0, error));
        this$0.boardControl = boardControl;
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
        BoardControl boardControl = this.boardControl;
        if (boardControl != null) {
            boardControl.release();
        }
        EventBus.INSTANCE.clear();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        BoardControl boardControl;
        IPageControl currentPage;
        if (motionEvent == null || (boardControl = this.boardControl) == null || (currentPage = boardControl.getCurrentPage()) == null) {
            return true;
        }
        currentPage.onTouchEvent(motionEvent);
        return true;
    }

    public final void ready(@NotNull String dirPath, @NotNull InterfaceC6474f success, @NotNull InterfaceC6471c error) {
        AbstractC5830k.m5330g(dirPath, "dirPath");
        AbstractC5830k.m5330g(success, "success");
        AbstractC5830k.m5330g(error, "error");
        this.fixLayer.post(new RunnableC0013d(this, dirPath, success, error, 4));
    }

    public final void ready(@NotNull InterfaceC6471c callBack, @NotNull InterfaceC6471c error) {
        AbstractC5830k.m5330g(callBack, "callBack");
        AbstractC5830k.m5330g(error, "error");
        this.fixLayer.post(new RunnableC0017h(this, callBack, 7, error));
    }
}
