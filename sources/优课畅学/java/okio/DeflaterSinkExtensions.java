package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes5.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        AbstractC9133u.m16133g(sink, "<this>");
        AbstractC9133u.m16133g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        AbstractC9133u.m16133g(sink, "<this>");
        AbstractC9133u.m16133g(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
