package com.zykj.policy.ext;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.zykj.policy.p037ui.PolicyCheckView;
import com.zykj.policy.p037ui.PolicyDialogFragment;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p115n4.C7466a;

/* loaded from: classes4.dex */
public abstract class PolicyHelper {

    /* renamed from: a */
    public static final C6203a f7435a = new C6203a(null);

    public static final class Builder {

        /* renamed from: a */
        public final Context f7436a;

        /* renamed from: b */
        public C7466a f7437b;

        /* renamed from: c */
        public final Lazy f7438c;

        public Builder(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f7436a = context;
            this.f7437b = new C7466a();
            this.f7438c = LazyKt.lazy(new Function0<PolicyDialogFragment>() { // from class: com.zykj.policy.ext.PolicyHelper$Builder$policyDialogFragment$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PolicyDialogFragment invoke() {
                    return PolicyDialogFragment.INSTANCE.m6262a(this.f7439a.f7437b);
                }
            });
        }

        /* renamed from: b */
        public final PolicyDialogFragment m6237b() {
            return (PolicyDialogFragment) this.f7438c.getValue();
        }

        /* renamed from: c */
        public final Builder m6238c(String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.f7437b.m8536l(content);
            return this;
        }

        /* renamed from: d */
        public final Builder m6239d(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f7437b.m8538n(url);
            return this;
        }

        /* renamed from: e */
        public final Builder m6240e(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f7437b.m8540p(url);
            return this;
        }

        /* renamed from: f */
        public final void m6241f(PolicyCheckView policyCheckView) {
            Intrinsics.checkNotNullParameter(policyCheckView, "policyCheckView");
            policyCheckView.setData(this.f7437b);
        }

        /* renamed from: g */
        public final void m6242g() {
            if (!PolicyHelper.f7435a.m6245b(this.f7436a)) {
                if (!(this.f7436a instanceof FragmentActivity)) {
                    throw new IllegalArgumentException("context must be FragmentActivity");
                }
                m6237b().show(((FragmentActivity) this.f7436a).getSupportFragmentManager(), UUID.randomUUID().toString());
            } else {
                Function0 function0M8529e = this.f7437b.m8529e();
                if (function0M8529e != null) {
                    function0M8529e.invoke();
                }
            }
        }
    }

    /* renamed from: com.zykj.policy.ext.PolicyHelper$a */
    public static final class C6203a {
        public /* synthetic */ C6203a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m6244a(String url) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(5000);
                if (httpURLConnection.getResponseCode() != 200) {
                    return "";
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                String strReplace$default = "gb2312";
                Matcher matcher = Pattern.compile("charset=\\S*").matcher(httpURLConnection.getContentType());
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group()");
                    strReplace$default = StringsKt.replace$default(strGroup, "charset=", "", false, 4, (Object) null);
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, strReplace$default));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        inputStream.close();
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
                        return string;
                    }
                    sb.append(line);
                    sb.append(SignParameters.NEW_LINE);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                return "";
            }
        }

        /* renamed from: b */
        public final boolean m6245b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getSharedPreferences("SP_POLICY", 0).getBoolean("SP_POLICY_IS_SHOW", false);
        }

        /* renamed from: c */
        public final void m6246c(Context context, boolean z6) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.getSharedPreferences("SP_POLICY", 0).edit().putBoolean("SP_POLICY_IS_SHOW", z6).apply();
        }

        public C6203a() {
        }
    }
}
