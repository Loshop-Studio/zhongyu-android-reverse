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
import p035c6.C5232a;

@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m13413d2 = {"Lcom/zykj/message/UnInstallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "n", "", "a", "Z", "reStart", "messageclient_release"}, m13414k = 1, m13415mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f10069b;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC7220a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC7220a f10070a = new ViewOnClickListenerC7220a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5232a.m2394h().m2395c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    public static final class RunnableC7221b implements Runnable {
        public RunnableC7221b() {
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
    public View m9827m(int i9) {
        if (this.f10069b == null) {
            this.f10069b = new HashMap();
        }
        View view = (View) this.f10069b.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        this.f10069b.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: n */
    public final void m9828n() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f10078a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo9839t(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC7221b(), 500L);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5232a.m2394h().m2395c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m9827m(R$id.tv_confirm)).setOnClickListener(ViewOnClickListenerC7220a.f10070a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MessageClient.f10078a.mo9836k()) {
            m9828n();
        }
    }
}
