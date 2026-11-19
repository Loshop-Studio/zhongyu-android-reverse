package kotlinx.coroutines.flow;

import java.util.List;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;

/* loaded from: classes5.dex */
public final class StartedWhileSubscribed implements InterfaceC9198a {

    /* renamed from: b */
    public final long f17954b;

    /* renamed from: c */
    public final long f17955c;

    public StartedWhileSubscribed(long j10, long j11) {
        this.f17954b = j10;
        this.f17955c = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.InterfaceC9198a
    /* renamed from: a */
    public InterfaceC9266c mo16679a(InterfaceC9280q interfaceC9280q) {
        return AbstractC9268e.m17025o(AbstractC9268e.m17029s(AbstractC9268e.m17009U(interfaceC9280q, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.f17954b == startedWhileSubscribed.f17954b && this.f17955c == startedWhileSubscribed.f17955c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f17954b) * 31) + Long.hashCode(this.f17955c);
    }

    public String toString() {
        List listM14754d = AbstractC8807u.m14754d(2);
        if (this.f17954b > 0) {
            listM14754d.add("stopTimeout=" + this.f17954b + "ms");
        }
        if (this.f17955c < Long.MAX_VALUE) {
            listM14754d.add("replayExpiration=" + this.f17955c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC8778f0.m14576v0(AbstractC8807u.m14751a(listM14754d), null, null, null, 0, null, null, 63, null) + ')';
    }
}
