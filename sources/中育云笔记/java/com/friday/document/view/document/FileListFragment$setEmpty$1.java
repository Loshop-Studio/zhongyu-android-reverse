package com.friday.document.view.document;

import androidx.paging.PagingData;
import com.friday.document.adapter.DocumentAdapter;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.document.view.document.FileListFragment$setEmpty$1", m26211f = "FileListFragment.kt", m26212l = {50}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FileListFragment$setEmpty$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f7332c;

    /* renamed from: d */
    public final /* synthetic */ FileListFragment f7333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileListFragment$setEmpty$1(FileListFragment fileListFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f7333d = fileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new FileListFragment$setEmpty$1(this.f7333d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f7332c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            DocumentAdapter documentAdapter = this.f7333d.f7315l;
            PagingData pagingDataEmpty = PagingData.Companion.empty();
            this.f7332c = 1;
            if (documentAdapter.submitData(pagingDataEmpty, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((FileListFragment$setEmpty$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
