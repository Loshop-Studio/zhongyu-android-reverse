package androidx.compose.p014ui.scrollcapture;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.semantics.ScrollAxisRange;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", m26211f = "ComposeScrollCaptureCallback.android.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, InterfaceC11588c<? super ComposeScrollCaptureCallback$scrollTracker$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, interfaceC11588c);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f10, InterfaceC11588c<? super Float> interfaceC11588c) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            float f10 = this.F$0;
            InterfaceC9544p scrollCaptureScrollByAction = ScrollCapture_androidKt.getScrollCaptureScrollByAction(this.this$0.node);
            if (scrollCaptureScrollByAction == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                throw new KotlinNothingValueException();
            }
            boolean reverseScrolling = ((ScrollAxisRange) this.this$0.node.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
            if (reverseScrolling) {
                f10 = -f10;
            }
            Offset offsetM30626boximpl = Offset.m30626boximpl(Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L)));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = scrollCaptureScrollByAction.invoke(offsetM30626boximpl, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
            z10 = reverseScrolling;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = this.Z$0;
            AbstractC9924b.m20071b(obj);
        }
        long jM30647unboximpl = ((Offset) obj).m30647unboximpl();
        return AbstractC11826a.m26207b(z10 ? -Float.intBitsToFloat((int) (jM30647unboximpl & 4294967295L)) : Float.intBitsToFloat((int) (jM30647unboximpl & 4294967295L)));
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC11588c<? super Float>) obj2);
    }
}
