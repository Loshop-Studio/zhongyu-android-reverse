package p106j2;

import android.content.Context;
import com.zykj.subscriber.entity.resp.GetWhiteListResp;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p091g2.InterfaceC2646b;
import p096h2.AbstractC2658c;
import p096h2.C2656a;
import p096h2.InterfaceC2657b;

/* renamed from: j2.b */
/* loaded from: classes.dex */
public final class C2693b extends C2692a {

    /* renamed from: g */
    @NotNull
    public static final a f10650g = new a(null);

    /* renamed from: e */
    @NotNull
    private Context f10651e;

    /* renamed from: f */
    @NotNull
    private InterfaceC2646b f10652f;

    /* renamed from: j2.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    /* renamed from: j2.b$b */
    public static final class b extends AbstractC2658c<GetWhiteListResp> {
        b() {
        }

        @Override // p096h2.AbstractC2658c
        /* renamed from: a */
        public void mo8928a(@Nullable String str) {
            InterfaceC2646b interfaceC2646bM9010e = C2693b.this.m9010e();
            if (str == null) {
                str = "";
            }
            interfaceC2646bM9010e.mo8087a(str);
        }

        @Override // p096h2.AbstractC2658c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo8929b(@NotNull GetWhiteListResp resp) {
            C2769l.m9241e(resp, "resp");
            C2693b.this.m9010e().mo8088c(resp.getResult());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693b(@NotNull Context context, @NotNull InterfaceC2646b iMainView) {
        super(context, iMainView);
        C2769l.m9241e(context, "context");
        C2769l.m9241e(iMainView, "iMainView");
        this.f10651e = context;
        this.f10652f = iMainView;
    }

    @NotNull
    /* renamed from: e */
    public final InterfaceC2646b m9010e() {
        return this.f10652f;
    }

    /* renamed from: f */
    public final void m9011f() {
        m9008d(((InterfaceC2657b) C2656a.m8917e(C2656a.f10552a, InterfaceC2657b.class, null, null, 6, null)).m8927a(), new b());
    }
}
