package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.C0810a;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.zykj.download.OssToken;
import com.zykj.download.OssUtils;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.C2746b;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p162v1.C3419b;
import p163v2.C3424a;

@Keep
/* loaded from: classes.dex */
public final class DownloadOssFileWork extends DownloadFileCommonWork {

    @NotNull
    public static final C2387a Companion = new C2387a(null);
    public OssToken ossToken;

    /* renamed from: com.zykj.download.work.DownloadOssFileWork$a */
    public static final class C2387a {
        private C2387a() {
        }

        public /* synthetic */ C2387a(C2764g c2764g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadOssFileWork(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(workerParams, "workerParams");
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    @Nullable
    public Object downloadFile(@NotNull C3419b c3419b, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) throws ServiceException, ClientException, IOException, SecurityException {
        C2925r c2925r;
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        C2769l.m9240d(applicationContext, "applicationContext");
        OSSClient ossClient = ossUtils.getOssClient(applicationContext, getOssToken());
        GetObjectRequest getObjectRequest = new GetObjectRequest(getOssToken().getBucket(), ossUtils.getObjectKey(getOssToken(), getDownloadUrl()));
        getObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        GetObjectResult object = ossClient.getObject(getObjectRequest);
        long contentLength = object.getContentLength();
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = new FileOutputStream(c3419b.m10425g());
        long j4 = 0;
        try {
            InputStream objectContent = object.getObjectContent();
            while (true) {
                try {
                    Integer numM9204c = C2746b.m9204c(objectContent.read(bArr));
                    int iIntValue = numM9204c.intValue();
                    c2925r = C2925r.f11415a;
                    if (-1 == numM9204c.intValue()) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iIntValue);
                    j4 += iIntValue;
                    getReceiverLengthLiveData().postValue(C2746b.m9205d(j4));
                    getProgressLiveData().postValue(C2746b.m9204c((int) ((j4 * 100.0f) / contentLength)));
                } finally {
                }
            }
            C3424a.m10441a(objectContent, null);
            C3424a.m10441a(fileOutputStream, null);
            String it = BinaryUtil.calculateBase64Md5(c3419b.m10425g());
            checkContentLength(contentLength, new File(c3419b.m10425g()));
            String contentMD5 = object.getMetadata().getContentMD5();
            C2769l.m9240d(contentMD5, "result.metadata.contentMD5");
            C2769l.m9240d(it, "it");
            checkMD5(contentMD5, it, c3419b.m10425g());
            Object objUpdateVerifyCode = getProxy().updateVerifyCode(c3419b, it, interfaceC3012d);
            return objUpdateVerifyCode == C3033d.m10175c() ? objUpdateVerifyCode : c2925r;
        } finally {
        }
    }

    @NotNull
    public final OssToken getOssToken() {
        OssToken ossToken = this.ossToken;
        if (ossToken != null) {
            return ossToken;
        }
        C2769l.m9256t("ossToken");
        throw null;
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        super.initParameter();
        try {
            OssUtils ossUtils = OssUtils.INSTANCE;
            C0810a inputData = getInputData();
            C2769l.m9240d(inputData, "inputData");
            setOssToken(ossUtils.getOssToken(inputData));
        } catch (NullPointerException e4) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e4);
        }
    }

    public final void setOssToken(@NotNull OssToken ossToken) {
        C2769l.m9241e(ossToken, "<set-?>");
        this.ossToken = ossToken;
    }
}
