package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.client.MessageClient;
import com.zykj.message.client.R$id;
import com.zykj.message.client.R$layout;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9133u;
import p005a4.C0024a;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p318z3.AbstractC10708a;

/* loaded from: classes4.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: a */
    public boolean f10410a;

    /* renamed from: b */
    public HashMap f10411b;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC7397a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC7397a f10412a = new ViewOnClickListenerC7397a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0024a.m54i().m55c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC7398b implements View.OnClickListener {
        public ViewOnClickListenerC7398b() {
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
    public static final class RunnableC7399c implements Runnable {
        public RunnableC7399c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnLoginActivity.this.isFinishing()) {
                return;
            }
            UnLoginActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m9566o() {
        if (this.f10410a) {
            return;
        }
        this.f10410a = true;
        MessageClient messageClient = MessageClient.f10416a;
        Application application = getApplication();
        AbstractC9133u.m16129c(application, "application");
        messageClient.mo9577j(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC7399c(), 500L);
    }

    /* renamed from: m */
    public View m9567m(int i10) {
        if (this.f10411b == null) {
            this.f10411b = new HashMap();
        }
        View view = (View) this.f10411b.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f10411b.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == -1) {
            m9566o();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C0024a.m54i().m55c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m9567m(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC7397a.f10412a);
        ((TextView) m9567m(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC7398b());
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
        MessageClient.f10416a.mo9569a(new InterfaceC10570l() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m9568a(ServerInfo it) {
                AbstractC9133u.m16134h(it, "it");
                Status statusM9596b = it.m9596b();
                if (statusM9596b == null) {
                    statusM9596b = Status.LOGOUT;
                }
                if (AbstractC10708a.f21253a[statusM9596b.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.m9566o();
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m9568a((ServerInfo) obj);
                return C8736p.f16368a;
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
