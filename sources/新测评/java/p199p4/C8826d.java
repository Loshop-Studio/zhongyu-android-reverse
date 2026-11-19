package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7345f;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p265v4.InterfaceC9668d;

/* renamed from: p4.d */
/* loaded from: classes4.dex */
public final class C8826d {

    /* renamed from: a */
    public final InterfaceC9668d f15020a;

    /* renamed from: b */
    public final InterfaceC7880c f15021b;

    public C8826d(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15020a = sourceLoader;
        this.f15021b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14788a(EzyCommand.CommandSource.CommandInfo.Config data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14789b(data);
        return null;
    }

    /* renamed from: b */
    public void m14789b(EzyCommand.CommandSource.CommandInfo.Config data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f15021b.mo13438c(data.m7105s());
        InterfaceC7880c interfaceC7880c = this.f15021b;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM7106t = data.m7106t();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM7106t, "data.lastBackgroundLineConfig");
        interfaceC7880c.mo13455t(AbstractC7345f.m11752c(backgroundLineConfigM7106t));
        this.f15021b.mo13440e();
    }
}
