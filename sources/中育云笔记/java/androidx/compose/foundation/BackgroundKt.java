package androidx.compose.foundation;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class BackgroundKt {
    @Stable
    public static final Modifier background(Modifier modifier, final Brush brush, final Shape shape, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) final float f10) {
        return modifier.then(new BackgroundElement(0L, brush, f10, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("background");
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f10));
                inspectorInfo.getProperties().set("brush", brush);
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 1, null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return background(modifier, brush, shape, f10);
    }

    @Stable
    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m26949backgroundbw27NRU(Modifier modifier, final long j10, final Shape shape) {
        return modifier.then(new BackgroundElement(j10, null, 1.0f, shape, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("background");
                inspectorInfo.setValue(Color.m30868boximpl(j10));
                inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m30868boximpl(j10));
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), 2, null));
    }

    /* renamed from: background-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m26950backgroundbw27NRU$default(Modifier modifier, long j10, Shape shape, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m26949backgroundbw27NRU(modifier, j10, shape);
    }
}
