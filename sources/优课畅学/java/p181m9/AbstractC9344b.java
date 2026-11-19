package p181m9;

import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;

/* renamed from: m9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9344b {
    /* renamed from: b */
    public static final String m17179b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - TbsListener.ErrorCode.INFO_CODE_MINIQB) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + TbsListener.ErrorCode.INFO_CODE_MINIQB) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        C9114c0 c9114c0 = C9114c0.f17482a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC9133u.m16132f(str2, "format(...)");
        return str2;
    }

    /* renamed from: c */
    public static final void m17180c(Logger logger, AbstractC9343a abstractC9343a, C9345c c9345c, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(c9345c.m17189h());
        sb.append(' ');
        C9114c0 c9114c0 = C9114c0.f17482a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC9133u.m16132f(str2, "format(...)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC9343a.m17172b());
        logger.fine(sb.toString());
    }
}
