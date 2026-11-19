package okio;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final /* synthetic */ class Okio__OkioKt {
    @NotNull
    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source buffer) {
        C2769l.m9241e(buffer, "$this$buffer");
        return new RealBufferedSource(buffer);
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink buffer) {
        C2769l.m9241e(buffer, "$this$buffer");
        return new RealBufferedSink(buffer);
    }
}
