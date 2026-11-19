package com.zykj.student.dialogue.p076ui.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$download$2$1$taskEnd$1", m13451f = "AnswerPagerFragment.kt", m13452i = {0, 0, 0, 0}, m13453l = {378}, m13454m = "invokeSuspend", m13455n = {"zipFile", "unpackFile", "$i$a$-let-AnswerPagerFragment$download$2$1$taskEnd$1$1", "$i$a$-runCatching-AnswerPagerFragment$download$2$1$taskEnd$1$1$1"}, m13456s = {"L$3", "L$4", "I$0", "I$1"})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment$download$2$1$taskEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f10904a;

    /* renamed from: b */
    public Object f10905b;

    /* renamed from: c */
    public Object f10906c;

    /* renamed from: d */
    public Object f10907d;

    /* renamed from: e */
    public Object f10908e;

    /* renamed from: f */
    public int f10909f;

    /* renamed from: g */
    public int f10910g;

    /* renamed from: h */
    public int f10911h;

    /* renamed from: i */
    public final /* synthetic */ EndCause f10912i;

    /* renamed from: j */
    public final /* synthetic */ C6593a f10913j;

    /* renamed from: k */
    public final /* synthetic */ Ref.ObjectRef f10914k;

    /* renamed from: l */
    public final /* synthetic */ C6593a f10915l;

    /* renamed from: m */
    public final /* synthetic */ AnswerPagerFragment f10916m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerPagerFragment$download$2$1$taskEnd$1(EndCause endCause, C6593a c6593a, Ref.ObjectRef objectRef, C6593a c6593a2, AnswerPagerFragment answerPagerFragment, Continuation continuation) {
        super(2, continuation);
        this.f10912i = endCause;
        this.f10913j = c6593a;
        this.f10914k = objectRef;
        this.f10915l = c6593a2;
        this.f10916m = answerPagerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerPagerFragment$download$2$1$taskEnd$1(this.f10912i, this.f10913j, this.f10914k, this.f10915l, this.f10916m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.AnswerPagerFragment$download$2$1$taskEnd$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerPagerFragment$download$2$1$taskEnd$1.smali:186
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerPagerFragment$download$2$1$taskEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
