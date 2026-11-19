package p200x6;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5781c0;

/* renamed from: x6.e */
/* loaded from: classes2.dex */
public final class C6755e extends AbstractC5781c0 {

    /* renamed from: a */
    public final int f11423a;

    /* renamed from: b */
    public final int f11424b;

    /* renamed from: c */
    public boolean f11425c;

    /* renamed from: d */
    public int f11426d;

    public C6755e(int i, int i8, int i9) {
        this.f11423a = i9;
        this.f11424b = i8;
        boolean z8 = false;
        if (i9 <= 0 ? i >= i8 : i <= i8) {
            z8 = true;
        }
        this.f11425c = z8;
        this.f11426d = z8 ? i : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11425c;
    }

    @Override // kotlin.collections.AbstractC5781c0
    public final int nextInt() {
        int i = this.f11426d;
        if (i != this.f11424b) {
            this.f11426d = this.f11423a + i;
            return i;
        }
        if (!this.f11425c) {
            throw new NoSuchElementException();
        }
        this.f11425c = false;
        return i;
    }
}
