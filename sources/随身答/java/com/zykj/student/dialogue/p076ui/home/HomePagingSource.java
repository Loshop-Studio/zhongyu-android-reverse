package com.zykj.student.dialogue.p076ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.student.dialogue.bean.req.SessionsReq;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p158k6.InterfaceC8287g;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomePagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "Lk6/g;", "dialogueApi", "Lcom/zykj/student/dialogue/bean/req/SessionsReq;", "req", "Lkotlin/Function1;", "", "", "loadError", "<init>", "(Lk6/g;Lcom/zykj/student/dialogue/bean/req/SessionsReq;Lkotlin/jvm/functions/Function1;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "a", "Lk6/g;", "b", "Lcom/zykj/student/dialogue/bean/req/SessionsReq;", "c", "Lkotlin/jvm/functions/Function1;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class HomePagingSource extends PagingSource<Integer, QuestionResp> {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: b, reason: from kotlin metadata */
    public final SessionsReq req;

    /* renamed from: c, reason: from kotlin metadata */
    public final Function1 loadError;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomePagingSource", m13451f = "HomePagerViewModel.kt", m13452i = {0, 0, 0}, m13453l = {155}, m13454m = "load", m13455n = {"params", "page", "pageSize"}, m13456s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagingSource$load$1 */
    public static final class C75811 extends ContinuationImpl {

        /* renamed from: a */
        public Object f11594a;

        /* renamed from: b */
        public int f11595b;

        /* renamed from: c */
        public int f11596c;

        /* renamed from: d */
        public /* synthetic */ Object f11597d;

        /* renamed from: f */
        public int f11599f;

        public C75811(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11597d = obj;
            this.f11599f |= Integer.MIN_VALUE;
            return HomePagingSource.this.load(null, this);
        }
    }

    public HomePagingSource(InterfaceC8287g dialogueApi, SessionsReq req, Function1 loadError) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(loadError, "loadError");
        this.dialogueApi = dialogueApi;
        this.req = req;
        this.loadError = loadError;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey, reason: merged with bridge method [inline-methods] */
    public Integer getRefreshKey2(PagingState<Integer, QuestionResp> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r21, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.student.dialogue.bean.resp.QuestionResp>> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            boolean r2 = r0 instanceof com.zykj.student.dialogue.p076ui.home.HomePagingSource.C75811
            if (r2 == 0) goto L17
            r2 = r0
            com.zykj.student.dialogue.ui.home.HomePagingSource$load$1 r2 = (com.zykj.student.dialogue.p076ui.home.HomePagingSource.C75811) r2
            int r3 = r2.f11599f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f11599f = r3
            goto L1c
        L17:
            com.zykj.student.dialogue.ui.home.HomePagingSource$load$1 r2 = new com.zykj.student.dialogue.ui.home.HomePagingSource$load$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f11597d
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f11599f
            r5 = 1
            if (r4 == 0) goto L40
            if (r4 != r5) goto L38
            int r3 = r2.f11596c
            int r4 = r2.f11595b
            java.lang.Object r2 = r2.f11594a
            androidx.paging.PagingSource$LoadParams r2 = (androidx.paging.PagingSource.LoadParams) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L35
            goto L82
        L35:
            r0 = move-exception
            goto Lb9
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L40:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Object r0 = r21.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
        L4f:
            r15 = r0
            goto L53
        L51:
            r0 = 0
            goto L4f
        L53:
            k6.g r0 = r1.dialogueApi     // Catch: java.lang.Throwable -> L35
            com.zykj.student.dialogue.bean.req.SessionsReq r6 = r1.req     // Catch: java.lang.Throwable -> L35
            r18 = 1279(0x4ff, float:1.792E-42)
            r19 = 0
            r16 = 20
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            com.zykj.student.dialogue.bean.req.SessionsReq r4 = com.zykj.student.dialogue.bean.req.SessionsReq.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L35
            r6 = r16
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)     // Catch: java.lang.Throwable -> L35
            r2.f11594a = r7     // Catch: java.lang.Throwable -> L35
            r2.f11595b = r15     // Catch: java.lang.Throwable -> L35
            r2.f11596c = r6     // Catch: java.lang.Throwable -> L35
            r2.f11599f = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.m13404t(r4, r2)     // Catch: java.lang.Throwable -> L35
            if (r0 != r3) goto L80
            return r3
        L80:
            r3 = r6
            r4 = r15
        L82:
            com.zykj.student.dialogue.network.BaseResponse r0 = (com.zykj.student.dialogue.network.BaseResponse) r0     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.getResult()     // Catch: java.lang.Throwable -> L35
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L35
            int r2 = r4 - r3
            r5 = 0
            if (r2 <= 0) goto L94
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch: java.lang.Throwable -> L35
            goto L95
        L94:
            r2 = r5
        L95:
            if (r0 == 0) goto Lad
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L9e
            goto Lad
        L9e:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L35
            if (r6 != r3) goto Lad
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L35
            int r4 = r4 + r3
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)     // Catch: java.lang.Throwable -> L35
        Lad:
            androidx.paging.PagingSource$LoadResult$Page r3 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lb5
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L35
        Lb5:
            r3.<init>(r0, r2, r5)     // Catch: java.lang.Throwable -> L35
            return r3
        Lb9:
            kotlin.jvm.functions.Function1 r2 = r1.loadError
            r2.invoke(r0)
            androidx.paging.PagingSource$LoadResult$Error r2 = new androidx.paging.PagingSource$LoadResult$Error
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomePagingSource.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomePagingSource.smali:158
    }
}
