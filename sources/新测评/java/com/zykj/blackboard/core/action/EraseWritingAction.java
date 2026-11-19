package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.bean.BoardConfig;
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
import p077e5.AbstractC7352m;
import p077e5.C7347h;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.InterfaceC8888c;
import p243t4.AbstractC9384c;

/* loaded from: classes4.dex */
public final class EraseWritingAction extends AbstractC6626b {

    /* renamed from: p */
    public Paint f6946p;

    /* renamed from: q */
    public final Path f6947q;

    /* renamed from: r */
    public float f6948r;

    /* renamed from: s */
    public final HashMap f6949s;

    /* renamed from: t */
    public final HashMap f6950t;

    public EraseWritingAction() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(20.0f);
        this.f6946p = paint;
        this.f6947q = new Path();
        this.f6948r = 40.0f;
        this.f6949s = new HashMap();
        this.f6950t = new HashMap();
        C7347h.f11914a.m11759c(EventKey.DELETE_ACTION, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.1
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
                InterfaceC8888c interfaceC8888cMo13449n;
                List<InterfaceC8888c> listMo14995f;
                Matrix matrixM13188b;
                EraseWritingAction.this.f6949s.clear();
                InterfaceC7880c interfaceC7880cM5988g = EraseWritingAction.this.m5988g();
                if (interfaceC7880cM5988g == null || (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) == null || (listMo14995f = interfaceC8888cMo13449n.mo14995f()) == null) {
                    return;
                }
                EraseWritingAction eraseWritingAction = EraseWritingAction.this;
                for (InterfaceC8888c interfaceC8888c : listMo14995f) {
                    RectF rectF = new RectF(interfaceC8888c.mo14996g());
                    Matrix matrix = new Matrix();
                    matrix.postConcat(interfaceC8888c.mo14993b());
                    C7792a c7792aM5990i = eraseWritingAction.m5990i();
                    if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
                        matrix.postConcat(matrixM13188b);
                    }
                    matrix.mapRect(rectF);
                    for (InterfaceC8888c interfaceC8888c2 : interfaceC8888c.mo14995f()) {
                        C7792a c7792aM5990i2 = eraseWritingAction.m5990i();
                        RectF rectFMo14999j = interfaceC8888c2.mo14999j(c7792aM5990i2 != null ? c7792aM5990i2.m13188b() : null);
                        eraseWritingAction.f6949s.put(interfaceC8888c2.getId(), rectFMo14999j);
                        rectF.union(rectFMo14999j);
                    }
                    eraseWritingAction.f6949s.put(interfaceC8888c.getId(), rectF);
                }
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchDown$1
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
                C7347h c7347h = C7347h.f11914a;
                c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f6952a.m6041N(event);
                this.f6952a.m6040M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchMove$1
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
                this.f6954a.m6041N(event);
                this.f6954a.m6040M(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.EraseWritingAction$singleTouchUp$1
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
                this.f6956a.m6040M(event);
            }
        });
        m6039L();
        this.f6947q.reset();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            Path path = this.f6947q;
            Paint paint = this.f6946p;
            C7792a c7792aM5990i = m5990i();
            interfaceC7880cM5988g.mo13414A(path, paint, c7792aM5990i != null ? c7792aM5990i.m13188b() : null);
        }
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13440e();
        }
    }

    /* renamed from: L */
    public final void m6039L() {
        InterfaceC7522b interfaceC7522bM5989h;
        Set<Long> setKeySet = this.f6950t.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "deleteCommandMap.keys");
        for (Long it : setKeySet) {
            InterfaceC7522b interfaceC7522bM5989h2 = m5989h();
            if (interfaceC7522bM5989h2 != null) {
                Object obj = this.f6950t.get(it);
                Intrinsics.checkNotNull(obj);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                interfaceC7522bM5989h2.mo12249n((List) obj, it.longValue());
            }
        }
        if (!this.f6950t.isEmpty() && (interfaceC7522bM5989h = m5989h()) != null) {
            interfaceC7522bM5989h.mo12247l();
        }
        this.f6950t.clear();
    }

    /* renamed from: M */
    public final void m6040M(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC8888c interfaceC8888cMo13449n;
        List listM6043P = m6043P(touchEvent);
        if (listM6043P.isEmpty()) {
            return;
        }
        this.f6950t.put(Long.valueOf(System.currentTimeMillis()), listM6043P);
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null) {
            interfaceC8888cMo13449n.mo15000k(listM6043P);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EraseWritingAction:deleteGraph -> graphList: ");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM6043P, 10));
        Iterator it = listM6043P.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8888c) it.next()).getId());
        }
        sb.append(arrayList);
        LogUtils.m3239i(sb.toString());
        RectF rectFM6046S = m6046S(listM6043P);
        rectFM6046S.left -= 4.0f;
        rectFM6046S.top -= 4.0f;
        rectFM6046S.right += 4.0f;
        rectFM6046S.bottom += 4.0f;
        List listM6044Q = m6044Q(rectFM6046S);
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13445j(rectFM6046S, listM6044Q);
        }
    }

    /* renamed from: N */
    public final void m6041N(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixM13188b;
        Matrix matrixM11777b;
        this.f6947q.reset();
        Path path = this.f6947q;
        float x9 = touchEvent.getX();
        float y9 = touchEvent.getY();
        C7792a c7792aM5990i = m5990i();
        path.addCircle(x9, y9, (c7792aM5990i == null || (matrixM13188b = c7792aM5990i.m13188b()) == null || (matrixM11777b = AbstractC7352m.m11777b(matrixM13188b)) == null) ? 0.0f : matrixM11777b.mapRadius(this.f6948r), Path.Direction.CW);
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            Path path2 = this.f6947q;
            Paint paint = this.f6946p;
            C7792a c7792aM5990i2 = m5990i();
            interfaceC7880cM5988g.mo13414A(path2, paint, c7792aM5990i2 != null ? c7792aM5990i2.m13188b() : null);
        }
    }

    /* renamed from: O */
    public final void m6042O(List list, float f10, float f11, float f12) {
        InterfaceC8888c interfaceC8888cMo13449n;
        List listMo14995f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
            InterfaceC7880c interfaceC7880cM5988g = m5988g();
            if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null && (listMo14995f = interfaceC8888cMo13449n.mo14995f()) != null) {
                int size = listMo14995f.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    InterfaceC8888c parent = interfaceC8888c.getParent();
                    if (Intrinsics.areEqual(parent != null ? parent.getId() : null, ((InterfaceC8888c) listMo14995f.get(size)).getId())) {
                        break;
                    } else if (RectF.intersects(((InterfaceC8888c) listMo14995f.get(size)).mo14994d(), interfaceC8888c.mo14994d()) && RectF.intersects(((InterfaceC8888c) listMo14995f.get(size)).mo14994d(), new RectF(f10 - f12, f11 - f12, f10 + f12, f11 + f12))) {
                        arrayList.add(interfaceC8888c);
                    }
                }
            }
        }
        list.removeAll(arrayList);
    }

    /* renamed from: P */
    public final List m6043P(EzyTouchEvent.TouchEvent touchEvent) {
        InterfaceC8888c interfaceC8888cMo13449n;
        List<InterfaceC8888c> listMo14995f;
        Matrix matrixM13188b;
        Matrix matrixM11777b;
        Matrix matrixM13188b2;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {touchEvent.getX(), touchEvent.getY()};
        C7792a c7792aM5990i = m5990i();
        if (c7792aM5990i != null && (matrixM13188b2 = c7792aM5990i.m13188b()) != null) {
            matrixM13188b2.mapPoints(fArr);
        }
        float f10 = fArr[0];
        float f11 = this.f6948r;
        float f12 = fArr[1];
        RectF rectF = new RectF(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        C7792a c7792aM5990i2 = m5990i();
        float fMapRadius = (c7792aM5990i2 == null || (matrixM13188b = c7792aM5990i2.m13188b()) == null || (matrixM11777b = AbstractC7352m.m11777b(matrixM13188b)) == null) ? 0.0f : matrixM11777b.mapRadius(this.f6948r);
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null && (listMo14995f = interfaceC8888cMo13449n.mo14995f()) != null) {
            for (InterfaceC8888c interfaceC8888c : listMo14995f) {
                if (RectF.intersects(m6045R(interfaceC8888c), rectF)) {
                    for (InterfaceC8888c interfaceC8888c2 : interfaceC8888c.mo14995f()) {
                        if (RectF.intersects(m6045R(interfaceC8888c2), rectF) && interfaceC8888c2.mo15002p(touchEvent.getX(), touchEvent.getY(), fMapRadius)) {
                            arrayList.add(interfaceC8888c2);
                        }
                    }
                }
            }
        }
        m6042O(arrayList, touchEvent.getX(), touchEvent.getY(), fMapRadius);
        return arrayList;
    }

    /* renamed from: Q */
    public final List m6044Q(RectF rectF) {
        InterfaceC8888c interfaceC8888cMo13449n;
        List<InterfaceC8888c> listMo14995f;
        ArrayList arrayList = new ArrayList();
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n = interfaceC7880cM5988g.mo13449n()) != null && (listMo14995f = interfaceC8888cMo13449n.mo14995f()) != null) {
            for (InterfaceC8888c interfaceC8888c : listMo14995f) {
                if (RectF.intersects(rectF, m6045R(interfaceC8888c)) && RectF.intersects(rectF, m6045R(interfaceC8888c))) {
                    arrayList.add(interfaceC8888c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    public final RectF m6045R(InterfaceC8888c interfaceC8888c) {
        Matrix matrixM13188b;
        if (!this.f6949s.containsKey(interfaceC8888c.getId())) {
            if (interfaceC8888c instanceof GroupGraph) {
                RectF rectF = new RectF(interfaceC8888c.mo14996g());
                Matrix matrix = new Matrix();
                matrix.postConcat(interfaceC8888c.mo14993b());
                C7792a c7792aM5990i = m5990i();
                if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
                    matrix.postConcat(matrixM13188b);
                }
                matrix.mapRect(rectF);
                for (InterfaceC8888c childGraph : ((GroupGraph) interfaceC8888c).mo14995f()) {
                    Intrinsics.checkNotNullExpressionValue(childGraph, "childGraph");
                    rectF.union(m6045R(childGraph));
                }
                this.f6949s.put(interfaceC8888c.getId(), rectF);
            } else if (interfaceC8888c instanceof AbstractC9384c) {
                HashMap map = this.f6949s;
                String id = interfaceC8888c.getId();
                C7792a c7792aM5990i2 = m5990i();
                map.put(id, interfaceC8888c.mo14999j(c7792aM5990i2 != null ? c7792aM5990i2.m13188b() : null));
            }
        }
        Object obj = this.f6949s.get(interfaceC8888c.getId());
        Intrinsics.checkNotNull(obj);
        return (RectF) obj;
    }

    /* renamed from: S */
    public final RectF m6046S(List deleteGraphList) {
        Intrinsics.checkNotNullParameter(deleteGraphList, "deleteGraphList");
        RectF rectF = new RectF();
        Iterator it = deleteGraphList.iterator();
        while (it.hasNext()) {
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
            if (rectF.isEmpty()) {
                rectF.set(m6045R(interfaceC8888c));
            } else {
                rectF.union(m6045R(interfaceC8888c));
            }
        }
        return rectF;
    }

    /* renamed from: T */
    public void m6047T() {
        this.f6947q.reset();
        BoardConfig boardConfigM5987f = m5987f();
        this.f6948r = boardConfigM5987f != null ? boardConfigM5987f.getEraserWidth() : 40.0f;
    }
}
