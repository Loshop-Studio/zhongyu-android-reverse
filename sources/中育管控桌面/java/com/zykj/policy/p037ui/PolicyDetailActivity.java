package com.zykj.policy.p037ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.policy.databinding.PolicyActivityWebviewBinding;
import com.zykj.policy.ext.PolicyHelper;
import com.zykj.policy.p037ui.PolicyDetailActivity;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p122o4.AbstractC7521b;

@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rR#\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m7880d2 = {"Lcom/zykj/policy/ui/PolicyDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "url", "p", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "o", "()Ljava/util/concurrent/ExecutorService;", "executor", "Lcom/zykj/policy/databinding/PolicyActivityWebviewBinding;", "b", "n", "()Lcom/zykj/policy/databinding/PolicyActivityWebviewBinding;", "binding", "c", "policy_release"}, m7881k = 1, m7882mv = {1, 7, 1}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PolicyDetailActivity extends AppCompatActivity {

    /* renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    public final Lazy executor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.zykj.policy.ui.PolicyDetailActivity$executor$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy binding = LazyKt.lazy(new Function0<PolicyActivityWebviewBinding>() { // from class: com.zykj.policy.ui.PolicyDetailActivity$binding$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PolicyActivityWebviewBinding invoke() {
            return PolicyActivityWebviewBinding.m6229c(this.f7447a.getLayoutInflater());
        }
    });

    /* renamed from: com.zykj.policy.ui.PolicyDetailActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m6254a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            context.startActivity(new Intent(context, (Class<?>) PolicyDetailActivity.class).putExtra("URL", url));
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    /* renamed from: q */
    public static final void m6249q(String url, final PolicyDetailActivity this$0) throws IOException {
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? M6244a = PolicyHelper.f7435a.m6244a(url);
        objectRef.element = M6244a;
        try {
            String strSubstring = M6244a.substring(StringsKt.indexOf$default((CharSequence) M6244a, "<body", 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) objectRef.element, "/body>", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = StringsKt.replace$default(StringsKt.replace$default(strSubstring, "<h3", "<p", false, 4, (Object) null), "</h3>", "</p>", false, 4, (Object) null);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this$0.runOnUiThread(new Runnable() { // from class: p4.c
            @Override // java.lang.Runnable
            public final void run() {
                PolicyDetailActivity.m6250r(this.f10058a, objectRef);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public static final void m6250r(PolicyDetailActivity this$0, Ref.ObjectRef html) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(html, "$html");
        if (this$0.isFinishing() || this$0.isDestroyed()) {
            return;
        }
        this$0.m6251n().f7429c.setText(Html.fromHtml((String) html.element));
    }

    /* renamed from: n */
    public final PolicyActivityWebviewBinding m6251n() {
        return (PolicyActivityWebviewBinding) this.binding.getValue();
    }

    /* renamed from: o */
    public final ExecutorService m6252o() {
        return (ExecutorService) this.executor.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(m6251n().getRoot());
        ImageView imageView = m6251n().f7428b;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBack");
        AbstractC7521b.m8681e(imageView, new Function1<View, Unit>() { // from class: com.zykj.policy.ui.PolicyDetailActivity.onCreate.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PolicyDetailActivity.this.finish();
            }
        });
        String stringExtra = getIntent().getStringExtra("URL");
        if (stringExtra != null) {
            m6253p(stringExtra);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m6252o().shutdown();
    }

    /* renamed from: p */
    public final void m6253p(final String url) {
        m6252o().submit(new Runnable() { // from class: p4.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                PolicyDetailActivity.m6249q(url, this);
            }
        });
    }
}
