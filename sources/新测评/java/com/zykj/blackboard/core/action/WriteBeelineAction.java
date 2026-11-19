package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7347h;
import p077e5.C7350k;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p210q4.AbstractC8886a;
import p243t4.C9382a;

/* loaded from: classes4.dex */
public final class WriteBeelineAction extends BaseWriteAction {
    public WriteBeelineAction() {
        C7347h.f11914a.m11759c(EventKey.WRITE_BEELINE_NEW_GROUP, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.WriteBeelineAction.1
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
                WriteBeelineAction.this.m6021f0(true);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: Q */
    public AbstractC8886a mo6006Q(String graphId) {
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        C7350k c7350k = C7350k.f11918a;
        C9382a c9382a = new C9382a(graphId, c7350k.m11768d(m6007R()), null, null, null, 28, null);
        c9382a.m15699Q(m6007R());
        c9382a.m15695M(c7350k.m11767c(m6007R()));
        c9382a.m15694L(new Paint(m6011V()), m6012W(), m6013X());
        c9382a.mo15005v();
        return c9382a;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: S */
    public EzyGraphEnum.GraphEnum mo6008S() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: Z */
    public void mo6015Z(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6007R().add(event);
        m6022g0(event.getX());
        m6023h0(event.getY());
        m6014Y().reset();
        m6014Y().moveTo(m6009T(), m6010U());
        m6014Y().lineTo(m6009T(), m6010U());
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            Path pathM6014Y = m6014Y();
            Paint paintM6011V = m6011V();
            C7792a c7792aM5990i = m5990i();
            interfaceC7880cM5988g.mo13414A(pathM6014Y, paintM6011V, c7792aM5990i != null ? c7792aM5990i.m13188b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: a0 */
    public void mo6016a0(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6014Y().reset();
        m6014Y().moveTo(m6009T(), m6010U());
        m6014Y().lineTo(event.getX(), event.getY());
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            Path pathM6014Y = m6014Y();
            Paint paintM6011V = m6011V();
            C7792a c7792aM5990i = m5990i();
            interfaceC7880cM5988g.mo13414A(pathM6014Y, paintM6011V, c7792aM5990i != null ? c7792aM5990i.m13188b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: b0 */
    public void mo6017b0(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6007R().add(event);
        m6014Y().reset();
        m6014Y().moveTo(m6009T(), m6010U());
        m6014Y().lineTo(event.getX(), event.getY());
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            Path pathM6014Y = m6014Y();
            Paint paintM6011V = m6011V();
            C7792a c7792aM5990i = m5990i();
            interfaceC7880cM5988g.mo13414A(pathM6014Y, paintM6011V, c7792aM5990i != null ? c7792aM5990i.m13188b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: c0 */
    public void mo6018c0() {
        Paint paintM6011V = m6011V();
        BoardConfig boardConfigM5987f = m5987f();
        paintM6011V.setColor(boardConfigM5987f != null ? boardConfigM5987f.getBeelinePaintColor() : ViewCompat.MEASURED_STATE_MASK);
        BoardConfig boardConfigM5987f2 = m5987f();
        paintM6011V.setStrokeWidth(boardConfigM5987f2 != null ? boardConfigM5987f2.getBeelinePaintWidth() : 3.0f);
        paintM6011V.setStyle(Paint.Style.STROKE);
        paintM6011V.setStrokeCap(Paint.Cap.ROUND);
        paintM6011V.setStrokeJoin(Paint.Join.ROUND);
        paintM6011V.setDither(true);
        paintM6011V.setAntiAlias(true);
        BoardConfig boardConfigM5987f3 = m5987f();
        if (boardConfigM5987f3 == null || !boardConfigM5987f3.getIsDottedLine()) {
            m6024i0(1.0f);
            m6025j0(0.0f);
            paintM6011V.setPathEffect(null);
        } else {
            BoardConfig boardConfigM5987f4 = m5987f();
            m6024i0(boardConfigM5987f4 != null ? boardConfigM5987f4.getPaintDottedLineItemLength() : 30.0f);
            BoardConfig boardConfigM5987f5 = m5987f();
            m6025j0(boardConfigM5987f5 != null ? boardConfigM5987f5.getPaintDottedLineSpacing() : 15.0f);
            paintM6011V.setPathEffect(new DashPathEffect(new float[]{m6012W(), m6013X()}, 0.0f));
        }
    }
}
