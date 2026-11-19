package okio.internal;

import kotlin.jvm.internal.AbstractC9133u;
import okio.TypedOptions;

/* renamed from: okio.internal.-BufferedSource, reason: invalid class name */
/* loaded from: classes5.dex */
public final class BufferedSource {
    public static final <T> T commonSelect(okio.BufferedSource bufferedSource, TypedOptions<T> options) {
        AbstractC9133u.m16133g(bufferedSource, "<this>");
        AbstractC9133u.m16133g(options, "options");
        int iSelect = bufferedSource.select(options.getOptions$okio());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }
}
