package p095e5;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7846a {
    /* renamed from: a */
    public final AbstractC7850e m12297a(EzyCommand.CommandSource.CommandInfo command, long j9) {
        Intrinsics.checkNotNullParameter(command, "command");
        return mo12299c(true, command, j9);
    }

    /* renamed from: b */
    public final void m12298b(EzyCommand.CommandSource.CommandInfo command) {
        Intrinsics.checkNotNullParameter(command, "command");
        mo12299c(false, command, 0L);
    }

    /* renamed from: c */
    public abstract AbstractC7850e mo12299c(boolean z9, EzyCommand.CommandSource.CommandInfo commandInfo, long j9);

    /* renamed from: d */
    public abstract void mo12300d(CommandInfoEntity commandInfoEntity);
}
