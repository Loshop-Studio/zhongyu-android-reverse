package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.C6845b;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tencent.smtt.sdk.ak */
/* loaded from: classes4.dex */
class C6785ak {

    /* renamed from: c */
    private static C6785ak f6814c;

    /* renamed from: e */
    private FileLock f6821e;

    /* renamed from: f */
    private FileOutputStream f6822f;

    /* renamed from: h */
    private static final Lock f6815h = new ReentrantLock();

    /* renamed from: i */
    private static final Lock f6816i = new ReentrantLock();

    /* renamed from: a */
    public static ThreadLocal<Integer> f6812a = new C6786al();

    /* renamed from: k */
    private static Handler f6817k = null;

    /* renamed from: l */
    private static final Long[][] f6818l = {new Long[]{25413L, 11460320L}, new Long[]{25436L, 12009376L}, new Long[]{25437L, 11489180L}, new Long[]{25438L, 11489180L}, new Long[]{25439L, 12013472L}, new Long[]{25440L, 11489180L}, new Long[]{25442L, 11489180L}};

    /* renamed from: b */
    static boolean f6813b = true;

    /* renamed from: m */
    private static boolean f6819m = false;

    /* renamed from: d */
    private int f6820d = 0;

    /* renamed from: g */
    private boolean f6823g = false;

    /* renamed from: j */
    private boolean f6824j = false;

    private C6785ak() {
        if (f6817k == null) {
            f6817k = new HandlerC6787am(this, HandlerThreadC6783ai.m6061a().getLooper());
        }
    }

    /* renamed from: A */
    private void m6065A(Context context) throws IOException {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--renameShareDir");
        File fileM6123q = m6123q(context);
        File fileM6121n = m6121n(context);
        if (fileM6123q == null || fileM6121n == null) {
            return;
        }
        fileM6123q.renameTo(fileM6121n);
        m6086f(context, false);
    }

    /* renamed from: B */
    private void m6066B(Context context) throws IOException {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--renameTbsCoreCopyDir");
        File fileM6125s = m6125s(context);
        File fileM6121n = m6121n(context);
        if (fileM6125s == null || fileM6121n == null) {
            return;
        }
        fileM6125s.renameTo(fileM6121n);
        m6086f(context, false);
    }

