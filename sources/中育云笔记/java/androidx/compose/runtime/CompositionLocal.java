package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

@Stable
/* loaded from: classes2.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;
    private final ValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a);
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

    private CompositionLocal(InterfaceC9529a interfaceC9529a) {
        this.defaultValueHolder = new LazyValueHolder(interfaceC9529a);
    }
}
