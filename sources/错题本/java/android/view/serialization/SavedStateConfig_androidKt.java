package android.view.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.serialization.serializers.SizeFSerializer;
import android.view.serialization.serializers.SizeSerializer;
import android.view.serialization.serializers.SparseArraySerializer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2826a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.modules.C6045a;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5686b;
import p133o7.AbstractC6281e;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lo7/e;", "getDefaultSerializersModuleOnPlatform", "()Lo7/e;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSavedStateConfig.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,2:34\n243#2:36\n243#2:37\n33#2:38\n*S KotlinDebug\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n*L\n26#1:34,2\n27#1:36\n28#1:37\n26#1:38\n*E\n"})
/* loaded from: classes2.dex */
public final class SavedStateConfig_androidKt {
    @NotNull
    public static final AbstractC6281e getDefaultSerializersModuleOnPlatform() {
        C6045a c6045a = new C6045a();
        c6045a.mo5735n(AbstractC5832m.m5340a(Size.class), SizeSerializer.INSTANCE);
        c6045a.mo5735n(AbstractC5832m.m5340a(SizeF.class), SizeFSerializer.INSTANCE);
        c6045a.mo2045q(AbstractC5832m.m5340a(SparseArray.class), new C2826a(24));
        return c6045a.m5730a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5686b getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        AbstractC5830k.m5330g(argSerializers, "argSerializers");
        return new SparseArraySerializer((InterfaceC5686b) AbstractC5805t.m5228h0(argSerializers));
    }
}
