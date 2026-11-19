package p004a3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p179z2.AbstractC3513a;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public final class C0012a extends AbstractC3513a {
    @Override // p179z2.AbstractC3513a
    @NotNull
    /* renamed from: c */
    public Random mo62c() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C2769l.m9240d(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
