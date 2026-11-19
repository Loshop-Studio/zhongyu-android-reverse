package p118da;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: da.a */
/* loaded from: classes5.dex */
public class C9007a extends AbstractC5179a {

    /* renamed from: g */
    public String f20981g;

    /* renamed from: h */
    public Integer f20982h;

    public /* synthetic */ C9007a(String str, RectF rectF, String str2, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        C9007a c9007a = new C9007a(getId(), new RectF(mo2718g()), mo2867w(), mo2868x());
        c9007a.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            c9007a.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return c9007a;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot = super.getSnapshot();
        String strMo2867w = mo2867w();
        if (strMo2867w != null) {
            snapshot.m15657T(strMo2867w);
        }
        Integer numMo2868x = mo2868x();
        if (numMo2868x != null) {
            snapshot.m15658U(numMo2868x.intValue());
        }
        return snapshot;
    }

    @Override // ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    /* renamed from: h */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C8462b mo2719h() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C8462b c8462bMo2719h = super.mo2719h();
        String strMo2867w = mo2867w();
        if (strMo2867w != null) {
            c8462bMo2719h.m15010B(strMo2867w);
        }
        Integer numMo2868x = mo2868x();
        if (numMo2868x != null) {
            c8462bMo2719h.m15011C(numMo2868x.intValue());
        }
        return c8462bMo2719h;
    }

    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
    }

    /* renamed from: w */
    public String mo2867w() {
        return this.f20981g;
    }

    /* renamed from: x */
    public Integer mo2868x() {
        return this.f20982h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9007a(String id2, RectF outRectF, String str, Integer num) {
        super(id2, outRectF);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        this.f20981g = str;
        this.f20982h = num;
    }
}
