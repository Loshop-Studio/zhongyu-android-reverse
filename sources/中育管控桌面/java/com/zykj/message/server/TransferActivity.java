package com.zykj.message.server;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m7880d2 = {"Lcom/zykj/message/server/TransferActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "a", "messageserver_release"}, m7881k = 1, m7882mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class TransferActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setGravity(8388659);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = 1;
        attributes.width = 1;
        attributes.y = 0;
        attributes.x = 0;
        Intent intent = new Intent();
        intent.setAction("com.zykj.action.zykj.message.service");
        intent.setPackage(getPackageName());
        startService(intent);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
