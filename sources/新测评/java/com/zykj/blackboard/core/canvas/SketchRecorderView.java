package com.zykj.blackboard.core.canvas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.blackboard.core.canvas.view.BackgroundView;
import com.zykj.blackboard.core.edit.BoardControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7340a;
import p077e5.C7342c;
import p077e5.C7346g;
import p077e5.C7347h;
import p155l4.C8497b;
import p155l4.C8500e;
import p155l4.C8504i;
import p155l4.C8505j;
import p177n4.InterfaceC8629i;

@Metadata(m13557d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m13558d2 = {"Lcom/zykj/blackboard/core/canvas/SketchRecorderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "dirPath", "Lkotlin/Function3;", "Lcom/zykj/blackboard/core/edit/IBoardControl;", "", "", "success", "Lkotlin/Function1;", "", "error", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "onDetachedFromWindow", "()V", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "a", "Lcom/zykj/blackboard/core/canvas/view/BackgroundView;", "backgroundLayer", "Ll4/e;", "Ll4/e;", "fixLayer", "Ll4/b;", "c", "Ll4/b;", "activeLayer", "Ll4/i;", "d", "Ll4/i;", "maskLayer", "Ll4/j;", "e", "Ll4/j;", "renderLayer", "Lcom/zykj/blackboard/core/edit/BoardControl;", "f", "Lcom/zykj/blackboard/core/edit/BoardControl;", "boardControl", "blackboard_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class SketchRecorderView extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final BackgroundView backgroundLayer;

    /* renamed from: b, reason: from kotlin metadata */
    public final C8500e fixLayer;

    /* renamed from: c, reason: from kotlin metadata */
    public final C8497b activeLayer;

    /* renamed from: d, reason: from kotlin metadata */
    public final C8504i maskLayer;

    /* renamed from: e, reason: from kotlin metadata */
    public final C8505j renderLayer;

    /* renamed from: f, reason: from kotlin metadata */
    public BoardControl boardControl;

    /* renamed from: g */
    public Map f7109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7109g = new LinkedHashMap();
        BackgroundView backgroundView = new BackgroundView(context, attributeSet, 0, 4, null);
        this.backgroundLayer = backgroundView;
        C8500e c8500e = new C8500e(context, attributeSet, 0, 4, null);
        this.fixLayer = c8500e;
        C8497b c8497b = new C8497b(context, attributeSet, 0, 4, null);
        this.activeLayer = c8497b;
        C8504i c8504i = new C8504i(context, attributeSet, 0, 4, null);
        this.maskLayer = c8504i;
        this.renderLayer = new C8505j(backgroundView, c8500e, c8497b, c8504i);
        C7342c.f11908a.m11745c(context);
        C7340a.f11905a.m11741a(context);
        addView(backgroundView);
        addView(c8500e);
        addView(c8497b);
        addView(c8504i);
    }

    /* renamed from: c */
    public static final void m6187c(SketchRecorderView this$0, String dirPath, Function3 success, Function1 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dirPath, "$dirPath");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(error, "$error");
        BoardControl boardControl = new BoardControl(this$0.getWidth(), this$0.getHeight(), this$0.renderLayer);
        LogUtils.m3239i("[SketchRecorderView]:ready -> dirPath:" + dirPath + ", w:" + this$0.getWidth() + ", h:" + this$0.getHeight());
        BoardConfig config = boardControl.getConfig();
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        config.setTextEditView(new C7346g(context));
        boardControl.m6697n(dirPath, new SketchRecorderView$ready$1$1$1(this$0, success, boardControl), new SketchRecorderView$ready$1$1$2(this$0, error));
        this$0.boardControl = boardControl;
    }

    /* renamed from: b */
    public final void m6188b(final String dirPath, final Function3 success, final Function1 error) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.fixLayer.post(new Runnable() { // from class: j4.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m6187c(this.f13452a, dirPath, success, error);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BoardControl boardControl = this.boardControl;
        if (boardControl != null) {
            boardControl.m6698p();
        }
        C7347h.f11914a.m11757a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        BoardControl boardControl;
        InterfaceC8629i interfaceC8629iMo6686a;
        if (motionEvent == null || (boardControl = this.boardControl) == null || (interfaceC8629iMo6686a = boardControl.mo6686a()) == null) {
            return true;
        }
        interfaceC8629iMo6686a.mo6709a(motionEvent);
        return true;
    }
}
