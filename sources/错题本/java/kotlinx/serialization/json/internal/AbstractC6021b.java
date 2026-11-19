package kotlinx.serialization.json.internal;

import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.text.AbstractC5862w;

/* renamed from: kotlinx.serialization.json.internal.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6021b {

    /* renamed from: a */
    public static final int f9544a;

    static {
        Object objM13956constructorimpl;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM13956constructorimpl = Result.m13956constructorimpl(property != null ? AbstractC5862w.m5410D(property) : null);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Integer num = (Integer) (Result.m13961isFailureimpl(objM13956constructorimpl) ? null : objM13956constructorimpl);
        f9544a = num != null ? num.intValue() : 2097152;
    }
}
