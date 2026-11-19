package androidx.compose.p013ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(29)
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi29Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "()V", "currentWindowBounds", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class BoundsHelperApi29Impl implements BoundsHelper {
    public static final BoundsHelperApi29Impl INSTANCE = new BoundsHelperApi29Impl();

    private BoundsHelperApi29Impl() {
    }

    @Override // androidx.compose.p013ui.platform.BoundsHelper
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect currentWindowBounds(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if (e10 instanceof NoSuchFieldException ? true : e10 instanceof NoSuchMethodException ? true : e10 instanceof IllegalAccessException ? true : e10 instanceof InvocationTargetException) {
                return BoundsHelperApi28Impl.INSTANCE.currentWindowBounds(activity);
            }
            throw e10;
        }
    }
}
