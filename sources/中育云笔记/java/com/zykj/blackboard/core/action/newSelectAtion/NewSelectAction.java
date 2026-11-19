package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import ba.InterfaceC5181c;
import ca.C5412b;
import ca.C5414d;
import com.zykj.blackboard.core.action.AbstractC8326b;
import com.zykj.blackboard.core.graph.group.ImageGraph;
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
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p348t9.C11256c;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class NewSelectAction extends AbstractC8326b {

    /* renamed from: B */
    public boolean f17886B;

    /* renamed from: q */
    public long f17888q;

    /* renamed from: r */
    public float f17889r;

    /* renamed from: s */
    public float f17890s;

    /* renamed from: w */
    public float f17894w;

    /* renamed from: x */
    public float f17895x;

    /* renamed from: y */
    public C11256c f17896y;

    /* renamed from: p */
    public final int f17887p = 500;

    /* renamed from: t */
    public boolean f17891t = true;

    /* renamed from: u */
    public final float f17892u = 20.0f;

    /* renamed from: v */
    public boolean f17893v = true;

    /* renamed from: z */
    public ArrayList f17897z = new ArrayList();

    /* renamed from: A */
    public ArrayList f17885A = new ArrayList();

    public NewSelectAction() {
        C10346i.f24652a.m21641c(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34000invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34000invoke() {
                NewSelectAction.this.f17897z.clear();
                NewSelectAction.this.f17885A.clear();
                InterfaceC11552c interfaceC11552cM13725g = NewSelectAction.this.m13725g();
                if (interfaceC11552cM13725g != null) {
                    interfaceC11552cM13725g.mo25445e();
                }
                if (NewSelectAction.this.f17896y != null) {
                    C11256c c11256c = NewSelectAction.this.f17896y;
                    if (c11256c == null) {
                        AbstractC9979u.m20312y("functionManager");
                        c11256c = null;
                    }
                    c11256c.m25163i();
                }
            }
        });
    }

    /* renamed from: N */
    private final void m13857N(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    /* renamed from: S */
    private final boolean m13858S(float f10, float f11) {
        PointF pointFM13859v = m13859v(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (pointFM13859v.x - this.f17894w), d10)) + ((float) Math.pow((double) (pointFM13859v.y - this.f17895x), d10))))) > this.f17892u;
    }

    /* renamed from: v */
    private final PointF m13859v(float f10, float f11) {
        C10352o c10352o = C10352o.f24660a;
        C11373a c11373aM13727i = m13727i();
        AbstractC9979u.m20291d(c11373aM13727i);
        return c10352o.m21671d(f10, f11, c11373aM13727i.m25311b());
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        C11256c c11256c = this.f17896y;
        if (c11256c == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c = null;
        }
        c11256c.m25163i();
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
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.f17891t = true;
        PointF pointFM13859v = m13859v(event.getX(), event.getY());
        this.f17894w = pointFM13859v.x;
        this.f17895x = pointFM13859v.y;
        C11256c c11256c = this.f17896y;
        C11256c c11256c2 = null;
        if (c11256c == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c = null;
        }
        c11256c.m25164j(this.f17894w, this.f17895x);
        C11256c c11256c3 = this.f17896y;
        if (c11256c3 == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c3 = null;
        }
        boolean zM25162h = c11256c3.m25162h(this.f17894w, this.f17895x);
        this.f17893v = zM25162h;
        if (zM25162h) {
            C11256c c11256c4 = this.f17896y;
            if (c11256c4 == null) {
                AbstractC9979u.m20312y("functionManager");
            } else {
                c11256c2 = c11256c4;
            }
            c11256c2.m25161g();
            return;
        }
        C11256c c11256c5 = this.f17896y;
        if (c11256c5 == null) {
            AbstractC9979u.m20312y("functionManager");
        } else {
            c11256c2 = c11256c5;
        }
        c11256c2.m25163i();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(EzyTouchEvent.TouchEvent event) {
        Matrix matrixM25311b;
        AbstractC9979u.m20294g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (m13858S(event.getX(), event.getY())) {
            this.f17891t = false;
        }
        if (!this.f17893v) {
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i == null || (matrixM25311b = c11373aM13727i.m25311b()) == null) {
                return;
            }
            float[] fArr = {event.getX(), event.getY()};
            matrixM25311b.mapPoints(fArr);
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25420F(this.f17894w, this.f17895x, fArr[0], fArr[1]);
                return;
            }
            return;
        }
        if (this.f17891t) {
            return;
        }
        PointF pointFM13859v = m13859v(event.getX(), event.getY());
        C11256c c11256c = null;
        if (!this.f17886B) {
            C11256c c11256c2 = this.f17896y;
            if (c11256c2 == null) {
                AbstractC9979u.m20312y("functionManager");
                c11256c2 = null;
            }
            c11256c2.m25158d(pointFM13859v.x, pointFM13859v.y);
            this.f17886B = true;
        }
        C11256c c11256c3 = this.f17896y;
        if (c11256c3 == null) {
            AbstractC9979u.m20312y("functionManager");
        } else {
            c11256c = c11256c3;
        }
        c11256c.m25159e(pointFM13859v.x, pointFM13859v.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo13742H(com.zykj.board.EzyTouchEvent.TouchEvent r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.mo13742H(com.zykj.board.EzyTouchEvent$TouchEvent):void"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali:1024
    }

    /* renamed from: L */
    public final void m13860L(RectF rectF) {
        C10762b c10762bM13724f = m13724f();
        float f10 = 2;
        float fM22864H = (c10762bM13724f != null ? c10762bM13724f.m22864H() : 36.0f) * f10;
        float fWidth = fM22864H - rectF.width();
        float fHeight = fM22864H - rectF.height();
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
    public final void m13861M(RectF rectF, Matrix matrix) {
        Matrix matrixM21660b = AbstractC10351n.m21660b(matrix);
        C10762b c10762bM13724f = m13724f();
        float f10 = 2;
        float fM22864H = (c10762bM13724f != null ? c10762bM13724f.m22864H() : 36.0f) * f10;
        float fMapRadius = matrixM21660b.mapRadius(fM22864H) - rectF.width();
        float fMapRadius2 = matrixM21660b.mapRadius(fM22864H) - rectF.height();
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
    public final void m13862O(float f10, float f11) {
        List listM24136n;
        Matrix matrix;
        InterfaceC5181c interfaceC5181cMo25454n;
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f == null || (listM24136n = c10762bM13724f.m22862F()) == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        this.f17897z.clear();
        this.f17885A.clear();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        List listMo2717f = (interfaceC11552cM13725g == null || (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) == null) ? null : interfaceC5181cMo25454n.mo2717f();
        List list = listMo2717f;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = listMo2717f.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) listMo2717f.get(size);
            if (interfaceC5181c.isInRect(f10, f11, 0.0f) && !AbstractC10947g0.m23932e0(listM24136n, interfaceC5181c)) {
                this.f17897z.add(interfaceC5181c);
                ArrayList arrayList = this.f17885A;
                C11373a c11373aM13727i = m13727i();
                if (c11373aM13727i == null || (matrix = c11373aM13727i.m25311b()) == null) {
                    matrix = new Matrix();
                }
                arrayList.add(interfaceC5181c.mo2721j(matrix));
                return;
            }
        }
    }

    /* renamed from: P */
    public final void m13863P(RectF rectF) {
        List listM24136n;
        Matrix matrix;
        InterfaceC5181c interfaceC5181cMo25454n;
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f == null || (listM24136n = c10762bM13724f.m22862F()) == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        List listMo2717f = (interfaceC11552cM13725g == null || (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) == null) ? null : interfaceC5181cMo25454n.mo2717f();
        List list = listMo2717f;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = listMo2717f.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) listMo2717f.get(size);
            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) listMo2717f.get(size);
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i == null || (matrix = c11373aM13727i.m25311b()) == null) {
                matrix = new Matrix();
            }
            RectF rectFMo2721j = interfaceC5181c2.mo2721j(matrix);
            if (rectF.contains(rectFMo2721j) && !AbstractC10947g0.m23932e0(listM24136n, interfaceC5181c)) {
                this.f17897z.add(interfaceC5181c);
                this.f17885A.add(rectFMo2721j);
            }
        }
    }

    /* renamed from: Q */
    public final void m13864Q(List list, List list2) {
        Matrix matrixM25311b;
        RectF rectF = new RectF();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            m13857N((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null) {
                interfaceC11552cM13725g.mo25445e();
                return;
            }
            return;
        }
        C11256c c11256c = this.f17896y;
        C11256c c11256c2 = null;
        if (c11256c == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c = null;
        }
        c11256c.m25160f(list);
        C11256c c11256c3 = this.f17896y;
        if (c11256c3 == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c3 = null;
        }
        c11256c3.m25165k(list);
        InterfaceC5181c interfaceC5181c = (InterfaceC5181c) AbstractC10947g0.m23944m0(list);
        if (list.size() == 1 && ((interfaceC5181c instanceof C5412b) || (interfaceC5181c instanceof C5414d) || (interfaceC5181c instanceof ImageGraph))) {
            RectF rectF2 = new RectF(interfaceC5181c.mo2718g());
            Matrix matrix = new Matrix();
            matrix.postConcat(interfaceC5181c.mo2714b());
            C11373a c11373aM13727i = m13727i();
            if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
                matrix.postConcat(matrixM25311b);
            }
            PointF pointF = interfaceC5181c instanceof C5412b ? (PointF) AbstractC10947g0.m23946o0(((C5412b) interfaceC5181c).m2869E()) : null;
            m13861M(rectF2, matrix);
            C11256c c11256c4 = this.f17896y;
            if (c11256c4 == null) {
                AbstractC9979u.m20312y("functionManager");
                c11256c4 = null;
            }
            c11256c4.m25167m(rectF2, matrix, pointF);
        } else {
            m13860L(rectF);
            C11256c c11256c5 = this.f17896y;
            if (c11256c5 == null) {
                AbstractC9979u.m20312y("functionManager");
                c11256c5 = null;
            }
            c11256c5.m25166l(rectF);
        }
        C11256c c11256c6 = this.f17896y;
        if (c11256c6 == null) {
            AbstractC9979u.m20312y("functionManager");
        } else {
            c11256c2 = c11256c6;
        }
        c11256c2.m25168n();
    }

    /* renamed from: R */
    public final boolean m13865R(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f17891t) {
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(f10 - this.f17889r, d10)) + ((float) Math.pow(f11 - this.f17890s, d10)));
            if (jCurrentTimeMillis - this.f17888q < this.f17887p && fSqrt < this.f17892u) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public void m13866T() {
        this.f17894w = 0.0f;
        this.f17895x = 0.0f;
        this.f17897z.clear();
        this.f17885A.clear();
    }

    /* renamed from: U */
    public final void m13867U(List graphIdList) {
        Matrix matrix;
        InterfaceC5181c interfaceC5181cMo25454n;
        AbstractC9979u.m20294g(graphIdList, "graphIdList");
        m13866T();
        C11256c c11256c = this.f17896y;
        List listMo2717f = null;
        if (c11256c == null) {
            AbstractC9979u.m20312y("functionManager");
            c11256c = null;
        }
        c11256c.m25163i();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null) {
            listMo2717f = interfaceC5181cMo25454n.mo2717f();
        }
        if (listMo2717f != null && (!listMo2717f.isEmpty())) {
            for (int size = listMo2717f.size() - 1; -1 < size; size--) {
                if (graphIdList.contains(((InterfaceC5181c) listMo2717f.get(size)).getId())) {
                    this.f17897z.add(listMo2717f.get(size));
                    ArrayList arrayList = this.f17885A;
                    InterfaceC5181c interfaceC5181c = (InterfaceC5181c) listMo2717f.get(size);
                    C11373a c11373aM13727i = m13727i();
                    if (c11373aM13727i == null || (matrix = c11373aM13727i.m25311b()) == null) {
                        matrix = new Matrix();
                    }
                    arrayList.add(interfaceC5181c.mo2721j(matrix));
                }
            }
        }
        m13864Q(this.f17897z, this.f17885A);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction
    /* renamed from: k */
    public void mo13729k(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        super.mo13729k(listener);
        this.f17896y = new C11256c(listener);
    }
}
