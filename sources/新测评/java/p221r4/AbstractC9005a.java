package p221r4;

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
import p265v4.InterfaceC9668d;
import p285x4.C9850c;

/* renamed from: r4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9005a extends GroupGraph {

    /* renamed from: s */
    public final InterfaceC9668d f15415s;

    /* renamed from: t */
    public String f15416t;

    /* renamed from: u */
    public Integer f15417u;

    /* renamed from: v */
    public String f15418v;

    /* renamed from: w */
    public final Paint f15419w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9005a(String id, RectF outRectF, InterfaceC9668d sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(outRectF, "outRectF");
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        this.f15415s = sourceLoader;
        this.f15416t = str;
        this.f15417u = num;
        Paint paint = new Paint();
        this.f15419w = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: I */
    public final String m15149I() {
        return this.f15418v;
    }

    /* renamed from: J */
    public final InterfaceC9668d m15150J() {
        return this.f15415s;
    }

    /* renamed from: K */
    public void m15151K() {
        String strPath;
        InterfaceC9668d interfaceC9668d = this.f15415s;
        String strMo6754w = mo6754w();
        Intrinsics.checkNotNull(strMo6754w);
        Integer numMo6755x = mo6755x();
        Intrinsics.checkNotNull(numMo6755x);
        EzySource.FileSource.FileInfo fileInfoMo16170e = interfaceC9668d.mo16170e(strMo6754w, numMo6755x.intValue());
        if (fileInfoMo16170e == null || (strPath = this.f15415s.path()) == null) {
            return;
        }
        this.f15418v = new File(C9850c.f17405d.m16497a(strPath, DocumentType.IMAGE), fileInfoMo16170e.getName()).getAbsolutePath();
    }

    /* renamed from: L */
    public final void m15152L(String str) {
        this.f15418v = str;
    }

    @Override // p232s4.C9136a, p210q4.AbstractC8886a, p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b snapshot = super.getSnapshot();
        String str = this.f15418v;
        if (str != null) {
            String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, File.separatorChar, 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            snapshot.m7899J(strSubstring);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: w */
    public String mo6754w() {
        return this.f15416t;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p232s4.C9136a
    /* renamed from: x */
    public Integer mo6755x() {
        return this.f15417u;
    }
}
