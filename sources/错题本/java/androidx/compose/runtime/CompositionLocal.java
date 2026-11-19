package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Stable
@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0017¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/runtime/CompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lr6/a;)V", "Landroidx/compose/runtime/ProvidedValue;", "value", "Landroidx/compose/runtime/ValueHolder;", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "defaultValueHolder", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/ValueHolder;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "()V", "current", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;

    @NotNull
    private final ValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(InterfaceC6469a interfaceC6469a, AbstractC5824e abstractC5824e) {
        this(interfaceC6469a);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    @Composable
    @ReadOnlyComposable
    @JvmName(name = "getCurrent")
    public final T getCurrent(@Nullable Composer composer, int i) {
        return (T) composer.consume(this);
    }

    @NotNull
    public ValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @NotNull
    public abstract ValueHolder<T> updatedStateOf$runtime_release(@NotNull ProvidedValue<T> value, @Nullable ValueHolder<T> previous);

    private CompositionLocal(InterfaceC6469a interfaceC6469a) {
        this.defaultValueHolder = new LazyValueHolder(interfaceC6469a);
    }
}
