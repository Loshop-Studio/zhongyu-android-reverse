package androidx.paging;

import androidx.annotation.CheckResult;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class PagingDataTransforms__PagingDataTransformsKt {

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1", m26211f = "PagingDataTransforms.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertFooterItem$1 */
    public static final class C42721 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ T $item;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42721(T t10, InterfaceC11588c<? super C42721> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$item = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (this.L$0 == null) {
                return this.$item;
            }
            return null;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(T t10, T t11, InterfaceC11588c<? super T> interfaceC11588c) {
            C42721 c42721 = new C42721(this.$item, interfaceC11588c);
            c42721.L$0 = t11;
            return c42721.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1", m26211f = "PagingDataTransforms.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$insertHeaderItem$1 */
    public static final class C42731 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ T $item;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42731(T t10, InterfaceC11588c<? super C42731> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$item = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (this.L$0 == null) {
                return this.$item;
            }
            return null;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(T t10, T t11, InterfaceC11588c<? super T> interfaceC11588c) {
            C42731 c42731 = new C42731(this.$item, interfaceC11588c);
            c42731.L$0 = t10;
            return c42731.invokeSuspend(C10786q.f26013a);
        }
    }

    @CheckResult
    public static final /* synthetic */ PagingData filter(PagingData pagingData, final InterfaceC9544p predicate) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(predicate, "predicate");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC9544p $predicate$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2", m26211f = "PagingDataTransforms.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$predicate$inlined = interfaceC9544p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4268xb79ead07.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$filter$$inlined$transform$1$2$1 r0 = (androidx.paging.C4268xb79ead07.AnonymousClass2.AnonymousClass1) r0
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
                        hd.p r2 = r6.$predicate$inlined
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
                        qc.q r7 = p309qc.C10786q.f26013a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4268xb79ead07.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, predicate), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final /* synthetic */ PagingData flatMap(PagingData pagingData, final InterfaceC9544p transform) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
                final /* synthetic */ InterfaceC9544p $transform$inlined;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2", m26211f = "PagingDataTransforms.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$transform$inlined = interfaceC9544p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4269x8e37139e.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$flatMap$$inlined$transform$1$2$1 r0 = (androidx.paging.C4269x8e37139e.AnonymousClass2.AnonymousClass1) r0
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
                        hd.p r2 = r6.$transform$inlined
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
                        qc.q r7 = p309qc.C10786q.f26013a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4269x8e37139e.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, transform), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, T item) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(item, "item");
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
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(item, "item");
        return insertHeaderItem$default(pagingData, null, item, 1, null);
    }

    public static /* synthetic */ PagingData insertHeaderItem$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertHeaderItem(pagingData, terminalSeparatorType, obj);
    }

    @CheckResult
    public static final /* synthetic */ PagingData insertSeparators(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, InterfaceC9545q generator) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(generator, "generator");
        return new PagingData(SeparatorsKt.insertEventSeparators(pagingData.getFlow$paging_common(), terminalSeparatorType, generator), pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return insertSeparators(pagingData, terminalSeparatorType, interfaceC9545q);
    }

    @CheckResult
    public static final /* synthetic */ PagingData map(PagingData pagingData, final InterfaceC9544p transform) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
                final /* synthetic */ InterfaceC9544p $transform$inlined;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2", m26211f = "PagingDataTransforms.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1, reason: invalid class name */
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
                    this.$transform$inlined = interfaceC9544p;
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
                        boolean r0 = r8 instanceof androidx.paging.C4270xc9f70385.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.PagingDataTransforms__PagingDataTransformsKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.C4270xc9f70385.AnonymousClass2.AnonymousClass1) r0
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
                        hd.p r2 = r6.$transform$inlined
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
                        qc.q r7 = p309qc.C10786q.f26013a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4270xc9f70385.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, transform), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    public static final <T, R> PagingData<R> transform(PagingData<T> pagingData, InterfaceC9544p transform) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(transform, "transform");
        return new PagingData<>(new C4271x463405a5(pagingData.getFlow$paging_common(), transform), pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T item) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(item, "item");
        return insertSeparators(pagingData, terminalSeparatorType, new C42721(item, null));
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T item) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(item, "item");
        return insertSeparators(pagingData, terminalSeparatorType, new C42731(item, null));
    }
}
