package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1 */
/* loaded from: classes3.dex */
public final class C4271x463405a5 implements InterfaceC11594c {
    final /* synthetic */ InterfaceC11594c $this_unsafeTransform$inlined;
    final /* synthetic */ InterfaceC9544p $transform$inlined;

    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements InterfaceC11595d {
        final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
        final /* synthetic */ InterfaceC9544p $transform$inlined$1;

        @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2", m26211f = "PagingDataTransforms.kt", m26212l = {51, 50}, m26213m = "emit", m26214v = 1)
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                super(interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC11595d interfaceC11595d, InterfaceC9544p interfaceC9544p) {
            this.$this_unsafeFlow = interfaceC11595d;
            this.$transform$inlined$1 = interfaceC9544p;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.C4271x463405a5.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1 r0 = (androidx.paging.C4271x463405a5.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9924b.m20071b(r8)
                goto L5f
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$0
                vd.d r7 = (p379vd.InterfaceC11595d) r7
                kotlin.AbstractC9924b.m20071b(r8)
                goto L53
            L3c:
                kotlin.AbstractC9924b.m20071b(r8)
                vd.d r8 = r6.$this_unsafeFlow
                androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                hd.p r2 = r6.$transform$inlined$1
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r7 = r2.invoke(r7, r0)
                if (r7 != r1) goto L50
                goto L5e
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L5f
            L5e:
                return r1
            L5f:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4271x463405a5.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, InterfaceC11588c interfaceC11588c) {
            AbstractC9977s.m20287c(4);
            new AnonymousClass1(interfaceC11588c);
            AbstractC9977s.m20287c(5);
            InterfaceC11595d interfaceC11595d = this.$this_unsafeFlow;
            Object objInvoke = this.$transform$inlined$1.invoke((PageEvent) obj, interfaceC11588c);
            AbstractC9977s.m20287c(0);
            interfaceC11595d.emit(objInvoke, interfaceC11588c);
            AbstractC9977s.m20287c(1);
            return C10786q.f26013a;
        }
    }

    public C4271x463405a5(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        this.$this_unsafeTransform$inlined = interfaceC11594c;
        this.$transform$inlined = interfaceC9544p;
    }

    @Override // p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(interfaceC11595d, this.$transform$inlined), interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    public Object collect$$forInline(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        AbstractC9977s.m20287c(4);
        new ContinuationImpl(interfaceC11588c) { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C4271x463405a5.this.collect(null, this);
            }
        };
        AbstractC9977s.m20287c(5);
        InterfaceC11594c interfaceC11594c = this.$this_unsafeTransform$inlined;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC11595d, this.$transform$inlined);
        AbstractC9977s.m20287c(0);
        interfaceC11594c.collect(anonymousClass2, interfaceC11588c);
        AbstractC9977s.m20287c(1);
        return C10786q.f26013a;
    }
}
