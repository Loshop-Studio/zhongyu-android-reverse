package p137i5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;

/* renamed from: i5.a */
/* loaded from: classes4.dex */
public class C8134a extends AbstractC8053a {

    /* renamed from: g */
    public String f13905g;

    /* renamed from: h */
    public Integer f13906h;

    public /* synthetic */ C8134a(String str, RectF rectF, String str2, Integer num, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i9 & 4) != 0 ? null : str2, (i9 & 8) != 0 ? null : num);
    }

    @Override // p117g5.InterfaceC8055c
    public AbstractC8053a copy() {
        C8134a c8134a = new C8134a(getId(), new RectF(mo12797f()), mo7865v(), mo7866w());
        c8134a.m12805t(mo12794b());
        Iterator it = mo12796e().iterator();
        while (it.hasNext()) {
            c8134a.mo7864r(((InterfaceC8055c) it.next()).copy());
        }
        return c8134a;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    /* renamed from: g */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C7084b mo12798g() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C7084b c7084bMo12798g = super.mo12798g();
        String strMo7865v = mo7865v();
        if (strMo7865v != null) {
            c7084bMo12798g.m8392C(strMo7865v);
        }
        Integer numMo7866w = mo7866w();
        if (numMo7866w != null) {
            c7084bMo12798g.m8393D(numMo7866w.intValue());
        }
        return c7084bMo12798g;
    }

    @Override // p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot = super.getSnapshot();
        String strMo7865v = mo7865v();
        if (strMo7865v != null) {
            snapshot.m9039R(strMo7865v);
        }
        Integer numMo7866w = mo7866w();
        if (numMo7866w != null) {
            snapshot.m9040S(numMo7866w.intValue());
        }
        return snapshot;
    }

    @Override // p117g5.InterfaceC8055c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
    }

    /* renamed from: l */
    public void mo7861l(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    /* renamed from: v */
    public String mo7865v() {
        return this.f13905g;
    }

    /* renamed from: w */
    public Integer mo7866w() {
        return this.f13906h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8134a(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f13905g = str;
        this.f13906h = num;
    }
}
