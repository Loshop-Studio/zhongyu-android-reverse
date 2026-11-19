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
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p094io.CloseableKt;
import p018b3.C4414b;

@Keep
@Metadata(m7879d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/download/work/DownloadOssFileWork;", "Lcom/zykj/download/work/DownloadFileCommonWork;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "initParameter", "()V", "Lb3/b;", "entity", "downloadFile", "(Lb3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/OssToken;", "ossToken", "Lcom/zykj/download/OssToken;", "getOssToken", "()Lcom/zykj/download/OssToken;", "setOssToken", "(Lcom/zykj/download/OssToken;)V", "Companion", "a", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class DownloadOssFileWork extends DownloadFileCommonWork {
    public OssToken ossToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadOssFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public Object downloadFile(C4414b c4414b, Continuation<? super Unit> continuation) throws RemoteCodeException {
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        OSSClient ossClient = ossUtils.getOssClient(applicationContext, getOssToken());
        GetObjectRequest getObjectRequest = new GetObjectRequest(getOssToken().getBucket(), ossUtils.getObjectKey(getOssToken(), getDownloadUrl()));
        getObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        GetObjectResult object = ossClient.getObject(getObjectRequest);
        long contentLength = object.getContentLength();
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = new FileOutputStream(c4414b.m1481g());
        try {
            InputStream objectContent = object.getObjectContent();
            long j6 = 0;
            while (true) {
                try {
                    Integer numBoxInt = Boxing.boxInt(objectContent.read(bArr));
                    int iIntValue = numBoxInt.intValue();
                    Unit unit = Unit.INSTANCE;
                    if (-1 == numBoxInt.intValue()) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iIntValue);
                    j6 += iIntValue;
                    getReceiverLengthLiveData().postValue(Boxing.boxLong(j6));
                    getProgressLiveData().postValue(Boxing.boxInt((int) ((j6 * 100.0f) / contentLength)));
                } finally {
                }
            }
            CloseableKt.closeFinally(objectContent, null);
            CloseableKt.closeFinally(fileOutputStream, null);
            String it = BinaryUtil.calculateBase64Md5(c4414b.m1481g());
            checkContentLength(contentLength, new File(c4414b.m1481g()));
            String contentMD5 = object.getMetadata().getContentMD5();
            Intrinsics.checkNotNullExpressionValue(contentMD5, "result.metadata.contentMD5");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            checkMD5(contentMD5, it, c4414b.m1481g());
            Object objUpdateVerifyCode = getProxy().updateVerifyCode(c4414b, it, continuation);
            return objUpdateVerifyCode == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateVerifyCode : Unit.INSTANCE;
        } finally {
        }
    }

    public final OssToken getOssToken() {
        OssToken ossToken = this.ossToken;
        if (ossToken != null) {
            return ossToken;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ossToken");
        throw null;
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public void initParameter() throws RemoteCodeException {
        super.initParameter();
        try {
            OssUtils ossUtils = OssUtils.INSTANCE;
            Data inputData = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
            setOssToken(ossUtils.getOssToken(inputData));
        } catch (NullPointerException e6) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e6);
        }
    }

    public final void setOssToken(OssToken ossToken) {
        Intrinsics.checkNotNullParameter(ossToken, "<set-?>");
        this.ossToken = ossToken;
    }
}
