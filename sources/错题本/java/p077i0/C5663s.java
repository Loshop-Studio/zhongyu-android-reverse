package p077i0;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;

/* renamed from: i0.s */
/* loaded from: classes2.dex */
public final class C5663s {

    /* renamed from: f */
    public static final File f8819f = new File("/proc/self/fd");

    /* renamed from: g */
    public static volatile C5663s f8820g;

    /* renamed from: a */
    public final boolean f8821a;

    /* renamed from: b */
    public final int f8822b;

    /* renamed from: c */
    public final int f8823c;

    /* renamed from: d */
    public int f8824d;

    /* renamed from: e */
    public boolean f8825e = true;

    public C5663s() {
        boolean z8 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String strSubstring = str.substring(0, 7);
            strSubstring.getClass();
            switch (strSubstring) {
                case "SM-A520":
                case "SM-G930":
                case "SM-G935":
                case "SM-G960":
                case "SM-G965":
                case "SM-J720":
                case "SM-N935":
                    if (Build.VERSION.SDK_INT == 26) {
                        z8 = false;
                        break;
                    }
                    break;
            }
        }
        this.f8821a = z8;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8822b = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.f8823c = 0;
        } else {
            this.f8822b = TypedValues.TransitionType.TYPE_DURATION;
            this.f8823c = 128;
        }
    }

    /* renamed from: a */
    public static C5663s m4993a() {
        if (f8820g == null) {
            synchronized (C5663s.class) {
                try {
                    if (f8820g == null) {
                        f8820g = new C5663s();
                    }
                } finally {
                }
            }
        }
        return f8820g;
    }
}
