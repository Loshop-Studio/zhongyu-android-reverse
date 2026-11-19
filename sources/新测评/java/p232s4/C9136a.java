package p232s4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;

/* renamed from: s4.a */
/* loaded from: classes4.dex */
public class C9136a extends AbstractC8886a {

    /* renamed from: g */
    public String f15864g;

    /* renamed from: h */
    public Integer f15865h;

    public /* synthetic */ C9136a(String str, RectF rectF, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: c */
    public AbstractC8886a mo6746c() {
        C9136a c9136a = new C9136a(getId(), new RectF(mo14996g()), mo6754w(), mo6755x());
        c9136a.m15004u(mo14993b());
        Iterator it = mo14995f().iterator();
        while (it.hasNext()) {
            c9136a.mo6753s(((InterfaceC8888c) it.next()).mo6746c());
        }
        return c9136a;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot = super.getSnapshot();
        String strMo6754w = mo6754w();
        if (strMo6754w != null) {
            snapshot.m7907R(strMo6754w);
        }
        Integer numMo6755x = mo6755x();
        if (numMo6755x != null) {
            snapshot.m7908S(numMo6755x.intValue());
        }
        return snapshot;
    }

    @Override // p210q4.InterfaceC8888c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
    }

    @Override // p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    /* renamed from: h */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C6765b mo14997h() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C6765b c6765bMo14997h = super.mo14997h();
        String strMo6754w = mo6754w();
        if (strMo6754w != null) {
            c6765bMo14997h.m7275C(strMo6754w);
        }
        Integer numMo6755x = mo6755x();
        if (numMo6755x != null) {
            c6765bMo14997h.m7276D(numMo6755x.intValue());
        }
        return c6765bMo14997h;
    }

    /* renamed from: m */
    public void mo6749m(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    /* renamed from: w */
    public String mo6754w() {
        return this.f15864g;
    }

    /* renamed from: x */
    public Integer mo6755x() {
        return this.f15865h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9136a(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        this.f15864g = str;
        this.f15865h = num;
    }
}
