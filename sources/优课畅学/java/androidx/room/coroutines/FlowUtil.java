package androidx.room.coroutines;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class FlowUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <R> InterfaceC9266c createFlow(final RoomDatabase db, final boolean z10, String[] tableNames, final InterfaceC10570l block) {
        AbstractC9133u.m16133g(db, "db");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        AbstractC9133u.m16133g(block, "block");
        final InterfaceC9266c interfaceC9266cM17022l = AbstractC9268e.m17022l(db.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tableNames, tableNames.length), true));
        return new InterfaceC9266c() { // from class: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1

            /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2 */
            public static final class C45522<T> implements InterfaceC9267d {
                final /* synthetic */ InterfaceC10570l $block$inlined;
                final /* synthetic */ RoomDatabase $db$inlined;
                final /* synthetic */ boolean $inTransaction$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", m17801f = "FlowBuilder.kt", m17802l = {TbsListener.ErrorCode.EXCEED_INCR_UPDATE, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C45522.this.emit(null, this);
                    }
                }

                public C45522(InterfaceC9267d interfaceC9267d, RoomDatabase roomDatabase, boolean z10, InterfaceC10570l interfaceC10570l) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$db$inlined = roomDatabase;
                    this.$inTransaction$inlined = z10;
                    this.$block$inlined = interfaceC10570l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
                
                    if (r8.emit(r9, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45522.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1 r0 = (androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45522.AnonymousClass1) r0
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
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.AbstractC9079b.m15926b(r9)
                        goto L63
                    L2c:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L34:
                        java.lang.Object r8 = r0.L$0
                        l8.d r8 = (p169l8.InterfaceC9267d) r8
                        kotlin.AbstractC9079b.m15926b(r9)
                        goto L57
                    L3c:
                        kotlin.AbstractC9079b.m15926b(r9)
                        l8.d r9 = r7.$this_unsafeFlow
                        java.util.Set r8 = (java.util.Set) r8
                        androidx.room.RoomDatabase r8 = r7.$db$inlined
                        boolean r2 = r7.$inTransaction$inlined
                        x7.l r5 = r7.$block$inlined
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
                        h7.p r8 = p123h7.C8736p.f16368a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.C45522.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9266cM17022l.collect(new C45522(interfaceC9267d, db, z10, block), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
    }
}
