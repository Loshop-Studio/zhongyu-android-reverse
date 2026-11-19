package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel$createSession$1", m13451f = "NewAnswerViewModel.kt", m13452i = {0, 1, 1, 2, 2, 3, 3}, m13453l = {95, 106, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 111}, m13454m = "invokeSuspend", m13455n = {"$i$a$-runCatching-NewAnswerViewModel$createSession$1$1", "it", "$i$a$-onSuccess-NewAnswerViewModel$createSession$1$2", "it", "$i$a$-onSuccess-NewAnswerViewModel$createSession$1$2", "it", "$i$a$-onFailure-NewAnswerViewModel$createSession$1$3"}, m13456s = {"I$0", "L$1", "I$0", "L$1", "I$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
public final class NewAnswerViewModel$createSession$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11214a;

    /* renamed from: b */
    public Object f11215b;

    /* renamed from: c */
    public Object f11216c;

    /* renamed from: d */
    public int f11217d;

    /* renamed from: e */
    public final /* synthetic */ NewAnswerViewModel f11218e;

    /* renamed from: f */
    public final /* synthetic */ String[] f11219f;

    /* renamed from: g */
    public final /* synthetic */ String f11220g;

    /* renamed from: h */
    public final /* synthetic */ String f11221h;

    /* renamed from: i */
    public final /* synthetic */ String f11222i;

    /* renamed from: j */
    public final /* synthetic */ String f11223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerViewModel$createSession$1(NewAnswerViewModel newAnswerViewModel, String[] strArr, String str, String str2, String str3, String str4, Continuation continuation) {
        super(2, continuation);
        this.f11218e = newAnswerViewModel;
        this.f11219f = strArr;
        this.f11220g = str;
        this.f11221h = str2;
        this.f11222i = str3;
        this.f11223j = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewAnswerViewModel$createSession$1(this.f11218e, this.f11219f, this.f11220g, this.f11221h, this.f11222i, this.f11223j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r15.emit(r4, r14) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel$createSession$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1.smali:196
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NewAnswerViewModel$createSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
