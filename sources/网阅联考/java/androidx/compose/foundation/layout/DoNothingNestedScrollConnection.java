package androidx.compose.foundation.layout;

import androidx.compose.p006ui.input.nestedscroll.AbstractC1378a;
import androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m5174d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5175d2 = {"Landroidx/compose/foundation/layout/DoNothingNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "()V", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class DoNothingNestedScrollConnection implements NestedScrollConnection {
    public static final DoNothingNestedScrollConnection INSTANCE = new DoNothingNestedScrollConnection();

    private DoNothingNestedScrollConnection() {
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo7212onPostFlingRZ2iAVY(long j4, long j5, Continuation continuation) {
        return AbstractC1378a.m559a(this, j4, j5, continuation);
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public /* synthetic */ long mo7213onPostScrollDzOQY0M(long j4, long j5, int i4) {
        return AbstractC1378a.m560b(this, j4, j5, i4);
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo7214onPreFlingQWom1Mo(long j4, Continuation continuation) {
        return AbstractC1378a.m561c(this, j4, continuation);
    }

    @Override // androidx.compose.p006ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo7215onPreScrollOzD1aCk(long j4, int i4) {
        return AbstractC1378a.m562d(this, j4, i4);
    }
}
