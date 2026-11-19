package androidx.compose.p011ui.text.platform;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import org.jetbrains.annotations.NotNull;
import p054e7.AbstractC5479k;
import p068g7.C5609e;

@Metadata(m5109d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"Lkotlinx/coroutines/r;", "FontCacheManagementDispatcher", "Lkotlinx/coroutines/r;", "getFontCacheManagementDispatcher", "()Lkotlinx/coroutines/r;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class DispatcherKt {

    @NotNull
    private static final AbstractC5995r FontCacheManagementDispatcher;

    static {
        C5609e c5609e = AbstractC5896f0.f9343a;
        FontCacheManagementDispatcher = AbstractC5479k.f8471a;
    }

    @NotNull
    public static final AbstractC5995r getFontCacheManagementDispatcher() {
        return FontCacheManagementDispatcher;
    }
}
