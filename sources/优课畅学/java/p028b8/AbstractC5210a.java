package p028b8;

import kotlin.random.Random;

/* renamed from: b8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5210a extends Random {
    @Override // kotlin.random.Random
    /* renamed from: b */
    public float mo2104b() {
        return mo2106d().nextFloat();
    }

    @Override // kotlin.random.Random
    /* renamed from: c */
    public int mo2105c(int i10) {
        return mo2106d().nextInt(i10);
    }

    /* renamed from: d */
    public abstract java.util.Random mo2106d();
}
