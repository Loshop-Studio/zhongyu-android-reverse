package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p077e5.AbstractC7352m;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;

/* loaded from: classes4.dex */
public final class GeometryAction extends AbstractC6626b {

    /* renamed from: p */
    public float f6958p;

    /* renamed from: q */
    public float f6959q;

    /* renamed from: r */
    public final Paint f6960r;

    /* renamed from: com.zykj.blackboard.core.action.GeometryAction$a */
    public /* synthetic */ class C6620a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6961a;

        static {
            int[] iArr = new int[GeometryActionEnum.values().length];
            iArr[GeometryActionEnum.OVAL.ordinal()] = 1;
            iArr[GeometryActionEnum.RECTANGLE.ordinal()] = 2;
            iArr[GeometryActionEnum.TRIANGLE.ordinal()] = 3;
            f6961a = iArr;
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
        this.f6960r = paint;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointF pointFM6049v = m6049v(event.getX(), event.getY());
        this.f6958p = pointFM6049v.x;
        this.f6959q = pointFM6049v.y;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        PointF pointFM6049v = m6049v(event.getX(), event.getY());
        BoardConfig boardConfigM5987f = m5987f();
        float geometryMinSize = boardConfigM5987f != null ? boardConfigM5987f.getGeometryMinSize() : 70.0f;
        if (pointFM6049v.x - this.f6958p < geometryMinSize || pointFM6049v.y - this.f6959q < geometryMinSize) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13439d();
                return;
            }
            return;
        }
        Path path = new Path();
        BoardConfig boardConfigM5987f2 = m5987f();
        GeometryActionEnum geometryActionEnum = boardConfigM5987f2 != null ? boardConfigM5987f2.getGeometryActionEnum() : null;
        int i10 = geometryActionEnum == null ? -1 : C6620a.f6961a[geometryActionEnum.ordinal()];
        if (i10 == 1) {
            path.addOval(new RectF(this.f6958p, this.f6959q, pointFM6049v.x, pointFM6049v.y), Path.Direction.CW);
        } else if (i10 == 2) {
            path.moveTo(this.f6958p, this.f6959q);
            path.lineTo(this.f6958p, pointFM6049v.y);
            path.lineTo(pointFM6049v.x, pointFM6049v.y);
            path.lineTo(pointFM6049v.x, this.f6959q);
            path.close();
        } else if (i10 == 3) {
            path.moveTo((this.f6958p + pointFM6049v.x) / 2, this.f6959q);
            path.lineTo(this.f6958p, pointFM6049v.y);
            path.lineTo(pointFM6049v.x, pointFM6049v.y);
            path.close();
        }
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13414A(path, this.f6960r, null);
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        Matrix matrixM13188b;
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13439d();
        }
        PointF pointFM6049v = m6049v(event.getX(), event.getY());
        BoardConfig boardConfigM5987f = m5987f();
        float geometryMinSize = boardConfigM5987f != null ? boardConfigM5987f.getGeometryMinSize() : 70.0f;
        if (pointFM6049v.x - this.f6958p < geometryMinSize || pointFM6049v.y - this.f6959q < geometryMinSize) {
            InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
            if (interfaceC7880cM5988g2 != null) {
                interfaceC7880cM5988g2.mo13439d();
                return;
            }
            return;
        }
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i == null || (matrixM13188b = c7792aM5990i.m13188b()) == null || (matrix = AbstractC7352m.m11777b(matrixM13188b)) == null) {
            matrix = new Matrix();
        }
        float fMapRadius = matrix.mapRadius(Math.abs(pointFM6049v.x - this.f6958p));
        float fMapRadius2 = matrix.mapRadius(Math.abs(pointFM6049v.y - this.f6959q));
        BoardConfig boardConfigM5987f2 = m5987f();
        int i10 = (boardConfigM5987f2 != null ? boardConfigM5987f2.getGeometryActionEnum() : null) == GeometryActionEnum.OVAL ? 0 : 1;
        BoardConfig boardConfigM5987f3 = m5987f();
        GeometryActionEnum geometryActionEnum = boardConfigM5987f3 != null ? boardConfigM5987f3.getGeometryActionEnum() : null;
        int i11 = geometryActionEnum == null ? -1 : C6620a.f6961a[geometryActionEnum.ordinal()];
        List listEmptyList = i11 != 1 ? i11 != 2 ? i11 != 3 ? CollectionsKt.emptyList() : CollectionsKt.listOf((Object[]) new PointF[]{new PointF(fMapRadius / 2, 0.0f), new PointF(0.0f, fMapRadius2), new PointF(fMapRadius, fMapRadius2)}) : CollectionsKt.listOf((Object[]) new PointF[]{new PointF(0.0f, 0.0f), new PointF(fMapRadius, 0.0f), new PointF(fMapRadius, fMapRadius2), new PointF(0.0f, fMapRadius2)}) : CollectionsKt.emptyList();
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h != null) {
            interfaceC7522bM5989h.mo12253r(fMapRadius, fMapRadius2, RangesKt.coerceAtMost(this.f6958p, pointFM6049v.x), RangesKt.coerceAtMost(this.f6959q, pointFM6049v.y), i10, listEmptyList, this.f6960r, new Function1<InterfaceC8888c, Unit>() { // from class: com.zykj.blackboard.core.action.GeometryAction$singleTouchUp$1
                {
                    super(1);
                }

                /* renamed from: a */
                public final void m6050a(InterfaceC8888c it) {
                    Function1 function1Mo12245j;
                    Intrinsics.checkNotNullParameter(it, "it");
                    InterfaceC7880c interfaceC7880cM5988g3 = this.f6962a.m5988g();
                    if (interfaceC7880cM5988g3 != null) {
                        InterfaceC7880c interfaceC7880cM5988g4 = this.f6962a.m5988g();
                        interfaceC7880cM5988g3.mo13460y(interfaceC7880cM5988g4 != null ? interfaceC7880cM5988g4.mo13437b() : null, it);
                    }
                    InterfaceC7522b interfaceC7522bM5989h2 = this.f6962a.m5989h();
                    if (interfaceC7522bM5989h2 != null && (function1Mo12245j = interfaceC7522bM5989h2.mo12245j()) != null) {
                        function1Mo12245j.invoke(it.getId());
                    }
                    InterfaceC7522b interfaceC7522bM5989h3 = this.f6962a.m5989h();
                    if (interfaceC7522bM5989h3 != null) {
                        interfaceC7522bM5989h3.mo12247l();
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8888c interfaceC8888c) {
                    m6050a(interfaceC8888c);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    /* renamed from: I */
    public void m6048I() {
        this.f6958p = 0.0f;
        this.f6959q = 0.0f;
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f != null) {
            this.f6960r.setColor(boardConfigM5987f.getGeometryStrokeColor());
            this.f6960r.setStrokeWidth(boardConfigM5987f.getGeometryStrokeWidth());
        }
    }

    /* renamed from: v */
    public final PointF m6049v(float f10, float f11) {
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }
}
