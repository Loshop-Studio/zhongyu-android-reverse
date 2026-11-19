package p215k2;

import com.zykj.board.EzyPageRouter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10947g0;

/* renamed from: k2.t */
/* loaded from: classes3.dex */
public final class C9802t {

    /* renamed from: a */
    public final String f22998a;

    /* renamed from: b */
    public final String f22999b;

    /* renamed from: c */
    public String f23000c;

    /* renamed from: d */
    public Integer f23001d;

    public C9802t(String absolutePath, String str) {
        AbstractC9979u.m20294g(absolutePath, "absolutePath");
        this.f22998a = absolutePath;
        this.f22999b = str;
    }

    /* renamed from: a */
    public final void m19809a(InterfaceC9529a successCallback, InterfaceC9529a failCallback) {
        AbstractC9979u.m20294g(successCallback, "successCallback");
        AbstractC9979u.m20294g(failCallback, "failCallback");
        if (m19813e()) {
            successCallback.invoke();
        } else {
            failCallback.invoke();
        }
    }

    /* renamed from: b */
    public final int m19810b() {
        if (new File(this.f22998a, "page_router.bin").exists()) {
            this.f23001d = 6;
            return 6;
        }
        this.f23001d = 5;
        return 5;
    }

    /* renamed from: c */
    public final String m19811c() throws IOException {
        if (m19810b() != 6) {
            String str = this.f22998a;
            this.f23000c = str;
            return str;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.f22998a, "page_router.bin"));
            EzyPageRouter.PageRouter pageRouterM15518o = EzyPageRouter.PageRouter.m15518o(fileInputStream);
            fileInputStream.close();
            String str2 = this.f22998a;
            List listM15521g = pageRouterM15518o.m15521g();
            AbstractC9979u.m20293f(listM15521g, "getPageInfoList(...)");
            String str3 = str2 + MqttTopic.TOPIC_LEVEL_SEPARATOR + ((EzyPageRouter.PageRouter.PageInfo) AbstractC10947g0.m23944m0(listM15521g)).getName();
            this.f23000c = str3;
            return str3;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f23000c = null;
            return null;
        }
    }

    /* renamed from: d */
    public final String m19812d() throws IOException {
        String strM19811c = this.f23000c;
        if (strM19811c == null) {
            strM19811c = m19811c();
        }
        if (strM19811c == null) {
            return null;
        }
        Integer num = this.f23001d;
        if (num != null && num.intValue() == 6) {
            return strM19811c + "/screenshot.png";
        }
        return strM19811c + "/thumbnail.jpg";
    }

    /* renamed from: e */
    public final boolean m19813e() throws IOException {
        String strM19812d = m19812d();
        if (strM19812d == null || !new File(strM19812d).exists()) {
            return false;
        }
        Integer num = this.f23001d;
        if ((num != null ? num.intValue() : m19810b()) == 6) {
            return true;
        }
        return new File(this.f22998a + "/actions.bin").exists();
    }
}
