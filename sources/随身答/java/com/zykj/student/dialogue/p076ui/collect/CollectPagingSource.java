package com.zykj.student.dialogue.p076ui.collect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.zykj.student.dialogue.bean.req.CollectSessionReq;
import com.zykj.student.dialogue.bean.resp.CollectSession;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p158k6.InterfaceC8287g;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/CollectPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "Lk6/g;", "dialogueApi", "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;", "req", "Lkotlin/Function1;", "", "", "onError", "<init>", "(Lk6/g;Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;Lkotlin/jvm/functions/Function1;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lk6/g;", "b", "Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;", "c", "Lkotlin/jvm/functions/Function1;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCollectPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectPagingSource.kt\ncom/zykj/student/dialogue/ui/collect/CollectPagingSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1563#2:43\n1634#2,3:44\n*S KotlinDebug\n*F\n+ 1 CollectPagingSource.kt\ncom/zykj/student/dialogue/ui/collect/CollectPagingSource\n*L\n28#1:43\n28#1:44,3\n*E\n"})
/* loaded from: classes5.dex */
public final class CollectPagingSource extends PagingSource<Integer, CollectSession> {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: b, reason: from kotlin metadata */
    public final CollectSessionReq req;

    /* renamed from: c, reason: from kotlin metadata */
    public final Function1 onError;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.collect.CollectPagingSource", m13451f = "CollectPagingSource.kt", m13452i = {0, 0, 0}, m13453l = {23}, m13454m = "load", m13455n = {"params", "page", "pageSize"}, m13456s = {"L$0", "I$0", "I$1"})
    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectPagingSource$load$1 */
    public static final class C74871 extends ContinuationImpl {

        /* renamed from: a */
        public Object f10774a;

        /* renamed from: b */
        public int f10775b;

        /* renamed from: c */
        public int f10776c;

        /* renamed from: d */
        public /* synthetic */ Object f10777d;

        /* renamed from: f */
        public int f10779f;

        public C74871(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10777d = obj;
            this.f10779f |= Integer.MIN_VALUE;
            return CollectPagingSource.this.load(null, this);
        }
    }

    public CollectPagingSource(InterfaceC8287g dialogueApi, CollectSessionReq req, Function1 onError) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.dialogueApi = dialogueApi;
        this.req = req;
        this.onError = onError;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Integer getRefreshKey2(PagingState<Integer, CollectSession> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r22, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.zykj.student.dialogue.bean.resp.CollectSession>> r23) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.collect.CollectPagingSource.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/collect/CollectPagingSource.smali:164
    }
}