    /* renamed from: C */
    private void m6067C(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
        File fileM6123q = m6123q(context);
        if (fileM6123q != null) {
            C6854k.m6302a(fileM6123q, false);
        }
        C6780af.m6042a(context).m6053b(0, 5);
        C6780af.m6042a(context).m6056c(-1);
        QbSdk.m5839a(context, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
    }

    /* renamed from: d */
    private Context m6081d(Context context, int i10) throws Throwable {
        Context contextM6094a;
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreHostContext tbsCoreTargetVer=" + i10);
        if (i10 <= 0) {
            return null;
        }
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        for (int i11 = 0; i11 < coreProviderAppList.length; i11++) {
            if (!context.getPackageName().equalsIgnoreCase(coreProviderAppList[i11]) && m6084e(context, coreProviderAppList[i11]) && (contextM6094a = m6094a(context, coreProviderAppList[i11])) != null) {
                if (m6112e(contextM6094a)) {
                    int iM6115h = m6115h(contextM6094a);
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext hostTbsCoreVer=" + iM6115h);
                    if (iM6115h != 0 && iM6115h == i10) {
                        TbsLog.m6248i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext targetApp=" + coreProviderAppList[i11]);
                        return contextM6094a;
                    }
                } else {
                    TbsLog.m6246e("TbsInstaller", "TbsInstaller--getTbsCoreHostContext " + coreProviderAppList[i11] + " illegal signature go on next");
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    public static File m6087p(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: w */
    private static boolean m6088w(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return new File(context.getDir("tbs", 0), "tmp_folder_core_to_read.conf").exists();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: x */
    private void m6089x(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
        if (C6816bo.m6152b().m6154a() == null && C6816bo.m6152b().m6155a(context) == null) {
            TbsLog.m6246e("TbsInstaller", "generateNewTbsCoreFromUnzip -- failed to get rename fileLock#2!");
            return;
        }
        try {
            m6091z(context);
            m6065A(context);
            if (!TbsShareManager.isThirdPartyApp(context)) {
                TbsShareManager.m5925a(context);
            }
            C6780af.m6042a(context).m6045a(0);
            C6780af.m6042a(context).m6052b(0);
            C6780af.m6042a(context).m6059d(0);
            C6780af.m6042a(context).m6048a("incrupdate_retry_num", 0);
            C6780af.m6042a(context).m6053b(0, 3);
            C6780af.m6042a(context).m6047a("");
            C6780af.m6042a(context).m6056c(-1);
            if (!TbsShareManager.isThirdPartyApp(context)) {
                int i10 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
                if (i10 <= 0 || i10 == m6068a().m6114g(context) || i10 != m6068a().m6115h(context)) {
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip #1 deCoupleCoreVersion is " + i10 + " getTbsCoreShareDecoupleCoreVersion is " + m6068a().m6114g(context) + " getTbsCoreInstalledVerInNolock is " + m6068a().m6115h(context));
                } else {
                    m6118k(context);
                }
            }
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsShareManager.writeCoreInfoForThirdPartyApp(context, m6117j(context), true);
            }
            f6812a.set(0);
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.RENAME_EXCEPTION, "exception when renameing from unzip:" + th.toString());
            TbsLog.m6247e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        }
    }

    /* renamed from: y */
    private void m6090y(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy");
        if (C6816bo.m6152b().m6154a() == null && C6816bo.m6152b().m6155a(context) == null) {
            TbsLog.m6246e("TbsInstaller", "generateNewTbsCoreFromCopy -- failed to get rename fileLock#2!");
            return;
        }
        try {
            m6091z(context);
            m6066B(context);
            TbsShareManager.m5925a(context);
            C6780af.m6042a(context).m6046a(0, 3);
            if (!TbsShareManager.isThirdPartyApp(context)) {
                int i10 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
                if (i10 <= 0 || i10 == m6068a().m6114g(context) || i10 != m6068a().m6115h(context)) {
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy #1 deCoupleCoreVersion is " + i10 + " getTbsCoreShareDecoupleCoreVersion is " + m6068a().m6114g(context) + " getTbsCoreInstalledVerInNolock is " + m6068a().m6115h(context));
                } else {
                    m6118k(context);
                }
            }
            f6812a.set(0);
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.RENAME_EXCEPTION, "exception when renameing from copy:" + e10.toString());
        }
    }

    /* renamed from: z */
    private void m6091z(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--deleteOldCore");
        C6854k.m6302a(m6121n(context), false);
    }

    /* renamed from: a */
    public int m6092a(String str) throws Throwable {
        if (str == null) {
            return 0;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(new File(str), "tbs.conf");
            if (!file.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int i10 = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return i10;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: b */
    public int m6101b(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: c */
    public File m6108c(Context context, Context context2) {
        File file = new File(context2.getDir("tbs", 0), "core_share_decouple");
        if (file.isDirectory() || ((context != null && TbsShareManager.isThirdPartyApp(context)) || file.mkdir())) {
            return file;
        }
        return null;
    }

    /* renamed from: e */
    public boolean m6112e(Context context) {
        if (TbsShareManager.getHostCorePathAppDefined() != null) {
            return true;
        }
        try {
            Signature signature = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0];
            if (context.getPackageName().equals(TbsConfig.APP_QB)) {
                if (!signature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
                    return false;
                }
            } else if (context.getPackageName().equals(TbsConfig.APP_WX)) {
                if (!signature.toCharsString().equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499")) {
                    return false;
                }
            } else if (context.getPackageName().equals(TbsConfig.APP_QQ)) {
                if (!signature.toCharsString().equals("30820253308201bca00302010202044bbb0361300d06092a864886f70d0101050500306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b30090603550403130251513020170d3130303430363039343831375a180f32323834303132303039343831375a306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b300906035504031302515130819f300d06092a864886f70d010101050003818d0030818902818100a15e9756216f694c5915e0b529095254367c4e64faeff07ae13488d946615a58ddc31a415f717d019edc6d30b9603d3e2a7b3de0ab7e0cf52dfee39373bc472fa997027d798d59f81d525a69ecf156e885fd1e2790924386b2230cc90e3b7adc95603ddcf4c40bdc72f22db0f216a99c371d3bf89cba6578c60699e8a0d536950203010001300d06092a864886f70d01010505000381810094a9b80e80691645dd42d6611775a855f71bcd4d77cb60a8e29404035a5e00b21bcc5d4a562482126bd91b6b0e50709377ceb9ef8c2efd12cc8b16afd9a159f350bb270b14204ff065d843832720702e28b41491fbc3a205f5f2f42526d67f17614d8a974de6487b2c866efede3b4e49a0f916baa3c1336fd2ee1b1629652049")) {
                    return false;
                }
            } else if (context.getPackageName().equals(TbsConfig.APP_DEMO)) {
                if (!signature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
                    return false;
                }
            } else if (context.getPackageName().equals(TbsConfig.APP_QZONE)) {
                if (!signature.toCharsString().equals("308202ad30820216a00302010202044c26cea2300d06092a864886f70d010105050030819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d301e170d3130303632373034303830325a170d3335303632313034303830325a30819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d30819f300d06092a864886f70d010101050003818d003081890281810082d6aca037a9843fbbe88b6dd19f36e9c24ce174c1b398f3a529e2a7fe02de99c27539602c026edf96ad8d43df32a85458bca1e6fbf11958658a7d6751a1d9b782bf43a8c19bd1c06bdbfd94c0516326ae3cf638ac42bb470580e340c46e6f306a772c1ef98f10a559edf867f3f31fe492808776b7bd953b2cba2d2b2d66a44f0203010001300d06092a864886f70d0101050500038181006003b04a8a8c5be9650f350cda6896e57dd13e6e83e7f891fc70f6a3c2eaf75cfa4fc998365deabbd1b9092159edf4b90df5702a0d101f8840b5d4586eb92a1c3cd19d95fbc1c2ac956309eda8eef3944baf08c4a49d3b9b3ffb06bc13dab94ecb5b8eb74e8789aa0ba21cb567f538bbc59c2a11e6919924a24272eb79251677")) {
                    return false;
                }
            } else if (context.getPackageName().equals("com.tencent.qqpimsecure") && !signature.toCharsString().equals("30820239308201a2a00302010202044c96f48f300d06092a864886f70d01010505003060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e57753020170d3130303932303035343334335a180f32303635303632333035343334335a3060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e577530819f300d06092a864886f70d010101050003818d0030818902818100b56e79dbb1185a79e52d792bb3d0bb3da8010d9b87da92ec69f7dc5ad66ab6bfdff2a6a1ed285dd2358f28b72a468be7c10a2ce30c4c27323ed4edcc936080e5bedc2cbbca0b7e879c08a631182793f44bb3ea284179b263410c298e5f6831032c9702ba4a74e2ccfc9ef857f12201451602fc8e774ac59d6398511586c83d1d0203010001300d06092a864886f70d0101050500038181002475615bb65b8d8786b890535802948840387d06b1692ff3ea47ef4c435719ba1865b81e6bfa6293ce31747c3cd6b34595b485cc1563fd90107ba5845c28b95c79138f0dec288940395bc10f92f2b69d8dc410999deb38900974ce9984b678030edfba8816582f56160d87e38641288d8588d2a31e20b89f223d788dd35cc9c8")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-installLocalTbsCore getPackageInfo fail");
            return false;
        }
    }

    /* renamed from: f */
    public int m6113f(Context context) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            File fileM6123q = m6123q(context);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTmpTbsCoreVersionUnzipDir  tbsShareDir is " + fileM6123q);
            File file = new File(fileM6123q, "tbs.conf");
            if (!file.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int i10 = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return i10;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: g */
    public int m6114g(Context context) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(m6120m(context), "tbs.conf");
            if (!file.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int i10 = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return i10;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: h */
    public int m6115h(Context context) throws Throwable {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(m6121n(context), "tbs.conf");
                if (!file.exists()) {
                    return 0;
                }
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                            return 0;
                        } catch (IOException e10) {
                            TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e10.toString());
                            return 0;
                        }
                    }
                    int i10 = Integer.parseInt(property);
                    try {
                        bufferedInputStream2.close();
                        return i10;
                    } catch (IOException e11) {
                        TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e11.toString());
                        return i10;
                    }
                } catch (Exception e12) {
                    e = e12;
                    bufferedInputStream = bufferedInputStream2;
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock Exception=" + e.toString());
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e13) {
                            TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e13.toString());
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e14) {
                            TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e14.toString());
                        }
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: i */
    public boolean m6116i(Context context) {
        return new File(m6121n(context), "tbs.conf").exists();
    }

    /* renamed from: j */
    public int m6117j(Context context) throws Throwable {
        StringBuilder sb;
        File file;
        String property;
        if (!m6128v(context)) {
            return -1;
        }
        Lock lock = f6815h;
        boolean zTryLock = lock.tryLock();
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVer locked=" + zTryLock);
        if (!zTryLock) {
            m6103b();
            return 0;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                file = new File(m6121n(context), "tbs.conf");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (!file.exists()) {
            lock.unlock();
            m6103b();
            return 0;
        }
        Properties properties = new Properties();
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
        try {
            properties.load(bufferedInputStream2);
            bufferedInputStream2.close();
            property = properties.getProperty("tbs_core_version");
        } catch (Exception e11) {
            e = e11;
            bufferedInputStream = bufferedInputStream2;
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVer Exception=" + e.toString());
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e12) {
                    e = e12;
                    sb = new StringBuilder();
                    sb.append("TbsInstaller--getTbsCoreInstalledVer IOException=");
                    sb.append(e.toString());
                    TbsLog.m6248i("TbsInstaller", sb.toString());
                    f6815h.unlock();
                    m6103b();
                    return 0;
                }
            }
            f6815h.unlock();
            m6103b();
            return 0;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e13) {
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVer IOException=" + e13.toString());
                }
            }
            f6815h.unlock();
            m6103b();
            throw th;
        }
        if (property != null) {
            f6812a.set(Integer.valueOf(Integer.parseInt(property)));
            int iIntValue = f6812a.get().intValue();
            try {
                bufferedInputStream2.close();
            } catch (IOException e14) {
                TbsLog.m6248i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVer IOException=" + e14.toString());
            }
            f6815h.unlock();
            m6103b();
            return iIntValue;
        }
        try {
            bufferedInputStream2.close();
        } catch (IOException e15) {
            e = e15;
            sb = new StringBuilder();
            sb.append("TbsInstaller--getTbsCoreInstalledVer IOException=");
            sb.append(e.toString());
            TbsLog.m6248i("TbsInstaller", sb.toString());
            f6815h.unlock();
            m6103b();
            return 0;
        }
        f6815h.unlock();
        m6103b();
        return 0;
    }

    /* renamed from: k */
    public boolean m6118k(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple #0");
        File fileM6121n = m6121n(context);
        File fileM6120m = m6120m(context);
        try {
            C6854k.m6302a(fileM6120m, true);
            C6854k.m6308a(fileM6121n, fileM6120m, new C6791aq(this));
            TbsShareManager.m5928b(context);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple success!!!");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: l */
    public void m6119l(Context context) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
        C6780af.m6042a(context).m6045a(0);
        C6780af.m6042a(context).m6052b(0);
        C6780af.m6042a(context).m6059d(0);
        C6780af.m6042a(context).m6048a("incrupdate_retry_num", 0);
        if (TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) != 1) {
            C6780af.m6042a(context).m6053b(0, -1);
            C6780af.m6042a(context).m6047a("");
            C6780af.m6042a(context).m6048a("copy_retry_num", 0);
            C6780af.m6042a(context).m6056c(-1);
            C6780af.m6042a(context).m6046a(0, -1);
            C6854k.m6302a(m6123q(context), true);
            C6854k.m6302a(m6125s(context), true);
        }
    }

    /* renamed from: m */
    public File m6120m(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_share_decouple");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: n */
    public File m6121n(Context context) {
        return m6102b((Context) null, context);
    }

    /* renamed from: o */
    public File m6122o(Context context) {
        File file = new File(context.getDir("tbs", 0), "share");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: q */
    public File m6123q(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_unzip_tmp");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: r */
    public File m6124r(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_unzip_tmp_decouple");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: s */
    public File m6125s(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_copy_tmp");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* renamed from: t */
    public synchronized boolean m6126t(Context context) {
        boolean zM6127u;
        f6813b = true;
        TbsLog.m6248i("TbsInstaller", "TbsInstaller prepareStaticTbsCore: going to smartInstallTbsFromAppLibrary");
        try {
            zM6127u = m6127u(context);
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLogReport.m5877a(context).m5892a(610, "smartInstallTbsFromAppLibrary: " + Log.getStackTraceString(th));
            zM6127u = false;
        }
        f6813b = false;
        return zM6127u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x037e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x037f, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0241  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m6127u(android.content.Context r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6785ak.m6127u(android.content.Context):boolean");
    }

    /* renamed from: v */
    public synchronized boolean m6128v(Context context) {
        this.f6820d++;
        if (this.f6823g) {
            TbsLog.m6248i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
            return true;
        }
        FileOutputStream fileOutputStreamM6316b = C6854k.m6316b(context, true, "tbslock.txt");
        this.f6822f = fileOutputStreamM6316b;
        if (fileOutputStreamM6316b == null) {
            return false;
        }
        FileLock fileLockM6301a = C6854k.m6301a(context, fileOutputStreamM6316b);
        this.f6821e = fileLockM6301a;
        if (fileLockM6301a == null) {
            return false;
        }
        TbsLog.m6248i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
        this.f6823g = true;
        return true;
    }

    /* renamed from: e */
    private boolean m6084e(Context context, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* renamed from: f */
    private void m6086f(Context context, boolean z10) throws IOException {
        TbsLogReport tbsLogReportM5877a;
        String str;
        if (context == null) {
            tbsLogReportM5877a = TbsLogReport.m5877a(context);
            str = "setTmpFolderCoreToRead context is null";
        } else {
            try {
                File file = new File(context.getDir("tbs", 0), "tmp_folder_core_to_read.conf");
                if (!z10) {
                    C6854k.m6317b(file);
                    return;
                } else {
                    if (file.exists()) {
                        return;
                    }
                    file.createNewFile();
                    return;
                }
            } catch (Exception e10) {
                tbsLogReportM5877a = TbsLogReport.m5877a(context);
                str = "setTmpFolderCoreToRead Exception message is " + e10.getMessage() + " Exception cause is " + e10.getCause();
            }
        }
        tbsLogReportM5877a.m5892a(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, str);
    }

    /* renamed from: a */
    public int m6093a(boolean z10, Context context) {
        if (z10 || f6812a.get().intValue() <= 0) {
            f6812a.set(Integer.valueOf(m6115h(context)));
        }
        return f6812a.get().intValue();
    }

    /* renamed from: b */
    public File m6102b(Context context, Context context2) {
        File file = new File(context2.getDir("tbs", 0), "core_share");
        if (file.isDirectory() || ((context != null && TbsShareManager.isThirdPartyApp(context)) || file.mkdir())) {
            return file;
        }
        return null;
    }

    /* renamed from: c */
    public String m6109c(Context context, String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(m6121n(context), "tbs.conf");
            if (!file.exists()) {
                return null;
            }
            Properties properties = new Properties();
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                String property = properties.getProperty(str);
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
                return property;
            } catch (Exception unused2) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public boolean m6111d(Context context) {
        try {
            File file = new File(C6854k.m6298a(context, 4), "x5.tbs.decouple");
            File fileM6124r = m6068a().m6124r(context);
            C6854k.m6306a(fileM6124r);
            C6854k.m6302a(fileM6124r, true);
            C6854k.m6307a(file, fileM6124r);
            for (String str : fileM6124r.list()) {
                File file2 = new File(fileM6124r, str);
                if (file2.getName().endsWith(".dex")) {
                    file2.delete();
                }
            }
            m6068a().m6086f(context, true);
            File fileM6120m = m6120m(context);
            C6854k.m6302a(fileM6120m, true);
            fileM6124r.renameTo(fileM6120m);
            TbsShareManager.m5928b(context);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m6082d(Context context, String str) {
        File file = new File(context.getDir("tbs", 0), str);
        return file.exists() && new File(file, "tbs.conf").exists();
    }

    /* renamed from: e */
    private synchronized boolean m6085e(Context context, boolean z10) {
        return false;
    }

    /* renamed from: a */
    public Context m6094a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public synchronized void m6103b() {
        int i10 = this.f6820d;
        this.f6820d = i10 - 1;
        if (i10 <= 1 && this.f6823g) {
            TbsLog.m6248i("TbsInstaller", "releaseTbsInstallingFileLock without skip");
            C6854k.m6304a(this.f6821e, this.f6822f);
            this.f6823g = false;
            return;
        }
        TbsLog.m6248i("TbsInstaller", "releaseTbsInstallingFileLock with skip");
    }

    /* renamed from: c */
    public boolean m6110c(Context context) throws IOException {
        File file = new File(m6121n(context), "tbs.conf");
        boolean z10 = false;
        if (!file.exists()) {
            return false;
        }
        Properties properties = new Properties();
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                boolean zBooleanValue = Boolean.valueOf(properties.getProperty("tbs_local_installation", "false")).booleanValue();
                if (zBooleanValue) {
                    try {
                        if (System.currentTimeMillis() - file.lastModified() > 259200000) {
                            z10 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z10 = zBooleanValue;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            th.printStackTrace();
                            return z10;
                        } finally {
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                    }
                }
                TbsLog.m6248i("TbsInstaller", "TBS_LOCAL_INSTALLATION is:" + zBooleanValue + " expired=" + z10);
                boolean z11 = zBooleanValue & (!z10);
                try {
                    bufferedInputStream2.close();
                    return z11;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    return z11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    public static synchronized C6785ak m6068a() {
        try {
            if (f6814c == null) {
                synchronized (C6785ak.class) {
                    try {
                        if (f6814c == null) {
                            f6814c = new C6785ak();
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6814c;
    }

    /* renamed from: c */
    private boolean m6078c(Context context, int i10) {
        File fileM6123q;
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: " + i10);
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    fileM6123q = m6125s(context);
                } else {
                    if (i10 != 2) {
                        TbsLog.m6246e("TbsInstaller", "doDexoptOrDexoat mode error: " + i10);
                        return false;
                    }
                    fileM6123q = m6121n(context);
                }
            } else {
                if (TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) == 1) {
                    return true;
                }
                fileM6123q = m6123q(context);
            }
            try {
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    property.startsWith(ExifInterface.GPS_MEASUREMENT_2D);
                }
            } catch (Throwable th) {
                TbsLogReport.m5877a(context).m5894a(TbsListener.ErrorCode.DEXOAT_EXCEPTION, th);
            }
            TbsDownloadConfig.getInstance(context).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_STOP_PRE_OAT, false);
            return m6077b(context, fileM6123q);
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e10.toString());
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return true;
        }
    }

    /* renamed from: d */
    private synchronized boolean m6083d(Context context, boolean z10) {
        boolean z11;
        try {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip canRenameTmpDir =" + z10);
            z11 = false;
        } catch (Exception e10) {
            QbSdk.m5839a(context, "TbsInstaller::enableTbsCoreFromUnzip Exception: " + e10);
            e10.printStackTrace();
        } finally {
        }
        if (!m6128v(context)) {
            return false;
        }
        Lock lock = f6815h;
        boolean zTryLock = lock.tryLock();
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip locked=" + zTryLock);
        if (zTryLock) {
            try {
                int iM6054c = C6780af.m6042a(context).m6054c();
                TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip installStatus=" + iM6054c);
                int iM6093a = m6093a(false, context);
                if (iM6054c == 2) {
                    if (iM6093a == 0) {
                        TbsLog.m6249i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer = 0", false);
                    } else if (z10) {
                        TbsLog.m6249i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer != 0", false);
                    }
                    m6089x(context);
                    z11 = true;
                }
                lock.unlock();
            } catch (Throwable th) {
                f6815h.unlock();
                throw th;
            }
        }
        m6103b();
        return z11;
    }

    /* renamed from: b */
    public void m6104b(Context context) throws IOException {
        m6086f(context, true);
        C6780af.m6042a(context).m6053b(m6114g(context), 2);
    }

    /* renamed from: a */
    private void m6069a(int i10, String str, Context context) throws IOException {
        BufferedInputStream bufferedInputStream;
        new File(str).delete();
        TbsLog.m6249i("TbsInstaller", "Local tbs apk(" + str + ") is deleted!", true);
        File file = new File(context.getDir("tbs", 0), "core_unzip_tmp");
        if (file.canRead()) {
            File file2 = new File(file, "tbs.conf");
            Properties properties = new Properties();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                try {
                    properties.load(bufferedInputStream);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                    try {
                        properties.setProperty("tbs_local_installation", "true");
                        properties.store(bufferedOutputStream2, (String) null);
                        TbsLog.m6249i("TbsInstaller", "TBS_LOCAL_INSTALLATION is set!", true);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        try {
                            th.printStackTrace();
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            if (bufferedInputStream == null) {
                                return;
                            }
                            bufferedInputStream.close();
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
            try {
                bufferedInputStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private boolean m6079c(Context context, File file) throws InterruptedException {
        try {
            File file2 = new File(file, "tbs_sdk_extension_dex.jar");
            File file3 = new File(file, "tbs_sdk_extension_dex.dex");
            new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            String strM6198a = C6818c.m6198a(context, file3.getAbsolutePath());
            if (TextUtils.isEmpty(strM6198a)) {
                TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.DEXOAT_EXCEPTION, "can not find oat command");
                return false;
            }
            for (File file4 : file.listFiles(new C6795au(this))) {
                String strSubstring = file4.getName().substring(0, r5.getName().length() - 4);
                Runtime.getRuntime().exec("/system/bin/dex2oat " + strM6198a.replaceAll("tbs_sdk_extension_dex", strSubstring) + " --dex-location=" + m6068a().m6121n(context) + File.separator + strSubstring + ".jar").waitFor();
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLogReport.m5877a(context).m5894a(TbsListener.ErrorCode.DEXOAT_EXCEPTION, e10);
            return false;
        }
    }

    /* renamed from: b */
    public void m6105b(Context context, int i10) {
        int iM6115h;
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installTbsCoreForThirdPartyApp");
        if (i10 > 0 && (iM6115h = m6115h(context)) != i10) {
            Context contextM5933e = TbsShareManager.m5933e(context);
            if (contextM5933e != null || TbsShareManager.getHostCorePathAppDefined() != null) {
                TbsLog.m6248i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp hostContext != null");
                m6099a(context, contextM5933e);
            } else if (iM6115h <= 0) {
                TbsLog.m6248i("TbsInstaller", "TbsInstaller--installTbsCoreForThirdPartyApp hostContext == null");
                QbSdk.m5839a(context, "TbsInstaller::installTbsCoreForThirdPartyApp forceSysWebViewInner #2");
            }
        }
    }

    /* renamed from: a */
    public static void m6070a(Context context) {
        String str;
        if (m6088w(context)) {
            return;
        }
        if (m6082d(context, "core_unzip_tmp")) {
            TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME";
        } else if (m6082d(context, "core_share_backup_tmp")) {
            TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME";
        } else {
            if (!m6082d(context, "core_copy_tmp")) {
                return;
            }
            TbsCoreLoadStat.getInstance().m5852a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME";
        }
        TbsLog.m6246e("TbsInstaller", str);
    }

    /* renamed from: c */
    private synchronized boolean m6080c(Context context, boolean z10) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy");
        boolean z11 = false;
        try {
        } finally {
            return z11;
        }
        if (!m6128v(context)) {
            return false;
        }
        Lock lock = f6815h;
        boolean zTryLock = lock.tryLock();
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy Locked =" + zTryLock);
        if (zTryLock) {
            try {
                int iM6051b = C6780af.m6042a(context).m6051b("copy_status");
                int iM6093a = m6093a(false, context);
                TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy copyStatus =" + iM6051b);
                TbsLog.m6248i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer =" + iM6093a);
                if (iM6051b == 1) {
                    if (iM6093a == 0) {
                        TbsLog.m6249i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer = 0", true);
                    } else if (z10) {
                        TbsLog.m6249i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer != 0", true);
                    }
                    m6090y(context);
                    z11 = true;
                }
                lock.unlock();
            } catch (Throwable th) {
                f6815h.unlock();
                throw th;
            }
        }
        m6103b();
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ba  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6106b(android.content.Context r20, android.os.Bundle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6785ak.m6106b(android.content.Context, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e5 A[Catch: all -> 0x00c7, Exception -> 0x00ca, TryCatch #3 {Exception -> 0x00ca, blocks: (B:16:0x0097, B:18:0x00b1, B:25:0x00cd, B:27:0x00e7, B:30:0x0113, B:35:0x0123, B:42:0x0133, B:44:0x013e, B:46:0x0144, B:51:0x018a, B:53:0x0190, B:55:0x019c, B:58:0x01a3, B:62:0x01c7, B:64:0x01d3, B:67:0x01f1, B:68:0x01f9, B:70:0x0203, B:72:0x020f, B:76:0x021c, B:78:0x0249, B:79:0x024c, B:81:0x0268, B:83:0x0271, B:103:0x02ca, B:118:0x02e5, B:119:0x02f3, B:121:0x02f6, B:123:0x0302, B:125:0x030e, B:127:0x031a, B:129:0x0320, B:132:0x032f, B:135:0x0345, B:137:0x034b, B:139:0x0394, B:138:0x0367, B:141:0x039b, B:144:0x03b3, B:147:0x03de, B:149:0x03ed, B:151:0x03f3, B:155:0x0400, B:156:0x0406, B:158:0x0412, B:159:0x041a, B:161:0x0427, B:166:0x047a, B:165:0x0462, B:160:0x041e, B:106:0x02cf, B:169:0x0480, B:173:0x0488, B:172:0x0485, B:112:0x02da, B:115:0x02df, B:174:0x0489, B:176:0x04b1, B:178:0x04c7, B:73:0x0214), top: B:192:0x0097, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0412 A[Catch: all -> 0x00c7, Exception -> 0x00ca, TryCatch #3 {Exception -> 0x00ca, blocks: (B:16:0x0097, B:18:0x00b1, B:25:0x00cd, B:27:0x00e7, B:30:0x0113, B:35:0x0123, B:42:0x0133, B:44:0x013e, B:46:0x0144, B:51:0x018a, B:53:0x0190, B:55:0x019c, B:58:0x01a3, B:62:0x01c7, B:64:0x01d3, B:67:0x01f1, B:68:0x01f9, B:70:0x0203, B:72:0x020f, B:76:0x021c, B:78:0x0249, B:79:0x024c, B:81:0x0268, B:83:0x0271, B:103:0x02ca, B:118:0x02e5, B:119:0x02f3, B:121:0x02f6, B:123:0x0302, B:125:0x030e, B:127:0x031a, B:129:0x0320, B:132:0x032f, B:135:0x0345, B:137:0x034b, B:139:0x0394, B:138:0x0367, B:141:0x039b, B:144:0x03b3, B:147:0x03de, B:149:0x03ed, B:151:0x03f3, B:155:0x0400, B:156:0x0406, B:158:0x0412, B:159:0x041a, B:161:0x0427, B:166:0x047a, B:165:0x0462, B:160:0x041e, B:106:0x02cf, B:169:0x0480, B:173:0x0488, B:172:0x0485, B:112:0x02da, B:115:0x02df, B:174:0x0489, B:176:0x04b1, B:178:0x04c7, B:73:0x0214), top: B:192:0x0097, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x041e A[Catch: all -> 0x00c7, Exception -> 0x00ca, TryCatch #3 {Exception -> 0x00ca, blocks: (B:16:0x0097, B:18:0x00b1, B:25:0x00cd, B:27:0x00e7, B:30:0x0113, B:35:0x0123, B:42:0x0133, B:44:0x013e, B:46:0x0144, B:51:0x018a, B:53:0x0190, B:55:0x019c, B:58:0x01a3, B:62:0x01c7, B:64:0x01d3, B:67:0x01f1, B:68:0x01f9, B:70:0x0203, B:72:0x020f, B:76:0x021c, B:78:0x0249, B:79:0x024c, B:81:0x0268, B:83:0x0271, B:103:0x02ca, B:118:0x02e5, B:119:0x02f3, B:121:0x02f6, B:123:0x0302, B:125:0x030e, B:127:0x031a, B:129:0x0320, B:132:0x032f, B:135:0x0345, B:137:0x034b, B:139:0x0394, B:138:0x0367, B:141:0x039b, B:144:0x03b3, B:147:0x03de, B:149:0x03ed, B:151:0x03f3, B:155:0x0400, B:156:0x0406, B:158:0x0412, B:159:0x041a, B:161:0x0427, B:166:0x047a, B:165:0x0462, B:160:0x041e, B:106:0x02cf, B:169:0x0480, B:173:0x0488, B:172:0x0485, B:112:0x02da, B:115:0x02df, B:174:0x0489, B:176:0x04b1, B:178:0x04c7, B:73:0x0214), top: B:192:0x0097, outer: #5 }] */
    @android.annotation.TargetApi(11)
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6071a(android.content.Context r21, android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6785ak.m6071a(android.content.Context, android.content.Context, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:115:0x045c  */
    @android.annotation.TargetApi(11)
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6076b(android.content.Context r19, java.lang.String r20, int r21) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6785ak.m6076b(android.content.Context, java.lang.String, int):void");
    }

    /* renamed from: a */
    public void m6095a(Context context, Bundle bundle) {
        if (bundle == null || context == null) {
            return;
        }
        Object[] objArr = {context, bundle};
        Message message = new Message();
        message.what = 3;
        message.obj = objArr;
        f6817k.sendMessage(message);
    }

    /* renamed from: b */
    public void m6107b(Context context, boolean z10) {
        String str;
        File fileM6124r;
        if (QbSdk.f6573b) {
            return;
        }
        try {
            if (!TbsShareManager.isThirdPartyApp(context) && (fileM6124r = m6124r(context)) != null && fileM6124r.exists()) {
                C6854k.m6302a(fileM6124r, false);
                new File(m6087p(context), "x5.tbs").delete();
            }
        } catch (Throwable unused) {
        }
        if (m6088w(context)) {
            if (m6082d(context, "core_unzip_tmp") && m6083d(context, z10)) {
                str = "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip!!";
            } else if (m6082d(context, "core_share_backup_tmp") && m6085e(context, z10)) {
                str = "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromBackup!!";
            } else {
                if (!m6082d(context, "core_copy_tmp") || !m6080c(context, z10)) {
                    TbsLog.m6249i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, error !!", true);
                    return;
                }
                str = "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromCopy!!";
            }
            TbsLog.m6249i("TbsInstaller", str, true);
        }
    }

    /* renamed from: b */
    private boolean m6077b(Context context, File file) {
        try {
            File[] fileArrListFiles = file.listFiles(new C6794at(this));
            int length = fileArrListFiles.length;
            ClassLoader classLoader = context.getClassLoader();
            for (int i10 = 0; i10 < length; i10++) {
                TbsLog.m6248i("TbsInstaller", "jarFile: " + fileArrListFiles[i10].getAbsolutePath());
                new DexClassLoader(fileArrListFiles[i10].getAbsolutePath(), file.getAbsolutePath(), null, classLoader);
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e10.toString());
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return false;
        }
    }

    /* renamed from: a */
    public void m6096a(Context context, String str, int i10) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installTbsCore tbsApkPath=" + str);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installTbsCore tbsCoreTargetVer=" + i10);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installTbsCore currentProcessId=" + Process.myPid());
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installTbsCore currentThreadName=" + Thread.currentThread().getName());
        Object[] objArr = {context, str, Integer.valueOf(i10)};
        Message message = new Message();
        message.what = 1;
        message.obj = objArr;
        f6817k.sendMessage(message);
    }

    /* renamed from: a */
    public void m6097a(Context context, boolean z10) throws Throwable {
        int iM6054c;
        int iM6050b;
        String strM6058d;
        int iM6055c;
        int iM6051b;
        if (z10) {
            this.f6824j = true;
        }
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + Process.myPid());
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
        if (m6128v(context)) {
            Lock lock = f6815h;
            if (lock.tryLock()) {
                try {
                    iM6054c = C6780af.m6042a(context).m6054c();
                    iM6050b = C6780af.m6042a(context).m6050b();
                    strM6058d = C6780af.m6042a(context).m6058d("install_apk_path");
                    iM6055c = C6780af.m6042a(context).m6055c("copy_core_ver");
                    iM6051b = C6780af.m6042a(context).m6051b("copy_status");
                    lock.unlock();
                } catch (Throwable th) {
                    f6815h.unlock();
                    throw th;
                }
            } else {
                strM6058d = null;
                iM6054c = -1;
                iM6051b = -1;
                iM6050b = 0;
                iM6055c = 0;
            }
            m6103b();
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + iM6054c);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + iM6050b);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + strM6058d);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + iM6055c);
            TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + iM6051b);
            if (TbsShareManager.isThirdPartyApp(context)) {
                m6105b(context, TbsShareManager.m5923a(context, false));
                return;
            }
            int i10 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
            if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("operation", 10001);
                m6095a(context, bundle);
            }
            if (iM6054c > -1 && iM6054c < 2) {
                m6096a(context, strM6058d, iM6050b);
            }
            if (iM6051b == 0) {
                m6098a(context, iM6055c);
            }
        }
    }

    /* renamed from: a */
    public boolean m6098a(Context context, int i10) throws Throwable {
        if (TbsDownloader.getOverSea(context)) {
            return false;
        }
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + i10);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + Process.myPid());
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
        Context contextM6081d = m6081d(context, i10);
        if (contextM6081d == null) {
            TbsLog.m6248i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
            return false;
        }
        Object[] objArr = {contextM6081d, context, Integer.valueOf(i10)};
        Message message = new Message();
        message.what = 2;
        message.obj = objArr;
        f6817k.sendMessage(message);
        return true;
    }

    /* renamed from: a */
    public synchronized boolean m6099a(Context context, Context context2) {
        TbsLog.m6248i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp");
        if (f6819m) {
            return true;
        }
        f6819m = true;
        new C6788an(this, context2, context).start();
        return true;
    }

    /* renamed from: a */
    private boolean m6074a(Context context, File file) {
        return m6075a(context, file, false);
    }

    /* renamed from: a */
    private boolean m6075a(Context context, File file, boolean z10) {
        TbsDownloadConfig tbsDownloadConfig;
        int i10;
        TbsLog.m6248i("TbsInstaller", "TbsInstaller-unzipTbs start");
        if (!C6854k.m6326c(file)) {
            TbsLogReport.m5877a(context).m5892a(204, "apk is invalid!");
            tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            i10 = -520;
        } else {
            try {
                File dir = context.getDir("tbs", 0);
                File file2 = z10 ? new File(dir, "core_share_decouple") : new File(dir, "core_unzip_tmp");
                if (file2.exists() && TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DOWNLOADDECOUPLECORE, 0) != 1) {
                    C6854k.m6317b(file2);
                }
            } catch (Throwable th) {
                TbsLog.m6246e("TbsInstaller", "TbsInstaller-unzipTbs -- delete unzip folder if exists exception" + Log.getStackTraceString(th));
            }
            File fileM6124r = z10 ? m6124r(context) : m6123q(context);
            if (fileM6124r == null) {
                TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "tmp unzip dir is null!");
                tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
                i10 = -521;
            } else {
                try {
                    try {
                        C6854k.m6306a(fileM6124r);
                        if (z10) {
                            C6854k.m6302a(fileM6124r, true);
                        }
                        boolean zM6307a = C6854k.m6307a(file, fileM6124r);
                        if (z10) {
                            for (String str : fileM6124r.list()) {
                                File file3 = new File(fileM6124r, str);
                                if (file3.getName().endsWith(".dex")) {
                                    file3.delete();
                                }
                            }
                            try {
                                new File(m6087p(context), "x5.tbs").delete();
                            } catch (Exception unused) {
                            }
                        }
                        if (!zM6307a) {
                            C6854k.m6317b(fileM6124r);
                            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-522);
                            TbsLog.m6246e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#1! exist:" + fileM6124r.exists());
                        } else {
                            m6086f(context, true);
                            if (z10) {
                                File fileM6120m = m6120m(context);
                                C6854k.m6302a(fileM6120m, true);
                                fileM6124r.renameTo(fileM6120m);
                                TbsShareManager.m5928b(context);
                            }
                        }
                        TbsLog.m6248i("TbsInstaller", "TbsInstaller-unzipTbs done");
                        return zM6307a;
                    } catch (Throwable th2) {
                        TbsLog.m6248i("TbsInstaller", "TbsInstaller-unzipTbs done");
                        throw th2;
                    }
                } catch (IOException e10) {
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                    TbsLogReport.m5877a(context).m5894a(206, e10);
                    if (fileM6124r.exists()) {
                        try {
                            C6854k.m6317b(fileM6124r);
                            TbsLog.m6246e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + fileM6124r.exists());
                        } catch (Throwable th3) {
                            TbsLog.m6246e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th3));
                        }
                    }
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller-unzipTbs done");
                    return false;
                } catch (Exception e11) {
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                    TbsLogReport.m5877a(context).m5894a(207, e11);
                    if (fileM6124r.exists()) {
                        try {
                            C6854k.m6317b(fileM6124r);
                            TbsLog.m6246e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + fileM6124r.exists());
                        } catch (Throwable th4) {
                            TbsLog.m6246e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th4));
                        }
                    }
                    TbsLog.m6248i("TbsInstaller", "TbsInstaller-unzipTbs done");
                    return false;
                }
            }
        }
        tbsDownloadConfig.setInstallInterruptCode(i10);
        return false;
    }

    /* renamed from: a */
    public boolean m6100a(Context context, File[] fileArr) {
        File fileM6121n = m6121n(context);
        if (fileM6121n == null) {
            TbsLog.m6246e("TbsInstaller", "TbsInstaller : hasStaticTbsInstalled shareDir == null");
            return false;
        }
        if (fileArr == null) {
            try {
                fileArr = new File(C6845b.m6280g(context)).listFiles(new C6792ar(this));
            } catch (Throwable th) {
                TbsLog.m6246e("TbsInstaller", "TbsInstaller : hasStaticTbsInstalled exception : " + th);
                TbsLogReport.m5877a(context).m5892a(TbsListener.ErrorCode.STATIC_TBS_INSTALL_HAS_INSTALLED_EXCEPTION, "TbsInstaller : hasStaticTbsInstalled exception : " + Log.getStackTraceString(th));
            }
        }
        if (fileArr != null && fileArr.length > 1) {
            File file = fileArr[fileArr.length - 1];
            File file2 = new File(fileM6121n, file.getName().substring(7, r3.length() - 3));
            if (file2.exists() && file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                TbsLog.m6248i("TbsInstaller", "TbsInstaller : hasStaticTbsInstalled destLastTbsFile exists === static tbs installed --> return");
                return true;
            }
        }
        return false;
    }
}
