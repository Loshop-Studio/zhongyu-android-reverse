package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.client.C4423b;
import com.zykj.message.client.MessageClient;
import com.zykj.message.client.R$id;
import com.zykj.message.client.R$layout;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p016b0.RunnableC3059a;
import p017b1.ViewOnClickListenerC3099c;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/message/UnLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "messageclient_release"}, m5111k = 1, m5112mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: c */
    public static final /* synthetic */ int f5666c = 0;

    /* renamed from: a */
    public boolean f5667a;

    /* renamed from: b */
    public HashMap f5668b;

    /* renamed from: o */
    public final View m3899o(int i) {
        if (this.f5668b == null) {
            this.f5668b = new HashMap();
        }
        View view = (View) this.f5668b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f5668b.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i8, Intent intent) {
        super.onActivityResult(i, i8, intent);
        if (i == 200 && i8 == -1) {
            Log.d("", "个人中心登录成功");
            m3900p();
        }
    }

    @Override // android.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C4423b.f5678e.m3902a();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra(MessageClient.INTENT_KEY, false)) {
            moveTaskToBack(true);
        }
        Log.d("UnLoginActivity", "onCreate");
        ((TextView) m3899o(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC4419a.f5670c);
        ((TextView) m3899o(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC3099c(this, 4));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Log.d("UnLoginActivity", "onDestroy");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Log.d("UnLoginActivity", "onPause");
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        Log.d("UnLoginActivity", "onRestart");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Log.d("UnLoginActivity", "onResume");
        MessageClient.INSTANCES.getServerInfo(new InterfaceC6471c() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            public final void invoke(@NotNull ServerInfo it) {
                AbstractC5830k.m5331h(it, "it");
                Status status = it.f5728a;
                if (status == null) {
                    status = Status.LOGOUT;
                }
                if (AbstractC4420b.f5672a[status.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity unLoginActivity = UnLoginActivity.this;
                int i = UnLoginActivity.f5666c;
                unLoginActivity.m3900p();
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ServerInfo) obj);
                return C5443s.f8405a;
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Log.d("UnLoginActivity", "onStart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Log.d("UnLoginActivity", "onStop");
    }

    /* renamed from: p */
    public final void m3900p() {
        if (this.f5667a) {
            return;
        }
        this.f5667a = true;
        MessageClient messageClient = MessageClient.INSTANCES;
        Application application = getApplication();
        AbstractC5830k.m5326c(application, "application");
        messageClient.startService(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC3059a(this, 13), 500L);
    }
}
