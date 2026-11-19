package com.zykj.gallery.page;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0096@¢\u0006\u0004\b\f\u0010\rRZ\u0010\u0017\u001aH\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/gallery/page/GenericPagingSource;", "", "Value", "Landroidx/paging/PagingSource;", "", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "page", "pageSize", "Lkotlin/coroutines/Continuation;", "", "a", "Lkotlin/jvm/functions/Function3;", "dataFetcher", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class GenericPagingSource<Value> extends PagingSource<Integer, Value> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Function3 dataFetcher;

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.page.GenericPagingSource", m7918f = "GenericPagingSource.kt", m7919i = {0, 0, 0}, m7920l = {30}, m7921m = "load", m7922n = {"params", "currentPage", "pageSize"}, m7923s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.zykj.gallery.page.GenericPagingSource$load$1 */
    public static final class C60231 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5752a;

        /* renamed from: b */
        public int f5753b;

        /* renamed from: c */
        public int f5754c;

        /* renamed from: d */
        public /* synthetic */ Object f5755d;

        /* renamed from: f */
        public int f5757f;

        public C60231(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5755d = obj;
            this.f5757f |= Integer.MIN_VALUE;
            return GenericPagingSource.this.load(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.zykj.gallery.page.GenericPagingSource.C60231
            if (r0 == 0) goto L13
            r0 = r10
            com.zykj.gallery.page.GenericPagingSource$load$1 r0 = (com.zykj.gallery.page.GenericPagingSource.C60231) r0
            int r1 = r0.f5757f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5757f = r1
            goto L18
        L13:
            com.zykj.gallery.page.GenericPagingSource$load$1 r0 = new com.zykj.gallery.page.GenericPagingSource$load$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5755d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5757f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r9 = r0.f5753b
            java.lang.Object r0 = r0.f5752a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L2f
            goto L6e
        L2f:
            r9 = move-exception
            goto L8d
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> L2f
            if (r10 == 0) goto L49
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> L2f
            goto L4a
        L49:
            r10 = r3
        L4a:
            int r2 = r9.getLoadSize()     // Catch: java.lang.Exception -> L2f
            kotlin.jvm.functions.Function3 r4 = r8.dataFetcher     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> L2f
            r0.f5752a = r9     // Catch: java.lang.Exception -> L2f
            r0.f5753b = r10     // Catch: java.lang.Exception -> L2f
            r0.f5754c = r2     // Catch: java.lang.Exception -> L2f
            r0.f5757f = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r4.invoke(r5, r6, r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L6b
            return r1
        L6b:
            r7 = r10
            r10 = r9
            r9 = r7
        L6e:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> L2f
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L2f
            r1 = 0
            if (r9 != r3) goto L77
            r2 = r1
            goto L7d
        L77:
            int r2 = r9 + (-1)
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch: java.lang.Exception -> L2f
        L7d:
            boolean r4 = r10.isEmpty()     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L84
            goto L89
        L84:
            int r9 = r9 + r3
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)     // Catch: java.lang.Exception -> L2f
        L89:
            r0.<init>(r10, r2, r1)     // Catch: java.lang.Exception -> L2f
            return r0
        L8d:
            androidx.paging.PagingSource$LoadResult$Error r10 = new androidx.paging.PagingSource$LoadResult$Error
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.page.GenericPagingSource.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/page/GenericPagingSource.smali:166
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Integer getRefreshKey(PagingState state) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition != null) {
            int iIntValue = anchorPosition.intValue();
            PagingSource.LoadResult.Page pageClosestPageToPosition = state.closestPageToPosition(iIntValue);
            if (pageClosestPageToPosition != null && (num2 = (Integer) pageClosestPageToPosition.getPrevKey()) != null) {
                return Integer.valueOf(num2.intValue() + 1);
            }
            PagingSource.LoadResult.Page pageClosestPageToPosition2 = state.closestPageToPosition(iIntValue);
            if (pageClosestPageToPosition2 != null && (num = (Integer) pageClosestPageToPosition2.getNextKey()) != null) {
                return Integer.valueOf(num.intValue() - 1);
            }
        }
        return null;
    }
}
