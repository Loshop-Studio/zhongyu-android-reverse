package androidx.compose.p011ui.graphics.vector;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\u0016¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/VectorConfig;", "", "getOrDefault", ExifInterface.GPS_DIRECTION_TRUE, "property", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "defaultValue", "(Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface VectorConfig {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(@NotNull VectorConfig vectorConfig, @NotNull VectorProperty<T> vectorProperty, T t8) {
            return (T) VectorConfig.super.getOrDefault(vectorProperty, t8);
        }
    }

    default <T> T getOrDefault(@NotNull VectorProperty<T> property, T defaultValue) {
        return defaultValue;
    }
}
