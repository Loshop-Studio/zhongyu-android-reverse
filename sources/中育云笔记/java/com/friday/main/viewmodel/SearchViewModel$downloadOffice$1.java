package com.friday.main.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.friday.common.entity.FileEntity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9664d;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadOffice$1", m26211f = "SearchViewModel.kt", m26212l = {Opcodes.INVOKEINTERFACE}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SearchViewModel$downloadOffice$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9706c;

    /* renamed from: d */
    public final /* synthetic */ SearchViewModel f9707d;

    /* renamed from: e */
    public final /* synthetic */ FileEntity f9708e;

    @InterfaceC11829d(m26210c = "com.friday.main.viewmodel.SearchViewModel$downloadOffice$1$1", m26211f = "SearchViewModel.kt", m26212l = {186}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.viewmodel.SearchViewModel$downloadOffice$1$1 */
    public static final class C62291 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9709c;

        /* renamed from: d */
        public final /* synthetic */ SearchViewModel f9710d;

        /* renamed from: e */
        public final /* synthetic */ FileEntity f9711e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62291(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9710d = searchViewModel;
            this.f9711e = fileEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62291(this.f9710d, this.f9711e, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9709c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC9664d interfaceC9664d = this.f9710d.f9651c;
                FileEntity fileEntity = this.f9711e;
                this.f9709c = 1;
                if (interfaceC9664d.mo5612e(fileEntity, this) == objM25952f) {
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
            return ((C62291) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$downloadOffice$1(SearchViewModel searchViewModel, FileEntity fileEntity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9707d = searchViewModel;
        this.f9708e = fileEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SearchViewModel$downloadOffice$1(this.f9707d, this.f9708e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9706c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C62291 c62291 = new C62291(this.f9707d, this.f9708e, null);
            this.f9706c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c62291, this) == objM25952f) {
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
        return ((SearchViewModel$downloadOffice$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
