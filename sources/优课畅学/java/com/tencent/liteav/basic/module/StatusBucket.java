package com.tencent.liteav.basic.module;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.liteav.basic.log.TXCLog;

/* loaded from: classes4.dex */
public class StatusBucket {
    private static final String TAG = "com.tencent.liteav.basic.module.StatusBucket";
    private long mBucketObj;

    public StatusBucket() {
        this.mBucketObj = 0L;
        this.mBucketObj = nativeCreateStatusBucket();
    }

    private static native long nativeCreateStatusBucket();

    private static native void nativeDestroyStatusBucket(long j10);

    private static native boolean nativeGetBooleanStatus(long j10, String str, int i10);

    private static native int nativeGetIntStatus(long j10, String str, int i10);

    private static native long nativeGetLongStatus(long j10, String str, int i10);

    private static native void nativeMerge(long j10, long j11);

    private static native void nativeSetBooleanStatus(long j10, String str, int i10, boolean z10);

    private static native void nativeSetIntStatus(long j10, String str, int i10, int i11);

    private static native void nativeSetLongStatus(long j10, String str, int i10, long j11);

    public static void testStatusBucket() {
        StatusBucket statusBucket = new StatusBucket();
        StatusBucket statusBucket2 = new StatusBucket();
        statusBucket.setBooleanStatus("1", 1, true);
        statusBucket.setIntStatus(ExifInterface.GPS_MEASUREMENT_2D, 2, 2);
        statusBucket.setLongStatus(ExifInterface.GPS_MEASUREMENT_3D, 3, 3L);
        statusBucket2.setIntStatus("1", 4, 4);
        statusBucket2.setBooleanStatus("5", 5, true);
        statusBucket2.setLongStatus("6", 6, 6L);
        statusBucket.merge(statusBucket2);
        String str = TAG;
        TXCLog.m4991e(str, "test_status_bucket: id:1, key:1, value:" + statusBucket.getBooleanStatus("1", 1));
        TXCLog.m4991e(str, "test_status_bucket: id:1, key:4, value:" + statusBucket.getIntStatus("1", 4));
        TXCLog.m4991e(str, "test_status_bucket: id:2, key:2, value:" + statusBucket.getIntStatus(ExifInterface.GPS_MEASUREMENT_2D, 2));
        TXCLog.m4991e(str, "test_status_bucket: id:3, key:3, value:" + statusBucket.getLongStatus(ExifInterface.GPS_MEASUREMENT_3D, 3));
        TXCLog.m4991e(str, "test_status_bucket: id:5, key:5, value:" + statusBucket.getBooleanStatus("5", 5));
        TXCLog.m4991e(str, "test_status_bucket: id:6, key:6, value:" + statusBucket.getLongStatus("6", 6));
    }

    public void finalize() throws Throwable {
        super.finalize();
        long j10 = this.mBucketObj;
        this.mBucketObj = 0L;
        nativeDestroyStatusBucket(j10);
    }

    public boolean getBooleanStatus(String str, int i10) {
        return nativeGetBooleanStatus(this.mBucketObj, str, i10);
    }

    public int getIntStatus(String str, int i10) {
        return nativeGetIntStatus(this.mBucketObj, str, i10);
    }

    public long getLongStatus(String str, int i10) {
        return nativeGetLongStatus(this.mBucketObj, str, i10);
    }

    public void merge(StatusBucket statusBucket) {
        nativeMerge(this.mBucketObj, statusBucket.mBucketObj);
    }

    public void setBooleanStatus(String str, int i10, boolean z10) {
        nativeSetBooleanStatus(this.mBucketObj, str, i10, z10);
    }

    public void setIntStatus(String str, int i10, int i11) {
        nativeSetIntStatus(this.mBucketObj, str, i10, i11);
    }

    public void setLongStatus(String str, int i10, long j10) {
        nativeSetLongStatus(this.mBucketObj, str, i10, j10);
    }

    public StatusBucket(long j10) {
        this.mBucketObj = j10;
    }
}
