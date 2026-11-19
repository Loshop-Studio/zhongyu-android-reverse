package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import com.alibaba.sdk.android.oss.OSSClient;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.zykj.download.OssToken;
import com.zykj.download.OssUtils;
import com.zykj.download.data.DownloadEntity;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p256t7.AbstractC10117b;

@Keep
/* loaded from: classes4.dex */
public final class DownloadOssFileWork extends DownloadFileCommonWork {
    public static final C7290a Companion = new C7290a(null);
    public OssToken ossToken;

    /* renamed from: com.zykj.download.work.DownloadOssFileWork$a */
    public static final class C7290a {
        public /* synthetic */ C7290a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7290a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadOssFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        AbstractC9133u.m16133g(appContext, "appContext");
        AbstractC9133u.m16133g(workerParams, "workerParams");
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public Object downloadFile(DownloadEntity downloadEntity, InterfaceC9324c<? super C8736p> interfaceC9324c) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        AbstractC9133u.m16132f(applicationContext, "applicationContext");
        OSSClient ossClient = ossUtils.getOssClient(applicationContext, getOssToken());
        GetObjectRequest getObjectRequest = new GetObjectRequest(getOssToken().getBucket(), ossUtils.getObjectKey(getOssToken(), getDownloadUrl()));
        getObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        GetObjectResult object = ossClient.getObject(getObjectRequest);
        long contentLength = object.getContentLength();
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = new FileOutputStream(downloadEntity.m9192g());
        try {
            InputStream objectContent = object.getObjectContent();
            long j10 = 0;
            while (true) {
                try {
                    Integer numM17798c = AbstractC9536a.m17798c(objectContent.read(bArr));
                    int iIntValue = numM17798c.intValue();
                    C8736p c8736p = C8736p.f16368a;
                    if (-1 == numM17798c.intValue()) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iIntValue);
                    j10 += iIntValue;
                    getReceiverLengthLiveData().postValue(AbstractC9536a.m17799d(j10));
                    getProgressLiveData().postValue(AbstractC9536a.m17798c((int) ((j10 * 100.0f) / contentLength)));
                } finally {
                }
            }
            AbstractC10117b.m18861a(objectContent, null);
            AbstractC10117b.m18861a(fileOutputStream, null);
            String it = BinaryUtil.calculateBase64Md5(downloadEntity.m9192g());
            checkContentLength(contentLength, new File(downloadEntity.m9192g()));
            String contentMD5 = object.getMetadata().getContentMD5();
            AbstractC9133u.m16132f(contentMD5, "result.metadata.contentMD5");
            AbstractC9133u.m16132f(it, "it");
            checkMD5(contentMD5, it, downloadEntity.m9192g());
            Object objUpdateVerifyCode = getProxy().updateVerifyCode(downloadEntity, it, interfaceC9324c);
            return objUpdateVerifyCode == AbstractC9434a.m17291f() ? objUpdateVerifyCode : C8736p.f16368a;
        } finally {
        }
    }

    public final OssToken getOssToken() {
        OssToken ossToken = this.ossToken;
        if (ossToken != null) {
            return ossToken;
        }
        AbstractC9133u.m16151y("ossToken");
        throw null;
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        super.initParameter();
        try {
            OssUtils ossUtils = OssUtils.INSTANCE;
            Data inputData = getInputData();
            AbstractC9133u.m16132f(inputData, "inputData");
            setOssToken(ossUtils.getOssToken(inputData));
        } catch (NullPointerException e10) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e10);
        }
    }

    public final void setOssToken(OssToken ossToken) {
        AbstractC9133u.m16133g(ossToken, "<set-?>");
        this.ossToken = ossToken;
    }
}
