package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public class C0265a {
    /* renamed from: a */
    public static String m1255a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: b */
    public static String m1256b(Context context, int i4) {
        if (i4 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i4);
        } catch (Exception unused) {
            return "?" + i4;
        }
    }

    /* renamed from: c */
    public static String m1257c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public static String m1258d(MotionLayout motionLayout, int i4) {
        return i4 == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i4);
    }

    /* renamed from: e */
    public static void m1259e(String str, String str2, int i4) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i4, stackTrace.length - 1);
        String str3 = " ";
        for (int i5 = 1; i5 <= iMin; i5++) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i5].getFileName() + ":" + stackTrace[i5].getLineNumber() + ") " + stackTrace[i5].getMethodName()) + str3);
        }
    }
}
