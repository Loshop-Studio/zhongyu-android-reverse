package p194ia;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p194ia.InterfaceC9618b;

/* renamed from: ia.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9617a {

    /* renamed from: b */
    public static final a f22149b = new a(null);

    /* renamed from: a */
    public final C9621e f22150a;

    /* renamed from: ia.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public AbstractC9617a(C9621e c9621e) {
        this.f22150a = c9621e;
    }

    /* renamed from: a */
    public final AudioInfoEntity m18852a(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, InterfaceC9529a buildCallBack) {
        AbstractC9979u.m20294g(commandEnum, "commandEnum");
        AbstractC9979u.m20294g(buildCallBack, "buildCallBack");
        C9621e c9621e = this.f22150a;
        boolean z10 = c9621e != null && c9621e.m18869e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC9979u.m20293f(byteArray, "buildCallBack().toByteArray()");
        return new AudioInfoEntity(0L, j10, j11, z10, commandEnum, byteArray);
    }

    /* renamed from: b */
    public final CommandInfoEntity m18853b(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, InterfaceC9529a buildCallBack) {
        AbstractC9979u.m20294g(commandEnum, "commandEnum");
        AbstractC9979u.m20294g(buildCallBack, "buildCallBack");
        C9621e c9621e = this.f22150a;
        boolean z10 = c9621e != null && c9621e.m18869e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        AbstractC9979u.m20293f(byteArray, "buildCallBack().toByteArray()");
        return new CommandInfoEntity(0L, j10, j11, z10, commandEnum, byteArray);
    }

    /* renamed from: c */
    public final long m18854c(long j10, long j11) {
        C9621e c9621e = this.f22150a;
        long jM18857a = (c9621e != null ? InterfaceC9618b.a.m18857a(c9621e, j11, false, 2, null) : 0L) - j10;
        if (jM18857a < 0) {
            return 0L;
        }
        return jM18857a;
    }

    /* renamed from: d */
    public final C9621e m18855d() {
        return this.f22150a;
    }
}
