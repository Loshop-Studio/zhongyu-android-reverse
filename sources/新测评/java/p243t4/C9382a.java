package p243t4;

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

/* renamed from: t4.a */
/* loaded from: classes4.dex */
public final class C9382a extends C9383b {
    public /* synthetic */ C9382a(String str, RectF rectF, InterfaceC9668d interfaceC9668d, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i10 & 4) != 0 ? null : interfaceC9668d, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    @Override // p243t4.C9383b, p232s4.C9136a, p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        C9382a c9382a = new C9382a(getId(), new RectF(mo14996g()), m15687E(), mo6754w(), mo6755x());
        c9382a.m15702y().addAll(m15702y());
        Path pathM15685C = m15685C();
        if (pathM15685C != null) {
            c9382a.m15695M(new Path(pathM15685C));
        }
        Paint paintM15703z = m15703z();
        if (paintM15703z != null) {
            c9382a.m15694L(new Paint(paintM15703z), m15683A(), m15684B());
        }
        c9382a.m15004u(mo14993b());
        c9382a.mo15005v();
        c9382a.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            c9382a.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return c9382a;
    }

    @Override // p243t4.C9383b, p232s4.C9136a, p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9382a(String id, RectF outRect, InterfaceC9668d interfaceC9668d, String str, Integer num) {
        super(id, outRect, interfaceC9668d, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
    }
}
