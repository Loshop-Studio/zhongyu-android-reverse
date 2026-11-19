package androidx.room.util;

import androidx.room.RoomDatabase;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m17801f = "DBUtil.android.kt", m17802l = {TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH}, m17803m = "invokeSuspend")
/* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 */
/* loaded from: classes3.dex */
public final class C4652xcdc6cef6 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10570l $block$inlined;
    final /* synthetic */ RoomDatabase $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4652xcdc6cef6(InterfaceC9324c interfaceC9324c, RoomDatabase roomDatabase, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l) {
        super(2, interfaceC9324c);
        this.$db$inlined = roomDatabase;
        this.$isReadOnly$inlined = z10;
        this.$inTransaction$inlined = z11;
        this.$block$inlined = interfaceC10570l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new C4652xcdc6cef6(interfaceC9324c, this.$db$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined, this.$block$inlined);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
        return ((C4652xcdc6cef6) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        RoomDatabase roomDatabase = this.$db$inlined;
        boolean z10 = this.$isReadOnly$inlined;
        C4653x2db6401c c4653x2db6401c = new C4653x2db6401c(this.$inTransaction$inlined, z10, roomDatabase, null, this.$block$inlined);
        this.label = 1;
        Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z10, c4653x2db6401c, this);
        return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
    }
}
