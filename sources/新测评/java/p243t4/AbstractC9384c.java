package p243t4;

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
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p077e5.C7350k;
import p232s4.C9136a;
import p265v4.InterfaceC9668d;

/* renamed from: t4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9384c extends C9136a {

    /* renamed from: i */
    public InterfaceC9668d f16341i;

    /* renamed from: j */
    public String f16342j;

    /* renamed from: k */
    public Integer f16343k;

    /* renamed from: l */
    public float f16344l;

    /* renamed from: m */
    public float f16345m;

    /* renamed from: n */
    public Paint f16346n;

    /* renamed from: o */
    public Path f16347o;

    /* renamed from: p */
    public Path f16348p;

    /* renamed from: q */
    public final Matrix f16349q;

    /* renamed from: r */
    public final ArrayList f16350r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9384c(String id, RectF outRectF, InterfaceC9668d interfaceC9668d, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f16341i = interfaceC9668d;
        this.f16342j = str;
        this.f16343k = num;
        this.f16344l = 1.0f;
        this.f16348p = new Path();
        this.f16349q = new Matrix();
        this.f16350r = new ArrayList();
    }

    /* renamed from: A */
    public final float m15683A() {
        return this.f16344l;
    }

    /* renamed from: B */
    public final float m15684B() {
        return this.f16345m;
    }

    /* renamed from: C */
    public final Path m15685C() {
        return this.f16347o;
    }

    /* renamed from: D */
    public final Path m15686D() {
        return this.f16348p;
    }

    /* renamed from: E */
    public final InterfaceC9668d m15687E() {
        return this.f16341i;
    }

    /* renamed from: F */
    public final Matrix m15688F() {
        return this.f16349q;
    }

    /* renamed from: G */
    public final EzySource.TouchSource.TouchInfo m15689G() {
        if (this.f16341i == null || mo6754w() == null || mo6755x() == null) {
            return null;
        }
        InterfaceC9668d interfaceC9668d = this.f16341i;
        Intrinsics.checkNotNull(interfaceC9668d);
        String strMo6754w = mo6754w();
        Intrinsics.checkNotNull(strMo6754w);
        Integer numMo6755x = mo6755x();
        Intrinsics.checkNotNull(numMo6755x);
        return interfaceC9668d.mo16166a(strMo6754w, numMo6755x.intValue());
    }

    /* renamed from: H */
    public void m15690H() {
        EzySource.TouchSource.TouchInfo touchInfoM15689G = m15689G();
        if (touchInfoM15689G != null) {
            List touchEventList = touchInfoM15689G.getTouchEventList();
            Intrinsics.checkNotNullExpressionValue(touchEventList, "it.touchEventList");
            m15699Q(touchEventList);
            m15701S(C7350k.f11918a.m11767c(this.f16350r));
            EzyPaint.Paint paintM8482s = touchInfoM15689G.m8482s();
            Intrinsics.checkNotNullExpressionValue(paintM8482s, "it.paint");
            m15700R(paintM8482s);
            mo15005v();
        }
    }

    /* renamed from: I */
    public final boolean m15691I() {
        Paint paint = this.f16346n;
        return paint != null && Color.alpha(paint.getColor()) < 255;
    }

    /* renamed from: J */
    public final float m15692J(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    /* renamed from: K */
    public final float m15693K(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fM15692J = m15692J(f10, f11, f12, f13);
        float fM15692J2 = m15692J(f10, f11, f14, f15);
        float fM15692J3 = m15692J(f12, f13, f14, f15);
        float f16 = fM15692J3 * fM15692J3;
        float f17 = fM15692J * fM15692J;
        float f18 = fM15692J2 * fM15692J2;
        if (f16 >= f17 + f18) {
            return fM15692J2;
        }
        if (f18 >= f17 + f16) {
            return fM15692J3;
        }
        float f19 = 2;
        float f20 = ((fM15692J + fM15692J2) + fM15692J3) / f19;
        return (f19 * ((float) Math.sqrt((((f20 - fM15692J) * f20) * (f20 - fM15692J2)) * (f20 - fM15692J3)))) / fM15692J;
    }

    /* renamed from: L */
    public final void m15694L(Paint paint, float f10, float f11) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f16346n = paint;
        if (f11 == 0.0f || f10 == 0.0f) {
            f10 = 1.0f;
        }
        this.f16344l = f10;
        this.f16345m = f11;
    }

    /* renamed from: M */
    public final void m15695M(Path path) {
        this.f16347o = path;
    }

    /* renamed from: N */
    public void m15696N(String str) {
        this.f16342j = str;
    }

    /* renamed from: O */
    public void m15697O(Integer num) {
        this.f16343k = num;
    }

    /* renamed from: P */
    public final void m15698P(InterfaceC9668d interfaceC9668d) {
        this.f16341i = interfaceC9668d;
    }

    /* renamed from: Q */
    public final void m15699Q(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f16350r.clear();
        this.f16350r.addAll(list);
    }

    /* renamed from: R */
    public final void m15700R(EzyPaint.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.f16346n != null) {
            return;
        }
        this.f16346n = AbstractC7351l.m11773d(paint);
        this.f16344l = (paint.m7971t() == 0.0f || paint.m7970s() == 0.0f) ? 1.0f : paint.m7970s();
        this.f16345m = paint.m7971t();
    }

    /* renamed from: S */
    public final void m15701S(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = new Path();
        this.f16347o = path2;
        path2.set(path);
    }

    @Override // p232s4.C9136a, p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot = super.getSnapshot();
        Paint paint = this.f16346n;
        if (paint != null) {
            snapshot.m7905P(AbstractC7351l.m11770a(paint, this.f16344l, this.f16345m));
        }
        return snapshot;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    /* renamed from: j */
    public RectF mo14999j(Matrix matrix) {
        if (this.f16347o == null) {
            m15690H();
        }
        Path path = this.f16347o;
        if (path != null) {
            path.transform(mo14993b(), this.f16348p);
        }
        Path path2 = this.f16348p;
        if (path2 != null) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            path2.transform(matrix, this.f16348p);
        }
        RectF rectF = new RectF();
        Path path3 = this.f16348p;
        if (path3 != null) {
            path3.computeBounds(rectF, false);
        }
        float f10 = rectF.left;
        Paint paint = this.f16346n;
        rectF.left = f10 - (paint != null ? paint.getStrokeWidth() : 0.0f);
        float f11 = rectF.top;
        Paint paint2 = this.f16346n;
        rectF.top = f11 - (paint2 != null ? paint2.getStrokeWidth() : 0.0f);
        float f12 = rectF.right;
        Paint paint3 = this.f16346n;
        rectF.right = f12 + (paint3 != null ? paint3.getStrokeWidth() : 0.0f);
        float f13 = rectF.bottom;
        Paint paint4 = this.f16346n;
        rectF.bottom = f13 + (paint4 != null ? paint4.getStrokeWidth() : 0.0f);
        return rectF;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public void onDestroy() {
        super.onDestroy();
        this.f16347o = null;
        this.f16346n = null;
        this.f16348p = null;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    /* renamed from: p */
    public boolean mo15002p(float f10, float f11, float f12) {
        EzySource.TouchSource.TouchInfo touchInfoM15689G;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArr = {f10, f11};
        this.f16349q.reset();
        this.f16349q.postConcat(AbstractC7352m.m11777b(mo14993b()));
        this.f16349q.mapPoints(fArr);
        if (this.f16350r.isEmpty() && (touchInfoM15689G = m15689G()) != null) {
            this.f16350r.addAll(touchInfoM15689G.getTouchEventList());
        }
        int size = this.f16350r.size() - 1;
        int i10 = 0;
        while (i10 < size) {
            float x9 = ((EzyTouchEvent.TouchEvent) this.f16350r.get(i10)).getX();
            float y9 = ((EzyTouchEvent.TouchEvent) this.f16350r.get(i10)).getY();
            i10++;
            if (m15693K(x9, y9, ((EzyTouchEvent.TouchEvent) this.f16350r.get(i10)).getX(), ((EzyTouchEvent.TouchEvent) this.f16350r.get(i10)).getY(), fArr[0], fArr[1]) <= f12) {
                return true;
            }
        }
        Log.i("deleteGraph", "消耗时间D >> " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return false;
    }

    @Override // p210q4.AbstractC8886a
    /* renamed from: v */
    public void mo15005v() {
        Path path = this.f16347o;
        if (path != null) {
            path.transform(mo14993b(), this.f16348p);
        }
        Path path2 = this.f16348p;
        if (path2 != null) {
            path2.computeBounds(mo14994d(), false);
        }
        RectF rectFMo14994d = mo14994d();
        float f10 = rectFMo14994d.left;
        if (f10 == rectFMo14994d.right && f10 != 0.0f) {
            rectFMo14994d.left = f10 - 1;
        }
        float f11 = rectFMo14994d.top;
        if (f11 != rectFMo14994d.bottom || f11 == 0.0f) {
            return;
        }
        rectFMo14994d.top = f11 - 1;
    }

    @Override // p232s4.C9136a
    /* renamed from: w */
    public String mo6754w() {
        return this.f16342j;
    }

    @Override // p232s4.C9136a
    /* renamed from: x */
    public Integer mo6755x() {
        return this.f16343k;
    }

    /* renamed from: y */
    public final ArrayList m15702y() {
        return this.f16350r;
    }

    /* renamed from: z */
    public final Paint m15703z() {
        return this.f16346n;
    }
}
