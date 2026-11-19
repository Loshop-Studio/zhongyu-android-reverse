package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.serialization.SavedStateConfiguration;
import androidx.savedstate.serialization.serializers.SavedStateSerializer;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.serialization.modules.AbstractC9226d;
import kotlinx.serialization.modules.C9225c;
import p300x7.InterfaceC10570l;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateConfigurationKt {
    private static final AbstractC10583a DEFAULT_SERIALIZERS_MODULE;

    static {
        C9225c c9225c = new C9225c();
        c9225c.mo16917a(AbstractC9137y.m16154b(Bundle.class), SavedStateSerializer.INSTANCE);
        DEFAULT_SERIALIZERS_MODULE = AbstractC9226d.m16930c(c9225c.m16922f(), SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    public static final SavedStateConfiguration SavedStateConfiguration(InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(builderAction, "builderAction");
        return SavedStateConfiguration$default(null, builderAction, 1, null);
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, interfaceC10570l);
    }

    public static final SavedStateConfiguration SavedStateConfiguration(SavedStateConfiguration from, InterfaceC10570l builderAction) {
        AbstractC9133u.m16133g(from, "from");
        AbstractC9133u.m16133g(builderAction, "builderAction");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(from);
        builderAction.invoke(builder);
        return builder.build$savedstate_release();
    }
}
