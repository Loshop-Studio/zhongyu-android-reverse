package coil3.network;

import coil3.network.C5209c;
import coil3.network.internal.UtilsKt;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.BufferedSink;
import okio.BufferedSource;
import p249u.C9526l;

/* renamed from: coil3.network.a */
/* loaded from: classes3.dex */
public final class C5207a {

    /* renamed from: a */
    public static final C5207a f3174a = new C5207a();

    /* renamed from: a */
    public final C9526l m3140a(BufferedSource bufferedSource) throws NumberFormatException {
        int i10 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j10 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j11 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        C5209c.a aVar = new C5209c.a();
        int i11 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i12 = 0; i12 < i11; i12++) {
            UtilsKt.m3156b(aVar, bufferedSource.readUtf8LineStrict());
        }
        return new C9526l(i10, j10, j11, aVar.m3152b(), null, null, 48, null);
    }

    /* renamed from: b */
    public final void m3141b(C9526l c9526l, BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(c9526l.m15892d()).writeByte(10);
        bufferedSink.writeDecimalLong(c9526l.m15894f()).writeByte(10);
        bufferedSink.writeDecimalLong(c9526l.m15895g()).writeByte(10);
        Set<Map.Entry> setEntrySet = c9526l.m15893e().m3148b().entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        bufferedSink.writeDecimalLong(size).writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            Iterator it2 = ((List) entry.getValue()).iterator();
            while (it2.hasNext()) {
                bufferedSink.writeUtf8((String) entry.getKey()).writeUtf8(":").writeUtf8((String) it2.next()).writeByte(10);
            }
        }
    }
}
