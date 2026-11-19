package com.friday.user.viewmodel;

import com.blankj.utilcode.util.Utils;
import com.friday.user.R$string;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p220k7.C9827c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$clearCache$1", m26211f = "UserViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_HANDLE_DEX}, m26213m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class UserViewModel$clearCache$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10678c;

    /* renamed from: d */
    public final /* synthetic */ UserViewModel f10679d;

    @InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$clearCache$1$1", m26211f = "UserViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_METHOD, 95, 97, 99, PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, 113, PatchStatus.CODE_LOAD_LIB_NS, 138, 143}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.user.viewmodel.UserViewModel$clearCache$1$1 */
    public static final class C63311 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public long f10680c;

        /* renamed from: d */
        public Object f10681d;

        /* renamed from: e */
        public Object f10682e;

        /* renamed from: f */
        public Object f10683f;

        /* renamed from: g */
        public Object f10684g;

        /* renamed from: h */
        public Object f10685h;

        /* renamed from: i */
        public Object f10686i;

        /* renamed from: j */
        public Object f10687j;

        /* renamed from: k */
        public Object f10688k;

        /* renamed from: l */
        public Object f10689l;

        /* renamed from: m */
        public Object f10690m;

        /* renamed from: n */
        public Object f10691n;

        /* renamed from: o */
        public int f10692o;

        /* renamed from: p */
        public int f10693p;

        /* renamed from: q */
        public int f10694q;

        /* renamed from: r */
        public final /* synthetic */ UserViewModel f10695r;

        @InterfaceC11829d(m26210c = "com.friday.user.viewmodel.UserViewModel$clearCache$1$1$5", m26211f = "UserViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.user.viewmodel.UserViewModel$clearCache$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10696c;

            public AnonymousClass5(InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass5(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f10696c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                C9827c.m19926q().m19913d(Utils.getApp());
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass5) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63311(UserViewModel userViewModel, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10695r = userViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C63311(this.f10695r, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x01da, code lost:
        
            if (r3 != r7) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0292, code lost:
        
            if (r5 == r7) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x04bb, code lost:
        
            if (sd.AbstractC11109f.m24709g(r4, r6, r9) == r7) goto L91;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x03fe  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0475  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0482 A[LOOP:0: B:85:0x047c->B:87:0x0482, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0240 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r12v11, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x03df -> B:74:0x03ed). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.user.viewmodel.UserViewModel$clearCache$1.C63311.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes5/com/friday/user/viewmodel/UserViewModel$clearCache$1$1.smali:154
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63311) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewModel$clearCache$1(UserViewModel userViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10679d = userViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new UserViewModel$clearCache$1(this.f10679d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f10678c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC11106e0 abstractC11106e0M24799b = C11157r0.m24799b();
            C63311 c63311 = new C63311(this.f10679d, null);
            this.f10678c = 1;
            if (AbstractC11109f.m24709g(abstractC11106e0M24799b, c63311, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f10679d.m7829r().setValue(AbstractC11826a.m26206a(true));
        AbstractC11958b.m26587h(R$string.local_cache_has_already_clean);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((UserViewModel$clearCache$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
