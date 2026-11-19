package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class BuildCompat {

    @ChecksSdkIntAtLeast(extension = 1000000)
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();

    @ChecksSdkIntAtLeast(extension = 30)
    public static final int R_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 31)
    public static final int S_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 33)
    public static final int T_EXTENSION_INT;

    @RequiresApi(30)
    public static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        public final int getExtensionVersion(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i10 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(30) : 0;
        S_EXTENSION_INT = i10 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(31) : 0;
        T_EXTENSION_INT = i10 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(33) : 0;
        AD_SERVICES_EXTENSION_INT = i10 >= 30 ? Api30Impl.INSTANCE.getExtensionVersion(1000000) : 0;
    }

    private BuildCompat() {
    }

    @ChecksSdkIntAtLeast(api = 36, codename = "Baklava")
    public static final boolean isAtLeastB() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return true;
        }
        if (i10 < 35) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Baklava", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 24)
    @InterfaceC10770a
    public static final boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @InterfaceC10770a
    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @InterfaceC10770a
    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @InterfaceC10770a
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @InterfaceC10770a
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        AbstractC9979u.m20294g(codename, "codename");
        AbstractC9979u.m20294g(buildCodename, "buildCodename");
        if (AbstractC9979u.m20289b("REL", buildCodename)) {
            return false;
        }
        Integer numIsAtLeastPreReleaseCodename$codenameToInt = isAtLeastPreReleaseCodename$codenameToInt(buildCodename);
        Integer numIsAtLeastPreReleaseCodename$codenameToInt2 = isAtLeastPreReleaseCodename$codenameToInt(codename);
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null && numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt.intValue() >= numIsAtLeastPreReleaseCodename$codenameToInt2.intValue();
        }
        if (numIsAtLeastPreReleaseCodename$codenameToInt != null || numIsAtLeastPreReleaseCodename$codenameToInt2 != null) {
            return numIsAtLeastPreReleaseCodename$codenameToInt != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC9979u.m20293f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC9979u.m20293f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer isAtLeastPreReleaseCodename$codenameToInt(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC9979u.m20293f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return AbstractC9979u.m20289b(upperCase, "BAKLAVA") ? 0 : null;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @InterfaceC10770a
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @InterfaceC10770a
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = ExifInterface.LATITUDE_SOUTH)
    @InterfaceC10770a
    public static final boolean isAtLeastS() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    @InterfaceC10770a
    public static final boolean isAtLeastSv2() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return true;
        }
        if (i10 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Sv2", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @InterfaceC10770a
    public static final boolean isAtLeastT() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Tiramisu", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    @InterfaceC10770a
    public static final boolean isAtLeastU() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME);
    }

    @ChecksSdkIntAtLeast(api = 35, codename = "VanillaIceCream")
    @InterfaceC10770a
    public static final boolean isAtLeastV() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        AbstractC9979u.m20293f(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME);
    }
}
