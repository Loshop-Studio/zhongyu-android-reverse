package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.Nullable;
import p178z1.C3508a;
import p178z1.C3511d;
import p178z1.C3512e;
import p178z1.EnumC3509b;

/* loaded from: classes.dex */
public final class UnInstallActivity extends AppCompatActivity {

    /* renamed from: a */
    private boolean f9800a;

    /* renamed from: b */
    private HashMap f9801b;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    static final class ViewOnClickListenerC2409a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC2409a f9802a = new ViewOnClickListenerC2409a();

        ViewOnClickListenerC2409a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C3508a.m10687i().m10688c();
        }
    }

    /* renamed from: com.zykj.message.UnInstallActivity$b */
    static final class RunnableC2410b implements Runnable {
        RunnableC2410b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnInstallActivity.this.isFinishing()) {
                return;
            }
            UnInstallActivity.this.finish();
        }
    }

    /* renamed from: e */
    private final void m8002e() {
        if (this.f9800a) {
            return;
        }
        this.f9800a = true;
        EnumC3509b enumC3509b = EnumC3509b.f12309a;
        Application application = getApplication();
        C2769l.m9238b(application, "application");
        enumC3509b.mo10702h(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC2410b(), 500L);
    }

    /* renamed from: d */
    public View m8003d(int i4) {
        if (this.f9801b == null) {
            this.f9801b = new HashMap();
        }
        View view = (View) this.f9801b.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        this.f9801b.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C3508a.m10687i().m10688c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3512e.f12365a);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m8003d(C3511d.f12363b)).setOnClickListener(ViewOnClickListenerC2409a.f9802a);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (EnumC3509b.f12309a.mo10699e()) {
            m8002e();
        }
    }
}
