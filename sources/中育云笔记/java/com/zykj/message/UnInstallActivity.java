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
import kotlin.jvm.internal.AbstractC9979u;
import p048cb.C5415a;

/* loaded from: classes6.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: c */
    public boolean f19767c;

    /* renamed from: d */
    public HashMap f19768d;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC8604a implements View.OnClickListener {

        /* renamed from: c */
        public static final ViewOnClickListenerC8604a f19769c = new ViewOnClickListenerC8604a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5415a.m2883i().m2884c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    public static final class RunnableC8605b implements Runnable {
        public RunnableC8605b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnInstallActivity.this.isFinishing()) {
                return;
            }
            UnInstallActivity.this.finish();
        }
    }

    /* renamed from: J */
    public View m16533J(int i10) {
        if (this.f19768d == null) {
            this.f19768d = new HashMap();
        }
        View view = (View) this.f19768d.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f19768d.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: K */
    public final void m16534K() {
        if (this.f19767c) {
            return;
        }
        this.f19767c = true;
        MessageClient messageClient = MessageClient.f19777c;
        Application application = getApplication();
        AbstractC9979u.m20290c(application, "application");
        messageClient.mo16546m(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC8605b(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5415a.m2883i().m2884c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m16533J(R$id.tv_confirm)).setOnClickListener(ViewOnClickListenerC8604a.f19769c);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MessageClient.f19777c.mo16543f()) {
            m16534K();
        }
    }
}
