package p147j5;

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
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p137i5.C8134a;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;
import p263u5.C9693l;

/* renamed from: j5.c */
/* loaded from: classes4.dex */
public abstract class AbstractC8216c extends C8134a {

    /* renamed from: i */
    public InterfaceC8891e f14284i;

    /* renamed from: j */
    public String f14285j;

    /* renamed from: k */
    public Integer f14286k;

    /* renamed from: l */
    public float f14287l;

    /* renamed from: m */
    public float f14288m;

    /* renamed from: n */
    public Paint f14289n;

    /* renamed from: o */
    public Path f14290o;

    /* renamed from: p */
    public Path f14291p;

    /* renamed from: q */
    public final Matrix f14292q;

    /* renamed from: r */
    public final ArrayList f14293r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8216c(String id, RectF outRectF, InterfaceC8891e interfaceC8891e, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f14284i = interfaceC8891e;
        this.f14285j = str;
        this.f14286k = num;
        this.f14287l = 1.0f;
        this.f14291p = new Path();
        this.f14292q = new Matrix();
        this.f14293r = new ArrayList();
    }

    /* renamed from: A */
    public final float m13235A() {
        return this.f14288m;
    }

    /* renamed from: B */
    public final Path m13236B() {
        return this.f14290o;
    }

    /* renamed from: C */
    public final Path m13237C() {
        return this.f14291p;
    }

    /* renamed from: D */
    public final InterfaceC8891e m13238D() {
        return this.f14284i;
    }

    /* renamed from: E */
    public final Matrix m13239E() {
        return this.f14292q;
    }

    /* renamed from: F */
    public final EzySource.TouchSource.TouchInfo m13240F() {
        if (this.f14284i == null || mo7865v() == null || mo7866w() == null) {
            return null;
        }
        InterfaceC8891e interfaceC8891e = this.f14284i;
        Intrinsics.checkNotNull(interfaceC8891e);
        String strMo7865v = mo7865v();
        Intrinsics.checkNotNull(strMo7865v);
        Integer numMo7866w = mo7866w();
        Intrinsics.checkNotNull(numMo7866w);
        return interfaceC8891e.mo13811a(strMo7865v, numMo7866w.intValue());
    }

    /* renamed from: G */
    public void m13241G() {
        EzySource.TouchSource.TouchInfo touchInfoM13240F = m13240F();
        if (touchInfoM13240F != null) {
            List touchEventList = touchInfoM13240F.getTouchEventList();
            Intrinsics.checkNotNullExpressionValue(touchEventList, "it.touchEventList");
            m13250P(touchEventList);
            m13252R(C9693l.f17131a.m16190c(this.f14293r));
            EzyPaint.Paint paintM9637v = touchInfoM13240F.m9637v();
            Intrinsics.checkNotNullExpressionValue(paintM9637v, "it.paint");
            m13251Q(paintM9637v);
            mo12806u();
        }
    }

    /* renamed from: H */
    public final boolean m13242H() {
        Paint paint = this.f14289n;
        return paint != null && Color.alpha(paint.getColor()) < 255;
    }

    /* renamed from: I */
    public final float m13243I(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: J */
    public final float m13244J(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM13243I = m13243I(f10, f11, f12, f13);
        float fM13243I2 = m13243I(f10, f11, f14, f15);
        float fM13243I3 = m13243I(f12, f13, f14, f15);
        float f16 = fM13243I3 * fM13243I3;
        float f17 = fM13243I * fM13243I;
        float f18 = fM13243I2 * fM13243I2;
        if (f16 >= f17 + f18) {
            return fM13243I2;
        }
        if (f18 >= f17 + f16) {
            return fM13243I3;
        }
        float f19 = 2;
        float f20 = ((fM13243I + fM13243I2) + fM13243I3) / f19;
        return (f19 * ((float) Math.sqrt((((f20 - fM13243I) * f20) * (f20 - fM13243I2)) * (f20 - fM13243I3)))) / fM13243I;
    }

    /* renamed from: K */
    public final void m13245K(Paint paint, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f14289n = paint;
        if (f11 == 0.0f || f10 == 0.0f) {
            f10 = 1.0f;
        }
        this.f14287l = f10;
        this.f14288m = f11;
    }

    /* renamed from: L */
    public final void m13246L(Path path) {
        this.f14290o = path;
    }

    /* renamed from: M */
    public void m13247M(String str) {
        this.f14285j = str;
    }

    /* renamed from: N */
    public void m13248N(Integer num) {
        this.f14286k = num;
    }

    /* renamed from: O */
    public final void m13249O(InterfaceC8891e interfaceC8891e) {
        this.f14284i = interfaceC8891e;
    }

    /* renamed from: P */
    public final void m13250P(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f14293r.clear();
        this.f14293r.addAll(list);
    }

    /* renamed from: Q */
    public final void m13251Q(EzyPaint.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.f14289n != null) {
            return;
        }
        this.f14289n = AbstractC9694m.m16196d(paint);
        this.f14287l = (paint.m9106w() == 0.0f || paint.m9105v() == 0.0f) ? 1.0f : paint.m9105v();
        this.f14288m = paint.m9106w();
    }

