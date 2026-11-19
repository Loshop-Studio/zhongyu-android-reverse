package p214z6;

import androidx.collection.AbstractC0584a;
import java.util.Iterator;
import kotlin.collections.C5778b0;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: z6.b */
/* loaded from: classes2.dex */
public final class C6824b implements InterfaceC6830h, InterfaceC6825c {

    /* renamed from: a */
    public final /* synthetic */ int f11562a;

    /* renamed from: b */
    public final InterfaceC6830h f11563b;

    /* renamed from: c */
    public final int f11564c;

    public C6824b(InterfaceC6830h sequence, int i, int i8) {
        this.f11562a = i8;
        switch (i8) {
            case 1:
                this.f11563b = sequence;
                this.f11564c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(AbstractC0584a.m914o("count must be non-negative, but was ", i, '.').toString());
                }
                return;
            default:
                AbstractC5830k.m5330g(sequence, "sequence");
                this.f11563b = sequence;
                this.f11564c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(AbstractC0584a.m914o("count must be non-negative, but was ", i, '.').toString());
                }
                return;
        }
    }

    @Override // p214z6.InterfaceC6825c
    /* renamed from: a */
    public final InterfaceC6830h mo6486a(int i) {
        switch (this.f11562a) {
            case 0:
                int i8 = this.f11564c + i;
                return i8 < 0 ? new C6824b(this, i, 0) : new C6824b(this.f11563b, i8, 0);
            default:
                int i9 = this.f11564c;
                return i >= i9 ? C6826d.f11565a : new C6836n(this.f11563b, i, i9);
        }
    }

    @Override // p214z6.InterfaceC6825c
    /* renamed from: b */
    public final InterfaceC6830h mo6487b(int i) {
        switch (this.f11562a) {
            case 0:
                int i8 = this.f11564c;
                int i9 = i8 + i;
                return i9 < 0 ? new C6824b(this, i, 1) : new C6836n(this.f11563b, i8, i9);
            default:
                return i >= this.f11564c ? this : new C6824b(this.f11563b, i, 1);
        }
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        switch (this.f11562a) {
            case 0:
                return new C5778b0(this);
            default:
                return new C5778b0(this, (byte) 0);
        }
    }
}
