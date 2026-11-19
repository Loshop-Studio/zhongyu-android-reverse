package ca;

import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import p194ia.C9619c;
import p310qd.AbstractC10793c0;

/* renamed from: ca.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5411a extends GroupGraph {

    /* renamed from: r */
    public final InterfaceC9284d f3474r;

    /* renamed from: s */
    public String f3475s;

    /* renamed from: t */
    public Integer f3476t;

    /* renamed from: u */
    public String f3477u;

    /* renamed from: v */
    public final Paint f3478v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5411a(String id2, RectF outRectF, InterfaceC9284d sourceLoader, String str, Integer num) {
        super(id2, outRectF, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        this.f3474r = sourceLoader;
        this.f3475s = str;
        this.f3476t = num;
        Paint paint = new Paint();
        this.f3478v = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: E */
    public final String m2863E() {
        return this.f3477u;
    }

    /* renamed from: F */
    public final InterfaceC9284d m2864F() {
        return this.f3474r;
    }

    /* renamed from: G */
    public void m2865G() {
        String strPath;
        InterfaceC9284d interfaceC9284d = this.f3474r;
        String strMo2867w = mo2867w();
        AbstractC9979u.m20291d(strMo2867w);
        Integer numMo2868x = mo2868x();
        AbstractC9979u.m20291d(numMo2868x);
        EzySource.FileSource.FileInfo fileInfoMo18293e = interfaceC9284d.mo18293e(strMo2867w, numMo2868x.intValue());
        if (fileInfoMo18293e == null || (strPath = this.f3474r.path()) == null) {
            return;
        }
        this.f3477u = new File(C9619c.f22151d.m18862a(strPath, DocumentType.IMAGE), fileInfoMo18293e.getName()).getAbsolutePath();
    }

    /* renamed from: H */
    public final void m2866H(String str) {
        this.f3477u = str;
    }

    @Override // p118da.C9007a, ba.AbstractC5179a, ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b snapshot = super.getSnapshot();
        String str = this.f3477u;
        if (str != null) {
            String strSubstring = str.substring(AbstractC10793c0.m23135k0(str, File.separatorChar, 0, false, 6, null) + 1);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
            snapshot.m15649L(strSubstring);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: w */
    public String mo2867w() {
        return this.f3475s;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, p118da.C9007a
    /* renamed from: x */
    public Integer mo2868x() {
        return this.f3476t;
    }
}
