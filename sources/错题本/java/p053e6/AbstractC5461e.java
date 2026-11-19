package p053e6;

import java.util.ConcurrentModificationException;
import kotlin.collections.builders.MapBuilder;

/* renamed from: e6.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5461e {

    /* renamed from: a */
    public final MapBuilder f8431a;

    /* renamed from: b */
    public int f8432b;

    /* renamed from: c */
    public int f8433c = -1;

    /* renamed from: d */
    public int f8434d;

    public AbstractC5461e(MapBuilder mapBuilder) {
        this.f8431a = mapBuilder;
        this.f8434d = mapBuilder.modCount;
        m4824b();
    }

    /* renamed from: a */
    public final void m4823a() {
        if (this.f8431a.modCount != this.f8434d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final void m4824b() {
        while (true) {
            int i = this.f8432b;
            MapBuilder mapBuilder = this.f8431a;
            if (i >= mapBuilder.length) {
                return;
            }
            int[] iArr = mapBuilder.presenceArray;
            int i8 = this.f8432b;
            if (iArr[i8] >= 0) {
                return;
            } else {
                this.f8432b = i8 + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f8432b < this.f8431a.length;
    }

    public final void remove() {
        m4823a();
        if (this.f8433c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        MapBuilder mapBuilder = this.f8431a;
        mapBuilder.checkIsMutable$kotlin_stdlib();
        mapBuilder.m5140g(this.f8433c);
        this.f8433c = -1;
        this.f8434d = mapBuilder.modCount;
    }
}
