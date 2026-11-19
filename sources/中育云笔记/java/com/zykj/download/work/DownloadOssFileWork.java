package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import cd.AbstractC5423b;
import com.alibaba.sdk.android.oss.OSSClient;
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
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p407xa.C11817b;
import p409xc.AbstractC11826a;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public final class DownloadOssFileWork extends DownloadFileCommonWork {
    public static final C8570a Companion = new C8570a(null);
    public OssToken ossToken;

    /* renamed from: com.zykj.download.work.DownloadOssFileWork$a */
    public static final class C8570a {
        public /* synthetic */ C8570a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8570a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadOssFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9979u.m20294g(appContext, "appContext");
        AbstractC9979u.m20294g(workerParams, "workerParams");
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public Object downloadFile(C11817b c11817b, InterfaceC11588c<? super C10786q> interfaceC11588c) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        AbstractC9979u.m20293f(applicationContext, "applicationContext");
        OSSClient ossClient = ossUtils.getOssClient(applicationContext, getOssToken());
        GetObjectRequest getObjectRequest = new GetObjectRequest(getOssToken().getBucket(), ossUtils.getObjectKey(getOssToken(), getDownloadUrl()));
        getObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        GetObjectResult object = ossClient.getObject(getObjectRequest);
        long contentLength = object.getContentLength();
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = new FileOutputStream(c11817b.m26189g());
        try {
            InputStream objectContent = object.getObjectContent();
            long j10 = 0;
            while (true) {
                try {
                    Integer numM26208c = AbstractC11826a.m26208c(objectContent.read(bArr));
                    int iIntValue = numM26208c.intValue();
                    C10786q c10786q = C10786q.f26013a;
                    if (-1 == numM26208c.intValue()) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iIntValue);
                    j10 += iIntValue;
                    getReceiverLengthLiveData().postValue(AbstractC11826a.m26209d(j10));
                    getProgressLiveData().postValue(AbstractC11826a.m26208c((int) ((j10 * 100.0f) / contentLength)));
                } finally {
                }
            }
            AbstractC5423b.m2902a(objectContent, null);
            AbstractC5423b.m2902a(fileOutputStream, null);
            String it = BinaryUtil.calculateBase64Md5(c11817b.m26189g());
            checkContentLength(contentLength, new File(c11817b.m26189g()));
            String contentMD5 = object.getMetadata().getContentMD5();
            AbstractC9979u.m20293f(contentMD5, "result.metadata.contentMD5");
            AbstractC9979u.m20293f(it, "it");
            checkMD5(contentMD5, it, c11817b.m26189g());
            Object objUpdateVerifyCode = getProxy().updateVerifyCode(c11817b, it, interfaceC11588c);
            return objUpdateVerifyCode == AbstractC11725a.m25952f() ? objUpdateVerifyCode : C10786q.f26013a;
        } finally {
        }
    }

    public final OssToken getOssToken() {
        OssToken ossToken = this.ossToken;
        if (ossToken != null) {
            return ossToken;
        }
        AbstractC9979u.m20312y("ossToken");
        throw null;
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        super.initParameter();
        try {
            OssUtils ossUtils = OssUtils.INSTANCE;
            Data inputData = getInputData();
            AbstractC9979u.m20293f(inputData, "inputData");
            setOssToken(ossUtils.getOssToken(inputData));
        } catch (NullPointerException e10) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e10);
        }
    }

    public final void setOssToken(OssToken ossToken) {
        AbstractC9979u.m20294g(ossToken, "<set-?>");
        this.ossToken = ossToken;
    }
}
