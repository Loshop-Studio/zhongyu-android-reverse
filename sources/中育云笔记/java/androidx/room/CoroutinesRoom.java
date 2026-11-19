package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.CoroutinesRoom;
import androidx.room.coroutines.FlowUtil;
import androidx.sqlite.SQLiteConnection;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;
import p379vd.InterfaceC11594c;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object createFlow$lambda$1(Callable callable, SQLiteConnection it) {
            AbstractC9979u.m20294g(it, "it");
            return callable.call();
        }

        @InterfaceC10770a
        public final <R> InterfaceC11594c createFlow(RoomDatabase db2, boolean z10, String[] tableNames, final Callable<R> callable) {
            AbstractC9979u.m20294g(db2, "db");
            AbstractC9979u.m20294g(tableNames, "tableNames");
            AbstractC9979u.m20294g(callable, "callable");
            return FlowUtil.createFlow(db2, z10, tableNames, new InterfaceC9540l() { // from class: androidx.room.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return CoroutinesRoom.Companion.createFlow$lambda$1(callable, (SQLiteConnection) obj);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @p309qc.InterfaceC10770a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase r6, boolean r7, java.util.concurrent.Callable<R> r8, vc.InterfaceC11588c<? super R> r9) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r9 instanceof androidx.room.CoroutinesRoom$Companion$execute$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = (androidx.room.CoroutinesRoom$Companion$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.CoroutinesRoom$Companion$execute$1 r0 = new androidx.room.CoroutinesRoom$Companion$execute$1
                r0.<init>(r5, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3d
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.AbstractC9924b.m20071b(r9)
                return r9
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.L$0
                r8 = r6
                java.util.concurrent.Callable r8 = (java.util.concurrent.Callable) r8
                kotlin.AbstractC9924b.m20071b(r9)
                goto L5c
            L3d:
                kotlin.AbstractC9924b.m20071b(r9)
                boolean r9 = r6.isOpenInternal()
                if (r9 == 0) goto L51
                boolean r9 = r6.inTransaction()
                if (r9 == 0) goto L51
                java.lang.Object r6 = r8.call()
                return r6
            L51:
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r9 = androidx.room.util.DBUtil.getCoroutineContext(r6, r7, r0)
                if (r9 != r1) goto L5c
                goto L6e
            L5c:
                kotlin.coroutines.d r9 = (kotlin.coroutines.InterfaceC9945d) r9
                androidx.room.CoroutinesRoom$Companion$execute$2 r6 = new androidx.room.CoroutinesRoom$Companion$execute$2
                r7 = 0
                r6.<init>(r8, r7)
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = sd.AbstractC11109f.m24709g(r9, r6, r0)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom.Companion.execute(androidx.room.RoomDatabase, boolean, java.util.concurrent.Callable, vc.c):java.lang.Object");
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @p309qc.InterfaceC10770a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <R> java.lang.Object execute(androidx.room.RoomDatabase r17, boolean r18, android.os.CancellationSignal r19, java.util.concurrent.Callable<R> r20, vc.InterfaceC11588c<? super R> r21) throws java.lang.Throwable {
            /*
                r16 = this;
                r0 = r17
                r1 = r21
                boolean r2 = r1 instanceof androidx.room.CoroutinesRoom$Companion$execute$3
                if (r2 == 0) goto L19
                r2 = r1
                androidx.room.CoroutinesRoom$Companion$execute$3 r2 = (androidx.room.CoroutinesRoom$Companion$execute$3) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L19
                int r3 = r3 - r4
                r2.label = r3
                r3 = r16
                goto L20
            L19:
                androidx.room.CoroutinesRoom$Companion$execute$3 r2 = new androidx.room.CoroutinesRoom$Companion$execute$3
                r3 = r16
                r2.<init>(r3, r1)
            L20:
                java.lang.Object r1 = r2.result
                java.lang.Object r4 = p393wc.AbstractC11725a.m25952f()
                int r5 = r2.label
                r6 = 2
                r7 = 1
                if (r5 == 0) goto L61
                if (r5 == r7) goto L4c
                if (r5 != r6) goto L44
                java.lang.Object r0 = r2.L$3
                kotlin.coroutines.d r0 = (kotlin.coroutines.InterfaceC9945d) r0
                java.lang.Object r0 = r2.L$2
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r0 = r2.L$1
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                java.lang.Object r0 = r2.L$0
                androidx.room.RoomDatabase r0 = (androidx.room.RoomDatabase) r0
                kotlin.AbstractC9924b.m20071b(r1)
                return r1
            L44:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L4c:
                java.lang.Object r0 = r2.L$2
                java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                java.lang.Object r5 = r2.L$1
                android.os.CancellationSignal r5 = (android.os.CancellationSignal) r5
                java.lang.Object r8 = r2.L$0
                androidx.room.RoomDatabase r8 = (androidx.room.RoomDatabase) r8
                kotlin.AbstractC9924b.m20071b(r1)
                r15 = r5
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r15
                goto L8a
            L61:
                kotlin.AbstractC9924b.m20071b(r1)
                boolean r1 = r0.isOpenInternal()
                if (r1 == 0) goto L75
                boolean r1 = r0.inTransaction()
                if (r1 == 0) goto L75
                java.lang.Object r0 = r20.call()
                return r0
            L75:
                r2.L$0 = r0
                r1 = r19
                r2.L$1 = r1
                r5 = r20
                r2.L$2 = r5
                r2.label = r7
                r8 = r18
                java.lang.Object r8 = androidx.room.util.DBUtil.getCoroutineContext(r0, r8, r2)
                if (r8 != r4) goto L8a
                goto Lcb
            L8a:
                r10 = r8
                kotlin.coroutines.d r10 = (kotlin.coroutines.InterfaceC9945d) r10
                r2.L$0 = r0
                r2.L$1 = r1
                r2.L$2 = r5
                r2.L$3 = r10
                r2.label = r6
                kotlinx.coroutines.c r6 = new kotlinx.coroutines.c
                vc.c r8 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r2)
                r6.<init>(r8, r7)
                r6.m20503F()
                sd.i0 r9 = r0.getCoroutineScope()
                androidx.room.CoroutinesRoom$Companion$execute$4$job$1 r12 = new androidx.room.CoroutinesRoom$Companion$execute$4$job$1
                r0 = 0
                r12.<init>(r5, r6, r0)
                r13 = 2
                r14 = 0
                r11 = 0
                kotlinx.coroutines.g r0 = sd.AbstractC11109f.m24706d(r9, r10, r11, r12, r13, r14)
                androidx.room.CoroutinesRoom$Companion$execute$4$1 r5 = new androidx.room.CoroutinesRoom$Companion$execute$4$1
                r5.<init>()
                r6.mo20536u(r5)
                java.lang.Object r0 = r6.m20538x()
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                if (r0 != r1) goto Lc9
                p409xc.AbstractC11831f.m26221c(r2)
            Lc9:
                if (r0 != r4) goto Lcc
            Lcb:
                return r4
            Lcc:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom.Companion.execute(androidx.room.RoomDatabase, boolean, android.os.CancellationSignal, java.util.concurrent.Callable, vc.c):java.lang.Object");
        }
    }

    private CoroutinesRoom() {
    }

    @InterfaceC10770a
    public static final <R> InterfaceC11594c createFlow(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z10, strArr, callable);
    }

    @InterfaceC10770a
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z10, CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC11588c<? super R> interfaceC11588c) {
        return Companion.execute(roomDatabase, z10, cancellationSignal, callable, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z10, Callable<R> callable, InterfaceC11588c<? super R> interfaceC11588c) {
        return Companion.execute(roomDatabase, z10, callable, interfaceC11588c);
    }
}
