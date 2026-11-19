package p109h4;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p120i4.C7663c;
import p120i4.C7665e;
import p210q4.InterfaceC8888c;

/* renamed from: h4.e */
/* loaded from: classes4.dex */
public final class C7627e {

    /* renamed from: a */
    public final DrawControl f12812a;

    public C7627e(DrawControl drawControl) {
        Intrinsics.checkNotNullParameter(drawControl, "drawControl");
        this.f12812a = drawControl;
    }

    /* renamed from: a */
    public final void m12589a(float f10, float f11, float f12, float f13) {
        this.f12812a.m6201D(f10, f11, f12, f13);
    }

    /* renamed from: b */
    public final void m12590b(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f12812a.m6200C(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: c */
    public final void m12591c(InterfaceC8888c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f12812a.m6202E(rootGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: d */
    public final void m12592d(InterfaceC8888c rootGraph, InterfaceC8888c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f12812a.m6203F(rootGraph, textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: e */
    public final void m12593e(InterfaceC8888c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        this.f12812a.m6204G(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }
}
