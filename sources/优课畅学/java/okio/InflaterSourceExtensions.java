package okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes5.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        AbstractC9133u.m16133g(source, "<this>");
        AbstractC9133u.m16133g(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
