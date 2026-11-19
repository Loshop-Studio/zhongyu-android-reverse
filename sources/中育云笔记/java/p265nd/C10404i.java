package p265nd;

import java.util.NoSuchElementException;
import p325rc.AbstractC10961n0;

/* renamed from: nd.i */
/* loaded from: classes6.dex */
public final class C10404i extends AbstractC10961n0 {

    /* renamed from: c */
    public final int f24756c;

    /* renamed from: d */
    public final int f24757d;

    /* renamed from: e */
    public boolean f24758e;

    /* renamed from: f */
    public int f24759f;

    public C10404i(int i10, int i11, int i12) {
        this.f24756c = i12;
        this.f24757d = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f24758e = z10;
        this.f24759f = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24758e;
    }

    @Override // p325rc.AbstractC10961n0
    public int nextInt() {
        int i10 = this.f24759f;
        if (i10 != this.f24757d) {
            this.f24759f = this.f24756c + i10;
            return i10;
        }
        if (!this.f24758e) {
            throw new NoSuchElementException();
        }
        this.f24758e = false;
        return i10;
    }
}
