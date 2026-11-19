package androidx.compose.runtime;

/* loaded from: classes2.dex */
public interface ValueHolder<T> {
    T readValue(PersistentCompositionLocalMap persistentCompositionLocalMap);

    ProvidedValue<T> toProvided(CompositionLocal<T> compositionLocal);
}
