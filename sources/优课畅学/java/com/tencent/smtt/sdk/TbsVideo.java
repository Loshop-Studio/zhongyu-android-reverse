package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.tbs.video.interfaces.InterfaceC6870a;

/* loaded from: classes4.dex */
public class TbsVideo {
    public static boolean canUseTbsPlayer(Context context) {
        return C6802ba.m6130a(context).m6133a();
    }

    public static boolean canUseYunbo(Context context) {
        return C6802ba.m6130a(context).m6133a() && QbSdk.canUseVideoFeatrue(context, 1);
    }

    public static void openVideo(Context context, String str) {
        openVideo(context, str, null);
    }

    public static boolean openYunboVideo(Context context, String str, Bundle bundle, InterfaceC6870a interfaceC6870a) {
        if (canUseYunbo(context)) {
            return C6802ba.m6130a(context).m6134a(str, bundle, interfaceC6870a);
        }
        return false;
    }

    public static void openVideo(Context context, String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            Log.e("TbsVideo", "videoUrl is empty!");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("videoUrl", str);
        Intent intent = new Intent("com.tencent.smtt.tbs.video.PLAY");
        intent.setFlags(268435456);
        intent.setPackage(context.getPackageName());
        intent.putExtra("extraData", bundle);
        context.startActivity(intent);
    }
}
