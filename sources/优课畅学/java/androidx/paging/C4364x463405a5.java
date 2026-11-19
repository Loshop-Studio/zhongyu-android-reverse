package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1 */
/* loaded from: classes3.dex */
public final class C4364x463405a5 implements InterfaceC9266c {
    final /* synthetic */ InterfaceC9266c $this_unsafeTransform$inlined;
    final /* synthetic */ InterfaceC10574p $transform$inlined;

    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements InterfaceC9267d {
        final /* synthetic */ InterfaceC9267d $this_unsafeFlow;
        final /* synthetic */ InterfaceC10574p $transform$inlined$1;

        @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2", m17801f = "PagingDataTransforms.kt", m17802l = {TbsListener.ErrorCode.EXCEED_INCR_UPDATE, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(InterfaceC9267d interfaceC9267d, InterfaceC10574p interfaceC10574p) {
            this.$this_unsafeFlow = interfaceC9267d;
            this.$transform$inlined$1 = interfaceC10574p;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p169l8.InterfaceC9267d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof androidx.paging.C4364x463405a5.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2$1 r0 = (androidx.paging.C4364x463405a5.AnonymousClass2.AnonymousClass1) r0
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
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9079b.m15926b(r8)
                goto L5f
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.L$0
                l8.d r7 = (p169l8.InterfaceC9267d) r7
                kotlin.AbstractC9079b.m15926b(r8)
                goto L53
            L3c:
                kotlin.AbstractC9079b.m15926b(r8)
                l8.d r8 = r6.$this_unsafeFlow
                androidx.paging.PageEvent r7 = (androidx.paging.PageEvent) r7
                x7.p r2 = r6.$transform$inlined$1
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
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4364x463405a5.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, InterfaceC9324c interfaceC9324c) {
            AbstractC9131s.m16126c(4);
            new AnonymousClass1(interfaceC9324c);
            AbstractC9131s.m16126c(5);
            InterfaceC9267d interfaceC9267d = this.$this_unsafeFlow;
            Object objInvoke = this.$transform$inlined$1.invoke((PageEvent) obj, interfaceC9324c);
            AbstractC9131s.m16126c(0);
            interfaceC9267d.emit(objInvoke, interfaceC9324c);
            AbstractC9131s.m16126c(1);
            return C8736p.f16368a;
        }
    }

    public C4364x463405a5(InterfaceC9266c interfaceC9266c, InterfaceC10574p interfaceC10574p) {
        this.$this_unsafeTransform$inlined = interfaceC9266c;
        this.$transform$inlined = interfaceC10574p;
    }

    @Override // p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(interfaceC9267d, this.$transform$inlined), interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    public Object collect$$forInline(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        AbstractC9131s.m16126c(4);
        new ContinuationImpl(interfaceC9324c) { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return C4364x463405a5.this.collect(null, this);
            }
        };
        AbstractC9131s.m16126c(5);
        InterfaceC9266c interfaceC9266c = this.$this_unsafeTransform$inlined;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC9267d, this.$transform$inlined);
        AbstractC9131s.m16126c(0);
        interfaceC9266c.collect(anonymousClass2, interfaceC9324c);
        AbstractC9131s.m16126c(1);
        return C8736p.f16368a;
    }
}
