package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, m13558d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,220:1\n110#2:221\n110#2:222\n110#2:223\n110#2:224\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n52#1:221\n80#1:222\n106#1:223\n128#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    public static final Modifier windowInsetsBottomHeight(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function2<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsEndWidth(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2
            @Override // kotlin.jvm.functions.Function3
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsStartWidth(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<WindowInsets, LayoutDirection, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2
            @Override // kotlin.jvm.functions.Function3
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsTopHeight(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function2<WindowInsets, Density, Integer>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }
}
