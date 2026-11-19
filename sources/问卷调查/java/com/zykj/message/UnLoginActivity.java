package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.HashMap;
import p000a.p005b.p006c.ActivityC0021g;
import p070b.p146d.p147a.p148b.C0880a;
import p070b.p146d.p147a.p148b.EnumC0881b;
import p070b.p146d.p147a.p150d.p151c.C0891a;
import p070b.p146d.p147a.p150d.p151c.EnumC0892b;
import p160d.C0994d;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.AbstractC1012e;
import p160d.p162f.p164b.C1011d;

/* loaded from: classes.dex */
public final class UnLoginActivity extends ActivityC0021g {

    /* renamed from: q */
    public static final /* synthetic */ int f5432q = 0;

    /* renamed from: o */
    public boolean f5433o;

    /* renamed from: p */
    public HashMap f5434p;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC0985a implements View.OnClickListener {

        /* renamed from: b */
        public static final ViewOnClickListenerC0985a f5435b = new ViewOnClickListenerC0985a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0880a.f4685e.m2572a();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC0986b implements View.OnClickListener {
        public ViewOnClickListenerC0986b() {
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
    public static final class C0987c extends AbstractC1012e implements InterfaceC1006b<C0891a, C0994d> {
        public C0987c() {
            super(1);
        }

        @Override // p160d.p162f.p163a.InterfaceC1006b
        /* renamed from: c */
        public C0994d mo2586c(C0891a c0891a) {
            C0891a c0891a2 = c0891a;
            C1011d.m2810f(c0891a2, "it");
            EnumC0892b enumC0892b = c0891a2.f4730b;
            if (enumC0892b == null) {
                enumC0892b = EnumC0892b.LOGOUT;
            }
            if (enumC0892b.ordinal() == 0) {
                UnLoginActivity unLoginActivity = UnLoginActivity.this;
                int i = UnLoginActivity.f5432q;
                unLoginActivity.m2791w();
            }
            return C0994d.f5474a;
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$d */
    public static final class RunnableC0988d implements Runnable {
        public RunnableC0988d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (UnLoginActivity.this.isFinishing()) {
                return;
            }
            UnLoginActivity.this.finish();
        }
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == -1) {
            Log.d(BuildConfig.FLAVOR, "个人中心登录成功");
            m2791w();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C0880a.f4685e.m2572a();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1088R.layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        Log.d("UnLoginActivity", "onCreate");
        ((TextView) m2790v(C1088R.id.tv_cancel)).setOnClickListener(ViewOnClickListenerC0985a.f5435b);
        ((TextView) m2790v(C1088R.id.tv_login)).setOnClickListener(new ViewOnClickListenerC0986b());
    }

    @Override // p000a.p005b.p006c.ActivityC0021g, p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.d("UnLoginActivity", "onDestroy");
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onPause() {
        super.onPause();
        Log.d("UnLoginActivity", "onPause");
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        Log.d("UnLoginActivity", "onRestart");
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.d("UnLoginActivity", "onResume");
        EnumC0881b.f4691b.mo2576a(new C0987c());
    }

    @Override // p000a.p005b.p006c.ActivityC0021g, p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onStart() {
        super.onStart();
        Log.d("UnLoginActivity", "onStart");
    }

    @Override // p000a.p005b.p006c.ActivityC0021g, p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onStop() {
        super.onStop();
        Log.d("UnLoginActivity", "onStop");
    }

    /* renamed from: v */
    public View m2790v(int i) {
        if (this.f5434p == null) {
            this.f5434p = new HashMap();
        }
        View view = (View) this.f5434p.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f5434p.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* renamed from: w */
    public final void m2791w() {
        if (this.f5433o) {
            return;
        }
        this.f5433o = true;
        EnumC0881b enumC0881b = EnumC0881b.f4691b;
        Application application = getApplication();
        C1011d.m2806b(application, "application");
        enumC0881b.mo2580e(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC0988d(), 500L);
    }
}
