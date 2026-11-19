package p318r5;

import android.content.Context;

/* renamed from: r5.g */
/* loaded from: classes5.dex */
public class C10862g {

    /* renamed from: a */
    public C10906y0 f26222a;

    /* renamed from: b */
    public C10906y0 f26223b;

    /* renamed from: c */
    public Context f26224c;

    /* renamed from: d */
    public String f26225d;

    public C10862g(Context context) {
        if (context != null) {
            this.f26224c = context.getApplicationContext();
        }
        this.f26222a = new C10906y0();
        this.f26223b = new C10906y0();
    }

    /* renamed from: a */
    public C10862g m23442a(int i10, String str) {
        AbstractC10861f1.m23430b("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i10);
        if (!AbstractC10896t0.m23660d(str)) {
            str = "";
        }
        if (i10 == 0) {
            this.f26222a.m23722i(str);
            return this;
        }
        if (i10 != 1) {
            AbstractC10861f1.m23441m("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        }
        this.f26223b.m23722i(str);
        return this;
    }

    /* renamed from: b */
    public C10862g m23443b(String str) {
        AbstractC10861f1.m23430b("hmsSdk", "Builder.setAppID is execute");
        this.f26225d = str;
        return this;
    }

    /* renamed from: c */
    public C10862g m23444c(boolean z10) {
        AbstractC10861f1.m23430b("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f26222a.m23739z().m23379b(z10);
        this.f26223b.m23739z().m23379b(z10);
        return this;
    }

    /* renamed from: d */
    public void m23445d() {
        if (this.f26224c == null) {
            AbstractC10861f1.m23433e("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        AbstractC10861f1.m23430b("hmsSdk", "Builder.create() is execute.");
        C10879l1 c10879l1 = new C10879l1("_hms_config_tag");
        c10879l1.m23540g(new C10906y0(this.f26222a));
        c10879l1.m23537d(new C10906y0(this.f26223b));
        C10881m0.m23547a().m23549b(this.f26224c);
        C10893s.m23604b().m23607c(this.f26224c);
        C10904x0.m23699d().m23700a(c10879l1);
        C10881m0.m23547a().m23550c(this.f26225d);
    }

    /* renamed from: e */
    public C10862g m23446e(boolean z10) {
        AbstractC10861f1.m23430b("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f26222a.m23739z().m23381d(z10);
        this.f26223b.m23739z().m23381d(z10);
        return this;
    }

    /* renamed from: f */
    public C10862g m23447f(boolean z10) {
        AbstractC10861f1.m23430b("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f26222a.m23739z().m23383f(z10);
        this.f26223b.m23739z().m23383f(z10);
        return this;
    }
}
