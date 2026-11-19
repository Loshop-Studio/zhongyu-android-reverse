package p302y4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p263u5.AbstractC9695n;
import p282w4.InterfaceC9822b;
import p292x4.AbstractC9878b;
import p292x4.AbstractC9879c;

/* renamed from: y4.b */
/* loaded from: classes4.dex */
public final class C9949b extends AbstractC9948a {

    /* renamed from: u */
    public final ArrayList f17905u;

    /* renamed from: v */
    public final RectF f17906v;

    /* renamed from: w */
    public boolean f17907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9949b(InterfaceC9822b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17905u = new ArrayList();
        this.f17906v = new RectF();
        m17193Z();
        m17192Y();
    }

    /* renamed from: Y */
    private final void m17192Y() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float fMeasureText = paint.measureText(AbstractC9879c.a.f17651c.m16891a());
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        this.f17906v.set(23.0f, (m17173f().m16455F() - f10) / f11, fMeasureText + 23.0f, ((m17173f().m16455F() - f10) / f11) + f10);
    }

    /* renamed from: Z */
    private final void m17193Z() {
        this.f17905u.clear();
        if (!this.f17907w) {
            this.f17905u.add(AbstractC9879c.d.f17654c);
            this.f17905u.add(AbstractC9879c.e.f17655c);
        }
        this.f17905u.add(AbstractC9879c.a.f17651c);
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: A */
    public boolean mo7228A(float f10, float f11) {
        if (!super.mo7228A(f10, f11)) {
            return false;
        }
        if (!(m17174g() instanceof AbstractC9878b.d)) {
            return true;
        }
        m17181o().mo212o(m17186u());
        m17181o().mo201d();
        m17183q().mo16695n(m17186u(), System.currentTimeMillis());
        m17183q().mo16693l();
        mo7233L();
        return true;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: J */
    public boolean mo7232J(float f10, float f11) {
        Matrix matrixM16200b = AbstractC9695n.m16200b(m17175i());
        float[] fArr = {f10, f11};
        matrixM16200b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM16200b.mapRadius(m17173f().m16459J());
        if (this.f17905u.contains(AbstractC9879c.d.f17654c)) {
            float f14 = 2;
            float f15 = fMapRadius / f14;
            if (new RectF(m17187v().centerX() - f15, m17187v().top - ((5 * fMapRadius) / f14), m17187v().centerX() + f15, m17187v().top - ((3 * fMapRadius) / f14)).contains(f12, f13)) {
                m17163M(AbstractC9878b.h.f17644a);
                return true;
            }
        }
        if (this.f17905u.contains(AbstractC9879c.e.f17655c)) {
            float f16 = fMapRadius / 2;
            if (new RectF(m17187v().right - f16, m17187v().bottom - f16, m17187v().right + f16, m17187v().bottom + f16).contains(f12, f13)) {
                m17163M(AbstractC9878b.i.f17645a);
                return true;
            }
        }
        if (m17187v().contains(f12, f13)) {
            m17163M(AbstractC9878b.b.f17635a);
            return true;
        }
        if (m17179m().m17217c().contains(f10, f11)) {
            m17163M(new AbstractC9878b.d(0));
            return true;
        }
        if (m17178l().m17197c().contains(f10, f11)) {
            m17163M(AbstractC9878b.e.f17641a);
            return true;
        }
        m17163M(AbstractC9878b.g.f17643a);
        return false;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: L */
    public void mo7233L() {
        super.mo7233L();
        m17194a0(false);
        m17193Z();
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: X */
    public void mo7235X() {
        m17179m().m17217c().set((m17185t().left + this.f17906v.left) - 15.0f, m17185t().top, m17185t().left + this.f17906v.right + 15.0f, m17185t().top + m17173f().m16455F());
    }

    /* renamed from: a0 */
    public final void m17194a0(boolean z9) {
        this.f17907w = z9;
        ArrayList arrayList = this.f17905u;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i9 = -1;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (((AbstractC9879c) obj) instanceof AbstractC9879c.d) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 != -1) {
            this.f17905u.remove(i9);
        }
        if (!z9) {
            this.f17905u.add(0, AbstractC9879c.d.f17654c);
        }
        ArrayList arrayList2 = this.f17905u;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                i11 = -1;
                break;
            }
            Object obj2 = arrayList2.get(i12);
            i12++;
            if (((AbstractC9879c) obj2) instanceof AbstractC9879c.e) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            this.f17905u.remove(i11);
        }
        if (z9) {
            return;
        }
        this.f17905u.add(0, AbstractC9879c.e.f17655c);
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: h */
    public List mo7249h() {
        return this.f17905u;
    }

    @Override // p302y4.AbstractC9948a
    /* renamed from: s */
    public RectF mo7252s() {
        m17167R(new Pair(Float.valueOf(this.f17906v.width() + 46.0f), Float.valueOf(m17173f().m16455F())));
        return new RectF(0.0f, 0.0f, ((Number) m17189x().getFirst()).floatValue(), ((Number) m17189x().getSecond()).floatValue());
    }
}
