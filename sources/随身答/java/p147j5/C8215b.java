package p147j5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;

/* renamed from: j5.b */
/* loaded from: classes4.dex */
public class C8215b extends AbstractC8216c {
    public /* synthetic */ C8215b(String str, RectF rectF, InterfaceC8891e interfaceC8891e, String str2, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i9 & 4) != 0 ? null : interfaceC8891e, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : num);
    }

    /* renamed from: S */
    public final void m13234S(Canvas canvas, Matrix matrix) {
        if (m13236B() == null) {
            return;
        }
        m13239E().reset();
        m13239E().postConcat(mo12794b());
        m13239E().postConcat(matrix);
        Path pathM13236B = m13236B();
        if (pathM13236B != null) {
            pathM13236B.transform(m13239E(), m13237C());
        }
        Paint paintM13254y = m13254y();
        if (paintM13254y != null) {
            if (m13237C() != null) {
                Path pathM13237C = m13237C();
                if (pathM13237C != null) {
                    canvas.drawPath(pathM13237C, paintM13254y);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("exception renderPath == null ");
            sb.append(hashCode());
            sb.append(" path = ");
            Path pathM13236B2 = m13236B();
            sb.append(pathM13236B2 != null ? Boolean.valueOf(pathM13236B2.isEmpty()) : null);
            sb.append(" path = ");
            Path pathM13236B3 = m13236B();
            sb.append(pathM13236B3 != null ? Boolean.valueOf(pathM13236B3.isEmpty()) : null);
            sb.append(" StrokeGraph id = ");
            sb.append(getId());
            System.out.println((Object) sb.toString());
        }
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        C8215b c8215b = new C8215b(getId(), new RectF(mo12797f()), m13238D(), mo7865v(), mo7866w());
        c8215b.m13253x().addAll(m13253x());
        Path pathM13236B = m13236B();
        if (pathM13236B != null) {
            c8215b.m13246L(new Path(pathM13236B));
        }
        Paint paintM13254y = m13254y();
        if (paintM13254y != null) {
            c8215b.m13245K(new Paint(paintM13254y), m13255z(), m13235A());
        }
        c8215b.m12805t(mo12794b());
        c8215b.mo12806u();
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            c8215b.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return c8215b;
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // p137i5.C8134a, p117g5.InterfaceC8054b
    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (m13236B() == null || m13254y() == null) {
            m13241G();
        }
        m13234S(canvas, matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8215b(String id, RectF outRect, InterfaceC8891e interfaceC8891e, String str, Integer num) {
        super(id, outRect, interfaceC8891e, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
    }
}
