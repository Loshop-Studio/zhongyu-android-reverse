package p077d3;

import java.util.Iterator;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p171x2.InterfaceC3470l;
import p175y2.InterfaceC3498a;

/* renamed from: d3.k */
/* loaded from: classes.dex */
public final class C2464k<T, R> implements InterfaceC2457d<R> {

    /* renamed from: a */
    @NotNull
    private final InterfaceC2457d<T> f10040a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3470l<T, R> f10041b;

    /* renamed from: d3.k$a */
    public static final class a implements Iterator<R>, InterfaceC3498a {

        /* renamed from: a */
        @NotNull
        private final Iterator<T> f10042a;

        /* renamed from: b */
        final /* synthetic */ C2464k<T, R> f10043b;

        a(C2464k<T, R> c2464k) {
            this.f10043b = c2464k;
            this.f10042a = ((C2464k) c2464k).f10040a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10042a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((C2464k) this.f10043b).f10041b.invoke(this.f10042a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2464k(@NotNull InterfaceC2457d<? extends T> sequence, @NotNull InterfaceC3470l<? super T, ? extends R> transformer) {
        C2769l.m9241e(sequence, "sequence");
        C2769l.m9241e(transformer, "transformer");
        this.f10040a = sequence;
        this.f10041b = transformer;
    }

    @Override // p077d3.InterfaceC2457d
    @NotNull
    public Iterator<R> iterator() {
        return new a(this);
    }
}
