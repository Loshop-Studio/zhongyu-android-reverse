package p160d.p165g;

import java.util.NoSuchElementException;
import p160d.p161e.AbstractC1004j;

/* renamed from: d.g.b */
/* loaded from: classes.dex */
public final class C1016b extends AbstractC1004j {

    /* renamed from: b */
    public final int f5488b;

    /* renamed from: c */
    public boolean f5489c;

    /* renamed from: d */
    public int f5490d;

    /* renamed from: e */
    public final int f5491e;

    public C1016b(int i, int i2, int i3) {
        this.f5491e = i3;
        this.f5488b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f5489c = z;
        this.f5490d = z ? i : i2;
    }

    @Override // p160d.p161e.AbstractC1004j
    /* renamed from: a */
    public int mo2801a() {
        int i = this.f5490d;
        if (i != this.f5488b) {
            this.f5490d = this.f5491e + i;
        } else {
            if (!this.f5489c) {
                throw new NoSuchElementException();
            }
            this.f5489c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5489c;
    }
}
