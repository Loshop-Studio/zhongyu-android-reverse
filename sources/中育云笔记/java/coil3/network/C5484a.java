package coil3.network;

import coil3.network.C5486c;
import coil3.network.internal.UtilsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.BufferedSink;
import okio.BufferedSource;
import p327s.C11019l;

/* renamed from: coil3.network.a */
/* loaded from: classes3.dex */
public final class C5484a {

    /* renamed from: a */
    public static final C5484a f3849a = new C5484a();

    /* renamed from: a */
    public final C11019l m3231a(BufferedSource bufferedSource) throws NumberFormatException {
        int i10 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j10 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j11 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        C5486c.a aVar = new C5486c.a();
        int i11 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i12 = 0; i12 < i11; i12++) {
            UtilsKt.m3247b(aVar, bufferedSource.readUtf8LineStrict());
        }
        return new C11019l(i10, j10, j11, aVar.m3243b(), null, null, 48, null);
    }

    /* renamed from: b */
    public final void m3232b(C11019l c11019l, BufferedSink bufferedSink) {
        bufferedSink.writeDecimalLong(c11019l.m24340d()).writeByte(10);
        bufferedSink.writeDecimalLong(c11019l.m24342f()).writeByte(10);
        bufferedSink.writeDecimalLong(c11019l.m24343g()).writeByte(10);
        Set<Map.Entry> setEntrySet = c11019l.m24341e().m3239b().entrySet();
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
