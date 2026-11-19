package ne;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9960c0;

/* renamed from: ne.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10412b {
    /* renamed from: b */
    public static final String m21777b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        C9960c0 c9960c0 = C9960c0.f23411a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC9979u.m20293f(str2, "format(format, *args)");
        return str2;
    }

    /* renamed from: c */
    public static final void m21778c(AbstractC10411a abstractC10411a, C10414d c10414d, String str) {
        Logger loggerM21805a = C10415e.f24783h.m21805a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10414d.m21785f());
        sb2.append(' ');
        C9960c0 c9960c0 = C9960c0.f23411a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC9979u.m20293f(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(abstractC10411a.m21770b());
        loggerM21805a.fine(sb2.toString());
    }
}
