package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;
import p263u5.C9696o;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class CursorAction extends AbstractC6943b {

    /* renamed from: p */
    public final Paint f8222p;

    /* renamed from: q */
    public float f8223q;

    /* renamed from: r */
    public final Path f8224r;

    /* renamed from: s */
    public final PointF f8225s;

    /* renamed from: t */
    public final ArrayList f8226t;

    public CursorAction() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20.0f);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f8222p = paint;
        this.f8223q = 50.0f;
        this.f8224r = new Path();
        this.f8225s = new PointF();
        this.f8226t = new ArrayList();
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo201d();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7130O();
        m7129N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7129N(event);
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7129N(event);
        InterfaceC0039c interfaceC0039cM7083g = m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo201d();
        }
        InterfaceC9822b interfaceC9822bM7084h = m7084h();
        if (interfaceC9822bM7084h != null) {
            interfaceC9822bM7084h.mo16688g(this.f8226t, AbstractC9694m.m16193a(this.f8222p, 1.0f, 0.0f));
        }
    }

    /* renamed from: N */
    public final void m7129N(final EzyTouchEvent.TouchEvent touchEvent) {
        m7086j(touchEvent, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.CursorAction$handleTouch$1
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
                Matrix matrixM17344b;
                Matrix matrix;
                Matrix matrixM17344b2;
                this.f8227a.f8224r.reset();
                this.f8227a.f8225s.set(touchEvent.getX(), touchEvent.getY());
                List pointerPropertiesList = touchEvent.getPointerPropertiesList();
                Intrinsics.checkNotNullExpressionValue(pointerPropertiesList, "event.pointerPropertiesList");
                int toolType = ((EzyTouchEvent.TouchEvent.PointerProperties) CollectionsKt.first(pointerPropertiesList)).getToolType();
                if (toolType == 1) {
                    C9998a c9998aM7085i = this.f8227a.m7085i();
                    if (c9998aM7085i != null && (matrixM17344b = c9998aM7085i.m17344b()) != null) {
                        EzyTouchEvent.TouchEvent touchEvent2 = touchEvent;
                        CursorAction cursorAction = this.f8227a;
                        C9696o c9696o = C9696o.f17133a;
                        PointF pointFM16206d = c9696o.m16206d(touchEvent2.getX(), touchEvent2.getY(), matrixM17344b);
                        pointFM16206d.y -= cursorAction.f8223q;
                        cursorAction.f8225s.set(c9696o.m16207e(pointFM16206d, AbstractC9695n.m16200b(matrixM17344b)));
                    }
                    touchEventBuild = touchEvent.toBuilder().m9768B(this.f8227a.f8225s.x).m9769C(this.f8227a.f8225s.y).build();
                    Intrinsics.checkNotNullExpressionValue(touchEventBuild, "event.toBuilder().setX(t…etY(tempPointF.y).build()");
                } else if (toolType != 2) {
                    return;
                } else {
                    touchEventBuild = touchEvent;
                }
                Path path = this.f8227a.f8224r;
                float f10 = this.f8227a.f8225s.x;
                float f11 = this.f8227a.f8225s.y;
                C9998a c9998aM7085i2 = this.f8227a.m7085i();
                if (c9998aM7085i2 == null || (matrixM17344b2 = c9998aM7085i2.m17344b()) == null || (matrix = AbstractC9695n.m16200b(matrixM17344b2)) == null) {
                    matrix = new Matrix();
                }
                path.addCircle(f10, f11, matrix.mapRadius(this.f8227a.f8222p.getStrokeWidth() / 2), Path.Direction.CW);
                InterfaceC0039c interfaceC0039cM7083g = this.f8227a.m7083g();
                if (interfaceC0039cM7083g != null) {
                    Path path2 = this.f8227a.f8224r;
                    Paint paint = this.f8227a.f8222p;
                    C9998a c9998aM7085i3 = this.f8227a.m7085i();
                    interfaceC0039cM7083g.mo175B(path2, paint, c9998aM7085i3 != null ? c9998aM7085i3.m17344b() : null);
                }
                this.f8227a.f8226t.add(touchEventBuild);
            }
        });
    }

    /* renamed from: O */
    public final void m7130O() {
        C9763b c9763bM7082f = m7082f();
        if (c9763bM7082f != null) {
            this.f8222p.setColor(c9763bM7082f.m16499m());
            this.f8222p.setStrokeWidth(c9763bM7082f.m16503o());
            this.f8223q = c9763bM7082f.m16501n();
        }
    }

    /* renamed from: P */
    public void m7131P() {
        this.f8224r.reset();
        this.f8226t.clear();
    }
}
