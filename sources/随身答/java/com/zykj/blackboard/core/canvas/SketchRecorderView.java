package com.zykj.blackboard.core.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.edit.BoardControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p023b5.C5112b;
import p023b5.C5115e;
import p023b5.C5119i;
import p023b5.C5120j;
import p084d5.InterfaceC7751k;
import p263u5.C9682a;
import p263u5.C9685d;
import p263u5.C9689h;
import p263u5.C9690i;
import p272v4.C9763b;

@Metadata(m13412d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m13413d2 = {"Lcom/zykj/blackboard/core/canvas/SketchRecorderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "dirPath", "Lkotlin/Function3;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "", "", "success", "Lkotlin/Function1;", "", "error", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "()V", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "a", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "backgroundLayer", "Lb5/e;", "Lb5/e;", "fixLayer", "Lb5/b;", "c", "Lb5/b;", "activeLayer", "Lb5/i;", "d", "Lb5/i;", "maskLayer", "Lb5/j;", "e", "Lb5/j;", "renderLayer", "Lcom/zykj/blackboard/core/edit/BoardControl;", "f", "Lcom/zykj/blackboard/core/edit/BoardControl;", "boardControl", "blackboard_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class SketchRecorderView extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final BackgroundView backgroundLayer;

    /* renamed from: b, reason: from kotlin metadata */
    public final C5115e fixLayer;

    /* renamed from: c, reason: from kotlin metadata */
    public final C5112b activeLayer;

    /* renamed from: d, reason: from kotlin metadata */
    public final C5119i maskLayer;

    /* renamed from: e, reason: from kotlin metadata */
    public final C5120j renderLayer;

    /* renamed from: f, reason: from kotlin metadata */
    public BoardControl boardControl;

    /* renamed from: g */
    public Map f8392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8392g = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.backgroundLayer = backgroundView;
        C5115e c5115e = new C5115e(context, attributeSet, 0, 4, null);
        this.fixLayer = c5115e;
        C5112b c5112b = new C5112b(context, attributeSet, 0, 4, null);
        this.activeLayer = c5112b;
        C5119i c5119i = new C5119i(context, attributeSet, 0, 4, null);
        this.maskLayer = c5119i;
        this.renderLayer = new C5120j(backgroundView, c5115e, c5112b, c5119i);
        C9685d.f17121a.m16166g(context);
        C9682a.f17117a.m16158a(context);
        addView(backgroundView);
        addView(c5115e);
        addView(c5112b);
        addView(c5119i);
    }

    /* renamed from: c */
    public static final void m7283c(SketchRecorderView this$0, String dirPath, Function3 success, Function1 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dirPath, "$dirPath");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        LogUtils.m2956i("[SketchRecorderView]:ready -> dirPath:" + dirPath + ", w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        C9763b config = boardControl.getConfig();
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        config.m16512s0(new C9689h(context));
        boardControl.m7806q(dirPath, new SketchRecorderView$ready$1$1$1(this$0, success, boardControl), new SketchRecorderView$ready$1$1$2(this$0, error));
        this$0.boardControl = boardControl;
    }

    /* renamed from: b */
    public final void m7284b(final String dirPath, final Function3 success, final Function1 error) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.fixLayer.post(new Runnable() { // from class: z4.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m7283c(this.f18022a, dirPath, success, error);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BoardControl boardControl = this.boardControl;
        if (boardControl != null) {
            boardControl.m7807s();
        }
        C9690i.f17127a.m16178a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BoardControl boardControl;
        InterfaceC7751k interfaceC7751kMo7794a;
        if (motionEvent == null || (boardControl = this.boardControl) == null || (interfaceC7751kMo7794a = boardControl.mo7794a()) == null) {
            return true;
        }
        interfaceC7751kMo7794a.mo7819a(motionEvent);
        return true;
    }
}
