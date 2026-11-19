package p144q4;

import android.content.Context;
import android.content.SharedPreferences;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MainPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5100e;
import kotlin.jvm.internal.AbstractC5830k;
import p021b5.C3189a;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: q4.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6418b implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f10529a;

    /* renamed from: b */
    public final /* synthetic */ MistakeCollectionLegacyFragment f10530b;

    public /* synthetic */ C6418b(MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment, int i) {
        this.f10529a = i;
        this.f10530b = mistakeCollectionLegacyFragment;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f10529a;
        C5443s c5443s = C5443s.f8405a;
        MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment = this.f10530b;
        int i8 = 0;
        switch (i) {
            case 0:
                ServerInfo it = (ServerInfo) obj;
                AbstractC5830k.m5330g(it, "it");
                String str = it.f5730c;
                String str2 = it.f5729b;
                if (it.f5728a == Status.LOGIN) {
                    C5088a c5088a = C5088a.f7986a;
                    AbstractC5830k.m5329f(str2, "getServerUrl(...)");
                    C5088a.f7987b = str2;
                    AbstractC5830k.m5329f(str, "getToken(...)");
                    C5088a.f7988c = str;
                    AbstractC5099d.m4456f(mistakeCollectionLegacyFragment.requireContext(), "SP_API_URL", str2);
                    AbstractC5099d.m4456f(mistakeCollectionLegacyFragment.requireContext(), "SP_API_TOKEN", str);
                    int i9 = 1;
                    MessageClient.INSTANCES.getUserInfo(new C6418b(mistakeCollectionLegacyFragment, i9));
                    if (mistakeCollectionLegacyFragment.f7777d) {
                        MainPresenter mainPresenter = (MainPresenter) mistakeCollectionLegacyFragment.m3966h();
                        mainPresenter.m3969a(C5088a.m4381b().m4398p(), new C3189a(mainPresenter, i9));
                        mistakeCollectionLegacyFragment.f7777d = false;
                        MainPresenter mainPresenter2 = (MainPresenter) mistakeCollectionLegacyFragment.m3966h();
                        mainPresenter2.m3970b(C5088a.m4381b().m4395m("com.zykj.mistake"), new C3189a(mainPresenter2, i8), false);
                        break;
                    }
                }
                break;
            default:
                UserInfo userInfo = (UserInfo) obj;
                AbstractC5830k.m5330g(userInfo, "userInfo");
                String str3 = userInfo.f5735b + "_" + userInfo.f5736c;
                AbstractC5830k.m5330g(str3, "<set-?>");
                C5100e.f8038d = str3;
                Context contextRequireContext = mistakeCollectionLegacyFragment.requireContext();
                Long l = userInfo.f5734a;
                AbstractC5830k.m5329f(l, "getId(...)");
                long jLongValue = l.longValue();
                SharedPreferences.Editor editorEdit = contextRequireContext.getSharedPreferences("zykjMistake", 0).edit();
                editorEdit.putLong("SP_USER_ID", jLongValue);
                editorEdit.commit();
                break;
        }
        return c5443s;
    }
}
