package androidx.room.paging;

import androidx.room.RoomRawQuery;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9545q;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public /* synthetic */ class LimitOffsetPagingSource$implementation$1 extends FunctionReferenceImpl implements InterfaceC9545q {
    public LimitOffsetPagingSource$implementation$1(Object obj) {
        super(3, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(RoomRawQuery roomRawQuery, int i10, InterfaceC11588c<? super List<? extends Value>> interfaceC11588c) {
        return ((LimitOffsetPagingSource) this.receiver).convertRows(roomRawQuery, i10, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((RoomRawQuery) obj, ((Number) obj2).intValue(), (InterfaceC11588c) obj3);
    }
}
