package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    public static final Modifier windowInsetsBottomHeight(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsBottomHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsBottomHeight.2
            @Override // p181hd.InterfaceC9544p
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getBottom(density));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsEndWidth(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsEndWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsEndWidth.2
            @Override // p181hd.InterfaceC9545q
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Rtl ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsStartWidth(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedWidthModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsStartWidth");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsStartWidth.2
            @Override // p181hd.InterfaceC9545q
            public final Integer invoke(WindowInsets windowInsets2, LayoutDirection layoutDirection, Density density) {
                return Integer.valueOf(layoutDirection == LayoutDirection.Ltr ? windowInsets2.getLeft(density, layoutDirection) : windowInsets2.getRight(density, layoutDirection));
            }
        }));
    }

    @Stable
    public static final Modifier windowInsetsTopHeight(Modifier modifier, final WindowInsets windowInsets) {
        return modifier.then(new DerivedHeightModifier(windowInsets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("insetsTopHeight");
                inspectorInfo.getProperties().set("insets", windowInsets);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9544p() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt.windowInsetsTopHeight.2
            @Override // p181hd.InterfaceC9544p
            public final Integer invoke(WindowInsets windowInsets2, Density density) {
                return Integer.valueOf(windowInsets2.getTop(density));
            }
        }));
    }
}
