package okio;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes6.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        AbstractC9979u.m20294g(sink, "<this>");
        return new GzipSink(sink);
    }
}
