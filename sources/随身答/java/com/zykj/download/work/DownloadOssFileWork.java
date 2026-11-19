package com.zykj.download.work;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.content.Context;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Data;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p161io.CloseableKt;
import p283w5.C9827b;

@Keep
@Metadata(m13412d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/download/work/DownloadOssFileWork;", "Lcom/zykj/download/work/DownloadFileCommonWork;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "initParameter", "()V", "Lw5/b;", "entity", "downloadFile", "(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/download/OssToken;", "ossToken", "Lcom/zykj/download/OssToken;", "getOssToken", "()Lcom/zykj/download/OssToken;", "setOssToken", "(Lcom/zykj/download/OssToken;)V", "Companion", "a", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class DownloadOssFileWork extends DownloadFileCommonWork {
    public OssToken ossToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadOssFileWork(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    @Override // com.zykj.download.work.DownloadFileCommonWork, com.zykj.download.work.DownloadFileWork
    public Object downloadFile(C9827b c9827b, Continuation<? super Unit> continuation) throws ServiceException, ClientException, IOException, SecurityException {
        OssUtils ossUtils = OssUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        OSSClient ossClient = ossUtils.getOssClient(applicationContext, getOssToken());
        GetObjectRequest getObjectRequest = new GetObjectRequest(getOssToken().getBucket(), ossUtils.getObjectKey(getOssToken(), getDownloadUrl()));
        getObjectRequest.setCRC64(OSSRequest.CRC64Config.YES);
        GetObjectResult object = ossClient.getObject(getObjectRequest);
        long contentLength = object.getContentLength();
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = new FileOutputStream(c9827b.m16746g());
        try {
            InputStream objectContent = object.getObjectContent();
            long j9 = 0;
            while (true) {
                try {
                    Integer numBoxInt = Boxing.boxInt(objectContent.read(bArr));
                    int iIntValue = numBoxInt.intValue();
                    Unit unit = Unit.INSTANCE;
                    if (-1 == numBoxInt.intValue()) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iIntValue);
                    j9 += iIntValue;
                    getReceiverLengthLiveData().postValue(Boxing.boxLong(j9));
                    getProgressLiveData().postValue(Boxing.boxInt((int) ((j9 * 100.0f) / contentLength)));
                } finally {
                }
            }
            CloseableKt.closeFinally(objectContent, null);
            CloseableKt.closeFinally(fileOutputStream, null);
            String it = BinaryUtil.calculateBase64Md5(c9827b.m16746g());
            checkContentLength(contentLength, new File(c9827b.m16746g()));
            String contentMD5 = object.getMetadata().getContentMD5();
            Intrinsics.checkNotNullExpressionValue(contentMD5, "result.metadata.contentMD5");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            checkMD5(contentMD5, it, c9827b.m16746g());
            Object objUpdateVerifyCode = getProxy().updateVerifyCode(c9827b, it, continuation);
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
        } catch (NullPointerException e10) {
            throw new RemoteCodeException(ErrorCode.FILE_NO_FOUND, e10);
        }
    }

    public final void setOssToken(OssToken ossToken) {
        Intrinsics.checkNotNullParameter(ossToken, "<set-?>");
        this.ossToken = ossToken;
    }
}
