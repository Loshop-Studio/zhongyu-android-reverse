package com.zykj.policy.ext;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.zykj.policy.p064ui.PolicyCheckView;
import com.zykj.policy.p064ui.PolicyDialogFragment;
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
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p123h7.InterfaceC8724d;
import p142j4.C9013a;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public abstract class PolicyHelper {

    /* renamed from: a */
    public static final C7427a f10567a = new C7427a(null);

    public static final class Builder {

        /* renamed from: a */
        public final Context f10568a;

        /* renamed from: b */
        public C9013a f10569b;

        /* renamed from: c */
        public final InterfaceC8724d f10570c;

        public Builder(Context context) {
            AbstractC9133u.m16133g(context, "context");
            this.f10568a = context;
            this.f10569b = new C9013a();
            this.f10570c = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.policy.ext.PolicyHelper$Builder$policyDialogFragment$2
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PolicyDialogFragment invoke() {
                    return PolicyDialogFragment.f10582d.m9751a(this.f10571a.f10569b);
                }
            });
        }

        /* renamed from: b */
        public final PolicyDialogFragment m9725b() {
            return (PolicyDialogFragment) this.f10570c.getValue();
        }

        /* renamed from: c */
        public final Builder m9726c(String content) {
            AbstractC9133u.m16133g(content, "content");
            this.f10569b.m15662l(content);
            return this;
        }

        /* renamed from: d */
        public final Builder m9727d(InterfaceC10559a interfaceC10559a) {
            this.f10569b.m15663m(interfaceC10559a);
            return this;
        }

        /* renamed from: e */
        public final Builder m9728e(InterfaceC10559a interfaceC10559a) {
            this.f10569b.m15664n(interfaceC10559a);
            return this;
        }

        /* renamed from: f */
        public final Builder m9729f(String url) {
            AbstractC9133u.m16133g(url, "url");
            this.f10569b.m15666p(url);
            return this;
        }

        /* renamed from: g */
        public final Builder m9730g(String url) {
            AbstractC9133u.m16133g(url, "url");
            this.f10569b.m15668r(url);
            return this;
        }

        /* renamed from: h */
        public final void m9731h(PolicyCheckView policyCheckView) {
            AbstractC9133u.m16133g(policyCheckView, "policyCheckView");
            policyCheckView.setData(this.f10569b);
        }

        /* renamed from: i */
        public final void m9732i() {
            if (!PolicyHelper.f10567a.m9735b(this.f10568a)) {
                if (!(this.f10568a instanceof FragmentActivity)) {
                    throw new IllegalArgumentException("context must be FragmentActivity");
                }
                m9725b().show(((FragmentActivity) this.f10568a).getSupportFragmentManager(), UUID.randomUUID().toString());
            } else {
                InterfaceC10559a interfaceC10559aM15655e = this.f10569b.m15655e();
                if (interfaceC10559aM15655e != null) {
                    interfaceC10559aM15655e.invoke();
                }
            }
        }
    }

    /* renamed from: com.zykj.policy.ext.PolicyHelper$a */
    public static final class C7427a {
        public /* synthetic */ C7427a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final String m9734a(String url) throws IOException {
            AbstractC9133u.m16133g(url, "url");
            try {
                URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                AbstractC9133u.m16131e(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                if (httpURLConnection.getResponseCode() != 200) {
                    return "";
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                String strM14101I = "gb2312";
                Matcher matcher = Pattern.compile("charset=\\S*").matcher(httpURLConnection.getContentType());
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    AbstractC9133u.m16132f(strGroup, "matcher.group()");
                    strM14101I = AbstractC8687z.m14101I(strGroup, "charset=", "", false, 4, null);
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, strM14101I));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        inputStream.close();
                        String string = sb.toString();
                        AbstractC9133u.m16132f(string, "sb.toString()");
                        return string;
                    }
                    sb.append(line);
                    sb.append(SignParameters.NEW_LINE);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        /* renamed from: b */
        public final boolean m9735b(Context context) {
            AbstractC9133u.m16133g(context, "context");
            return context.getSharedPreferences("SP_POLICY", 0).getBoolean("SP_POLICY_IS_SHOW", false);
        }

        /* renamed from: c */
        public final void m9736c(Context context, boolean z10) {
            AbstractC9133u.m16133g(context, "context");
            context.getSharedPreferences("SP_POLICY", 0).edit().putBoolean("SP_POLICY_IS_SHOW", z10).apply();
        }

        public C7427a() {
        }
    }
}
