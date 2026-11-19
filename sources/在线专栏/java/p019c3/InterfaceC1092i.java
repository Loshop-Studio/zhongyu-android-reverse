package p019c3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019c3.InterfaceC1091h;
import p171x2.InterfaceC3459a;

/* renamed from: c3.i */
/* loaded from: classes.dex */
public interface InterfaceC1092i<V> extends InterfaceC1091h<V>, InterfaceC3459a<V> {

    /* renamed from: c3.i$a */
    public interface a<V> extends InterfaceC1091h.a<V>, InterfaceC3459a<V> {
    }

    V get();

    @Nullable
    Object getDelegate();

    @NotNull
    /* renamed from: getGetter */
    a<V> mo10737getGetter();
}
