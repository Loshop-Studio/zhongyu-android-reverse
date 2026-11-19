package okio;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes5.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        AbstractC9133u.m16133g(sink, "<this>");
        return new GzipSink(sink);
    }
}
