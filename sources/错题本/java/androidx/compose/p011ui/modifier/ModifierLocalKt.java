package androidx.compose.p011ui.modifier;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "modifierLocalOf", "(Lr6/a;)Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ModifierLocalKt {
    @NotNull
    public static final <T> ProvidableModifierLocal<T> modifierLocalOf(@NotNull InterfaceC6469a interfaceC6469a) {
        return new ProvidableModifierLocal<>(interfaceC6469a);
    }
}
