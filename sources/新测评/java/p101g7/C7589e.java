package p101g7;

import android.os.Environment;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.Utils;
import com.zykj.evaluation.bean.TaskState;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: g7.e */
/* loaded from: classes4.dex */
public final class C7589e {

    /* renamed from: d */
    public static final a f12717d = new a(null);

    /* renamed from: e */
    public static final String f12718e;

    /* renamed from: f */
    public static final String f12719f;

    /* renamed from: g */
    public static final String f12720g;

    /* renamed from: h */
    public static final String f12721h;

    /* renamed from: i */
    public static final String f12722i;

    /* renamed from: j */
    public static final String f12723j;

    /* renamed from: k */
    public static final String f12724k;

    /* renamed from: l */
    public static final String f12725l;

    /* renamed from: m */
    public static final String f12726m;

    /* renamed from: n */
    public static final String f12727n;

    /* renamed from: a */
    public final TaskState f12728a;

    /* renamed from: b */
    public final long f12729b;

    /* renamed from: c */
    public final long f12730c;

    /* renamed from: g7.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m12473a() {
            return C7589e.f12720g;
        }

        public a() {
        }
    }

    static {
        String appPackageName = AppUtils.getAppPackageName();
        Intrinsics.checkNotNullExpressionValue(appPackageName, "getAppPackageName(...)");
        f12718e = appPackageName;
        File externalFilesDir = Utils.getApp().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        Intrinsics.checkNotNull(externalFilesDir);
        String absolutePath = externalFilesDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        f12719f = absolutePath;
        f12720g = absolutePath + "/answers";
        f12721h = absolutePath + "/Draft";
        f12722i = absolutePath + "/Mistake";
        f12723j = absolutePath + "/Scan";
        File externalFilesDir2 = Utils.getApp().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        Intrinsics.checkNotNull(externalFilesDir2);
        String absolutePath2 = externalFilesDir2.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
        f12724k = absolutePath2;
        f12725l = absolutePath2 + "/SketchPlay";
        File externalCacheDir = Utils.getApp().getExternalCacheDir();
        Intrinsics.checkNotNull(externalCacheDir);
        String absolutePath3 = externalCacheDir.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
        f12726m = absolutePath3;
        f12727n = absolutePath3 + "/Update";
    }

    public C7589e(TaskState taskState, long j10, long j11) {
        Intrinsics.checkNotNullParameter(taskState, "taskState");
        this.f12728a = taskState;
        this.f12729b = j10;
        this.f12730c = j11;
    }

    /* renamed from: p */
    public static /* synthetic */ String m12455p(C7589e c7589e, long j10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c7589e.m12469o(j10, i10);
    }

    /* renamed from: b */
    public final String m12456b(int i10) {
        return m12460f(i10) + "/answerCorrectInfo.json";
    }

    /* renamed from: c */
    public final String m12457c(int i10, String uuid, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return m12460f(i10) + "/answers/" + uuid + "_" + i11 + "_" + i12 + ".webp";
    }

    /* renamed from: d */
    public final String m12458d(int i10) {
        return m12460f(i10) + "/pageAnswerInfo.json";
    }

    /* renamed from: e */
    public final String m12459e(int i10) {
        return m12460f(i10) + "/pagerConfig.json";
    }

    /* renamed from: f */
    public final String m12460f(int i10) {
        return f12723j + "/answerSheet/" + this.f12729b + "/" + i10;
    }

    /* renamed from: g */
    public final String m12461g(int i10, int i11) {
        return m12460f(i10) + "/preview/" + i11 + ".webp";
    }

    /* renamed from: h */
    public final String m12462h() {
        return f12726m + "/compositionSheet/" + UUID.randomUUID() + ".webp";
    }

    /* renamed from: i */
    public final String m12463i(long j10) {
        return m12467m(f12721h) + "/" + j10;
    }

    /* renamed from: j */
    public final String m12464j(long j10) {
        return m12467m(f12721h) + "/" + j10 + "/sketch";
    }

    /* renamed from: k */
    public final String m12465k(long j10, String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        String absolutePath = new File(m12467m(f12720g), j10 + "/" + uuid + "/composition").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* renamed from: l */
    public final String m12466l(long j10, String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        String absolutePath = new File(m12467m(f12720g), j10 + "/" + uuid + "/sketch").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* renamed from: m */
    public final String m12467m(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return path + "/" + this.f12729b + "/" + this.f12728a.getName() + "/" + this.f12730c;
    }

    /* renamed from: n */
    public final String m12468n(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return path + "/" + this.f12729b + "/" + this.f12730c;
    }

    /* renamed from: o */
    public final String m12469o(long j10, int i10) {
        String absolutePath = new File(m12468n(f12722i), j10 + "/" + i10 + ".jpg").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* renamed from: q */
    public final String m12470q() {
        return f12723j + "/failed/" + this.f12729b + "_" + this.f12730c + "_" + System.currentTimeMillis() + ".webp";
    }

    /* renamed from: r */
    public final String m12471r(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String string = EncryptUtils.encryptMD5(bytes).toString();
        return f12725l + "/" + string;
    }

    /* renamed from: s */
    public final String m12472s(String appVersion) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return f12727n + "/" + appVersion + ".apk";
    }
}
