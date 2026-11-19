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
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p024b6.AbstractC5121a;
import p035c6.C5232a;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/message/UnLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onRestart", "onStart", "onResume", "onPause", "onStop", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "", "a", "Z", "reStart", "messageclient_release"}, m13414k = 1, m13415mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f10073b;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC7222a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC7222a f10074a = new ViewOnClickListenerC7222a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5232a.m2394h().m2395c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC7223b implements View.OnClickListener {
        public ViewOnClickListenerC7223b() {
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
    public static final class RunnableC7224c implements Runnable {
        public RunnableC7224c() {
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
    /* renamed from: o */
    public final void m9830o() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f10078a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo9839t(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC7224c(), 500L);
    }

    /* renamed from: m */
    public View m9831m(int i9) {
        if (this.f10073b == null) {
            this.f10073b = new HashMap();
        }
        View view = (View) this.f10073b.get(Integer.valueOf(i9));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i9);
        this.f10073b.put(Integer.valueOf(i9), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == -1) {
            m9830o();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C5232a.m2394h().m2395c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m9831m(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC7222a.f10074a);
        ((TextView) m9831m(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC7223b());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MessageClient.f10078a.mo9833a(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m9832a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Status statusM9860b = it.m9860b();
                if (statusM9860b == null) {
                    statusM9860b = Status.LOGOUT;
                }
                if (AbstractC5121a.f2245a[statusM9860b.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.m9830o();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m9832a(serverInfo);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
