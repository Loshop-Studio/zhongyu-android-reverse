package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* renamed from: android.support.v4.media.i */
/* loaded from: classes.dex */
public final class C0040i {

    /* renamed from: b */
    public static final boolean f98b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a */
    public final C0035d f99a;

    public C0040i(Context context, ComponentName componentName, AbstractC0034c abstractC0034c) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f99a = new C0036e(context, componentName, abstractC0034c);
        } else {
            this.f99a = new C0035d(context, componentName, abstractC0034c);
        }
    }
}
