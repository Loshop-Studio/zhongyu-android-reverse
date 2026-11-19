package p437z9;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: z9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC12027a {
    /* renamed from: a */
    public final AbstractC12031e m26635a(EzyCommand.CommandSource.CommandInfo command, long j10) {
        AbstractC9979u.m20294g(command, "command");
        return mo255c(true, command, j10);
    }

    /* renamed from: b */
    public final void m26636b(EzyCommand.CommandSource.CommandInfo command) {
        AbstractC9979u.m20294g(command, "command");
        mo255c(false, command, 0L);
    }

    /* renamed from: c */
    public abstract AbstractC12031e mo255c(boolean z10, EzyCommand.CommandSource.CommandInfo commandInfo, long j10);

    /* renamed from: d */
    public abstract void mo256d(CommandInfoEntity commandInfoEntity);
}
