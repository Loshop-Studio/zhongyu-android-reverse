package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class AspectRatioKt {
    @Stable
    public static final Modifier aspectRatio(Modifier modifier, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) final float f10, final boolean z10) {
        return modifier.then(new AspectRatioElement(f10, z10, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("aspectRatio");
                inspectorInfo.getProperties().set("ratio", Float.valueOf(f10));
                inspectorInfo.getProperties().set("matchHeightConstraintsFirst", Boolean.valueOf(z10));
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier aspectRatio$default(Modifier modifier, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return aspectRatio(modifier, f10, z10);
    }

    @Stable
    /* renamed from: isSatisfiedBy-NN6Ew-U, reason: not valid java name */
    public static final boolean m27356isSatisfiedByNN6EwU(long j10, int i10, int i11) {
        int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
        if (i10 > Constraints.m33454getMaxWidthimpl(j10) || iM33456getMinWidthimpl > i10) {
            return false;
        }
        return i11 <= Constraints.m33453getMaxHeightimpl(j10) && Constraints.m33455getMinHeightimpl(j10) <= i11;
    }
}
