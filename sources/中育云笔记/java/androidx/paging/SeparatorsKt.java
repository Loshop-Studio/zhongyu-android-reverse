package androidx.paging;

import com.taobao.sophix.PatchStatus;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10976v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class SeparatorsKt {

    @InterfaceC11829d(m26210c = "androidx.paging.SeparatorsKt", m26211f = "Separators.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "insertInternalSeparators", m26214v = 1)
    /* renamed from: androidx.paging.SeparatorsKt$insertInternalSeparators$1 */
    public static final class C42881<R, T extends R> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C42881(InterfaceC11588c<? super C42881> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SeparatorsKt.insertInternalSeparators(null, null, this);
        }
    }

    public static final <T> void addSeparatorPage(List<TransformablePage<T>> list, T t10, int[] originalPageOffsets, int i10, int i11) {
        AbstractC9979u.m20294g(list, "<this>");
        AbstractC9979u.m20294g(originalPageOffsets, "originalPageOffsets");
        if (t10 == null) {
            return;
        }
        list.add(separatorPage(t10, originalPageOffsets, i10, i11));
    }

    public static final <T extends R, R> InterfaceC11594c insertEventSeparators(final InterfaceC11594c interfaceC11594c, TerminalSeparatorType terminalSeparatorType, InterfaceC9545q generator) {
        AbstractC9979u.m20294g(interfaceC11594c, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(generator, "generator");
        final SeparatorState separatorState = new SeparatorState(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(generator, null));
        return new InterfaceC11594c() { // from class: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1

            /* renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2 */
            public static final class C42872<T> implements InterfaceC11595d {
                final /* synthetic */ SeparatorState $separatorState$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", m26211f = "Separators.kt", m26212l = {51, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C42872.this.emit(null, this);
                    }
                }

                public C42872(InterfaceC11595d interfaceC11595d, SeparatorState separatorState) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.$separatorState$inlined = separatorState;
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
                        boolean r0 = r8 instanceof androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C42872.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1 r0 = (androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C42872.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1 r0 = new androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1
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
                        androidx.paging.SeparatorState r2 = r6.$separatorState$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r7 = r2.onEvent(r7, r0)
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C42872.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594c.collect(new C42872(interfaceC11595d, separatorState), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d1 -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R, T extends R> java.lang.Object insertInternalSeparators(androidx.paging.TransformablePage<T> r11, p181hd.InterfaceC9545q r12, vc.InterfaceC11588c<? super androidx.paging.TransformablePage<R>> r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.insertInternalSeparators(androidx.paging.TransformablePage, hd.q, vc.c):java.lang.Object");
    }

    public static final <T> TransformablePage<T> separatorPage(T separator, int[] originalPageOffsets, int i10, int i11) {
        AbstractC9979u.m20294g(separator, "separator");
        AbstractC9979u.m20294g(originalPageOffsets, "originalPageOffsets");
        return new TransformablePage<>(originalPageOffsets, AbstractC10976v.m24126e(separator), i10, AbstractC10976v.m24126e(Integer.valueOf(i11)));
    }

    public static final <R, T extends R> void addSeparatorPage(List<TransformablePage<R>> list, R r10, TransformablePage<T> transformablePage, TransformablePage<T> transformablePage2, int i10, int i11) {
        AbstractC9979u.m20294g(list, "<this>");
        int[] originalPageOffsets = transformablePage != null ? transformablePage.getOriginalPageOffsets() : null;
        int[] originalPageOffsets2 = transformablePage2 != null ? transformablePage2.getOriginalPageOffsets() : null;
        if (originalPageOffsets != null && originalPageOffsets2 != null) {
            originalPageOffsets = AbstractC10947g0.m23921W0(AbstractC10947g0.m23912N0(AbstractC10968r.m24094o0(AbstractC10964p.m23996K(originalPageOffsets, originalPageOffsets2))));
        } else if (originalPageOffsets == null && originalPageOffsets2 != null) {
            originalPageOffsets = originalPageOffsets2;
        } else if (originalPageOffsets == null || originalPageOffsets2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        addSeparatorPage(list, r10, originalPageOffsets, i10, i11);
    }
}
