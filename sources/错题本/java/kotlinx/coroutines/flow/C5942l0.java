package kotlinx.coroutines.flow;

import androidx.collection.AbstractC0584a;
import java.util.List;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C5926h;
import kotlinx.coroutines.flow.internal.C5935q;

/* renamed from: kotlinx.coroutines.flow.l0 */
/* loaded from: classes4.dex */
public final class C5942l0 implements InterfaceC5917i0 {
    @Override // kotlinx.coroutines.flow.InterfaceC5917i0
    /* renamed from: a */
    public final InterfaceC5910f mo5558a(C5935q c5935q) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i = AbstractC5952r.f9437a;
        C5941l c5941l = new C5941l(new C5926h(startedWhileSubscribed$command$1, c5935q, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), new StartedWhileSubscribed$command$2(null));
        return c5941l instanceof InterfaceC5944m0 ? c5941l : new C5908e(c5941l, AbstractC5914h.f9374a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5942l0)) {
            return false;
        }
        ((C5942l0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        List listBuild = new ListBuilder(2).build();
        return AbstractC0584a.m911l(')', AbstractC5805t.m5234n0(listBuild, null, null, null, null, 63), new StringBuilder("SharingStarted.WhileSubscribed("));
    }
}
