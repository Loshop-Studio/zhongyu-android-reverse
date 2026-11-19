package androidx.room.util;

import androidx.room.RoomDatabase;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m26211f = "DBUtil.android.kt", m26212l = {113}, m26213m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 */
/* loaded from: classes3.dex */
public final class C4600xcdc6cef6 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9540l $block$inlined;
    final /* synthetic */ RoomDatabase $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600xcdc6cef6(InterfaceC11588c interfaceC11588c, RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC9540l interfaceC9540l) {
        super(2, interfaceC11588c);
        this.$db$inlined = roomDatabase;
        this.$isReadOnly$inlined = z10;
        this.$inTransaction$inlined = z11;
        this.$block$inlined = interfaceC9540l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C4600xcdc6cef6(interfaceC11588c, this.$db$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined, this.$block$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        RoomDatabase roomDatabase = this.$db$inlined;
        boolean z10 = this.$isReadOnly$inlined;
        C4601x2db6401c c4601x2db6401c = new C4601x2db6401c(this.$inTransaction$inlined, z10, roomDatabase, null, this.$block$inlined);
        this.label = 1;
        Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z10, c4601x2db6401c, this);
        return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
        return ((C4600xcdc6cef6) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
