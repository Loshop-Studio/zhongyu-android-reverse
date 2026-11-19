package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: androidx.room.m */
/* loaded from: classes.dex */
class C0630m {

    /* renamed from: a */
    final Set<LiveData> f4050a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b */
    private final AbstractC0621h0 f4051b;

    C0630m(AbstractC0621h0 abstractC0621h0) {
        this.f4051b = abstractC0621h0;
    }

    /* renamed from: a */
    <T> LiveData<T> m3606a(String[] strArr, boolean z3, Callable<T> callable) {
        return new C0625j0(this.f4051b, this, z3, callable, strArr);
    }

    /* renamed from: b */
    void m3607b(LiveData liveData) {
        this.f4050a.add(liveData);
    }

    /* renamed from: c */
    void m3608c(LiveData liveData) {
        this.f4050a.remove(liveData);
    }
}
