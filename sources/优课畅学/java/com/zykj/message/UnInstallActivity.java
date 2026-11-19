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
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9133u;
import p005a4.C0024a;

/* loaded from: classes4.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a */
    public boolean f10406a;

    /* renamed from: b */
    public HashMap f10407b;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC7395a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC7395a f10408a = new ViewOnClickListenerC7395a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0024a.m54i().m55c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    public static final class RunnableC7396b implements Runnable {
        public RunnableC7396b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnInstallActivity.this.isFinishing()) {
                return;
            }
            UnInstallActivity.this.finish();
        }
    }

    /* renamed from: m */
    public View m9563m(int i10) {
        if (this.f10407b == null) {
            this.f10407b = new HashMap();
        }
        View view = (View) this.f10407b.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f10407b.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: n */
    public final void m9564n() {
        if (this.f10406a) {
            return;
        }
        this.f10406a = true;
        MessageClient messageClient = MessageClient.f10416a;
        Application application = getApplication();
        AbstractC9133u.m16129c(application, "application");
        messageClient.mo9577j(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC7396b(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C0024a.m54i().m55c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m9563m(R$id.tv_confirm)).setOnClickListener(ViewOnClickListenerC7395a.f10408a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MessageClient.f10416a.mo9574g()) {
            m9564n();
        }
    }
}
