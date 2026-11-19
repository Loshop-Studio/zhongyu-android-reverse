package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3380c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0080\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m5175d2 = {"findOwner", ExifInterface.GPS_DIRECTION_TRUE, C3380c.f1965R, "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "activity-compose_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ActivityComposeUtilsKt {
    public static final /* synthetic */ <T> T findOwner(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = context;
        while (obj instanceof ContextWrapper) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (obj instanceof Object) {
                return (T) obj;
            }
            Object obj2 = (T) ((ContextWrapper) obj).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(obj2, "innerContext.baseContext");
            obj = obj2;
        }
        return null;
    }
}
