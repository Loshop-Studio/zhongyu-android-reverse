package androidx.compose.p013ui.graphics.vector;

/* loaded from: classes2.dex */
public interface VectorConfig {

    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig vectorConfig, VectorProperty<T> vectorProperty, T t10) {
            return (T) VectorConfig.super.getOrDefault(vectorProperty, t10);
        }
    }

    default <T> T getOrDefault(VectorProperty<T> vectorProperty, T t10) {
        return t10;
    }
}
