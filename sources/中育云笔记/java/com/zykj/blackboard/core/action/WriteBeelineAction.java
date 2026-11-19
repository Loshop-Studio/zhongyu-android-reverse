package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.view.ViewCompat;
import ba.AbstractC5179a;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10346i;
import na.C10349l;
import p134ea.C9111a;
import p181hd.InterfaceC9529a;
import p307q9.C10762b;
import p309qc.C10786q;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class WriteBeelineAction extends BaseWriteAction {
    public WriteBeelineAction() {
        C10346i.f24652a.m21641c(EventKey.WRITE_BEELINE_NEW_GROUP, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.WriteBeelineAction.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33998invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33998invoke() {
                WriteBeelineAction.this.m13759g0(true);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: Q */
    public AbstractC5179a mo13743Q(String graphId) {
        AbstractC9979u.m20294g(graphId, "graphId");
        C10349l c10349l = C10349l.f24656a;
        C9111a c9111a = new C9111a(graphId, c10349l.m21651d(m13745S()), null, null, null, 28, null);
        c9111a.m17928Q(m13745S());
        c9111a.m17924M(c10349l.m21650c(m13745S()));
        c9111a.m17923L(new Paint(m13749W()), m13750X(), m13751Y());
        c9111a.mo2730v();
        return c9111a;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: T */
    public EzyGraphEnum.GraphEnum mo13746T() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: a0 */
    public void mo13753a0(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13745S().add(event);
        m13760h0(event.getX());
        m13761i0(event.getY());
        m13752Z().reset();
        m13752Z().moveTo(m13747U(), m13748V());
        m13752Z().lineTo(m13747U(), m13748V());
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            Path pathM13752Z = m13752Z();
            Paint paintM13749W = m13749W();
            C11373a c11373aM13727i = m13727i();
            interfaceC11552cM13725g.mo25416B(pathM13752Z, paintM13749W, c11373aM13727i != null ? c11373aM13727i.m25311b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: b0 */
    public void mo13754b0(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13752Z().reset();
        m13752Z().moveTo(m13747U(), m13748V());
        m13752Z().lineTo(event.getX(), event.getY());
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            Path pathM13752Z = m13752Z();
            Paint paintM13749W = m13749W();
            C11373a c11373aM13727i = m13727i();
            interfaceC11552cM13725g.mo25416B(pathM13752Z, paintM13749W, c11373aM13727i != null ? c11373aM13727i.m25311b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: c0 */
    public void mo13755c0(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13745S().add(event);
        m13752Z().reset();
        m13752Z().moveTo(m13747U(), m13748V());
        m13752Z().lineTo(event.getX(), event.getY());
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            Path pathM13752Z = m13752Z();
            Paint paintM13749W = m13749W();
            C11373a c11373aM13727i = m13727i();
            interfaceC11552cM13725g.mo25416B(pathM13752Z, paintM13749W, c11373aM13727i != null ? c11373aM13727i.m25311b() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    /* renamed from: d0 */
    public void mo13756d0() {
        Paint paintM13749W = m13749W();
        C10762b c10762bM13724f = m13724f();
        paintM13749W.setColor(c10762bM13724f != null ? c10762bM13724f.m22902k() : ViewCompat.MEASURED_STATE_MASK);
        C10762b c10762bM13724f2 = m13724f();
        paintM13749W.setStrokeWidth(c10762bM13724f2 != null ? c10762bM13724f2.m22904l() : 3.0f);
        paintM13749W.setStyle(Paint.Style.STROKE);
        paintM13749W.setStrokeCap(Paint.Cap.ROUND);
        paintM13749W.setStrokeJoin(Paint.Join.ROUND);
        paintM13749W.setDither(true);
        paintM13749W.setAntiAlias(true);
        C10762b c10762bM13724f3 = m13724f();
        if (c10762bM13724f3 == null || !c10762bM13724f3.m22870N()) {
            m13762j0(1.0f);
            m13763k0(0.0f);
            paintM13749W.setPathEffect(null);
        } else {
            C10762b c10762bM13724f4 = m13724f();
            m13762j0(c10762bM13724f4 != null ? c10762bM13724f4.m22858B() : 30.0f);
            C10762b c10762bM13724f5 = m13724f();
            m13763k0(c10762bM13724f5 != null ? c10762bM13724f5.m22859C() : 15.0f);
            paintM13749W.setPathEffect(new DashPathEffect(new float[]{m13750X(), m13751Y()}, 0.0f));
        }
    }
}
