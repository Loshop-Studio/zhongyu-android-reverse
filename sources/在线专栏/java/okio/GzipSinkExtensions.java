package okio;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes.dex */
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink gzip) {
        C2769l.m9241e(gzip, "$this$gzip");
        return new GzipSink(gzip);
    }
}
