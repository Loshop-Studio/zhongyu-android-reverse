package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class IntrinsicKt {
    @Stable
    public static final Modifier height(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("height");
                inspectorInfo.getProperties().set("intrinsicSize", intrinsicSize);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    public static final Modifier requiredHeight(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicHeightElement(intrinsicSize, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.IntrinsicKt$requiredHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredHeight");
                inspectorInfo.getProperties().set("intrinsicSize", intrinsicSize);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    public static final Modifier requiredWidth(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("requiredWidth");
                inspectorInfo.getProperties().set("intrinsicSize", intrinsicSize);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Stable
    public static final Modifier width(Modifier modifier, final IntrinsicSize intrinsicSize) {
        return modifier.then(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("width");
                inspectorInfo.getProperties().set("intrinsicSize", intrinsicSize);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
