package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: kotlin.collections.e */
/* loaded from: classes2.dex */
public final class C5784e extends AbstractC5786f implements RandomAccess {

    /* renamed from: a */
    public final AbstractC5786f f9178a;

    /* renamed from: b */
    public final int f9179b;

    /* renamed from: c */
    public final int f9180c;

    public C5784e(AbstractC5786f abstractC5786f, int i, int i8) {
        this.f9178a = abstractC5786f;
        this.f9179b = i;
        C5780c c5780c = AbstractC5786f.Companion;
        int size = abstractC5786f.size();
        c5780c.getClass();
        C5780c.m5145d(i, i8, size);
        this.f9180c = i8 - i;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List
    public final Object get(int i) {
        AbstractC5786f.Companion.getClass();
        C5780c.m5143b(i, this.f9180c);
        return this.f9178a.get(this.f9179b + i);
    }

    @Override // kotlin.collections.AbstractC5786f, kotlin.collections.AbstractC5775a
    public final int getSize() {
        return this.f9180c;
    }

    @Override // kotlin.collections.AbstractC5786f, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public final List subList(int i, int i8) {
        AbstractC5786f.Companion.getClass();
        C5780c.m5145d(i, i8, this.f9180c);
        int i9 = this.f9179b;
        return new C5784e(this.f9178a, i + i9, i9 + i8);
    }
}
