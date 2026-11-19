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
import com.zykj.blackboard.enums.TranslationType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;

/* loaded from: classes4.dex */
public final class SelectAction extends AbstractC6626b {

    /* renamed from: D */
    public RectF f6970D;

    /* renamed from: r */
    public boolean f6975r;

    /* renamed from: u */
    public float f6978u;

    /* renamed from: v */
    public float f6979v;

    /* renamed from: p */
    public final List f6973p = new ArrayList();

    /* renamed from: q */
    public long f6974q = System.currentTimeMillis();

    /* renamed from: s */
    public final float f6976s = 20.0f;

    /* renamed from: t */
    public boolean f6977t = true;

    /* renamed from: w */
    public Path f6980w = new Path();

    /* renamed from: x */
    public Paint f6981x = new Paint();

    /* renamed from: y */
    public Paint f6982y = new Paint();

    /* renamed from: z */
    public final float f6983z = 50.0f;

    /* renamed from: A */
    public int f6967A = -1;

    /* renamed from: B */
    public Matrix f6968B = new Matrix();

    /* renamed from: C */
    public Matrix f6969C = new Matrix();

    /* renamed from: E */
    public ArrayList f6971E = new ArrayList();

    /* renamed from: F */
    public ArrayList f6972F = new ArrayList();

