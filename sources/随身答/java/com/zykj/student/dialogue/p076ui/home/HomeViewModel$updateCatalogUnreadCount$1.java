package com.zykj.student.dialogue.p076ui.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p244s6.C9560s2;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$updateCatalogUnreadCount$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateCatalogUnreadCount$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,509:1\n230#2,3:510\n233#2,2:517\n1563#3:513\n1634#3,3:514\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$updateCatalogUnreadCount$1\n*L\n315#1:510,3\n315#1:517,2\n316#1:513\n316#1:514,3\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel$updateCatalogUnreadCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11705a;

    /* renamed from: b */
    public final /* synthetic */ Long f11706b;

    /* renamed from: c */
    public final /* synthetic */ HomeViewModel f11707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateCatalogUnreadCount$1(Long l9, HomeViewModel homeViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11706b = l9;
        this.f11707c = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$updateCatalogUnreadCount$1(this.f11706b, this.f11707c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        C9560s2 c9560s2;
        ArrayList arrayList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11705a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Long l9 = this.f11706b;
        if (l9 != null) {
            MutableStateFlow mutableStateFlow = this.f11707c._homeUiState;
            do {
                value = mutableStateFlow.getValue();
                c9560s2 = (C9560s2) value;
                List<CatalogResp> listM15751d = c9560s2.m15751d();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15751d, 10));
                for (CatalogResp catalogRespCopy$default : listM15751d) {
                    long id = catalogRespCopy$default.getId();
                    if (l9 != null && id == l9.longValue()) {
                        catalogRespCopy$default = CatalogResp.copy$default(catalogRespCopy$default, 0L, null, false, 0, 0, false, catalogRespCopy$default.getNewParimarMsgCount() - 1, 0, 191, null);
                    }
                    arrayList.add(catalogRespCopy$default);
                }
            } while (!mutableStateFlow.compareAndSet(value, C9560s2.m15748b(c9560s2, null, arrayList, null, false, null, false, null, null, 253, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$updateCatalogUnreadCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
