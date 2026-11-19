package p120i4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p098g4.InterfaceC7522b;
import p109h4.AbstractC7624b;
import p109h4.AbstractC7625c;

/* renamed from: i4.b */
/* loaded from: classes4.dex */
public final class C7662b extends AbstractC7661a {

    /* renamed from: u */
    public final ArrayList f12942u;

    /* renamed from: v */
    public final RectF f12943v;

    /* renamed from: w */
    public boolean f12944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7662b(InterfaceC7522b listener) {
        super(listener);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f12942u = new ArrayList();
        this.f12943v = new RectF();
        m12771Z();
        m12770Y();
    }

    /* renamed from: Y */
    private final void m12770Y() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float fMeasureText = paint.measureText(AbstractC7625c.a.f12802c.m12564a());
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        this.f12943v.set(23.0f, (m12751f().getSelectButtonHeight() - f10) / f11, fMeasureText + 23.0f, ((m12751f().getSelectButtonHeight() - f10) / f11) + f10);
    }

    /* renamed from: Z */
    private final void m12771Z() {
        this.f12942u.clear();
        if (!this.f12944w) {
            this.f12942u.add(AbstractC7625c.d.f12805c);
            this.f12942u.add(AbstractC7625c.e.f12806c);
        }
        this.f12942u.add(AbstractC7625c.a.f12802c);
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: A */
    public boolean mo6132A(float f10, float f11) {
        if (!super.mo6132A(f10, f11)) {
            return false;
        }
        if (!(m12752g() instanceof AbstractC7624b.d)) {
            return true;
        }
        m12759o().mo13452q(m12764u());
        m12759o().mo13439d();
        m12761q().mo12249n(m12764u(), System.currentTimeMillis());
        m12761q().mo12247l();
        mo6137L();
        return true;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: J */
    public boolean mo6136J(float f10, float f11) {
        Matrix matrixM11777b = AbstractC7352m.m11777b(m12753i());
        float[] fArr = {f10, f11};
        matrixM11777b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM11777b.mapRadius(m12751f().getSelectIconWidth());
        if (this.f12942u.contains(AbstractC7625c.d.f12805c)) {
            float f14 = 2;
            float f15 = fMapRadius / f14;
            if (new RectF(m12765v().centerX() - f15, m12765v().top - ((5 * fMapRadius) / f14), m12765v().centerX() + f15, m12765v().top - ((3 * fMapRadius) / f14)).contains(f12, f13)) {
                m12741M(AbstractC7624b.h.f12795a);
                return true;
            }
        }
        if (this.f12942u.contains(AbstractC7625c.e.f12806c)) {
            float f16 = fMapRadius / 2;
            if (new RectF(m12765v().right - f16, m12765v().bottom - f16, m12765v().right + f16, m12765v().bottom + f16).contains(f12, f13)) {
                m12741M(AbstractC7624b.i.f12796a);
                return true;
            }
        }
        if (m12765v().contains(f12, f13)) {
            m12741M(AbstractC7624b.b.f12786a);
            return true;
        }
        if (m12757m().m12795c().contains(f10, f11)) {
            m12741M(new AbstractC7624b.d(0));
            return true;
        }
        if (m12756l().m12775c().contains(f10, f11)) {
            m12741M(AbstractC7624b.e.f12792a);
            return true;
        }
        m12741M(AbstractC7624b.g.f12794a);
        return false;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: L */
    public void mo6137L() {
        super.mo6137L();
        m12772a0(false);
        m12771Z();
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: X */
    public void mo6139X() {
        m12757m().m12795c().set((m12763t().left + this.f12943v.left) - 15.0f, m12763t().top, m12763t().left + this.f12943v.right + 15.0f, m12763t().top + m12751f().getSelectButtonHeight());
    }

    /* renamed from: a0 */
    public final void m12772a0(boolean z9) {
        this.f12944w = z9;
        ArrayList arrayList = this.f12942u;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i10 = -1;
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            if (((AbstractC7625c) obj) instanceof AbstractC7625c.d) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            this.f12942u.remove(i10);
        }
        if (!z9) {
            this.f12942u.add(0, AbstractC7625c.d.f12805c);
        }
        ArrayList arrayList2 = this.f12942u;
        int size2 = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                i12 = -1;
                break;
            }
            Object obj2 = arrayList2.get(i13);
            i13++;
            if (((AbstractC7625c) obj2) instanceof AbstractC7625c.e) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            this.f12942u.remove(i12);
        }
        if (z9) {
            return;
        }
        this.f12942u.add(0, AbstractC7625c.e.f12806c);
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: h */
    public List mo6153h() {
        return this.f12942u;
    }

    @Override // p120i4.AbstractC7661a
    /* renamed from: s */
    public RectF mo6156s() {
        m12745R(new Pair(Float.valueOf(this.f12943v.width() + 46.0f), Float.valueOf(m12751f().getSelectButtonHeight())));
        return new RectF(0.0f, 0.0f, ((Number) m12767x().getFirst()).floatValue(), ((Number) m12767x().getSecond()).floatValue());
    }
}
