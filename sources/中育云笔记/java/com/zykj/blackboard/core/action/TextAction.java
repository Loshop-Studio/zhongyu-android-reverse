package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.zykj.blackboard.enums.TextActionType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10217e;
import ma.InterfaceC10222j;
import na.AbstractC10351n;
import na.C10346i;
import na.C10352o;
import na.C10357t;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p307q9.C10762b;
import p309qc.C10786q;
import p310qd.AbstractC10797e0;
import p322r9.InterfaceC10918b;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public final class TextAction extends AbstractC8326b {

    /* renamed from: K */
    public boolean f17844K;

    /* renamed from: p */
    public boolean f17845p;

    /* renamed from: s */
    public long f17848s;

    /* renamed from: t */
    public float f17849t;

    /* renamed from: u */
    public float f17850u;

    /* renamed from: v */
    public float f17851v;

    /* renamed from: w */
    public float f17852w;

    /* renamed from: x */
    public float f17853x;

    /* renamed from: y */
    public C5414d f17854y;

    /* renamed from: z */
    public RectF f17855z;

    /* renamed from: q */
    public final float f17846q = 30.0f;

    /* renamed from: r */
    public final int f17847r = 500;

    /* renamed from: A */
    public Matrix f17834A = new Matrix();

    /* renamed from: B */
    public Matrix f17835B = new Matrix();

    /* renamed from: C */
    public Paint f17836C = new Paint();

    /* renamed from: D */
    public final float f17837D = 50.0f;

    /* renamed from: E */
    public int f17838E = -1;

    /* renamed from: F */
    public boolean f17839F = true;

    /* renamed from: G */
    public Paint f17840G = new Paint();

    /* renamed from: H */
    public Matrix f17841H = new Matrix();

    /* renamed from: I */
    public ArrayList f17842I = new ArrayList();

    /* renamed from: J */
    public String f17843J = "";

    public TextAction() {
        this.f17836C.setColor(-4276546);
        this.f17836C.setStrokeWidth(2.0f);
        this.f17836C.setStyle(Paint.Style.STROKE);
        this.f17836C.setDither(true);
        this.f17836C.setAntiAlias(true);
        this.f17840G.setColor(-12085261);
        this.f17840G.setStyle(Paint.Style.FILL);
        this.f17840G.setTextSize(40.0f);
        this.f17840G.setDither(true);
        this.f17840G.setAntiAlias(true);
        C10346i.f24652a.m21641c(EventKey.TEXT_ACTION_SELECTED_CANCEL, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.TextAction.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33996invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33996invoke() {
                TextAction.this.m13833j0();
            }
        });
    }

    /* renamed from: U */
    private final float m13815U(float f10, float f11) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: W */
    private final float m13816W(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m13815U(f12 - f10, f13 - f11) - m13815U(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: f0 */
    private final boolean m13817f0(PointF pointF) {
        if (this.f17855z == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f17834A);
        matrix.postConcat(this.f17835B);
        float fMapRadius = (this.f17837D / 2) / matrix.mapRadius(1.0f);
        RectF rectF = this.f17855z;
        AbstractC9979u.m20291d(rectF);
        float f10 = rectF.right - fMapRadius;
        RectF rectF2 = this.f17855z;
        AbstractC9979u.m20291d(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f17855z;
        AbstractC9979u.m20291d(rectF3);
        float f12 = rectF3.right + fMapRadius;
        RectF rectF4 = this.f17855z;
        AbstractC9979u.m20291d(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f17855z;
        AbstractC9979u.m20291d(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f17855z;
        AbstractC9979u.m20291d(rectF7);
        float f14 = rectF7.bottom - fMapRadius;
        RectF rectF8 = this.f17855z;
        AbstractC9979u.m20291d(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f17855z;
        AbstractC9979u.m20291d(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.bottom + fMapRadius);
        C10352o c10352o = C10352o.f24660a;
        if (c10352o.m21670c(rectF5, matrix, pointF)) {
            this.f17838E = TextActionType.DELETE.m14631c();
            return true;
        }
        if (c10352o.m21670c(rectF10, matrix, pointF)) {
            this.f17838E = TextActionType.SCALE.m14631c();
            return true;
        }
        RectF rectF11 = this.f17855z;
        AbstractC9979u.m20291d(rectF11);
        if (!c10352o.m21670c(rectF11, matrix, pointF)) {
            return false;
        }
        this.f17838E = TextActionType.TRANSLATE.m14631c();
        return true;
    }

    /* renamed from: h0 */
    private final boolean m13818h0(float f10, float f11) {
        PointF pointFM13819v = m13819v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM13819v.x - this.f17851v), d10)) + ((float) Math.pow((double) (pointFM13819v.y - this.f17852w), d10))))) > this.f17846q;
    }

    /* renamed from: v */
    private final PointF m13819v(float f10, float f11) {
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25447g();
        }
        m13833j0();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(EzyTouchEvent.TouchEvent event) {
        InterfaceC11552c interfaceC11552cM13725g;
        AbstractC9979u.m20294g(event, "event");
        this.f17845p = false;
        PointF pointFM13819v = m13819v(event.getX(), event.getY());
        this.f17851v = pointFM13819v.x;
        this.f17852w = pointFM13819v.y;
        boolean zM13817f0 = m13817f0(new PointF(this.f17851v, this.f17852w));
        this.f17839F = zM13817f0;
        if (zM13817f0) {
            int i10 = this.f17838E;
            if (i10 == TextActionType.TRANSLATE.m14631c()) {
                InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
                if (interfaceC11552cM13725g2 != null) {
                    ArrayList arrayList = new ArrayList();
                    C5414d c5414d = this.f17854y;
                    if (c5414d != null) {
                        arrayList.add(c5414d);
                    }
                    interfaceC11552cM13725g2.mo25464x(arrayList);
                    return;
                }
                return;
            }
            if (i10 == TextActionType.SCALE.m14631c()) {
                Matrix matrix = this.f17834A;
                RectF rectF = this.f17855z;
                AbstractC9979u.m20291d(rectF);
                this.f17853x = matrix.mapRadius(rectF.width());
                C5414d c5414d2 = this.f17854y;
                if (c5414d2 == null || (interfaceC11552cM13725g = m13725g()) == null) {
                    return;
                }
                interfaceC11552cM13725g.mo25415A(c5414d2);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(EzyTouchEvent.TouchEvent event) {
        C5414d c5414d;
        AbstractC9979u.m20294g(event, "event");
        if (m13818h0(event.getX(), event.getY())) {
            this.f17845p = true;
        }
        if (this.f17839F) {
            int i10 = this.f17838E;
            if (i10 != TextActionType.TRANSLATE.m14631c()) {
                if (i10 != TextActionType.SCALE.m14631c() || (c5414d = this.f17854y) == null) {
                    return;
                }
                m13827b0(c5414d, event.getX(), event.getY());
                InterfaceC11552c interfaceC11552cM13725g = m13725g();
                if (interfaceC11552cM13725g != null) {
                    interfaceC11552cM13725g.mo25449i(c5414d, this.f17855z, this.f17834A);
                    return;
                }
                return;
            }
            Matrix matrixM13830e0 = m13830e0(event.getX(), event.getY());
            InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
            if (interfaceC11552cM13725g2 != null) {
                ArrayList arrayList = new ArrayList();
                C5414d c5414d2 = this.f17854y;
                if (c5414d2 != null) {
                    arrayList.add(c5414d2);
                }
                interfaceC11552cM13725g2.mo25451k(arrayList, matrixM13830e0);
            }
            this.f17842I.add(AbstractC10351n.m21664f(matrixM13830e0, System.currentTimeMillis()));
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(EzyTouchEvent.TouchEvent event) {
        InterfaceC5181c interfaceC5181cMo25454n;
        C5414d c5414d;
        AbstractC9979u.m20294g(event, "event");
        List listMo2717f = null;
        if (this.f17839F) {
            if (m13831g0(event.getX(), event.getY())) {
                m13829d0(event.getX(), event.getY(), false);
            } else if (this.f17845p) {
                int i10 = this.f17838E;
                if (i10 == TextActionType.TRANSLATE.m14631c()) {
                    this.f17835B.postConcat(this.f17841H);
                    Matrix matrixM13830e0 = m13830e0(event.getX(), event.getY());
                    ArrayList arrayList = new ArrayList();
                    C5414d c5414d2 = this.f17854y;
                    if (c5414d2 != null) {
                        arrayList.add(c5414d2);
                    }
                    InterfaceC11552c interfaceC11552cM13725g = m13725g();
                    if (interfaceC11552cM13725g != null) {
                        interfaceC11552cM13725g.mo25466z(arrayList, matrixM13830e0);
                    }
                    this.f17842I.add(AbstractC10351n.m21664f(matrixM13830e0, System.currentTimeMillis()));
                    InterfaceC10918b interfaceC10918bM13726h = m13726h();
                    if (interfaceC10918bM13726h != null) {
                        interfaceC10918bM13726h.mo23763c(arrayList, this.f17842I);
                    }
                    InterfaceC10918b interfaceC10918bM13726h2 = m13726h();
                    if (interfaceC10918bM13726h2 != null) {
                        interfaceC10918bM13726h2.mo23772l();
                    }
                } else if (i10 == TextActionType.SCALE.m14631c() && (c5414d = this.f17854y) != null) {
                    m13827b0(c5414d, event.getX(), event.getY());
                    InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
                    if (interfaceC11552cM13725g2 != null) {
                        interfaceC11552cM13725g2.mo25461u(c5414d, this.f17855z, this.f17834A);
                    }
                    InterfaceC10918b interfaceC10918bM13726h3 = m13726h();
                    if (interfaceC10918bM13726h3 != null) {
                        InterfaceC10918b.a.m23785a(interfaceC10918bM13726h3, c5414d, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c5414d.mo2718g(), null, null, null, null, null, 248, null);
                    }
                    InterfaceC10918b interfaceC10918bM13726h4 = m13726h();
                    if (interfaceC10918bM13726h4 != null) {
                        interfaceC10918bM13726h4.mo23772l();
                    }
                }
            } else {
                if (this.f17838E == TextActionType.DELETE.m14631c()) {
                    ArrayList arrayList2 = new ArrayList();
                    C5414d c5414d3 = this.f17854y;
                    if (c5414d3 != null) {
                        arrayList2.add(c5414d3);
                    }
                    InterfaceC11552c interfaceC11552cM13725g3 = m13725g();
                    if (interfaceC11552cM13725g3 != null) {
                        interfaceC11552cM13725g3.mo25456p(arrayList2);
                    }
                    m13833j0();
                    InterfaceC10918b interfaceC10918bM13726h5 = m13726h();
                    if (interfaceC10918bM13726h5 != null) {
                        interfaceC10918bM13726h5.mo23775o(arrayList2, System.currentTimeMillis());
                    }
                    InterfaceC10918b interfaceC10918bM13726h6 = m13726h();
                    if (interfaceC10918bM13726h6 != null) {
                        interfaceC10918bM13726h6.mo23772l();
                    }
                }
                InterfaceC11552c interfaceC11552cM13725g4 = m13725g();
                if (interfaceC11552cM13725g4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C5414d c5414d4 = this.f17854y;
                    if (c5414d4 != null) {
                        arrayList3.add(c5414d4);
                    }
                    interfaceC11552cM13725g4.mo25466z(arrayList3, null);
                }
            }
        } else {
            if (this.f17845p) {
                return;
            }
            this.f17854y = null;
            InterfaceC11552c interfaceC11552cM13725g5 = m13725g();
            if (interfaceC11552cM13725g5 != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g5.mo25454n()) != null) {
                listMo2717f = interfaceC5181cMo25454n.mo2717f();
            }
            List list = listMo2717f;
            if (list != null && !list.isEmpty()) {
                int size = listMo2717f.size() - 1;
                while (true) {
                    if (-1 < size) {
                        if ((listMo2717f.get(size) instanceof C5414d) && ((InterfaceC5181c) listMo2717f.get(size)).mo2715d().contains(event.getX(), event.getY())) {
                            Object obj = listMo2717f.get(size);
                            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                            this.f17854y = (C5414d) obj;
                            break;
                        }
                        size--;
                    } else {
                        break;
                    }
                }
            }
            C5414d c5414d5 = this.f17854y;
            if (c5414d5 != null) {
                AbstractC9979u.m20291d(c5414d5);
                m13834k0(c5414d5);
            } else if (this.f17855z == null) {
                m13829d0(event.getX(), event.getY(), true);
            } else {
                m13833j0();
            }
        }
        if (this.f17845p) {
            return;
        }
        PointF pointFM13819v = m13819v(event.getX(), event.getY());
        this.f17849t = pointFM13819v.x;
        this.f17850u = pointFM13819v.y;
        this.f17848s = System.currentTimeMillis();
    }

    /* renamed from: S */
    public final void m13820S(InterfaceC5181c interfaceC5181c) {
        Matrix matrixM25311b;
        if (this.f17855z == null) {
            this.f17855z = new RectF();
        }
        RectF rectF = this.f17855z;
        AbstractC9979u.m20291d(rectF);
        rectF.set(interfaceC5181c.mo2718g());
        Matrix matrix = this.f17834A;
        matrix.reset();
        matrix.postConcat(interfaceC5181c.mo2714b());
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
            matrix.postConcat(matrixM25311b);
        }
        this.f17835B.reset();
    }

    /* renamed from: T */
    public final C5414d m13821T(RectF rectF, float f10, float f11, String str) {
        C5414d c5414d = new C5414d("", new RectF(rectF), null, null, null, 28, null);
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        C11373a c11373aM13727i = m13727i();
        Matrix matrixM25311b = c11373aM13727i != null ? c11373aM13727i.m25311b() : null;
        AbstractC9979u.m20291d(matrixM25311b);
        matrix.postConcat(AbstractC10351n.m21660b(matrixM25311b));
        c5414d.mo2716e(matrix);
        c5414d.m2880H(this.f17840G);
        c5414d.m2879G(str);
        return c5414d;
    }

    /* renamed from: V */
    public final RectF m13822V(String str, Paint paint, RectF rectF) {
        RectF rectFM22892f;
        RectF rectFM22892f2;
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C10357t.f24666a.m21684a(str, paint, rectF.width()).size();
        C10762b c10762bM13724f = m13724f();
        float fHeight = 0.0f;
        if (size > ((c10762bM13724f == null || (rectFM22892f2 = c10762bM13724f.m22892f()) == null) ? 0.0f : rectFM22892f2.height())) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        C10762b c10762bM13724f2 = m13724f();
        if (c10762bM13724f2 != null && (rectFM22892f = c10762bM13724f2.m22892f()) != null) {
            fHeight = rectFM22892f.height();
        }
        rectF.bottom = fHeight + rectF.top;
        return rectF;
    }

    /* renamed from: X */
    public final C5414d m13823X() {
        return this.f17854y;
    }

    /* renamed from: Y */
    public final RectF m13824Y() {
        return this.f17855z;
    }

    /* renamed from: Z */
    public final Matrix m13825Z() {
        return this.f17834A;
    }

    /* renamed from: a0 */
    public final Matrix m13826a0(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        matrix2.postConcat(c11373aM13727i.m25311b());
        matrix2.postConcat(matrix);
        C11373a c11373aM13727i2 = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i2);
        matrix2.postConcat(AbstractC10351n.m21660b(c11373aM13727i2.m25311b()));
        return matrix2;
    }

    /* renamed from: b0 */
    public final void m13827b0(C5414d c5414d, float f10, float f11) {
        Matrix matrixM25311b;
        PointF pointFM13819v = m13819v(f10, f11);
        Matrix matrix = new Matrix();
        matrix.postConcat(c5414d.mo2714b());
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
            matrix.postConcat(matrixM25311b);
        }
        C10352o c10352o = C10352o.f24660a;
        PointF pointFM21671d = c10352o.m21671d(c5414d.mo2718g().left, c5414d.mo2718g().bottom, matrix);
        PointF pointFM21671d2 = c10352o.m21671d(c5414d.mo2718g().right, c5414d.mo2718g().bottom, matrix);
        float fM13816W = this.f17853x + m13816W(pointFM21671d.x, pointFM21671d.y, pointFM21671d2.x, pointFM21671d2.y, this.f17851v, this.f17852w, pointFM13819v.x, pointFM13819v.y);
        Paint paintM2878F = c5414d.m2878F();
        AbstractC9979u.m20291d(paintM2878F);
        String strM2877E = c5414d.m2877E();
        AbstractC9979u.m20291d(strM2877E);
        float fMapRadius = matrix.mapRadius(paintM2878F.measureText(String.valueOf(AbstractC10797e0.m23170g1(strM2877E))));
        if (fM13816W <= this.f17837D + 10 || fM13816W <= fMapRadius) {
            return;
        }
        float fMapRadius2 = AbstractC10351n.m21660b(matrix).mapRadius(fM13816W);
        RectF rectF = new RectF(c5414d.mo2718g());
        rectF.right = rectF.left + fMapRadius2;
        String strM2877E2 = c5414d.m2877E();
        if (strM2877E2 == null) {
            strM2877E2 = "";
        }
        Paint paintM2878F2 = c5414d.m2878F();
        AbstractC9979u.m20291d(paintM2878F2);
        m13822V(strM2877E2, paintM2878F2, rectF);
        c5414d.mo2875p(rectF);
        m13820S(c5414d);
    }

    /* renamed from: c0 */
    public final void m13828c0(boolean z10, RectF rectF, float f10, float f11, String str) {
        String str2;
        if (z10) {
            InterfaceC10918b interfaceC10918bM13726h = m13726h();
            if (interfaceC10918bM13726h != null) {
                interfaceC10918bM13726h.mo23771k(rectF.width(), rectF.height(), f10, f11, this.f17840G, str, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextConfirm$1
                    {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m13835a(InterfaceC5181c it) {
                        AbstractC9979u.m20294g(it, "it");
                        InterfaceC11552c interfaceC11552cM13725g = this.f17857c.m13725g();
                        if (interfaceC11552cM13725g != null) {
                            InterfaceC11552c interfaceC11552cM13725g2 = this.f17857c.m13725g();
                            interfaceC11552cM13725g.mo25446f(interfaceC11552cM13725g2 != null ? interfaceC11552cM13725g2.mo25442b() : null, it);
                        }
                        this.f17857c.f17854y = (C5414d) it;
                        TextAction textAction = this.f17857c;
                        C5414d c5414dM13823X = textAction.m13823X();
                        AbstractC9979u.m20291d(c5414dM13823X);
                        textAction.m13834k0(c5414dM13823X);
                        InterfaceC10918b interfaceC10918bM13726h2 = this.f17857c.m13726h();
                        if (interfaceC10918bM13726h2 != null) {
                            interfaceC10918bM13726h2.mo23772l();
                        }
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m13835a((InterfaceC5181c) obj);
                        return C10786q.f26013a;
                    }
                });
                return;
            }
            return;
        }
        if (this.f17854y != null) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                C5414d c5414d = this.f17854y;
                AbstractC9979u.m20291d(c5414d);
                String id2 = c5414d.getId();
                C5414d c5414d2 = this.f17854y;
                AbstractC9979u.m20291d(c5414d2);
                Paint paintM2878F = c5414d2.m2878F();
                AbstractC9979u.m20291d(paintM2878F);
                C5414d c5414d3 = this.f17854y;
                AbstractC9979u.m20291d(c5414d3);
                str2 = str;
                interfaceC11552cM13725g.mo25417C(id2, str2, paintM2878F, c5414d3.mo2718g());
            } else {
                str2 = str;
            }
            InterfaceC10918b interfaceC10918bM13726h2 = m13726h();
            if (interfaceC10918bM13726h2 != null) {
                C5414d c5414d4 = this.f17854y;
                AbstractC9979u.m20291d(c5414d4);
                InterfaceC10918b.a.m23785a(interfaceC10918bM13726h2, c5414d4, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, str2, null, null, null, null, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, null);
            }
            InterfaceC10918b interfaceC10918bM13726h3 = m13726h();
            if (interfaceC10918bM13726h3 != null) {
                interfaceC10918bM13726h3.mo23772l();
            }
        }
    }

    /* renamed from: d0 */
    public final void m13829d0(float f10, float f11, final boolean z10) {
        final C5414d c5414dM13821T;
        if (this.f17844K) {
            return;
        }
        this.f17844K = true;
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f != null) {
            final PointF pointFM13819v = m13819v(f10, f11);
            if (z10 || (c5414dM13821T = this.f17854y) == null) {
                c5414dM13821T = m13821T(c10762bM13724f.m22892f(), pointFM13819v.x, pointFM13819v.y, c10762bM13724f.m22883a());
            } else {
                AbstractC9979u.m20291d(c5414dM13821T);
            }
            m13820S(c5414dM13821T);
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25445e();
            }
            InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
            if (interfaceC11552cM13725g2 != null) {
                RectF rectF = this.f17855z;
                AbstractC9979u.m20291d(rectF);
                interfaceC11552cM13725g2.mo25465y(rectF, this.f17834A, this.f17836C, this.f17837D, false);
            }
            InterfaceC11552c interfaceC11552cM13725g3 = m13725g();
            if (interfaceC11552cM13725g3 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c5414dM13821T);
                interfaceC11552cM13725g3.mo25450j(arrayList);
            }
            String strM2877E = c5414dM13821T.m2877E();
            if (strM2877E == null) {
                strM2877E = "";
            }
            this.f17843J = strM2877E;
            InterfaceC10222j interfaceC10222jM22867K = c10762bM13724f.m22867K();
            if (interfaceC10222jM22867K != null) {
                String strM2877E2 = c5414dM13821T.m2877E();
                interfaceC10222jM22867K.mo16800a(strM2877E2 != null ? strM2877E2 : "", new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(String it) {
                        AbstractC9979u.m20294g(it, "it");
                        TextAction textAction = this.f17858c;
                        Paint paintM2878F = c5414dM13821T.m2878F();
                        AbstractC9979u.m20291d(paintM2878F);
                        RectF rectFM13822V = textAction.m13822V(it, paintM2878F, new RectF(c5414dM13821T.mo2718g()));
                        if (!AbstractC9979u.m20289b(rectFM13822V, c5414dM13821T.mo2718g())) {
                            c5414dM13821T.mo2875p(rectFM13822V);
                        }
                        c5414dM13821T.m2879G(it);
                        this.f17858c.m13820S(c5414dM13821T);
                        InterfaceC11552c interfaceC11552cM13725g4 = this.f17858c.m13725g();
                        if (interfaceC11552cM13725g4 != null) {
                            RectF rectFM13824Y = this.f17858c.m13824Y();
                            AbstractC9979u.m20291d(rectFM13824Y);
                            interfaceC11552cM13725g4.mo25465y(rectFM13824Y, this.f17858c.m13825Z(), this.f17858c.f17836C, this.f17858c.f17837D, false);
                        }
                        InterfaceC11552c interfaceC11552cM13725g5 = this.f17858c.m13725g();
                        if (interfaceC11552cM13725g5 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c5414dM13821T);
                            interfaceC11552cM13725g5.mo25450j(arrayList2);
                        }
                    }
                }, new InterfaceC9540l() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(String it) {
                        AbstractC9979u.m20294g(it, "it");
                        TextAction textAction = this.f17860c;
                        boolean z11 = z10;
                        RectF rectFMo2718g = c5414dM13821T.mo2718g();
                        PointF pointF = pointFM13819v;
                        textAction.m13828c0(z11, rectFMo2718g, pointF.x, pointF.y, it);
                        this.f17860c.f17844K = false;
                    }
                }, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m33997invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m33997invoke() {
                        c5414dM13821T.m2879G(this.f17843J);
                        this.m13833j0();
                        InterfaceC11552c interfaceC11552cM13725g4 = this.m13725g();
                        if (interfaceC11552cM13725g4 != null) {
                            interfaceC11552cM13725g4.mo25447g();
                        }
                        this.f17844K = false;
                    }
                });
            }
        }
    }

    /* renamed from: e0 */
    public final Matrix m13830e0(float f10, float f11) {
        PointF pointFM13819v = m13819v(f10, f11);
        this.f17841H.setTranslate(pointFM13819v.x - this.f17851v, pointFM13819v.y - this.f17852w);
        return m13826a0(this.f17841H);
    }

    /* renamed from: g0 */
    public final boolean m13831g0(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f17845p) {
            PointF pointFM13819v = m13819v(f10, f11);
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM13819v.x - this.f17849t, d10)) + ((float) Math.pow(pointFM13819v.y - this.f17850u, d10)));
            if (jCurrentTimeMillis - this.f17848s < this.f17847r && fSqrt < this.f17846q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public void m13832i0() {
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f != null) {
            this.f17840G.setColor(c10762bM13724f.m22884b());
            this.f17840G.setTextSize(c10762bM13724f.m22890e());
        }
        this.f17842I.clear();
    }

    /* renamed from: j0 */
    public final void m13833j0() {
        InterfaceC10217e interfaceC10217eMo23764d;
        if (this.f17854y == null && this.f17855z == null) {
            return;
        }
        this.f17854y = null;
        this.f17855z = null;
        this.f17834A.reset();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25445e();
        }
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h == null || (interfaceC10217eMo23764d = interfaceC10918bM13726h.mo23764d()) == null) {
            return;
        }
        interfaceC10217eMo23764d.mo19974b();
    }

    /* renamed from: k0 */
    public final void m13834k0(C5414d c5414d) {
        InterfaceC10217e interfaceC10217eMo23764d;
        m13820S(c5414d);
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            RectF rectF = this.f17855z;
            AbstractC9979u.m20291d(rectF);
            interfaceC11552cM13725g.mo25465y(rectF, this.f17834A, this.f17836C, this.f17837D, false);
        }
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h == null || (interfaceC10217eMo23764d = interfaceC10918bM13726h.mo23764d()) == null) {
            return;
        }
        Paint paintM2878F = c5414d.m2878F();
        AbstractC9979u.m20291d(paintM2878F);
        int color = paintM2878F.getColor();
        Paint paintM2878F2 = c5414d.m2878F();
        AbstractC9979u.m20291d(paintM2878F2);
        interfaceC10217eMo23764d.mo19975c(color, paintM2878F2.getTextSize());
    }
}
