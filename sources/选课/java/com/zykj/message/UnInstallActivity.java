package com.zykj.message;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.zykj.message.client.ActivityCollectionHelper;
import com.zykj.message.client.BuildConfig;
import com.zykj.message.client.C0252R;
import com.zykj.message.client.MessageClient;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnInstallActivity.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\u000b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m18d2 = {"Lcom/zykj/message/UnInstallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "reStart", BuildConfig.FLAVOR, "onBackPressed", BuildConfig.FLAVOR, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "reStartApp", "messageclient_release"}, m19k = 1, m20mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class UnInstallActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private boolean reStart;

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
        setContentView(C0252R.layout.activity_un_install);
        if (getIntent().getBooleanExtra(MessageClient.INTENT_KEY, false)) {
            moveTaskToBack(true);
        }
        ((TextView) _$_findCachedViewById(C0252R.id.tv_confirm)).setOnClickListener(new View.OnClickListener() { // from class: com.zykj.message.UnInstallActivity.onCreate.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityCollectionHelper.with().exitApp();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (MessageClient.INSTANCES.isInstallApp()) {
            reStartApp();
        }
    }

    private final void reStartApp() {
        if (this.reStart) {
            return;
        }
        this.reStart = true;
        MessageClient messageClient = MessageClient.INSTANCES;
        Application application = getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "application");
        messageClient.startService(application);
        startService(new Intent(this, (Class<?>) KillSelfService.class));
        new Handler().postDelayed(new Runnable() { // from class: com.zykj.message.UnInstallActivity.reStartApp.1
            @Override // java.lang.Runnable
            public final void run() {
                if (UnInstallActivity.this.isFinishing()) {
                    return;
                }
                UnInstallActivity.this.finish();
            }
        }, 500L);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityCollectionHelper.with().exitApp();
    }
}
