package p292x4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p117g5.InterfaceC8055c;
import p302y4.C9950c;
import p302y4.C9952e;

/* renamed from: x4.e */
/* loaded from: classes4.dex */
public final class C9881e {

    /* renamed from: a */
    public final DrawControl f17661a;

    public C9881e(DrawControl drawControl) {
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f17661a = drawControl;
    }

    /* renamed from: a */
    public final void m16916a(float f10, float f11, float f12, float f13) {
        this.f17661a.m7297D(f10, f11, f12, f13);
    }

    /* renamed from: b */
    public final void m16917b(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f17661a.m7296C(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: c */
    public final void m16918c(InterfaceC8055c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f17661a.m7298E(rootGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: d */
    public final void m16919d(InterfaceC8055c rootGraph, InterfaceC8055c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f17661a.m7299F(rootGraph, textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: e */
    public final void m16920e(InterfaceC8055c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f17661a.m7300G(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }
}
