package android.support.v4.app;

import android.app.Notification;
import android.os.IInterface;

/* renamed from: android.support.v4.app.c */
/* loaded from: classes.dex */
public interface InterfaceC0031c extends IInterface {

    /* renamed from: a */
    public static final String f69a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
