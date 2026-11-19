package p019c3;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: c3.b */
/* loaded from: classes.dex */
public interface InterfaceC1085b<R> extends InterfaceC1084a {
    R call(@NotNull Object... objArr);

    R callBy(@NotNull Map<Object, ? extends Object> map);

    @NotNull
    List<Object> getParameters();

    @NotNull
    InterfaceC1094k getReturnType();

    @NotNull
    List<Object> getTypeParameters();

    @Nullable
    EnumC1095l getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
