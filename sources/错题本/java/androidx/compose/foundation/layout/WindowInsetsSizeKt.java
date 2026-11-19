package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, m5110d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,220:1\n110#2:221\n110#2:222\n110#2:223\n110#2:224\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n52#1:221\n80#1:222\n106#1:223\n128#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    @NotNull
    public static final Modifier windowInsetsBottomHeight(@NotNull Modifier modifier, @NotNull final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2
            @Override // p152r6.InterfaceC6473e
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsEndWidth(@NotNull Modifier modifier, @NotNull final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6474f() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2
            @Override // p152r6.InterfaceC6474f
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsStartWidth(@NotNull Modifier modifier, @NotNull final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6474f() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2
            @Override // p152r6.InterfaceC6474f
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsTopHeight(@NotNull Modifier modifier, @NotNull final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6473e() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2
            @Override // p152r6.InterfaceC6473e
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }
}
