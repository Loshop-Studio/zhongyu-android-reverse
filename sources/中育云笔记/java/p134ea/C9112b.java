package p134ea;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyGraphEnum;
import ga.InterfaceC9284d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ea.b */
/* loaded from: classes5.dex */
public class C9112b extends AbstractC9113c {
    public /* synthetic */ C9112b(String str, RectF rectF, InterfaceC9284d interfaceC9284d, String str2, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9284d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    /* renamed from: T */
    public final void m17911T(Canvas canvas, Matrix matrix) {
        if (m17914C() == null) {
            return;
        }
        m17917F().reset();
        m17917F().postConcat(mo2714b());
        m17917F().postConcat(matrix);
        Path pathM17914C = m17914C();
        if (pathM17914C != null) {
            pathM17914C.transform(m17917F(), m17915D());
        }
        Paint paintM17932z = m17932z();
        if (paintM17932z != null) {
            if (m17915D() != null) {
                Path pathM17915D = m17915D();
                if (pathM17915D != null) {
                    canvas.drawPath(pathM17915D, paintM17932z);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("exception renderPath == null ");
            sb2.append(hashCode());
            sb2.append(" path = ");
            Path pathM17914C2 = m17914C();
            sb2.append(pathM17914C2 != null ? Boolean.valueOf(pathM17914C2.isEmpty()) : null);
            sb2.append(" path = ");
            Path pathM17914C3 = m17914C();
            sb2.append(pathM17914C3 != null ? Boolean.valueOf(pathM17914C3.isEmpty()) : null);
            sb2.append(" StrokeGraph id = ");
            sb2.append(getId());
            System.out.println((Object) sb2.toString());
        }
    }

    @Override // p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        C9112b c9112b = new C9112b(getId(), new RectF(mo2718g()), m17916E(), mo2867w(), mo2868x());
        c9112b.m17931y().addAll(m17931y());
        Path pathM17914C = m17914C();
        if (pathM17914C != null) {
            c9112b.m17924M(new Path(pathM17914C));
        }
        Paint paintM17932z = m17932z();
        if (paintM17932z != null) {
            c9112b.m17923L(new Paint(paintM17932z), m17912A(), m17913B());
        }
        c9112b.m2729u(mo2714b());
        c9112b.mo2730v();
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            c9112b.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return c9112b;
    }

    @Override // p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // p118da.C9007a, ba.InterfaceC5180b
    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (m17914C() == null || m17932z() == null) {
            m17919H();
        }
        m17911T(canvas, matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9112b(String id2, RectF outRect, InterfaceC9284d interfaceC9284d, String str, Integer num) {
        super(id2, outRect, interfaceC9284d, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRect, "outRect");
    }
}
