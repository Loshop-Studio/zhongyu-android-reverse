package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", m17801f = "ReportDrawn.kt", m17802l = {159}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super ReportDrawnKt$ReportDrawnAfter$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            InterfaceC10570l interfaceC10570l = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (interfaceC10570l.invoke(this) == objM17291f) {
                        return objM17291f;
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
                AbstractC9079b.m15926b(obj);
                fullyDrawnReporter.removeReporter();
            } catch (Throwable th3) {
                th = th3;
                fullyDrawnReporter.removeReporter();
                throw th;
            }
        }
        return C8736p.f16368a;
    }
}
