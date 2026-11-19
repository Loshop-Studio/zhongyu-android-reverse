package com.zykj.policy.p105ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.policy.databinding.PolicyActivityWebviewBinding;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p105ui.PolicyDetailActivity;
import gb.AbstractC9286b;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

/* loaded from: classes6.dex */
public final class PolicyDetailActivity extends AppCompatActivity {

    /* renamed from: e */
    public static final C8662a f19878e = new C8662a(null);

    /* renamed from: c */
    public final InterfaceC10773d f19879c = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyDetailActivity$executor$2
        @Override // p181hd.InterfaceC9529a
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    /* renamed from: d */
    public final InterfaceC10773d f19880d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: com.zykj.policy.ui.PolicyDetailActivity$binding$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyActivityWebviewBinding invoke() {
            return PolicyActivityWebviewBinding.m16582c(this.f19881c.getLayoutInflater());
        }
    });

    /* renamed from: com.zykj.policy.ui.PolicyDetailActivity$a */
    public static final class C8662a {
        public /* synthetic */ C8662a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final void m16609a(Context context, String url) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(url, "url");
            context.startActivity(new Intent(context, (Class<?>) PolicyDetailActivity.class).putExtra("URL", url));
        }

        public C8662a() {
        }
    }

    /* renamed from: N */
    private final void m16604N(final String str) {
        m16608M().submit(new Runnable() { // from class: hb.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                PolicyDetailActivity.m16605O(str, this);
            }
        });
    }

    /* renamed from: O */
    public static final void m16605O(String url, final PolicyDetailActivity this$0) throws IOException {
        AbstractC9979u.m20294g(url, "$url");
        AbstractC9979u.m20294g(this$0, "this$0");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        String strM16599a = PolicyHelper.f19869a.m16599a(url);
        ref$ObjectRef.f23402c = strM16599a;
        try {
            String strSubstring = strM16599a.substring(AbstractC10793c0.m23130f0(strM16599a, "<body", 0, false, 6, null), AbstractC10793c0.m23130f0((CharSequence) ref$ObjectRef.f23402c, "/body>", 0, false, 6, null) + 1);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ref$ObjectRef.f23402c = AbstractC10819z.m23238K(AbstractC10819z.m23238K(strSubstring, "<h3", "<p", false, 4, null), "</h3>", "</p>", false, 4, null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this$0.runOnUiThread(new Runnable() { // from class: hb.c
            @Override // java.lang.Runnable
            public final void run() {
                PolicyDetailActivity.m16606P(this.f22054c, ref$ObjectRef);
            }
        });
    }

    /* renamed from: P */
    public static final void m16606P(PolicyDetailActivity this$0, Ref$ObjectRef html) {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(html, "$html");
        if (this$0.isFinishing() || this$0.isDestroyed()) {
            return;
        }
        this$0.m16607L().f19863e.setText(Html.fromHtml((String) html.f23402c));
    }

    /* renamed from: L */
    public final PolicyActivityWebviewBinding m16607L() {
        return (PolicyActivityWebviewBinding) this.f19880d.getValue();
    }

    /* renamed from: M */
    public final ExecutorService m16608M() {
        return (ExecutorService) this.f19879c.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m16607L().getRoot());
        ImageView imageView = m16607L().f19862d;
        AbstractC9979u.m20293f(imageView, "binding.ivBack");
        AbstractC9286b.m18309e(imageView, new InterfaceC9540l() { // from class: com.zykj.policy.ui.PolicyDetailActivity.onCreate.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C10786q.f26013a;
            }

            public final void invoke(View it) {
                AbstractC9979u.m20294g(it, "it");
                PolicyDetailActivity.this.finish();
            }
        });
        String stringExtra = getIntent().getStringExtra("URL");
        if (stringExtra != null) {
            m16604N(stringExtra);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m16608M().shutdown();
    }
}
