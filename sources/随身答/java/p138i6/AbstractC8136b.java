package p138i6;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.p012ui.unit.TextUnitKt;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import com.blankj.utilcode.util.Utils;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.utils.ExceptionHandle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* renamed from: i6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8136b {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f13909a = {Reflection.property1(new PropertyReference1Impl(AbstractC8136b.class, "permissionDataStore", "getPermissionDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b */
    public static final ReadOnlyProperty f13910b = PreferenceDataStoreDelegateKt.preferencesDataStore$default("user_permissions", null, null, null, 14, null);

    /* renamed from: b */
    public static final int m13034b(int i9) throws Exception {
        if (i9 < 0 || i9 >= 501) {
            throw new Exception("dpValue 在0-500之间");
        }
        if (i9 == 0) {
            return 0;
        }
        return Utils.getApp().getResources().getDimensionPixelSize(Utils.getApp().getResources().getIdentifier("view_" + i9, "dimen", Utils.getApp().getPackageName()));
    }

    /* renamed from: c */
    public static final DataStore m13035c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) f13910b.getValue(context, f13909a[0]);
    }

    /* renamed from: d */
    public static final long m13036d(int i9) {
        return TextUnitKt.getSp((i9 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density));
    }

    /* renamed from: e */
    public static final ToastErrorCodeMessage m13037e(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CancellationException) {
            return null;
        }
        return new ToastErrorCodeMessage(ExceptionHandle.INSTANCE.handleException(th).getErrorCodeInfo());
    }

    /* renamed from: f */
    public static final void m13038f(Throwable th, String customToastMsg) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(customToastMsg, "customToastMsg");
        ToastErrorCodeMessage toastErrorCodeMessageM13037e = m13037e(th);
        if (toastErrorCodeMessageM13037e != null) {
            String message = toastErrorCodeMessageM13037e.getMessage();
            if (message != null) {
                customToastMsg = message;
            }
            Integer messageResId = toastErrorCodeMessageM13037e.getMessageResId();
            if (messageResId != null) {
                customToastMsg = Utils.getApp().getString(messageResId.intValue());
                Intrinsics.checkNotNullExpressionValue(customToastMsg, "getString(...)");
            }
            XToastUtils.INSTANCE.error(toastErrorCodeMessageM13037e.getErrorInfo().getCode() + " " + ((Object) customToastMsg));
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m13039g(Throwable th, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = "";
        }
        m13038f(th, str);
    }

    /* renamed from: h */
    public static final void m13040h(View view, final Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: i6.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC8136b.m13041i(lArr, function1, view2);
            }
        });
    }

    /* renamed from: i */
    public static final void m13041i(Long[] lArr, Function1 function1, View view) {
        System.arraycopy(lArr, 1, lArr, 0, lArr.length - 1);
        lArr[lArr.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (lArr[0].longValue() >= SystemClock.uptimeMillis() - 500 || function1 == null) {
            return;
        }
        Intrinsics.checkNotNull(view);
        function1.invoke(view);
    }
}
