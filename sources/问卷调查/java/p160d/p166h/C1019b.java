package p160d.p166h;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: d.h.b */
/* loaded from: classes.dex */
public final class C1019b<T> implements Iterable<T> {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1018a f5494b;

    public C1019b(InterfaceC1018a interfaceC1018a) {
        this.f5494b = interfaceC1018a;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f5494b.iterator();
    }
}
