package p285x4;

import com.google.protobuf.Message;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p285x4.InterfaceC9849b;

/* renamed from: x4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9848a {

    /* renamed from: b */
    public static final a f17403b = new a(null);

    /* renamed from: a */
    public final C9852e f17404a;

    /* renamed from: x4.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public AbstractC9848a(C9852e c9852e) {
        this.f17404a = c9852e;
    }

    /* renamed from: a */
    public final AudioInfoEntity m16488a(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, Function0 buildCallBack) {
        Intrinsics.checkNotNullParameter(commandEnum, "commandEnum");
        Intrinsics.checkNotNullParameter(buildCallBack, "buildCallBack");
        C9852e c9852e = this.f17404a;
        boolean z9 = c9852e != null && c9852e.m16504e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buildCallBack().toByteArray()");
        return new AudioInfoEntity(0L, j10, j11, z9, commandEnum, byteArray);
    }

    /* renamed from: b */
    public final CommandInfoEntity m16489b(long j10, long j11, EzyCommandEnum.CommandEnum commandEnum, Function0 buildCallBack) {
        Intrinsics.checkNotNullParameter(commandEnum, "commandEnum");
        Intrinsics.checkNotNullParameter(buildCallBack, "buildCallBack");
        C9852e c9852e = this.f17404a;
        boolean z9 = c9852e != null && c9852e.m16504e();
        byte[] byteArray = ((Message) buildCallBack.invoke()).toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buildCallBack().toByteArray()");
        return new CommandInfoEntity(0L, j10, j11, z9, commandEnum, byteArray);
    }

    /* renamed from: c */
    public final long m16490c(long j10, long j11) {
        C9852e c9852e = this.f17404a;
        long jM16493a = (c9852e != null ? InterfaceC9849b.a.m16493a(c9852e, j11, false, 2, null) : 0L) - j10;
        if (jM16493a < 0) {
            return 0L;
        }
        return jM16493a;
    }

    /* renamed from: d */
    public final C9852e m16491d() {
        return this.f17404a;
    }
}
