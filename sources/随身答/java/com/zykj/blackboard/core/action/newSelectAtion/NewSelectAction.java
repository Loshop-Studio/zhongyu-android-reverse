package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.core.action.AbstractC6943b;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p127h5.C8099b;
import p127h5.C8101d;
import p223q5.AbstractC9361a;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p263u5.C9696o;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p302y4.C9951d;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class NewSelectAction extends AbstractC6943b {

    /* renamed from: B */
    public boolean f8321B;

    /* renamed from: q */
    public long f8323q;

    /* renamed from: r */
    public float f8324r;

    /* renamed from: s */
    public float f8325s;

    /* renamed from: w */
    public float f8329w;

    /* renamed from: x */
    public float f8330x;

    /* renamed from: y */
    public C9951d f8331y;

    /* renamed from: p */
    public final int f8322p = 500;

    /* renamed from: t */
    public boolean f8326t = true;

    /* renamed from: u */
    public final float f8327u = 20.0f;

    /* renamed from: v */
    public boolean f8328v = true;

    /* renamed from: z */
    public ArrayList f8332z = new ArrayList();

    /* renamed from: A */
    public ArrayList f8320A = new ArrayList();

    public NewSelectAction() {
        C9690i.f17127a.m16180c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.1
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
                NewSelectAction.this.f8332z.clear();
                NewSelectAction.this.f8320A.clear();
                InterfaceC0039c interfaceC0039cM7083g = NewSelectAction.this.m7083g();
                if (interfaceC0039cM7083g != null) {
                    interfaceC0039cM7083g.mo201d();
                }
                if (NewSelectAction.this.f8331y != null) {
                    C9951d c9951d = NewSelectAction.this.f8331y;
                    if (c9951d == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                        c9951d = null;
                    }
                    c9951d.m17209j();
                }
            }
        });
    }

    /* renamed from: N */
    private final void m7216N(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: S */
    private final boolean m7217S(float f10, float f11) {
        PointF pointFM7218v = m7218v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM7218v.x - this.f8329w), d10)) + ((float) Math.pow((double) (pointFM7218v.y - this.f8330x), d10))))) > this.f8327u;
    }

    /* renamed from: v */
    private final PointF m7218v(float f10, float f11) {
        C9696o c9696o = C9696o.f17133a;
        C9998a c9998aM7085i = m7085i();
        Intrinsics.checkNotNull(c9998aM7085i);
        return c9696o.m16206d(f10, f11, c9998aM7085i.m17344b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C9951d c9951d = this.f8331y;
        if (c9951d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d = null;
        }
        c9951d.m17209j();
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
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f8326t = true;
        PointF pointFM7218v = m7218v(event.getX(), event.getY());
        this.f8329w = pointFM7218v.x;
        this.f8330x = pointFM7218v.y;
        C9951d c9951d = this.f8331y;
        C9951d c9951d2 = null;
        if (c9951d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d = null;
        }
        c9951d.m17210k(this.f8329w, this.f8330x);
        C9951d c9951d3 = this.f8331y;
        if (c9951d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d3 = null;
        }
        boolean zM17208i = c9951d3.m17208i(this.f8329w, this.f8330x);
        this.f8328v = zM17208i;
        if (zM17208i) {
            C9951d c9951d4 = this.f8331y;
            if (c9951d4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            } else {
                c9951d2 = c9951d4;
            }
            c9951d2.m17207h();
            return;
        }
        C9951d c9951d5 = this.f8331y;
        if (c9951d5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c9951d2 = c9951d5;
        }
        c9951d2.m17209j();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM17344b;
        Intrinsics.checkNotNullParameter(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m7217S(event.getX(), event.getY())) {
            this.f8326t = false;
        }
        if (!this.f8328v) {
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i == null || (matrixM17344b = c9998aM7085i.m17344b()) == null) {
                return;
            }
            float[] fArr = {event.getX(), event.getY()};
            matrixM17344b.mapPoints(fArr);
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo179F(this.f8329w, this.f8330x, fArr[0], fArr[1]);
                return;
            }
            return;
        }
        if (this.f8326t) {
            return;
        }
        PointF pointFM7218v = m7218v(event.getX(), event.getY());
        C9951d c9951d = null;
        if (!this.f8321B) {
            C9951d c9951d2 = this.f8331y;
            if (c9951d2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c9951d2 = null;
            }
            c9951d2.m17203d(pointFM7218v.x, pointFM7218v.y);
            this.f8321B = true;
        }
        C9951d c9951d3 = this.f8331y;
        if (c9951d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c9951d = c9951d3;
        }
        c9951d.m17204e(pointFM7218v.x, pointFM7218v.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7100H(com.zykj.board.EzyTouchEvent.TouchEvent r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.mo7100H(com.zykj.board.EzyTouchEvent$TouchEvent):void"); // DEX body: android/随身答/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali:1024
    }

    /* renamed from: L */
    public final void m7219L(RectF rectF) {
        C9763b c9763bM7082f = m7082f();
        float f10 = 2;
        float fM16459J = (c9763bM7082f != null ? c9763bM7082f.m16459J() : 36.0f) * f10;
        float fWidth = fM16459J - rectF.width();
        float fHeight = fM16459J - rectF.height();
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
    public final void m7220M(RectF rectF, Matrix matrix) {
        Matrix matrixM16200b = AbstractC9695n.m16200b(matrix);
        C9763b c9763bM7082f = m7082f();
        float f10 = 2;
        float fM16459J = (c9763bM7082f != null ? c9763bM7082f.m16459J() : 36.0f) * f10;
        float fMapRadius = matrixM16200b.mapRadius(fM16459J) - rectF.width();
        float fMapRadius2 = matrixM16200b.mapRadius(fM16459J) - rectF.height();
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
    public final void m7221O(float f10, float f11) {
        InterfaceC8055c interfaceC8055c;
        Matrix matrix;
        InterfaceC8055c interfaceC8055cMo210m;
        C9763b c9763bM7082f = m7082f();
        List listMo12796e = null;
        List listM16460K = c9763bM7082f != null ? c9763bM7082f.m16460K() : null;
        this.f8332z.clear();
        this.f8320A.clear();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null) {
            listMo12796e = interfaceC8055cMo210m.mo12796e();
        }
        if (listMo12796e == null || listMo12796e.isEmpty()) {
            return;
        }
        int size = listMo12796e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            interfaceC8055c = (InterfaceC8055c) listMo12796e.get(size);
            if (interfaceC8055c.isInRect(f10, f11, 0.0f) && (listM16460K == null || listM16460K.contains(AbstractC9361a.m15335a(interfaceC8055c)))) {
                break;
            }
        }
        this.f8332z.add(interfaceC8055c);
        ArrayList arrayList = this.f8320A;
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i == null || (matrix = c9998aM7085i.m17344b()) == null) {
            matrix = new Matrix();
        }
        arrayList.add(interfaceC8055c.mo12799i(matrix));
    }

    /* renamed from: P */
    public final void m7222P(RectF rectF) {
        Matrix matrix;
        InterfaceC8055c interfaceC8055cMo210m;
        C9763b c9763bM7082f = m7082f();
        List listMo12796e = null;
        List listM16461L = c9763bM7082f != null ? c9763bM7082f.m16461L() : null;
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null) {
            listMo12796e = interfaceC8055cMo210m.mo12796e();
        }
        if (listMo12796e == null || listMo12796e.isEmpty()) {
            return;
        }
        int size = listMo12796e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) listMo12796e.get(size);
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) listMo12796e.get(size);
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i == null || (matrix = c9998aM7085i.m17344b()) == null) {
                matrix = new Matrix();
            }
            RectF rectFMo12799i = interfaceC8055c2.mo12799i(matrix);
            if (rectF.contains(rectFMo12799i) && (listM16461L == null || listM16461L.contains(AbstractC9361a.m15335a(interfaceC8055c)))) {
                this.f8332z.add(interfaceC8055c);
                this.f8320A.add(rectFMo12799i);
            }
        }
    }

    /* renamed from: Q */
    public final void m7223Q(List list, List list2) {
        Matrix matrixM17344b;
        RectF rectF = new RectF();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            m7216N((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null) {
                interfaceC0039cM7083g.mo201d();
                return;
            }
            return;
        }
        C9951d c9951d = this.f8331y;
        C9951d c9951d2 = null;
        if (c9951d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d = null;
        }
        c9951d.m17206g(list);
        C9951d c9951d3 = this.f8331y;
        if (c9951d3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d3 = null;
        }
        c9951d3.m17211l(list);
        InterfaceC8055c interfaceC8055c = (InterfaceC8055c) CollectionsKt.first(list);
        if (list.size() == 1 && ((interfaceC8055c instanceof C8099b) || (interfaceC8055c instanceof C8101d) || (interfaceC8055c instanceof ImageGraph))) {
            RectF rectF2 = new RectF(interfaceC8055c.mo12797f());
            Matrix matrix = new Matrix();
            matrix.postConcat(interfaceC8055c.mo12794b());
            C9998a c9998aM7085i = m7085i();
            if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
                matrix.postConcat(matrixM17344b);
            }
            PointF pointF = interfaceC8055c instanceof C8099b ? (PointF) CollectionsKt.firstOrNull(((C8099b) interfaceC8055c).m12936H()) : null;
            m7220M(rectF2, matrix);
            C9951d c9951d4 = this.f8331y;
            if (c9951d4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c9951d4 = null;
            }
            c9951d4.m17213n(rectF2, matrix, pointF);
        } else {
            m7219L(rectF);
            C9951d c9951d5 = this.f8331y;
            if (c9951d5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionManager");
                c9951d5 = null;
            }
            c9951d5.m17212m(rectF);
        }
        C9951d c9951d6 = this.f8331y;
        if (c9951d6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
        } else {
            c9951d2 = c9951d6;
        }
        c9951d2.m17214o();
    }

    /* renamed from: R */
    public final boolean m7224R(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f8326t) {
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(f10 - this.f8324r, d10)) + ((float) Math.pow(f11 - this.f8325s, d10)));
            if (jCurrentTimeMillis - this.f8323q < this.f8322p && fSqrt < this.f8327u) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public final void m7225T(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        C9951d c9951d = this.f8331y;
        if (c9951d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d = null;
        }
        c9951d.m17205f(motionEvent);
    }

    /* renamed from: U */
    public void m7226U() {
        this.f8329w = 0.0f;
        this.f8330x = 0.0f;
        this.f8332z.clear();
        this.f8320A.clear();
    }

    /* renamed from: V */
    public final void m7227V(List graphIdList) {
        Matrix matrix;
        InterfaceC8055c interfaceC8055cMo210m;
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        m7226U();
        C9951d c9951d = this.f8331y;
        List listMo12796e = null;
        if (c9951d == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionManager");
            c9951d = null;
        }
        c9951d.m17209j();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null) {
            listMo12796e = interfaceC8055cMo210m.mo12796e();
        }
        if (listMo12796e != null && (!listMo12796e.isEmpty())) {
            for (int size = listMo12796e.size() - 1; -1 < size; size--) {
                if (graphIdList.contains(((InterfaceC8055c) listMo12796e.get(size)).getId())) {
                    this.f8332z.add(listMo12796e.get(size));
                    ArrayList arrayList = this.f8320A;
                    InterfaceC8055c interfaceC8055c = (InterfaceC8055c) listMo12796e.get(size);
                    C9998a c9998aM7085i = m7085i();
                    if (c9998aM7085i == null || (matrix = c9998aM7085i.m17344b()) == null) {
                        matrix = new Matrix();
                    }
                    arrayList.add(interfaceC8055c.mo12799i(matrix));
                }
            }
        }
        m7223Q(this.f8332z, this.f8320A);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction
    /* renamed from: k */
    public void mo7087k(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.mo7087k(listener);
        this.f8331y = new C9951d(listener);
    }
}
