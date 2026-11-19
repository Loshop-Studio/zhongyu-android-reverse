package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.HashMap;
import p000a.p005b.p006c.ActivityC0021g;
import p070b.p146d.p147a.RunnableC0879a;
import p070b.p146d.p147a.p148b.C0880a;
import p070b.p146d.p147a.p148b.EnumC0881b;
import p160d.p162f.p164b.C1011d;

/* loaded from: classes.dex */
public final class UnInstallActivity extends ActivityC0021g {

    /* renamed from: o */
    public boolean f5429o;

    /* renamed from: p */
    public HashMap f5430p;

    /* renamed from: com.zykj.message.UnInstallActivity$a */
    public static final class ViewOnClickListenerC0984a implements View.OnClickListener {

        /* renamed from: b */
        public static final ViewOnClickListenerC0984a f5431b = new ViewOnClickListenerC0984a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C0880a.f4685e.m2572a();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C0880a.f4685e.m2572a();
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, androidx.activity.ComponentActivity, p000a.p031h.p032b.ActivityC0191f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1088R.layout.activity_un_install);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        if (this.f5430p == null) {
            this.f5430p = new HashMap();
        }
        View viewFindViewById = (View) this.f5430p.get(Integer.valueOf(C1088R.id.tv_confirm));
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(C1088R.id.tv_confirm);
            this.f5430p.put(Integer.valueOf(C1088R.id.tv_confirm), viewFindViewById);
        }
        ((TextView) viewFindViewById).setOnClickListener(ViewOnClickListenerC0984a.f5431b);
    }

    @Override // p000a.p052k.p053b.ActivityC0326p, android.app.Activity
    public void onResume() {
        super.onResume();
        EnumC0881b enumC0881b = EnumC0881b.f4691b;
        if (!enumC0881b.mo2578c() || this.f5429o) {
            return;
        }
        this.f5429o = true;
        Application application = getApplication();
        C1011d.m2806b(application, "application");
        enumC0881b.mo2580e(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC0879a(this), 500L);
    }
}
