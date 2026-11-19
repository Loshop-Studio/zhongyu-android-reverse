package p014b3;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC2743y;

/* renamed from: b3.b */
/* loaded from: classes.dex */
public final class C1033b extends AbstractC2743y {

    /* renamed from: a */
    private final int f5716a;

    /* renamed from: b */
    private final int f5717b;

    /* renamed from: c */
    private boolean f5718c;

    /* renamed from: d */
    private int f5719d;

    public C1033b(int i4, int i5, int i6) {
        this.f5716a = i6;
        this.f5717b = i5;
        boolean z3 = true;
        if (i6 <= 0 ? i4 < i5 : i4 > i5) {
            z3 = false;
        }
        this.f5718c = z3;
        this.f5719d = z3 ? i4 : i5;
    }

    @Override // kotlin.collections.AbstractC2743y
    /* renamed from: a */
    public int mo4807a() {
        int i4 = this.f5719d;
        if (i4 != this.f5717b) {
            this.f5719d = this.f5716a + i4;
        } else {
            if (!this.f5718c) {
                throw new NoSuchElementException();
            }
            this.f5718c = false;
        }
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5718c;
    }
}
