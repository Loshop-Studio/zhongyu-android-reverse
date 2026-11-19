package p265nd;

import java.util.NoSuchElementException;
import p325rc.AbstractC10963o0;

/* renamed from: nd.l */
/* loaded from: classes6.dex */
public final class C10407l extends AbstractC10963o0 {

    /* renamed from: c */
    public final long f24766c;

    /* renamed from: d */
    public final long f24767d;

    /* renamed from: e */
    public boolean f24768e;

    /* renamed from: f */
    public long f24769f;

    public C10407l(long j10, long j11, long j12) {
        this.f24766c = j12;
        this.f24767d = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f24768e = z10;
        this.f24769f = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24768e;
    }

    @Override // p325rc.AbstractC10963o0
    public long nextLong() {
        long j10 = this.f24769f;
        if (j10 != this.f24767d) {
            this.f24769f = this.f24766c + j10;
            return j10;
        }
        if (!this.f24768e) {
            throw new NoSuchElementException();
        }
        this.f24768e = false;
        return j10;
    }
}
