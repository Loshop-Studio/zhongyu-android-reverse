package p340t1;

import java.io.File;

/* renamed from: t1.g */
/* loaded from: classes3.dex */
public class C11206g extends AbstractC11204e {

    /* renamed from: b */
    public final int f26894b;

    public C11206g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f26894b = i10;
    }

    @Override // p340t1.AbstractC11204e
    /* renamed from: b */
    public boolean mo24921b(File file, long j10, int i10) {
        return i10 <= this.f26894b;
    }
}
