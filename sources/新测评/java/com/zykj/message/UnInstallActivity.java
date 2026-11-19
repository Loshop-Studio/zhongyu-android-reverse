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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p158l7.C8514a;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m13558d2 = {"Lcom/zykj/message/UnInstallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "n", "", "a", "Z", "reStart", "messageclient_release"}, m13559k = 1, m13560mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f10626b;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC6984a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC6984a f10627a = new ViewOnClickListenerC6984a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C8514a.m13989h().m13990c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    public static final class RunnableC6985b implements Runnable {
        public RunnableC6985b() {
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
    public View m10558m(int i10) {
        if (this.f10626b == null) {
            this.f10626b = new HashMap();
        }
        View view = (View) this.f10626b.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f10626b.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: n */
    public final void m10559n() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f10635a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo10573t(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC6985b(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C8514a.m13989h().m13990c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m10558m(R$id.tv_confirm)).setOnClickListener(ViewOnClickListenerC6984a.f10627a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MessageClient.f10635a.mo10570q()) {
            m10559n();
        }
    }
}
