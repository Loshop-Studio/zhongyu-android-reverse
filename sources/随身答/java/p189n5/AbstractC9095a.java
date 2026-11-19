package p189n5;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p189n5.InterfaceC9096b;

/* renamed from: n5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9095a {

    /* renamed from: b */
    public static final a f15320b = new a(null);

    /* renamed from: a */
    public final C9099e f15321a;

    /* renamed from: n5.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC9095a(C9099e c9099e) {
        this.f15321a = c9099e;
    }

    /* renamed from: a */
    public final AudioInfoEntity m14627a(long j9, long j10, EzyCommandEnum.CommandEnum commandEnum, Function0 buildCallBack) {
        Intrinsics.checkNotNullParameter(commandEnum, "commandEnum");
        Intrinsics.checkNotNullParameter(buildCallBack, "buildCallBack");
        C9099e c9099e = this.f15321a;
        boolean z9 = c9099e != null && c9099e.m14644e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buildCallBack().toByteArray()");
        return new AudioInfoEntity(0L, j9, j10, z9, commandEnum, byteArray);
    }

    /* renamed from: b */
    public final CommandInfoEntity m14628b(long j9, long j10, EzyCommandEnum.CommandEnum commandEnum, Function0 buildCallBack) {
        Intrinsics.checkNotNullParameter(commandEnum, "commandEnum");
        Intrinsics.checkNotNullParameter(buildCallBack, "buildCallBack");
        C9099e c9099e = this.f15321a;
        boolean z9 = c9099e != null && c9099e.m14644e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buildCallBack().toByteArray()");
        return new CommandInfoEntity(0L, j9, j10, z9, commandEnum, byteArray);
    }

    /* renamed from: c */
    public final long m14629c(long j9, long j10) {
        C9099e c9099e = this.f15321a;
        long jM14632a = (c9099e != null ? InterfaceC9096b.a.m14632a(c9099e, j10, false, 2, null) : 0L) - j9;
        if (jM14632a < 0) {
            return 0L;
        }
        return jM14632a;
    }

    /* renamed from: d */
    public final C9099e m14630d() {
        return this.f15321a;
    }
}
