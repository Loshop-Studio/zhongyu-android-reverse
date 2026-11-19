package androidx.paging;

import androidx.annotation.CheckResult;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class PagingDataTransforms__PagingDataTransformsKt {

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1", m17801f = "PagingDataTransforms.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1 */
    public static final class C43651 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ T $item;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43651(T t10, InterfaceC9324c<? super C43651> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$item = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            if (this.L$0 == null) {
                return this.$item;
            }
            return null;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(T t10, T t11, InterfaceC9324c<? super T> interfaceC9324c) {
            C43651 c43651 = new C43651(this.$item, interfaceC9324c);
            c43651.L$0 = t11;
            return c43651.invokeSuspend(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1", m17801f = "PagingDataTransforms.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1 */
    public static final class C43661 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ T $item;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43661(T t10, InterfaceC9324c<? super C43661> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$item = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            if (this.L$0 == null) {
                return this.$item;
            }
            return null;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(T t10, T t11, InterfaceC9324c<? super T> interfaceC9324c) {
            C43661 c43661 = new C43661(this.$item, interfaceC9324c);
            c43661.L$0 = t10;
            return c43661.invokeSuspend(C8736p.f16368a);
        }
    }

    @CheckResult
    public static final /* synthetic */ PagingData filter(PagingData pagingData, final InterfaceC10574p predicate) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(predicate, "predicate");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC10574p $predicate$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", m17801f = "PagingDataTransforms.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$predicate$inlined = interfaceC10574p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4361xb79ead07.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1 r0 = (androidx.paging.C4361xb79ead07.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1
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
                        x7.p r2 = r6.$predicate$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r7.filter(r2, r0)
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4361xb79ead07.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, predicate), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final /* synthetic */ PagingData flatMap(PagingData pagingData, final InterfaceC10574p transform) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;
                final /* synthetic */ InterfaceC10574p $transform$inlined;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2", m17801f = "PagingDataTransforms.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$transform$inlined = interfaceC10574p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4362x8e37139e.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1 r0 = (androidx.paging.C4362x8e37139e.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1
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
                        x7.p r2 = r6.$transform$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r7.flatMap(r2, r0)
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4362x8e37139e.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, transform), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, T item) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(item, "item");
        return insertFooterItem$default(pagingData, null, item, 1, null);
    }

    public static /* synthetic */ PagingData insertFooterItem$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertFooterItem(pagingData, terminalSeparatorType, obj);
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, T item) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(item, "item");
        return insertHeaderItem$default(pagingData, null, item, 1, null);
    }

    public static /* synthetic */ PagingData insertHeaderItem$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertHeaderItem(pagingData, terminalSeparatorType, obj);
    }

    @CheckResult
    public static final /* synthetic */ PagingData insertSeparators(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, InterfaceC10575q generator) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(generator, "generator");
        return new PagingData(SeparatorsKt.insertEventSeparators(pagingData.getFlow$paging_common_release(), terminalSeparatorType, generator), pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertSeparators(pagingData, terminalSeparatorType, interfaceC10575q);
    }

    @CheckResult
    public static final /* synthetic */ PagingData map(PagingData pagingData, final InterfaceC10574p transform) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;
                final /* synthetic */ InterfaceC10574p $transform$inlined;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", m17801f = "PagingDataTransforms.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$transform$inlined = interfaceC10574p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4363xc9f70385.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.C4363xc9f70385.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1
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
                        x7.p r2 = r6.$transform$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r7.map(r2, r0)
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4363xc9f70385.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, transform), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    public static final <T, R> PagingData<R> transform(PagingData<T> pagingData, InterfaceC10574p transform) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(transform, "transform");
        return new PagingData<>(new C4364x463405a5(pagingData.getFlow$paging_common_release(), transform), pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T item) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(item, "item");
        return insertSeparators(pagingData, terminalSeparatorType, new C43651(item, null));
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T item) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(item, "item");
        return insertSeparators(pagingData, terminalSeparatorType, new C43661(item, null));
    }
}
