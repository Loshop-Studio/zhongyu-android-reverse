package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.push.notification.CustomNotificationBuilder;
import com.huawei.hms.support.log.HMSLog;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes5.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a */
    public static Context f11879a;

    /* renamed from: b */
    public static String f11880b;

    public static int getAnimId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "anim", f11880b);
    }

    public static int getColorId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, TypedValues.Custom.S_COLOR, f11880b);
    }

    public static int getDimenId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "dimen", f11880b);
    }

    public static Drawable getDrawable(String str) {
        Context context = f11879a;
        if (context == null) {
            return null;
        }
        return context.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, CustomNotificationBuilder.NOTIFICATION_ICON_RES_TYPE, f11880b);
    }

    public static int getIdId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, AgooConstants.MESSAGE_ID, f11880b);
    }

    public static int getLayoutId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "layout", f11880b);
    }

    public static String getString(String str) {
        Context context = f11879a;
        return context == null ? "" : context.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, f11880b);
    }

    public static int getStyleId(String str) {
        Context context = f11879a;
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "style", f11880b);
    }

    public static Context getmContext() {
        return f11879a;
    }

    public static void setmContext(Context context) {
        f11879a = context;
        if (context != null) {
            f11880b = context.getPackageName();
        } else {
            f11880b = null;
            HMSLog.m8725e("ResourceLoaderUtil", "context is null");
        }
    }

    public static String getString(String str, Object... objArr) {
        Context context = f11879a;
        if (context == null) {
            return "";
        }
        return context.getResources().getString(getStringId(str), objArr);
    }
}
