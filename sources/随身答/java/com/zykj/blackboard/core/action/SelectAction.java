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
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p263u5.C9696o;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class SelectAction extends AbstractC6943b {

    /* renamed from: D */
    public RectF f8253D;

    /* renamed from: r */
    public boolean f8258r;

    /* renamed from: u */
    public float f8261u;

    /* renamed from: v */
    public float f8262v;

    /* renamed from: p */
    public final List f8256p = new ArrayList();

    /* renamed from: q */
    public long f8257q = System.currentTimeMillis();

    /* renamed from: s */
    public final float f8259s = 20.0f;

    /* renamed from: t */
    public boolean f8260t = true;

    /* renamed from: w */
    public Path f8263w = new Path();

    /* renamed from: x */
    public Paint f8264x = new Paint();

    /* renamed from: y */
    public Paint f8265y = new Paint();

    /* renamed from: z */
    public final float f8266z = 50.0f;

    /* renamed from: A */
    public int f8250A = -1;

    /* renamed from: B */
    public Matrix f8251B = new Matrix();

    /* renamed from: C */
    public Matrix f8252C = new Matrix();

    /* renamed from: E */
    public ArrayList f8254E = new ArrayList();

    /* renamed from: F */
    public ArrayList f8255F = new ArrayList();

    public SelectAction() {
        this.f8264x.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f8264x.setStrokeWidth(3.0f);
        Paint paint = this.f8264x;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f8264x.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        this.f8264x.setDither(true);
        this.f8264x.setAntiAlias(true);
        this.f8265y.setColor(-12085261);
        this.f8265y.setStrokeWidth(3.0f);
        this.f8265y.setStyle(style);
        this.f8265y.setDither(true);
        this.f8265y.setAntiAlias(true);
        C9690i.f17127a.m16180c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.SelectAction.1
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
                SelectAction.this.f8253D = null;
                SelectAction.this.m7155O().clear();
                SelectAction.this.m7156P().clear();
                InterfaceC0039c interfaceC0039cM7083g = SelectAction.this.m7083g();
                if (interfaceC0039cM7083g != null) {
                    interfaceC0039cM7083g.mo201d();
                }
            }
        });
    }

    /* renamed from: v */
    private final PointF m7149v(float f10, float f11) {
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f8253D = null;
        this.f8254E.clear();
        this.f8255F.clear();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo202e();
        }
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo201d();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i("SelectAction", String.valueOf(hashCode()));
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f8258r = false;
        PointF pointFM7149v = m7149v(event.getX(), event.getY());
        this.f8261u = pointFM7149v.x;
        this.f8262v = pointFM7149v.y;
        boolean zM7161U = m7161U(new PointF(this.f8261u, this.f8262v));
        this.f8260t = zM7161U;
        if (zM7161U) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo218u(this.f8254E);
            }
            this.f8257q = System.currentTimeMillis();
            return;
        }
        this.f8253D = null;
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo201d();
        }
        this.f8254E.clear();
        this.f8255F.clear();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM17344b;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m7162V(event.getX(), event.getY())) {
            this.f8258r = true;
        }
        if (!this.f8260t) {
            this.f8263w.reset();
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
                float[] fArr = {event.getX(), event.getY()};
                matrixM17344b.mapPoints(fArr);
                this.f8263w.addRect(this.f8261u, this.f8262v, fArr[0], fArr[1], Path.Direction.CW);
            }
            this.f8263w.close();
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo175B(this.f8263w, this.f8264x, null);
                return;
            }
            return;
        }
        Log.i("currentTranslationType", "currentTranslationType: " + this.f8250A);
        int i9 = this.f8250A;
        if (i9 == TranslationType.ROTATE.getValue()) {
            m7157Q(event.getX(), event.getY());
        } else if (i9 == TranslationType.SCALE.getValue()) {
            m7158R(event.getX(), event.getY());
        } else if (i9 == TranslationType.TRANSLATE.getValue()) {
            m7160T(event.getX(), event.getY());
        }
        Matrix matrix = new Matrix();
        C9998a c9998aM7085i2 = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i2);
        matrix.postConcat(c9998aM7085i2.m17344b());
        matrix.postConcat(this.f8251B);
        C9998a c9998aM7085i3 = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i3);
        matrix.postConcat(AbstractC9695n.m16200b(c9998aM7085i3.m17344b()));
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo206i(this.f8254E, matrix);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f8256p.add(AbstractC9695n.m16201c(matrix, jCurrentTimeMillis));
        this.f8257q = jCurrentTimeMillis;
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        InterfaceC8055c interfaceC8055cMo210m;
        Matrix matrix2;
        InterfaceC8055c interfaceC8055cMo210m2;
        Matrix matrix3;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "  Up: X---> " + event.getX() + ", Y---> " + event.getY());
        List listMo12796e = null;
        if (!this.f8260t) {
            this.f8252C.reset();
            if (this.f8258r) {
                PointF pointFM7149v = m7149v(event.getX(), event.getY());
                RectF rectF = new RectF(Math.min(this.f8261u, pointFM7149v.x), Math.min(this.f8262v, pointFM7149v.y), Math.max(this.f8261u, pointFM7149v.x), Math.max(this.f8262v, pointFM7149v.y));
                InterfaceC0039c interfaceC0039cM7083g = m7083g();
                if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null) {
                    listMo12796e = interfaceC8055cMo210m.mo12796e();
                }
                if (listMo12796e != null && (!listMo12796e.isEmpty())) {
                    for (int size = listMo12796e.size() - 1; -1 < size; size--) {
                        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) listMo12796e.get(size);
                        C9998a c9998aM7085i = m7085i();
                        if (c9998aM7085i == null || (matrix = c9998aM7085i.m17344b()) == null) {
                            matrix = new Matrix();
                        }
                        RectF rectFMo12799i = interfaceC8055c.mo12799i(matrix);
                        if (rectF.contains(rectFMo12799i)) {
                            this.f8254E.add(listMo12796e.get(size));
                            this.f8255F.add(rectFMo12799i);
                        }
                    }
                }
            } else {
                InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
                if (interfaceC0039cM7083g2 != null && (interfaceC8055cMo210m2 = interfaceC0039cM7083g2.mo210m()) != null) {
                    listMo12796e = interfaceC8055cMo210m2.mo12796e();
                }
                if (listMo12796e != null && !listMo12796e.isEmpty()) {
                    int size2 = listMo12796e.size() - 1;
                    while (true) {
                        if (-1 >= size2) {
                            break;
                        }
                        if (((InterfaceC8055c) listMo12796e.get(size2)).isInRect(event.getX(), event.getY(), 0.0f)) {
                            this.f8254E.add(listMo12796e.get(size2));
                            ArrayList arrayList = this.f8255F;
                            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) listMo12796e.get(size2);
                            C9998a c9998aM7085i2 = m7085i();
                            if (c9998aM7085i2 == null || (matrix2 = c9998aM7085i2.m17344b()) == null) {
                                matrix2 = new Matrix();
                            }
                            arrayList.add(interfaceC8055c2.mo12799i(matrix2));
                        } else {
                            size2--;
                        }
                    }
                }
            }
            m7159S(this.f8255F);
            return;
        }
        if (this.f8258r) {
            int i9 = this.f8250A;
            if (i9 == TranslationType.ROTATE.getValue()) {
                m7157Q(event.getX(), event.getY());
            } else if (i9 == TranslationType.SCALE.getValue()) {
                m7158R(event.getX(), event.getY());
            } else if (i9 == TranslationType.TRANSLATE.getValue()) {
                m7160T(event.getX(), event.getY());
            }
            this.f8252C.postConcat(this.f8251B);
            Matrix matrix4 = new Matrix();
            C9998a c9998aM7085i3 = m7085i();
            Intrinsics.checkNotNull(c9998aM7085i3);
            matrix4.postConcat(c9998aM7085i3.m17344b());
            matrix4.postConcat(this.f8251B);
            C9998a c9998aM7085i4 = m7085i();
            Intrinsics.checkNotNull(c9998aM7085i4);
            matrix4.postConcat(AbstractC9695n.m16200b(c9998aM7085i4.m17344b()));
            InterfaceC0039c interfaceC0039cM7083g3 = m7083g();
            if (interfaceC0039cM7083g3 != null) {
                interfaceC0039cM7083g3.mo223z(this.f8254E, matrix4);
            }
            InterfaceC9822b interfaceC9822bM7084h = m7084h();
            if (interfaceC9822bM7084h != null) {
                interfaceC9822bM7084h.mo16693l();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f8256p.add(AbstractC9695n.m16201c(matrix4, jCurrentTimeMillis));
            this.f8257q = jCurrentTimeMillis;
            InterfaceC9822b interfaceC9822bM7084h2 = m7084h();
            if (interfaceC9822bM7084h2 != null) {
                interfaceC9822bM7084h2.mo16684c(this.f8254E, this.f8256p);
                return;
            }
            return;
        }
        InterfaceC0039c interfaceC0039cM7083g4 = m7083g();
        if (interfaceC0039cM7083g4 != null) {
            interfaceC0039cM7083g4.mo223z(this.f8254E, null);
        }
        if (this.f8250A == TranslationType.DELETE.getValue()) {
            InterfaceC0039c interfaceC0039cM7083g5 = m7083g();
            if (interfaceC0039cM7083g5 != null) {
                interfaceC0039cM7083g5.mo212o(this.f8254E);
            }
            InterfaceC0039c interfaceC0039cM7083g6 = m7083g();
            if (interfaceC0039cM7083g6 != null) {
                interfaceC0039cM7083g6.mo201d();
            }
            InterfaceC9822b interfaceC9822bM7084h3 = m7084h();
            if (interfaceC9822bM7084h3 != null) {
                interfaceC9822bM7084h3.mo16695n(this.f8254E, System.currentTimeMillis());
            }
            InterfaceC9822b interfaceC9822bM7084h4 = m7084h();
            if (interfaceC9822bM7084h4 != null) {
                interfaceC9822bM7084h4.mo16693l();
            }
            this.f8253D = null;
            this.f8254E.clear();
            this.f8255F.clear();
            return;
        }
        InterfaceC8055c interfaceC8055cM7154N = m7154N(event.getX(), event.getY());
        if (interfaceC8055cM7154N != null) {
            ArrayList arrayList2 = this.f8254E;
            arrayList2.clear();
            arrayList2.add(interfaceC8055cM7154N);
            ArrayList arrayList3 = this.f8255F;
            arrayList3.clear();
            C9998a c9998aM7085i5 = m7085i();
            if (c9998aM7085i5 == null || (matrix3 = c9998aM7085i5.m17344b()) == null) {
                matrix3 = new Matrix();
            }
            arrayList3.add(interfaceC8055cM7154N.mo12799i(matrix3));
            InterfaceC0039c interfaceC0039cM7083g7 = m7083g();
            if (interfaceC0039cM7083g7 != null) {
                interfaceC0039cM7083g7.mo201d();
            }
            m7159S(this.f8255F);
        }
    }

    /* renamed from: J */
    public final float m7150J(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: K */
    public final float m7151K(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m7150J(f12 - f10, f13 - f11) - m7150J(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: L */
    public final boolean m7152L(int i9) {
        return ((((double) ((i9 >> 16) & 255)) * 0.299d) + (((double) ((i9 >> 8) & 255)) * 0.578d)) + (((double) (i9 & 255)) * 0.114d) >= 192.0d;
    }

    /* renamed from: M */
    public final void m7153M(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: N */
    public final InterfaceC8055c m7154N(float f10, float f11) {
        InterfaceC8055c interfaceC8055cMo210m;
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        List listMo12796e = (interfaceC0039cM7083g == null || (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) == null) ? null : interfaceC8055cMo210m.mo12796e();
        if (listMo12796e != null && !listMo12796e.isEmpty()) {
            int size = listMo12796e.size();
            do {
                size--;
                if (-1 < size) {
                }
            } while (!((InterfaceC8055c) listMo12796e.get(size)).isInRect(f10, f11, 0.0f));
            return (InterfaceC8055c) listMo12796e.get(size);
        }
        return null;
    }

    /* renamed from: O */
    public final ArrayList m7155O() {
        return this.f8254E;
    }

    /* renamed from: P */
    public final ArrayList m7156P() {
        return this.f8255F;
    }

    /* renamed from: Q */
    public final void m7157Q(float f10, float f11) {
        PointF pointFM7149v = m7149v(f10, f11);
        C9696o c9696o = C9696o.f17133a;
        RectF rectF = this.f8253D;
        Intrinsics.checkNotNull(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f8253D;
        Intrinsics.checkNotNull(rectF2);
        PointF pointFM16206d = c9696o.m16206d(fCenterX, rectF2.centerY(), this.f8252C);
        this.f8251B.setRotate((float) Math.toDegrees(m7150J(pointFM7149v.x - pointFM16206d.x, pointFM7149v.y - pointFM16206d.y) - m7150J(this.f8261u - pointFM16206d.x, this.f8262v - pointFM16206d.y)), pointFM16206d.x, pointFM16206d.y);
    }

    /* renamed from: R */
    public final void m7158R(float f10, float f11) {
        PointF pointFM7149v = m7149v(f10, f11);
        C9696o c9696o = C9696o.f17133a;
        RectF rectF = this.f8253D;
        Intrinsics.checkNotNull(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.f8253D;
        Intrinsics.checkNotNull(rectF2);
        PointF pointFM16206d = c9696o.m16206d(fCenterX, rectF2.centerY(), this.f8252C);
        RectF rectF3 = this.f8253D;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.right;
        RectF rectF4 = this.f8253D;
        Intrinsics.checkNotNull(rectF4);
        PointF pointFM16206d2 = c9696o.m16206d(f12, rectF4.bottom, this.f8252C);
        float fM7151K = m7151K(pointFM16206d.x, pointFM16206d.y, pointFM16206d2.x, pointFM16206d2.y, this.f8261u, this.f8262v, pointFM7149v.x, pointFM7149v.y);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM16206d.x - pointFM16206d2.x, d10)) + ((float) Math.pow(pointFM16206d.y - pointFM16206d2.y, d10)));
        float f13 = fM7151K + fSqrt;
        if (f13 > ((float) Math.sqrt(((float) Math.pow(this.f8266z + 10, d10)) * 2))) {
            float f14 = f13 / fSqrt;
            this.f8251B.setScale(f14, f14, pointFM16206d.x, pointFM16206d.y);
        }
    }

    /* renamed from: S */
    public final void m7159S(List list) {
        RectF rectF = new RectF();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7153M((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            this.f8253D = null;
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo201d();
                return;
            }
            return;
        }
        float f10 = 10;
        float fWidth = (this.f8266z + f10) - rectF.width();
        float fHeight = (this.f8266z + f10) - rectF.height();
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
        this.f8253D = rectF;
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            RectF rectF2 = this.f8253D;
            Intrinsics.checkNotNull(rectF2);
            interfaceC0039cM7083g2.mo220w(rectF2, this.f8251B, this.f8265y, this.f8266z, true);
        }
    }

    /* renamed from: T */
    public final void m7160T(float f10, float f11) {
        PointF pointFM7149v = m7149v(f10, f11);
        this.f8251B.setTranslate(pointFM7149v.x - this.f8261u, pointFM7149v.y - this.f8262v);
    }

    /* renamed from: U */
    public final boolean m7161U(PointF pointF) {
        if (this.f8253D == null) {
            return false;
        }
        float fMapRadius = (this.f8266z / 2) / this.f8252C.mapRadius(1.0f);
        RectF rectF = this.f8253D;
        Intrinsics.checkNotNull(rectF);
        float f10 = rectF.left - fMapRadius;
        RectF rectF2 = this.f8253D;
        Intrinsics.checkNotNull(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f8253D;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.left + fMapRadius;
        RectF rectF4 = this.f8253D;
        Intrinsics.checkNotNull(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f8253D;
        Intrinsics.checkNotNull(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f8253D;
        Intrinsics.checkNotNull(rectF7);
        float f14 = rectF7.top - fMapRadius;
        RectF rectF8 = this.f8253D;
        Intrinsics.checkNotNull(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f8253D;
        Intrinsics.checkNotNull(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.top + fMapRadius);
        RectF rectF11 = this.f8253D;
        Intrinsics.checkNotNull(rectF11);
        float f16 = rectF11.right - fMapRadius;
        RectF rectF12 = this.f8253D;
        Intrinsics.checkNotNull(rectF12);
        float f17 = rectF12.bottom - fMapRadius;
        RectF rectF13 = this.f8253D;
        Intrinsics.checkNotNull(rectF13);
        float f18 = rectF13.right + fMapRadius;
        RectF rectF14 = this.f8253D;
        Intrinsics.checkNotNull(rectF14);
        RectF rectF15 = new RectF(f16, f17, f18, rectF14.bottom + fMapRadius);
        C9696o c9696o = C9696o.f17133a;
        if (c9696o.m16205c(rectF5, this.f8252C, pointF)) {
            this.f8250A = TranslationType.ROTATE.getValue();
            return true;
        }
        if (c9696o.m16205c(rectF10, this.f8252C, pointF)) {
            this.f8250A = TranslationType.DELETE.getValue();
            return true;
        }
        if (c9696o.m16205c(rectF15, this.f8252C, pointF)) {
            this.f8250A = TranslationType.SCALE.getValue();
            return true;
        }
        RectF rectF16 = this.f8253D;
        Intrinsics.checkNotNull(rectF16);
        if (!c9696o.m16205c(rectF16, this.f8252C, pointF)) {
            return false;
        }
        this.f8250A = TranslationType.TRANSLATE.getValue();
        return true;
    }

    /* renamed from: V */
    public final boolean m7162V(float f10, float f11) {
        PointF pointFM7149v = m7149v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM7149v.x - this.f8261u), d10)) + ((float) Math.pow((double) (pointFM7149v.y - this.f8262v), d10))))) > this.f8259s;
    }

    /* renamed from: W */
    public void m7163W() {
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            this.f8264x.setColor(m7152L(interfaceC0039cM7083g.getBackgroundColor()) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
            this.f8265y.setColor(m7152L(interfaceC0039cM7083g.getBackgroundColor()) ? -12085261 : -3355444);
        }
        this.f8251B.reset();
        this.f8263w.reset();
        this.f8256p.clear();
        this.f8261u = 0.0f;
        this.f8262v = 0.0f;
    }
}
