package p318r5;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.Calendar;
import java.util.UUID;

/* renamed from: r5.s0 */
/* loaded from: classes5.dex */
public class C10894s0 {

    /* renamed from: a */
    public long f26283a = 1800000;

    /* renamed from: b */
    public volatile boolean f26284b = false;

    /* renamed from: c */
    public a f26285c = null;

    /* renamed from: r5.s0$a */
    public class a {

        /* renamed from: a */
        public String f26286a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b */
        public boolean f26287b;

        /* renamed from: c */
        public long f26288c;

        public a(long j10) {
            this.f26286a += BundleUtil.UNDERLINE_TAG + j10;
            this.f26288c = j10;
            this.f26287b = true;
            C10894s0.this.f26284b = false;
        }

        /* renamed from: a */
        public void m23618a(long j10) {
            if (C10894s0.this.f26284b) {
                C10894s0.this.f26284b = false;
                m23620c(j10);
            } else if (m23621d(this.f26288c, j10) || m23619b(this.f26288c, j10)) {
                m23620c(j10);
            } else {
                this.f26288c = j10;
                this.f26287b = false;
            }
        }

        /* renamed from: b */
        public final boolean m23619b(long j10, long j11) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        /* renamed from: c */
        public final void m23620c(long j10) {
            AbstractC10861f1.m23436h("hmsSdk", "getNewSession() session is flush!");
            String string = UUID.randomUUID().toString();
            this.f26286a = string;
            this.f26286a = string.replace("-", "");
            this.f26286a += BundleUtil.UNDERLINE_TAG + j10;
            this.f26288c = j10;
            this.f26287b = true;
        }

        /* renamed from: d */
        public final boolean m23621d(long j10, long j11) {
            return j11 - j10 >= C10894s0.this.f26283a;
        }
    }

    /* renamed from: a */
    public String m23615a() {
        a aVar = this.f26285c;
        if (aVar != null) {
            return aVar.f26286a;
        }
        AbstractC10861f1.m23441m("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* renamed from: b */
    public void m23616b(long j10) {
        a aVar = this.f26285c;
        if (aVar != null) {
            aVar.m23618a(j10);
        } else {
            AbstractC10861f1.m23436h("hmsSdk", "Session is first flush");
            this.f26285c = new a(j10);
        }
    }

    /* renamed from: f */
    public boolean m23617f() {
        a aVar = this.f26285c;
        if (aVar != null) {
            return aVar.f26287b;
        }
        AbstractC10861f1.m23441m("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
