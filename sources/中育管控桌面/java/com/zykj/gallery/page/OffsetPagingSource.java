package com.zykj.gallery.page;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B]\u0012L\u0010\f\u001aH\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018RZ\u0010\f\u001aH\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m7880d2 = {"Lcom/zykj/gallery/page/OffsetPagingSource;", "", "Value", "Landroidx/paging/PagingSource;", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "skipCount", "maxResultCount", "Lkotlin/coroutines/Continuation;", "Lcom/zykj/gallery/bean/PagedData;", "dataFetcher", "pageSize", "<init>", "(Lkotlin/jvm/functions/Function3;I)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlin/jvm/functions/Function3;", "b", "I", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nOffsetPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetPagingSource.kt\ncom/zykj/gallery/page/OffsetPagingSource\n+ 2 Logger.kt\ncom/dylanc/longan/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n89#2,2:50\n57#2,2:52\n1#3:54\n*S KotlinDebug\n*F\n+ 1 OffsetPagingSource.kt\ncom/zykj/gallery/page/OffsetPagingSource\n*L\n21#1:50,2\n21#1:52,2\n21#1:54\n*E\n"})
/* loaded from: classes2.dex */
public final class OffsetPagingSource<Value> extends PagingSource<Integer, Value> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Function3 dataFetcher;

    /* renamed from: b, reason: from kotlin metadata */
    public final int pageSize;

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.gallery.page.OffsetPagingSource", m7918f = "OffsetPagingSource.kt", m7919i = {0, 0, 0}, m7920l = {29}, m7921m = "load", m7922n = {"params", "currentPage", "maxResultCount"}, m7923s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.zykj.gallery.page.OffsetPagingSource$load$1 */
    public static final class C60241 extends ContinuationImpl {

        /* renamed from: a */
        public Object f5760a;

        /* renamed from: b */
        public int f5761b;

        /* renamed from: c */
        public int f5762c;

        /* renamed from: d */
        public /* synthetic */ Object f5763d;

        /* renamed from: f */
        public int f5765f;

        public C60241(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5763d = obj;
            this.f5765f |= Integer.MIN_VALUE;
            return OffsetPagingSource.this.load(null, this);
        }
    }

    public OffsetPagingSource(Function3 dataFetcher, int i6) {
        Intrinsics.checkNotNullParameter(dataFetcher, "dataFetcher");
        this.dataFetcher = dataFetcher;
        this.pageSize = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.zykj.gallery.page.OffsetPagingSource.C60241
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.gallery.page.OffsetPagingSource$load$1 r0 = (com.zykj.gallery.page.OffsetPagingSource.C60241) r0
            int r1 = r0.f5765f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5765f = r1
            goto L18
        L13:
            com.zykj.gallery.page.OffsetPagingSource$load$1 r0 = new com.zykj.gallery.page.OffsetPagingSource$load$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f5763d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5765f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.f5762c
            int r1 = r0.f5761b
            java.lang.Object r0 = r0.f5760a
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L31
            goto L71
        L31:
            r8 = move-exception
            goto La0
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.getKey()     // Catch: java.lang.Exception -> L31
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Exception -> L31
            if (r9 == 0) goto L4c
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L31
            goto L4d
        L4c:
            r9 = 0
        L4d:
            int r2 = r8.getLoadSize()     // Catch: java.lang.Exception -> L31
            kotlin.jvm.functions.Function3 r4 = r7.dataFetcher     // Catch: java.lang.Exception -> L31
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)     // Catch: java.lang.Exception -> L31
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> L31
            r0.f5760a = r8     // Catch: java.lang.Exception -> L31
            r0.f5761b = r9     // Catch: java.lang.Exception -> L31
            r0.f5762c = r2     // Catch: java.lang.Exception -> L31
            r0.f5765f = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = r4.invoke(r5, r6, r0)     // Catch: java.lang.Exception -> L31
            if (r8 != r1) goto L6e
            return r1
        L6e:
            r1 = r9
            r9 = r8
            r8 = r2
        L71:
            com.zykj.gallery.bean.PagedData r9 = (com.zykj.gallery.bean.PagedData) r9     // Catch: java.lang.Exception -> L31
            java.util.List r9 = r9.getItems()     // Catch: java.lang.Exception -> L31
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Exception -> L31
            r2 = 0
            if (r0 != 0) goto L8f
            int r0 = r9.size()     // Catch: java.lang.Exception -> L31
            if (r0 >= r8) goto L85
            goto L8f
        L85:
            int r8 = r9.size()     // Catch: java.lang.Exception -> L31
            int r8 = r8 + r1
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)     // Catch: java.lang.Exception -> L31
            goto L90
        L8f:
            r8 = r2
        L90:
            androidx.paging.PagingSource$LoadResult$Page r0 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Exception -> L31
            if (r1 != 0) goto L95
            goto L9c
        L95:
            int r2 = r7.pageSize     // Catch: java.lang.Exception -> L31
            int r1 = r1 - r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Exception -> L31
        L9c:
            r0.<init>(r9, r2, r8)     // Catch: java.lang.Exception -> L31
            return r0
        La0:
            androidx.paging.PagingSource$LoadResult$Error r9 = new androidx.paging.PagingSource$LoadResult$Error
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.page.OffsetPagingSource.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/page/OffsetPagingSource.smali:276
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer getRefreshKey(androidx.paging.PagingState r9) {
        /*
            r8 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Integer r0 = r9.getAnchorPosition()
            r1 = 0
            if (r0 == 0) goto L2c
            int r0 = r0.intValue()
            androidx.paging.PagingSource$LoadResult$Page r2 = r9.closestPageToPosition(r0)
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r2.getPrevKey()
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L2d
        L1e:
            androidx.paging.PagingSource$LoadResult$Page r9 = r9.closestPageToPosition(r0)
            if (r9 == 0) goto L2c
            java.lang.Object r9 = r9.getNextKey()
            r2 = r9
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L2d
        L2c:
            r2 = r1
        L2d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "当前滚动到的是"
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            f1.c$a r0 = p054f1.AbstractC6291c.f7664a
            int r0 = r0.m6436a()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            java.lang.String r4 = "currentThread().stackTrace"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            int r4 = r3.length
            r5 = 0
        L53:
            if (r5 >= r4) goto L66
            r6 = r3[r5]
            java.lang.String r7 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            boolean r7 = p054f1.AbstractC6292d.m6442b(r6)
            if (r7 != 0) goto L63
            goto L67
        L63:
            int r5 = r5 + 1
            goto L53
        L66:
            r6 = r1
        L67:
            if (r6 != 0) goto L6b
            r3 = r1
            goto L6f
        L6b:
            java.lang.String r3 = p054f1.AbstractC6292d.m6441a(r6)
        L6f:
            if (r3 != 0) goto L73
            java.lang.String r3 = ""
        L73:
            p054f1.AbstractC6292d.m6443c(r0, r3, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.page.OffsetPagingSource.getRefreshKey(androidx.paging.PagingState):java.lang.Integer"); // DEX body: android/中育管控桌面/smali_classes2/com/zykj/gallery/page/OffsetPagingSource.smali:118
    }
}
