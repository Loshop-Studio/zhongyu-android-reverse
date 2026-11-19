package coil3.network;

import coil3.network.C4590c;
import coil3.network.internal.UtilsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.BufferedSink;
import okio.BufferedSource;
import p159u.C7745l;

/* renamed from: coil3.network.a */
/* loaded from: classes3.dex */
public final class C4588a {

    /* renamed from: a */
    public static final C4588a f1858a = new C4588a();

    /* renamed from: a */
    public final C7745l m1966a(BufferedSource bufferedSource) throws NumberFormatException {
        int i6 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        long j6 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        long j7 = Long.parseLong(bufferedSource.readUtf8LineStrict());
        C4590c.a aVar = new C4590c.a();
        int i7 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        for (int i8 = 0; i8 < i7; i8++) {
            UtilsKt.m1982b(aVar, bufferedSource.readUtf8LineStrict());
        }
        return new C7745l(i6, j6, j7, aVar.m1978b(), null, null, 48, null);
    }

    /* renamed from: b */
    public final void m1967b(C7745l c7745l, BufferedSink bufferedSink) {
        bufferedSink.writeDecimalLong(c7745l.m9242d()).writeByte(10);
        bufferedSink.writeDecimalLong(c7745l.m9244f()).writeByte(10);
        bufferedSink.writeDecimalLong(c7745l.m9245g()).writeByte(10);
        Set<Map.Entry> setEntrySet = c7745l.m9243e().m1974b().entrySet();
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
