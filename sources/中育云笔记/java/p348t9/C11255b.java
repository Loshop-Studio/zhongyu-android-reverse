package p348t9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p322r9.InterfaceC10918b;
import p337s9.AbstractC11081b;
import p337s9.AbstractC11082c;

/* renamed from: t9.b */
/* loaded from: classes5.dex */
public final class C11255b extends AbstractC11254a {

    /* renamed from: s */
    public final ArrayList f27039s;

    /* renamed from: t */
    public final RectF f27040t;

    /* renamed from: u */
    public boolean f27041u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11255b(InterfaceC10918b listener) {
        super(listener);
        AbstractC9979u.m20294g(listener, "listener");
        this.f27039s = new ArrayList();
        this.f27040t = new RectF();
        m25153T();
        m25152S();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: F */
    public boolean mo13874F(float f10, float f11) {
        Matrix matrixM21660b = AbstractC10351n.m21660b(m25137g());
        float[] fArr = {f10, f11};
        matrixM21660b.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixM21660b.mapRadius(m25135d().m22864H());
        if (this.f27039s.contains(AbstractC11082c.d.f26760c)) {
            float f14 = 2;
            float f15 = fMapRadius / f14;
            if (new RectF(m25148s().centerX() - f15, m25148s().top - ((5 * fMapRadius) / f14), m25148s().centerX() + f15, m25148s().top - ((3 * fMapRadius) / f14)).contains(f12, f13)) {
                m25127I(AbstractC11081b.g.f26750a);
                return true;
            }
        }
        if (this.f27039s.contains(AbstractC11082c.e.f26761c)) {
            float f16 = fMapRadius / 2;
            if (new RectF(m25148s().right - f16, m25148s().bottom - f16, m25148s().right + f16, m25148s().bottom + f16).contains(f12, f13)) {
                m25127I(AbstractC11081b.h.f26751a);
                return true;
            }
        }
        if (m25148s().contains(f12, f13)) {
            m25127I(AbstractC11081b.b.f26742a);
            return true;
        }
        if (m25140j().m25170b().contains(f10, f11)) {
            m25127I(new AbstractC11081b.d(0));
            return true;
        }
        m25127I(AbstractC11081b.f.f26749a);
        return false;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: H */
    public void mo13875H() {
        super.mo13875H();
        m25154U(false);
        m25153T();
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: R */
    public void mo13876R() {
        m25140j().m25170b().set((m25146q().left + this.f27040t.left) - 15.0f, m25146q().top, m25146q().left + this.f27040t.right + 15.0f, m25146q().top + m25135d().m22861E());
    }

    /* renamed from: S */
    public final void m25152S() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float fMeasureText = paint.measureText(AbstractC11082c.a.f26757c.m24640a());
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        this.f27040t.set(23.0f, (m25135d().m22861E() - f10) / f11, fMeasureText + 23.0f, ((m25135d().m22861E() - f10) / f11) + f10);
    }

    /* renamed from: T */
    public final void m25153T() {
        this.f27039s.clear();
        if (!this.f27041u) {
            this.f27039s.add(AbstractC11082c.d.f26760c);
            this.f27039s.add(AbstractC11082c.e.f26761c);
        }
        this.f27039s.add(AbstractC11082c.a.f26757c);
    }

    /* renamed from: U */
    public final void m25154U(boolean z10) {
        this.f27041u = z10;
        ArrayList arrayList = this.f27039s;
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
            if (((AbstractC11082c) obj) instanceof AbstractC11082c.d) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            this.f27039s.remove(i10);
        }
        if (!z10) {
            this.f27039s.add(0, AbstractC11082c.d.f26760c);
        }
        ArrayList arrayList2 = this.f27039s;
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
            if (((AbstractC11082c) obj2) instanceof AbstractC11082c.e) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != -1) {
            this.f27039s.remove(i12);
        }
        if (z10) {
            return;
        }
        this.f27039s.add(0, AbstractC11082c.e.f26761c);
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: f */
    public List mo13877f() {
        return this.f27039s;
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: p */
    public RectF mo13878p() {
        return new RectF(0.0f, 0.0f, this.f27040t.width() + 46.0f, m25135d().m22861E());
    }

    @Override // p348t9.AbstractC11254a
    /* renamed from: w */
    public boolean mo13879w(float f10, float f11) {
        if (!super.mo13879w(f10, f11)) {
            return false;
        }
        if (!(m25136e() instanceof AbstractC11081b.d)) {
            return true;
        }
        m25142l().mo25456p(m25147r());
        m25142l().mo25445e();
        m25144n().mo23775o(m25147r(), System.currentTimeMillis());
        m25144n().mo23772l();
        mo13875H();
        return true;
    }
}
