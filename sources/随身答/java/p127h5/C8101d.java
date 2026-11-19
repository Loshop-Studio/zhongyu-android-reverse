package p127h5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9694m;
import p263u5.C9701t;

/* renamed from: h5.d */
/* loaded from: classes4.dex */
public final class C8101d extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC8891e f13819s;

    /* renamed from: t */
    public String f13820t;

    /* renamed from: u */
    public Integer f13821u;

    /* renamed from: v */
    public String f13822v;

    /* renamed from: w */
    public Paint f13823w;

    /* renamed from: x */
    public Matrix f13824x;

    /* renamed from: y */
    public Path f13825y;

    /* renamed from: z */
    public float f13826z;

    public /* synthetic */ C8101d(String str, RectF rectF, InterfaceC8891e interfaceC8891e, String str2, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i9 & 4) != 0 ? null : interfaceC8891e, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : num);
    }

    /* renamed from: H */
    public final String m12942H() {
        return this.f13822v;
    }

    /* renamed from: I */
    public final Paint m12943I() {
        return this.f13823w;
    }

    /* renamed from: J */
    public final void m12944J(String str) {
        this.f13822v = str;
        m7854D(true);
    }

    /* renamed from: K */
    public final void m12945K(Paint paint) {
        this.f13823w = paint;
        m7854D(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        C8101d c8101d = new C8101d(getId(), new RectF(mo12797f()), this.f13819s, mo7865v(), mo7866w());
        c8101d.m12944J(this.f13822v);
        Paint paint = this.f13823w;
        if (paint != null) {
            c8101d.m12945K(new Paint(paint));
        }
        c8101d.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            c8101d.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return c8101d;
    }

    @Override // p137i5.C8134a, p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot = super.getSnapshot();
        Paint paint = this.f13823w;
        if (paint != null) {
            snapshot.m9037P(AbstractC9694m.m16193a(paint, 1.0f, 0.0f));
        }
        String str = this.f13822v;
        if (str != null) {
            snapshot.m9029H(str);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.TEXT_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a, p117g5.InterfaceC8054b
    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        InterfaceC8891e interfaceC8891e;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if ((this.f13822v == null || this.f13823w == null) && (interfaceC8891e = this.f13819s) != null) {
            String strMo7865v = mo7865v();
            Intrinsics.checkNotNull(strMo7865v);
            Integer numMo7866w = mo7866w();
            Intrinsics.checkNotNull(numMo7866w);
            EzySource.TextSource.TextInfo textInfoMo13813c = interfaceC8891e.mo13813c(strMo7865v, numMo7866w.intValue());
            if (textInfoMo13813c != null) {
                if (this.f13822v == null) {
                    m12944J(textInfoMo13813c.getContent());
                }
                if (this.f13823w == null) {
                    EzyPaint.Paint paintM9565u = textInfoMo13813c.m9565u();
                    Intrinsics.checkNotNullExpressionValue(paintM9565u, "it.paint");
                    m12945K(AbstractC9694m.m16196d(paintM9565u));
                }
            }
        }
        this.f13824x.reset();
        this.f13824x.postConcat(mo12794b());
        this.f13824x.postConcat(matrix);
        Paint paint = this.f13823w;
        if (paint != null) {
            this.f13826z = -paint.getFontMetrics().top;
            C9701t c9701t = C9701t.f17139a;
            String str = this.f13822v;
            if (str == null) {
                str = "";
            }
            for (String str2 : c9701t.m16219a(str, paint, mo12797f().width())) {
                this.f13825y.reset();
                paint.getTextPath(str2, 0, str2.length(), 0.0f, this.f13826z, this.f13825y);
                this.f13825y.transform(this.f13824x);
                canvas.drawPath(this.f13825y, paint);
                this.f13826z += paint.getFontMetrics().bottom - paint.getFontMetrics().top;
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: v */
    public String mo7865v() {
        return this.f13820t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: w */
    public Integer mo7866w() {
        return this.f13821u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8101d(String id, RectF outRectF, InterfaceC8891e interfaceC8891e, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f13819s = interfaceC8891e;
        this.f13820t = str;
        this.f13821u = num;
        this.f13824x = new Matrix();
        this.f13825y = new Path();
    }
}
