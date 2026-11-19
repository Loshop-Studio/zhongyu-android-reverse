package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.serialization.modules.AbstractC10057d;
import kotlinx.serialization.modules.C10056c;
import p181hd.InterfaceC9540l;
import p182he.AbstractC9553a;

/* loaded from: classes3.dex */
public final class SavedStateConfigurationKt {
    private static final AbstractC9553a DEFAULT_SERIALIZERS_MODULE;

    static {
        C10056c c10056c = new C10056c();
        c10056c.mo18786d(AbstractC9983y.m20315b(Bundle.class), SavedStateSerializer.INSTANCE);
        DEFAULT_SERIALIZERS_MODULE = AbstractC10057d.m21053c(c10056c.m21045f(), SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    public static final SavedStateConfiguration SavedStateConfiguration(InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(builderAction, "builderAction");
        return SavedStateConfiguration$default(null, builderAction, 1, null);
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, interfaceC9540l);
    }

    public static final SavedStateConfiguration SavedStateConfiguration(SavedStateConfiguration from, InterfaceC9540l builderAction) {
        AbstractC9979u.m20294g(from, "from");
        AbstractC9979u.m20294g(builderAction, "builderAction");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(from);
        builderAction.invoke(builder);
        return builder.build$savedstate_release();
    }
}
