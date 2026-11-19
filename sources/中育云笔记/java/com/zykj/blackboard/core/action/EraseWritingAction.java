package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import ba.InterfaceC5181c;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.C10346i;
import p134ea.AbstractC9113c;
import p181hd.InterfaceC9529a;
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10980x;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class EraseWritingAction extends AbstractC8326b {

    /* renamed from: p */
    public Paint f17795p;

    /* renamed from: q */
    public final Path f17796q;

    /* renamed from: r */
    public float f17797r;

    /* renamed from: s */
    public final HashMap f17798s;

    /* renamed from: t */
    public final HashMap f17799t;

    public EraseWritingAction() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(20.0f);
        this.f17795p = paint;
        this.f17796q = new Path();
        this.f17797r = 40.0f;
        this.f17798s = new HashMap();
        this.f17799t = new HashMap();
        C10346i.f24652a.m21641c(EventKey.DELETE_ACTION, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33991invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33991invoke() {
                InterfaceC5181c interfaceC5181cMo25454n;
                List<InterfaceC5181c> listMo2717f;
                Matrix matrixM25311b;
                EraseWritingAction.this.f17798s.clear();
                InterfaceC11552c interfaceC11552cM13725g = EraseWritingAction.this.m13725g();
                if (interfaceC11552cM13725g == null || (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) == null || (listMo2717f = interfaceC5181cMo25454n.mo2717f()) == null) {
                    return;
                }
                EraseWritingAction eraseWritingAction = EraseWritingAction.this;
                for (InterfaceC5181c interfaceC5181c : listMo2717f) {
                    RectF rectF = new RectF(interfaceC5181c.mo2718g());
                    Matrix matrix = new Matrix();
                    matrix.postConcat(interfaceC5181c.mo2714b());
                    C11373a c11373aM13727i = eraseWritingAction.m13727i();
                    if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
                        matrix.postConcat(matrixM25311b);
                    }
                    matrix.mapRect(rectF);
                    for (InterfaceC5181c interfaceC5181c2 : interfaceC5181c.mo2717f()) {
                        C11373a c11373aM13727i2 = eraseWritingAction.m13727i();
                        RectF rectFMo2721j = interfaceC5181c2.mo2721j(c11373aM13727i2 != null ? c11373aM13727i2.m25311b() : null);
                        eraseWritingAction.f17798s.put(interfaceC5181c2.getId(), rectFMo2721j);
                        rectF.union(rectFMo2721j);
                    }
                    eraseWritingAction.f17798s.put(interfaceC5181c.getId(), rectF);
                }
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(final EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchDown$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33992invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33992invoke() {
                C10346i c10346i = C10346i.f24652a;
                c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f17801c.m13779N(event);
                this.f17801c.m13778M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(final EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchMove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33993invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33993invoke() {
                this.f17803c.m13779N(event);
                this.f17803c.m13778M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(final EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchUp$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33994invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33994invoke() {
                this.f17805c.m13778M(event);
            }
        });
        m13777L();
        this.f17796q.reset();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            Path path = this.f17796q;
            Paint paint = this.f17795p;
            C11373a c11373aM13727i = m13727i();
            interfaceC11552cM13725g.mo25416B(path, paint, c11373aM13727i != null ? c11373aM13727i.m25311b() : null);
        }
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25447g();
        }
    }

    /* renamed from: L */
    public final void m13777L() {
        InterfaceC10918b interfaceC10918bM13726h;
        Set<Long> setKeySet = this.f17799t.keySet();
        AbstractC9979u.m20293f(setKeySet, "deleteCommandMap.keys");
        for (Long it : setKeySet) {
            InterfaceC10918b interfaceC10918bM13726h2 = m13726h();
            if (interfaceC10918bM13726h2 != null) {
                Object obj = this.f17799t.get(it);
                AbstractC9979u.m20291d(obj);
                AbstractC9979u.m20293f(it, "it");
                interfaceC10918bM13726h2.mo23775o((List) obj, it.longValue());
            }
        }
        if (!this.f17799t.isEmpty() && (interfaceC10918bM13726h = m13726h()) != null) {
            interfaceC10918bM13726h.mo23772l();
        }
        this.f17799t.clear();
    }

    /* renamed from: M */
    public final void m13778M(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC5181c interfaceC5181cMo25454n;
        List listM13781P = m13781P(touchEvent);
        if (listM13781P.isEmpty()) {
            return;
        }
        this.f17799t.put(Long.valueOf(System.currentTimeMillis()), listM13781P);
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null) {
            interfaceC5181cMo25454n.mo2722k(listM13781P);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EraseWritingAction:deleteGraph -> graphList: ");
        List list = listM13781P;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC5181c) it.next()).getId());
        }
        sb2.append(arrayList);
        LogUtils.m3888i(sb2.toString());
        RectF rectFM13784S = m13784S(listM13781P);
        rectFM13784S.left -= 4.0f;
        rectFM13784S.top -= 4.0f;
        rectFM13784S.right += 4.0f;
        rectFM13784S.bottom += 4.0f;
        List listM13782Q = m13782Q(rectFM13784S);
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25453m(rectFM13784S, listM13782Q);
        }
    }

    /* renamed from: N */
    public final void m13779N(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM25311b;
        Matrix matrixM21660b;
        this.f17796q.reset();
        Path path = this.f17796q;
        float x10 = touchEvent.getX();
        float y10 = touchEvent.getY();
        C11373a c11373aM13727i = m13727i();
        path.addCircle(x10, y10, (c11373aM13727i == null || (matrixM25311b = c11373aM13727i.m25311b()) == null || (matrixM21660b = AbstractC10351n.m21660b(matrixM25311b)) == null) ? 0.0f : matrixM21660b.mapRadius(this.f17797r), Path.Direction.CW);
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            Path path2 = this.f17796q;
            Paint paint = this.f17795p;
            C11373a c11373aM13727i2 = m13727i();
            interfaceC11552cM13725g.mo25416B(path2, paint, c11373aM13727i2 != null ? c11373aM13727i2.m25311b() : null);
        }
    }

    /* renamed from: O */
    public final void m13780O(List list, float f10, float f11, float f12) {
        InterfaceC5181c interfaceC5181cMo25454n;
        List listMo2717f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
            InterfaceC11552c interfaceC11552cM13725g = m13725g();
            if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null && (listMo2717f = interfaceC5181cMo25454n.mo2717f()) != null) {
                int size = listMo2717f.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    InterfaceC5181c parent = interfaceC5181c.getParent();
                    if (AbstractC9979u.m20289b(parent != null ? parent.getId() : null, ((InterfaceC5181c) listMo2717f.get(size)).getId())) {
                        break;
                    } else if (RectF.intersects(((InterfaceC5181c) listMo2717f.get(size)).mo2715d(), interfaceC5181c.mo2715d()) && RectF.intersects(((InterfaceC5181c) listMo2717f.get(size)).mo2715d(), new RectF(f10 - f12, f11 - f12, f10 + f12, f11 + f12))) {
                        arrayList.add(interfaceC5181c);
                    }
                }
            }
        }
        list.removeAll(arrayList);
    }

    /* renamed from: P */
    public final List m13781P(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC5181c interfaceC5181cMo25454n;
        List<InterfaceC5181c> listMo2717f;
        Matrix matrixM25311b;
        Matrix matrixM21660b;
        Matrix matrixM25311b2;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {touchEvent.getX(), touchEvent.getY()};
        C11373a c11373aM13727i = m13727i();
        if (c11373aM13727i != null && (matrixM25311b2 = c11373aM13727i.m25311b()) != null) {
            matrixM25311b2.mapPoints(fArr);
        }
        float f10 = fArr[0];
        float f11 = this.f17797r;
        float f12 = fArr[1];
        RectF rectF = new RectF(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        C11373a c11373aM13727i2 = m13727i();
        float fMapRadius = (c11373aM13727i2 == null || (matrixM25311b = c11373aM13727i2.m25311b()) == null || (matrixM21660b = AbstractC10351n.m21660b(matrixM25311b)) == null) ? 0.0f : matrixM21660b.mapRadius(this.f17797r);
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null && (listMo2717f = interfaceC5181cMo25454n.mo2717f()) != null) {
            for (InterfaceC5181c interfaceC5181c : listMo2717f) {
                if (RectF.intersects(m13783R(interfaceC5181c), rectF)) {
                    for (InterfaceC5181c interfaceC5181c2 : interfaceC5181c.mo2717f()) {
                        if (RectF.intersects(m13783R(interfaceC5181c2), rectF) && interfaceC5181c2.mo2725q(touchEvent.getX(), touchEvent.getY(), fMapRadius)) {
                            arrayList.add(interfaceC5181c2);
                        }
                    }
                }
            }
        }
        m13780O(arrayList, touchEvent.getX(), touchEvent.getY(), fMapRadius);
        return arrayList;
    }

    /* renamed from: Q */
    public final List m13782Q(RectF rectF) {
        InterfaceC5181c interfaceC5181cMo25454n;
        List<InterfaceC5181c> listMo2717f;
        ArrayList arrayList = new ArrayList();
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null && (listMo2717f = interfaceC5181cMo25454n.mo2717f()) != null) {
            for (InterfaceC5181c interfaceC5181c : listMo2717f) {
                if (RectF.intersects(rectF, m13783R(interfaceC5181c)) && RectF.intersects(rectF, m13783R(interfaceC5181c))) {
                    arrayList.add(interfaceC5181c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final RectF m13783R(InterfaceC5181c interfaceC5181c) {
        Matrix matrixM25311b;
        if (!this.f17798s.containsKey(interfaceC5181c.getId())) {
            if (interfaceC5181c instanceof GroupGraph) {
                RectF rectF = new RectF(interfaceC5181c.mo2718g());
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC5181c.mo2714b());
                C11373a c11373aM13727i = m13727i();
                if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
                    matrix.postConcat(matrixM25311b);
                }
                matrix.mapRect(rectF);
                for (InterfaceC5181c childGraph : ((GroupGraph) interfaceC5181c).mo2717f()) {
                    AbstractC9979u.m20293f(childGraph, "childGraph");
                    rectF.union(m13783R(childGraph));
                }
                this.f17798s.put(interfaceC5181c.getId(), rectF);
            } else if (interfaceC5181c instanceof AbstractC9113c) {
                HashMap map = this.f17798s;
                String id2 = interfaceC5181c.getId();
                C11373a c11373aM13727i2 = m13727i();
                map.put(id2, interfaceC5181c.mo2721j(c11373aM13727i2 != null ? c11373aM13727i2.m25311b() : null));
            }
        }
        Object obj = this.f17798s.get(interfaceC5181c.getId());
        AbstractC9979u.m20291d(obj);
        return (RectF) obj;
    }

    /* renamed from: S */
    public final RectF m13784S(List deleteGraphList) {
        AbstractC9979u.m20294g(deleteGraphList, "deleteGraphList");
        RectF rectF = new RectF();
        Iterator it = deleteGraphList.iterator();
        while (it.hasNext()) {
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
            if (rectF.isEmpty()) {
                rectF.set(m13783R(interfaceC5181c));
            } else {
                rectF.union(m13783R(interfaceC5181c));
            }
        }
        return rectF;
    }

    /* renamed from: T */
    public void m13785T() {
        this.f17796q.reset();
        C10762b c10762bM13724f = m13724f();
        this.f17797r = c10762bM13724f != null ? c10762bM13724f.m22909p() : 40.0f;
    }
}
