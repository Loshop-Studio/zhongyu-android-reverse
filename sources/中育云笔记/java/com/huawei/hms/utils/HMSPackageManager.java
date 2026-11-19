package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import anet.channel.util.HttpConstant;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.device.C7283a;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class HMSPackageManager {

    /* renamed from: o */
    public static HMSPackageManager f11838o;

    /* renamed from: p */
    public static final Object f11839p = new Object();

    /* renamed from: q */
    public static final Object f11840q = new Object();

    /* renamed from: r */
    public static final Object f11841r = new Object();

    /* renamed from: s */
    public static final Map f11842s;

    /* renamed from: a */
    public final Context f11843a;

    /* renamed from: b */
    public final PackageManagerHelper f11844b;

    /* renamed from: c */
    public String f11845c;

    /* renamed from: d */
    public String f11846d;

    /* renamed from: e */
    public int f11847e;

    /* renamed from: f */
    public String f11848f;

    /* renamed from: g */
    public String f11849g;

    /* renamed from: h */
    public String f11850h;

    /* renamed from: i */
    public String f11851i;

    /* renamed from: j */
    public int f11852j;

    /* renamed from: k */
    public int f11853k;

    /* renamed from: l */
    public long f11854l;

    /* renamed from: m */
    public boolean f11855m;

    /* renamed from: n */
    public int f11856n;

    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: c */
        public String f11857c;

        /* renamed from: d */
        public String f11858d;

        /* renamed from: e */
        public String f11859e;

        /* renamed from: f */
        public String f11860f;

        /* renamed from: g */
        public String f11861g;

        /* renamed from: h */
        public Long f11862h;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j10) {
            this.f11857c = str;
            this.f11858d = str2;
            this.f11859e = str3;
            this.f11860f = str4;
            this.f11861g = str5;
            this.f11862h = Long.valueOf(j10);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.f11861g, packagePriorityInfo.f11861g) ? this.f11862h.compareTo(packagePriorityInfo.f11862h) : this.f11861g.compareTo(packagePriorityInfo.f11861g);
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSPackageManager$a */
    public class C7359a implements Comparator<ResolveInfo> {
        public C7359a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.f11842s.containsKey(str) && HMSPackageManager.f11842s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.f11842s.containsKey(str)) {
                return -1;
            }
            return HMSPackageManager.f11842s.containsKey(str2) ? 1 : 0;
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSPackageManager$b */
    public class RunnableC7360b implements Runnable {
        public RunnableC7360b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m8727i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> listQueryIntentServices = HMSPackageManager.this.f11843a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                    return;
                }
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.m8783r();
                    }
                }
                HMSLog.m8727i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e10) {
                HMSLog.m8725e("HMSPackageManager", "asyncOnceCheckMDMState query hms action failed. " + e10.getMessage());
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f11842s = map;
        map.put("com.huawei.hwid", "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        map.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    public HMSPackageManager(Context context) {
        this.f11843a = context;
        this.f11844b = new PackageManagerHelper(context);
    }

    /* renamed from: d */
    public static String m8763d(int i10) {
        if (i10 == 1) {
            return "SPOOFED";
        }
        if (i10 == 2) {
            return HttpConstant.SUCCESS;
        }
        if (i10 == 3) {
            return "UNCHECKED";
        }
        HMSLog.m8725e("HMSPackageManager", "invalid checkMDM state: " + i10);
        return "";
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f11839p) {
            try {
                if (f11838o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        f11838o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f11838o = new HMSPackageManager(context);
                    }
                    f11838o.m8768C();
                    f11838o.m8777l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f11838o;
    }

    /* renamed from: A */
    public final ArrayList m8766A() throws PackageManager.NameNotFoundException {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f11843a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                HMSLog.m8725e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f11844b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.m8725e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String strM8772e = m8772e(bundle, "hms_app_checker_config");
                    String strM8773f = m8773f(strM8772e);
                    if (TextUtils.isEmpty(strM8773f)) {
                        HMSLog.m8727i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + strM8772e);
                    } else {
                        String strM8772e2 = m8772e(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(strM8772e2)) {
                            HMSLog.m8727i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String strM8772e3 = m8772e(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(strM8772e3)) {
                                HMSLog.m8727i("HMSPackageManager", "get certChain fail.");
                            } else {
                                HMSLog.m8727i("HMSPackageManager", "add: " + str + ", " + strM8772e + ", " + packageFirstInstallTime);
                                arrayList.add(new PackagePriorityInfo(str, strM8772e, strM8772e2, strM8772e3, strM8773f, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e10) {
            HMSLog.m8725e("HMSPackageManager", "query aglite action failed. " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: B */
    public final void m8767B() {
        synchronized (f11840q) {
            try {
                Pair pairM8790y = m8790y();
                if (pairM8790y == null) {
                    HMSLog.m8725e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    m8788w();
                    return;
                }
                String str = (String) pairM8790y.first;
                this.f11845c = str;
                this.f11846d = (String) pairM8790y.second;
                this.f11847e = this.f11844b.getPackageVersionCode(str);
                HMSLog.m8727i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f11845c + " version: " + this.f11847e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: C */
    public final void m8768C() {
        synchronized (f11840q) {
            try {
                Pair pairM8791z = m8791z();
                if (pairM8791z == null) {
                    HMSLog.m8725e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    m8786u();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                    return;
                }
                this.f11848f = (String) pairM8791z.first;
                this.f11849g = (String) pairM8791z.second;
                this.f11852j = this.f11844b.getPackageVersionCode(m8789x());
                m8787v(this.f11848f);
                HMSLog.m8727i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f11848f + " version: " + this.f11852j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: D */
    public final boolean m8769D() {
        Bundle bundle;
        PackageManager packageManager = this.f11843a.getPackageManager();
        if (packageManager == null) {
            HMSLog.m8725e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.m8725e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e10) {
            HMSLog.m8726e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e10);
        }
        if (TextUtils.isEmpty(this.f11850h) || (!this.f11850h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f11850h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.m8727i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.m8727i("HMSPackageManager", "action = " + this.f11850h + " exist");
        return false;
    }

    /* renamed from: b */
    public final Pair m8770b(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            HMSLog.m8725e("HMSPackageManager", "DSS check: " + str + " for metadata is null");
            return null;
        }
        this.f11856n = 2;
        if (m8775i(bundle, str, str2)) {
            HMSLog.m8727i("HMSPackageManager", "support DSS V3 check");
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4)) {
            HMSLog.m8725e("HMSPackageManager", "skip package " + str + " for no " + str4);
            return null;
        }
        if (!bundle.containsKey("hms_app_cert_chain")) {
            HMSLog.m8725e("HMSPackageManager", "skip package " + str + " for no cert chain");
            return null;
        }
        if (!m8776j(str + "&" + str3, bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
            HMSLog.m8725e("HMSPackageManager", "checkSigner failed");
            return null;
        }
        if (str4.equals("hms_app_signer_v3")) {
            this.f11856n = 3;
        }
        return new Pair(str, str3);
    }

    /* renamed from: c */
    public final Pair m8771c(String str, String str2) {
        if (m8779n(str, str2)) {
            return new Pair(str, str2);
        }
        HMSLog.m8728w("HMSPackageManager", "check sign fail: " + str + BundleUtil.UNDERLINE_TAG + str2);
        return null;
    }

    /* renamed from: e */
    public final String m8772e(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        HMSLog.m8725e("HMSPackageManager", "no " + str + " in metaData");
        return null;
    }

    /* renamed from: f */
    public final String m8773f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("priority=");
        if (iIndexOf == -1) {
            HMSLog.m8725e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    public String getHMSFingerprint() {
        String str = this.f11846d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.m8727i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f11845c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f11844b.getPackageStates(str))) {
                HMSLog.m8727i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                m8767B();
            }
            String str2 = this.f11845c;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.m8727i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.m8727i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f11848f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f11844b.getPackageStates(str))) {
                HMSLog.m8727i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                m8768C();
            }
            String str2 = this.f11848f;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.m8727i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f11839p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.f11844b.getPackageStates(this.f11845c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    m8788w();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f11845c) && m8783r() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || m8782q(this.f11845c, this.f11846d)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f11839p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.f11844b.getPackageStates(this.f11848f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    m8786u();
                    return packageStates2;
                }
                if ("com.huawei.hwid".equals(this.f11848f) && m8783r() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || m8782q(this.f11848f, this.f11849g)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f11844b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f11844b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f11850h) ? this.f11850h : "com.huawei.hms.core.aidlservice";
    }

    /* renamed from: h */
    public final void m8774h(List list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, new C7359a());
    }

    public boolean hmsVerHigherThan(int i10) throws PackageManager.NameNotFoundException {
        if (this.f11847e >= i10 || !m8769D()) {
            return true;
        }
        int packageVersionCode = this.f11844b.getPackageVersionCode(getHMSPackageName());
        this.f11847e = packageVersionCode;
        return packageVersionCode >= i10;
    }

    /* renamed from: i */
    public final boolean m8775i(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !m8779n(str, str2) && Build.VERSION.SDK_INT >= 28;
    }

    public boolean isApkNeedUpdate(int i10) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m8727i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i10);
        return hmsVersionCode < i10;
    }

    public boolean isApkUpdateNecessary(int i10) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m8727i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i10);
        return m8769D() && hmsVersionCode < i10;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return "com.huawei.hwid".equals(this.f11848f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.f11855m;
    }

    /* renamed from: j */
    public final boolean m8776j(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HMSLog.m8725e("HMSPackageManager", "args is invalid");
            return false;
        }
        List<X509Certificate> listM8550b = C7283a.m8550b(str3);
        if (listM8550b.size() == 0) {
            HMSLog.m8725e("HMSPackageManager", "certChain is empty");
            return false;
        }
        if (!C7283a.m8547a(C7283a.m8540a(this.f11843a), listM8550b)) {
            HMSLog.m8725e("HMSPackageManager", "failed to verify cert chain");
            return false;
        }
        X509Certificate x509Certificate = listM8550b.get(listM8550b.size() - 1);
        if (!C7283a.m8545a(x509Certificate, "Huawei CBG HMS")) {
            HMSLog.m8725e("HMSPackageManager", "CN is invalid");
            return false;
        }
        if (!C7283a.m8552b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
            HMSLog.m8725e("HMSPackageManager", "OU is invalid");
            return false;
        }
        if (C7283a.m8546a(x509Certificate, str, str2)) {
            return true;
        }
        HMSLog.m8725e("HMSPackageManager", "signature is invalid: " + str);
        return false;
    }

    /* renamed from: l */
    public final void m8777l() {
        new Thread(new RunnableC7360b(), "Thread-asyncOnceCheckMDMState").start();
    }

    /* renamed from: m */
    public final boolean m8778m(String str) {
        return !"com.huawei.hwid".equals(str) || this.f11856n == 3;
    }

    /* renamed from: n */
    public final boolean m8779n(String str, String str2) {
        Map map = f11842s;
        return map.containsKey(str) && ((String) map.get(str)).equalsIgnoreCase(str2);
    }

    /* renamed from: o */
    public final void m8780o(String str) {
        if ("com.huawei.hwid".equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.f11844b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
            HMSLog.m8727i("HMSPackageManager", "refresh update state for HMS V3");
        }
    }

    /* renamed from: p */
    public final boolean m8781p() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f11843a);
        if (hmsPath == null) {
            HMSLog.m8727i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.m8727i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.m8727i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.m8727i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    /* renamed from: q */
    public final boolean m8782q(String str, String str2) {
        return Objects.equals(str2, this.f11844b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.f11844b.getPackageSignature(str));
    }

    /* renamed from: r */
    public final int m8783r() {
        synchronized (f11841r) {
            try {
                HMSLog.m8727i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f11844b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.f11853k != 3 && this.f11854l == packageFirstInstallTime) {
                    HMSLog.m8727i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + m8763d(this.f11853k));
                    return this.f11853k;
                }
                this.f11853k = m8781p() ? 2 : 1;
                this.f11854l = this.f11844b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.m8727i("HMSPackageManager", "quit checkHmsIsSpoof state: " + m8763d(this.f11853k));
                return this.f11853k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f11845c) || TextUtils.isEmpty(this.f11846d)) {
            m8767B();
        }
        m8780o(this.f11845c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f11848f) || TextUtils.isEmpty(this.f11849g)) {
            m8768C();
        }
        m8780o(this.f11848f);
    }

    public void resetMultiServiceState() {
        m8786u();
    }

    /* renamed from: s */
    public final Pair m8784s(String str, String str2) {
        if (!f11842s.containsKey(str) || !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(str2)) {
            return null;
        }
        this.f11856n = 3;
        return new Pair(str, str2);
    }

    public void setUseOldCertificate(boolean z10) {
        this.f11855m = z10;
    }

    /* renamed from: t */
    public final void m8785t(String str) {
        String strM8773f = m8773f(str);
        if (TextUtils.isEmpty(strM8773f)) {
            return;
        }
        this.f11851i = strM8773f.substring(9);
    }

    /* renamed from: u */
    public final void m8786u() {
        synchronized (f11840q) {
            this.f11848f = null;
            this.f11849g = null;
            this.f11850h = null;
            this.f11851i = null;
            this.f11852j = 0;
        }
    }

    /* renamed from: v */
    public final void m8787v(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.f11843a, str) || Build.VERSION.SDK_INT < 28 || m8778m(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    /* renamed from: w */
    public final void m8788w() {
        synchronized (f11840q) {
            this.f11845c = null;
            this.f11846d = null;
            this.f11847e = 0;
        }
    }

    /* renamed from: x */
    public final String m8789x() {
        String str;
        HMSLog.m8727i("HMSPackageManager", "Enter getAvailableHMSPackageNameForMultiService.");
        String str2 = this.f11848f;
        if (str2 != null) {
            m8780o(str2);
            if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f11844b.getPackageStates(this.f11848f)) && (str = this.f11848f) != null) {
                return str;
            }
        }
        HMSLog.m8727i("HMSPackageManager", " return default packageName: com.huawei.hwid");
        return "com.huawei.hwid";
    }

    /* renamed from: y */
    public final Pair m8790y() throws PackageManager.NameNotFoundException {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f11843a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                HMSLog.m8725e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            m8774h(listQueryIntentServices);
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSigningCertificate = this.f11844b.getPackageSigningCertificate(str);
                String packageSignature = this.f11844b.getPackageSignature(str);
                Pair pairM8784s = m8784s(str, packageSigningCertificate);
                if (pairM8784s != null) {
                    HMSLog.m8727i("HMSPackageManager", "signature V3 check success");
                    return pairM8784s;
                }
                Pair pairM8770b = m8770b(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                if (pairM8770b != null) {
                    HMSLog.m8727i("HMSPackageManager", "DSS signature check success");
                    return pairM8770b;
                }
                Pair pairM8771c = m8771c(str, packageSignature);
                if (pairM8771c != null) {
                    HMSLog.m8727i("HMSPackageManager", "signature V2 check success");
                    return pairM8771c;
                }
            }
            return null;
        } catch (Exception e10) {
            HMSLog.m8725e("HMSPackageManager", "getHmsPackageName query hms action failed. " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: z */
    public final Pair m8791z() throws PackageManager.NameNotFoundException {
        Pair pairM8790y = m8790y();
        if (pairM8790y != null) {
            HMSLog.m8727i("HMSPackageManager", "aidlService pkgName: " + ((String) pairM8790y.first));
            this.f11850h = "com.huawei.hms.core.aidlservice";
            this.f11851i = null;
            return pairM8790y;
        }
        ArrayList arrayListM8766A = m8766A();
        if (arrayListM8766A == null) {
            HMSLog.m8725e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        int size = arrayListM8766A.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM8766A.get(i10);
            i10++;
            PackagePriorityInfo packagePriorityInfo = (PackagePriorityInfo) obj;
            String str = packagePriorityInfo.f11857c;
            String str2 = packagePriorityInfo.f11858d;
            String str3 = packagePriorityInfo.f11859e;
            String str4 = packagePriorityInfo.f11860f;
            String packageSignature = this.f11844b.getPackageSignature(str);
            if (m8776j(str + "&" + packageSignature + "&" + str2, str3, str4)) {
                HMSLog.m8727i("HMSPackageManager", "result: " + str + ", " + str2 + ", " + packagePriorityInfo.f11862h);
                this.f11850h = PackageConstants.GENERAL_SERVICES_ACTION;
                m8785t(str2);
                return new Pair(str, packageSignature);
            }
        }
        return null;
    }
}
