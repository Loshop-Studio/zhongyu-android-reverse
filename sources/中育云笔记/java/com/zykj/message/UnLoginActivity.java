package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bb.AbstractC5183a;
import com.zykj.message.client.MessageClient;
import com.zykj.message.client.R$id;
import com.zykj.message.client.R$layout;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9979u;
import p048cb.C5415a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: c */
    public boolean f19771c;

    /* renamed from: d */
    public HashMap f19772d;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC8606a implements View.OnClickListener {

        /* renamed from: c */
        public static final ViewOnClickListenerC8606a f19773c = new ViewOnClickListenerC8606a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5415a.m2883i().m2884c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC8607b implements View.OnClickListener {
        public ViewOnClickListenerC8607b() {
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
    public static final class RunnableC8608c implements Runnable {
        public RunnableC8608c() {
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
    /* renamed from: L */
    public final void m16536L() {
        if (this.f19771c) {
            return;
        }
        this.f19771c = true;
        MessageClient messageClient = MessageClient.f19777c;
        Application application = getApplication();
        AbstractC9979u.m20290c(application, "application");
        messageClient.mo16546m(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC8608c(), 500L);
    }

    /* renamed from: J */
    public View m16537J(int i10) {
        if (this.f19772d == null) {
            this.f19772d = new HashMap();
        }
        View view = (View) this.f19772d.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f19772d.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 200 && i11 == -1) {
            m16536L();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5415a.m2883i().m2884c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m16537J(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC8606a.f19773c);
        ((TextView) m16537J(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC8607b());
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
        MessageClient.f19777c.mo16540c(new InterfaceC9540l() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m16538a(ServerInfo it) {
                AbstractC9979u.m20295h(it, "it");
                Status statusM16567b = it.m16567b();
                if (statusM16567b == null) {
                    statusM16567b = Status.LOGOUT;
                }
                if (AbstractC5183a.f3051a[statusM16567b.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.m16536L();
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16538a((ServerInfo) obj);
                return C10786q.f26013a;
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
