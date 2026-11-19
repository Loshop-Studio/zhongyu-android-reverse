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
import p145k7.AbstractC7898a;
import p158l7.C8514a;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m13558d2 = {"Lcom/zykj/message/UnLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onRestart", "onStart", "onResume", "onPause", "onStop", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "", "a", "Z", "reStart", "messageclient_release"}, m13559k = 1, m13560mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class UnLoginActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean reStart;

    /* renamed from: b */
    public HashMap f10630b;

    /* renamed from: com.zykj.message.UnLoginActivity$a */
    public static final class ViewOnClickListenerC6986a implements View.OnClickListener {

        /* renamed from: a */
        public static final ViewOnClickListenerC6986a f10631a = new ViewOnClickListenerC6986a();

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C8514a.m13989h().m13990c();
        }
    }

    /* renamed from: com.zykj.message.UnLoginActivity$b */
    public static final class ViewOnClickListenerC6987b implements View.OnClickListener {
        public ViewOnClickListenerC6987b() {
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
    public static final class RunnableC6988c implements Runnable {
        public RunnableC6988c() {
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
    public final void m10561o() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.f10635a;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.mo10573t(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new RunnableC6988c(), 500L);
    }

    /* renamed from: m */
    public View m10562m(int i10) {
        if (this.f10630b == null) {
            this.f10630b = new HashMap();
        }
        View view = (View) this.f10630b.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this.f10630b.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == -1) {
            m10561o();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C8514a.m13989h().m13990c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_un_login);
        if (getIntent().getBooleanExtra("hidden", false)) {
            moveTaskToBack(true);
        }
        ((TextView) m10562m(R$id.tv_cancel)).setOnClickListener(ViewOnClickListenerC6986a.f10631a);
        ((TextView) m10562m(R$id.tv_login)).setOnClickListener(new ViewOnClickListenerC6987b());
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
        MessageClient.f10635a.mo10565f(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m10563a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Status statusM10596b = it.m10596b();
                if (statusM10596b == null) {
                    statusM10596b = Status.LOGOUT;
                }
                if (AbstractC7898a.f13771a[statusM10596b.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.m10561o();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m10563a(serverInfo);
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
