package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

@Stable
/* loaded from: classes2.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final ValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(InterfaceC10559a interfaceC10559a, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    public final T getCurrent(Composer composer, int i10) {
        return (T) composer.consume(this);
    }

    public ValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    public abstract ValueHolder<T> updatedStateOf$runtime_release(ProvidedValue<T> providedValue, ValueHolder<T> valueHolder);

    private CompositionLocal(InterfaceC10559a interfaceC10559a) {
        this.defaultValueHolder = new LazyValueHolder(interfaceC10559a);
    }
}
