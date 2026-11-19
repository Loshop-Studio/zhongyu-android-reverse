package com.zykj.student.dialogue.p076ui.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.StatusUtil;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$loadData$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10920a;

    /* renamed from: b */
    public final /* synthetic */ AnswerPagerFragment f10921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerPagerFragment$loadData$1(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
        super(2, continuation);
        this.f10921b = answerPagerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerPagerFragment$loadData$1(this.f10921b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessageResponse messageResponseM15238m;
        MessageResponse messageResponseM15236k;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10920a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object value = this.f10921b.m10225K().getViewState().getValue();
        AnswerPagerFragment answerPagerFragment = this.f10921b;
        C9336k c9336k = (C9336k) value;
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        if (c9336k.m15228c()) {
            String strM15234i = c9336k.m15234i();
            if (strM15234i != null) {
                answerPagerFragment.m10258M(strM15234i);
            } else {
                answerPagerFragment.m10260T(false);
            }
        } else {
            MessageResponse messageResponseM15232g = c9336k.m15232g();
            if (messageResponseM15232g != null) {
                Boxing.boxBoolean(arrayList.add(new C6593a.a(messageResponseM15232g.getContent(), answerPagerFragment.m10225K().getFilePrefixPath(), StringsKt.substringAfterLast$default(messageResponseM15232g.getContent(), "/", (String) null, 2, (Object) null)).m4614d(100).m4613c(true).m4611a()));
            } else {
                answerPagerFragment.m10260T(false);
            }
            z9 = true;
        }
        if (c9336k.m15229d() && (messageResponseM15236k = c9336k.m15236k()) != null) {
            C6593a c6593aM4611a = new C6593a.a(messageResponseM15236k.getContent(), answerPagerFragment.m10225K().getFilePrefixPath(), StringsKt.substringAfterLast$default(messageResponseM15236k.getContent(), "/", (String) null, 2, (Object) null)).m4613c(true).m4611a();
            if (!StatusUtil.m4576c(c6593aM4611a)) {
                arrayList.add(c6593aM4611a);
            }
        }
        if (c9336k.m15230e() && (messageResponseM15238m = c9336k.m15238m()) != null) {
            C6593a c6593aM4611a2 = new C6593a.a(messageResponseM15238m.getContent(), answerPagerFragment.m10225K().getFilePrefixPath(), StringsKt.substringAfterLast$default(messageResponseM15238m.getContent(), "/", (String) null, 2, (Object) null)).m4613c(true).m4611a();
            if (!StatusUtil.m4576c(c6593aM4611a2)) {
                arrayList.add(c6593aM4611a2);
            }
        }
        if (!arrayList.isEmpty()) {
            answerPagerFragment.m10254E(arrayList, z9);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerPagerFragment$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
