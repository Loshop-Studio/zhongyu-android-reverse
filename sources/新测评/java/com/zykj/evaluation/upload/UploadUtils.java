package com.zykj.evaluation.upload;

import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.auth.OSSStsTokenCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import p011a9.AbstractC0061x;
import p011a9.C0057t;
import p011a9.C0058u;
import p011a9.C0060w;

/* loaded from: classes4.dex */
public final class UploadUtils {

    /* renamed from: a */
    public static final UploadUtils f10480a = new UploadUtils();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final Object m10507a(String str, String str2, OssToken ossToken, Continuation continuation) {
        File file = new File(str);
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadUtils$gridFsUpload$2(new C0060w.a().m396o(ossToken.getEndpoint() + "/" + str2).m383a(HttpHeaders.AUTHORIZATION, "bearer " + ossToken.getSecurityToken()).m383a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m392k(new C0058u.a(null, 1, 0 == true ? 1 : 0).m286e(C0058u.f201k).m282a("file", file.getName(), AbstractC0061x.Companion.m406g(file, C0057t.f189e.m279b("multipart/form-data"))).m285d()).m384b(), null), continuation);
    }

    /* renamed from: b */
    public final Object m10508b(String str, String str2, OssToken ossToken, Continuation continuation) {
        LogUtils.m3239i("start ossUpload file:" + str + ", serverPath: " + str2);
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadUtils$ossUpload$2(new OSSClient(Utils.getApp(), StringsKt.replace$default(ossToken.getEndpoint(), ossToken.getBucket() + ".", "", false, 4, (Object) null), new OSSStsTokenCredentialProvider(ossToken.getAccessKeyId(), ossToken.getAccessKeySecret(), ossToken.getSecurityToken())), new PutObjectRequest(ossToken.getBucket(), str2, str), str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10509c(java.lang.String r7, java.lang.String r8, com.zykj.evaluation.upload.OssToken r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.upload.UploadUtils.m10509c(java.lang.String, java.lang.String, com.zykj.evaluation.upload.OssToken, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/upload/UploadUtils.smali:533
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Object m10510d(String str, String str2, OssToken ossToken, Continuation continuation) {
        File file = new File(str);
        return BuildersKt.withContext(Dispatchers.getIO(), new UploadUtils$zyFsUpload$2(new C0060w.a().m396o(ossToken.getEndpoint() + "/" + str2).m383a(HttpHeaders.AUTHORIZATION, "bearer " + ossToken.getSecurityToken()).m383a("Checksum", "3f4e17759c6b9c6a364211895bbb2abdc0ba62db").m392k(new C0058u.a(null, 1, 0 == true ? 1 : 0).m286e(C0058u.f201k).m282a("file", file.getName(), AbstractC0061x.Companion.m406g(file, C0057t.f189e.m279b("multipart/form-data"))).m285d()).m384b(), null), continuation);
    }
}
