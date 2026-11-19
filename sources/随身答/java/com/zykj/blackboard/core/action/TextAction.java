package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
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
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p243s5.InterfaceC9478f;
import p253t5.InterfaceC9617c;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p263u5.C9696o;
import p263u5.C9701t;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class TextAction extends AbstractC6943b {

    /* renamed from: K */
    public boolean f8278K;

    /* renamed from: p */
    public boolean f8279p;

    /* renamed from: s */
    public long f8282s;

    /* renamed from: t */
    public float f8283t;

    /* renamed from: u */
    public float f8284u;

    /* renamed from: v */
    public float f8285v;

    /* renamed from: w */
    public float f8286w;

    /* renamed from: x */
    public float f8287x;

    /* renamed from: y */
    public C8101d f8288y;

    /* renamed from: z */
    public RectF f8289z;

    /* renamed from: q */
    public final float f8280q = 30.0f;

    /* renamed from: r */
    public final int f8281r = 500;

    /* renamed from: A */
    public Matrix f8268A = new Matrix();

    /* renamed from: B */
    public Matrix f8269B = new Matrix();

    /* renamed from: C */
    public Paint f8270C = new Paint();

    /* renamed from: D */
    public final float f8271D = 50.0f;

    /* renamed from: E */
    public int f8272E = -1;

    /* renamed from: F */
    public boolean f8273F = true;

    /* renamed from: G */
    public Paint f8274G = new Paint();

    /* renamed from: H */
    public Matrix f8275H = new Matrix();

    /* renamed from: I */
    public ArrayList f8276I = new ArrayList();

    /* renamed from: J */
    public String f8277J = "";

    public TextAction() {
        this.f8270C.setColor(-4276546);
        this.f8270C.setStrokeWidth(2.0f);
        this.f8270C.setStyle(Paint.Style.STROKE);
        this.f8270C.setDither(true);
        this.f8270C.setAntiAlias(true);
        this.f8274G.setColor(-12085261);
        this.f8274G.setStyle(Paint.Style.FILL);
        this.f8274G.setTextSize(40.0f);
        this.f8274G.setDither(true);
        this.f8274G.setAntiAlias(true);
        C9690i.f17127a.m16180c(EventKey.TEXT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.TextAction.1
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
                TextAction.this.m7192j0();
            }
        });
    }

    /* renamed from: U */
    private final float m7174U(float f10, float f11) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* renamed from: W */
    private final float m7175W(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(m7174U(f12 - f10, f13 - f11) - m7174U(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    /* renamed from: f0 */
    private final boolean m7176f0(PointF pointF) {
        if (this.f8289z == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.f8268A);
        matrix.postConcat(this.f8269B);
        float fMapRadius = (this.f8271D / 2) / matrix.mapRadius(1.0f);
        RectF rectF = this.f8289z;
        Intrinsics.checkNotNull(rectF);
        float f10 = rectF.right - fMapRadius;
        RectF rectF2 = this.f8289z;
        Intrinsics.checkNotNull(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.f8289z;
        Intrinsics.checkNotNull(rectF3);
        float f12 = rectF3.right + fMapRadius;
        RectF rectF4 = this.f8289z;
        Intrinsics.checkNotNull(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.f8289z;
        Intrinsics.checkNotNull(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.f8289z;
        Intrinsics.checkNotNull(rectF7);
        float f14 = rectF7.bottom - fMapRadius;
        RectF rectF8 = this.f8289z;
        Intrinsics.checkNotNull(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.f8289z;
        Intrinsics.checkNotNull(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.bottom + fMapRadius);
        C9696o c9696o = C9696o.f17133a;
        if (c9696o.m16205c(rectF5, matrix, pointF)) {
            this.f8272E = TextActionType.DELETE.getValue();
            return true;
        }
        if (c9696o.m16205c(rectF10, matrix, pointF)) {
            this.f8272E = TextActionType.SCALE.getValue();
            return true;
        }
        RectF rectF11 = this.f8289z;
        Intrinsics.checkNotNull(rectF11);
        if (!c9696o.m16205c(rectF11, matrix, pointF)) {
            return false;
        }
        this.f8272E = TextActionType.TRANSLATE.getValue();
        return true;
    }

    /* renamed from: h0 */
    private final boolean m7177h0(float f10, float f11) {
        PointF pointFM7178v = m7178v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM7178v.x - this.f8285v), d10)) + ((float) Math.pow((double) (pointFM7178v.y - this.f8286w), d10))))) > this.f8280q;
    }

    /* renamed from: v */
    private final PointF m7178v(float f10, float f11) {
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo202e();
        }
        m7192j0();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(EzyTouchEvent.TouchEvent event) {
        InterfaceC0039c interfaceC0039cM7083g;
        Intrinsics.checkNotNullParameter(event, "event");
        this.f8279p = false;
        PointF pointFM7178v = m7178v(event.getX(), event.getY());
        this.f8285v = pointFM7178v.x;
        this.f8286w = pointFM7178v.y;
        boolean zM7176f0 = m7176f0(new PointF(this.f8285v, this.f8286w));
        this.f8273F = zM7176f0;
        if (zM7176f0) {
            int i9 = this.f8272E;
            if (i9 == TextActionType.TRANSLATE.getValue()) {
                InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
                if (interfaceC0039cM7083g2 != null) {
                    ArrayList arrayList = new ArrayList();
                    C8101d c8101d = this.f8288y;
                    if (c8101d != null) {
                        arrayList.add(c8101d);
                    }
                    interfaceC0039cM7083g2.mo218u(arrayList);
                    return;
                }
                return;
            }
            if (i9 == TextActionType.SCALE.getValue()) {
                Matrix matrix = this.f8268A;
                RectF rectF = this.f8289z;
                Intrinsics.checkNotNull(rectF);
                this.f8287x = matrix.mapRadius(rectF.width());
                C8101d c8101d2 = this.f8288y;
                if (c8101d2 == null || (interfaceC0039cM7083g = m7083g()) == null) {
                    return;
                }
                interfaceC0039cM7083g.mo178E(c8101d2);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(EzyTouchEvent.TouchEvent event) {
        C8101d c8101d;
        Intrinsics.checkNotNullParameter(event, "event");
        if (m7177h0(event.getX(), event.getY())) {
            this.f8279p = true;
        }
        if (this.f8273F) {
            int i9 = this.f8272E;
            if (i9 != TextActionType.TRANSLATE.getValue()) {
                if (i9 != TextActionType.SCALE.getValue() || (c8101d = this.f8288y) == null) {
                    return;
                }
                m7186b0(c8101d, event.getX(), event.getY());
                InterfaceC0039c interfaceC0039cM7083g = m7083g();
                if (interfaceC0039cM7083g != null) {
                    interfaceC0039cM7083g.mo216s(c8101d, this.f8289z, this.f8268A);
                    return;
                }
                return;
            }
            Matrix matrixM7189e0 = m7189e0(event.getX(), event.getY());
            InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
            if (interfaceC0039cM7083g2 != null) {
                ArrayList arrayList = new ArrayList();
                C8101d c8101d2 = this.f8288y;
                if (c8101d2 != null) {
                    arrayList.add(c8101d2);
                }
                interfaceC0039cM7083g2.mo206i(arrayList, matrixM7189e0);
            }
            this.f8276I.add(AbstractC9695n.m16201c(matrixM7189e0, System.currentTimeMillis()));
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(EzyTouchEvent.TouchEvent event) {
        InterfaceC8055c interfaceC8055cMo210m;
        C8101d c8101d;
        Intrinsics.checkNotNullParameter(event, "event");
        List listMo12796e = null;
        if (this.f8273F) {
            if (m7190g0(event.getX(), event.getY())) {
                m7188d0(event.getX(), event.getY(), false);
            } else if (this.f8279p) {
                int i9 = this.f8272E;
                if (i9 == TextActionType.TRANSLATE.getValue()) {
                    this.f8269B.postConcat(this.f8275H);
                    Matrix matrixM7189e0 = m7189e0(event.getX(), event.getY());
                    ArrayList arrayList = new ArrayList();
                    C8101d c8101d2 = this.f8288y;
                    if (c8101d2 != null) {
                        arrayList.add(c8101d2);
                    }
                    InterfaceC0039c interfaceC0039cM7083g = m7083g();
                    if (interfaceC0039cM7083g != null) {
                        interfaceC0039cM7083g.mo223z(arrayList, matrixM7189e0);
                    }
                    this.f8276I.add(AbstractC9695n.m16201c(matrixM7189e0, System.currentTimeMillis()));
                    InterfaceC9822b interfaceC9822bM7084h = m7084h();
                    if (interfaceC9822bM7084h != null) {
                        interfaceC9822bM7084h.mo16684c(arrayList, this.f8276I);
                    }
                    InterfaceC9822b interfaceC9822bM7084h2 = m7084h();
                    if (interfaceC9822bM7084h2 != null) {
                        interfaceC9822bM7084h2.mo16693l();
                    }
                } else if (i9 == TextActionType.SCALE.getValue() && (c8101d = this.f8288y) != null) {
                    m7186b0(c8101d, event.getX(), event.getY());
                    InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
                    if (interfaceC0039cM7083g2 != null) {
                        interfaceC0039cM7083g2.mo204g(c8101d, this.f8289z, this.f8268A);
                    }
                    InterfaceC9822b interfaceC9822bM7084h3 = m7084h();
                    if (interfaceC9822bM7084h3 != null) {
                        InterfaceC9822b.a.m16708a(interfaceC9822bM7084h3, c8101d, EzyGraphEnum.GraphEnum.TEXT_GRAPH, c8101d.mo12797f(), null, null, null, null, null, 248, null);
                    }
                    InterfaceC9822b interfaceC9822bM7084h4 = m7084h();
                    if (interfaceC9822bM7084h4 != null) {
                        interfaceC9822bM7084h4.mo16693l();
                    }
                }
            } else {
                if (this.f8272E == TextActionType.DELETE.getValue()) {
                    ArrayList arrayList2 = new ArrayList();
                    C8101d c8101d3 = this.f8288y;
                    if (c8101d3 != null) {
                        arrayList2.add(c8101d3);
                    }
                    InterfaceC0039c interfaceC0039cM7083g3 = m7083g();
                    if (interfaceC0039cM7083g3 != null) {
                        interfaceC0039cM7083g3.mo212o(arrayList2);
                    }
                    m7192j0();
                    InterfaceC9822b interfaceC9822bM7084h5 = m7084h();
                    if (interfaceC9822bM7084h5 != null) {
                        interfaceC9822bM7084h5.mo16695n(arrayList2, System.currentTimeMillis());
                    }
                    InterfaceC9822b interfaceC9822bM7084h6 = m7084h();
                    if (interfaceC9822bM7084h6 != null) {
                        interfaceC9822bM7084h6.mo16693l();
                    }
                }
                InterfaceC0039c interfaceC0039cM7083g4 = m7083g();
                if (interfaceC0039cM7083g4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C8101d c8101d4 = this.f8288y;
                    if (c8101d4 != null) {
                        arrayList3.add(c8101d4);
                    }
                    interfaceC0039cM7083g4.mo223z(arrayList3, null);
                }
            }
        } else {
            if (this.f8279p) {
                return;
            }
            this.f8288y = null;
            InterfaceC0039c interfaceC0039cM7083g5 = m7083g();
            if (interfaceC0039cM7083g5 != null && (interfaceC8055cMo210m = interfaceC0039cM7083g5.mo210m()) != null) {
                listMo12796e = interfaceC8055cMo210m.mo12796e();
            }
            if (listMo12796e != null && !listMo12796e.isEmpty()) {
                int size = listMo12796e.size() - 1;
                while (true) {
                    if (-1 < size) {
                        if ((listMo12796e.get(size) instanceof C8101d) && ((InterfaceC8055c) listMo12796e.get(size)).mo12795c().contains(event.getX(), event.getY())) {
                            Object obj = listMo12796e.get(size);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                            this.f8288y = (C8101d) obj;
                            break;
                        }
                        size--;
                    } else {
                        break;
                    }
                }
            }
            C8101d c8101d5 = this.f8288y;
            if (c8101d5 != null) {
                Intrinsics.checkNotNull(c8101d5);
                m7193k0(c8101d5);
            } else if (this.f8289z == null) {
                m7188d0(event.getX(), event.getY(), true);
            } else {
                m7192j0();
            }
        }
        if (this.f8279p) {
            return;
        }
        PointF pointFM7178v = m7178v(event.getX(), event.getY());
        this.f8283t = pointFM7178v.x;
        this.f8284u = pointFM7178v.y;
        this.f8282s = System.currentTimeMillis();
    }

    /* renamed from: S */
    public final void m7179S(InterfaceC8055c interfaceC8055c) {
        Matrix matrixM17344b;
        if (this.f8289z == null) {
            this.f8289z = new RectF();
        }
        RectF rectF = this.f8289z;
        Intrinsics.checkNotNull(rectF);
        rectF.set(interfaceC8055c.mo12797f());
        Matrix matrix = this.f8268A;
        matrix.reset();
        matrix.postConcat(interfaceC8055c.mo12794b());
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
            matrix.postConcat(matrixM17344b);
        }
        this.f8269B.reset();
    }

    /* renamed from: T */
    public final C8101d m7180T(RectF rectF, float f10, float f11, String str) {
        C8101d c8101d = new C8101d("", new RectF(rectF), null, null, null, 28, null);
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        C9998a c9998aM7085i = m7085i();
        Matrix matrixM17344b = c9998aM7085i != null ? c9998aM7085i.m17344b() : null;
        Intrinsics.checkNotNull(matrixM17344b);
        matrix.postConcat(AbstractC9695n.m16200b(matrixM17344b));
        c8101d.mo7858d(matrix);
        c8101d.m12945K(this.f8274G);
        c8101d.m12944J(str);
        return c8101d;
    }

    /* renamed from: V */
    public final RectF m7181V(String str, Paint paint, RectF rectF) {
        RectF rectFM16485f;
        RectF rectFM16485f2;
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * C9701t.f17139a.m16219a(str, paint, rectF.width()).size();
        C9763b c9763bM7082f = m7082f();
        float fHeight = 0.0f;
        if (size > ((c9763bM7082f == null || (rectFM16485f2 = c9763bM7082f.m16485f()) == null) ? 0.0f : rectFM16485f2.height())) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        C9763b c9763bM7082f2 = m7082f();
        if (c9763bM7082f2 != null && (rectFM16485f = c9763bM7082f2.m16485f()) != null) {
            fHeight = rectFM16485f.height();
        }
        rectF.bottom = fHeight + rectF.top;
        return rectF;
    }

    /* renamed from: X */
    public final C8101d m7182X() {
        return this.f8288y;
    }

    /* renamed from: Y */
    public final RectF m7183Y() {
        return this.f8289z;
    }

    /* renamed from: Z */
    public final Matrix m7184Z() {
        return this.f8268A;
    }

    /* renamed from: a0 */
    public final Matrix m7185a0(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        matrix2.postConcat(c9998aM7085i.m17344b());
        matrix2.postConcat(matrix);
        C9998a c9998aM7085i2 = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i2);
        matrix2.postConcat(AbstractC9695n.m16200b(c9998aM7085i2.m17344b()));
        return matrix2;
    }

    /* renamed from: b0 */
    public final void m7186b0(C8101d c8101d, float f10, float f11) {
        Matrix matrixM17344b;
        PointF pointFM7178v = m7178v(f10, f11);
        Matrix matrix = new Matrix();
        matrix.postConcat(c8101d.mo12794b());
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
            matrix.postConcat(matrixM17344b);
        }
        C9696o c9696o = C9696o.f17133a;
        PointF pointFM16206d = c9696o.m16206d(c8101d.mo12797f().left, c8101d.mo12797f().bottom, matrix);
        PointF pointFM16206d2 = c9696o.m16206d(c8101d.mo12797f().right, c8101d.mo12797f().bottom, matrix);
        float fM7175W = this.f8287x + m7175W(pointFM16206d.x, pointFM16206d.y, pointFM16206d2.x, pointFM16206d2.y, this.f8285v, this.f8286w, pointFM7178v.x, pointFM7178v.y);
        Paint paintM12943I = c8101d.m12943I();
        Intrinsics.checkNotNull(paintM12943I);
        String strM12942H = c8101d.m12942H();
        Intrinsics.checkNotNull(strM12942H);
        float fMapRadius = matrix.mapRadius(paintM12943I.measureText(String.valueOf(StringsKt.first(strM12942H))));
        if (fM7175W <= this.f8271D + 10 || fM7175W <= fMapRadius) {
            return;
        }
        float fMapRadius2 = AbstractC9695n.m16200b(matrix).mapRadius(fM7175W);
        RectF rectF = new RectF(c8101d.mo12797f());
        rectF.right = rectF.left + fMapRadius2;
        String strM12942H2 = c8101d.m12942H();
        if (strM12942H2 == null) {
            strM12942H2 = "";
        }
        Paint paintM12943I2 = c8101d.m12943I();
        Intrinsics.checkNotNull(paintM12943I2);
        m7181V(strM12942H2, paintM12943I2, rectF);
        c8101d.mo7862n(rectF);
        m7179S(c8101d);
    }

    /* renamed from: c0 */
    public final void m7187c0(boolean z9, RectF rectF, float f10, float f11, String str) {
        String str2;
        if (z9) {
            InterfaceC9822b interfaceC9822bM7084h = m7084h();
            if (interfaceC9822bM7084h != null) {
                interfaceC9822bM7084h.mo16697p(rectF.width(), rectF.height(), f10, f11, this.f8274G, str, new Function1<InterfaceC8055c, Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextConfirm$1
                    {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m7194a(InterfaceC8055c it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        InterfaceC0039c interfaceC0039cM7083g = this.f8291a.m7083g();
                        if (interfaceC0039cM7083g != null) {
                            InterfaceC0039c interfaceC0039cM7083g2 = this.f8291a.m7083g();
                            interfaceC0039cM7083g.mo222y(interfaceC0039cM7083g2 != null ? interfaceC0039cM7083g2.mo199b() : null, it);
                        }
                        this.f8291a.f8288y = (C8101d) it;
                        TextAction textAction = this.f8291a;
                        C8101d c8101dM7182X = textAction.m7182X();
                        Intrinsics.checkNotNull(c8101dM7182X);
                        textAction.m7193k0(c8101dM7182X);
                        InterfaceC9822b interfaceC9822bM7084h2 = this.f8291a.m7084h();
                        if (interfaceC9822bM7084h2 != null) {
                            interfaceC9822bM7084h2.mo16693l();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8055c interfaceC8055c) {
                        m7194a(interfaceC8055c);
                        return Unit.INSTANCE;
                    }
                });
                return;
            }
            return;
        }
        if (this.f8288y != null) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                C8101d c8101d = this.f8288y;
                Intrinsics.checkNotNull(c8101d);
                String id = c8101d.getId();
                C8101d c8101d2 = this.f8288y;
                Intrinsics.checkNotNull(c8101d2);
                Paint paintM12943I = c8101d2.m12943I();
                Intrinsics.checkNotNull(paintM12943I);
                C8101d c8101d3 = this.f8288y;
                Intrinsics.checkNotNull(c8101d3);
                str2 = str;
                interfaceC0039cM7083g.mo176C(id, str2, paintM12943I, c8101d3.mo12797f());
            } else {
                str2 = str;
            }
            InterfaceC9822b interfaceC9822bM7084h2 = m7084h();
            if (interfaceC9822bM7084h2 != null) {
                C8101d c8101d4 = this.f8288y;
                Intrinsics.checkNotNull(c8101d4);
                InterfaceC9822b.a.m16708a(interfaceC9822bM7084h2, c8101d4, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, str2, null, null, null, null, 244, null);
            }
            InterfaceC9822b interfaceC9822bM7084h3 = m7084h();
            if (interfaceC9822bM7084h3 != null) {
                interfaceC9822bM7084h3.mo16693l();
            }
        }
    }

    /* renamed from: d0 */
    public final void m7188d0(float f10, float f11, final boolean z9) {
        final C8101d c8101dM7180T;
        if (this.f8278K) {
            return;
        }
        this.f8278K = true;
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f != null) {
            final PointF pointFM7178v = m7178v(f10, f11);
            if (z9 || (c8101dM7180T = this.f8288y) == null) {
                c8101dM7180T = m7180T(c9763bM7082f.m16485f(), pointFM7178v.x, pointFM7178v.y, c9763bM7082f.m16476a());
            } else {
                Intrinsics.checkNotNull(c8101dM7180T);
            }
            m7179S(c8101dM7180T);
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo201d();
            }
            InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
            if (interfaceC0039cM7083g2 != null) {
                RectF rectF = this.f8289z;
                Intrinsics.checkNotNull(rectF);
                interfaceC0039cM7083g2.mo220w(rectF, this.f8268A, this.f8270C, this.f8271D, false);
            }
            InterfaceC0039c interfaceC0039cM7083g3 = m7083g();
            if (interfaceC0039cM7083g3 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c8101dM7180T);
                interfaceC0039cM7083g3.mo203f(arrayList);
            }
            String strM12942H = c8101dM7180T.m12942H();
            if (strM12942H == null) {
                strM12942H = "";
            }
            this.f8277J = strM12942H;
            InterfaceC9617c interfaceC9617cM16464O = c9763bM7082f.m16464O();
            if (interfaceC9617cM16464O != null) {
                String strM12942H2 = c8101dM7180T.m12942H();
                interfaceC9617cM16464O.mo11218a(strM12942H2 != null ? strM12942H2 : "", new Function1<String, Unit>() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$2
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
                        TextAction textAction = this.f8292a;
                        Paint paintM12943I = c8101dM7180T.m12943I();
                        Intrinsics.checkNotNull(paintM12943I);
                        RectF rectFM7181V = textAction.m7181V(it, paintM12943I, new RectF(c8101dM7180T.mo12797f()));
                        if (!Intrinsics.areEqual(rectFM7181V, c8101dM7180T.mo12797f())) {
                            c8101dM7180T.mo7862n(rectFM7181V);
                        }
                        c8101dM7180T.m12944J(it);
                        this.f8292a.m7179S(c8101dM7180T);
                        InterfaceC0039c interfaceC0039cM7083g4 = this.f8292a.m7083g();
                        if (interfaceC0039cM7083g4 != null) {
                            RectF rectFM7183Y = this.f8292a.m7183Y();
                            Intrinsics.checkNotNull(rectFM7183Y);
                            interfaceC0039cM7083g4.mo220w(rectFM7183Y, this.f8292a.m7184Z(), this.f8292a.f8270C, this.f8292a.f8271D, false);
                        }
                        InterfaceC0039c interfaceC0039cM7083g5 = this.f8292a.m7083g();
                        if (interfaceC0039cM7083g5 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c8101dM7180T);
                            interfaceC0039cM7083g5.mo203f(arrayList2);
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
                        TextAction textAction = this.f8294a;
                        boolean z10 = z9;
                        RectF rectFMo12797f = c8101dM7180T.mo12797f();
                        PointF pointF = pointFM7178v;
                        textAction.m7187c0(z10, rectFMo12797f, pointF.x, pointF.y, it);
                        this.f8294a.f8278K = false;
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
                        c8101dM7180T.m12944J(this.f8277J);
                        this.m7192j0();
                        InterfaceC0039c interfaceC0039cM7083g4 = this.m7083g();
                        if (interfaceC0039cM7083g4 != null) {
                            interfaceC0039cM7083g4.mo202e();
                        }
                        this.f8278K = false;
                    }
                });
            }
        }
    }

    /* renamed from: e0 */
    public final Matrix m7189e0(float f10, float f11) {
        PointF pointFM7178v = m7178v(f10, f11);
        this.f8275H.setTranslate(pointFM7178v.x - this.f8285v, pointFM7178v.y - this.f8286w);
        return m7185a0(this.f8275H);
    }

    /* renamed from: g0 */
    public final boolean m7190g0(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f8279p) {
            PointF pointFM7178v = m7178v(f10, f11);
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFM7178v.x - this.f8283t, d10)) + ((float) Math.pow(pointFM7178v.y - this.f8284u, d10)));
            if (jCurrentTimeMillis - this.f8282s < this.f8281r && fSqrt < this.f8280q) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    public void m7191i0() {
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f != null) {
            this.f8274G.setColor(c9763bM7082f.m16478b());
            this.f8274G.setTextSize(c9763bM7082f.m16483e());
        }
        this.f8276I.clear();
    }

    /* renamed from: j0 */
    public final void m7192j0() {
        InterfaceC9478f interfaceC9478fMo16686e;
        if (this.f8288y == null && this.f8289z == null) {
            return;
        }
        this.f8288y = null;
        this.f8289z = null;
        this.f8268A.reset();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo201d();
        }
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h == null || (interfaceC9478fMo16686e = interfaceC9822bM7084h.mo16686e()) == null) {
            return;
        }
        interfaceC9478fMo16686e.mo2228b();
    }

    /* renamed from: k0 */
    public final void m7193k0(C8101d c8101d) {
        InterfaceC9478f interfaceC9478fMo16686e;
        m7179S(c8101d);
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            RectF rectF = this.f8289z;
            Intrinsics.checkNotNull(rectF);
            interfaceC0039cM7083g.mo220w(rectF, this.f8268A, this.f8270C, this.f8271D, false);
        }
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h == null || (interfaceC9478fMo16686e = interfaceC9822bM7084h.mo16686e()) == null) {
            return;
        }
        Paint paintM12943I = c8101d.m12943I();
        Intrinsics.checkNotNull(paintM12943I);
        int color = paintM12943I.getColor();
        Paint paintM12943I2 = c8101d.m12943I();
        Intrinsics.checkNotNull(paintM12943I2);
        interfaceC9478fMo16686e.mo2229c(color, paintM12943I2.getTextSize());
    }
}
