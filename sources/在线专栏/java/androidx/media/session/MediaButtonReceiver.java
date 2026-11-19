package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    private static class C0546a extends MediaBrowserCompat.ConnectionCallback {

        /* renamed from: a */
        private final Context f3585a;

        /* renamed from: b */
        private final Intent f3586b;

        /* renamed from: c */
        private final BroadcastReceiver.PendingResult f3587c;

        /* renamed from: d */
        private MediaBrowserCompat f3588d;

        C0546a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f3585a = context;
            this.f3586b = intent;
            this.f3587c = pendingResult;
        }

        /* renamed from: a */
        private void m2997a() {
            this.f3588d.disconnect();
            this.f3587c.finish();
        }

        /* renamed from: b */
        void m2998b(MediaBrowserCompat mediaBrowserCompat) {
            this.f3588d = mediaBrowserCompat;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnected() {
            try {
                new MediaControllerCompat(this.f3585a, this.f3588d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f3586b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e4) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e4);
            }
            m2997a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionFailed() {
            m2997a();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public void onConnectionSuspended() {
            m2997a();
        }
    }

    /* renamed from: a */
    public static ComponentName m2994a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (listQueryBroadcastReceivers.size() <= 1) {
            return null;
        }
        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        return null;
    }

    /* renamed from: b */
    private static ComponentName m2995b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    /* renamed from: c */
    private static void m2996c(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameM2995b = m2995b(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameM2995b != null) {
            intent.setComponent(componentNameM2995b);
            m2996c(context, intent);
            return;
        }
        ComponentName componentNameM2995b2 = m2995b(context, "android.media.browse.MediaBrowserService");
        if (componentNameM2995b2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0546a c0546a = new C0546a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameM2995b2, c0546a, null);
        c0546a.m2998b(mediaBrowserCompat);
        mediaBrowserCompat.connect();
    }
}
