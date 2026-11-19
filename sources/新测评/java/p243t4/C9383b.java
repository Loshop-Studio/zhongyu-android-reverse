package p243t4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;

/* renamed from: t4.b */
/* loaded from: classes4.dex */
public class C9383b extends AbstractC9384c {
    public /* synthetic */ C9383b(String str, RectF rectF, InterfaceC9668d interfaceC9668d, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9668d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    /* renamed from: T */
    public final void m15682T(Canvas canvas, Matrix matrix) {
        if (m15685C() == null) {
            return;
        }
        m15688F().reset();
        m15688F().postConcat(mo14993b());
        m15688F().postConcat(matrix);
        Path pathM15685C = m15685C();
        if (pathM15685C != null) {
            pathM15685C.transform(m15688F(), m15686D());
        }
        Paint paintM15703z = m15703z();
        if (paintM15703z != null) {
            if (m15686D() != null) {
                Path pathM15686D = m15686D();
                if (pathM15686D != null) {
                    canvas.drawPath(pathM15686D, paintM15703z);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("exception renderPath == null ");
            sb.append(hashCode());
            sb.append(" path = ");
            Path pathM15685C2 = m15685C();
            sb.append(pathM15685C2 != null ? Boolean.valueOf(pathM15685C2.isEmpty()) : null);
            sb.append(" path = ");
            Path pathM15685C3 = m15685C();
            sb.append(pathM15685C3 != null ? Boolean.valueOf(pathM15685C3.isEmpty()) : null);
            sb.append(" StrokeGraph id = ");
            sb.append(getId());
            System.out.println((Object) sb.toString());
        }
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        C9383b c9383b = new C9383b(getId(), new RectF(mo14996g()), m15687E(), mo6754w(), mo6755x());
        c9383b.m15702y().addAll(m15702y());
        Path pathM15685C = m15685C();
        if (pathM15685C != null) {
            c9383b.m15695M(new Path(pathM15685C));
        }
        Paint paintM15703z = m15703z();
        if (paintM15703z != null) {
            c9383b.m15694L(new Paint(paintM15703z), m15683A(), m15684B());
        }
        c9383b.m15004u(mo14993b());
        c9383b.mo15005v();
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            c9383b.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return c9383b;
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // p232s4.C9136a, p210q4.InterfaceC8887b
    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (m15685C() == null || m15703z() == null) {
            m15690H();
        }
        m15682T(canvas, matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9383b(String id, RectF outRect, InterfaceC9668d interfaceC9668d, String str, Integer num) {
        super(id, outRect, interfaceC9668d, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
    }
}
