package com.zykj.huiwei.launcher.bean.paging;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.huiwei.launcher.api.NotificationService;
import com.zykj.huiwei.launcher.bean.req.GetMessageReq;
import com.zykj.huiwei.launcher.bean.resp.MessageInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/paging/NotificationPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;", NotificationCompat.CATEGORY_SERVICE, "Lcom/zykj/huiwei/launcher/api/NotificationService;", "req", "Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;", "<init>", "(Lcom/zykj/huiwei/launcher/api/NotificationService;Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;)V", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class NotificationPagingSource extends PagingSource<Integer, MessageInfo> {
    public static final int $stable = 8;
    private final GetMessageReq req;
    private final NotificationService service;

    @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource", m7918f = "NotificationPagingSource.kt", m7919i = {0, 0, 0}, m7920l = {24}, m7921m = "load", m7922n = {"params", "page", "pageSize"}, m7923s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource$load$1 */
    public static final class C60461 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C60461(Continuation<? super C60461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NotificationPagingSource.this.load(null, this);
        }
    }

    public /* synthetic */ NotificationPagingSource(NotificationService notificationService, GetMessageReq getMessageReq, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationService, (i6 & 2) != 0 ? new GetMessageReq(null, null, null, 3, 0, 0, 55, null) : getMessageReq);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Integer getRefreshKey(PagingState<Integer, MessageInfo> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r7, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.huiwei.launcher.bean.resp.MessageInfo>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource.C60461
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource$load$1 r0 = (com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource.C60461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource$load$1 r0 = new com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource$load$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r7 = r0.I$1
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.paging.PagingSource$LoadParams r0 = (androidx.paging.PagingSource.LoadParams) r0
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L31
            goto L71
        L31:
            r7 = move-exception
            goto Lb4
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.getKey()
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4c
            int r8 = r8.intValue()
            goto L4d
        L4c:
            r8 = 0
        L4d:
            int r2 = r7.getLoadSize()
            com.zykj.huiwei.launcher.api.NotificationService r4 = r6.service     // Catch: java.lang.Throwable -> L31
            com.zykj.huiwei.launcher.bean.req.GetMessageReq r5 = r6.req     // Catch: java.lang.Throwable -> L31
            r5.setSkipCount(r8)     // Catch: java.lang.Throwable -> L31
            r5.setMaxResultCount(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)     // Catch: java.lang.Throwable -> L31
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.I$0 = r8     // Catch: java.lang.Throwable -> L31
            r0.I$1 = r2     // Catch: java.lang.Throwable -> L31
            r0.label = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r4.getMyMessageList(r5, r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r1 = r8
            r8 = r7
            r7 = r2
        L71:
            com.zykj.http.bean.ApiResp r8 = (com.zykj.http.bean.ApiResp) r8     // Catch: java.lang.Throwable -> L31
            int r7 = r1 - r7
            r0 = 0
            if (r7 <= 0) goto L7d
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)     // Catch: java.lang.Throwable -> L31
            goto L7e
        L7d:
            r7 = r0
        L7e:
            java.lang.Object r2 = p004a3.AbstractC0009a.m12a(r8)     // Catch: java.lang.Throwable -> L31
            com.zykj.huiwei.launcher.bean.resp.MessageResp r2 = (com.zykj.huiwei.launcher.bean.resp.MessageResp) r2     // Catch: java.lang.Throwable -> L31
            java.util.List r2 = r2.getItems()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto La4
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L91
            goto La4
        L91:
            java.lang.Object r0 = p004a3.AbstractC0009a.m12a(r8)     // Catch: java.lang.Throwable -> L31
            com.zykj.huiwei.launcher.bean.resp.MessageResp r0 = (com.zykj.huiwei.launcher.bean.resp.MessageResp) r0     // Catch: java.lang.Throwable -> L31
            java.util.List r0 = r0.getItems()     // Catch: java.lang.Throwable -> L31
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + r0
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)     // Catch: java.lang.Throwable -> L31
        La4:
            androidx.paging.PagingSource$LoadResult$Page r1 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = p004a3.AbstractC0009a.m12a(r8)     // Catch: java.lang.Throwable -> L31
            com.zykj.huiwei.launcher.bean.resp.MessageResp r8 = (com.zykj.huiwei.launcher.bean.resp.MessageResp) r8     // Catch: java.lang.Throwable -> L31
            java.util.List r8 = r8.getItems()     // Catch: java.lang.Throwable -> L31
            r1.<init>(r8, r7, r0)     // Catch: java.lang.Throwable -> L31
            return r1
        Lb4:
            androidx.paging.PagingSource$LoadResult$Error r8 = new androidx.paging.PagingSource$LoadResult$Error
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.bean.paging.NotificationPagingSource.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/bean/paging/NotificationPagingSource.smali:169
    }

    public NotificationPagingSource(NotificationService service, GetMessageReq req) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(req, "req");
        this.service = service;
        this.req = req;
    }
}
