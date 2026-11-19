package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink deflate, @NotNull Deflater deflater) {
        C2769l.m9241e(deflate, "$this$deflate");
        C2769l.m9241e(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink deflate, Deflater deflater, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            deflater = new Deflater();
        }
        C2769l.m9241e(deflate, "$this$deflate");
        C2769l.m9241e(deflater, "deflater");
        return new DeflaterSink(deflate, deflater);
    }
}
