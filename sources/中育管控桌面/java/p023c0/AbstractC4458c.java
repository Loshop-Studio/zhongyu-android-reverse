package p023c0;

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
public abstract class AbstractC4458c {
    /* renamed from: a */
    public static final double m1528a(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            Intrinsics.checkNotNull(systemService);
            return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    /* renamed from: b */
    public static final Context m1529b(Context context) {
        return context.getApplicationContext();
    }

    /* renamed from: c */
    public static final Drawable m1530c(Context context, int i6) {
        Drawable drawable = AppCompatResources.getDrawable(context, i6);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i6).toString());
    }

    /* renamed from: d */
    public static final Drawable m1531d(Resources resources, int i6, Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i6, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i6).toString());
    }

    /* renamed from: e */
    public static final Lifecycle m1532e(Context context) {
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
    public static final Drawable m1533f(Context context, Resources resources, int i6) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = resources.getXml(i6);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return m1531d(resources, i6, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    /* renamed from: g */
    public static final long m1534g(Context context) {
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
