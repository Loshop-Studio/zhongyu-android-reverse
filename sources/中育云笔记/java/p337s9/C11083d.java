package p337s9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import com.zykj.blackboard.core.canvas.control.DrawControl;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p348t9.C11257d;

/* renamed from: s9.d */
/* loaded from: classes5.dex */
public final class C11083d {

    /* renamed from: a */
    public final DrawControl f26767a;

    public C11083d(DrawControl drawControl) {
        AbstractC9979u.m20294g(drawControl, "drawControl");
        this.f26767a = drawControl;
    }

    /* renamed from: a */
    public final void m24657a(float f10, float f11, float f12, float f13) {
        this.f26767a.m13912C(f10, f11, f12, f13);
    }

    /* renamed from: b */
    public final void m24658b(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        this.f26767a.m13911B(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    /* renamed from: c */
    public final void m24659c(InterfaceC5181c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        this.f26767a.m13913D(rootGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    /* renamed from: d */
    public final void m24660d(InterfaceC5181c rootGraph, InterfaceC5181c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(textGraph, "textGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        this.f26767a.m13914E(rootGraph, textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    /* renamed from: e */
    public final void m24661e(InterfaceC5181c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(textGraph, "textGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        this.f26767a.m13915F(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }
}
