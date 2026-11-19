package com.zykj.subscriber.receiver;

import android.content.Context;
import android.util.Log;
import com.alibaba.sdk.android.push.MessageReceiver;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import java.util.Map;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3459a;

/* loaded from: classes.dex */
public final class AliMessageReceiver extends MessageReceiver {

    /* renamed from: a */
    @NotNull
    private InterfaceC3459a<C2925r> f9932a;

    public AliMessageReceiver(@NotNull InterfaceC3459a<C2925r> callback) {
        C2769l.m9241e(callback, "callback");
        this.f9932a = callback;
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onMessage(@Nullable Context context, @NotNull CPushMessage cPushMessage) {
        C2769l.m9241e(cPushMessage, "cPushMessage");
        Log.e("AliMessageReceiver", "onMessage, messageId: " + ((Object) cPushMessage.getMessageId()) + ", title: " + ((Object) cPushMessage.getTitle()) + ", content:" + ((Object) cPushMessage.getContent()));
        if (C2769l.m9237a(cPushMessage.getContent(), "GetAllWhiteUrlAsync")) {
            this.f9932a.invoke();
        }
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onNotification(@Nullable Context context, @NotNull String title, @NotNull String summary, @NotNull Map<String, String> extraMap) {
        C2769l.m9241e(title, "title");
        C2769l.m9241e(summary, "summary");
        C2769l.m9241e(extraMap, "extraMap");
        Log.e("AliMessageReceiver", "Receive notification, title: " + title + ", summary: " + summary + ", extraMap: " + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onNotificationClickedWithNoAction(@Nullable Context context, @NotNull String title, @NotNull String summary, @NotNull String extraMap) {
        C2769l.m9241e(title, "title");
        C2769l.m9241e(summary, "summary");
        C2769l.m9241e(extraMap, "extraMap");
        Log.e("AliMessageReceiver", "onNotificationClickedWithNoAction, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onNotificationOpened(@Nullable Context context, @NotNull String title, @NotNull String summary, @NotNull String extraMap) {
        C2769l.m9241e(title, "title");
        C2769l.m9241e(summary, "summary");
        C2769l.m9241e(extraMap, "extraMap");
        Log.e("AliMessageReceiver", "onNotificationOpened, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onNotificationReceivedInApp(@Nullable Context context, @NotNull String title, @NotNull String summary, @NotNull Map<String, String> extraMap, int i4, @NotNull String openActivity, @NotNull String openUrl) {
        C2769l.m9241e(title, "title");
        C2769l.m9241e(summary, "summary");
        C2769l.m9241e(extraMap, "extraMap");
        C2769l.m9241e(openActivity, "openActivity");
        C2769l.m9241e(openUrl, "openUrl");
        Log.e("AliMessageReceiver", "onNotificationReceivedInApp, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap + ", openType:" + i4 + ", openActivity:" + openActivity + ", openUrl:" + openUrl);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    protected void onNotificationRemoved(@Nullable Context context, @Nullable String str) {
        Log.e("AliMessageReceiver", "onNotificationRemoved");
    }
}
