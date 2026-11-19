package p073h4;

import android.content.ComponentCallbacks;
import android.util.Log;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.mistake.application.MistakeApplication;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.utils.AbstractC5099d;
import kotlin.jvm.internal.AbstractC5830k;
import p028c4.AbstractBinderC3225c;

/* renamed from: h4.c */
/* loaded from: classes3.dex */
public final class BinderC5627c extends AbstractBinderC3225c {

    /* renamed from: d */
    public final /* synthetic */ int f8758d;

    /* renamed from: e */
    public final /* synthetic */ ComponentCallbacks f8759e;

    public /* synthetic */ BinderC5627c(ComponentCallbacks componentCallbacks, int i) {
        this.f8758d = i;
        this.f8759e = componentCallbacks;
    }

    @Override // p043d4.InterfaceC5419a
    /* renamed from: b */
    public final void mo2170b(ServerInfo serverInfo) {
        int i = this.f8758d;
        ComponentCallbacks componentCallbacks = this.f8759e;
        switch (i) {
            case 0:
                MistakeApplication mistakeApplication = (MistakeApplication) componentCallbacks;
                Log.i("MistakeApplication", "serverInfoUpdate -> " + (serverInfo != null ? serverInfo.f5728a : null));
                if ((serverInfo != null ? serverInfo.f5728a : null) == Status.LOGIN) {
                    C5088a c5088a = C5088a.f7986a;
                    String str = serverInfo.f5729b;
                    String str2 = serverInfo.f5730c;
                    AbstractC5830k.m5329f(str, "getServerUrl(...)");
                    C5088a.f7987b = str;
                    AbstractC5830k.m5329f(str2, "getToken(...)");
                    C5088a.f7988c = str2;
                    AbstractC5099d.m4456f(mistakeApplication, "SP_API_URL", serverInfo.f5729b);
                    AbstractC5099d.m4456f(mistakeApplication, "SP_API_TOKEN", str2);
                    break;
                }
                break;
            default:
                if ((serverInfo != null ? serverInfo.f5728a : null) == Status.LOGIN) {
                    ((MistakeCollectionLegacyFragment) componentCallbacks).f7777d = true;
                    break;
                }
                break;
        }
    }
}
