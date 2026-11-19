package com.alibaba.sdk.android.oss.internal;

import android.util.Log;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.exception.InconsistentException;
import com.alibaba.sdk.android.oss.model.GetObjectMetaRequest;
import com.alibaba.sdk.android.oss.model.GetObjectMetaResult;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.OSSResult;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.Range;
import com.alibaba.sdk.android.oss.model.ResumableDownloadRequest;
import com.alibaba.sdk.android.oss.model.ResumableDownloadResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;

/* loaded from: classes3.dex */
public class ResumableDownloadTask<Requst extends ResumableDownloadRequest, Result extends ResumableDownloadResult> implements Callable<Result> {
    protected static final String TEMP_SUFFIX = ".temp";
    protected final int CPU_SIZE;
    protected final int KEEP_ALIVE_TIME;
    protected final int MAX_CORE_POOL_SIZE;
    protected final int MAX_IMUM_POOL_SIZE;
    protected final int MAX_QUEUE_SIZE;
    protected final int PART_SIZE_ALIGN_NUM;
    protected String checkpointPath;
    protected long completedPartSize;
    protected long downloadPartSize;
    private CheckPoint mCheckPoint;
    private OSSCompletedCallback mCompletedCallback;
    private ExecutionContext mContext;
    protected Exception mDownloadException;
    protected Object mLock;
    private InternalRequestOperation mOperation;
    protected long mPartExceptionCount;
    protected ThreadPoolExecutor mPoolExecutor;
    private OSSProgressCallback mProgressCallback;
    private ResumableDownloadRequest mRequest;

    public static class CheckPoint implements Serializable {
        private static final long serialVersionUID = -8470273912385636504L;
        public String bucketName;
        public String downloadFile;
        public long downloadLength;
        public FileStat fileStat;
        public int md5;
        public String objectKey;
        public ArrayList<DownloadPart> parts;

        private void assign(CheckPoint checkPoint) {
            this.md5 = checkPoint.md5;
            this.downloadFile = checkPoint.downloadFile;
            this.bucketName = checkPoint.bucketName;
            this.objectKey = checkPoint.objectKey;
            this.fileStat = checkPoint.fileStat;
            this.parts = checkPoint.parts;
            this.downloadLength = checkPoint.downloadLength;
        }

