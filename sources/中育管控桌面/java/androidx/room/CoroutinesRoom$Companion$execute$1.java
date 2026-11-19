package androidx.room;

import androidx.room.CoroutinesRoom;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 0, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "androidx.room.CoroutinesRoom$Companion", m7918f = "CoroutinesRoom.android.kt", m7919i = {0}, m7920l = {48, 49}, m7921m = "execute", m7922n = {"callable"}, m7923s = {"L$0"})
/* loaded from: classes3.dex */
public final class CoroutinesRoom$Companion$execute$1<R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$1(CoroutinesRoom.Companion companion, Continuation<? super CoroutinesRoom$Companion$execute$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, null, this);
    }
}
