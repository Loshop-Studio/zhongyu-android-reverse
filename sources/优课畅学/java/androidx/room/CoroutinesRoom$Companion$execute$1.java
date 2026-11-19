package androidx.room;

import androidx.room.CoroutinesRoom;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.room.CoroutinesRoom$Companion", m17801f = "CoroutinesRoom.android.kt", m17802l = {48, 49}, m17803m = "execute")
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$1<R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$1(CoroutinesRoom.Companion companion, InterfaceC9324c<? super CoroutinesRoom$Companion$execute$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, null, this);
    }
}
