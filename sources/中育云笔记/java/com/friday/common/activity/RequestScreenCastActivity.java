package com.friday.common.activity;

import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.activity.RequestScreenCastActivity;
import com.friday.common.helper.C5962b;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p200j2.InterfaceC9665e;
import p429z1.AbstractC11958b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class RequestScreenCastActivity extends Hilt_RequestScreenCastActivity {

    /* renamed from: i */
    public static final C5925a f5609i = new C5925a(null);

    /* renamed from: j */
    public static final int f5610j = 8;

    /* renamed from: g */
    public InterfaceC9665e f5611g;

    /* renamed from: h */
    public final ActivityResultLauncher f5612h = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: a2.f
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            RequestScreenCastActivity.m4793N(this.f37a, (ActivityResult) obj);
        }
    });

    /* renamed from: com.friday.common.activity.RequestScreenCastActivity$a */
    public static final class C5925a {
        public /* synthetic */ C5925a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5925a() {
        }
    }

    /* renamed from: N */
    public static final void m4793N(RequestScreenCastActivity requestScreenCastActivity, ActivityResult activityResult) {
        AbstractC9979u.m20294g(activityResult, "activityResult");
        Intent data = activityResult.getData();
        if (activityResult.getResultCode() != -1 || data == null) {
            ToastUtils.showShort("获取投屏权限失败", new Object[0]);
        } else {
            if (C5962b.f6082a.m5299a().m5294v()) {
                AbstractC11958b.m26588i("开始板演");
                requestScreenCastActivity.m4794M().mo105f();
            }
            Intent intent = new Intent(ActivityUtils.getTopActivity(), (Class<?>) PusherService.class);
            intent.putExtra("resultIntent", data);
            intent.putExtra(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, requestScreenCastActivity.getIntent().getIntExtra("key_port", 8782));
            ServiceUtils.startService(intent);
        }
        requestScreenCastActivity.finish();
    }

    /* renamed from: M */
    public final InterfaceC9665e m4794M() {
        InterfaceC9665e interfaceC9665e = this.f5611g;
        if (interfaceC9665e != null) {
            return interfaceC9665e;
        }
        AbstractC9979u.m20312y("iFloatWindowManager");
        return null;
    }

    @Override // com.friday.common.activity.Hilt_RequestScreenCastActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService("media_projection");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        ActivityResultLauncher activityResultLauncher = this.f5612h;
        Intent intentCreateScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
        AbstractC9979u.m20293f(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
        activityResultLauncher.launch(intentCreateScreenCaptureIntent);
    }
}
