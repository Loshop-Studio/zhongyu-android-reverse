package p314z6;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.ActivityUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10005c {
    /* renamed from: b */
    public static final boolean m17365b() {
        return ActivityUtils.isActivityExists("com.zykj.manage", "com.zykj.gallery.ui.share.ShareActivity");
    }

    /* renamed from: c */
    public static final String m17366c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    /* renamed from: d */
    public static final ActivityResultLauncher m17367d(Fragment fragment, final Function1 onImagePicked) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(onImagePicked, "onImagePicked");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: z6.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AbstractC10005c.m17368e(onImagePicked, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        return activityResultLauncherRegisterForActivityResult;
    }

    /* renamed from: e */
    public static final void m17368e(Function1 function1, ActivityResult result) {
        Intent data;
        Uri data2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() != -1 || (data = result.getData()) == null || (data2 = data.getData()) == null) {
            return;
        }
        function1.invoke(data2);
    }

    /* renamed from: f */
    public static final void m17369f(Fragment fragment, ActivityResultLauncher launcher) {
        Object objM24758constructorimpl;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent();
            intent.setClassName("com.zykj.manage", "com.zykj.gallery.ui.share.ShareActivity");
            launcher.launch(intent);
            objM24758constructorimpl = Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = fragment.getString(R.string.open_gallery_failure);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            xToastUtils.error(string);
        }
    }
}
