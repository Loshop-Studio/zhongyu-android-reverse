package p221r4;

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
import p077e5.AbstractC7351l;
import p077e5.C7358s;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;

/* renamed from: r4.d */
/* loaded from: classes4.dex */
public final class C9008d extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC9668d f15427s;

    /* renamed from: t */
    public String f15428t;

    /* renamed from: u */
    public Integer f15429u;

    /* renamed from: v */
    public String f15430v;

    /* renamed from: w */
    public Paint f15431w;

    /* renamed from: x */
    public Matrix f15432x;

    /* renamed from: y */
    public Path f15433y;

    /* renamed from: z */
    public float f15434z;

    public /* synthetic */ C9008d(String str, RectF rectF, InterfaceC9668d interfaceC9668d, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9668d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    /* renamed from: I */
    public final String m15159I() {
        return this.f15430v;
    }

    /* renamed from: J */
    public final Paint m15160J() {
        return this.f15431w;
    }

    /* renamed from: K */
    public final void m15161K(String str) {
        this.f15430v = str;
        m6742E(true);
    }

    /* renamed from: L */
    public final void m15162L(Paint paint) {
        this.f15431w = paint;
        m6742E(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        C9008d c9008d = new C9008d(getId(), new RectF(mo14996g()), this.f15427s, mo6754w(), mo6755x());
        c9008d.m15161K(this.f15430v);
        Paint paint = this.f15431w;
        if (paint != null) {
            c9008d.m15162L(new Paint(paint));
        }
        c9008d.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            c9008d.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return c9008d;
    }

    @Override // p232s4.C9136a, p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot = super.getSnapshot();
        Paint paint = this.f15431w;
        if (paint != null) {
            snapshot.m7905P(AbstractC7351l.m11770a(paint, 1.0f, 0.0f));
        }
        String str = this.f15430v;
        if (str != null) {
            snapshot.m7897H(str);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.TEXT_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a, p210q4.InterfaceC8887b
    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        InterfaceC9668d interfaceC9668d;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if ((this.f15430v == null || this.f15431w == null) && (interfaceC9668d = this.f15427s) != null) {
            String strMo6754w = mo6754w();
            Intrinsics.checkNotNull(strMo6754w);
            Integer numMo6755x = mo6755x();
            Intrinsics.checkNotNull(numMo6755x);
            EzySource.TextSource.TextInfo textInfoMo16168c = interfaceC9668d.mo16168c(strMo6754w, numMo6755x.intValue());
            if (textInfoMo16168c != null) {
                if (this.f15430v == null) {
                    m15161K(textInfoMo16168c.getContent());
                }
                if (this.f15431w == null) {
                    EzyPaint.Paint paintM8415r = textInfoMo16168c.m8415r();
                    Intrinsics.checkNotNullExpressionValue(paintM8415r, "it.paint");
                    m15162L(AbstractC7351l.m11773d(paintM8415r));
                }
            }
        }
        this.f15432x.reset();
        this.f15432x.postConcat(mo14993b());
        this.f15432x.postConcat(matrix);
        Paint paint = this.f15431w;
        if (paint != null) {
            this.f15434z = -paint.getFontMetrics().top;
            C7358s c7358s = C7358s.f11926a;
            String str = this.f15430v;
            if (str == null) {
                str = "";
            }
            for (String str2 : c7358s.m11795a(str, paint, mo14996g().width())) {
                this.f15433y.reset();
                paint.getTextPath(str2, 0, str2.length(), 0.0f, this.f15434z, this.f15433y);
                this.f15433y.transform(this.f15432x);
                canvas.drawPath(this.f15433y, paint);
                this.f15434z += paint.getFontMetrics().bottom - paint.getFontMetrics().top;
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: w */
    public String mo6754w() {
        return this.f15428t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: x */
    public Integer mo6755x() {
        return this.f15429u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9008d(String id, RectF outRectF, InterfaceC9668d interfaceC9668d, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f15427s = interfaceC9668d;
        this.f15428t = str;
        this.f15429u = num;
        this.f15432x = new Matrix();
        this.f15433y = new Path();
    }
}
