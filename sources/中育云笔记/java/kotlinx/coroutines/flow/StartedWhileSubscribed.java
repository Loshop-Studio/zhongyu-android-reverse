package kotlinx.coroutines.flow;

import java.util.List;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11612u;

/* loaded from: classes6.dex */
public final class StartedWhileSubscribed implements InterfaceC10040a {

    /* renamed from: b */
    public final long f23866b;

    /* renamed from: c */
    public final long f23867c;

    public StartedWhileSubscribed(long j10, long j11) {
        this.f23866b = j10;
        this.f23867c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.InterfaceC10040a
    /* renamed from: a */
    public InterfaceC11594c mo20863a(InterfaceC11612u interfaceC11612u) {
        return AbstractC11596e.m25564n(AbstractC11596e.m25568r(AbstractC11596e.m25549T(interfaceC11612u, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.f23866b == startedWhileSubscribed.f23866b && this.f23867c == startedWhileSubscribed.f23867c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f23866b) * 31) + Long.hashCode(this.f23867c);
    }

    public String toString() {
        List listM24125d = AbstractC10976v.m24125d(2);
        if (this.f23866b > 0) {
            listM24125d.add("stopTimeout=" + this.f23866b + "ms");
        }
        if (this.f23867c < Long.MAX_VALUE) {
            listM24125d.add("replayExpiration=" + this.f23867c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC10947g0.m23954w0(AbstractC10976v.m24122a(listM24125d), null, null, null, 0, null, null, 63, null) + ')';
    }
}