    public SelectAction() {
        this.f6981x.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f6981x.setStrokeWidth(3.0f);
        Paint paint = this.f6981x;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f6981x.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        this.f6981x.setDither(true);
        this.f6981x.setAntiAlias(true);
        this.f6982y.setColor(-12085261);
        this.f6982y.setStrokeWidth(3.0f);
        this.f6982y.setStyle(style);
        this.f6982y.setDither(true);
        this.f6982y.setAntiAlias(true);
        C7347h.f11914a.m11759c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.SelectAction.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectAction.this.f6970D = null;
                SelectAction.this.m6059O().clear();
                SelectAction.this.m6060P().clear();
                InterfaceC7880c interfaceC7880cM5988g = SelectAction.this.m5988g();
                if (interfaceC7880cM5988g != null) {
                    interfaceC7880cM5988g.mo13439d();
                }
            }
        });
    }

    /* renamed from: v */
    private final PointF m6053v(float f10, float f11) {
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f6970D = null;
        this.f6971E.clear();
        this.f6972F.clear();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13440e();
        }
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13439d();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i("SelectAction", String.valueOf(hashCode()));
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f6975r = false;
        PointF pointFM6053v = m6053v(event.getX(), event.getY());
        this.f6978u = pointFM6053v.x;
        this.f6979v = pointFM6053v.y;
        boolean zM6065U = m6065U(new PointF(this.f6978u, this.f6979v));
        this.f6977t = zM6065U;
        if (zM6065U) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13457v(this.f6971E);
            }
            this.f6974q = System.currentTimeMillis();
            return;
        }
        this.f6970D = null;
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13439d();
        }
        this.f6971E.clear();
        this.f6972F.clear();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM13188b;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m6066V(event.getX(), event.getY())) {
            this.f6975r = true;
        }
        if (!this.f6977t) {
            this.f6980w.reset();
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
                float[] fArr = {event.getX(), event.getY()};
                matrixM13188b.mapPoints(fArr);
                this.f6980w.addRect(this.f6978u, this.f6979v, fArr[0], fArr[1], Path.Direction.CW);
            }
            this.f6980w.close();
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13414A(this.f6980w, this.f6981x, null);
                return;
            }
            return;
        }
        Log.i("currentTranslationType", "currentTranslationType: " + this.f6967A);
        int i10 = this.f6967A;
        if (i10 == TranslationType.ROTATE.getValue()) {
            m6061Q(event.getX(), event.getY());
        } else if (i10 == TranslationType.SCALE.getValue()) {
            m6062R(event.getX(), event.getY());
        } else if (i10 == TranslationType.TRANSLATE.getValue()) {
            m6064T(event.getX(), event.getY());
        }
        Matrix matrix = new Matrix();
        C7792a c7792aM5990i2 = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i2);
        matrix.postConcat(c7792aM5990i2.m13188b());
        matrix.postConcat(this.f6968B);
        C7792a c7792aM5990i3 = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i3);
        matrix.postConcat(AbstractC7352m.m11777b(c7792aM5990i3.m13188b()));
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13443h(this.f6971E, matrix);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f6973p.add(AbstractC7352m.m11778c(matrix, jCurrentTimeMillis));
        this.f6974q = jCurrentTimeMillis;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        InterfaceC8888c interfaceC8888cMo13449n;
        Matrix matrix2;
        InterfaceC8888c interfaceC8888cMo13449n2;
        Matrix matrix3;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "  Up: X---> " + event.getX() + ", Y---> " + event.getY());
        List listMo14995f = null;
        if (!this.f6977t) {
            this.f6969C.reset();
            if (this.f6975r) {
                PointF pointFM6053v = m6053v(event.getX(), event.getY());
                RectF rectF = new RectF(Math.min(this.f6978u, pointFM6053v.x), Math.min(this.f6979v, pointFM6053v.y), Math.max(this.f6978u, pointFM6053v.x), Math.max(this.f6979v, pointFM6053v.y));
                InterfaceC7880c interfaceC7880cM5988g = m5988g();
                if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null) {
                    listMo14995f = interfaceC8888cMo13449n.mo14995f();
                }
                if (listMo14995f != null && (!listMo14995f.isEmpty())) {
                    for (int size = listMo14995f.size() - 1; -1 < size; size--) {
                        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) listMo14995f.get(size);
                        C7792a c7792aM5990i = m5990i();
                        if (c7792aM5990i == null || (matrix = c7792aM5990i.m13188b()) == null) {
                            matrix = new Matrix();
                        }
                        RectF rectFMo14999j = interfaceC8888c.mo14999j(matrix);
                        if (rectF.contains(rectFMo14999j)) {
                            this.f6971E.add(listMo14995f.get(size));
                            this.f6972F.add(rectFMo14999j);
                        }
                    }
                }
            } else {
                InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
                if (interfaceC7880cM5988g2 != null && (interfaceC8888cMo13449n2 = interfaceC7880cM5988g2.mo13449n()) != null) {
                    listMo14995f = interfaceC8888cMo13449n2.mo14995f();
                }
                if (listMo14995f != null && !listMo14995f.isEmpty()) {
                    int size2 = listMo14995f.size() - 1;
                    while (true) {
                        if (-1 >= size2) {
                            break;
                        }
                        if (((InterfaceC8888c) listMo14995f.get(size2)).isInRect(event.getX(), event.getY(), 0.0f)) {
                            this.f6971E.add(listMo14995f.get(size2));
                            ArrayList arrayList = this.f6972F;
                            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) listMo14995f.get(size2);
                            C7792a c7792aM5990i2 = m5990i();
                            if (c7792aM5990i2 == null || (matrix2 = c7792aM5990i2.m13188b()) == null) {
                                matrix2 = new Matrix();
                            }
                            arrayList.add(interfaceC8888c2.mo14999j(matrix2));
                        } else {
                            size2--;
                        }
                    }
                }
            }
            m6063S(this.f6972F);
            return;
        }
        if (this.f6975r) {
            int i10 = this.f6967A;
            if (i10 == TranslationType.ROTATE.getValue()) {
                m6061Q(event.getX(), event.getY());
            } else if (i10 == TranslationType.SCALE.getValue()) {
                m6062R(event.getX(), event.getY());
            } else if (i10 == TranslationType.TRANSLATE.getValue()) {
                m6064T(event.getX(), event.getY());
            }
            this.f6969C.postConcat(this.f6968B);
            Matrix matrix4 = new Matrix();
            C7792a c7792aM5990i3 = m5990i();
            Intrinsics.checkNotNull(c7792aM5990i3);
            matrix4.postConcat(c7792aM5990i3.m13188b());
            matrix4.postConcat(this.f6968B);
            C7792a c7792aM5990i4 = m5990i();
            Intrinsics.checkNotNull(c7792aM5990i4);
            matrix4.postConcat(AbstractC7352m.m11777b(c7792aM5990i4.m13188b()));
            InterfaceC7880c interfaceC7880cM5988g3 = m5988g();
            if (interfaceC7880cM5988g3 != null) {
                interfaceC7880cM5988g3.mo13459x(this.f6971E, matrix4);
            }
            InterfaceC7522b interfaceC7522bM5989h = m5989h();
            if (interfaceC7522bM5989h != null) {
                interfaceC7522bM5989h.mo12247l();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f6973p.add(AbstractC7352m.m11778c(matrix4, jCurrentTimeMillis));
            this.f6974q = jCurrentTimeMillis;
            InterfaceC7522b interfaceC7522bM5989h2 = m5989h();
            if (interfaceC7522bM5989h2 != null) {
                interfaceC7522bM5989h2.mo12238c(this.f6971E, this.f6973p);
                return;
            }
            return;
        }
        InterfaceC7880c interfaceC7880cM5988g4 = m5988g();
        if (interfaceC7880cM5988g4 != null) {
            interfaceC7880cM5988g4.mo13459x(this.f6971E, null);
        }
        if (this.f6967A == TranslationType.DELETE.getValue()) {
            InterfaceC7880c interfaceC7880cM5988g5 = m5988g();
            if (interfaceC7880cM5988g5 != null) {
                interfaceC7880cM5988g5.mo13452q(this.f6971E);
            }
            InterfaceC7880c interfaceC7880cM5988g6 = m5988g();
            if (interfaceC7880cM5988g6 != null) {
                interfaceC7880cM5988g6.mo13439d();
            }
            InterfaceC7522b interfaceC7522bM5989h3 = m5989h();
            if (interfaceC7522bM5989h3 != null) {
                interfaceC7522bM5989h3.mo12249n(this.f6971E, System.currentTimeMillis());
            }
            InterfaceC7522b interfaceC7522bM5989h4 = m5989h();
            if (interfaceC7522bM5989h4 != null) {
                interfaceC7522bM5989h4.mo12247l();
            }
            this.f6970D = null;
            this.f6971E.clear();
            this.f6972F.clear();
            return;
        }
        InterfaceC8888c interfaceC8888cM6058N = m6058N(event.getX(), event.getY());
        if (interfaceC8888cM6058N != null) {
            ArrayList arrayList2 = this.f6971E;
            arrayList2.clear();
            arrayList2.add(interfaceC8888cM6058N);
            ArrayList arrayList3 = this.f6972F;
            arrayList3.clear();
            C7792a c7792aM5990i5 = m5990i();
            if (c7792aM5990i5 == null || (matrix3 = c7792aM5990i5.m13188b()) == null) {
                matrix3 = new Matrix();
            }
            arrayList3.add(interfaceC8888cM6058N.mo14999j(matrix3));
            InterfaceC7880c interfaceC7880cM5988g7 = m5988g();
            if (interfaceC7880cM5988g7 != null) {
                interfaceC7880cM5988g7.mo13439d();
            }
            m6063S(this.f6972F);
        }
    }

    /* renamed from: J */
    public final float m6054J(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: K */
    public final float m6055K(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m6054J(f12 - f10, f13 - f11) - m6054J(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: L */
    public final boolean m6056L(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }

    /* renamed from: M */
    public final void m6057M(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: N */
    public final InterfaceC8888c m6058N(float f10, float f11) {
        InterfaceC8888c interfaceC8888cMo13449n;
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        List listMo14995f = (interfaceC7880cM5988g == null || (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) == null) ? null : interfaceC8888cMo13449n.mo14995f();
        if (listMo14995f != null && !listMo14995f.isEmpty()) {
            int size = listMo14995f.size();
            do {
                size--;
                if (-1 < size) {
                }
            } while (!((InterfaceC8888c) listMo14995f.get(size)).isInRect(f10, f11, 0.0f));
            return (InterfaceC8888c) listMo14995f.get(size);
        }
        return null;
    }

    /* renamed from: O */
    public final ArrayList m6059O() {
        return this.f6971E;
    }

    /* renamed from: P */
    public final ArrayList m6060P() {
        return this.f6972F;
    }

    /* renamed from: Q */
    public final void m6061Q(float f10, float f11) {
        PointF pointFM6053v = m6053v(f10, f11);
        C7353n c7353n = C7353n.f11920a;
        RectF rectF = this.f6970D;
        Intrinsics.checkNotNull(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f6970D;
        Intrinsics.checkNotNull(rectF2);
        PointF pointFM11783d = c7353n.m11783d(fCenterX, rectF2.centerY(), this.f6969C);
        this.f6968B.setRotate((float) Math.toDegrees(m6054J(pointFM6053v.x - pointFM11783d.x, pointFM6053v.y - pointFM11783d.y) - m6054J(this.f6978u - pointFM11783d.x, this.f6979v - pointFM11783d.y)), pointFM11783d.x, pointFM11783d.y);
    }

    /* renamed from: R */
    public final void m6062R(float f10, float f11) {
        PointF pointFM6053v = m6053v(f10, f11);
        C7353n c7353n = C7353n.f11920a;
        RectF rectF = this.f6970D;
        Intrinsics.checkNotNull(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f6970D;
        Intrinsics.checkNotNull(rectF2);
        PointF pointFM11783d = c7353n.m11783d(fCenterX, rectF2.centerY(), this.f6969C);
        RectF rectF3 = this.f6970D;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.right;
        RectF rectF4 = this.f6970D;
        Intrinsics.checkNotNull(rectF4);
        PointF pointFM11783d2 = c7353n.m11783d(f12, rectF4.bottom, this.f6969C);
        float fM6055K = m6055K(pointFM11783d.x, pointFM11783d.y, pointFM11783d2.x, pointFM11783d2.y, this.f6978u, this.f6979v, pointFM6053v.x, pointFM6053v.y);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM11783d.x - pointFM11783d2.x, d10)) + ((float) Math.pow(pointFM11783d.y - pointFM11783d2.y, d10)));
        float f13 = fM6055K + fSqrt;
        if (f13 > ((float) Math.sqrt(((float) Math.pow(this.f6983z + 10, d10)) * 2))) {
            float f14 = f13 / fSqrt;
            this.f6968B.setScale(f14, f14, pointFM11783d.x, pointFM11783d.y);
        }
    }

    /* renamed from: S */
    public final void m6063S(List list) {
        RectF rectF = new RectF();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m6057M((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            this.f6970D = null;
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13439d();
                return;
            }
            return;
        }
        float f10 = 10;
        float fWidth = (this.f6983z + f10) - rectF.width();
        float fHeight = (this.f6983z + f10) - rectF.height();
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
        this.f6970D = rectF;
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            RectF rectF2 = this.f6970D;
            Intrinsics.checkNotNull(rectF2);
            interfaceC7880cM5988g2.mo13458w(rectF2, this.f6968B, this.f6982y, this.f6983z, true);
        }
    }

    /* renamed from: T */
    public final void m6064T(float f10, float f11) {
        PointF pointFM6053v = m6053v(f10, f11);
        this.f6968B.setTranslate(pointFM6053v.x - this.f6978u, pointFM6053v.y - this.f6979v);
    }

    /* renamed from: U */
    public final boolean m6065U(PointF pointF) {
        if (this.f6970D == null) {
            return false;
        }
        float fMapRadius = (this.f6983z / 2) / this.f6969C.mapRadius(1.0f);
        RectF rectF = this.f6970D;
        Intrinsics.checkNotNull(rectF);
        float f10 = rectF.left - fMapRadius;
        RectF rectF2 = this.f6970D;
        Intrinsics.checkNotNull(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f6970D;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.left + fMapRadius;
        RectF rectF4 = this.f6970D;
        Intrinsics.checkNotNull(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f6970D;
        Intrinsics.checkNotNull(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f6970D;
        Intrinsics.checkNotNull(rectF7);
        float f14 = rectF7.top - fMapRadius;
        RectF rectF8 = this.f6970D;
        Intrinsics.checkNotNull(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f6970D;
        Intrinsics.checkNotNull(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.top + fMapRadius);
        RectF rectF11 = this.f6970D;
        Intrinsics.checkNotNull(rectF11);
        float f16 = rectF11.right - fMapRadius;
        RectF rectF12 = this.f6970D;
        Intrinsics.checkNotNull(rectF12);
        float f17 = rectF12.bottom - fMapRadius;
        RectF rectF13 = this.f6970D;
        Intrinsics.checkNotNull(rectF13);
        float f18 = rectF13.right + fMapRadius;
        RectF rectF14 = this.f6970D;
        Intrinsics.checkNotNull(rectF14);
        RectF rectF15 = new RectF(f16, f17, f18, rectF14.bottom + fMapRadius);
        C7353n c7353n = C7353n.f11920a;
        if (c7353n.m11782c(rectF5, this.f6969C, pointF)) {
            this.f6967A = TranslationType.ROTATE.getValue();
            return true;
        }
        if (c7353n.m11782c(rectF10, this.f6969C, pointF)) {
            this.f6967A = TranslationType.DELETE.getValue();
            return true;
        }
        if (c7353n.m11782c(rectF15, this.f6969C, pointF)) {
            this.f6967A = TranslationType.SCALE.getValue();
            return true;
        }
        RectF rectF16 = this.f6970D;
        Intrinsics.checkNotNull(rectF16);
        if (!c7353n.m11782c(rectF16, this.f6969C, pointF)) {
            return false;
        }
        this.f6967A = TranslationType.TRANSLATE.getValue();
        return true;
    }

    /* renamed from: V */
    public final boolean m6066V(float f10, float f11) {
        PointF pointFM6053v = m6053v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM6053v.x - this.f6978u), d10)) + ((float) Math.pow((double) (pointFM6053v.y - this.f6979v), d10))))) > this.f6976s;
    }

    /* renamed from: W */
    public void m6067W() {
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            this.f6981x.setColor(m6056L(interfaceC7880cM5988g.getBackgroundColor()) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
            this.f6982y.setColor(m6056L(interfaceC7880cM5988g.getBackgroundColor()) ? -12085261 : -3355444);
        }
        this.f6968B.reset();
        this.f6980w.reset();
        this.f6973p.clear();
        this.f6978u = 0.0f;
        this.f6979v = 0.0f;
    }
}
