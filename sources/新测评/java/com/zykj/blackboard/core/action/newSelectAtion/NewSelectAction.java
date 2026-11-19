package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.AbstractC6626b;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p007a5.AbstractC0022a;
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p120i4.C7664d;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;
import p221r4.C9006b;
import p221r4.C9008d;

/* loaded from: classes4.dex */
public final class NewSelectAction extends AbstractC6626b {

    /* renamed from: B */
    public boolean f7038B;

    /* renamed from: q */
    public long f7040q;

    /* renamed from: r */
    public float f7041r;

    /* renamed from: s */
    public float f7042s;

    /* renamed from: w */
    public float f7046w;

    /* renamed from: x */
    public float f7047x;

    /* renamed from: y */
    public C7664d f7048y;

    /* renamed from: p */
    public final int f7039p = 500;

    /* renamed from: t */
    public boolean f7043t = true;

    /* renamed from: u */
    public final float f7044u = 20.0f;

    /* renamed from: v */
    public boolean f7045v = true;

    /* renamed from: z */
    public ArrayList f7049z = new ArrayList();

    /* renamed from: A */
    public ArrayList f7037A = new ArrayList();

    public NewSelectAction() {
        C7347h.f11914a.m11759c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.1
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
                NewSelectAction.this.f7049z.clear();
                NewSelectAction.this.f7037A.clear();
                InterfaceC7880c interfaceC7880cM5988g = NewSelectAction.this.m5988g();
                if (interfaceC7880cM5988g != null) {
                    interfaceC7880cM5988g.mo13439d();
                }
                if (NewSelectAction.this.f7048y != null) {
                    C7664d c7664d = NewSelectAction.this.f7048y;
                    if (c7664d == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                        c7664d = null;
                    }
                    c7664d.m12787j();
                }
            }
        });
    }

    /* renamed from: N */
    private final void m6120N(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: S */
    private final boolean m6121S(float f10, float f11) {
        PointF pointFM6122v = m6122v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM6122v.x - this.f7046w), d10)) + ((float) Math.pow((double) (pointFM6122v.y - this.f7047x), d10))))) > this.f7044u;
    }

    /* renamed from: v */
    private final PointF m6122v(float f10, float f11) {
        C7353n c7353n = C7353n.f11920a;
        C7792a c7792aM5990i = m5990i();
        Intrinsics.checkNotNull(c7792aM5990i);
        return c7353n.m11783d(f10, f11, c7792aM5990i.m13188b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C7664d c7664d = this.f7048y;
        if (c7664d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d = null;
        }
        c7664d.m12787j();
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
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f7043t = true;
        PointF pointFM6122v = m6122v(event.getX(), event.getY());
        this.f7046w = pointFM6122v.x;
        this.f7047x = pointFM6122v.y;
        C7664d c7664d = this.f7048y;
        C7664d c7664d2 = null;
        if (c7664d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d = null;
        }
        c7664d.m12788k(this.f7046w, this.f7047x);
        C7664d c7664d3 = this.f7048y;
        if (c7664d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d3 = null;
        }
        boolean zM12786i = c7664d3.m12786i(this.f7046w, this.f7047x);
        this.f7045v = zM12786i;
        if (zM12786i) {
            C7664d c7664d4 = this.f7048y;
            if (c7664d4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            } else {
                c7664d2 = c7664d4;
            }
            c7664d2.m12785h();
            return;
        }
        C7664d c7664d5 = this.f7048y;
        if (c7664d5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c7664d2 = c7664d5;
        }
        c7664d2.m12787j();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM13188b;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m6121S(event.getX(), event.getY())) {
            this.f7043t = false;
        }
        if (!this.f7045v) {
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i == null || (matrixM13188b = c7792aM5990i.m13188b()) == null) {
                return;
            }
            float[] fArr = {event.getX(), event.getY()};
            matrixM13188b.mapPoints(fArr);
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13419F(this.f7046w, this.f7047x, fArr[0], fArr[1]);
                return;
            }
            return;
        }
        if (this.f7043t) {
            return;
        }
        PointF pointFM6122v = m6122v(event.getX(), event.getY());
        C7664d c7664d = null;
        if (!this.f7038B) {
            C7664d c7664d2 = this.f7048y;
            if (c7664d2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c7664d2 = null;
            }
            c7664d2.m12781d(pointFM6122v.x, pointFM6122v.y);
            this.f7038B = true;
        }
        C7664d c7664d3 = this.f7048y;
        if (c7664d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c7664d = c7664d3;
        }
        c7664d.m12782e(pointFM6122v.x, pointFM6122v.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6005H(com.zykj.board.EzyTouchEvent.TouchEvent r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.mo6005H(com.zykj.board.EzyTouchEvent$TouchEvent):void"); // DEX body: android/新测评/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali:1024
    }

    /* renamed from: L */
    public final void m6123L(RectF rectF) {
        BoardConfig boardConfigM5987f = m5987f();
        float f10 = 2;
        float selectIconWidth = (boardConfigM5987f != null ? boardConfigM5987f.getSelectIconWidth() : 36.0f) * f10;
        float fWidth = selectIconWidth - rectF.width();
        float fHeight = selectIconWidth - rectF.height();
        if (fWidth > 0.0f) {
            float f11 = fWidth / f10;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fHeight > 0.0f) {
            float f12 = fHeight / f10;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
    }

    /* renamed from: M */
    public final void m6124M(RectF rectF, Matrix matrix) {
        Matrix matrixM11777b = AbstractC7352m.m11777b(matrix);
        BoardConfig boardConfigM5987f = m5987f();
        float f10 = 2;
        float selectIconWidth = (boardConfigM5987f != null ? boardConfigM5987f.getSelectIconWidth() : 36.0f) * f10;
        float fMapRadius = matrixM11777b.mapRadius(selectIconWidth) - rectF.width();
        float fMapRadius2 = matrixM11777b.mapRadius(selectIconWidth) - rectF.height();
        if (fMapRadius > 0.0f) {
            float f11 = fMapRadius / f10;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fMapRadius2 > 0.0f) {
            float f12 = fMapRadius2 / f10;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
    }

    /* renamed from: O */
    public final void m6125O(float f10, float f11) {
        InterfaceC8888c interfaceC8888c;
        Matrix matrix;
        InterfaceC8888c interfaceC8888cMo13449n;
        BoardConfig boardConfigM5987f = m5987f();
        List listMo14995f = null;
        List<SelectGraphEnum> selectIncludeGraphEnumListByClick = boardConfigM5987f != null ? boardConfigM5987f.getSelectIncludeGraphEnumListByClick() : null;
        this.f7049z.clear();
        this.f7037A.clear();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null) {
            listMo14995f = interfaceC8888cMo13449n.mo14995f();
        }
        if (listMo14995f == null || listMo14995f.isEmpty()) {
            return;
        }
        int size = listMo14995f.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            interfaceC8888c = (InterfaceC8888c) listMo14995f.get(size);
            if (interfaceC8888c.isInRect(f10, f11, 0.0f) && (selectIncludeGraphEnumListByClick == null || selectIncludeGraphEnumListByClick.contains(AbstractC0022a.m62a(interfaceC8888c)))) {
                break;
            }
        }
        this.f7049z.add(interfaceC8888c);
        ArrayList arrayList = this.f7037A;
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i == null || (matrix = c7792aM5990i.m13188b()) == null) {
            matrix = new Matrix();
        }
        arrayList.add(interfaceC8888c.mo14999j(matrix));
    }

    /* renamed from: P */
    public final void m6126P(RectF rectF) {
        Matrix matrix;
        InterfaceC8888c interfaceC8888cMo13449n;
        BoardConfig boardConfigM5987f = m5987f();
        List listMo14995f = null;
        List<SelectGraphEnum> selectIncludeGraphEnumListByDrag = boardConfigM5987f != null ? boardConfigM5987f.getSelectIncludeGraphEnumListByDrag() : null;
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null) {
            listMo14995f = interfaceC8888cMo13449n.mo14995f();
        }
        if (listMo14995f == null || listMo14995f.isEmpty()) {
            return;
        }
        int size = listMo14995f.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) listMo14995f.get(size);
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) listMo14995f.get(size);
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i == null || (matrix = c7792aM5990i.m13188b()) == null) {
                matrix = new Matrix();
            }
            RectF rectFMo14999j = interfaceC8888c2.mo14999j(matrix);
            if (rectF.contains(rectFMo14999j) && (selectIncludeGraphEnumListByDrag == null || selectIncludeGraphEnumListByDrag.contains(AbstractC0022a.m62a(interfaceC8888c)))) {
                this.f7049z.add(interfaceC8888c);
                this.f7037A.add(rectFMo14999j);
            }
        }
    }

    /* renamed from: Q */
    public final void m6127Q(List list, List list2) {
        Matrix matrixM13188b;
        RectF rectF = new RectF();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            m6120N((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null) {
                interfaceC7880cM5988g.mo13439d();
                return;
            }
            return;
        }
        C7664d c7664d = this.f7048y;
        C7664d c7664d2 = null;
        if (c7664d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d = null;
        }
        c7664d.m12784g(list);
        C7664d c7664d3 = this.f7048y;
        if (c7664d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d3 = null;
        }
        c7664d3.m12789l(list);
        InterfaceC8888c interfaceC8888c = (InterfaceC8888c) CollectionsKt.first(list);
        if (list.size() == 1 && ((interfaceC8888c instanceof C9006b) || (interfaceC8888c instanceof C9008d) || (interfaceC8888c instanceof ImageGraph))) {
            RectF rectF2 = new RectF(interfaceC8888c.mo14996g());
            Matrix matrix = new Matrix();
            matrix.postConcat(interfaceC8888c.mo14993b());
            C7792a c7792aM5990i = m5990i();
            if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
                matrix.postConcat(matrixM13188b);
            }
            PointF pointF = interfaceC8888c instanceof C9006b ? (PointF) CollectionsKt.firstOrNull(((C9006b) interfaceC8888c).m15153I()) : null;
            m6124M(rectF2, matrix);
            C7664d c7664d4 = this.f7048y;
            if (c7664d4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c7664d4 = null;
            }
            c7664d4.m12791n(rectF2, matrix, pointF);
        } else {
            m6123L(rectF);
            C7664d c7664d5 = this.f7048y;
            if (c7664d5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c7664d5 = null;
            }
            c7664d5.m12790m(rectF);
        }
        C7664d c7664d6 = this.f7048y;
        if (c7664d6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c7664d2 = c7664d6;
        }
        c7664d2.m12792o();
    }

    /* renamed from: R */
    public final boolean m6128R(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f7043t) {
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(f10 - this.f7041r, d10)) + ((float) Math.pow(f11 - this.f7042s, d10)));
            if (jCurrentTimeMillis - this.f7040q < this.f7039p && fSqrt < this.f7044u) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public final void m6129T(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        C7664d c7664d = this.f7048y;
        if (c7664d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d = null;
        }
        c7664d.m12783f(motionEvent);
    }

    /* renamed from: U */
    public void m6130U() {
        this.f7046w = 0.0f;
        this.f7047x = 0.0f;
        this.f7049z.clear();
        this.f7037A.clear();
    }

    /* renamed from: V */
    public final void m6131V(List graphIdList) {
        Matrix matrix;
        InterfaceC8888c interfaceC8888cMo13449n;
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        m6130U();
        C7664d c7664d = this.f7048y;
        List listMo14995f = null;
        if (c7664d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c7664d = null;
        }
        c7664d.m12787j();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null) {
            listMo14995f = interfaceC8888cMo13449n.mo14995f();
        }
        if (listMo14995f != null && (!listMo14995f.isEmpty())) {
            for (int size = listMo14995f.size() - 1; -1 < size; size--) {
                if (graphIdList.contains(((InterfaceC8888c) listMo14995f.get(size)).getId())) {
                    this.f7049z.add(listMo14995f.get(size));
                    ArrayList arrayList = this.f7037A;
                    InterfaceC8888c interfaceC8888c = (InterfaceC8888c) listMo14995f.get(size);
                    C7792a c7792aM5990i = m5990i();
                    if (c7792aM5990i == null || (matrix = c7792aM5990i.m13188b()) == null) {
                        matrix = new Matrix();
                    }
                    arrayList.add(interfaceC8888c.mo14999j(matrix));
                }
            }
        }
        m6127Q(this.f7049z, this.f7037A);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction
    /* renamed from: k */
    public void mo5992k(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.mo5992k(listener);
        this.f7048y = new C7664d(listener);
    }
}
