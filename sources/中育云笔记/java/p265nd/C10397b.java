package p265nd;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10974u;

/* renamed from: nd.b */
/* loaded from: classes6.dex */
public final class C10397b extends AbstractC10974u {

    /* renamed from: c */
    public final int f24744c;

    /* renamed from: d */
    public final int f24745d;

    /* renamed from: e */
    public boolean f24746e;

    /* renamed from: f */
    public int f24747f;

    public C10397b(char c10, char c11, int i10) {
        this.f24744c = i10;
        this.f24745d = c11;
        boolean z10 = false;
        if (i10 <= 0 ? AbstractC9979u.m20296i(c10, c11) >= 0 : AbstractC9979u.m20296i(c10, c11) <= 0) {
            z10 = true;
        }
        this.f24746e = z10;
        this.f24747f = z10 ? c10 : c11;
    }

    @Override // p325rc.AbstractC10974u
    /* renamed from: a */
    public char mo21723a() {
        int i10 = this.f24747f;
        if (i10 != this.f24745d) {
            this.f24747f = this.f24744c + i10;
        } else {
            if (!this.f24746e) {
                throw new NoSuchElementException();
            }
            this.f24746e = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24746e;
    }
}
