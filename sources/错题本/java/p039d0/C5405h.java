package p039d0;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: d0.h */
/* loaded from: classes2.dex */
public final class C5405h {

    /* renamed from: a */
    public final int f8361a;

    /* renamed from: b */
    public final int f8362b;

    /* renamed from: c */
    public final int f8363c;

    public C5405h(C5404g c5404g) {
        Context context = c5404g.f8357a;
        float f = c5404g.f8360d;
        ActivityManager activityManager = c5404g.f8358b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f8363c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) c5404g.f8359c.f10022b;
        float f7 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f7 * f);
        int iRound3 = Math.round(f7 * 2.0f);
        int i8 = iRound - i;
        int i9 = iRound3 + iRound2;
        if (i9 <= i8) {
            this.f8362b = iRound3;
            this.f8361a = iRound2;
        } else {
            float f8 = i8 / (f + 2.0f);
            this.f8362b = Math.round(2.0f * f8);
            this.f8361a = Math.round(f8 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f8362b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f8361a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            sb.append(i9 > iRound);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, iRound));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
