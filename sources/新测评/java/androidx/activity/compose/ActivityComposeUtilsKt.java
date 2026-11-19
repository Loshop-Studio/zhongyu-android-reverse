package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13558d2 = {"findOwner", ExifInterface.GPS_DIRECTION_TRUE, "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        for (Object obj = context; obj instanceof ContextWrapper; obj = (T) ((ContextWrapper) obj).getBaseContext()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj != null) {
                return (T) obj;
            }
        }
        return null;
    }
}
