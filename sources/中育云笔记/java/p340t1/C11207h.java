package p340t1;

import java.io.File;

/* renamed from: t1.h */
/* loaded from: classes3.dex */
public class C11207h extends AbstractC11204e {

    /* renamed from: b */
    public final long f26895b;

    public C11207h(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Max size must be positive number!");
        }
        this.f26895b = j10;
    }

    @Override // p340t1.AbstractC11204e
    /* renamed from: b */
    public boolean mo24921b(File file, long j10, int i10) {
        return j10 <= this.f26895b;
    }
}
