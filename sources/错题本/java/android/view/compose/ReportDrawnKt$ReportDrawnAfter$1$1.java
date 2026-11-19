package android.view.compose;

import android.view.FullyDrawnReporter;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", m5303f = "ReportDrawn.kt", m5304i = {0}, m5305l = {159}, m5306m = "invokeSuspend", m5307n = {"$this$reportWhenComplete$iv"}, m5308s = {"L$0"})
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,153:1\n168#2,10:154\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n*L\n151#1:154,10\n*E\n"})
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6471c $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super ReportDrawnKt$ReportDrawnAfter$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = interfaceC6471c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            InterfaceC6471c interfaceC6471c = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (interfaceC6471c.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
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
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
            try {
                AbstractC5774b.m5119b(obj);
                fullyDrawnReporter.removeReporter();
            } catch (Throwable th3) {
                th = th3;
                fullyDrawnReporter.removeReporter();
                throw th;
            }
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
