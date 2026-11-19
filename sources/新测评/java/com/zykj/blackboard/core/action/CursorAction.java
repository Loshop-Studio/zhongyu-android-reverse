package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p077e5.C7353n;
import p098g4.InterfaceC7522b;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;

/* loaded from: classes4.dex */
public final class CursorAction extends AbstractC6626b {

    /* renamed from: p */
    public final Paint f6939p;

    /* renamed from: q */
    public float f6940q;

    /* renamed from: r */
    public final Path f6941r;

    /* renamed from: s */
    public final PointF f6942s;

    /* renamed from: t */
    public final ArrayList f6943t;

    public CursorAction() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20.0f);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f6939p = paint;
        this.f6940q = 50.0f;
        this.f6941r = new Path();
        this.f6942s = new PointF();
        this.f6943t = new ArrayList();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13439d();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6034O();
        m6033N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6033N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m6033N(event);
        InterfaceC7880c interfaceC7880cM5988g = m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13439d();
        }
        InterfaceC7522b interfaceC7522bM5989h = m5989h();
        if (interfaceC7522bM5989h != null) {
            interfaceC7522bM5989h.mo12242g(this.f6943t, AbstractC7351l.m11770a(this.f6939p, 1.0f, 0.0f));
        }
    }

    /* renamed from: N */
    public final void m6033N(final EzyTouchEvent.TouchEvent touchEvent) {
        m5991j(touchEvent, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.CursorAction$handleTouch$1
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
                EzyTouchEvent.TouchEvent touchEventBuild;
                Matrix matrixM13188b;
                Matrix matrix;
                Matrix matrixM13188b2;
                this.f6944a.f6941r.reset();
                this.f6944a.f6942s.set(touchEvent.getX(), touchEvent.getY());
                List pointerPropertiesList = touchEvent.getPointerPropertiesList();
                Intrinsics.checkNotNullExpressionValue(pointerPropertiesList, "event.pointerPropertiesList");
                int toolType = ((EzyTouchEvent.TouchEvent.PointerProperties) CollectionsKt.first(pointerPropertiesList)).getToolType();
                if (toolType == 1) {
                    C7792a c7792aM5990i = this.f6944a.m5990i();
                    if (c7792aM5990i != null && (matrixM13188b = c7792aM5990i.m13188b()) != null) {
                        EzyTouchEvent.TouchEvent touchEvent2 = touchEvent;
                        CursorAction cursorAction = this.f6944a;
                        C7353n c7353n = C7353n.f11920a;
                        PointF pointFM11783d = c7353n.m11783d(touchEvent2.getX(), touchEvent2.getY(), matrixM13188b);
                        pointFM11783d.y -= cursorAction.f6940q;
                        cursorAction.f6942s.set(c7353n.m11784e(pointFM11783d, AbstractC7352m.m11777b(matrixM13188b)));
                    }
                    touchEventBuild = touchEvent.toBuilder().m8609B(this.f6944a.f6942s.x).m8610C(this.f6944a.f6942s.y).build();
                    Intrinsics.checkNotNullExpressionValue(touchEventBuild, "event.toBuilder().setX(t…etY(tempPointF.y).build()");
                } else if (toolType != 2) {
                    return;
                } else {
                    touchEventBuild = touchEvent;
                }
                Path path = this.f6944a.f6941r;
                float f10 = this.f6944a.f6942s.x;
                float f11 = this.f6944a.f6942s.y;
                C7792a c7792aM5990i2 = this.f6944a.m5990i();
                if (c7792aM5990i2 == null || (matrixM13188b2 = c7792aM5990i2.m13188b()) == null || (matrix = AbstractC7352m.m11777b(matrixM13188b2)) == null) {
                    matrix = new Matrix();
                }
                path.addCircle(f10, f11, matrix.mapRadius(this.f6944a.f6939p.getStrokeWidth() / 2), Path.Direction.CW);
                InterfaceC7880c interfaceC7880cM5988g = this.f6944a.m5988g();
                if (interfaceC7880cM5988g != null) {
                    Path path2 = this.f6944a.f6941r;
                    Paint paint = this.f6944a.f6939p;
                    C7792a c7792aM5990i3 = this.f6944a.m5990i();
                    interfaceC7880cM5988g.mo13414A(path2, paint, c7792aM5990i3 != null ? c7792aM5990i3.m13188b() : null);
                }
                this.f6944a.f6943t.add(touchEventBuild);
            }
        });
    }

    /* renamed from: O */
    public final void m6034O() {
        BoardConfig boardConfigM5987f = m5987f();
        if (boardConfigM5987f != null) {
            this.f6939p.setColor(boardConfigM5987f.getCursorColor());
            this.f6939p.setStrokeWidth(boardConfigM5987f.getCursorWidth());
            this.f6940q = boardConfigM5987f.getCursorOffset();
        }
    }

    /* renamed from: P */
    public void m6035P() {
        this.f6941r.reset();
        this.f6943t.clear();
    }
}
