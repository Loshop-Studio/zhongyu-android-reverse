package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import ba.InterfaceC5181c;
import com.zykj.blackboard.enums.TranslationType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10346i;
import na.C10352o;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class SelectAction extends AbstractC8326b {

    /* renamed from: D */
    public RectF f17819D;

    /* renamed from: r */
    public boolean f17824r;

    /* renamed from: u */
    public float f17827u;

    /* renamed from: v */
    public float f17828v;

    /* renamed from: p */
    public final List f17822p = new ArrayList();

    /* renamed from: q */
    public long f17823q = System.currentTimeMillis();

    /* renamed from: s */
    public final float f17825s = 20.0f;

    /* renamed from: t */
    public boolean f17826t = true;

    /* renamed from: w */
    public Path f17829w = new Path();

    /* renamed from: x */
    public Paint f17830x = new Paint();

    /* renamed from: y */
    public Paint f17831y = new Paint();

    /* renamed from: z */
    public final float f17832z = 50.0f;

    /* renamed from: A */
    public int f17816A = -1;

    /* renamed from: B */
    public Matrix f17817B = new Matrix();

    /* renamed from: C */
    public Matrix f17818C = new Matrix();

    /* renamed from: E */
    public ArrayList f17820E = new ArrayList();

    /* renamed from: F */
    public ArrayList f17821F = new ArrayList();

    public SelectAction() {
        this.f17830x.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f17830x.setStrokeWidth(3.0f);
        Paint paint = this.f17830x;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f17830x.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        this.f17830x.setDither(true);
        this.f17830x.setAntiAlias(true);
        this.f17831y.setColor(-12085261);
        this.f17831y.setStrokeWidth(3.0f);
        this.f17831y.setStyle(style);
        this.f17831y.setDither(true);
        this.f17831y.setAntiAlias(true);
        C10346i.f24652a.m21641c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.SelectAction.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33995invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33995invoke() {
                SelectAction.this.f17819D = null;
                SelectAction.this.m13796N().clear();
                SelectAction.this.m13797O().clear();
                InterfaceC11552c interfaceC11552cM13725g = SelectAction.this.m13725g();
                if (interfaceC11552cM13725g != null) {
                    interfaceC11552cM13725g.mo25445e();
                }
            }
        });
    }

    /* renamed from: v */
    private final PointF m13791v(float f10, float f11) {
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f17819D = null;
        this.f17820E.clear();
        this.f17821F.clear();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25447g();
        }
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25445e();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        Log.i("SelectAction", String.valueOf(hashCode()));
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f17824r = false;
        PointF pointFM13791v = m13791v(event.getX(), event.getY());
        this.f17827u = pointFM13791v.x;
        this.f17828v = pointFM13791v.y;
        boolean zM13802T = m13802T(new PointF(this.f17827u, this.f17828v));
        this.f17826t = zM13802T;
        if (zM13802T) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25464x(this.f17820E);
            }
            this.f17823q = System.currentTimeMillis();
            return;
        }
        this.f17819D = null;
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25445e();
        }
        this.f17820E.clear();
        this.f17821F.clear();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM25311b;
        AbstractC9979u.m20294g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m13803U(event.getX(), event.getY())) {
            this.f17824r = true;
        }
        if (!this.f17826t) {
            this.f17829w.reset();
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
                float[] fArr = {event.getX(), event.getY()};
                matrixM25311b.mapPoints(fArr);
                this.f17829w.addRect(this.f17827u, this.f17828v, fArr[0], fArr[1], Path.Direction.CW);
            }
            this.f17829w.close();
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25416B(this.f17829w, this.f17830x, null);
                return;
            }
            return;
        }
        Log.i("currentTranslationType", "currentTranslationType: " + this.f17816A);
        int i10 = this.f17816A;
        if (i10 == TranslationType.ROTATE.m14633c()) {
            m13798P(event.getX(), event.getY());
        } else if (i10 == TranslationType.SCALE.m14633c()) {
            m13799Q(event.getX(), event.getY());
        } else if (i10 == TranslationType.TRANSLATE.m14633c()) {
            m13801S(event.getX(), event.getY());
        }
        Matrix matrix = new Matrix();
        C11373a c11373aM13727i2 = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i2);
        matrix.postConcat(c11373aM13727i2.m25311b());
        matrix.postConcat(this.f17817B);
        C11373a c11373aM13727i3 = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i3);
        matrix.postConcat(AbstractC10351n.m21660b(c11373aM13727i3.m25311b()));
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25451k(this.f17820E, matrix);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f17822p.add(AbstractC10351n.m21664f(matrix, jCurrentTimeMillis));
        this.f17823q = jCurrentTimeMillis;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        InterfaceC5181c interfaceC5181cMo25454n;
        Matrix matrix2;
        InterfaceC5181c interfaceC5181cMo25454n2;
        Matrix matrix3;
        AbstractC9979u.m20294g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "  Up: X---> " + event.getX() + ", Y---> " + event.getY());
        List listMo2717f = null;
        if (!this.f17826t) {
            this.f17818C.reset();
            if (this.f17824r) {
                PointF pointFM13791v = m13791v(event.getX(), event.getY());
                RectF rectF = new RectF(Math.min(this.f17827u, pointFM13791v.x), Math.min(this.f17828v, pointFM13791v.y), Math.max(this.f17827u, pointFM13791v.x), Math.max(this.f17828v, pointFM13791v.y));
                InterfaceC11552c interfaceC11552cM13725g = m13725g();
                if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null) {
                    listMo2717f = interfaceC5181cMo25454n.mo2717f();
                }
                if (listMo2717f != null && (!listMo2717f.isEmpty())) {
                    for (int size = listMo2717f.size() - 1; -1 < size; size--) {
                        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) listMo2717f.get(size);
                        C11373a c11373aM13727i = m13727i();
                        if (c11373aM13727i == null || (matrix = c11373aM13727i.m25311b()) == null) {
                            matrix = new Matrix();
                        }
                        RectF rectFMo2721j = interfaceC5181c.mo2721j(matrix);
                        if (rectF.contains(rectFMo2721j)) {
                            this.f17820E.add(listMo2717f.get(size));
                            this.f17821F.add(rectFMo2721j);
                        }
                    }
                }
            } else {
                InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
                if (interfaceC11552cM13725g2 != null && (interfaceC5181cMo25454n2 = interfaceC11552cM13725g2.mo25454n()) != null) {
                    listMo2717f = interfaceC5181cMo25454n2.mo2717f();
                }
                List list = listMo2717f;
                if (list != null && !list.isEmpty()) {
                    int size2 = listMo2717f.size() - 1;
                    while (true) {
                        if (-1 >= size2) {
                            break;
                        }
                        if (((InterfaceC5181c) listMo2717f.get(size2)).isInRect(event.getX(), event.getY(), 0.0f)) {
                            this.f17820E.add(listMo2717f.get(size2));
                            ArrayList arrayList = this.f17821F;
                            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) listMo2717f.get(size2);
                            C11373a c11373aM13727i2 = m13727i();
                            if (c11373aM13727i2 == null || (matrix2 = c11373aM13727i2.m25311b()) == null) {
                                matrix2 = new Matrix();
                            }
                            arrayList.add(interfaceC5181c2.mo2721j(matrix2));
                        } else {
                            size2--;
                        }
                    }
                }
            }
            m13800R(this.f17821F);
            return;
        }
        if (this.f17824r) {
            int i10 = this.f17816A;
            if (i10 == TranslationType.ROTATE.m14633c()) {
                m13798P(event.getX(), event.getY());
            } else if (i10 == TranslationType.SCALE.m14633c()) {
                m13799Q(event.getX(), event.getY());
            } else if (i10 == TranslationType.TRANSLATE.m14633c()) {
                m13801S(event.getX(), event.getY());
            }
            this.f17818C.postConcat(this.f17817B);
            Matrix matrix4 = new Matrix();
            C11373a c11373aM13727i3 = m13727i();
            AbstractC9979u.m20291d(c11373aM13727i3);
            matrix4.postConcat(c11373aM13727i3.m25311b());
            matrix4.postConcat(this.f17817B);
            C11373a c11373aM13727i4 = m13727i();
            AbstractC9979u.m20291d(c11373aM13727i4);
            matrix4.postConcat(AbstractC10351n.m21660b(c11373aM13727i4.m25311b()));
            InterfaceC11552c interfaceC11552cM13725g3 = m13725g();
            if (interfaceC11552cM13725g3 != null) {
                interfaceC11552cM13725g3.mo25466z(this.f17820E, matrix4);
            }
            InterfaceC10918b interfaceC10918bM13726h = m13726h();
            if (interfaceC10918bM13726h != null) {
                interfaceC10918bM13726h.mo23772l();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f17822p.add(AbstractC10351n.m21664f(matrix4, jCurrentTimeMillis));
            this.f17823q = jCurrentTimeMillis;
            InterfaceC10918b interfaceC10918bM13726h2 = m13726h();
            if (interfaceC10918bM13726h2 != null) {
                interfaceC10918bM13726h2.mo23763c(this.f17820E, this.f17822p);
                return;
            }
            return;
        }
        InterfaceC11552c interfaceC11552cM13725g4 = m13725g();
        if (interfaceC11552cM13725g4 != null) {
            interfaceC11552cM13725g4.mo25466z(this.f17820E, null);
        }
        if (this.f17816A == TranslationType.DELETE.m14633c()) {
            InterfaceC11552c interfaceC11552cM13725g5 = m13725g();
            if (interfaceC11552cM13725g5 != null) {
                interfaceC11552cM13725g5.mo25456p(this.f17820E);
            }
            InterfaceC11552c interfaceC11552cM13725g6 = m13725g();
            if (interfaceC11552cM13725g6 != null) {
                interfaceC11552cM13725g6.mo25445e();
            }
            InterfaceC10918b interfaceC10918bM13726h3 = m13726h();
            if (interfaceC10918bM13726h3 != null) {
                interfaceC10918bM13726h3.mo23775o(this.f17820E, System.currentTimeMillis());
            }
            InterfaceC10918b interfaceC10918bM13726h4 = m13726h();
            if (interfaceC10918bM13726h4 != null) {
                interfaceC10918bM13726h4.mo23772l();
            }
            this.f17819D = null;
            this.f17820E.clear();
            this.f17821F.clear();
            return;
        }
        InterfaceC5181c interfaceC5181cM13795M = m13795M(event.getX(), event.getY());
        if (interfaceC5181cM13795M != null) {
            ArrayList arrayList2 = this.f17820E;
            arrayList2.clear();
            arrayList2.add(interfaceC5181cM13795M);
            ArrayList arrayList3 = this.f17821F;
            arrayList3.clear();
            C11373a c11373aM13727i5 = m13727i();
            if (c11373aM13727i5 == null || (matrix3 = c11373aM13727i5.m25311b()) == null) {
                matrix3 = new Matrix();
            }
            arrayList3.add(interfaceC5181cM13795M.mo2721j(matrix3));
            InterfaceC11552c interfaceC11552cM13725g7 = m13725g();
            if (interfaceC11552cM13725g7 != null) {
                interfaceC11552cM13725g7.mo25445e();
            }
            m13800R(this.f17821F);
        }
    }

    /* renamed from: J */
    public final float m13792J(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: K */
    public final float m13793K(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m13792J(f12 - f10, f13 - f11) - m13792J(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: L */
    public final void m13794L(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: M */
    public final InterfaceC5181c m13795M(float f10, float f11) {
        InterfaceC5181c interfaceC5181cMo25454n;
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        List listMo2717f = (interfaceC11552cM13725g == null || (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) == null) ? null : interfaceC5181cMo25454n.mo2717f();
        List list = listMo2717f;
        if (list != null && !list.isEmpty()) {
            int size = listMo2717f.size();
            do {
                size--;
                if (-1 < size) {
                }
            } while (!((InterfaceC5181c) listMo2717f.get(size)).isInRect(f10, f11, 0.0f));
            return (InterfaceC5181c) listMo2717f.get(size);
        }
        return null;
    }

    /* renamed from: N */
    public final ArrayList m13796N() {
        return this.f17820E;
    }

    /* renamed from: O */
    public final ArrayList m13797O() {
        return this.f17821F;
    }

    /* renamed from: P */
    public final void m13798P(float f10, float f11) {
        PointF pointFM13791v = m13791v(f10, f11);
        C10352o c10352o = C10352o.f24660a;
        RectF rectF = this.f17819D;
        AbstractC9979u.m20291d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f17819D;
        AbstractC9979u.m20291d(rectF2);
        PointF pointFM21671d = c10352o.m21671d(fCenterX, rectF2.centerY(), this.f17818C);
        this.f17817B.setRotate((float) Math.toDegrees(m13792J(pointFM13791v.x - pointFM21671d.x, pointFM13791v.y - pointFM21671d.y) - m13792J(this.f17827u - pointFM21671d.x, this.f17828v - pointFM21671d.y)), pointFM21671d.x, pointFM21671d.y);
    }

    /* renamed from: Q */
    public final void m13799Q(float f10, float f11) {
        PointF pointFM13791v = m13791v(f10, f11);
        C10352o c10352o = C10352o.f24660a;
        RectF rectF = this.f17819D;
        AbstractC9979u.m20291d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f17819D;
        AbstractC9979u.m20291d(rectF2);
        PointF pointFM21671d = c10352o.m21671d(fCenterX, rectF2.centerY(), this.f17818C);
        RectF rectF3 = this.f17819D;
        AbstractC9979u.m20291d(rectF3);
        float f12 = rectF3.right;
        RectF rectF4 = this.f17819D;
        AbstractC9979u.m20291d(rectF4);
        PointF pointFM21671d2 = c10352o.m21671d(f12, rectF4.bottom, this.f17818C);
        float fM13793K = m13793K(pointFM21671d.x, pointFM21671d.y, pointFM21671d2.x, pointFM21671d2.y, this.f17827u, this.f17828v, pointFM13791v.x, pointFM13791v.y);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM21671d.x - pointFM21671d2.x, d10)) + ((float) Math.pow(pointFM21671d.y - pointFM21671d2.y, d10)));
        float f13 = fM13793K + fSqrt;
        if (f13 > ((float) Math.sqrt(((float) Math.pow(this.f17832z + 10, d10)) * 2))) {
            float f14 = f13 / fSqrt;
            this.f17817B.setScale(f14, f14, pointFM21671d.x, pointFM21671d.y);
        }
    }

    /* renamed from: R */
    public final void m13800R(List list) {
        RectF rectF = new RectF();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m13794L((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            this.f17819D = null;
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25445e();
                return;
            }
            return;
        }
        float f10 = 10;
        float fWidth = (this.f17832z + f10) - rectF.width();
        float fHeight = (this.f17832z + f10) - rectF.height();
        if (fWidth > 0.0f) {
            float f11 = fWidth / 2;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fHeight > 0.0f) {
            float f12 = fHeight / 2;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
        this.f17819D = rectF;
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            RectF rectF2 = this.f17819D;
            AbstractC9979u.m20291d(rectF2);
            interfaceC11552cM13725g2.mo25465y(rectF2, this.f17817B, this.f17831y, this.f17832z, true);
        }
    }

    /* renamed from: S */
    public final void m13801S(float f10, float f11) {
        PointF pointFM13791v = m13791v(f10, f11);
        this.f17817B.setTranslate(pointFM13791v.x - this.f17827u, pointFM13791v.y - this.f17828v);
    }

    /* renamed from: T */
    public final boolean m13802T(PointF pointF) {
        if (this.f17819D == null) {
            return false;
        }
        float fMapRadius = (this.f17832z / 2) / this.f17818C.mapRadius(1.0f);
        RectF rectF = this.f17819D;
        AbstractC9979u.m20291d(rectF);
        float f10 = rectF.left - fMapRadius;
        RectF rectF2 = this.f17819D;
        AbstractC9979u.m20291d(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f17819D;
        AbstractC9979u.m20291d(rectF3);
        float f12 = rectF3.left + fMapRadius;
        RectF rectF4 = this.f17819D;
        AbstractC9979u.m20291d(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f17819D;
        AbstractC9979u.m20291d(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f17819D;
        AbstractC9979u.m20291d(rectF7);
        float f14 = rectF7.top - fMapRadius;
        RectF rectF8 = this.f17819D;
        AbstractC9979u.m20291d(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f17819D;
        AbstractC9979u.m20291d(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.top + fMapRadius);
        RectF rectF11 = this.f17819D;
        AbstractC9979u.m20291d(rectF11);
        float f16 = rectF11.right - fMapRadius;
        RectF rectF12 = this.f17819D;
        AbstractC9979u.m20291d(rectF12);
        float f17 = rectF12.bottom - fMapRadius;
        RectF rectF13 = this.f17819D;
        AbstractC9979u.m20291d(rectF13);
        float f18 = rectF13.right + fMapRadius;
        RectF rectF14 = this.f17819D;
        AbstractC9979u.m20291d(rectF14);
        RectF rectF15 = new RectF(f16, f17, f18, rectF14.bottom + fMapRadius);
        C10352o c10352o = C10352o.f24660a;
        if (c10352o.m21670c(rectF5, this.f17818C, pointF)) {
            this.f17816A = TranslationType.ROTATE.m14633c();
            return true;
        }
        if (c10352o.m21670c(rectF10, this.f17818C, pointF)) {
            this.f17816A = TranslationType.DELETE.m14633c();
            return true;
        }
        if (c10352o.m21670c(rectF15, this.f17818C, pointF)) {
            this.f17816A = TranslationType.SCALE.m14633c();
            return true;
        }
        RectF rectF16 = this.f17819D;
        AbstractC9979u.m20291d(rectF16);
        if (!c10352o.m21670c(rectF16, this.f17818C, pointF)) {
            return false;
        }
        this.f17816A = TranslationType.TRANSLATE.m14633c();
        return true;
    }

    /* renamed from: U */
    public final boolean m13803U(float f10, float f11) {
        PointF pointFM13791v = m13791v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM13791v.x - this.f17827u), d10)) + ((float) Math.pow((double) (pointFM13791v.y - this.f17828v), d10))))) > this.f17825s;
    }

    /* renamed from: V */
    public void m13804V() {
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            this.f17830x.setColor(interfaceC11552cM13725g.mo25443c() ? ViewCompat.MEASURED_STATE_MASK : -3355444);
            this.f17831y.setColor(interfaceC11552cM13725g.mo25443c() ? -12085261 : -3355444);
        }
        this.f17817B.reset();
        this.f17829w.reset();
        this.f17822p.clear();
        this.f17827u = 0.0f;
        this.f17828v = 0.0f;
    }
}
