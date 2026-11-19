package p215k2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.UriUtils;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;

/* renamed from: k2.x */
/* loaded from: classes3.dex */
public abstract class AbstractC9806x {

    /* renamed from: a */
    public static final a f23003a = new a(null);

    /* renamed from: k2.x$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m19817a(File file) {
            String name = file.getName();
            AbstractC9979u.m20293f(name, "getName(...)");
            String strSubstring = name.substring(AbstractC10793c0.m23136l0(name, Consts.DOT, 0, false, 6, null) + 1, name.length());
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
            Locale locale = Locale.getDefault();
            AbstractC9979u.m20293f(locale, "getDefault(...)");
            String lowerCase = strSubstring.toLowerCase(locale);
            AbstractC9979u.m20293f(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case 52316:
                    return !lowerCase.equals("3gp") ? "*/*" : "video/*";
                case 96796:
                    return !lowerCase.equals("apk") ? "*/*" : "application/vnd.android.package-archive";
                case 97669:
                    return !lowerCase.equals("bmp") ? "*/*" : "image/*";
                case 99640:
                    return !lowerCase.equals("doc") ? "*/*" : "application/vnd.ms-word";
                case 102340:
                    return !lowerCase.equals("gif") ? "*/*" : "image/*";
                case 103649:
                    return !lowerCase.equals("htm") ? "*/*" : "text/html";
                case 105441:
                    return !lowerCase.equals("jpg") ? "*/*" : "image/*";
                case 106458:
                    return !lowerCase.equals("m4a") ? "*/*" : "audio/*";
                case 108104:
                    return !lowerCase.equals("mid") ? "*/*" : "audio/*";
                case 108272:
                    return !lowerCase.equals("mp3") ? "*/*" : "audio/*";
                case 108273:
                    return !lowerCase.equals("mp4") ? "*/*" : "video/*";
                case 109967:
                    return !lowerCase.equals("ogg") ? "*/*" : "audio/*";
                case 110834:
                    return !lowerCase.equals("pdf") ? "*/*" : "application/pdf";
                case 111145:
                    return !lowerCase.equals("png") ? "*/*" : "image/*";
                case 111220:
                    return !lowerCase.equals("ppt") ? "*/*" : "application/vnd.ms-powerpoint";
                case 115312:
                    return !lowerCase.equals("txt") ? "*/*" : "text/plain";
                case 117484:
                    return !lowerCase.equals("wav") ? "*/*" : "audio/*";
                case 118783:
                    return !lowerCase.equals("xls") ? "*/*" : "application/vnd.ms-excel";
                case 118801:
                    return !lowerCase.equals("xmf") ? "*/*" : "audio/*";
                case 3088960:
                    return !lowerCase.equals("docx") ? "*/*" : "application/vnd.ms-word";
                case 3213227:
                    return !lowerCase.equals("html") ? "*/*" : "text/html";
                case 3268712:
                    return !lowerCase.equals("jpeg") ? "*/*" : "image/*";
                case 3447940:
                    return !lowerCase.equals("pptx") ? "*/*" : "application/vnd.ms-powerpoint";
                case 3682393:
                    return !lowerCase.equals("xlsx") ? "*/*" : "application/vnd.ms-excel";
                default:
                    return "*/*";
            }
        }

        /* renamed from: b */
        public final Intent m19818b(String path) {
            AbstractC9979u.m20294g(path, "path");
            File file = new File(path);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1);
                intent.addFlags(2);
            }
            intent.putExtras(new Bundle());
            try {
                Uri uriFile2Uri = UriUtils.file2Uri(file);
                AbstractC9979u.m20293f(uriFile2Uri, "file2Uri(...)");
                String strM19817a = m19817a(file);
                if (!AbstractC10793c0.m23108U(strM19817a, "pdf", false, 2, null) && !AbstractC10793c0.m23108U(strM19817a, "vnd.ms-powerpoint", false, 2, null) && !AbstractC10793c0.m23108U(strM19817a, "vnd.ms-word", false, 2, null) && !AbstractC10793c0.m23108U(strM19817a, "vnd.ms-excel", false, 2, null)) {
                    return intent;
                }
                intent.setClassName("cn.wps.moffice_eng", "cn.wps.moffice.documentmanager.PreStartActivity2");
                intent.setData(uriFile2Uri);
                return intent;
            } catch (Exception e10) {
                e10.printStackTrace();
                return intent;
            }
        }

        /* renamed from: c */
        public final boolean m19819c(Context context, String packageName) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(packageName, "packageName");
            PackageManager packageManager = context.getPackageManager();
            AbstractC9979u.m20293f(packageManager, "getPackageManager(...)");
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            AbstractC9979u.m20293f(installedPackages, "getInstalledPackages(...)");
            int size = installedPackages.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC10819z.m23230C(installedPackages.get(i10).packageName, packageName, true)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }
}
