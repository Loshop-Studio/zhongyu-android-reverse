package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import ba.InterfaceC5181c;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10352o;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10978w;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class GeometryAction extends AbstractC8326b {

    /* renamed from: p */
    public float f17807p;

    /* renamed from: q */
    public float f17808q;

    /* renamed from: r */
    public final Paint f17809r;

    /* renamed from: com.zykj.blackboard.core.action.GeometryAction$a */
    public /* synthetic */ class C8320a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17810a;

        static {
            int[] iArr = new int[GeometryActionEnum.values().length];
            iArr[GeometryActionEnum.OVAL.ordinal()] = 1;
            iArr[GeometryActionEnum.RECTANGLE.ordinal()] = 2;
            iArr[GeometryActionEnum.TRIANGLE.ordinal()] = 3;
            f17810a = iArr;
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
        this.f17809r = paint;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        PointF pointFM13787v = m13787v(event.getX(), event.getY());
        this.f17807p = pointFM13787v.x;
        this.f17808q = pointFM13787v.y;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        PointF pointFM13787v = m13787v(event.getX(), event.getY());
        C10762b c10762bM13724f = m13724f();
        float fM22911r = c10762bM13724f != null ? c10762bM13724f.m22911r() : 70.0f;
        if (pointFM13787v.x - this.f17807p < fM22911r || pointFM13787v.y - this.f17808q < fM22911r) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25445e();
                return;
            }
            return;
        }
        Path path = new Path();
        C10762b c10762bM13724f2 = m13724f();
        GeometryActionEnum geometryActionEnumM22910q = c10762bM13724f2 != null ? c10762bM13724f2.m22910q() : null;
        int i10 = geometryActionEnumM22910q == null ? -1 : C8320a.f17810a[geometryActionEnumM22910q.ordinal()];
        if (i10 == 1) {
            path.addOval(new RectF(this.f17807p, this.f17808q, pointFM13787v.x, pointFM13787v.y), Path.Direction.CW);
        } else if (i10 == 2) {
            path.moveTo(this.f17807p, this.f17808q);
            path.lineTo(this.f17807p, pointFM13787v.y);
            path.lineTo(pointFM13787v.x, pointFM13787v.y);
            path.lineTo(pointFM13787v.x, this.f17808q);
            path.close();
        } else if (i10 == 3) {
            path.moveTo((this.f17807p + pointFM13787v.x) / 2, this.f17808q);
            path.lineTo(this.f17807p, pointFM13787v.y);
            path.lineTo(pointFM13787v.x, pointFM13787v.y);
            path.close();
        }
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25416B(path, this.f17809r, null);
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        Matrix matrixM25311b;
        AbstractC9979u.m20294g(event, "event");
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25445e();
        }
        PointF pointFM13787v = m13787v(event.getX(), event.getY());
        C10762b c10762bM13724f = m13724f();
        float fM22911r = c10762bM13724f != null ? c10762bM13724f.m22911r() : 70.0f;
        if (pointFM13787v.x - this.f17807p < fM22911r || pointFM13787v.y - this.f17808q < fM22911r) {
            InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
            if (interfaceC11552cM13725g2 != null) {
                interfaceC11552cM13725g2.mo25445e();
                return;
            }
            return;
        }
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i == null || (matrixM25311b = c11373aM13727i.m25311b()) == null || (matrix = AbstractC10351n.m21660b(matrixM25311b)) == null) {
            matrix = new Matrix();
        }
        float fMapRadius = matrix.mapRadius(Math.abs(pointFM13787v.x - this.f17807p));
        float fMapRadius2 = matrix.mapRadius(Math.abs(pointFM13787v.y - this.f17808q));
        C10762b c10762bM13724f2 = m13724f();
        int i10 = (c10762bM13724f2 != null ? c10762bM13724f2.m22910q() : null) == GeometryActionEnum.OVAL ? 0 : 1;
        C10762b c10762bM13724f3 = m13724f();
        GeometryActionEnum geometryActionEnumM22910q = c10762bM13724f3 != null ? c10762bM13724f3.m22910q() : null;
        int i11 = geometryActionEnumM22910q == null ? -1 : C8320a.f17810a[geometryActionEnumM22910q.ordinal()];
        List listM24136n = i11 != 1 ? i11 != 2 ? i11 != 3 ? AbstractC10978w.m24136n() : AbstractC10978w.m24139q(new PointF(fMapRadius / 2, 0.0f), new PointF(0.0f, fMapRadius2), new PointF(fMapRadius, fMapRadius2)) : AbstractC10978w.m24139q(new PointF(0.0f, 0.0f), new PointF(fMapRadius, 0.0f), new PointF(fMapRadius, fMapRadius2), new PointF(0.0f, fMapRadius2)) : AbstractC10978w.m24136n();
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h != null) {
            interfaceC10918bM13726h.mo23773m(fMapRadius, fMapRadius2, AbstractC10410o.m21755h(this.f17807p, pointFM13787v.x), AbstractC10410o.m21755h(this.f17808q, pointFM13787v.y), i10, listM24136n, this.f17809r, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.GeometryAction$singleTouchUp$1
                {
                    super(1);
                }

                /* renamed from: a */
                public final void m13788a(InterfaceC5181c it) {
                    InterfaceC9540l interfaceC9540lMo23769i;
                    AbstractC9979u.m20294g(it, "it");
                    InterfaceC11552c interfaceC11552cM13725g3 = this.f17811c.m13725g();
                    if (interfaceC11552cM13725g3 != null) {
                        InterfaceC11552c interfaceC11552cM13725g4 = this.f17811c.m13725g();
                        interfaceC11552cM13725g3.mo25446f(interfaceC11552cM13725g4 != null ? interfaceC11552cM13725g4.mo25442b() : null, it);
                    }
                    InterfaceC10918b interfaceC10918bM13726h2 = this.f17811c.m13726h();
                    if (interfaceC10918bM13726h2 != null && (interfaceC9540lMo23769i = interfaceC10918bM13726h2.mo23769i()) != null) {
                        interfaceC9540lMo23769i.invoke(it.getId());
                    }
                    InterfaceC10918b interfaceC10918bM13726h3 = this.f17811c.m13726h();
                    if (interfaceC10918bM13726h3 != null) {
                        interfaceC10918bM13726h3.mo23772l();
                    }
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m13788a((InterfaceC5181c) obj);
                    return C10786q.f26013a;
                }
            });
        }
    }

    /* renamed from: I */
    public void m13786I() {
        this.f17807p = 0.0f;
        this.f17808q = 0.0f;
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f != null) {
            this.f17809r.setColor(c10762bM13724f.m22912s());
            this.f17809r.setStrokeWidth(c10762bM13724f.m22913t());
        }
    }

    /* renamed from: v */
    public final PointF m13787v(float f10, float f11) {
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }
}
