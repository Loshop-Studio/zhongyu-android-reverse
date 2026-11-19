package com.zykj.policy.p064ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.policy.databinding.PolicyActivityWebviewBinding;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p064ui.PolicyDetailActivity;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p153k4.AbstractC9055b;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class PolicyDetailActivity extends AppCompatActivity {

    /* renamed from: c */
    public static final C7428a f10576c = new C7428a(null);

    /* renamed from: a */
    public final InterfaceC8724d f10577a = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyDetailActivity$executor$2
        @Override // p300x7.InterfaceC10559a
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    /* renamed from: b */
    public final InterfaceC8724d f10578b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: com.zykj.policy.ui.PolicyDetailActivity$binding$2
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyActivityWebviewBinding invoke() {
            return PolicyActivityWebviewBinding.m9717c(this.f10579a.getLayoutInflater());
        }
    });

    /* renamed from: com.zykj.policy.ui.PolicyDetailActivity$a */
    public static final class C7428a {
        public /* synthetic */ C7428a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final void m9744a(Context context, String url) {
            AbstractC9133u.m16133g(context, "context");
            AbstractC9133u.m16133g(url, "url");
            context.startActivity(new Intent(context, (Class<?>) PolicyDetailActivity.class).putExtra("URL", url));
        }

        public C7428a() {
        }
    }

    /* renamed from: r */
    public static final void m9739r(String url, final PolicyDetailActivity this$0) throws IOException {
        AbstractC9133u.m16133g(url, "$url");
        AbstractC9133u.m16133g(this$0, "this$0");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String strM9734a = PolicyHelper.f10567a.m9734a(url);
        ref$ObjectRef.f17473a = strM9734a;
        try {
            String strSubstring = strM9734a.substring(AbstractC8661c0.m13991f0(strM9734a, "<body", 0, false, 6, null), AbstractC8661c0.m13991f0((CharSequence) ref$ObjectRef.f17473a, "/body>", 0, false, 6, null) + 1);
            AbstractC9133u.m16132f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ref$ObjectRef.f17473a = AbstractC8687z.m14101I(AbstractC8687z.m14101I(strSubstring, "<h3", "<p", false, 4, null), "</h3>", "</p>", false, 4, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this$0.runOnUiThread(new Runnable() { // from class: l4.c
            @Override // java.lang.Runnable
            public final void run() {
                PolicyDetailActivity.m9740s(this.f18242a, ref$ObjectRef);
            }
        });
    }

    /* renamed from: s */
    public static final void m9740s(PolicyDetailActivity this$0, Ref$ObjectRef html) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(html, "$html");
        if (this$0.isFinishing() || this$0.isDestroyed()) {
            return;
        }
        this$0.m9741o().f10561c.setText(Html.fromHtml((String) html.f17473a));
    }

    /* renamed from: o */
    public final PolicyActivityWebviewBinding m9741o() {
        return (PolicyActivityWebviewBinding) this.f10578b.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m9741o().getRoot());
        ImageView imageView = m9741o().f10560b;
        AbstractC9133u.m16132f(imageView, "binding.ivBack");
        AbstractC9055b.m15859e(imageView, new InterfaceC10570l() { // from class: com.zykj.policy.ui.PolicyDetailActivity.onCreate.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C8736p.f16368a;
            }

            public final void invoke(View it) {
                AbstractC9133u.m16133g(it, "it");
                PolicyDetailActivity.this.finish();
            }
        });
        String stringExtra = getIntent().getStringExtra("URL");
        if (stringExtra != null) {
            m9743q(stringExtra);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m9742p().shutdown();
    }

    /* renamed from: p */
    public final ExecutorService m9742p() {
        return (ExecutorService) this.f10577a.getValue();
    }

    /* renamed from: q */
    public final void m9743q(final String str) {
        m9742p().submit(new Runnable() { // from class: l4.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                PolicyDetailActivity.m9739r(str, this);
            }
        });
    }
}
