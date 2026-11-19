package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p117g5.InterfaceC8055c;
import p147j5.AbstractC8216c;
import p263u5.AbstractC9695n;
import p263u5.C9690i;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class EraseWritingAction extends AbstractC6943b {

    /* renamed from: p */
    public Paint f8229p;

    /* renamed from: q */
    public final Path f8230q;

    /* renamed from: r */
    public float f8231r;

    /* renamed from: s */
    public final HashMap f8232s;

    /* renamed from: t */
    public final HashMap f8233t;

    public EraseWritingAction() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(20.0f);
        this.f8229p = paint;
        this.f8230q = new Path();
        this.f8231r = 40.0f;
        this.f8232s = new HashMap();
        this.f8233t = new HashMap();
        C9690i.f17127a.m16180c(EventKey.DELETE_ACTION, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.1
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
                InterfaceC8055c interfaceC8055cMo210m;
                List<InterfaceC8055c> listMo12796e;
                Matrix matrixM17344b;
                EraseWritingAction.this.f8232s.clear();
                InterfaceC0039c interfaceC0039cM7083g = EraseWritingAction.this.m7083g();
                if (interfaceC0039cM7083g == null || (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) == null || (listMo12796e = interfaceC8055cMo210m.mo12796e()) == null) {
                    return;
                }
                EraseWritingAction eraseWritingAction = EraseWritingAction.this;
                for (InterfaceC8055c interfaceC8055c : listMo12796e) {
                    RectF rectF = new RectF(interfaceC8055c.mo12797f());
                    Matrix matrix = new Matrix();
                    matrix.postConcat(interfaceC8055c.mo12794b());
                    C9998a c9998aM7085i = eraseWritingAction.m7085i();
                    if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
                        matrix.postConcat(matrixM17344b);
                    }
                    matrix.mapRect(rectF);
                    for (InterfaceC8055c interfaceC8055c2 : interfaceC8055c.mo12796e()) {
                        C9998a c9998aM7085i2 = eraseWritingAction.m7085i();
                        RectF rectFMo12799i = interfaceC8055c2.mo12799i(c9998aM7085i2 != null ? c9998aM7085i2.m17344b() : null);
                        eraseWritingAction.f8232s.put(interfaceC8055c2.getId(), rectFMo12799i);
                        rectF.union(rectFMo12799i);
                    }
                    eraseWritingAction.f8232s.put(interfaceC8055c.getId(), rectF);
                }
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchDown$1
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
                C9690i c9690i = C9690i.f17127a;
                c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f8235a.m7137N(event);
                this.f8235a.m7136M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchMove$1
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
                this.f8237a.m7137N(event);
                this.f8237a.m7136M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchUp$1
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
                this.f8239a.m7136M(event);
            }
        });
        m7135L();
        this.f8230q.reset();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            Path path = this.f8230q;
            Paint paint = this.f8229p;
            C9998a c9998aM7085i = m7085i();
            interfaceC0039cM7083g.mo175B(path, paint, c9998aM7085i != null ? c9998aM7085i.m17344b() : null);
        }
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo202e();
        }
    }

    /* renamed from: L */
    public final void m7135L() {
        InterfaceC9822b interfaceC9822bM7084h;
        Set<Long> setKeySet = this.f8233t.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "deleteCommandMap.keys");
        for (Long it : setKeySet) {
            InterfaceC9822b interfaceC9822bM7084h2 = m7084h();
            if (interfaceC9822bM7084h2 != null) {
                Object obj = this.f8233t.get(it);
                Intrinsics.checkNotNull(obj);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC9822bM7084h2.mo16695n((List) obj, it.longValue());
            }
        }
        if (!this.f8233t.isEmpty() && (interfaceC9822bM7084h = m7084h()) != null) {
            interfaceC9822bM7084h.mo16693l();
        }
        this.f8233t.clear();
    }

    /* renamed from: M */
    public final void m7136M(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC8055c interfaceC8055cMo210m;
        List listM7139P = m7139P(touchEvent);
        if (listM7139P.isEmpty()) {
            return;
        }
        this.f8233t.put(Long.valueOf(System.currentTimeMillis()), listM7139P);
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null) {
            interfaceC8055cMo210m.mo12800j(listM7139P);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EraseWritingAction:deleteGraph -> graphList: ");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM7139P, 10));
        Iterator it = listM7139P.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8055c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m2956i(sb.toString());
        RectF rectFM7142S = m7142S(listM7139P);
        rectFM7142S.left -= 4.0f;
        rectFM7142S.top -= 4.0f;
        rectFM7142S.right += 4.0f;
        rectFM7142S.bottom += 4.0f;
        List listM7140Q = m7140Q(rectFM7142S);
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo209l(rectFM7142S, listM7140Q);
        }
    }

    /* renamed from: N */
    public final void m7137N(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM17344b;
        Matrix matrixM16200b;
        this.f8230q.reset();
        Path path = this.f8230q;
        float x9 = touchEvent.getX();
        float y9 = touchEvent.getY();
        C9998a c9998aM7085i = m7085i();
        path.addCircle(x9, y9, (c9998aM7085i == null || (matrixM17344b = c9998aM7085i.m17344b()) == null || (matrixM16200b = AbstractC9695n.m16200b(matrixM17344b)) == null) ? 0.0f : matrixM16200b.mapRadius(this.f8231r), Path.Direction.CW);
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            Path path2 = this.f8230q;
            Paint paint = this.f8229p;
            C9998a c9998aM7085i2 = m7085i();
            interfaceC0039cM7083g.mo175B(path2, paint, c9998aM7085i2 != null ? c9998aM7085i2.m17344b() : null);
        }
    }

    /* renamed from: O */
    public final void m7138O(List list, float f10, float f11, float f12) {
        InterfaceC8055c interfaceC8055cMo210m;
        List listMo12796e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
            InterfaceC0039c interfaceC0039cM7083g = m7083g();
            if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null && (listMo12796e = interfaceC8055cMo210m.mo12796e()) != null) {
                int size = listMo12796e.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    InterfaceC8055c parent = interfaceC8055c.getParent();
                    if (Intrinsics.areEqual(parent != null ? parent.getId() : null, ((InterfaceC8055c) listMo12796e.get(size)).getId())) {
                        break;
                    } else if (RectF.intersects(((InterfaceC8055c) listMo12796e.get(size)).mo12795c(), interfaceC8055c.mo12795c()) && RectF.intersects(((InterfaceC8055c) listMo12796e.get(size)).mo12795c(), new RectF(f10 - f12, f11 - f12, f10 + f12, f11 + f12))) {
                        arrayList.add(interfaceC8055c);
                    }
                }
            }
        }
        list.removeAll(arrayList);
    }

    /* renamed from: P */
    public final List m7139P(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC8055c interfaceC8055cMo210m;
        List<InterfaceC8055c> listMo12796e;
        Matrix matrixM17344b;
        Matrix matrixM16200b;
        Matrix matrixM17344b2;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {touchEvent.getX(), touchEvent.getY()};
        C9998a c9998aM7085i = m7085i();
        if (c9998aM7085i != null && (matrixM17344b2 = c9998aM7085i.m17344b()) != null) {
            matrixM17344b2.mapPoints(fArr);
        }
        float f10 = fArr[0];
        float f11 = this.f8231r;
        float f12 = fArr[1];
        RectF rectF = new RectF(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        C9998a c9998aM7085i2 = m7085i();
        float fMapRadius = (c9998aM7085i2 == null || (matrixM17344b = c9998aM7085i2.m17344b()) == null || (matrixM16200b = AbstractC9695n.m16200b(matrixM17344b)) == null) ? 0.0f : matrixM16200b.mapRadius(this.f8231r);
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null && (listMo12796e = interfaceC8055cMo210m.mo12796e()) != null) {
            for (InterfaceC8055c interfaceC8055c : listMo12796e) {
                if (RectF.intersects(m7141R(interfaceC8055c), rectF)) {
                    for (InterfaceC8055c interfaceC8055c2 : interfaceC8055c.mo12796e()) {
                        if (RectF.intersects(m7141R(interfaceC8055c2), rectF) && interfaceC8055c2.mo12802o(touchEvent.getX(), touchEvent.getY(), fMapRadius)) {
                            arrayList.add(interfaceC8055c2);
                        }
                    }
                }
            }
        }
        m7138O(arrayList, touchEvent.getX(), touchEvent.getY(), fMapRadius);
        return arrayList;
    }

    /* renamed from: Q */
    public final List m7140Q(RectF rectF) {
        InterfaceC8055c interfaceC8055cMo210m;
        List<InterfaceC8055c> listMo12796e;
        ArrayList arrayList = new ArrayList();
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m = interfaceC0039cM7083g.mo210m()) != null && (listMo12796e = interfaceC8055cMo210m.mo12796e()) != null) {
            for (InterfaceC8055c interfaceC8055c : listMo12796e) {
                if (RectF.intersects(rectF, m7141R(interfaceC8055c)) && RectF.intersects(rectF, m7141R(interfaceC8055c))) {
                    arrayList.add(interfaceC8055c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final RectF m7141R(InterfaceC8055c interfaceC8055c) {
        Matrix matrixM17344b;
        if (!this.f8232s.containsKey(interfaceC8055c.getId())) {
            if (interfaceC8055c instanceof GroupGraph) {
                RectF rectF = new RectF(interfaceC8055c.mo12797f());
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC8055c.mo12794b());
                C9998a c9998aM7085i = m7085i();
                if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
                    matrix.postConcat(matrixM17344b);
                }
                matrix.mapRect(rectF);
                for (InterfaceC8055c childGraph : ((GroupGraph) interfaceC8055c).mo12796e()) {
                    Intrinsics.checkNotNullExpressionValue(childGraph, "childGraph");
                    rectF.union(m7141R(childGraph));
                }
                this.f8232s.put(interfaceC8055c.getId(), rectF);
            } else if (interfaceC8055c instanceof AbstractC8216c) {
                HashMap map = this.f8232s;
                String id = interfaceC8055c.getId();
                C9998a c9998aM7085i2 = m7085i();
                map.put(id, interfaceC8055c.mo12799i(c9998aM7085i2 != null ? c9998aM7085i2.m17344b() : null));
            }
        }
        Object obj = this.f8232s.get(interfaceC8055c.getId());
        Intrinsics.checkNotNull(obj);
        return (RectF) obj;
    }

    /* renamed from: S */
    public final RectF m7142S(List deleteGraphList) {
        Intrinsics.checkNotNullParameter(deleteGraphList, "deleteGraphList");
        RectF rectF = new RectF();
        Iterator it = deleteGraphList.iterator();
        while (it.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
            if (rectF.isEmpty()) {
                rectF.set(m7141R(interfaceC8055c));
            } else {
                rectF.union(m7141R(interfaceC8055c));
            }
        }
        return rectF;
    }

    /* renamed from: T */
    public void m7143T() {
        this.f8230q.reset();
        C9763b c9763bM7082f = m7082f();
        this.f8231r = c9763bM7082f != null ? c9763bM7082f.m16505p() : 40.0f;
    }
}
