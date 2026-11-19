package com.zykj.mistake.activity;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.zykj.message.client.MessageClient;
import com.zykj.mistake.R;
import com.zykj.mistake.utils.AbstractC5099d;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: com.zykj.mistake.activity.h */
/* loaded from: classes3.dex */
public final class C4472h implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f5905a;

    public C4472h(MainActivity mainActivity) {
        this.f5905a = mainActivity;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) {
        MainActivity mainActivity = this.f5905a;
        Context applicationContext = mainActivity.getApplicationContext();
        AbstractC5830k.m5329f(applicationContext, "getApplicationContext(...)");
        String string = mainActivity.getString(R.string.login_not_authenticated);
        AbstractC5830k.m5329f(string, "getString(...)");
        Toast toast = AbstractC5099d.f8034e;
        if (toast == null) {
            Toast toastMakeText = Toast.makeText(applicationContext, string, 0);
            toastMakeText.setGravity(81, 0, 220);
            AbstractC5099d.f8034e = toastMakeText;
        } else {
            toast.setText(string);
        }
        Toast toast2 = AbstractC5099d.f8034e;
        AbstractC5830k.m5327d(toast2);
        toast2.show();
        Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage(MessageClient.serverPackageName);
        if (launchIntentForPackage != null) {
            mainActivity.startActivity(launchIntentForPackage);
            mainActivity.finishAffinity();
        }
        return C5443s.f8405a;
    }
}
