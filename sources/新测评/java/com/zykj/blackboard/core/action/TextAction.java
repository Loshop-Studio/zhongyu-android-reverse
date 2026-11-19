package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.enums.TextActionType;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035c5.InterfaceC5123f;
import p066d5.InterfaceC7291c;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7353n;
import p077e5.C7358s;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* loaded from: classes4.dex */
public final class TextAction extends AbstractC6626b {

    /* renamed from: K */
    public boolean f6995K;

    /* renamed from: p */
    public boolean f6996p;

    /* renamed from: s */
    public long f6999s;

    /* renamed from: t */
    public float f7000t;

    /* renamed from: u */
    public float f7001u;

    /* renamed from: v */
    public float f7002v;

    /* renamed from: w */
    public float f7003w;

    /* renamed from: x */
    public float f7004x;

    /* renamed from: y */
    public C9008d f7005y;

    /* renamed from: z */
    public RectF f7006z;

    /* renamed from: q */
    public final float f6997q = 30.0f;

    /* renamed from: r */
    public final int f6998r = 500;

    /* renamed from: A */
    public Matrix f6985A = new Matrix();

    /* renamed from: B */
    public Matrix f6986B = new Matrix();

    /* renamed from: C */
    public Paint f6987C = new Paint();

    /* renamed from: D */
    public final float f6988D = 50.0f;

    /* renamed from: E */
    public int f6989E = -1;

    /* renamed from: F */
    public boolean f6990F = true;

    /* renamed from: G */
    public Paint f6991G = new Paint();

    /* renamed from: H */
    public Matrix f6992H = new Matrix();

    /* renamed from: I */
    public ArrayList f6993I = new ArrayList();

    /* renamed from: J */
    public String f6994J = "";

