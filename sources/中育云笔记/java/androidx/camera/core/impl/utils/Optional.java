package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    @NonNull
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    @NonNull
    public static <T> Optional<T> fromNullable(@Nullable T t10) {
        return t10 == null ? absent() : new Present(t10);
    }

    @NonNull
    /* renamed from: of */
    public static <T> Optional<T> m664of(@NonNull T t10) {
        return new Present(Preconditions.checkNotNull(t10));
    }

    public abstract boolean equals(@Nullable Object obj);

    @NonNull
    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    @NonNull
    /* renamed from: or */
    public abstract Optional<T> mo661or(@NonNull Optional<? extends T> optional);

    @NonNull
    /* renamed from: or */
    public abstract T mo662or(@NonNull Supplier<? extends T> supplier);

    @NonNull
    /* renamed from: or */
    public abstract T mo663or(@NonNull T t10);

    @Nullable
    public abstract T orNull();

    @NonNull
    public abstract String toString();
}
