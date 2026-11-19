package p127h5;

import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzySource;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p169l5.InterfaceC8891e;
import p189n5.C9097c;

/* renamed from: h5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8098a extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC8891e f13807s;

    /* renamed from: t */
    public String f13808t;

    /* renamed from: u */
    public Integer f13809u;

    /* renamed from: v */
    public String f13810v;

    /* renamed from: w */
    public final Paint f13811w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8098a(String id, RectF outRectF, InterfaceC8891e sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        this.f13807s = sourceLoader;
        this.f13808t = str;
        this.f13809u = num;
        Paint paint = new Paint();
        this.f13811w = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: H */
    public final String m12932H() {
        return this.f13810v;
    }

    /* renamed from: I */
    public final InterfaceC8891e m12933I() {
        return this.f13807s;
    }

    /* renamed from: J */
    public void m12934J() {
        String strPath;
        InterfaceC8891e interfaceC8891e = this.f13807s;
        String strMo7865v = mo7865v();
        Intrinsics.checkNotNull(strMo7865v);
        Integer numMo7866w = mo7866w();
        Intrinsics.checkNotNull(numMo7866w);
        EzySource.FileSource.FileInfo fileInfoMo13815e = interfaceC8891e.mo13815e(strMo7865v, numMo7866w.intValue());
        if (fileInfoMo13815e == null || (strPath = this.f13807s.path()) == null) {
            return;
        }
        this.f13810v = new File(C9097c.f15322d.m14637a(strPath, DocumentType.IMAGE), fileInfoMo13815e.getName()).getAbsolutePath();
    }

    /* renamed from: K */
    public final void m12935K(String str) {
        this.f13810v = str;
    }

    @Override // p137i5.C8134a, p117g5.AbstractC8053a, p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b snapshot = super.getSnapshot();
        String str = this.f13810v;
        if (str != null) {
            String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, File.separatorChar, 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            snapshot.m9031J(strSubstring);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: v */
    public String mo7865v() {
        return this.f13808t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p137i5.C8134a
    /* renamed from: w */
    public Integer mo7866w() {
        return this.f13809u;
    }
}
