package com.tencent.mars.xlog;

import com.tencent.mars.xlog.Log;

/* loaded from: classes2.dex */
public class Xlog implements Log.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int COMPRESS_LEVEL1 = 1;
    public static final int COMPRESS_LEVEL2 = 2;
    public static final int COMPRESS_LEVEL3 = 3;
    public static final int COMPRESS_LEVEL4 = 4;
    public static final int COMPRESS_LEVEL5 = 5;
    public static final int COMPRESS_LEVEL6 = 6;
    public static final int COMPRESS_LEVEL7 = 7;
    public static final int COMPRESS_LEVEL8 = 8;
    public static final int COMPRESS_LEVEL9 = 9;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static final int ZLIB_MODE = 0;
    public static final int ZSTD_MODE = 1;

    public static class XLogConfig {
        public String cachedir;
        public String logdir;
        public String nameprefix;
        public int level = 2;
        public int mode = 0;
        public String pubkey = "";
        public int compressmode = 0;
        public int compresslevel = 0;
        public int cachedays = 0;
    }

    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    private static native void appenderOpen(XLogConfig xLogConfig);

    private static String decryptTag(String str) {
        return str;
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static void logWrite2(int i4, String str, String str2, String str3, int i5, int i6, long j4, long j5, String str4) {
        logWrite2(0L, i4, str, str2, str3, i5, i6, j4, j5, str4);
    }

    public static native void logWrite2(long j4, int i4, String str, String str2, String str3, int i5, int i6, long j5, long j6, String str4);

    public static void open(boolean z3, int i4, int i5, String str, String str2, String str3, String str4) {
        if (z3) {
            System.loadLibrary("c++_shared");
            System.loadLibrary("marsxlog");
        }
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i4;
        xLogConfig.mode = i5;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.pubkey = str4;
        xLogConfig.compressmode = 0;
        xLogConfig.compresslevel = 0;
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = 0;
        appenderOpen(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderClose();

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void appenderFlush(long j4, boolean z3);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void appenderOpen(int i4, int i5, String str, String str2, String str3, int i6) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i4;
        xLogConfig.mode = i5;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = "402b3145737472e895bb9806f9625e0b25d000c3f130e6597af0cf1097f06a5930b1145a88a8201f774516349c9953987ccccf7a11e2e5b853c4ec6c7b19d1a8";
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i6;
        appenderOpen(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native int getLogLevel(long j4);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native long getXlogInstance(String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logD(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 1, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logE(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 4, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logF(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 5, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logI(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 2, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logV(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 0, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logW(long j4, String str, String str2, String str3, int i4, int i5, long j5, long j6, String str4) {
        logWrite2(j4, 3, decryptTag(str), str2, str3, i4, i5, j5, j6, str4);
    }

    public native long newXlogInstance(XLogConfig xLogConfig);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public long openLogInstance(int i4, int i5, String str, String str2, String str3, int i6) {
        XLogConfig xLogConfig = new XLogConfig();
        xLogConfig.level = i4;
        xLogConfig.mode = i5;
        xLogConfig.logdir = str2;
        xLogConfig.nameprefix = str3;
        xLogConfig.compressmode = 0;
        xLogConfig.pubkey = "402b3145737472e895bb9806f9625e0b25d000c3f130e6597af0cf1097f06a5930b1145a88a8201f774516349c9953987ccccf7a11e2e5b853c4ec6c7b19d1a8";
        xLogConfig.cachedir = str;
        xLogConfig.cachedays = i6;
        return newXlogInstance(xLogConfig);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void releaseXlogInstance(String str);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setAppenderMode(long j4, int i4);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setConsoleLogOpen(long j4, boolean z3);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxAliveTime(long j4, long j5);

    @Override // com.tencent.mars.xlog.Log.LogImp
    public native void setMaxFileSize(long j4, long j5);
}
