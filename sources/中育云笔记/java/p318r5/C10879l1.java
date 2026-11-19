package p318r5;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import org.json.JSONException;

/* renamed from: r5.l1 */
/* loaded from: classes5.dex */
public class C10879l1 {

    /* renamed from: a */
    public String f26259a;

    /* renamed from: b */
    public C10869i0 f26260b;

    public C10879l1(String str) {
        this.f26259a = str;
        this.f26260b = new C10869i0(str);
        C10908z0.m23741e().m23745c(this.f26259a, this.f26260b);
    }

    /* renamed from: a */
    public void m23534a(int i10) {
        AbstractC10861f1.m23438j("hmsSdk", "onReport. TAG: " + this.f26259a + ", TYPE: " + i10);
        C10893s.m23604b().m23608d(this.f26259a, i10);
    }

    /* renamed from: b */
    public void m23535b(int i10, String str, LinkedHashMap linkedHashMap) throws JSONException {
        AbstractC10861f1.m23438j("hmsSdk", "onEvent. TAG: " + this.f26259a + ", TYPE: " + i10 + ", eventId : " + str);
        if (AbstractC10883n.m23563b(str) || !m23541h(i10)) {
            AbstractC10861f1.m23440l("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f26259a + ", TYPE: " + i10);
            return;
        }
        if (!AbstractC10883n.m23566e(linkedHashMap)) {
            AbstractC10861f1.m23440l("hmsSdk", "onEvent() parameter mapValue will be cleared.TAG: " + this.f26259a + ", TYPE: " + i10);
            linkedHashMap = null;
        }
        C10893s.m23604b().m23609e(this.f26259a, i10, str, linkedHashMap);
    }

    /* renamed from: c */
    public void m23536c(Context context, String str, String str2) throws JSONException {
        AbstractC10861f1.m23438j("hmsSdk", "onEvent(context). TAG: " + this.f26259a + ", eventId : " + str);
        if (context == null) {
            AbstractC10861f1.m23440l("hmsSdk", "context is null in onevent ");
            return;
        }
        if (AbstractC10883n.m23563b(str) || !m23541h(0)) {
            AbstractC10861f1.m23440l("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f26259a);
            return;
        }
        if (!AbstractC10883n.m23564c("value", str2, 65536)) {
            AbstractC10861f1.m23440l("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.f26259a);
            str2 = "";
        }
        C10893s.m23604b().m23610f(this.f26259a, context, str, str2);
    }

    /* renamed from: d */
    public void m23537d(C10906y0 c10906y0) {
        AbstractC10861f1.m23430b("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.f26259a);
        if (c10906y0 != null) {
            this.f26260b.m23481c(c10906y0);
        } else {
            AbstractC10861f1.m23440l("hmsSdk", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.f26260b.m23481c(null);
        }
    }

    /* renamed from: e */
    public final C10906y0 m23538e(int i10) {
        if (i10 == 0) {
            return this.f26260b.m23484f();
        }
        if (i10 == 1) {
            return this.f26260b.m23482d();
        }
        if (i10 == 2) {
            return this.f26260b.m23485g();
        }
        if (i10 != 3) {
            return null;
        }
        return this.f26260b.m23479a();
    }

    /* renamed from: f */
    public void m23539f(int i10, String str, LinkedHashMap linkedHashMap) throws JSONException {
        AbstractC10861f1.m23438j("hmsSdk", "onStreamEvent. TAG: " + this.f26259a + ", TYPE: " + i10 + ", eventId : " + str);
        if (AbstractC10883n.m23563b(str) || !m23541h(i10)) {
            AbstractC10861f1.m23440l("hmsSdk", "onStreamEvent() parameters check fail. Nothing will be recorded.TAG: " + this.f26259a + ", TYPE: " + i10);
            return;
        }
        if (!AbstractC10883n.m23566e(linkedHashMap)) {
            AbstractC10861f1.m23440l("hmsSdk", "onStreamEvent() parameter mapValue will be cleared.TAG: " + this.f26259a + ", TYPE: " + i10);
            linkedHashMap = null;
        }
        C10893s.m23604b().m23611h(this.f26259a, i10, str, linkedHashMap);
    }

    /* renamed from: g */
    public void m23540g(C10906y0 c10906y0) {
        AbstractC10861f1.m23430b("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.f26259a);
        if (c10906y0 != null) {
            this.f26260b.m23483e(c10906y0);
        } else {
            this.f26260b.m23483e(null);
            AbstractC10861f1.m23440l("hmsSdk", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    /* renamed from: h */
    public final boolean m23541h(int i10) {
        String str;
        if (i10 != 2) {
            C10906y0 c10906y0M23538e = m23538e(i10);
            if (c10906y0M23538e != null && !TextUtils.isEmpty(c10906y0M23538e.m23737x())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i10;
        } else {
            if ("_default_config_tag".equals(this.f26259a)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        AbstractC10861f1.m23440l("hmsSdk", str);
        return false;
    }
}
