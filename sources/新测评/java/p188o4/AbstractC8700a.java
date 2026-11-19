package p188o4;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8700a {
    /* renamed from: a */
    public final AbstractC8704e m14306a(EzyCommand.CommandSource.CommandInfo command, long j10) {
        Intrinsics.checkNotNullParameter(command, "command");
        return mo14308c(true, command, j10);
    }

    /* renamed from: b */
    public final void m14307b(EzyCommand.CommandSource.CommandInfo command) {
        Intrinsics.checkNotNullParameter(command, "command");
        mo14308c(false, command, 0L);
    }

    /* renamed from: c */
    public abstract AbstractC8704e mo14308c(boolean z9, EzyCommand.CommandSource.CommandInfo commandInfo, long j10);

    /* renamed from: d */
    public abstract void mo14309d(CommandInfoEntity commandInfoEntity);
}
