package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            AbstractC9133u.m16139m(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj != null) {
                return (T) obj;
            }
        }
        return null;
    }
}
