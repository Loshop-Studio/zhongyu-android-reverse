package android.view.serialization;

import android.os.Bundle;
import android.view.serialization.SavedStateConfiguration;
import android.view.serialization.serializers.SavedStateSerializer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.modules.C6045a;
import org.jetbrains.annotations.NotNull;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;
import p133o7.C6280d;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", TypedValues.TransitionType.S_FROM, "Lkotlin/Function1;", "Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "builderAction", "SavedStateConfiguration", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lr6/c;)Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lo7/e;", "DEFAULT_SERIALIZERS_MODULE", "Lo7/e;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,138:1\n31#2,2:139\n243#2:141\n33#2:142\n*S KotlinDebug\n*F\n+ 1 SavedStateConfiguration.kt\nandroidx/savedstate/serialization/SavedStateConfigurationKt\n*L\n137#1:139,2\n137#1:141\n137#1:142\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateConfigurationKt {

    @NotNull
    private static final AbstractC6281e DEFAULT_SERIALIZERS_MODULE;

    static {
        C6045a c6045a = new C6045a();
        c6045a.mo5735n(AbstractC5832m.m5340a(Bundle.class), SavedStateSerializer.INSTANCE);
        C6280d c6280dM5730a = c6045a.m5730a();
        AbstractC6281e other = SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform();
        C6280d c6280d = AbstractC6283g.f10039a;
        AbstractC5830k.m5330g(other, "other");
        C6045a c6045a2 = new C6045a();
        c6280dM5730a.mo5873a(c6045a2);
        other.mo5873a(c6045a2);
        DEFAULT_SERIALIZERS_MODULE = c6045a2.m5730a();
    }

    @JvmOverloads
    @NotNull
    public static final SavedStateConfiguration SavedStateConfiguration(@NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(builderAction, "builderAction");
        return SavedStateConfiguration$default(null, builderAction, 1, null);
    }

    public static /* synthetic */ SavedStateConfiguration SavedStateConfiguration$default(SavedStateConfiguration savedStateConfiguration, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            savedStateConfiguration = SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, interfaceC6471c);
    }

    @JvmOverloads
    @NotNull
    public static final SavedStateConfiguration SavedStateConfiguration(@NotNull SavedStateConfiguration from, @NotNull InterfaceC6471c builderAction) {
        AbstractC5830k.m5330g(from, "from");
        AbstractC5830k.m5330g(builderAction, "builderAction");
        SavedStateConfiguration.Builder builder = new SavedStateConfiguration.Builder(from);
        builderAction.invoke(builder);
        return builder.build$savedstate_release();
    }
}
