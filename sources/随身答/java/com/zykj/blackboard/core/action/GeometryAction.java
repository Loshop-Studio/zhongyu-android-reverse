package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p263u5.AbstractC9695n;
import p263u5.C9696o;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class GeometryAction extends AbstractC6943b {

    /* renamed from: p */
    public float f8241p;

    /* renamed from: q */
    public float f8242q;

    /* renamed from: r */
    public final Paint f8243r;

    /* renamed from: com.zykj.blackboard.core.action.GeometryAction$a */
    public /* synthetic */ class C6937a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8244a;

        static {
            int[] iArr = new int[GeometryActionEnum.values().length];
            iArr[GeometryActionEnum.OVAL.ordinal()] = 1;
            iArr[GeometryActionEnum.RECTANGLE.ordinal()] = 2;
            iArr[GeometryActionEnum.TRIANGLE.ordinal()] = 3;
            f8244a = iArr;
        }
    }

    public GeometryAction() {
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f8243r = paint;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointF pointFM7145v = m7145v(event.getX(), event.getY());
        this.f8241p = pointFM7145v.x;
        this.f8242q = pointFM7145v.y;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointF pointFM7145v = m7145v(event.getX(), event.getY());
        C9763b c9763bM7082f = m7082f();
        float fM16509r = c9763bM7082f != null ? c9763bM7082f.m16509r() : 70.0f;
        if (pointFM7145v.x - this.f8241p < fM16509r || pointFM7145v.y - this.f8242q < fM16509r) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo201d();
                return;
            }
            return;
        }
        Path path = new Path();
        C9763b c9763bM7082f2 = m7082f();
        GeometryActionEnum geometryActionEnumM16507q = c9763bM7082f2 != null ? c9763bM7082f2.m16507q() : null;
        int i9 = geometryActionEnumM16507q == null ? -1 : C6937a.f8244a[geometryActionEnumM16507q.ordinal()];
        if (i9 == 1) {
            path.addOval(new RectF(this.f8241p, this.f8242q, pointFM7145v.x, pointFM7145v.y), Path.Direction.CW);
        } else if (i9 == 2) {
            path.moveTo(this.f8241p, this.f8242q);
            path.lineTo(this.f8241p, pointFM7145v.y);
            path.lineTo(pointFM7145v.x, pointFM7145v.y);
            path.lineTo(pointFM7145v.x, this.f8242q);
            path.close();
        } else if (i9 == 3) {
            path.moveTo((this.f8241p + pointFM7145v.x) / 2, this.f8242q);
            path.lineTo(this.f8241p, pointFM7145v.y);
            path.lineTo(pointFM7145v.x, pointFM7145v.y);
            path.close();
        }
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo175B(path, this.f8243r, null);
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        Matrix matrixM17344b;
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo201d();
        }
        PointF pointFM7145v = m7145v(event.getX(), event.getY());
        C9763b c9763bM7082f = m7082f();
        float fM16509r = c9763bM7082f != null ? c9763bM7082f.m16509r() : 70.0f;
        if (pointFM7145v.x - this.f8241p < fM16509r || pointFM7145v.y - this.f8242q < fM16509r) {
            InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
            if (interfaceC0039cM7083g2 != null) {
                interfaceC0039cM7083g2.mo201d();
                return;
            }
            return;
        }
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i == null || (matrixM17344b = c9998aM7085i.m17344b()) == null || (matrix = AbstractC9695n.m16200b(matrixM17344b)) == null) {
            matrix = new Matrix();
        }
        float fMapRadius = matrix.mapRadius(Math.abs(pointFM7145v.x - this.f8241p));
        float fMapRadius2 = matrix.mapRadius(Math.abs(pointFM7145v.y - this.f8242q));
        C9763b c9763bM7082f2 = m7082f();
        int i9 = (c9763bM7082f2 != null ? c9763bM7082f2.m16507q() : null) == GeometryActionEnum.OVAL ? 0 : 1;
        C9763b c9763bM7082f3 = m7082f();
        GeometryActionEnum geometryActionEnumM16507q = c9763bM7082f3 != null ? c9763bM7082f3.m16507q() : null;
        int i10 = geometryActionEnumM16507q == null ? -1 : C6937a.f8244a[geometryActionEnumM16507q.ordinal()];
        List listEmptyList = i10 != 1 ? i10 != 2 ? i10 != 3 ? CollectionsKt.emptyList() : CollectionsKt.listOf((Object[]) new PointF[]{new PointF(fMapRadius / 2, 0.0f), new PointF(0.0f, fMapRadius2), new PointF(fMapRadius, fMapRadius2)}) : CollectionsKt.listOf((Object[]) new PointF[]{new PointF(0.0f, 0.0f), new PointF(fMapRadius, 0.0f), new PointF(fMapRadius, fMapRadius2), new PointF(0.0f, fMapRadius2)}) : CollectionsKt.emptyList();
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h != null) {
            interfaceC9822bM7084h.mo16699r(fMapRadius, fMapRadius2, RangesKt.coerceAtMost(this.f8241p, pointFM7145v.x), RangesKt.coerceAtMost(this.f8242q, pointFM7145v.y), i9, listEmptyList, this.f8243r, new Function1<InterfaceC8055c, Unit>() { // from class: com.zykj.blackboard.core.action.GeometryAction$singleTouchUp$1
                {
                    super(1);
                }

                /* renamed from: a */
                public final void m7146a(InterfaceC8055c it) {
                    Function1 function1Mo16691j;
                    Intrinsics.checkNotNullParameter(it, "it");
                    InterfaceC0039c interfaceC0039cM7083g3 = this.f8245a.m7083g();
                    if (interfaceC0039cM7083g3 != null) {
                        InterfaceC0039c interfaceC0039cM7083g4 = this.f8245a.m7083g();
                        interfaceC0039cM7083g3.mo222y(interfaceC0039cM7083g4 != null ? interfaceC0039cM7083g4.mo199b() : null, it);
                    }
                    InterfaceC9822b interfaceC9822bM7084h2 = this.f8245a.m7084h();
                    if (interfaceC9822bM7084h2 != null && (function1Mo16691j = interfaceC9822bM7084h2.mo16691j()) != null) {
                        function1Mo16691j.invoke(it.getId());
                    }
                    InterfaceC9822b interfaceC9822bM7084h3 = this.f8245a.m7084h();
                    if (interfaceC9822bM7084h3 != null) {
                        interfaceC9822bM7084h3.mo16693l();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8055c interfaceC8055c) {
                    m7146a(interfaceC8055c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* renamed from: I */
    public void m7144I() {
        this.f8241p = 0.0f;
        this.f8242q = 0.0f;
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f != null) {
            this.f8243r.setColor(c9763bM7082f.m16511s());
            this.f8243r.setStrokeWidth(c9763bM7082f.m16513t());
        }
    }

    /* renamed from: v */
    public final PointF m7145v(float f10, float f11) {
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }
}
