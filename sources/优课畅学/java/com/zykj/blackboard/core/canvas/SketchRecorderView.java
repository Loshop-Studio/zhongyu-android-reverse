package com.zykj.blackboard.core.canvas;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.AbstractC5380q;
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
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes4.dex */
public final class SketchRecorderView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private final ActiveView activeLayer;
    private final BackgroundView backgroundLayer;
    private BoardControl boardControl;
    private final FixView fixLayer;
    private final MaskView maskLayer;
    private final RenderLayer renderLayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
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
    public static final void m27421ready$lambda2(SketchRecorderView this$0, String dirPath, InterfaceC10575q success, InterfaceC10570l error) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(dirPath, "$dirPath");
        AbstractC9133u.m16133g(success, "$success");
        AbstractC9133u.m16133g(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        AbstractC5380q.m2623s("[SketchRecorderView]:ready -> dirPath:" + dirPath + ", w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        BoardConfig config = boardControl.getConfig();
        Context context = this$0.getContext();
        AbstractC9133u.m16132f(context, "context");
        config.setTextEditView(new DefaultTextEditView(context));
        boardControl.loadDir(dirPath, new SketchRecorderView$ready$1$1$1(this$0, success, boardControl), new SketchRecorderView$ready$1$1$2(this$0, error));
        this$0.boardControl = boardControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ready$lambda-4, reason: not valid java name */
    public static final void m27422ready$lambda4(SketchRecorderView this$0, InterfaceC10570l callBack, InterfaceC10570l error) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callBack, "$callBack");
        AbstractC9133u.m16133g(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        AbstractC5380q.m2623s("[SketchRecorderView]:ready -> w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        BoardConfig config = boardControl.getConfig();
        Context context = this$0.getContext();
        AbstractC9133u.m16132f(context, "context");
        config.setTextEditView(new DefaultTextEditView(context));
        File externalCacheDir = this$0.getContext().getExternalCacheDir();
        String absolutePath = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
        if (absolutePath == null) {
            absolutePath = "";
        } else {
            AbstractC9133u.m16132f(absolutePath, "context.externalCacheDir?.absolutePath ?: \"\"");
        }
        String absolutePath2 = new File(absolutePath, UUID.randomUUID().toString()).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath2, "File(\n                  …           ).absolutePath");
        boardControl.loadDir(absolutePath2, new SketchRecorderView$ready$2$1$1(this$0, callBack, boardControl), new SketchRecorderView$ready$2$1$2(this$0, error));
        this$0.boardControl = boardControl;
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
        BoardControl boardControl = this.boardControl;
        if (boardControl != null) {
            boardControl.release();
        }
        EventBus.INSTANCE.clear();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BoardControl boardControl;
        IPageControl currentPage;
        if (motionEvent == null || (boardControl = this.boardControl) == null || (currentPage = boardControl.getCurrentPage()) == null) {
            return true;
        }
        currentPage.onTouchEvent(motionEvent);
        return true;
    }

    public final void ready(final String dirPath, final InterfaceC10575q success, final InterfaceC10570l error) {
        AbstractC9133u.m16133g(dirPath, "dirPath");
        AbstractC9133u.m16133g(success, "success");
        AbstractC9133u.m16133g(error, "error");
        this.fixLayer.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.b
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m27421ready$lambda2(this.f8689a, dirPath, success, error);
            }
        });
    }

    public final void ready(final InterfaceC10570l callBack, final InterfaceC10570l error) {
        AbstractC9133u.m16133g(callBack, "callBack");
        AbstractC9133u.m16133g(error, "error");
        this.fixLayer.post(new Runnable() { // from class: com.zykj.blackboard.core.canvas.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m27422ready$lambda4(this.f8693a, callBack, error);
            }
        });
    }
}
