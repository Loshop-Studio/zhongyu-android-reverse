package p030c0;

import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5078c {
    /* renamed from: a */
    public static final double m2671a(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    /* renamed from: b */
    public static final Context m2672b(Context context) {
        return context.getApplicationContext();
    }

    /* renamed from: c */
    public static final Drawable m2673c(Context context, int i10) {
        Drawable drawable = AppCompatResources.getDrawable(context, i10);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    /* renamed from: d */
    public static final Drawable m2674d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i10, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    /* renamed from: e */
    public static final Lifecycle m2675e(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    /* renamed from: f */
    public static final Drawable m2676f(Context context, Resources resources, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return m2674d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    /* renamed from: g */
    public static final long m2677g(Context context) {
        int largeMemoryClass;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return largeMemoryClass * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }
}
