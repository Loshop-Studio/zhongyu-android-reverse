package androidx.compose.p006ui.input.nestedscroll;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.unit.Velocity;
import kotlin.coroutines.Continuation;

/* renamed from: androidx.compose.ui.input.nestedscroll.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1378a {
    /* renamed from: a */
    public static Object m559a(NestedScrollConnection nestedScrollConnection, long j4, long j5, Continuation continuation) {
        return m567i(nestedScrollConnection, j4, j5, continuation);
    }

    /* renamed from: b */
    public static long m560b(NestedScrollConnection nestedScrollConnection, long j4, long j5, int i4) {
        return Offset.INSTANCE.m8961getZeroF1C5BW0();
    }

    /* renamed from: c */
    public static Object m561c(NestedScrollConnection nestedScrollConnection, long j4, Continuation continuation) {
        return m568j(nestedScrollConnection, j4, continuation);
    }

    /* renamed from: d */
    public static long m562d(NestedScrollConnection nestedScrollConnection, long j4, int i4) {
        return Offset.INSTANCE.m8961getZeroF1C5BW0();
    }

    /* renamed from: i */
    public static /* synthetic */ Object m567i(NestedScrollConnection nestedScrollConnection, long j4, long j5, Continuation continuation) {
        return Velocity.m11741boximpl(Velocity.INSTANCE.m11761getZero9UxMQ8M());
    }

    /* renamed from: j */
    public static /* synthetic */ Object m568j(NestedScrollConnection nestedScrollConnection, long j4, Continuation continuation) {
        return Velocity.m11741boximpl(Velocity.INSTANCE.m11761getZero9UxMQ8M());
    }
}
