package com.zykj.policy.ext;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.zykj.policy.p105ui.PolicyCheckView;
import com.zykj.policy.p105ui.PolicyDialogFragment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import p150fb.C9217a;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10819z;

/* loaded from: classes6.dex */
public abstract class PolicyHelper {

    /* renamed from: a */
    public static final C8661a f19869a = new C8661a(null);

    public static final class Builder {

        /* renamed from: a */
        public final Context f19870a;

        /* renamed from: b */
        public C9217a f19871b;

        /* renamed from: c */
        public final InterfaceC10773d f19872c;

        public Builder(Context context) {
            AbstractC9979u.m20294g(context, "context");
            this.f19870a = context;
            this.f19871b = new C9217a();
            this.f19872c = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.policy.ext.PolicyHelper$Builder$policyDialogFragment$2
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PolicyDialogFragment invoke() {
                    return PolicyDialogFragment.f19884g.m16616a(this.f19873c.f19871b);
                }
            });
        }

        /* renamed from: b */
        public final PolicyDialogFragment m16590b() {
            return (PolicyDialogFragment) this.f19872c.getValue();
        }

        /* renamed from: c */
        public final Builder m16591c(String content) {
            AbstractC9979u.m20294g(content, "content");
            this.f19871b.m18130l(content);
            return this;
        }

        /* renamed from: d */
        public final Builder m16592d(InterfaceC9529a interfaceC9529a) {
            this.f19871b.m18131m(interfaceC9529a);
            return this;
        }

        /* renamed from: e */
        public final Builder m16593e(InterfaceC9529a interfaceC9529a) {
            this.f19871b.m18132n(interfaceC9529a);
            return this;
        }

        /* renamed from: f */
        public final Builder m16594f(String url) {
            AbstractC9979u.m20294g(url, "url");
            this.f19871b.m18134p(url);
            return this;
        }

        /* renamed from: g */
        public final Builder m16595g(String url) {
            AbstractC9979u.m20294g(url, "url");
            this.f19871b.m18136r(url);
            return this;
        }

        /* renamed from: h */
        public final void m16596h(PolicyCheckView policyCheckView) {
            AbstractC9979u.m20294g(policyCheckView, "policyCheckView");
            policyCheckView.setData(this.f19871b);
        }

        /* renamed from: i */
        public final void m16597i() {
            if (!PolicyHelper.f19869a.m16600b(this.f19870a)) {
                if (!(this.f19870a instanceof FragmentActivity)) {
                    throw new IllegalArgumentException("context must be FragmentActivity");
                }
                m16590b().show(((FragmentActivity) this.f19870a).getSupportFragmentManager(), UUID.randomUUID().toString());
            } else {
                InterfaceC9529a interfaceC9529aM18123e = this.f19871b.m18123e();
                if (interfaceC9529aM18123e != null) {
                    interfaceC9529aM18123e.invoke();
                }
            }
        }
    }

    /* renamed from: com.zykj.policy.ext.PolicyHelper$a */
    public static final class C8661a {
        public /* synthetic */ C8661a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m16599a(String url) throws IOException {
            AbstractC9979u.m20294g(url, "url");
            try {
                URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                AbstractC9979u.m20292e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
                if (httpURLConnection.getResponseCode() != 200) {
                    return "";
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                String strM23238K = "gb2312";
                Matcher matcher = Pattern.compile("charset=\\S*").matcher(httpURLConnection.getContentType());
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    AbstractC9979u.m20293f(strGroup, "matcher.group()");
                    strM23238K = AbstractC10819z.m23238K(strGroup, "charset=", "", false, 4, null);
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, strM23238K));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        inputStream.close();
                        String string = sb2.toString();
                        AbstractC9979u.m20293f(string, "sb.toString()");
                        return string;
                    }
                    sb2.append(line);
                    sb2.append(SignParameters.NEW_LINE);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        /* renamed from: b */
        public final boolean m16600b(Context context) {
            AbstractC9979u.m20294g(context, "context");
            return context.getSharedPreferences("SP_POLICY", 0).getBoolean("SP_POLICY_IS_SHOW", false);
        }

        /* renamed from: c */
        public final void m16601c(Context context, boolean z10) {
            AbstractC9979u.m20294g(context, "context");
            context.getSharedPreferences("SP_POLICY", 0).edit().putBoolean("SP_POLICY_IS_SHOW", z10).apply();
        }

        public C8661a() {
        }
    }
}
