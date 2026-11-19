package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.umeng.analytics.pro.C3335ai;
import com.zykj.message.client.MessageClient;
import com.zykj.message.client.R$id;
import com.zykj.message.client.R$layout;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p140x1.AbstractC4663a;
import p144y1.C4685a;

@Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0014J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0002R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m5175d2 = {"Lcom/zykj/message/UnLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onRestart", "onStart", "onResume", "onPause", "onStop", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onBackPressed", "k", "", C3335ai.f1705at, "Z", "reStart", "<init>", "()V", "messageclient_release"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f4237b;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC3673a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC3673a f4238a = new ViewOnClickListenerC3673a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C4685a.m6621i().m6622c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC3674b implements View.OnClickListener {
        public ViewOnClickListenerC3674b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction("com.zykj.action.zykj.LOGIN");
            intent.setPackage("com.zykj.manage");
            UnLoginActivity.this.startActivityForResult(intent, 200);
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$c */
    public static final class RunnableC3675c implements Runnable {
        public RunnableC3675c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnLoginActivity.this.isFinishing()) {
                return;
            }
            UnLoginActivity.this.finish();
        }
    }

    /* renamed from: i */
    public View m4628i(int i4) {
        if (this.f4237b == null) {
            this.f4237b = new HashMap();
        }
        View view = (View) this.f4237b.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        this.f4237b.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: k */
    public final void m4629k() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f4242a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo4634d(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC3675c(), 500L);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == -1) {
            m4629k();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C4685a.m6621i().m6622c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m4628i(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC3673a.f4238a);
        ((TextView) m4628i(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC3674b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MessageClient.f4242a.mo4631a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m4630a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Status statusM4655d = it.m4655d();
                if (statusM4655d == null) {
                    statusM4655d = Status.LOGOUT;
                }
                if (AbstractC4663a.f5960a[statusM4655d.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.m4629k();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m4630a(serverInfo);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
