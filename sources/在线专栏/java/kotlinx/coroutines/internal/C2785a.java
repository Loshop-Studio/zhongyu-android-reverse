package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.collections.C2723g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: classes.dex */
public class C2785a<T> {

    /* renamed from: a */
    @NotNull
    private Object[] f10742a = new Object[16];

    /* renamed from: b */
    private int f10743b;

    /* renamed from: c */
    private int f10744c;

    /* renamed from: b */
    private final void m9271b() {
        Object[] objArr = this.f10742a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        C2723g.m9084f(objArr, objArr2, 0, this.f10743b, 0, 10, null);
        Object[] objArr3 = this.f10742a;
        int length2 = objArr3.length;
        int i4 = this.f10743b;
        C2723g.m9084f(objArr3, objArr2, length2 - i4, 0, i4, 4, null);
        this.f10742a = objArr2;
        this.f10743b = 0;
        this.f10744c = length;
    }

    /* renamed from: a */
    public final void m9272a(@NotNull T t3) {
        Object[] objArr = this.f10742a;
        int i4 = this.f10744c;
        objArr[i4] = t3;
        int length = (objArr.length - 1) & (i4 + 1);
        this.f10744c = length;
        if (length == this.f10743b) {
            m9271b();
        }
    }

    /* renamed from: c */
    public final boolean m9273c() {
        return this.f10743b == this.f10744c;
    }

    @Nullable
    /* renamed from: d */
    public final T m9274d() {
        int i4 = this.f10743b;
        if (i4 == this.f10744c) {
            return null;
        }
        Object[] objArr = this.f10742a;
        T t3 = (T) objArr[i4];
        objArr[i4] = null;
        this.f10743b = (i4 + 1) & (objArr.length - 1);
        Objects.requireNonNull(t3, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t3;
    }
}
