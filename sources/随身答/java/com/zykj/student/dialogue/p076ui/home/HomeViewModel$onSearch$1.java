package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.RegexUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p128h6.AbstractC8103b;
import p244s6.C9526k0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$onSearch$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$onSearch$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,509:1\n230#2,5:510\n230#2,5:515\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$onSearch$1\n*L\n236#1:510,5\n242#1:515,5\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel$onSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11690a;

    /* renamed from: b */
    public final /* synthetic */ String f11691b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f11692c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$onSearch$1(String str, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11691b = str;
        this.f11692c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$onSearch$1(this.f11691b, this.f11692c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11690a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.f11691b.length() == 0) {
            MutableStateFlow mutableStateFlow = this.f11692c._filterConditions;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, C9526k0.m15715b((C9526k0) value2, null, null, null, null, null, null, null, null, "", 255, null)));
        } else if (StringsKt.isBlank(this.f11691b)) {
            this.f11692c.m9922g(new AbstractC8103b.a.c("搜索内容不能为空"));
        } else if (RegexUtils.isMatch("^[a-zA-Z0-9\\u4e00-\\u9fa5]+$", this.f11691b)) {
            MutableStateFlow mutableStateFlow2 = this.f11692c._filterConditions;
            String str = this.f11691b;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C9526k0.m15715b((C9526k0) value, null, null, null, null, null, null, null, null, str, 255, null)));
        } else {
            this.f11692c.m9922g(new AbstractC8103b.a.c("搜索内容不支持特殊字符"));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$onSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
