package coil3.network;

import coil3.network.C5344c;
import coil3.network.internal.UtilsKt;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.BufferedSink;
import okio.BufferedSource;
import p257u.C9654l;

/* renamed from: coil3.network.a */
/* loaded from: classes3.dex */
public final class C5342a {

    /* renamed from: a */
    public static final C5342a f3069a = new C5342a();

    /* renamed from: a */
    public final C9654l m2860a(BufferedSource bufferedSource) throws NumberFormatException {
        int i9 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j9 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j10 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        C5344c.a aVar = new C5344c.a();
        int i10 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i11 = 0; i11 < i10; i11++) {
            UtilsKt.m2876b(aVar, bufferedSource.readUtf8LineStrict());
        }
        return new C9654l(i9, j9, j10, aVar.m2872b(), null, null, 48, null);
    }

    /* renamed from: b */
    public final void m2861b(C9654l c9654l, BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(c9654l.m15995d()).writeByte(10);
        bufferedSink.writeDecimalLong(c9654l.m15997f()).writeByte(10);
        bufferedSink.writeDecimalLong(c9654l.m15998g()).writeByte(10);
        Set<Map.Entry> setEntrySet = c9654l.m15996e().m2868b().entrySet();
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
