package kotlinx.coroutines.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2612x1;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    @NotNull
    AbstractC2612x1 createDispatcher(@NotNull List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}
