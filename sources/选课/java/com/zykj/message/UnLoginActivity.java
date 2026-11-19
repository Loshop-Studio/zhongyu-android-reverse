package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.client.ActivityCollectionHelper;
import com.zykj.message.client.BuildConfig;
import com.zykj.message.client.C0252R;
import com.zykj.message.client.MessageClient;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.Status;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnLoginActivity.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\b\u0010\u0014\u001a\u00020\u0006H\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m18d2 = {"Lcom/zykj/message/UnLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "reStart", BuildConfig.FLAVOR, "onActivityResult", BuildConfig.FLAVOR, "requestCode", BuildConfig.FLAVOR, "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRestart", "onResume", "onStart", "onStop", "reStartApp", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class UnLoginActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private boolean reStart;

    @Metadata(m16bv = {1, 0, 3}, m19k = 3, m20mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Status.LOGIN.ordinal()] = 1;
            iArr[Status.LOGOUT.ordinal()] = 2;
            iArr[Status.CRACK.ordinal()] = 3;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0252R.layout.activity_un_login);
        if (getIntent().getBooleanExtra(MessageClient.INTENT_KEY, false)) {
            moveTaskToBack(true);
        }
        Log.d("UnLoginActivity", "onCreate");
        ((TextView) _$_findCachedViewById(C0252R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.zykj.message.UnLoginActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityCollectionHelper.with().exitApp();
            }
        });
        ((TextView) _$_findCachedViewById(C0252R.id.tv_login)).setOnClickListener(new View.OnClickListener() { // from class: com.zykj.message.UnLoginActivity.onCreate.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MessageClient.serverLoginAction);
                intent.setPackage(MessageClient.serverPackageName);
                UnLoginActivity.this.startActivityForResult(intent, MessageClient.SERVER_REQUEST_CODE);
            }
        });
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        Log.d("UnLoginActivity", "onRestart");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        Log.d("UnLoginActivity", "onStart");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        Log.d("UnLoginActivity", "onResume");
        MessageClient.INSTANCES.getServerInfo(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.UnLoginActivity.onResume.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                invoke2(serverInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                Status status = it.getStatus();
                if (status == null) {
                    status = Status.LOGOUT;
                }
                if (WhenMappings.$EnumSwitchMapping$0[status.ordinal()] != 1) {
                    return;
                }
                UnLoginActivity.this.reStartApp();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        Log.d("UnLoginActivity", "onPause");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        Log.d("UnLoginActivity", "onStop");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Log.d("UnLoginActivity", "onDestroy");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == -1) {
            Log.d(BuildConfig.FLAVOR, "个人中心登录成功");
            reStartApp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reStartApp() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.INSTANCES;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.startService(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new Runnable() { // from class: com.zykj.message.UnLoginActivity.reStartApp.1
            @Override // java.lang.Runnable
            public final void run() {
                if (UnLoginActivity.this.isFinishing()) {
                    return;
                }
                UnLoginActivity.this.finish();
            }
        }, 500L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityCollectionHelper.with().exitApp();
    }
}
