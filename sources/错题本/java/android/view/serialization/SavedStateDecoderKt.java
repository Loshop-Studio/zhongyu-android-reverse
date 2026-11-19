package android.view.serialization;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5685a;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, m5110d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "decodeFromSavedState", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "Li7/a;", "deserializer", "(Li7/a;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SavedStateDecoderKt {
    @JvmOverloads
    @NotNull
    public static final <T> T decodeFromSavedState(@NotNull InterfaceC5685a deserializer, @NotNull Bundle savedState) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        AbstractC5830k.m5330g(savedState, "savedState");
        return (T) decodeFromSavedState$default(deserializer, savedState, null, 4, null);
    }

    public static Object decodeFromSavedState$default(Bundle savedState, SavedStateConfiguration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = SavedStateConfiguration.DEFAULT;
        }
        AbstractC5830k.m5330g(savedState, "savedState");
        AbstractC5830k.m5330g(configuration, "configuration");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> T decodeFromSavedState(Bundle savedState, SavedStateConfiguration configuration) {
        AbstractC5830k.m5330g(savedState, "savedState");
        AbstractC5830k.m5330g(configuration, "configuration");
        configuration.getSerializersModule();
        AbstractC5830k.m5338o();
        throw null;
    }

    @JvmOverloads
    @NotNull
    public static final <T> T decodeFromSavedState(@NotNull InterfaceC5685a deserializer, @NotNull Bundle savedState, @NotNull SavedStateConfiguration configuration) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        AbstractC5830k.m5330g(savedState, "savedState");
        AbstractC5830k.m5330g(configuration, "configuration");
        return (T) new SavedStateDecoder(savedState, configuration).decodeSerializableValue(deserializer);
    }

    public static /* synthetic */ Object decodeFromSavedState$default(InterfaceC5685a interfaceC5685a, Bundle bundle, SavedStateConfiguration savedStateConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return decodeFromSavedState(interfaceC5685a, bundle, savedStateConfiguration);
    }
}
