package p177m5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p132i5.C8758a;
import p143j5.C9015b;
import p143j5.C9020g;
import p166l5.C9251a;

/* renamed from: m5.g */
/* loaded from: classes5.dex */
public class C9318g implements InterfaceC9313b {

    /* renamed from: a */
    public final String f18365a = "https://playvideo.qcloud.com/getplayinfo/v4";

    /* renamed from: b */
    public Handler f18366b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public C9315d f18367c;

    /* renamed from: d */
    public InterfaceC9312a f18368d;

    /* renamed from: e */
    public String f18369e;

    /* renamed from: m5.g$a */
    public class a implements C9251a.d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9314c f18370a;

        /* renamed from: m5.g$a$a, reason: collision with other inner class name */
        public class RunnableC10810a implements Runnable {
            public RunnableC10810a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                InterfaceC9314c interfaceC9314c = aVar.f18370a;
                C9318g c9318g = C9318g.this;
                interfaceC9314c.mo12404b(c9318g, c9318g.f18367c);
            }
        }

        /* renamed from: m5.g$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC9314c interfaceC9314c = a.this.f18370a;
                if (interfaceC9314c != null) {
                    interfaceC9314c.mo12403a(-1, "http request error.");
                }
            }
        }

        public a(InterfaceC9314c interfaceC9314c) {
            this.f18370a = interfaceC9314c;
        }

        @Override // p166l5.C9251a.d
        /* renamed from: a */
        public void mo16954a() {
            C9318g.this.m17148o(new b());
        }

        @Override // p166l5.C9251a.d
        /* renamed from: b */
        public void mo16955b(String str) {
            if (C9318g.this.m17147n(str, this.f18370a)) {
                C9318g.this.m17148o(new RunnableC10810a());
            }
        }
    }

    /* renamed from: m5.g$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9314c f18374a;

        public b(InterfaceC9314c interfaceC9314c) {
            this.f18374a = interfaceC9314c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18374a.mo12403a(-1, "request return error!");
        }
    }

    /* renamed from: m5.g$c */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9314c f18376a;

        /* renamed from: b */
        public final /* synthetic */ int f18377b;

        /* renamed from: c */
        public final /* synthetic */ String f18378c;

        public c(InterfaceC9314c interfaceC9314c, int i10, String str) {
            this.f18376a = interfaceC9314c;
            this.f18377b = i10;
            this.f18378c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18376a.mo12403a(this.f18377b, this.f18378c);
        }
    }

    public C9318g(C9315d c9315d) {
        this.f18367c = c9315d;
    }

    /* renamed from: k */
    public static String m17145k(C9315d c9315d) {
        C8758a c8758a = c9315d.f18344c;
        if (c8758a == null || TextUtils.isEmpty(c8758a.f16421b)) {
            return null;
        }
        return c9315d.f18344c.f16421b;
    }

    /* renamed from: m */
    private String m17146m() {
        String str = String.format("%s/%d/%s", "https://playvideo.qcloud.com/getplayinfo/v4", Integer.valueOf(this.f18367c.f18342a), this.f18367c.f18343b);
        String strM17149l = this.f18367c.f18344c != null ? m17149l(null, m17145k(this.f18367c), null) : null;
        if (!TextUtils.isEmpty(strM17149l)) {
            str = str + "?" + strM17149l;
        }
        TXCLog.m4989d("TCPlayInfoProtocolV4", "request url: " + str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public boolean m17147n(String str, InterfaceC9314c interfaceC9314c) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            TXCLog.m4991e("TCPlayInfoProtocolV4", "parseJson err, content is empty!");
            m17148o(new b(interfaceC9314c));
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("code");
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("warning");
            this.f18369e = jSONObject.optString("context");
            TXCLog.m4994i("TCPlayInfoProtocolV4", "context : " + this.f18369e);
            TXCLog.m4994i("TCPlayInfoProtocolV4", "message: " + strOptString);
            TXCLog.m4994i("TCPlayInfoProtocolV4", "warning: " + strOptString2);
            if (i10 != 0) {
                m17148o(new c(interfaceC9314c, i10, strOptString));
                return false;
            }
            int i11 = jSONObject.getInt("version");
            if (i11 == 2) {
                this.f18368d = new C9316e(jSONObject);
                return true;
            }
            if (i11 != 4) {
                return true;
            }
            this.f18368d = new C9317f(jSONObject);
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            TXCLog.m4991e("TCPlayInfoProtocolV4", "parseJson err");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m17148o(Runnable runnable) {
        if (Looper.myLooper() == this.f18366b.getLooper()) {
            runnable.run();
        } else {
            this.f18366b.post(runnable);
        }
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: a */
    public String mo17121a() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17115a();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: b */
    public C9015b mo17122b() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17116b();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: c */
    public C9020g mo17123c() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17117c();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: d */
    public List mo17124d() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17118d();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: e */
    public List mo17125e() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17119e();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: f */
    public List mo17126f() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.mo17120f();
    }

    @Override // p177m5.InterfaceC9313b
    /* renamed from: g */
    public void mo17127g(InterfaceC9314c interfaceC9314c) {
        if (this.f18367c.f18343b == null) {
            return;
        }
        C9251a.m16951b().m16952a(m17146m(), new a(interfaceC9314c));
    }

    @Override // p177m5.InterfaceC9313b
    public String getName() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.getName();
    }

    @Override // p177m5.InterfaceC9313b
    public String getUrl() {
        InterfaceC9312a interfaceC9312a = this.f18368d;
        if (interfaceC9312a == null) {
            return null;
        }
        return interfaceC9312a.getUrl();
    }

    /* renamed from: l */
    public final String m17149l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("pcfg=" + str + "&");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append("psign=" + str2 + "&");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append("context=" + str3 + "&");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
