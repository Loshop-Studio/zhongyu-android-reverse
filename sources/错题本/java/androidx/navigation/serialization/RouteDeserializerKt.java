package androidx.navigation.serialization;

import android.os.Bundle;
import android.view.SavedStateHandle;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p084i7.InterfaceC5686b;

@Metadata(m5109d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "", "Landroidx/navigation/NavType;", "typeMap", "decodeArguments", "(Li7/b;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Li7/b;Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class RouteDeserializerKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(@NotNull InterfaceC5686b interfaceC5686b, @NotNull Bundle bundle, @NotNull Map<String, ? extends NavType<?>> typeMap) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        return (T) new RouteDecoder(bundle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC5686b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> T decodeArguments(@NotNull InterfaceC5686b interfaceC5686b, @NotNull SavedStateHandle handle, @NotNull Map<String, ? extends NavType<?>> typeMap) {
        AbstractC5830k.m5330g(interfaceC5686b, "<this>");
        AbstractC5830k.m5330g(handle, "handle");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        return (T) new RouteDecoder(handle, typeMap).decodeRouteWithArgs$navigation_common_release(interfaceC5686b);
    }
}
