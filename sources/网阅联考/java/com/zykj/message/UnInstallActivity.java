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
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p144y1.C4685a;

@Metadata(m5174d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m5175d2 = {"Lcom/zykj/message/UnInstallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onBackPressed", "j", "", C3335ai.f1705at, "Z", "reStart", "<init>", "()V", "messageclient_release"}, m5176k = 1, m5177mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f4233b;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC3671a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC3671a f4234a = new ViewOnClickListenerC3671a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C4685a.m6621i().m6622c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    public static final class RunnableC3672b implements Runnable {
        public RunnableC3672b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnInstallActivity.this.isFinishing()) {
                return;
            }
            UnInstallActivity.this.finish();
        }
    }

    /* renamed from: i */
    public View m4625i(int i4) {
        if (this.f4233b == null) {
            this.f4233b = new HashMap();
        }
        View view = (View) this.f4233b.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        this.f4233b.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: j */
    public final void m4626j() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f4242a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo4634d(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC3672b(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C4685a.m6621i().m6622c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m4625i(R$id.tv_confirm)).setOnClickListener(ViewOnClickListenerC3671a.f4234a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MessageClient.f4242a.mo4632b()) {
            m4626j();
        }
    }
}
