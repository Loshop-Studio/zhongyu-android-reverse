package p134ea;

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

/* renamed from: ea.a */
/* loaded from: classes5.dex */
public final class C9111a extends C9112b {
    public /* synthetic */ C9111a(String str, RectF rectF, InterfaceC9284d interfaceC9284d, String str2, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9284d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    @Override // p134ea.C9112b, p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        C9111a c9111a = new C9111a(getId(), new RectF(mo2718g()), m17916E(), mo2867w(), mo2868x());
        c9111a.m17931y().addAll(m17931y());
        Path pathM17914C = m17914C();
        if (pathM17914C != null) {
            c9111a.m17924M(new Path(pathM17914C));
        }
        Paint paintM17932z = m17932z();
        if (paintM17932z != null) {
            c9111a.m17923L(new Paint(paintM17932z), m17912A(), m17913B());
        }
        c9111a.m2729u(mo2714b());
        c9111a.mo2730v();
        c9111a.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            c9111a.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return c9111a;
    }

    @Override // p134ea.C9112b, p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9111a(String id2, RectF outRect, InterfaceC9284d interfaceC9284d, String str, Integer num) {
        super(id2, outRect, interfaceC9284d, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRect, "outRect");
    }
}
