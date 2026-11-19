package androidx.room.paging;

import androidx.room.RoomRawQuery;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public /* synthetic */ class LimitOffsetPagingSource$implementation$1 extends FunctionReferenceImpl implements InterfaceC10575q {
    public LimitOffsetPagingSource$implementation$1(Object obj) {
        super(3, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(RoomRawQuery roomRawQuery, int i10, InterfaceC9324c<? super List<? extends Value>> interfaceC9324c) {
        return ((LimitOffsetPagingSource) this.receiver).convertRows(roomRawQuery, i10, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((RoomRawQuery) obj, ((Number) obj2).intValue(), (InterfaceC9324c) obj3);
    }
}
