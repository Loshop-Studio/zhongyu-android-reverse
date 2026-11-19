package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p117g5.AbstractC8053a;
import p147j5.C8215b;
import p263u5.C9690i;
import p263u5.C9693l;
import p272v4.C9763b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class WritingAction extends BaseWriteAction {
    public WritingAction() {
        C9690i.f17127a.m16180c(EventKey.WRITE_NEW_GROUP, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.WritingAction.1
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
                WritingAction.this.m7117g0(true);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: Q */
    public AbstractC8053a mo7101Q(String graphId) {
        Intrinsics.checkNotNullParameter(graphId, "graphId");
        C9693l c9693l = C9693l.f17131a;
        C8215b c8215b = new C8215b(graphId, c9693l.m16191d(m7103S()), null, null, null, 28, null);
        c8215b.m13250P(m7103S());
        c8215b.m13246L(c9693l.m16190c(m7103S()));
        c8215b.m13245K(new Paint(m7107W()), m7108X(), m7109Y());
        c8215b.mo12806u();
        return c8215b;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: T */
    public EzyGraphEnum.GraphEnum mo7104T() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: a0 */
    public void mo7111a0(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7103S().add(event);
        m7110Z().reset();
        m7110Z().moveTo(event.getX(), event.getY());
        m7110Z().lineTo(event.getX(), event.getY());
        m7118h0(event.getX());
        m7119i0(event.getY());
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            Path pathM7110Z = m7110Z();
            Paint paintM7107W = m7107W();
            C9998a c9998aM7085i = m7085i();
            interfaceC0039cM7083g.mo175B(pathM7110Z, paintM7107W, c9998aM7085i != null ? c9998aM7085i.m17344b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: b0 */
    public void mo7112b0(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7103S().add(event);
        float f10 = 2;
        m7110Z().quadTo(m7105U(), m7106V(), (event.getX() + m7105U()) / f10, (event.getY() + m7106V()) / f10);
        m7118h0(event.getX());
        m7119i0(event.getY());
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            Path pathM7110Z = m7110Z();
            Paint paintM7107W = m7107W();
            C9998a c9998aM7085i = m7085i();
            interfaceC0039cM7083g.mo175B(pathM7110Z, paintM7107W, c9998aM7085i != null ? c9998aM7085i.m17344b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: c0 */
    public void mo7113c0(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7103S().add(event);
        float f10 = 2;
        m7110Z().quadTo(m7105U(), m7106V(), (event.getX() + m7105U()) / f10, (event.getY() + m7106V()) / f10);
        m7110Z().lineTo(event.getX(), event.getY());
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            Path pathM7110Z = m7110Z();
            Paint paintM7107W = m7107W();
            C9998a c9998aM7085i = m7085i();
            interfaceC0039cM7083g.mo175B(pathM7110Z, paintM7107W, c9998aM7085i != null ? c9998aM7085i.m17344b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: d0 */
    public void mo7114d0() {
        Paint paintM7107W = m7107W();
        C9763b c9763bM7082f = m7082f();
        paintM7107W.setColor(c9763bM7082f != null ? c9763bM7082f.m16451B() : ViewCompat.MEASURED_STATE_MASK);
        C9763b c9763bM7082f2 = m7082f();
        paintM7107W.setStrokeWidth(c9763bM7082f2 != null ? c9763bM7082f2.m16454E() : 3.0f);
        paintM7107W.setStyle(Paint.Style.STROKE);
        paintM7107W.setStrokeCap(Paint.Cap.ROUND);
        paintM7107W.setStrokeJoin(Paint.Join.ROUND);
        paintM7107W.setDither(true);
        paintM7107W.setAntiAlias(true);
        C9763b c9763bM7082f3 = m7082f();
        if (c9763bM7082f3 == null || !c9763bM7082f3.m16466Q()) {
            m7120j0(1.0f);
            m7121k0(0.0f);
            paintM7107W.setPathEffect(null);
        } else {
            C9763b c9763bM7082f4 = m7082f();
            m7120j0(c9763bM7082f4 != null ? c9763bM7082f4.m16452C() : 30.0f);
            C9763b c9763bM7082f5 = m7082f();
            m7121k0(c9763bM7082f5 != null ? c9763bM7082f5.m16453D() : 15.0f);
            paintM7107W.setPathEffect(new DashPathEffect(new float[]{m7108X(), m7109Y()}, 0.0f));
        }
    }
}
