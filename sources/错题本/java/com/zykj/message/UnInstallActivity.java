package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.client.C4423b;
import com.zykj.message.client.MessageClient;
import com.zykj.message.client.R$id;
import com.zykj.message.client.R$layout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p016b0.RunnableC3059a;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/message/UnInstallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "messageclient_release"}, m5111k = 1, m5112mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a */
    public boolean f5664a;

    /* renamed from: b */
    public HashMap f5665b;

    @Override // android.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C4423b.f5678e.m3902a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_install);
        if (getIntent().getBooleanExtra(MessageClient.INTENT_KEY, false)) {
            moveTaskToBack(true);
        }
        int i = R$id.tv_confirm;
        if (this.f5665b == null) {
            this.f5665b = new HashMap();
        }
        View viewFindViewById = (View) this.f5665b.get(Integer.valueOf(i));
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(i);
            this.f5665b.put(Integer.valueOf(i), viewFindViewById);
        }
        ((TextView) viewFindViewById).setOnClickListener(ViewOnClickListenerC4419a.f5669b);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        MessageClient messageClient = MessageClient.INSTANCES;
        if (!messageClient.isInstallApp() || this.f5664a) {
            return;
        }
        this.f5664a = true;
        Application application = getApplication();
        AbstractC5830k.m5326c(application, "application");
        messageClient.startService(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC3059a(this, 12), 500L);
    }
}