        public synchronized void dump(String str) {
            FileOutputStream fileOutputStream;
            ObjectOutputStream objectOutputStream;
            this.md5 = hashCode();
            File file = new File(str + ResumableDownloadTask.TEMP_SUFFIX);
            ObjectOutputStream objectOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            try {
                objectOutputStream.writeObject(this);
                file.renameTo(new File(str));
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream2 = objectOutputStream;
                if (objectOutputStream2 != null) {
                    objectOutputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }

        public int hashCode() {
            String str = this.bucketName;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            String str2 = this.downloadFile;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.objectKey;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            FileStat fileStat = this.fileStat;
            int iHashCode4 = (iHashCode3 + (fileStat == null ? 0 : fileStat.hashCode())) * 31;
            ArrayList<DownloadPart> arrayList = this.parts;
            int iHashCode5 = (iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
            long j10 = this.downloadLength;
            return iHashCode5 + ((int) (j10 ^ (j10 >>> 32)));
        }

        public synchronized boolean isValid(InternalRequestOperation internalRequestOperation) {
            if (this.md5 != hashCode()) {
                return false;
            }
            FileStat fileStat = FileStat.getFileStat(internalRequestOperation, this.bucketName, this.objectKey);
            FileStat fileStat2 = this.fileStat;
            Date date = fileStat2.lastModified;
            if (date == null) {
                if (fileStat2.fileLength != fileStat.fileLength || !fileStat2.etag.equals(fileStat.etag)) {
                    return false;
                }
            } else if (fileStat2.fileLength != fileStat.fileLength || !date.equals(fileStat.lastModified) || !this.fileStat.etag.equals(fileStat.etag)) {
                return false;
            }
            return true;
        }

        public synchronized void load(String str) {
            FileInputStream fileInputStream;
            Throwable th;
            ObjectInputStream objectInputStream;
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream = null;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
                th = th3;
                objectInputStream = null;
            }
            try {
                assign((CheckPoint) objectInputStream.readObject());
                objectInputStream.close();
                fileInputStream.close();
            } catch (Throwable th4) {
                th = th4;
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }

        public synchronized void update(int i10, boolean z10) {
            this.parts.get(i10).isCompleted = z10;
            this.downloadLength += this.parts.get(i10).length;
        }
    }

    public class DownloadFileResult extends OSSResult {
        public ObjectMetadata metadata;
        public ArrayList<DownloadPartResult> partResults;

        public DownloadFileResult() {
        }
    }

    public static class DownloadPart implements Serializable {
        private static final long serialVersionUID = -3506020776131733942L;
        public long crc;
        public long end;
        public long fileStart;
        public boolean isCompleted;
        public long length;
        public int partNumber;
        public long start;

        public int hashCode() {
            int i10 = (((this.partNumber + 31) * 31) + (this.isCompleted ? 1231 : 1237)) * 31;
            long j10 = this.end;
            int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.start;
            long j12 = this.crc;
            return ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
        }
    }

    public static class DownloadPartResult {
        public Long clientCRC;
        public long length;
        public int partNumber;
        public String requestId;
    }

    public static class FileStat implements Serializable {
        private static final long serialVersionUID = 3896323364904643963L;
        public String etag;
        public long fileLength;
        public Date lastModified;
        public String md5;
        public String requestId;
        public Long serverCRC;

        public static FileStat getFileStat(InternalRequestOperation internalRequestOperation, String str, String str2) {
            GetObjectMetaResult getObjectMetaResult = (GetObjectMetaResult) internalRequestOperation.getObjectMeta(new GetObjectMetaRequest(str, str2), null).getResult();
            FileStat fileStat = new FileStat();
            fileStat.fileLength = getObjectMetaResult.getMetadata().getContentLength();
            fileStat.etag = getObjectMetaResult.getMetadata().getETag();
            fileStat.lastModified = getObjectMetaResult.getMetadata().getLastModified();
            fileStat.serverCRC = getObjectMetaResult.getServerCRC();
            fileStat.requestId = getObjectMetaResult.getRequestId();
            return fileStat;
        }

        public int hashCode() {
            String str = this.etag;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            Date date = this.lastModified;
            int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 31;
            long j10 = this.fileLength;
            return iHashCode2 + ((int) (j10 ^ (j10 >>> 32)));
        }
    }

    public ResumableDownloadTask(InternalRequestOperation internalRequestOperation, ResumableDownloadRequest resumableDownloadRequest, OSSCompletedCallback oSSCompletedCallback, ExecutionContext executionContext) {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.CPU_SIZE = iAvailableProcessors;
        int iIntValue = iAvailableProcessors < 5 ? iAvailableProcessors : 5;
        this.MAX_CORE_POOL_SIZE = iIntValue;
        this.MAX_IMUM_POOL_SIZE = iAvailableProcessors;
        this.KEEP_ALIVE_TIME = 3000;
        this.PART_SIZE_ALIGN_NUM = 4096;
        this.MAX_QUEUE_SIZE = DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT;
        this.mLock = new Object();
        this.mRequest = resumableDownloadRequest;
        this.mOperation = internalRequestOperation;
        this.mCompletedCallback = oSSCompletedCallback;
        this.mContext = executionContext;
        this.mProgressCallback = resumableDownloadRequest.getProgressListener();
        if (resumableDownloadRequest.getThreadNum() != null && resumableDownloadRequest.getThreadNum().intValue() > 0) {
            iIntValue = resumableDownloadRequest.getThreadNum().intValue();
            iAvailableProcessors = resumableDownloadRequest.getThreadNum().intValue();
        }
        this.mPoolExecutor = new ThreadPoolExecutor(iIntValue, iAvailableProcessors, 3000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT), new ThreadFactory() { // from class: com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "oss-android-multipart-thread");
            }
        });
    }

    private static Long calcObjectCRCFromParts(List<DownloadPartResult> list) {
        long jCombine = 0;
        for (DownloadPartResult downloadPartResult : list) {
            Long l10 = downloadPartResult.clientCRC;
            if (l10 == null || downloadPartResult.length <= 0) {
                return null;
            }
            jCombine = CRC64.combine(jCombine, l10.longValue(), downloadPartResult.length);
        }
        return new Long(jCombine);
    }

    private long ceilPartSize(long j10) {
        return ((j10 + 4095) / 4096) * 4096;
    }

