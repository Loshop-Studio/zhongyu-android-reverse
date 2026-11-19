package com.zykj.evaluation.p057ui.home;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import p245t6.C9450o0;
import p245t6.C9452p0;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m13558d2 = {"Landroidx/paging/PagingData;", "Lt6/o0;", "pagingData", "", "", "Lt6/p0;", "map", "<anonymous>", "(Landroidx/paging/PagingData;Ljava/util/Map;)Landroidx/paging/PagingData;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$2", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class HomeViewModel$buildDataInfo$2 extends SuspendLambda implements Function3<PagingData<C9450o0>, Map<Long, ? extends C9452p0>, Continuation<? super PagingData<C9450o0>>, Object> {

    /* renamed from: a */
    public int f9812a;

    /* renamed from: b */
    public /* synthetic */ Object f9813b;

    /* renamed from: c */
    public /* synthetic */ Object f9814c;

    /* renamed from: d */
    public final /* synthetic */ HomeViewModel f9815d;

    @Metadata(m13557d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13558d2 = {"Lt6/o0;", "homeDataInfo", "<anonymous>", "(Lt6/o0;)Lt6/o0;"}, m13559k = 3, m13560mv = {2, 2, 0})
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$2$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$buildDataInfo$2$1 */
    public static final class C69271 extends SuspendLambda implements Function2<C9450o0, Continuation<? super C9450o0>, Object> {

        /* renamed from: a */
        public int f9816a;

        /* renamed from: b */
        public /* synthetic */ Object f9817b;

        /* renamed from: c */
        public final /* synthetic */ HomeViewModel f9818c;

        /* renamed from: d */
        public final /* synthetic */ Map f9819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C69271(HomeViewModel homeViewModel, Map map, Continuation continuation) {
            super(2, continuation);
            this.f9818c = homeViewModel;
            this.f9819d = map;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C9450o0 c9450o0, Continuation continuation) {
            return ((C69271) create(c9450o0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69271 c69271 = new C69271(this.f9818c, this.f9819d, continuation);
            c69271.f9817b = obj;
            return c69271;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C9450o0 c9450o0 = (C9450o0) this.f9817b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9816a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.f9818c.m10046C(c9450o0, this.f9819d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$buildDataInfo$2(HomeViewModel homeViewModel, Continuation continuation) {
        super(3, continuation);
        this.f9815d = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PagingData pagingData, Map map, Continuation continuation) {
        HomeViewModel$buildDataInfo$2 homeViewModel$buildDataInfo$2 = new HomeViewModel$buildDataInfo$2(this.f9815d, continuation);
        homeViewModel$buildDataInfo$2.f9813b = pagingData;
        homeViewModel$buildDataInfo$2.f9814c = map;
        return homeViewModel$buildDataInfo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData pagingData = (PagingData) this.f9813b;
        Map map = (Map) this.f9814c;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9812a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PagingDataTransforms__PagingDataTransformsKt.map(pagingData, new C69271(this.f9815d, map, null));
    }
}
