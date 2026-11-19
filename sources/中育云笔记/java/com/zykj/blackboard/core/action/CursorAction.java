package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.AbstractC10351n;
import na.C10352o;
import p181hd.InterfaceC9529a;
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class CursorAction extends AbstractC8326b {

    /* renamed from: p */
    public final Paint f17788p;

    /* renamed from: q */
    public float f17789q;

    /* renamed from: r */
    public final Path f17790r;

    /* renamed from: s */
    public final PointF f17791s;

    /* renamed from: t */
    public final ArrayList f17792t;

    public CursorAction() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20.0f);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f17788p = paint;
        this.f17789q = 50.0f;
        this.f17790r = new Path();
        this.f17791s = new PointF();
        this.f17792t = new ArrayList();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25445e();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13772O();
        m13771N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13771N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13771N(event);
        InterfaceC11552c interfaceC11552cM13725g = m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25445e();
        }
        InterfaceC10918b interfaceC10918bM13726h = m13726h();
        if (interfaceC10918bM13726h != null) {
            interfaceC10918bM13726h.mo23766f(this.f17792t, AbstractC10350m.m21653a(this.f17788p, 1.0f, 0.0f));
        }
    }

    /* renamed from: N */
    public final void m13771N(final EzyTouchEvent.TouchEvent touchEvent) {
        m13728j(touchEvent, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.CursorAction$handleTouch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33990invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33990invoke() {
                EzyTouchEvent.TouchEvent touchEventBuild;
                Matrix matrixM25311b;
                Matrix matrix;
                Matrix matrixM25311b2;
                this.f17793c.f17790r.reset();
                this.f17793c.f17791s.set(touchEvent.getX(), touchEvent.getY());
                List pointerPropertiesList = touchEvent.getPointerPropertiesList();
                AbstractC9979u.m20293f(pointerPropertiesList, "event.pointerPropertiesList");
                int toolType = ((EzyTouchEvent.TouchEvent.PointerProperties) AbstractC10947g0.m23944m0(pointerPropertiesList)).getToolType();
                if (toolType == 1) {
                    C11373a c11373aM13727i = this.f17793c.m13727i();
                    if (c11373aM13727i != null && (matrixM25311b = c11373aM13727i.m25311b()) != null) {
                        EzyTouchEvent.TouchEvent touchEvent2 = touchEvent;
                        CursorAction cursorAction = this.f17793c;
                        C10352o c10352o = C10352o.f24660a;
                        PointF pointFM21671d = c10352o.m21671d(touchEvent2.getX(), touchEvent2.getY(), matrixM25311b);
                        pointFM21671d.y -= cursorAction.f17789q;
                        cursorAction.f17791s.set(c10352o.m21672e(pointFM21671d, AbstractC10351n.m21660b(matrixM25311b)));
                    }
                    touchEventBuild = touchEvent.toBuilder().m16396A(this.f17793c.f17791s.x).m16397B(this.f17793c.f17791s.y).build();
                    AbstractC9979u.m20293f(touchEventBuild, "event.toBuilder().setX(t…etY(tempPointF.y).build()");
                } else if (toolType != 2) {
                    return;
                } else {
                    touchEventBuild = touchEvent;
                }
                Path path = this.f17793c.f17790r;
                float f10 = this.f17793c.f17791s.x;
                float f11 = this.f17793c.f17791s.y;
                C11373a c11373aM13727i2 = this.f17793c.m13727i();
                if (c11373aM13727i2 == null || (matrixM25311b2 = c11373aM13727i2.m25311b()) == null || (matrix = AbstractC10351n.m21660b(matrixM25311b2)) == null) {
                    matrix = new Matrix();
                }
                path.addCircle(f10, f11, matrix.mapRadius(this.f17793c.f17788p.getStrokeWidth() / 2), Path.Direction.CW);
                InterfaceC11552c interfaceC11552cM13725g = this.f17793c.m13725g();
                if (interfaceC11552cM13725g != null) {
                    Path path2 = this.f17793c.f17790r;
                    Paint paint = this.f17793c.f17788p;
                    C11373a c11373aM13727i3 = this.f17793c.m13727i();
                    interfaceC11552cM13725g.mo25416B(path2, paint, c11373aM13727i3 != null ? c11373aM13727i3.m25311b() : null);
                }
                this.f17793c.f17792t.add(touchEventBuild);
            }
        });
    }

    /* renamed from: O */
    public final void m13772O() {
        C10762b c10762bM13724f = m13724f();
        if (c10762bM13724f != null) {
            this.f17788p.setColor(c10762bM13724f.m22906m());
            this.f17788p.setStrokeWidth(c10762bM13724f.m22908o());
            this.f17789q = c10762bM13724f.m22907n();
        }
    }

    /* renamed from: P */
    public void m13773P() {
        this.f17790r.reset();
        this.f17792t.clear();
    }
}
