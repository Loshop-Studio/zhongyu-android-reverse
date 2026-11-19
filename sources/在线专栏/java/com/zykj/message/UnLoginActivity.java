package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;
import p174y1.C3497a;
import p178z1.C3508a;
import p178z1.C3511d;
import p178z1.C3512e;
import p178z1.EnumC3509b;

/* loaded from: classes.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: a */
    private boolean f9804a;

    /* renamed from: b */
    private HashMap f9805b;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    static final class ViewOnClickListenerC2411a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC2411a f9806a = new ViewOnClickListenerC2411a();

        ViewOnClickListenerC2411a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C3508a.m10687i().m10688c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    static final class ViewOnClickListenerC2412b implements View.OnClickListener {
        ViewOnClickListenerC2412b() {
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
    static final class C2413c extends AbstractC2770m implements InterfaceC3470l<ServerInfo, C2925r> {
        C2413c() {
            super(1);
        }

        /* renamed from: a */
        public final void m8007a(@NotNull ServerInfo it) {
            C2769l.m9242f(it, "it");
            Status statusM8009b = it.m8009b();
            if (statusM8009b == null) {
                statusM8009b = Status.LOGOUT;
            }
            if (C3497a.f12240a[statusM8009b.ordinal()] != 1) {
                return;
            }
            UnLoginActivity.this.m8005f();
        }

        @Override // p171x2.InterfaceC3470l
        public /* bridge */ /* synthetic */ C2925r invoke(ServerInfo serverInfo) {
            m8007a(serverInfo);
            return C2925r.f11415a;
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$d */
    static final class RunnableC2414d implements Runnable {
        RunnableC2414d() {
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
    /* renamed from: f */
    public final void m8005f() {
        if (this.f9804a) {
            return;
        }
        this.f9804a = true;
        EnumC3509b enumC3509b = EnumC3509b.f12309a;
        Application application = getApplication();
        C2769l.m9238b(application, "application");
        enumC3509b.mo10702h(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC2414d(), 500L);
    }

    /* renamed from: d */
    public View m8006d(int i4) {
        if (this.f9805b == null) {
            this.f9805b = new HashMap();
        }
        View view = (View) this.f9805b.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        this.f9805b.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 200 && i5 == -1) {
            Log.d("", "个人中心登录成功");
            m8005f();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C3508a.m10687i().m10688c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3512e.f12366b);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        Log.d("UnLoginActivity", "onCreate");
        ((TextView) m8006d(C3511d.f12362a)).setOnClickListener(ViewOnClickListenerC2411a.f9806a);
        ((TextView) m8006d(C3511d.f12364c)).setOnClickListener(new ViewOnClickListenerC2412b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Log.d("UnLoginActivity", "onDestroy");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Log.d("UnLoginActivity", "onPause");
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        Log.d("UnLoginActivity", "onRestart");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Log.d("UnLoginActivity", "onResume");
        EnumC3509b.f12309a.mo10697c(new C2413c());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Log.d("UnLoginActivity", "onStart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        Log.d("UnLoginActivity", "onStop");
    }
}
