package p214z6;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: z6.n */
/* loaded from: classes2.dex */
public final class C6836n implements InterfaceC6830h, InterfaceC6825c {

    /* renamed from: a */
    public final InterfaceC6830h f11584a;

    /* renamed from: b */
    public final int f11585b;

    /* renamed from: c */
    public final int f11586c;

    public C6836n(InterfaceC6830h sequence, int i, int i8) {
        AbstractC5830k.m5330g(sequence, "sequence");
        this.f11584a = sequence;
        this.f11585b = i;
        this.f11586c = i8;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m81f(i8, "endIndex should be non-negative, but is ").toString());
        }
        if (i8 < i) {
            throw new IllegalArgumentException(AbstractC0584a.m912m(i8, i, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // p214z6.InterfaceC6825c
    /* renamed from: a */
    public final InterfaceC6830h mo6486a(int i) {
        int i8 = this.f11586c;
        int i9 = this.f11585b;
        return i >= i8 - i9 ? C6826d.f11565a : new C6836n(this.f11584a, i9 + i, i8);
    }

    @Override // p214z6.InterfaceC6825c
    /* renamed from: b */
    public final InterfaceC6830h mo6487b(int i) {
        int i8 = this.f11586c;
        int i9 = this.f11585b;
        return i >= i8 - i9 ? this : new C6836n(this.f11584a, i9, i + i9);
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        return new C6829g(this);
    }
}
