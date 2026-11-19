package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/runtime/ProduceStateScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/v;", "Lkotlin/Function0;", "Ld6/s;", "onDispose", "", "awaitDispose", "(Lr6/a;Lh6/c;)Ljava/lang/Object;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, InterfaceC6009v {
    @Nullable
    Object awaitDispose(@NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC5631c<?> interfaceC5631c);

    @Override // kotlinx.coroutines.InterfaceC6009v
    @NotNull
    /* synthetic */ InterfaceC5636h getCoroutineContext();
}
