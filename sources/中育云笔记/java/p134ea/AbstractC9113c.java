package p134ea;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.AbstractC10351n;
import na.C10349l;
import p118da.C9007a;

/* renamed from: ea.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9113c extends C9007a {

    /* renamed from: i */
    public InterfaceC9284d f21278i;

    /* renamed from: j */
    public String f21279j;

    /* renamed from: k */
    public Integer f21280k;

    /* renamed from: l */
    public float f21281l;

    /* renamed from: m */
    public float f21282m;

    /* renamed from: n */
    public Paint f21283n;

    /* renamed from: o */
    public Path f21284o;

    /* renamed from: p */
    public Path f21285p;

    /* renamed from: q */
    public final Matrix f21286q;

    /* renamed from: r */
    public final ArrayList f21287r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9113c(String id2, RectF outRectF, InterfaceC9284d interfaceC9284d, String str, Integer num) {
        super(id2, outRectF, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        this.f21278i = interfaceC9284d;
        this.f21279j = str;
        this.f21280k = num;
        this.f21281l = 1.0f;
        this.f21285p = new Path();
        this.f21286q = new Matrix();
        this.f21287r = new ArrayList();
    }

    /* renamed from: A */
    public final float m17912A() {
        return this.f21281l;
    }

    /* renamed from: B */
    public final float m17913B() {
        return this.f21282m;
    }

    /* renamed from: C */
    public final Path m17914C() {
        return this.f21284o;
    }

    /* renamed from: D */
    public final Path m17915D() {
        return this.f21285p;
    }

    /* renamed from: E */
    public final InterfaceC9284d m17916E() {
        return this.f21278i;
    }

    /* renamed from: F */
    public final Matrix m17917F() {
        return this.f21286q;
    }

    /* renamed from: G */
    public final EzySource.TouchSource.TouchInfo m17918G() {
        if (this.f21278i == null || mo2867w() == null || mo2868x() == null) {
            return null;
        }
        InterfaceC9284d interfaceC9284d = this.f21278i;
        AbstractC9979u.m20291d(interfaceC9284d);
        String strMo2867w = mo2867w();
        AbstractC9979u.m20291d(strMo2867w);
        Integer numMo2868x = mo2868x();
        AbstractC9979u.m20291d(numMo2868x);
        return interfaceC9284d.mo18289a(strMo2867w, numMo2868x.intValue());
    }

    /* renamed from: H */
    public void m17919H() {
        EzySource.TouchSource.TouchInfo touchInfoM17918G = m17918G();
        if (touchInfoM17918G != null) {
            List touchEventList = touchInfoM17918G.getTouchEventList();
            AbstractC9979u.m20293f(touchEventList, "it.touchEventList");
            m17928Q(touchEventList);
            m17930S(C10349l.f24656a.m21650c(this.f21287r));
            EzyPaint.Paint paintM16265n = touchInfoM17918G.m16265n();
            AbstractC9979u.m20293f(paintM16265n, "it.paint");
            m17929R(paintM16265n);
            mo2730v();
        }
    }

    /* renamed from: I */
    public final boolean m17920I() {
        Paint paint = this.f21283n;
        return paint != null && Color.alpha(paint.getColor()) < 255;
    }

    /* renamed from: J */
    public final float m17921J(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: K */
    public final float m17922K(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM17921J = m17921J(f10, f11, f12, f13);
        float fM17921J2 = m17921J(f10, f11, f14, f15);
        float fM17921J3 = m17921J(f12, f13, f14, f15);
        float f16 = fM17921J3 * fM17921J3;
        float f17 = fM17921J * fM17921J;
        float f18 = fM17921J2 * fM17921J2;
        if (f16 >= f17 + f18) {
            return fM17921J2;
        }
        if (f18 >= f17 + f16) {
            return fM17921J3;
        }
        float f19 = 2;
        float f20 = ((fM17921J + fM17921J2) + fM17921J3) / f19;
        return (f19 * ((float) Math.sqrt((((f20 - fM17921J) * f20) * (f20 - fM17921J2)) * (f20 - fM17921J3)))) / fM17921J;
    }

    /* renamed from: L */
    public final void m17923L(Paint paint, float f10, float f11) {
        AbstractC9979u.m20294g(paint, "paint");
        this.f21283n = paint;
        if (f11 == 0.0f || f10 == 0.0f) {
            f10 = 1.0f;
        }
        this.f21281l = f10;
        this.f21282m = f11;
    }

    /* renamed from: M */
    public final void m17924M(Path path) {
        this.f21284o = path;
    }

    /* renamed from: N */
    public void m17925N(String str) {
        this.f21279j = str;
    }

    /* renamed from: O */
    public void m17926O(Integer num) {
        this.f21280k = num;
    }

    /* renamed from: P */
    public final void m17927P(InterfaceC9284d interfaceC9284d) {
        this.f21278i = interfaceC9284d;
    }

    /* renamed from: Q */
    public final void m17928Q(List list) {
        AbstractC9979u.m20294g(list, "list");
        this.f21287r.clear();
        this.f21287r.addAll(list);
    }

    /* renamed from: R */
    public final void m17929R(EzyPaint.Paint paint) {
        AbstractC9979u.m20294g(paint, "paint");
        if (this.f21283n != null) {
            return;
        }
        this.f21283n = AbstractC10350m.m21656d(paint);
        this.f21281l = (paint.m15722o() == 0.0f || paint.m15721n() == 0.0f) ? 1.0f : paint.m15721n();
        this.f21282m = paint.m15722o();
    }

    /* renamed from: S */
    public final void m17930S(Path path) {
        AbstractC9979u.m20294g(path, "path");
        Path path2 = new Path();
        this.f21284o = path2;
        path2.set(path);
    }

    @Override // p118da.C9007a, ba.AbstractC5179a, ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot = super.getSnapshot();
        Paint paint = this.f21283n;
        if (paint != null) {
            snapshot.m15655R(AbstractC10350m.m21653a(paint, this.f21281l, this.f21282m));
        }
        return snapshot;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    /* renamed from: j */
    public RectF mo2721j(Matrix matrix) {
        if (this.f21284o == null) {
            m17919H();
        }
        Path path = this.f21284o;
        if (path != null) {
            path.transform(mo2714b(), this.f21285p);
        }
        Path path2 = this.f21285p;
        if (path2 != null) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            path2.transform(matrix, this.f21285p);
        }
        RectF rectF = new RectF();
        Path path3 = this.f21285p;
        if (path3 != null) {
            path3.computeBounds(rectF, false);
        }
        float f10 = rectF.left;
        Paint paint = this.f21283n;
        rectF.left = f10 - (paint != null ? paint.getStrokeWidth() : 0.0f);
        float f11 = rectF.top;
        Paint paint2 = this.f21283n;
        rectF.top = f11 - (paint2 != null ? paint2.getStrokeWidth() : 0.0f);
        float f12 = rectF.right;
        Paint paint3 = this.f21283n;
        rectF.right = f12 + (paint3 != null ? paint3.getStrokeWidth() : 0.0f);
        float f13 = rectF.bottom;
        Paint paint4 = this.f21283n;
        rectF.bottom = f13 + (paint4 != null ? paint4.getStrokeWidth() : 0.0f);
        return rectF;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    public void onDestroy() {
        super.onDestroy();
        this.f21284o = null;
        this.f21283n = null;
        this.f21285p = null;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    /* renamed from: q */
    public boolean mo2725q(float f10, float f11, float f12) {
        EzySource.TouchSource.TouchInfo touchInfoM17918G;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArr = {f10, f11};
        this.f21286q.reset();
        this.f21286q.postConcat(AbstractC10351n.m21660b(mo2714b()));
        this.f21286q.mapPoints(fArr);
        if (this.f21287r.isEmpty() && (touchInfoM17918G = m17918G()) != null) {
            this.f21287r.addAll(touchInfoM17918G.getTouchEventList());
        }
        int size = this.f21287r.size() - 1;
        int i10 = 0;
        while (i10 < size) {
            float x10 = ((EzyTouchEvent.TouchEvent) this.f21287r.get(i10)).getX();
            float y10 = ((EzyTouchEvent.TouchEvent) this.f21287r.get(i10)).getY();
            i10++;
            if (m17922K(x10, y10, ((EzyTouchEvent.TouchEvent) this.f21287r.get(i10)).getX(), ((EzyTouchEvent.TouchEvent) this.f21287r.get(i10)).getY(), fArr[0], fArr[1]) <= f12) {
                return true;
            }
        }
        Log.i("deleteGraph", "消耗时间D >> " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return false;
    }

    @Override // ba.AbstractC5179a
    /* renamed from: v */
    public void mo2730v() {
        Path path = this.f21284o;
        if (path != null) {
            path.transform(mo2714b(), this.f21285p);
        }
        Path path2 = this.f21285p;
        if (path2 != null) {
            path2.computeBounds(mo2715d(), false);
        }
        RectF rectFMo2715d = mo2715d();
        float f10 = rectFMo2715d.left;
        if (f10 == rectFMo2715d.right && f10 != 0.0f) {
            rectFMo2715d.left = f10 - 1;
        }
        float f11 = rectFMo2715d.top;
        if (f11 != rectFMo2715d.bottom || f11 == 0.0f) {
            return;
        }
        rectFMo2715d.top = f11 - 1;
    }

    @Override // p118da.C9007a
    /* renamed from: w */
    public String mo2867w() {
        return this.f21279j;
    }

    @Override // p118da.C9007a
    /* renamed from: x */
    public Integer mo2868x() {
        return this.f21280k;
    }

    /* renamed from: y */
    public final ArrayList m17931y() {
        return this.f21287r;
    }

    /* renamed from: z */
    public final Paint m17932z() {
        return this.f21283n;
    }
}
