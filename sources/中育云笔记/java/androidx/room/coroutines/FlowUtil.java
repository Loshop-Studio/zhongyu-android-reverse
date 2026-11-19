package androidx.room.coroutines;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class FlowUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> InterfaceC11594c createFlow(final RoomDatabase db2, final boolean z10, String[] tableNames, final InterfaceC9540l block) {
        AbstractC9979u.m20294g(db2, "db");
        AbstractC9979u.m20294g(tableNames, "tableNames");
        AbstractC9979u.m20294g(block, "block");
        final InterfaceC11594c interfaceC11594cM25561k = AbstractC11596e.m25561k(db2.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tableNames, tableNames.length), true));
        return new InterfaceC11594c() { // from class: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1

            /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2 */
            public static final class C45002<T> implements InterfaceC11595d {
                final /* synthetic */ InterfaceC9540l $block$inlined;
                final /* synthetic */ RoomDatabase $db$inlined;
                final /* synthetic */ boolean $inTransaction$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", m26211f = "FlowBuilder.kt", m26212l = {224, 223}, m26213m = "emit")
                /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C45002.this.emit(null, this);
                    }
                }

                public C45002(InterfaceC11595d interfaceC11595d, RoomDatabase roomDatabase, boolean z10, InterfaceC9540l interfaceC9540l) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.$db$inlined = roomDatabase;
                    this.$inTransaction$inlined = z10;
                    this.$block$inlined = interfaceC9540l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                
                    if (r8.emit(r9, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45002.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1 r0 = (androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45002.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1 r0 = new androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.AbstractC9924b.m20071b(r9)
                        goto L63
                    L2c:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L34:
                        java.lang.Object r8 = r0.L$0
                        vd.d r8 = (p379vd.InterfaceC11595d) r8
                        kotlin.AbstractC9924b.m20071b(r9)
                        goto L57
                    L3c:
                        kotlin.AbstractC9924b.m20071b(r9)
                        vd.d r9 = r7.$this_unsafeFlow
                        java.util.Set r8 = (java.util.Set) r8
                        androidx.room.RoomDatabase r8 = r7.$db$inlined
                        boolean r2 = r7.$inTransaction$inlined
                        hd.l r5 = r7.$block$inlined
                        r0.L$0 = r9
                        r0.label = r4
                        java.lang.Object r8 = androidx.room.util.DBUtil.performSuspending(r8, r4, r2, r5, r0)
                        if (r8 != r1) goto L54
                        goto L62
                    L54:
                        r6 = r9
                        r9 = r8
                        r8 = r6
                    L57:
                        r2 = 0
                        r0.L$0 = r2
                        r0.label = r3
                        java.lang.Object r8 = r8.emit(r9, r0)
                        if (r8 != r1) goto L63
                    L62:
                        return r1
                    L63:
                        qc.q r8 = p309qc.C10786q.f26013a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45002.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = interfaceC11594cM25561k.collect(new C45002(interfaceC11595d, db2, z10, block), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        };
    }
}
