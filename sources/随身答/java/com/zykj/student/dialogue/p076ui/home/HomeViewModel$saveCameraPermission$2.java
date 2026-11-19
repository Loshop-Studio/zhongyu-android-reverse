package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.core.MutablePreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$saveCameraPermission$2", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class HomeViewModel$saveCameraPermission$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11701a;

    /* renamed from: b */
    public /* synthetic */ Object f11702b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f11703c;

    /* renamed from: d */
    public final /* synthetic */ boolean f11704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$saveCameraPermission$2(HomeViewModel homeViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f11703c = homeViewModel;
        this.f11704d = z9;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(MutablePreferences mutablePreferences, Continuation continuation) {
        return ((HomeViewModel$saveCameraPermission$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HomeViewModel$saveCameraPermission$2 homeViewModel$saveCameraPermission$2 = new HomeViewModel$saveCameraPermission$2(this.f11703c, this.f11704d, continuation);
        homeViewModel$saveCameraPermission$2.f11702b = obj;
        return homeViewModel$saveCameraPermission$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutablePreferences mutablePreferences = (MutablePreferences) this.f11702b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11701a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        mutablePreferences.set(this.f11703c.m10876y(), Boxing.boxBoolean(this.f11704d));
        return Unit.INSTANCE;
    }
}
