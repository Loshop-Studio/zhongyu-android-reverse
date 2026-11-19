package p140q;

import android.support.v4.media.C0039h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5805t;
import p041d2.C5413c;

/* renamed from: q.g */
/* loaded from: classes2.dex */
public final class C6403g {

    /* renamed from: a */
    public final long f10507a;

    /* renamed from: b */
    public final LinkedHashMap f10508b = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: c */
    public long f10509c;

    /* renamed from: d */
    public final /* synthetic */ C0039h f10510d;

    public C6403g(long j7, C0039h c0039h) {
        this.f10510d = c0039h;
        this.f10507a = j7;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    /* renamed from: a */
    public final void m6068a(Object obj, Object obj2, C6402f c6402f) {
        C6402f c6402f2 = (C6402f) obj2;
        ((C5413c) this.f10510d.f96b).m4806g((C6397a) obj, c6402f2.f10504a, c6402f2.f10505b, c6402f2.f10506c);
    }

    /* renamed from: b */
    public final long m6069b() {
        if (this.f10509c == -1) {
            long jM6070c = 0;
            for (Map.Entry entry : this.f10508b.entrySet()) {
                jM6070c += m6070c(entry.getKey(), entry.getValue());
            }
            this.f10509c = jM6070c;
        }
        return this.f10509c;
    }

    /* renamed from: c */
    public final long m6070c(Object obj, Object obj2) throws Exception {
        try {
            long j7 = ((C6402f) obj2).f10506c;
            if (j7 >= 0) {
                return j7;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j7).toString());
        } catch (Exception e) {
            this.f10509c = -1L;
            throw e;
        }
    }

    /* renamed from: d */
    public final void m6071d(long j7) {
        while (m6069b() > j7) {
            LinkedHashMap linkedHashMap = this.f10508b;
            if (linkedHashMap.isEmpty()) {
                if (m6069b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) AbstractC5805t.m5227g0(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f10509c = m6069b() - m6070c(key, value);
            m6068a(key, value, null);
        }
    }
}
