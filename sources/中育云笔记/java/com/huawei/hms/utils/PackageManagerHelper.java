package com.huawei.hms.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidException;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* loaded from: classes5.dex */
public class PackageManagerHelper {

    /* renamed from: a */
    public final PackageManager f11867a;

    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED,
        SPOOF
    }

    public PackageManagerHelper(Context context) {
        this.f11867a = context.getPackageManager();
    }

    /* renamed from: a */
    public final byte[] m8812a(String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0) {
                return signatureArr[0].toByteArray();
            }
        } catch (AndroidException e10) {
            HMSLog.m8725e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e10.getMessage());
        } catch (RuntimeException e11) {
            HMSLog.m8726e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.", e11);
        }
        HMSLog.m8725e("PackageManagerHelper", "Failed to get application signature certificate fingerprint.");
        return new byte[0];
    }

    public String getApplicationName(String str) throws PackageManager.NameNotFoundException {
        try {
            return this.f11867a.getApplicationLabel(this.f11867a.getApplicationInfo(str, 128)).toString();
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.m8725e("PackageManagerHelper", "Failed to get application name for " + str);
            return null;
        }
    }

    public long getPackageFirstInstallTime(String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 128);
            if (packageInfo != null) {
                return packageInfo.firstInstallTime;
            }
            return 0L;
        } catch (AndroidException | RuntimeException unused) {
            return 0L;
        }
    }

    public String getPackageSignature(String str) throws PackageManager.NameNotFoundException {
        byte[] bArrM8812a = m8812a(str);
        if (bArrM8812a == null || bArrM8812a.length == 0) {
            return null;
        }
        return HEX.encodeHexString(SHA256.digest(bArrM8812a), true);
    }

    public String getPackageSigningCertificate(String str) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT < 28) {
            return getPackageSignature(str);
        }
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 134217728);
            if (Objects.isNull(packageInfo, packageInfo.signingInfo)) {
                HMSLog.m8725e("PackageManagerHelper", "packageInfo or packageInfo.signingInfo is null");
                return null;
            }
            Signature[] apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners();
            if (!Objects.isNull(apkContentsSigners, apkContentsSigners[0])) {
                return HEX.encodeHexString(SHA256.digest(apkContentsSigners[0].toByteArray()), true);
            }
            HMSLog.m8725e("PackageManagerHelper", "get V3 signature is null");
            return null;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.m8725e("PackageManagerHelper", "getPackageSignatureV3 has exception");
            return null;
        }
    }

    public PackageStates getPackageStates(String str) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.m8725e("PackageManagerHelper", "servicePackageName is empty.");
            return PackageStates.NOT_INSTALLED;
        }
        try {
            return this.f11867a.getApplicationInfo(str, 128).enabled ? PackageStates.ENABLED : PackageStates.DISABLED;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.m8725e("PackageManagerHelper", "in getPackageStates, getApplicationInfo threw an exception");
            return PackageStates.NOT_INSTALLED;
        }
    }

    public int getPackageVersionCode(String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (AndroidException e10) {
            HMSLog.m8725e("PackageManagerHelper", "get PackageVersionCode failed " + e10);
            return 0;
        } catch (RuntimeException e11) {
            HMSLog.m8726e("PackageManagerHelper", "get PackageVersionCode failed", e11);
            return 0;
        }
    }

    public String getPackageVersionName(String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 16);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2 != null) {
                    return str2;
                }
            }
            return "";
        } catch (AndroidException unused) {
            return "";
        } catch (RuntimeException e10) {
            HMSLog.m8726e("PackageManagerHelper", "get getPackageVersionName failed", e10);
            return "";
        }
    }

    public boolean hasProvider(String str, String str2) throws PackageManager.NameNotFoundException {
        ProviderInfo[] providerInfoArr;
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 8);
            if (packageInfo != null && (providerInfoArr = packageInfo.providers) != null) {
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str2.equals(providerInfo.authority)) {
                        return true;
                    }
                }
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return false;
    }

    public boolean isPackageFreshInstall(String str) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = this.f11867a.getPackageInfo(str, 128);
            if (packageInfo != null) {
                if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                    return true;
                }
            }
        } catch (AndroidException | RuntimeException unused) {
        }
        return false;
    }

    public boolean verifyPackageArchive(String str, String str2, String str3) throws IOException {
        PackageInfo packageArchiveInfo;
        InputStream inputStream = null;
        try {
            packageArchiveInfo = this.f11867a.getPackageArchiveInfo(str, 64);
        } catch (Exception e10) {
            HMSLog.m8725e("PackageManagerHelper", "getPackageArchiveInfo Exception. " + e10.getMessage());
            packageArchiveInfo = null;
        }
        if (packageArchiveInfo != null && packageArchiveInfo.signatures.length > 0) {
            try {
                if (!str2.equals(packageArchiveInfo.packageName)) {
                    return false;
                }
                try {
                    inputStream = IOUtils.toInputStream(packageArchiveInfo.signatures[0].toByteArray());
                    return str3.equalsIgnoreCase(HEX.encodeHexString(SHA256.digest(CertificateFactory.getInstance("X.509").generateCertificate(inputStream).getEncoded()), true));
                } catch (IOException | CertificateException e11) {
                    HMSLog.m8725e("PackageManagerHelper", "Failed to get application signature certificate fingerprint." + e11.getMessage());
                }
            } finally {
                IOUtils.closeQuietly((InputStream) null);
            }
        }
        return false;
    }
}
