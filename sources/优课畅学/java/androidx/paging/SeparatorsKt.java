package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8807u;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class SeparatorsKt {

    @InterfaceC9539d(m17800c = "androidx.paging.SeparatorsKt", m17801f = "Separators.kt", m17802l = {82}, m17803m = "insertInternalSeparators")
    /* renamed from: androidx.paging.SeparatorsKt$insertInternalSeparators$1 */
    public static final class C43851<R, T extends R> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C43851(InterfaceC9324c<? super C43851> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SeparatorsKt.insertInternalSeparators(null, null, this);
        }
    }

    public static final <T> void addSeparatorPage(List<TransformablePage<T>> list, T t10, int[] originalPageOffsets, int i10, int i11) {
        AbstractC9133u.m16133g(list, "<this>");
        AbstractC9133u.m16133g(originalPageOffsets, "originalPageOffsets");
        if (t10 == null) {
            return;
        }
        list.add(separatorPage(t10, originalPageOffsets, i10, i11));
    }

    public static final <T extends R, R> InterfaceC9266c insertEventSeparators(final InterfaceC9266c interfaceC9266c, TerminalSeparatorType terminalSeparatorType, InterfaceC10575q generator) {
        AbstractC9133u.m16133g(interfaceC9266c, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(generator, "generator");
        final SeparatorState separatorState = new SeparatorState(terminalSeparatorType, new SeparatorsKt$insertEventSeparators$separatorState$1(generator, null));
        return new InterfaceC9266c() { // from class: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1

            /* renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2 */
            public static final class C43842<T> implements InterfaceC9267d {
                final /* synthetic */ SeparatorState $separatorState$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", m17801f = "Separators.kt", m17802l = {TbsListener.ErrorCode.EXCEED_INCR_UPDATE, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C43842.this.emit(null, this);
                    }
                }

                public C43842(InterfaceC9267d interfaceC9267d, SeparatorState separatorState) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$separatorState$inlined = separatorState;
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
                        boolean r0 = r8 instanceof androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C43842.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2$1 r0 = (androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C43842.AnonymousClass1) r0
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
                        h7.p r7 = p123h7.C8736p.f16368a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1.C43842.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266c.collect(new C43842(interfaceC9267d, separatorState), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
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
    public static final <R, T extends R> java.lang.Object insertInternalSeparators(androidx.paging.TransformablePage<T> r11, p300x7.InterfaceC10575q r12, p179m7.InterfaceC9324c<? super androidx.paging.TransformablePage<R>> r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SeparatorsKt.insertInternalSeparators(androidx.paging.TransformablePage, x7.q, m7.c):java.lang.Object");
    }

    public static final <T> TransformablePage<T> separatorPage(T separator, int[] originalPageOffsets, int i10, int i11) {
        AbstractC9133u.m16133g(separator, "separator");
        AbstractC9133u.m16133g(originalPageOffsets, "originalPageOffsets");
        return new TransformablePage<>(originalPageOffsets, AbstractC8807u.m14755e(separator), i10, AbstractC8807u.m14755e(Integer.valueOf(i11)));
    }

    public static final <R, T extends R> void addSeparatorPage(List<TransformablePage<R>> list, R r10, TransformablePage<T> transformablePage, TransformablePage<T> transformablePage2, int i10, int i11) {
        AbstractC9133u.m16133g(list, "<this>");
        int[] originalPageOffsets = transformablePage != null ? transformablePage.getOriginalPageOffsets() : null;
        int[] originalPageOffsets2 = transformablePage2 != null ? transformablePage2.getOriginalPageOffsets() : null;
        if (originalPageOffsets != null && originalPageOffsets2 != null) {
            originalPageOffsets = AbstractC8778f0.m14543T0(AbstractC8778f0.m14535L0(AbstractC8801r.m14725p0(AbstractC8797p.m14622L(originalPageOffsets, originalPageOffsets2))));
        } else if (originalPageOffsets == null && originalPageOffsets2 != null) {
            originalPageOffsets = originalPageOffsets2;
        } else if (originalPageOffsets == null || originalPageOffsets2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        addSeparatorPage(list, r10, originalPageOffsets, i10, i11);
    }
}
