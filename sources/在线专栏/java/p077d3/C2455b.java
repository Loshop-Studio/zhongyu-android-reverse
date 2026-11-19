package p077d3;

import java.util.Iterator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p175y2.InterfaceC3498a;

/* renamed from: d3.b */
/* loaded from: classes.dex */
public final class C2455b<T> implements InterfaceC2457d<T>, InterfaceC2456c<T> {

    /* renamed from: a */
    @NotNull
    private final InterfaceC2457d<T> f10033a;

    /* renamed from: b */
    private final int f10034b;

    /* renamed from: d3.b$a */
    public static final class a implements Iterator<T>, InterfaceC3498a {

        /* renamed from: a */
        @NotNull
        private final Iterator<T> f10035a;

        /* renamed from: b */
        private int f10036b;

        /* renamed from: c */
        final /* synthetic */ C2455b<T> f10037c;

        a(C2455b<T> c2455b) {
            this.f10037c = c2455b;
            this.f10035a = ((C2455b) c2455b).f10033a.iterator();
            this.f10036b = ((C2455b) c2455b).f10034b;
        }

        /* renamed from: a */
        private final void m8203a() {
            while (this.f10036b > 0 && this.f10035a.hasNext()) {
                this.f10035a.next();
                this.f10036b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m8203a();
            return this.f10035a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            m8203a();
            return this.f10035a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2455b(@NotNull InterfaceC2457d<? extends T> sequence, int i4) {
        C2769l.m9241e(sequence, "sequence");
        this.f10033a = sequence;
        this.f10034b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // p077d3.InterfaceC2456c
    @NotNull
    /* renamed from: a */
    public InterfaceC2457d<T> mo8202a(int i4) {
        int i5 = this.f10034b + i4;
        return i5 < 0 ? new C2455b(this, i4) : new C2455b(this.f10033a, i5);
    }

    @Override // p077d3.InterfaceC2457d
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }
}
