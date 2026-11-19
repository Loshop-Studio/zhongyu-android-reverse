package p147j5;

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

/* renamed from: j5.a */
/* loaded from: classes4.dex */
public final class C8214a extends C8215b {
    public /* synthetic */ C8214a(String str, RectF rectF, InterfaceC8891e interfaceC8891e, String str2, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i9 & 4) != 0 ? null : interfaceC8891e, (i9 & 8) != 0 ? null : str2, (i9 & 16) != 0 ? null : num);
    }

    @Override // p147j5.C8215b, p137i5.C8134a, p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        C8214a c8214a = new C8214a(getId(), new RectF(mo12797f()), m13238D(), mo7865v(), mo7866w());
        c8214a.m13253x().addAll(m13253x());
        Path pathM13236B = m13236B();
        if (pathM13236B != null) {
            c8214a.m13246L(new Path(pathM13236B));
        }
        Paint paintM13254y = m13254y();
        if (paintM13254y != null) {
            c8214a.m13245K(new Paint(paintM13254y), m13255z(), m13235A());
        }
        c8214a.m12805t(mo12794b());
        c8214a.mo12806u();
        c8214a.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            c8214a.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return c8214a;
    }

    @Override // p147j5.C8215b, p137i5.C8134a, p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8214a(String id, RectF outRect, InterfaceC8891e interfaceC8891e, String str, Integer num) {
        super(id, outRect, interfaceC8891e, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
    }
}
