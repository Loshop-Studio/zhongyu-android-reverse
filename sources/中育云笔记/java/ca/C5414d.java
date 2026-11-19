package ca;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.C10357t;

/* renamed from: ca.d */
/* loaded from: classes5.dex */
public final class C5414d extends GroupGraph {

    /* renamed from: r */
    public final InterfaceC9284d f3486r;

    /* renamed from: s */
    public String f3487s;

    /* renamed from: t */
    public Integer f3488t;

    /* renamed from: u */
    public String f3489u;

    /* renamed from: v */
    public Paint f3490v;

    /* renamed from: w */
    public Matrix f3491w;

    /* renamed from: x */
    public Path f3492x;

    /* renamed from: y */
    public float f3493y;

    public /* synthetic */ C5414d(String str, RectF rectF, InterfaceC9284d interfaceC9284d, String str2, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9284d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    /* renamed from: E */
    public final String m2877E() {
        return this.f3489u;
    }

    /* renamed from: F */
    public final Paint m2878F() {
        return this.f3490v;
    }

    /* renamed from: G */
    public final void m2879G(String str) {
        this.f3489u = str;
        m14490C(true);
    }

    /* renamed from: H */
    public final void m2880H(Paint paint) {
        this.f3490v = paint;
        m14490C(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        C5414d c5414d = new C5414d(getId(), new RectF(mo2718g()), this.f3486r, mo2867w(), mo2868x());
        c5414d.m2879G(this.f3489u);
        Paint paint = this.f3490v;
        if (paint != null) {
            c5414d.m2880H(new Paint(paint));
        }
        c5414d.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            c5414d.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return c5414d;
    }

    @Override // p118da.C9007a, ba.AbstractC5179a, ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot = super.getSnapshot();
        Paint paint = this.f3490v;
        if (paint != null) {
            snapshot.m15655R(AbstractC10350m.m21653a(paint, 1.0f, 0.0f));
        }
        String str = this.f3489u;
        if (str != null) {
            snapshot.m15647J(str);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.TEXT_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a, ba.InterfaceC5180b
    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        InterfaceC9284d interfaceC9284d;
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if ((this.f3489u == null || this.f3490v == null) && (interfaceC9284d = this.f3486r) != null) {
            String strMo2867w = mo2867w();
            AbstractC9979u.m20291d(strMo2867w);
            Integer numMo2868x = mo2868x();
            AbstractC9979u.m20291d(numMo2868x);
            EzySource.TextSource.TextInfo textInfoMo18291c = interfaceC9284d.mo18291c(strMo2867w, numMo2868x.intValue());
            if (textInfoMo18291c != null) {
                if (this.f3489u == null) {
                    m2879G(textInfoMo18291c.getContent());
                }
                if (this.f3490v == null) {
                    EzyPaint.Paint paintM16194m = textInfoMo18291c.m16194m();
                    AbstractC9979u.m20293f(paintM16194m, "it.paint");
                    m2880H(AbstractC10350m.m21656d(paintM16194m));
                }
            }
        }
        this.f3491w.reset();
        this.f3491w.postConcat(mo2714b());
        this.f3491w.postConcat(matrix);
        Paint paint = this.f3490v;
        if (paint != null) {
            this.f3493y = -paint.getFontMetrics().top;
            C10357t c10357t = C10357t.f24666a;
            String str = this.f3489u;
            if (str == null) {
                str = "";
            }
            for (String str2 : c10357t.m21684a(str, paint, mo2718g().width())) {
                this.f3492x.reset();
                paint.getTextPath(str2, 0, str2.length(), 0.0f, this.f3493y, this.f3492x);
                this.f3492x.transform(this.f3491w);
                canvas.drawPath(this.f3492x, paint);
                this.f3493y += paint.getFontMetrics().bottom - paint.getFontMetrics().top;
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: w */
    public String mo2867w() {
        return this.f3487s;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: x */
    public Integer mo2868x() {
        return this.f3488t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5414d(String id2, RectF outRectF, InterfaceC9284d interfaceC9284d, String str, Integer num) {
        super(id2, outRectF, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        this.f3486r = interfaceC9284d;
        this.f3487s = str;
        this.f3488t = num;
        this.f3491w = new Matrix();
        this.f3492x = new Path();
    }
}
