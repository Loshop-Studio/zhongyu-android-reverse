package com.friday.paint.viewmodel;

import com.friday.common.helper.NotePageOrder;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1", m26211f = "NewNoteViewModel.kt", m26212l = {97}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewNoteViewModel$deleteNote$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10335c;

    /* renamed from: d */
    public final /* synthetic */ int f10336d;

    /* renamed from: e */
    public final /* synthetic */ List f10337e;

    /* renamed from: f */
    public final /* synthetic */ NewNoteViewModel f10338f;

    @InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1$1", m26211f = "NewNoteViewModel.kt", m26212l = {98}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1$1 */
    public static final class C63231 extends SuspendLambda implements InterfaceC9540l {

        /* renamed from: c */
        public int f10339c;

        /* renamed from: d */
        public final /* synthetic */ NewNoteViewModel f10340d;

        /* renamed from: e */
        public final /* synthetic */ List f10341e;

        /* renamed from: f */
        public final /* synthetic */ int f10342f;

        @InterfaceC11829d(m26210c = "com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1$1$1", m26211f = "NewNoteViewModel.kt", m26212l = {99}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.viewmodel.NewNoteViewModel$deleteNote$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10343c;

            /* renamed from: d */
            public final /* synthetic */ NewNoteViewModel f10344d;

            /* renamed from: e */
            public final /* synthetic */ List f10345e;

            /* renamed from: f */
            public final /* synthetic */ int f10346f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewNoteViewModel newNoteViewModel, List list, int i10, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10344d = newNoteViewModel;
                this.f10345e = list;
                this.f10346f = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f10344d, this.f10345e, this.f10346f, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f10343c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    NewNoteViewModel newNoteViewModel = this.f10344d;
                    String strM7665G = newNoteViewModel.m7665G();
                    String str = (String) this.f10345e.get(this.f10346f);
                    this.f10343c = 1;
                    if (newNoteViewModel.m7694w(strM7665G, str, this) == objM25952f) {
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63231(NewNoteViewModel newNoteViewModel, List list, int i10, InterfaceC11588c interfaceC11588c) {
            super(1, interfaceC11588c);
            this.f10340d = newNoteViewModel;
            this.f10341e = list;
            this.f10342f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(InterfaceC11588c interfaceC11588c) {
            return new C63231(this.f10340d, this.f10341e, this.f10342f, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10339c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10340d, this.f10341e, this.f10342f, null);
                this.f10339c = 1;
                if (AbstractC11109f.m24709g(abstractC11106e0M24799b, anonymousClass1, this) == objM25952f) {
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

        @Override // p181hd.InterfaceC9540l
        public final Object invoke(InterfaceC11588c interfaceC11588c) {
            return ((C63231) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewNoteViewModel$deleteNote$1(int i10, List list, NewNoteViewModel newNoteViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10336d = i10;
        this.f10337e = list;
        this.f10338f = newNoteViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewNoteViewModel$deleteNote$1(this.f10336d, this.f10337e, this.f10338f, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10335c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            int i11 = this.f10336d;
            if (i11 < 0 || i11 >= this.f10337e.size()) {
                this.f10338f.f10323s.postValue(AbstractC11826a.m26208c(-1));
                return C10786q.f26013a;
            }
            NotePageOrder notePageOrder = NotePageOrder.f6040a;
            String strM7665G = this.f10338f.m7665G();
            C63231 c63231 = new C63231(this.f10338f, this.f10337e, this.f10336d, null);
            this.f10335c = 1;
            if (notePageOrder.m5247e(strM7665G, c63231, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f10338f.f10323s.postValue(AbstractC11826a.m26208c(this.f10336d));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewNoteViewModel$deleteNote$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
