package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", m26211f = "ReportDrawn.kt", m26212l = {Opcodes.IF_ICMPEQ}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super ReportDrawnKt$ReportDrawnAfter$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            InterfaceC9540l interfaceC9540l = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (interfaceC9540l.invoke(this) == objM25952f) {
                        return objM25952f;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th2) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th = th2;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
            try {
                AbstractC9924b.m20071b(obj);
                fullyDrawnReporter.removeReporter();
            } catch (Throwable th3) {
                th = th3;
                fullyDrawnReporter.removeReporter();
                throw th;
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
