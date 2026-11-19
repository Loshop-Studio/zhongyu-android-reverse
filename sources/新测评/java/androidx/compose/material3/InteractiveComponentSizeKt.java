package androidx.compose.material3;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function0;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u000bH\u0007\"\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006¨\u0006\f"}, m13558d2 = {"LocalMinimumInteractiveComponentEnforcement", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalMinimumInteractiveComponentEnforcement$annotations", "()V", "getLocalMinimumInteractiveComponentEnforcement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalMinimumInteractiveComponentSize", "Landroidx/compose/ui/unit/Dp;", "getLocalMinimumInteractiveComponentSize", "minimumInteractiveComponentSize", "Landroidx/compose/ui/Modifier;", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class InteractiveComponentSizeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement = CompositionLocalKt.staticCompositionLocalOf(new Function0<Boolean>() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });
    private static final ProvidableCompositionLocal<C3127Dp> LocalMinimumInteractiveComponentSize = CompositionLocalKt.staticCompositionLocalOf(new Function0<C3127Dp>() { // from class: androidx.compose.material3.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentSize$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C3127Dp invoke() {
            return C3127Dp.m23559boximpl(m18914invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m18914invokeD9Ej5fM() {
            return C3127Dp.m23561constructorimpl(48);
        }
    });

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentSize with Dp.Unspecified to turn off enforcement instead.", replaceWith = @ReplaceWith(expression = "LocalMinimumInteractiveComponentSize", imports = {}))
    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    public static final ProvidableCompositionLocal<C3127Dp> getLocalMinimumInteractiveComponentSize() {
        return LocalMinimumInteractiveComponentSize;
    }

    @Stable
    public static final Modifier minimumInteractiveComponentSize(Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }
}
