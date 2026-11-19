package p077d8;

import java.util.NoSuchElementException;
import p134i7.AbstractC8792m0;

/* renamed from: d8.e */
/* loaded from: classes5.dex */
public final class C8320e extends AbstractC8792m0 {

    /* renamed from: a */
    public final int f15780a;

    /* renamed from: b */
    public final int f15781b;

    /* renamed from: c */
    public boolean f15782c;

    /* renamed from: d */
    public int f15783d;

    public C8320e(int i10, int i11, int i12) {
        this.f15780a = i12;
        this.f15781b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f15782c = z10;
        this.f15783d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15782c;
    }

    @Override // p134i7.AbstractC8792m0
    public int nextInt() {
        int i10 = this.f15783d;
        if (i10 != this.f15781b) {
            this.f15783d = this.f15780a + i10;
            return i10;
        }
        if (!this.f15782c) {
            throw new NoSuchElementException();
        }
        this.f15782c = false;
        return i10;
    }
}
