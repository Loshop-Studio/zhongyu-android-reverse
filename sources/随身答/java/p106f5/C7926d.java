package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9688g;

/* renamed from: f5.d */
/* loaded from: classes4.dex */
public final class C7926d {

    /* renamed from: a */
    public final InterfaceC8891e f13368a;

    /* renamed from: b */
    public final InterfaceC0039c f13369b;

    public C7926d(InterfaceC8891e sourceLoader, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13368a = sourceLoader;
        this.f13369b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12479a(EzyCommand.CommandSource.CommandInfo.Config data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        m12480b(data);
        return null;
    }

    /* renamed from: b */
    public void m12480b(EzyCommand.CommandSource.CommandInfo.Config data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13369b.mo200c(data.m8223v());
        InterfaceC0039c interfaceC0039c = this.f13369b;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM8224w = data.m8224w();
        Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM8224w, "data.lastBackgroundLineConfig");
        interfaceC0039c.mo215r(AbstractC9688g.m16173c(backgroundLineConfigM8224w));
        this.f13369b.mo202e();
    }
}
