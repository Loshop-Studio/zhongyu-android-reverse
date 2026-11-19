package androidx.room.paging;

import androidx.room.RoomRawQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Value] */
@Metadata(m7881k = 3, m7882mv = {2, 0, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class LimitOffsetPagingSource$implementation$1<Value> extends FunctionReferenceImpl implements Function3<RoomRawQuery, Integer, Continuation<? super List<? extends Value>>, Object>, SuspendFunction {
    public LimitOffsetPagingSource$implementation$1(Object obj) {
        super(3, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(RoomRawQuery roomRawQuery, int i6, Continuation<? super List<? extends Value>> continuation) {
        return ((LimitOffsetPagingSource) this.receiver).convertRows(roomRawQuery, i6, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(RoomRawQuery roomRawQuery, Integer num, Object obj) {
        return invoke(roomRawQuery, num.intValue(), (Continuation) obj);
    }
}
