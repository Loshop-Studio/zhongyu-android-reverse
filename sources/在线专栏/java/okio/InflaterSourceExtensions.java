package okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source inflate, @NotNull Inflater inflater) {
        C2769l.m9241e(inflate, "$this$inflate");
        C2769l.m9241e(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source inflate, Inflater inflater, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            inflater = new Inflater();
        }
        C2769l.m9241e(inflate, "$this$inflate");
        C2769l.m9241e(inflater, "inflater");
        return new InflaterSource(inflate, inflater);
    }
}
