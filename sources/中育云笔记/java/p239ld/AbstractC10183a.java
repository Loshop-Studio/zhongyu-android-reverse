package p239ld;

import kotlin.random.Random;

/* renamed from: ld.a */
/* loaded from: classes6.dex */
public abstract class AbstractC10183a extends Random {
    @Override // kotlin.random.Random
    /* renamed from: c */
    public float mo20333c() {
        return mo21258e().nextFloat();
    }

    @Override // kotlin.random.Random
    /* renamed from: d */
    public int mo20334d(int i10) {
        return mo21258e().nextInt(i10);
    }

    /* renamed from: e */
    public abstract java.util.Random mo21258e();
}
