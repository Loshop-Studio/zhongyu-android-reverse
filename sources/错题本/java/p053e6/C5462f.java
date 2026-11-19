package p053e6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.builders.MapBuilder;
import p160s6.InterfaceC6560a;

/* renamed from: e6.f */
/* loaded from: classes2.dex */
public final class C5462f extends AbstractC5461e implements Iterator, InterfaceC6560a {
    @Override // java.util.Iterator
    public final Object next() {
        m4823a();
        int i = this.f8432b;
        MapBuilder mapBuilder = this.f8431a;
        if (i >= mapBuilder.length) {
            throw new NoSuchElementException();
        }
        int i8 = this.f8432b;
        this.f8432b = i8 + 1;
        this.f8433c = i8;
        Object obj = mapBuilder.keysArray[this.f8433c];
        m4824b();
        return obj;
    }
}
