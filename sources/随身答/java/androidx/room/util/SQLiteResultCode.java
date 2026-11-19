package androidx.room.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m13413d2 = {"Landroidx/room/util/SQLiteResultCode;", "", "<init>", "()V", "SQLITE_ERROR", "", "SQLITE_BUSY", "SQLITE_MISUSE", "room-runtime_release"}, m13414k = 1, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SQLiteResultCode {
    public static final SQLiteResultCode INSTANCE = new SQLiteResultCode();
    public static final int SQLITE_BUSY = 5;
    public static final int SQLITE_ERROR = 1;
    public static final int SQLITE_MISUSE = 21;

    private SQLiteResultCode() {
    }
}
