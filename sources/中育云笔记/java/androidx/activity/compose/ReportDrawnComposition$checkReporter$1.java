package androidx.activity.compose;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC9529a) obj);
        return C10786q.f26013a;
    }

    public final void invoke(InterfaceC9529a interfaceC9529a) {
        ((ReportDrawnComposition) this.receiver).observeReporter(interfaceC9529a);
    }
}