    /* renamed from: R */
    public final void m13252R(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = new Path();
        this.f14290o = path2;
        path2.set(path);
    }

    @Override // p137i5.C8134a, p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot = super.getSnapshot();
        Paint paint = this.f14289n;
        if (paint != null) {
            snapshot.m9037P(AbstractC9694m.m16193a(paint, this.f14287l, this.f14288m));
        }
        return snapshot;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    /* renamed from: i */
    public RectF mo12799i(Matrix matrix) {
        if (this.f14290o == null) {
            m13241G();
        }
        Path path = this.f14290o;
        if (path != null) {
            path.transform(mo12794b(), this.f14291p);
        }
        Path path2 = this.f14291p;
        if (path2 != null) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            path2.transform(matrix, this.f14291p);
        }
        RectF rectF = new RectF();
        Path path3 = this.f14291p;
        if (path3 != null) {
            path3.computeBounds(rectF, false);
        }
        float f10 = rectF.left;
        Paint paint = this.f14289n;
        rectF.left = f10 - (paint != null ? paint.getStrokeWidth() : 0.0f);
        float f11 = rectF.top;
        Paint paint2 = this.f14289n;
        rectF.top = f11 - (paint2 != null ? paint2.getStrokeWidth() : 0.0f);
        float f12 = rectF.right;
        Paint paint3 = this.f14289n;
        rectF.right = f12 + (paint3 != null ? paint3.getStrokeWidth() : 0.0f);
        float f13 = rectF.bottom;
        Paint paint4 = this.f14289n;
        rectF.bottom = f13 + (paint4 != null ? paint4.getStrokeWidth() : 0.0f);
        return rectF;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    /* renamed from: o */
    public boolean mo12802o(float f10, float f11, float f12) {
        EzySource.TouchSource.TouchInfo touchInfoM13240F;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArr = {f10, f11};
        this.f14292q.reset();
        this.f14292q.postConcat(AbstractC9695n.m16200b(mo12794b()));
        this.f14292q.mapPoints(fArr);
        if (this.f14293r.isEmpty() && (touchInfoM13240F = m13240F()) != null) {
            this.f14293r.addAll(touchInfoM13240F.getTouchEventList());
        }
        int size = this.f14293r.size() - 1;
        int i9 = 0;
        while (i9 < size) {
            float x9 = ((EzyTouchEvent.TouchEvent) this.f14293r.get(i9)).getX();
            float y9 = ((EzyTouchEvent.TouchEvent) this.f14293r.get(i9)).getY();
            i9++;
            if (m13244J(x9, y9, ((EzyTouchEvent.TouchEvent) this.f14293r.get(i9)).getX(), ((EzyTouchEvent.TouchEvent) this.f14293r.get(i9)).getY(), fArr[0], fArr[1]) <= f12) {
                return true;
            }
        }
        Log.i("deleteGraph", "消耗时间D >> " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return false;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public void onDestroy() {
        super.onDestroy();
        this.f14290o = null;
        this.f14289n = null;
        this.f14291p = null;
    }

    @Override // p117g5.AbstractC8053a
    /* renamed from: u */
    public void mo12806u() {
        Path path = this.f14290o;
        if (path != null) {
            path.transform(mo12794b(), this.f14291p);
        }
        Path path2 = this.f14291p;
        if (path2 != null) {
            path2.computeBounds(mo12795c(), false);
        }
        RectF rectFMo12795c = mo12795c();
        float f10 = rectFMo12795c.left;
        if (f10 == rectFMo12795c.right && f10 != 0.0f) {
            rectFMo12795c.left = f10 - 1;
        }
        float f11 = rectFMo12795c.top;
        if (f11 != rectFMo12795c.bottom || f11 == 0.0f) {
            return;
        }
        rectFMo12795c.top = f11 - 1;
    }

    @Override // p137i5.C8134a
    /* renamed from: v */
    public String mo7865v() {
        return this.f14285j;
    }

    @Override // p137i5.C8134a
    /* renamed from: w */
    public Integer mo7866w() {
        return this.f14286k;
    }

    /* renamed from: x */
    public final ArrayList m13253x() {
        return this.f14293r;
    }

    /* renamed from: y */
    public final Paint m13254y() {
        return this.f14289n;
    }

    /* renamed from: z */
    public final float m13255z() {
        return this.f14287l;
    }
}