    public TextAction() {
        this.f6987C.setColor(-4276546);
        this.f6987C.setStrokeWidth(2.0f);
        this.f6987C.setStyle(Paint.Style.STROKE);
        this.f6987C.setDither(true);
        this.f6987C.setAntiAlias(true);
        this.f6991G.setColor(-12085261);
        this.f6991G.setStyle(Paint.Style.FILL);
        this.f6991G.setTextSize(40.0f);
        this.f6991G.setDither(true);
        this.f6991G.setAntiAlias(true);
        C7347h.f11914a.m11759c(EventKey.TEXT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.TextAction.1
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
                TextAction.this.m6096j0();
            }
        });
    }

    /* renamed from: U */
    private final float m6078U(float f10, float f11) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: W */
    private final float m6079W(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m6078U(f12 - f10, f13 - f11) - m6078U(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: f0 */
    private final boolean m6080f0(PointF pointF) {
        if (this.f7006z == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f6985A);
        matrix.postConcat(this.f6986B);
        float fMapRadius = (this.f6988D / 2) / matrix.mapRadius(1.0f);
        RectF rectF = this.f7006z;
        Intrinsics.checkNotNull(rectF);
        float f10 = rectF.right - fMapRadius;
        RectF rectF2 = this.f7006z;
        Intrinsics.checkNotNull(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f7006z;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.right + fMapRadius;
        RectF rectF4 = this.f7006z;
        Intrinsics.checkNotNull(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f7006z;
        Intrinsics.checkNotNull(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f7006z;
        Intrinsics.checkNotNull(rectF7);
        float f14 = rectF7.bottom - fMapRadius;
        RectF rectF8 = this.f7006z;
        Intrinsics.checkNotNull(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f7006z;
        Intrinsics.checkNotNull(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.bottom + fMapRadius);
        C7353n c7353n = C7353n.f11920a;
        if (c7353n.m11782c(rectF5, matrix, pointF)) {
            this.f6989E = TextActionType.DELETE.getValue();
            return true;
        }
        if (c7353n.m11782c(rectF10, matrix, pointF)) {
            this.f6989E = TextActionType.SCALE.getValue();
            return true;
        }
        RectF rectF11 = this.f7006z;
        Intrinsics.checkNotNull(rectF11);
        if (!c7353n.m11782c(rectF11, matrix, pointF)) {
            return false;
        }
        this.f6989E = TextActionType.TRANSLATE.getValue();
        return true;
    }

    /* renamed from: h0 */
    private final boolean m6081h0(float f10, float f11) {
        PointF pointFM6082v = m6082v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM6082v.x - this.f7002v), d10)) + ((float) Math.pow((double) (pointFM6082v.y - this.f7003w), d10))))) > this.f6997q;
    }

    /* renamed from: v */
    private final PointF m6082v(float f10, float f11) {
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13440e();
        }
        m6096j0();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(EzyTouchEvent.TouchEvent event) {
        InterfaceC7880c interfaceC7880cM5988g;
        Intrinsics.checkNotNullParameter(event, "event");
        this.f6996p = false;
        PointF pointFM6082v = m6082v(event.getX(), event.getY());
        this.f7002v = pointFM6082v.x;
        this.f7003w = pointFM6082v.y;
        boolean zM6080f0 = m6080f0(new PointF(this.f7002v, this.f7003w));
        this.f6990F = zM6080f0;
        if (zM6080f0) {
            int i10 = this.f6989E;
            if (i10 == TextActionType.TRANSLATE.getValue()) {
                InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
                if (interfaceC7880cM5988g2 != null) {
                    ArrayList arrayList = new ArrayList();
                    C9008d c9008d = this.f7005y;
                    if (c9008d != null) {
                        arrayList.add(c9008d);
                    }
                    interfaceC7880cM5988g2.mo13457v(arrayList);
                    return;
                }
                return;
            }
            if (i10 == TextActionType.SCALE.getValue()) {
                Matrix matrix = this.f6985A;
                RectF rectF = this.f7006z;
                Intrinsics.checkNotNull(rectF);
                this.f7004x = matrix.mapRadius(rectF.width());
                C9008d c9008d2 = this.f7005y;
                if (c9008d2 == null || (interfaceC7880cM5988g = m5988g()) == null) {
                    return;
                }
                interfaceC7880cM5988g.mo13418E(c9008d2);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(EzyTouchEvent.TouchEvent event) {
        C9008d c9008d;
        Intrinsics.checkNotNullParameter(event, "event");
        if (m6081h0(event.getX(), event.getY())) {
            this.f6996p = true;
        }
        if (this.f6990F) {
            int i10 = this.f6989E;
            if (i10 != TextActionType.TRANSLATE.getValue()) {
                if (i10 != TextActionType.SCALE.getValue() || (c9008d = this.f7005y) == null) {
                    return;
                }
                m6090b0(c9008d, event.getX(), event.getY());
                InterfaceC7880c interfaceC7880cM5988g = m5988g();
                if (interfaceC7880cM5988g != null) {
                    interfaceC7880cM5988g.mo13448m(c9008d, this.f7006z, this.f6985A);
                    return;
                }
                return;
            }
            Matrix matrixM6093e0 = m6093e0(event.getX(), event.getY());
            InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
            if (interfaceC7880cM5988g2 != null) {
                ArrayList arrayList = new ArrayList();
                C9008d c9008d2 = this.f7005y;
                if (c9008d2 != null) {
                    arrayList.add(c9008d2);
                }
                interfaceC7880cM5988g2.mo13443h(arrayList, matrixM6093e0);
            }
            this.f6993I.add(AbstractC7352m.m11778c(matrixM6093e0, System.currentTimeMillis()));
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(EzyTouchEvent.TouchEvent event) {
        InterfaceC8888c interfaceC8888cMo13449n;
        C9008d c9008d;
        Intrinsics.checkNotNullParameter(event, "event");
        List listMo14995f = null;
        if (this.f6990F) {
            if (m6094g0(event.getX(), event.getY())) {
                m6092d0(event.getX(), event.getY(), false);
            } else if (this.f6996p) {
                int i10 = this.f6989E;
                if (i10 == TextActionType.TRANSLATE.getValue()) {
                    this.f6986B.postConcat(this.f6992H);
                    Matrix matrixM6093e0 = m6093e0(event.getX(), event.getY());
                    ArrayList arrayList = new ArrayList();
                    C9008d c9008d2 = this.f7005y;
                    if (c9008d2 != null) {
                        arrayList.add(c9008d2);
                    }
                    InterfaceC7880c interfaceC7880cM5988g = m5988g();
                    if (interfaceC7880cM5988g != null) {
                        interfaceC7880cM5988g.mo13459x(arrayList, matrixM6093e0);
                    }
                    this.f6993I.add(AbstractC7352m.m11778c(matrixM6093e0, System.currentTimeMillis()));
                    InterfaceC7522b interfaceC7522bM5989h = m5989h();
                    if (interfaceC7522bM5989h != null) {
                        interfaceC7522bM5989h.mo12238c(arrayList, this.f6993I);
                    }
                    InterfaceC7522b interfaceC7522bM5989h2 = m5989h();
                    if (interfaceC7522bM5989h2 != null) {
                        interfaceC7522bM5989h2.mo12247l();
                    }
                } else if (i10 == TextActionType.SCALE.getValue() && (c9008d = this.f7005y) != null) {
                    m6090b0(c9008d, event.getX(), event.getY());
                    InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
                    if (interfaceC7880cM5988g2 != null) {
                        interfaceC7880cM5988g2.mo13441f(c9008d, this.f7006z, this.f6985A);
                    }
                    InterfaceC7522b interfaceC7522bM5989h3 = m5989h();
                    if (interfaceC7522bM5989h3 != null) {
                        InterfaceC7522b.a.m12262a(interfaceC7522bM5989h3, c9008d, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c9008d.mo14996g(), null, null, null, null, null, 248, null);
                    }
                    InterfaceC7522b interfaceC7522bM5989h4 = m5989h();
                    if (interfaceC7522bM5989h4 != null) {
                        interfaceC7522bM5989h4.mo12247l();
                    }
                }
            } else {
                if (this.f6989E == TextActionType.DELETE.getValue()) {
                    ArrayList arrayList2 = new ArrayList();
                    C9008d c9008d3 = this.f7005y;
                    if (c9008d3 != null) {
                        arrayList2.add(c9008d3);
                    }
                    InterfaceC7880c interfaceC7880cM5988g3 = m5988g();
                    if (interfaceC7880cM5988g3 != null) {
                        interfaceC7880cM5988g3.mo13452q(arrayList2);
                    }
                    m6096j0();
                    InterfaceC7522b interfaceC7522bM5989h5 = m5989h();
                    if (interfaceC7522bM5989h5 != null) {
                        interfaceC7522bM5989h5.mo12249n(arrayList2, System.currentTimeMillis());
                    }
                    InterfaceC7522b interfaceC7522bM5989h6 = m5989h();
                    if (interfaceC7522bM5989h6 != null) {
                        interfaceC7522bM5989h6.mo12247l();
                    }
                }
                InterfaceC7880c interfaceC7880cM5988g4 = m5988g();
                if (interfaceC7880cM5988g4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C9008d c9008d4 = this.f7005y;
                    if (c9008d4 != null) {
                        arrayList3.add(c9008d4);
                    }
                    interfaceC7880cM5988g4.mo13459x(arrayList3, null);
                }
            }
        } else {
            if (this.f6996p) {
                return;
            }
            this.f7005y = null;
            InterfaceC7880c interfaceC7880cM5988g5 = m5988g();
            if (interfaceC7880cM5988g5 != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g5.mo13449n()) != null) {
                listMo14995f = interfaceC8888cMo13449n.mo14995f();
            }
            if (listMo14995f != null && !listMo14995f.isEmpty()) {
                int size = listMo14995f.size() - 1;
                while (true) {
                    if (-1 < size) {
                        if ((listMo14995f.get(size) instanceof C9008d) && ((InterfaceC8888c) listMo14995f.get(size)).mo14994d().contains(event.getX(), event.getY())) {
                            Object obj = listMo14995f.get(size);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                            this.f7005y = (C9008d) obj;
                            break;
                        }
                        size--;
                    } else {
                        break;
                    }
                }
            }
            C9008d c9008d5 = this.f7005y;
            if (c9008d5 != null) {
                Intrinsics.checkNotNull(c9008d5);
                m6097k0(c9008d5);
            } else if (this.f7006z == null) {
                m6092d0(event.getX(), event.getY(), true);
            } else {
                m6096j0();
            }
        }
        if (this.f6996p) {
            return;
        }
        PointF pointFM6082v = m6082v(event.getX(), event.getY());
        this.f7000t = pointFM6082v.x;
        this.f7001u = pointFM6082v.y;
        this.f6999s = System.currentTimeMillis();
    }

    /* renamed from: S */
    public final void m6083S(InterfaceC8888c interfaceC8888c) {
        Matrix matrixM13188b;
        if (this.f7006z == null) {
            this.f7006z = new RectF();
        }
        RectF rectF = this.f7006z;
        Intrinsics.checkNotNull(rectF);
        rectF.set(interfaceC8888c.mo14996g());
        Matrix matrix = this.f6985A;
        matrix.reset();
        matrix.postConcat(interfaceC8888c.mo14993b());
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
            matrix.postConcat(matrixM13188b);
        }
        this.f6986B.reset();
    }

    /* renamed from: T */
    public final C9008d m6084T(RectF rectF, float f10, float f11, String str) {
        C9008d c9008d = new C9008d("", new RectF(rectF), null, null, null, 28, null);
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        C7792a c7792aM5990i = m5990i();
        Matrix matrixM13188b = c7792aM5990i != null ? c7792aM5990i.m13188b() : null;
        Intrinsics.checkNotNull(matrixM13188b);
        matrix.postConcat(AbstractC7352m.m11777b(matrixM13188b));
        c9008d.mo6747e(matrix);
        c9008d.m15162L(this.f6991G);
        c9008d.m15161K(str);
        return c9008d;
    }

    /* renamed from: V */
    public final RectF m6085V(String str, Paint paint, RectF rectF) {
        RectF addTextRectF;
        RectF addTextRectF2;
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C7358s.f11926a.m11795a(str, paint, rectF.width()).size();
        BoardConfig boardConfigM5987f = m5987f();
        float fHeight = 0.0f;
        if (size > ((boardConfigM5987f == null || (addTextRectF2 = boardConfigM5987f.getAddTextRectF()) == null) ? 0.0f : addTextRectF2.height())) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        BoardConfig boardConfigM5987f2 = m5987f();
        if (boardConfigM5987f2 != null && (addTextRectF = boardConfigM5987f2.getAddTextRectF()) != null) {
            fHeight = addTextRectF.height();
        }
        rectF.bottom = fHeight + rectF.top;
        return rectF;
    }

    /* renamed from: X */
    public final C9008d m6086X() {
        return this.f7005y;
    }

    /* renamed from: Y */
    public final RectF m6087Y() {
        return this.f7006z;
    }

    /* renamed from: Z */
    public final Matrix m6088Z() {
        return this.f6985A;
    }

    /* renamed from: a0 */
    public final Matrix m6089a0(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        matrix2.postConcat(c7792aM5990i.m13188b());
        matrix2.postConcat(matrix);
        C7792a c7792aM5990i2 = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i2);
        matrix2.postConcat(AbstractC7352m.m11777b(c7792aM5990i2.m13188b()));
        return matrix2;
    }

    /* renamed from: b0 */
    public final void m6090b0(C9008d c9008d, float f10, float f11) {
        Matrix matrixM13188b;
        PointF pointFM6082v = m6082v(f10, f11);
        Matrix matrix = new Matrix();
        matrix.postConcat(c9008d.mo14993b());
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
            matrix.postConcat(matrixM13188b);
        }
        C7353n c7353n = C7353n.f11920a;
        PointF pointFM11783d = c7353n.m11783d(c9008d.mo14996g().left, c9008d.mo14996g().bottom, matrix);
        PointF pointFM11783d2 = c7353n.m11783d(c9008d.mo14996g().right, c9008d.mo14996g().bottom, matrix);
        float fM6079W = this.f7004x + m6079W(pointFM11783d.x, pointFM11783d.y, pointFM11783d2.x, pointFM11783d2.y, this.f7002v, this.f7003w, pointFM6082v.x, pointFM6082v.y);
        Paint paintM15160J = c9008d.m15160J();
        Intrinsics.checkNotNull(paintM15160J);
        String strM15159I = c9008d.m15159I();
        Intrinsics.checkNotNull(strM15159I);
        float fMapRadius = matrix.mapRadius(paintM15160J.measureText(String.valueOf(StringsKt.first(strM15159I))));
        if (fM6079W <= this.f6988D + 10 || fM6079W <= fMapRadius) {
            return;
        }
        float fMapRadius2 = AbstractC7352m.m11777b(matrix).mapRadius(fM6079W);
        RectF rectF = new RectF(c9008d.mo14996g());
        rectF.right = rectF.left + fMapRadius2;
        String strM15159I2 = c9008d.m15159I();
        if (strM15159I2 == null) {
            strM15159I2 = "";
        }
        Paint paintM15160J2 = c9008d.m15160J();
        Intrinsics.checkNotNull(paintM15160J2);
        m6085V(strM15159I2, paintM15160J2, rectF);
        c9008d.mo6750o(rectF);
        m6083S(c9008d);
    }

    /* renamed from: c0 */
    public final void m6091c0(boolean z9, RectF rectF, float f10, float f11, String str) {
        String str2;
        if (z9) {
            InterfaceC7522b interfaceC7522bM5989h = m5989h();
            if (interfaceC7522bM5989h != null) {
                interfaceC7522bM5989h.mo12251p(rectF.width(), rectF.height(), f10, f11, this.f6991G, str, new Function1<InterfaceC8888c, Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextConfirm$1
                    {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m6098a(InterfaceC8888c it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InterfaceC7880c interfaceC7880cM5988g = this.f7008a.m5988g();
                        if (interfaceC7880cM5988g != null) {
                            InterfaceC7880c interfaceC7880cM5988g2 = this.f7008a.m5988g();
                            interfaceC7880cM5988g.mo13460y(interfaceC7880cM5988g2 != null ? interfaceC7880cM5988g2.mo13437b() : null, it);
                        }
                        this.f7008a.f7005y = (C9008d) it;
                        TextAction textAction = this.f7008a;
                        C9008d c9008dM6086X = textAction.m6086X();
                        Intrinsics.checkNotNull(c9008dM6086X);
                        textAction.m6097k0(c9008dM6086X);
                        InterfaceC7522b interfaceC7522bM5989h2 = this.f7008a.m5989h();
                        if (interfaceC7522bM5989h2 != null) {
                            interfaceC7522bM5989h2.mo12247l();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8888c interfaceC8888c) {
                        m6098a(interfaceC8888c);
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
            return;
        }
        if (this.f7005y != null) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                C9008d c9008d = this.f7005y;
                Intrinsics.checkNotNull(c9008d);
                String id = c9008d.getId();
                C9008d c9008d2 = this.f7005y;
                Intrinsics.checkNotNull(c9008d2);
                Paint paintM15160J = c9008d2.m15160J();
                Intrinsics.checkNotNull(paintM15160J);
                C9008d c9008d3 = this.f7005y;
                Intrinsics.checkNotNull(c9008d3);
                str2 = str;
                interfaceC7880cM5988g.mo13415B(id, str2, paintM15160J, c9008d3.mo14996g());
            } else {
                str2 = str;
            }
            InterfaceC7522b interfaceC7522bM5989h2 = m5989h();
            if (interfaceC7522bM5989h2 != null) {
                C9008d c9008d4 = this.f7005y;
                Intrinsics.checkNotNull(c9008d4);
                InterfaceC7522b.a.m12262a(interfaceC7522bM5989h2, c9008d4, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, str2, null, null, null, null, 244, null);
            }
            InterfaceC7522b interfaceC7522bM5989h3 = m5989h();
            if (interfaceC7522bM5989h3 != null) {
                interfaceC7522bM5989h3.mo12247l();
            }
        }
    }

    /* renamed from: d0 */
    public final void m6092d0(float f10, float f11, final boolean z9) {
        final C9008d c9008dM6084T;
        if (this.f6995K) {
            return;
        }
        this.f6995K = true;
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f != null) {
            final PointF pointFM6082v = m6082v(f10, f11);
            if (z9 || (c9008dM6084T = this.f7005y) == null) {
                c9008dM6084T = m6084T(boardConfigM5987f.getAddTextRectF(), pointFM6082v.x, pointFM6082v.y, boardConfigM5987f.getAddTextOriginalText());
            } else {
                Intrinsics.checkNotNull(c9008dM6084T);
            }
            m6083S(c9008dM6084T);
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13439d();
            }
            InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
            if (interfaceC7880cM5988g2 != null) {
                RectF rectF = this.f7006z;
                Intrinsics.checkNotNull(rectF);
                interfaceC7880cM5988g2.mo13458w(rectF, this.f6985A, this.f6987C, this.f6988D, false);
            }
            InterfaceC7880c interfaceC7880cM5988g3 = m5988g();
            if (interfaceC7880cM5988g3 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c9008dM6084T);
                interfaceC7880cM5988g3.mo13442g(arrayList);
            }
            String strM15159I = c9008dM6084T.m15159I();
            if (strM15159I == null) {
                strM15159I = "";
            }
            this.f6994J = strM15159I;
            InterfaceC7291c textEditView = boardConfigM5987f.getTextEditView();
            if (textEditView != null) {
                String strM15159I2 = c9008dM6084T.m15159I();
                textEditView.mo10819a(strM15159I2 != null ? strM15159I2 : "", new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextAction textAction = this.f7009a;
                        Paint paintM15160J = c9008dM6084T.m15160J();
                        Intrinsics.checkNotNull(paintM15160J);
                        RectF rectFM6085V = textAction.m6085V(it, paintM15160J, new RectF(c9008dM6084T.mo14996g()));
                        if (!Intrinsics.areEqual(rectFM6085V, c9008dM6084T.mo14996g())) {
                            c9008dM6084T.mo6750o(rectFM6085V);
                        }
                        c9008dM6084T.m15161K(it);
                        this.f7009a.m6083S(c9008dM6084T);
                        InterfaceC7880c interfaceC7880cM5988g4 = this.f7009a.m5988g();
                        if (interfaceC7880cM5988g4 != null) {
                            RectF rectFM6087Y = this.f7009a.m6087Y();
                            Intrinsics.checkNotNull(rectFM6087Y);
                            interfaceC7880cM5988g4.mo13458w(rectFM6087Y, this.f7009a.m6088Z(), this.f7009a.f6987C, this.f7009a.f6988D, false);
                        }
                        InterfaceC7880c interfaceC7880cM5988g5 = this.f7009a.m5988g();
                        if (interfaceC7880cM5988g5 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c9008dM6084T);
                            interfaceC7880cM5988g5.mo13442g(arrayList2);
                        }
                    }
                }, new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        TextAction textAction = this.f7011a;
                        boolean z10 = z9;
                        RectF rectFMo14996g = c9008dM6084T.mo14996g();
                        PointF pointF = pointFM6082v;
                        textAction.m6091c0(z10, rectFMo14996g, pointF.x, pointF.y, it);
                        this.f7011a.f6995K = false;
                    }
                }, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        c9008dM6084T.m15161K(this.f6994J);
                        this.m6096j0();
                        InterfaceC7880c interfaceC7880cM5988g4 = this.m5988g();
                        if (interfaceC7880cM5988g4 != null) {
                            interfaceC7880cM5988g4.mo13440e();
                        }
                        this.f6995K = false;
                    }
                });
            }
        }
    }

    /* renamed from: e0 */
    public final Matrix m6093e0(float f10, float f11) {
        PointF pointFM6082v = m6082v(f10, f11);
        this.f6992H.setTranslate(pointFM6082v.x - this.f7002v, pointFM6082v.y - this.f7003w);
        return m6089a0(this.f6992H);
    }

    /* renamed from: g0 */
    public final boolean m6094g0(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f6996p) {
            PointF pointFM6082v = m6082v(f10, f11);
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM6082v.x - this.f7000t, d10)) + ((float) Math.pow(pointFM6082v.y - this.f7001u, d10)));
            if (jCurrentTimeMillis - this.f6999s < this.f6998r && fSqrt < this.f6997q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public void m6095i0() {
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f != null) {
            this.f6991G.setColor(boardConfigM5987f.getAddTextOriginalTextColor());
            this.f6991G.setTextSize(boardConfigM5987f.getAddTextOriginalTextSize());
        }
        this.f6993I.clear();
    }

    /* renamed from: j0 */
    public final void m6096j0() {
        InterfaceC5123f interfaceC5123fMo12240e;
        if (this.f7005y == null && this.f7006z == null) {
            return;
        }
        this.f7005y = null;
        this.f7006z = null;
        this.f6985A.reset();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13439d();
        }
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h == null || (interfaceC5123fMo12240e = interfaceC7522bM5989h.mo12240e()) == null) {
            return;
        }
        interfaceC5123fMo12240e.mo2782b();
    }

    /* renamed from: k0 */
    public final void m6097k0(C9008d c9008d) {
        InterfaceC5123f interfaceC5123fMo12240e;
        m6083S(c9008d);
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            RectF rectF = this.f7006z;
            Intrinsics.checkNotNull(rectF);
            interfaceC7880cM5988g.mo13458w(rectF, this.f6985A, this.f6987C, this.f6988D, false);
        }
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h == null || (interfaceC5123fMo12240e = interfaceC7522bM5989h.mo12240e()) == null) {
            return;
        }
        Paint paintM15160J = c9008d.m15160J();
        Intrinsics.checkNotNull(paintM15160J);
        int color = paintM15160J.getColor();
        Paint paintM15160J2 = c9008d.m15160J();
        Intrinsics.checkNotNull(paintM15160J2);
        interfaceC5123fMo12240e.mo2783c(color, paintM15160J2.getTextSize());
    }
}
