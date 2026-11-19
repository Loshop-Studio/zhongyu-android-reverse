package com.friday.document.view.document;

import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.entity.FileEntity;
import com.friday.document.adapter.MultiModeFileEntity;
import java.util.Iterator;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.BaseDocumentFragment$scrollToData$1", m26211f = "BaseDocumentFragment.kt", m26212l = {197}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseDocumentFragment$scrollToData$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7308c;

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f7309d;

    /* renamed from: e */
    public final /* synthetic */ BaseDocumentFragment f7310e;

    /* renamed from: f */
    public final /* synthetic */ String f7311f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDocumentFragment$scrollToData$1(RecyclerView recyclerView, BaseDocumentFragment baseDocumentFragment, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7309d = recyclerView;
        this.f7310e = baseDocumentFragment;
        this.f7311f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BaseDocumentFragment$scrollToData$1(this.f7309d, this.f7310e, this.f7311f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FileEntity entity;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7308c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f7308c = 1;
            if (DelayKt.m20376b(500L, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        if (this.f7309d.getScrollState() != 0) {
            return C10786q.f26013a;
        }
        RecyclerView recyclerView = this.f7309d;
        BaseDocumentFragment baseDocumentFragment = this.f7310e;
        String str = this.f7311f;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        AbstractC9979u.m20292e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        PagingDataAdapter pagingDataAdapter = adapter instanceof PagingDataAdapter ? (PagingDataAdapter) adapter : null;
        if (pagingDataAdapter != null) {
            Iterator it = pagingDataAdapter.snapshot().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                MultiModeFileEntity multiModeFileEntity = (MultiModeFileEntity) it.next();
                if (AbstractC9979u.m20289b((multiModeFileEntity == null || (entity = multiModeFileEntity.getEntity()) == null) ? null : entity.getFileId(), str)) {
                    break;
                }
                i11++;
            }
            if (iFindFirstVisibleItemPosition > i11 || i11 > iFindLastVisibleItemPosition) {
                baseDocumentFragment.moveToPosition(recyclerView, i11 >= 0 ? i11 : 0);
            }
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BaseDocumentFragment$scrollToData$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