    private void checkPartSize(long j10, int[] iArr) {
        long partSize = this.mRequest.getPartSize();
        OSSLog.logDebug("[checkPartSize] - mFileLength : " + j10);
        OSSLog.logDebug("[checkPartSize] - partSize : " + partSize);
        long j11 = j10 / partSize;
        if (j10 % partSize != 0) {
            j11++;
        }
        if (j11 != 1) {
            if (j11 > DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT) {
                partSize = ceilPartSize(j10 / 4999);
                j11 = (j10 / partSize) + (j10 % partSize != 0 ? 1L : 0L);
            }
            j10 = partSize;
        }
        int i10 = (int) j10;
        iArr[0] = i10;
        iArr[1] = (int) j11;
        OSSLog.logDebug("[checkPartSize] - partNumber : " + j11);
        OSSLog.logDebug("[checkPartSize] - partSize : " + i10);
    }

    private void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    private Range correctRange(Range range, long j10) {
        if (range != null) {
            begin = range.getBegin() != -1 ? range.getBegin() : 0L;
            j10 = range.getEnd() == -1 ? j10 - begin : range.getEnd() - range.getBegin();
        }
        return new Range(begin, j10 + begin);
    }

    private void createFile(String str, long j10) throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile(new File(str), "rw");
            try {
                randomAccessFile.setLength(j10);
                randomAccessFile.close();
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192 A[Catch: IOException -> 0x018d, TRY_LEAVE, TryCatch #5 {IOException -> 0x018d, blocks: (B:61:0x0189, B:65:0x0192), top: B:72:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void downloadPart(com.alibaba.sdk.android.oss.internal.ResumableDownloadTask<Requst, Result>.DownloadFileResult r12, com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.DownloadPart r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.downloadPart(com.alibaba.sdk.android.oss.internal.ResumableDownloadTask$DownloadFileResult, com.alibaba.sdk.android.oss.internal.ResumableDownloadTask$DownloadPart):void");
    }

    private void initCheckPoint() throws Throwable {
        FileStat fileStat = FileStat.getFileStat(this.mOperation, this.mRequest.getBucketName(), this.mRequest.getObjectKey());
        Range rangeCorrectRange = correctRange(this.mRequest.getRange(), fileStat.fileLength);
        createFile(this.mRequest.getTempFilePath(), rangeCorrectRange.getEnd() - rangeCorrectRange.getBegin());
        this.mCheckPoint.bucketName = this.mRequest.getBucketName();
        this.mCheckPoint.objectKey = this.mRequest.getObjectKey();
        CheckPoint checkPoint = this.mCheckPoint;
        checkPoint.fileStat = fileStat;
        checkPoint.parts = splitFile(rangeCorrectRange, fileStat.fileLength, this.mRequest.getPartSize());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void moveFile(java.io.File r5, java.io.File r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5.renameTo(r6)
            if (r0 != 0) goto L62
            java.lang.String r0 = "moveFile"
            java.lang.String r1 = "rename"
            android.util.Log.i(r0, r1)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L50 java.io.FileNotFoundException -> L53
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L50 java.io.FileNotFoundException -> L53
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4d
            r4.copyFile(r1, r2)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            boolean r6 = r5.delete()     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            if (r6 == 0) goto L28
            r1.close()
            r2.close()
            return
        L28:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            java.lang.String r3 = "Failed to delete original file '"
            r0.append(r3)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            r0.append(r5)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            java.lang.String r5 = "'"
            r0.append(r5)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
            throw r6     // Catch: java.lang.Throwable -> L44 java.io.FileNotFoundException -> L47
        L44:
            r5 = move-exception
        L45:
            r0 = r1
            goto L57
        L47:
            r5 = move-exception
        L48:
            r0 = r1
            goto L55
        L4a:
            r5 = move-exception
            r2 = r0
            goto L45
        L4d:
            r5 = move-exception
            r2 = r0
            goto L48
        L50:
            r5 = move-exception
            r2 = r0
            goto L57
        L53:
            r5 = move-exception
            r2 = r0
        L55:
            throw r5     // Catch: java.lang.Throwable -> L56
        L56:
            r5 = move-exception
        L57:
            if (r0 == 0) goto L5c
            r0.close()
        L5c:
            if (r2 == 0) goto L61
            r2.close()
        L61:
            throw r5
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.moveFile(java.io.File, java.io.File):void");
    }

    private ArrayList<DownloadPart> splitFile(Range range, long j10, long j11) {
        int i10 = 0;
        if (j10 <= 0) {
            DownloadPart downloadPart = new DownloadPart();
            downloadPart.start = 0L;
            downloadPart.end = -1L;
            downloadPart.length = 0L;
            downloadPart.partNumber = 0;
            ArrayList<DownloadPart> arrayList = new ArrayList<>();
            arrayList.add(downloadPart);
            return arrayList;
        }
        long begin = range.getBegin();
        long end = range.getEnd() - range.getBegin();
        int[] iArr = new int[2];
        checkPartSize(end, iArr);
        long j12 = iArr[0];
        long j13 = iArr[1];
        ArrayList<DownloadPart> arrayList2 = new ArrayList<>();
        while (true) {
            long j14 = i10;
            if (j14 >= j13) {
                return arrayList2;
            }
            DownloadPart downloadPart2 = new DownloadPart();
            long j15 = j14 * j12;
            long j16 = begin + j15;
            downloadPart2.start = j16;
            long j17 = begin;
            int i11 = i10 + 1;
            long j18 = (j17 + (i11 * j12)) - 1;
            downloadPart2.end = j18;
            downloadPart2.length = (j18 - j16) + 1;
            long j19 = j17 + end;
            if (j18 >= j19) {
                downloadPart2.end = -1L;
                downloadPart2.length = j19 - j16;
            }
            downloadPart2.partNumber = i10;
            downloadPart2.fileStart = j15;
            arrayList2.add(downloadPart2);
            i10 = i11;
            begin = j17;
        }
    }

    public void checkCancel() throws ClientException {
        if (this.mContext.getCancellationHandler().isCancelled()) {
            TaskCancelException taskCancelException = new TaskCancelException("Resumable download cancel");
            throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
        }
    }

    public void checkException() throws ServiceException, ClientException, IOException {
        if (this.mDownloadException != null) {
            releasePool();
            Exception exc = this.mDownloadException;
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            if (exc instanceof ServiceException) {
                throw ((ServiceException) exc);
            }
            if (!(exc instanceof ClientException)) {
                throw new ClientException(this.mDownloadException.getMessage(), this.mDownloadException);
            }
            throw ((ClientException) exc);
        }
    }

    public void checkInitData() throws Throwable {
        if (this.mRequest.getRange() != null && !this.mRequest.getRange().checkIsValid()) {
            throw new ClientException("Range is invalid");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mRequest.getBucketName());
        sb2.append(this.mRequest.getObjectKey());
        sb2.append(String.valueOf(this.mRequest.getPartSize()));
        sb2.append(this.mRequest.getCRC64() == OSSRequest.CRC64Config.YES ? "-crc64" : "");
        this.checkpointPath = this.mRequest.getCheckPointFilePath() + File.separator + BinaryUtil.calculateMd5Str(sb2.toString().getBytes());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.checkpointPath);
        sb3.append(TEMP_SUFFIX);
        String string = sb3.toString();
        this.mCheckPoint = new CheckPoint();
        if (!this.mRequest.getEnableCheckPoint().booleanValue()) {
            initCheckPoint();
            return;
        }
        try {
            this.mCheckPoint.load(this.checkpointPath);
        } catch (Exception unused) {
            removeFile(this.checkpointPath);
            removeFile(string);
            removeFile(this.mRequest.getTempFilePath());
        }
        if (this.mCheckPoint.isValid(this.mOperation)) {
            return;
        }
        removeFile(this.checkpointPath);
        removeFile(string);
        removeFile(this.mRequest.getTempFilePath());
        initCheckPoint();
    }

    public boolean checkWaitCondition(int i10) {
        return this.completedPartSize != ((long) i10);
    }

    public ResumableDownloadResult doMultipartDownload() throws Throwable {
        String str = this.checkpointPath + TEMP_SUFFIX;
        checkCancel();
        ResumableDownloadResult resumableDownloadResult = new ResumableDownloadResult();
        final DownloadFileResult downloadFileResult = new DownloadFileResult();
        downloadFileResult.partResults = new ArrayList<>();
        ArrayList<DownloadPart> arrayList = this.mCheckPoint.parts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            DownloadPart downloadPart = arrayList.get(i10);
            i10++;
            final DownloadPart downloadPart2 = downloadPart;
            checkException();
            ThreadPoolExecutor threadPoolExecutor = this.mPoolExecutor;
            if (threadPoolExecutor == null || downloadPart2.isCompleted) {
                DownloadPartResult downloadPartResult = new DownloadPartResult();
                downloadPartResult.partNumber = downloadPart2.partNumber;
                downloadPartResult.requestId = this.mCheckPoint.fileStat.requestId;
                downloadPartResult.length = downloadPart2.length;
                if (this.mRequest.getCRC64() == OSSRequest.CRC64Config.YES) {
                    downloadPartResult.clientCRC = Long.valueOf(downloadPart2.crc);
                }
                downloadFileResult.partResults.add(downloadPartResult);
                this.downloadPartSize++;
                this.completedPartSize++;
            } else {
                threadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.2
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        ResumableDownloadTask.this.downloadPart(downloadFileResult, downloadPart2);
                        Log.i("partResults", "start: " + downloadPart2.start + ", end: " + downloadPart2.end);
                    }
                });
            }
        }
        if (checkWaitCondition(this.mCheckPoint.parts.size())) {
            synchronized (this.mLock) {
                this.mLock.wait();
            }
        }
        checkException();
        Collections.sort(downloadFileResult.partResults, new Comparator<DownloadPartResult>() { // from class: com.alibaba.sdk.android.oss.internal.ResumableDownloadTask.3
            @Override // java.util.Comparator
            public int compare(DownloadPartResult downloadPartResult2, DownloadPartResult downloadPartResult3) {
                return downloadPartResult2.partNumber - downloadPartResult3.partNumber;
            }
        });
        if (this.mRequest.getCRC64() == OSSRequest.CRC64Config.YES && this.mRequest.getRange() == null) {
            Long lCalcObjectCRCFromParts = calcObjectCRCFromParts(downloadFileResult.partResults);
            resumableDownloadResult.setClientCRC(lCalcObjectCRCFromParts);
            try {
                OSSUtils.checkChecksum(lCalcObjectCRCFromParts, this.mCheckPoint.fileStat.serverCRC, downloadFileResult.partResults.get(0).requestId);
            } catch (InconsistentException e10) {
                removeFile(this.checkpointPath);
                removeFile(str);
                removeFile(this.mRequest.getTempFilePath());
                throw e10;
            }
        }
        removeFile(this.checkpointPath);
        removeFile(str);
        moveFile(new File(this.mRequest.getTempFilePath()), new File(this.mRequest.getDownloadToFilePath()));
        resumableDownloadResult.setServerCRC(this.mCheckPoint.fileStat.serverCRC);
        resumableDownloadResult.setMetadata(downloadFileResult.metadata);
        resumableDownloadResult.setRequestId(downloadFileResult.partResults.get(0).requestId);
        resumableDownloadResult.setStatusCode(200);
        return resumableDownloadResult;
    }

    public void notifyMultipartThread() {
        this.mLock.notify();
        this.mPartExceptionCount = 0L;
    }

    public void processException(Exception exc) {
        synchronized (this.mLock) {
            try {
                this.mPartExceptionCount++;
                if (this.mDownloadException == null) {
                    this.mDownloadException = exc;
                    this.mLock.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releasePool() {
        ThreadPoolExecutor threadPoolExecutor = this.mPoolExecutor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.getQueue().clear();
            this.mPoolExecutor.shutdown();
        }
    }

    public boolean removeFile(String str) {
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }

    @Override // java.util.concurrent.Callable
    public Result call() throws Throwable {
        try {
            checkInitData();
            Result result = (Result) doMultipartDownload();
            OSSCompletedCallback oSSCompletedCallback = this.mCompletedCallback;
            if (oSSCompletedCallback == null) {
                return result;
            }
            oSSCompletedCallback.onSuccess(this.mRequest, result);
            return result;
        } catch (ServiceException e10) {
            OSSCompletedCallback oSSCompletedCallback2 = this.mCompletedCallback;
            if (oSSCompletedCallback2 != null) {
                oSSCompletedCallback2.onFailure(this.mRequest, null, e10);
            }
            throw e10;
        } catch (Exception e11) {
            ClientException clientException = e11 instanceof ClientException ? (ClientException) e11 : new ClientException(e11.toString(), e11);
            OSSCompletedCallback oSSCompletedCallback3 = this.mCompletedCallback;
            if (oSSCompletedCallback3 != null) {
                oSSCompletedCallback3.onFailure(this.mRequest, clientException, null);
            }
            throw clientException;
        }
    }
}
