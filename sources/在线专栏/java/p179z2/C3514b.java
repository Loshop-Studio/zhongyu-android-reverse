package p179z2;

import java.util.Random;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: z2.b */
/* loaded from: classes.dex */
public final class C3514b extends AbstractC3513a {

    /* renamed from: c */
    @NotNull
    private final a f12367c = new a();

    /* renamed from: z2.b$a */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p179z2.AbstractC3513a
    @NotNull
    /* renamed from: c */
    public Random mo62c() {
        Random random = this.f12367c.get();
        C2769l.m9240d(random, "implStorage.get()");
        return random;
    }
}
