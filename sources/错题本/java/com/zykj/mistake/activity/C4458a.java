package com.zykj.mistake.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.gson.C3842h;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import com.zykj.message.server.bean.UserInfo;
import com.zykj.mistake.main.C5043e;
import com.zykj.mistake.main.C5077u0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5100e;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.flow.C5946n0;
import okhttp3.C6338z;
import p016b0.C3065d;
import p029c5.AbstractC3228c;
import p029c5.C3226a;
import p030c6.AbstractC3234f;
import p032c8.C3240e;
import p044d5.AbstractC5424b;
import p044d5.InterfaceC5423a;
import p045d6.C5443s;
import p047d8.C5449a;
import p151r5.AbstractC6465b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.activity.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4458a implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f5874a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f5875b;

    public /* synthetic */ C4458a(MainActivity mainActivity, int i) {
        this.f5874a = i;
        this.f5875b = mainActivity;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        boolean z8;
        int i = 0;
        switch (this.f5874a) {
            case 0:
                MainActivity mainActivity = this.f5875b;
                ServerInfo it = (ServerInfo) obj;
                int i8 = MainActivity.f5784o;
                AbstractC5830k.m5330g(it, "it");
                String str = it.f5730c;
                String str2 = it.f5729b;
                if (it.f5728a == Status.LOGIN) {
                    C5088a c5088a = C5088a.f7986a;
                    AbstractC5830k.m5329f(str2, "getServerUrl(...)");
                    C5088a.f7987b = str2;
                    AbstractC5830k.m5329f(str, "getToken(...)");
                    C5088a.f7988c = str;
                    AbstractC5099d.m4456f(mainActivity, "SP_API_URL", str2);
                    AbstractC5099d.m4456f(mainActivity, "SP_API_TOKEN", str);
                    MessageClient.INSTANCES.getUserInfo(new C4458a(mainActivity, 2));
                    if (!mainActivity.isFinishing() && mainActivity.f5788d) {
                        try {
                            z8 = mainActivity.getPackageManager().getApplicationInfo("cn.com.techvision.appstore", 0).enabled;
                        } catch (PackageManager.NameNotFoundException e) {
                            e.printStackTrace();
                            z8 = false;
                        }
                        if (!z8) {
                            String str3 = C5088a.f7987b;
                            if (!AbstractC3228c.f1793a) {
                                AbstractC3228c.f1793a = true;
                                C6338z c6338z = AbstractC5424b.f8387a;
                                C3065d c3065d = new C3065d(1);
                                C6338z c6338z2 = AbstractC5424b.f8387a;
                                Objects.requireNonNull(c6338z2, "client == null");
                                c3065d.f1395a = c6338z2;
                                C3842h c3842h = new C3842h();
                                c3842h.f3006j = true;
                                ((ArrayList) c3065d.f1397c).add(new C5449a(c3842h.m2790a()));
                                ((ArrayList) c3065d.f1398d).add(new C3240e(i));
                                c3065d.m2008b(str3);
                                Object objM6155b = c3065d.m2009c().m6155b(InterfaceC5423a.class);
                                AbstractC5830k.m5329f(objM6155b, "create(...)");
                                ((InterfaceC5423a) objM6155b).m4814a("com.zykj.mistake", 10205, 0).m6079d(AbstractC3234f.f1799a).m6077a(AbstractC6465b.m6127a()).m6078b(new C3226a(mainActivity));
                            }
                        }
                        mainActivity.f5788d = false;
                    }
                }
                return C5443s.f8405a;
            case 1:
                MainActivity mainActivity2 = this.f5875b;
                InterfaceC6469a onResult = (InterfaceC6469a) obj;
                int i9 = MainActivity.f5784o;
                AbstractC5830k.m5330g(onResult, "onResult");
                mainActivity2.f5790f = onResult;
                mainActivity2.f5791g.launch(new Intent(mainActivity2, (Class<?>) MistakeCreateOrEditActivity.class));
                break;
            case 2:
                MainActivity mainActivity3 = this.f5875b;
                UserInfo userInfo = (UserInfo) obj;
                int i10 = MainActivity.f5784o;
                AbstractC5830k.m5330g(userInfo, "userInfo");
                String str4 = userInfo.f5735b + "_" + userInfo.f5736c;
                AbstractC5830k.m5330g(str4, "<set-?>");
                C5100e.f8038d = str4;
                Long l = userInfo.f5734a;
                AbstractC5830k.m5329f(l, "getId(...)");
                long jLongValue = l.longValue();
                SharedPreferences.Editor editorEdit = mainActivity3.getSharedPreferences("zykjMistake", 0).edit();
                editorEdit.putLong("SP_USER_ID", jLongValue);
                editorEdit.commit();
                MainShellViewModel mainShellViewModelM3910o = mainActivity3.m3910o();
                Long l3 = userInfo.f5734a;
                AbstractC5830k.m5329f(l3, "getId(...)");
                long jLongValue2 = l3.longValue();
                String str5 = "";
                String str6 = userInfo.f5737d;
                String string = str6 != null ? AbstractC5855p.m5403k0(str6).toString() : null;
                if (string == null) {
                    string = "";
                }
                if (AbstractC5855p.m5382P(string)) {
                    String str7 = userInfo.f5736c;
                    String string2 = str7 != null ? AbstractC5855p.m5403k0(str7).toString() : null;
                    if (string2 != null) {
                        str5 = string2;
                    }
                } else {
                    str5 = string;
                }
                synchronized (mainShellViewModelM3910o) {
                    C5043e c5043e = (C5043e) mainShellViewModelM3910o.f7813e.getValue();
                    if (c5043e == null || c5043e.f7904a != jLongValue2) {
                        int i11 = mainShellViewModelM3910o.f7818j + 1;
                        mainShellViewModelM3910o.f7818j = i11;
                        C5946n0 c5946n0 = mainShellViewModelM3910o.f7813e;
                        C5043e c5043e2 = new C5043e(jLongValue2, i11, str5);
                        c5946n0.getClass();
                        c5946n0.m5571k(null, c5043e2);
                    }
                }
                return C5443s.f8405a;
            default:
                MainActivity mainActivity4 = this.f5875b;
                CollectionDatePickerTarget target = (CollectionDatePickerTarget) obj;
                int i12 = MainActivity.f5784o;
                AbstractC5830k.m5330g(target, "target");
                mainActivity4.m3910o().m4354b(new C5077u0(target));
                break;
        }
        return C5443s.f8405a;
    }
}
