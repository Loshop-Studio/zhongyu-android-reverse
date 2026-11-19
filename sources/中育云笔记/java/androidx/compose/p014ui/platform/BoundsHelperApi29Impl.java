package androidx.compose.p014ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9979u;

@RequiresApi(29)
/* loaded from: classes2.dex */
final class BoundsHelperApi29Impl implements BoundsHelper {
    public static final BoundsHelperApi29Impl INSTANCE = new BoundsHelperApi29Impl();

    private BoundsHelperApi29Impl() {
    }

    @Override // androidx.compose.p014ui.platform.BoundsHelper
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect currentWindowBounds(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if (e10 instanceof NoSuchFieldException ? true : e10 instanceof NoSuchMethodException ? true : e10 instanceof IllegalAccessException ? true : e10 instanceof InvocationTargetException) {
                return BoundsHelperApi28Impl.INSTANCE.currentWindowBounds(activity);
            }
            throw e10;
        }
    }
}
