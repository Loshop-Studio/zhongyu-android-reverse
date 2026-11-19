package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.p014ui.graphics.Matrix;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1768x8f2ae8f3 extends FunctionReferenceImpl implements InterfaceC9540l {
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768x8f2ae8f3(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        super(1, AbstractC9979u.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m27972invoke58bKbWc(((Matrix) obj).m31131unboximpl());
        return C10786q.f26013a;
    }

    /* renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m27972invoke58bKbWc(float[] fArr) {
        AndroidLegacyPlatformTextInputServiceAdapter.startInput$localToScreen(this.$node, fArr);
    }
}
