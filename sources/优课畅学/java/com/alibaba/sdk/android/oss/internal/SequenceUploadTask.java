package com.alibaba.sdk.android.oss.internal;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.OSSSharedPreferences;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public class SequenceUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private long mFirstPartSize;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public SequenceUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void abortThisUpload() throws ExecutionException, InterruptedException {
        if (this.mUploadId != null) {
            this.mApiOperation.abortMultipartUpload(new AbortMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId), null).waitUntilFinished();
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void checkException() throws Throwable {
        ObjectOutputStream objectOutputStream;
        if (this.mContext.getCancellationHandler().isCancelled()) {
            if (((ResumableUploadRequest) this.mRequest).deleteUploadOnCancelling().booleanValue()) {
                abortThisUpload();
                File file = this.mRecordFile;
                if (file != null) {
                    file.delete();
                }
            } else {
                List<PartETag> list = this.mPartETags;
                if (list != null && list.size() > 0 && this.mCheckCRC64 && ((ResumableUploadRequest) this.mRequest).getRecordDirectory() != null) {
                    HashMap map = new HashMap();
                    for (PartETag partETag : this.mPartETags) {
                        map.put(Integer.valueOf(partETag.getPartNumber()), Long.valueOf(partETag.getCRC64()));
                    }
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + File.separator + this.mUploadId);
                            this.mCRC64RecordFile = file2;
                            if (!file2.exists()) {
                                this.mCRC64RecordFile.createNewFile();
                            }
                            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.mCRC64RecordFile));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e10) {
                        e = e10;
                    }
                    try {
                        objectOutputStream.writeObject(map);
                        objectOutputStream.close();
                    } catch (IOException e11) {
                        e = e11;
                        objectOutputStream2 = objectOutputStream;
                        OSSLog.logThrowable2Local(e);
                        if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                        super.checkException();
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream2 = objectOutputStream;
                        if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                        throw th;
                    }
                }
            }
        }
        super.checkException();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c A[Catch: ClientException -> 0x01c2, ServiceException -> 0x01c4, TryCatch #6 {ClientException -> 0x01c2, ServiceException -> 0x01c4, blocks: (B:47:0x0163, B:48:0x0176, B:50:0x017c, B:52:0x0198, B:54:0x019e, B:56:0x01ac, B:61:0x01c6, B:63:0x01e3), top: B:94:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initMultipartUploadId() throws java.util.concurrent.ExecutionException, com.alibaba.sdk.android.oss.ServiceException, java.lang.InterruptedException, com.alibaba.sdk.android.oss.ClientException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.internal.SequenceUploadTask.initMultipartUploadId():void");
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) throws IOException {
        if (this.mUploadException == null || !exc.getMessage().equals(this.mUploadException.getMessage())) {
            this.mUploadException = exc;
        }
        OSSLog.logThrowable2Local(exc);
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mIsCancel) {
            return;
        }
        this.mIsCancel = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0 A[Catch: IOException -> 0x01c7, TRY_LEAVE, TryCatch #8 {IOException -> 0x01c7, blocks: (B:94:0x01c3, B:98:0x01cb, B:100:0x01d0), top: B:106:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_ENTER, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[Catch: IOException -> 0x0114, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e A[Catch: all -> 0x00e0, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b8 A[Catch: IOException -> 0x0114, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb A[Catch: IOException -> 0x01c7, TryCatch #8 {IOException -> 0x01c7, blocks: (B:94:0x01c3, B:98:0x01cb, B:100:0x01d0), top: B:106:0x01c3 }] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask, com.alibaba.sdk.android.oss.internal.SequenceUploadTask] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.alibaba.sdk.android.oss.model.UploadPartRequest] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uploadPart(int r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.internal.SequenceUploadTask.uploadPart(int, int, int):void");
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPartFinish(PartETag partETag) {
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mSp.contains(this.mUploadId)) {
            return;
        }
        this.mSp.setStringValue(this.mUploadId, String.valueOf(this.mUploadedLength));
        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public ResumableUploadResult doMultipartUpload() throws Throwable {
        long j10 = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (this.mFirstPartSize != i10) {
                throw new ClientException("The part size setting is inconsistent with before");
            }
            if (!TextUtils.isEmpty(this.mSp.getStringValue(this.mUploadId))) {
                jLongValue = Long.valueOf(this.mSp.getStringValue(this.mUploadId)).longValue();
            }
            long j11 = jLongValue;
            OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
            if (oSSProgressCallback != 0) {
                oSSProgressCallback.onProgress(this.mRequest, j11, this.mFileLength);
            }
            this.mSp.removeKey(this.mUploadId);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i12 + 1))) {
                if (i12 == i11 - 1) {
                    i10 = (int) (this.mFileLength - j10);
                }
                OSSLog.logDebug("upload part readByte : " + i10);
                j10 += (long) i10;
                uploadPart(i12, i10, i11);
                if (this.mUploadException != null) {
                    break;
                }
            }
        }
        checkException();
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadResult();
        ResumableUploadResult resumableUploadResult = completeMultipartUploadResult != null ? new ResumableUploadResult(completeMultipartUploadResult) : null;
        File file = this.mRecordFile;
        if (file != null) {
            file.delete();
        }
        File file2 = this.mCRC64RecordFile;
        if (file2 != null) {
            file2.delete();
        }
        return resumableUploadResult;
    }
}
