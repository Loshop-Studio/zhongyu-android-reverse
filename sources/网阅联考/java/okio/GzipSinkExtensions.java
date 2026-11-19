package okio;

import com.efs.sdk.base.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5173bv = {1, 0, 3}, m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b¨\u0006\u0003"}, m5175d2 = {Constants.CP_GZIP, "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, m5176k = 2, m5177mv = {1, 4, 0})
@JvmName(name = "-GzipSinkExtensions")
/* renamed from: okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes2.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink gzip) {
        Intrinsics.checkNotNullParameter(gzip, "$this$gzip");
        return new GzipSink(gzip);
    }
}
