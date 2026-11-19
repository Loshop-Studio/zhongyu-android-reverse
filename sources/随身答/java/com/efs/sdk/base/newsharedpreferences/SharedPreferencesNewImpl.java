package com.efs.sdk.base.newsharedpreferences;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class SharedPreferencesNewImpl implements SharedPreferences {
    private static final String BACKUP_FILE_SUFFIX = ".bak";
    private static final int CONTENT_LENGTH_LOST = 1;
    private static final int CONTENT_OVER_SIZE = 7;
    private static final int DATA_TYPE_ERROR = 8;
    private static final int DATA_TYPE_INVALID = 9;
    private static final long DELAY_TIME_TO_SAVE = 1000;
    private static final byte FINISH_MARK = 18;
    private static final int FINISH_MARK_LENGTH = 1;
    private static final int ID_LENGTH = 4;
    private static final int INIT_EXCEPTION = 10;
    private static final int LOAD_BAK_FILE = 12;
    private static final int MAPPED_BUFFER_ERROR = 4;
    private static final int MAX_HANDLERTHREAD = 3;
    private static final long MAX_LOCK_FILE_TIME = 10000;
    private static final int MAX_NUM = Integer.MAX_VALUE;
    private static final int MAX_TRY_TIME = 6;
    private static final int MIN_INCREASE_LENGTH = 1024;
    private static final int MODIFY_ID_LOST = 2;
    private static final int OTHER_EXCEPTION = 11;
    private static final String TAG = "SharedPreferencesNew";
    private static final long TRY_RELOAD_INTERVAL = 60;
    private static final int TRY_SAVE_TIME_DELAY = 2000;
    private static final int TYPE_CAST_EXCEPTION = 13;
    private static final int VALUE_LOST = 3;
    private static final Object mFileMonitorSyncObj = new Object();
    private static HandlerThread[] mHandlerThreadPool = new HandlerThread[3];
    private static final int mSaveMessageID = 21310;
    private static ExecutorService sCachedThreadPool;
    private String mBackupFilePath;
    private int mCurTryTime;
    private Vector<SharedPreferences.Editor> mEditorList;
    private OnSharedPreferenceErrorListener mErrorListener;
    private File mFile;
    private FileChannel mFileChannel;
    private FileMonitor mFileMonitor;
    private Handler mHandler;
    private boolean mIsSaving;
    private final ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> mListeners;
    private boolean mLoaded;
    private final LinkedHashMap<String, Object> mMap;
    private MappedByteBuffer mMappedByteBuffer;
    private int mModifyErrorCnt;
    private int mModifyID;
    private RunnableEx mSaveRunnable;
    private final Object mSyncObj;
    private final Object mSyncSaveObj;
    private final Runnable mTryReloadRunnable;
    private long mTryReloadStartTime;

    public static class ByteFloatUtils {
        private ByteFloatUtils() {
        }

        public static float bytesToFloat(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getFloat();
        }

        public static byte[] floatToBytes(float f10) {
            return ByteBuffer.allocate(4).putFloat(f10).array();
        }
    }

    public static class ByteIntUtils {
        private ByteIntUtils() {
        }

        public static int bytesToInt(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getInt();
        }

        public static byte[] intToBytes(int i9) {
            return ByteBuffer.allocate(4).putInt(i9).array();
        }
    }

    public static class ByteLongUtils {
        private ByteLongUtils() {
        }

        public static long bytesToLong(byte[] bArr) {
            return ByteBuffer.wrap(bArr).getLong();
        }

        public static byte[] longToBytes(long j9) {
            return ByteBuffer.allocate(8).putLong(j9).array();
        }
    }

    public final class EditorImpl implements SharedPreferences.Editor {
        private boolean mClear;
        private HashMap<String, Object> mModified = new HashMap<>();

        public EditorImpl() {
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            SharedPreferencesNewImpl.this.save(this, false, false, true);
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            SharedPreferencesNewImpl.this.save(this, false, true, false);
            return true;
        }

        public final boolean doClear() {
            boolean z9;
            synchronized (this) {
                z9 = this.mClear;
                this.mClear = false;
            }
            return z9;
        }

        public final HashMap<String, Object> getAll() {
            HashMap<String, Object> map;
            synchronized (this) {
                map = this.mModified;
            }
            return map;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z9) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f10) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f10));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i9) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j9) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j9));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new RuntimeException("putStringSet is not supported!");
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, null);
            }
            return this;
        }
    }

    public final class FileMonitor extends FileObserver {
        public FileMonitor(String str, int i9) {
            super(str, i9);
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i9, String str) {
            if (SharedPreferencesNewImpl.this.mListeners.size() > 0) {
                SharedPreferencesNewImpl.this.tryReload();
            } else {
                stopWatching();
            }
        }
    }

    public interface OnSharedPreferenceErrorListener {
        void onError(String str, int i9, long j9);
    }

    public static abstract class RunnableEx implements Runnable {
        private Object mArg;

        public Object getArg() {
            return this.mArg;
        }

        public void setArg(Object obj) {
            this.mArg = obj;
        }
    }

    public class SUPPORTED_TYPE {
        static final byte TYPE_BOOLEAN = 4;
        static final byte TYPE_FLOAT = 2;
        static final byte TYPE_INT = 1;
        static final byte TYPE_LONG = 3;
        static final byte TYPE_STRING = 5;

        private SUPPORTED_TYPE() {
        }
    }

    static {
        for (int i9 = 0; i9 < 3; i9++) {
            mHandlerThreadPool[i9] = new HandlerThread("newsp".concat(String.valueOf(i9)));
            mHandlerThreadPool[i9].start();
        }
        sCachedThreadPool = Executors.newCachedThreadPool();
    }

    public SharedPreferencesNewImpl(File file) {
        this(file, 0, null, false);
    }

    private MappedByteBuffer allocBuffer(int i9) {
        MappedByteBuffer mappedByteBuffer = this.mMappedByteBuffer;
        int iPosition = mappedByteBuffer != null ? mappedByteBuffer.position() : 0;
        try {
            this.mMappedByteBuffer = this.mFileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i9);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        MappedByteBuffer mappedByteBuffer2 = this.mMappedByteBuffer;
        if (mappedByteBuffer2 != null) {
            mappedByteBuffer2.position(iPosition);
        }
        return this.mMappedByteBuffer;
    }

    private void awaitLoadedLocked() {
        if (!this.mLoaded) {
            synchronized (this) {
                while (!this.mLoaded) {
                    try {
                        wait();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    } finally {
                    }
                }
            }
        }
        tryReload();
    }

    private void backup() throws IOException {
        FileChannel channel;
        Closeable closeable = null;
        try {
            File file = new File(this.mBackupFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                channel = fileOutputStream.getChannel();
                try {
                    this.mFileChannel.transferTo(0L, this.mMappedByteBuffer.capacity(), channel);
                    safeClose(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    closeable = fileOutputStream;
                    try {
                        th.printStackTrace();
                        safeClose(closeable);
                        safeClose(channel);
                    } catch (Throwable th2) {
                        safeClose(closeable);
                        safeClose(channel);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            channel = null;
        }
        safeClose(channel);
    }

    private byte getBCCCode(byte[] bArr) {
        byte b10 = 0;
        for (byte b11 : bArr) {
            b10 = (byte) (b10 ^ b11);
        }
        return b10;
    }

    private byte[] getBytes(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj instanceof String) {
                return ((String) obj).getBytes();
            }
            if (obj instanceof Boolean) {
                return new byte[]{((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0};
            }
            if (obj instanceof Float) {
                return ByteFloatUtils.floatToBytes(((Float) obj).floatValue());
            }
            if (obj instanceof Integer) {
                return ByteIntUtils.intToBytes(((Integer) obj).intValue());
            }
            if (obj instanceof Long) {
                return ByteLongUtils.longToBytes(((Long) obj).longValue());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int getContentLength() {
        if (this.mMappedByteBuffer == null || this.mFileChannel == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            try {
                this.mMappedByteBuffer.position(0);
                byte[] bArr = new byte[4];
                safeBufferGet(this.mMappedByteBuffer, bArr);
                int iBytesToInt = ByteIntUtils.bytesToInt(bArr);
                this.mMappedByteBuffer.position(4);
                byte b10 = this.mMappedByteBuffer.get();
                if (b10 == 18 || b10 == getMaskByte(bArr)) {
                    if (iBytesToInt >= 0) {
                        if (iBytesToInt > Integer.MAX_VALUE) {
                            iBytesToInt = Integer.MAX_VALUE;
                        }
                        return iBytesToInt;
                    }
                }
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    File file = this.mFile;
                    String absolutePath = file != null ? file.getAbsolutePath() : null;
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(absolutePath, 1, file2 != null ? file2.length() : 0L);
                }
                return -1;
            } finally {
            }
        }
    }

    private Pair<Integer, byte[][]> getDataBytes() {
        byte[][] bArr;
        ArrayList arrayList;
        synchronized (this.mMap) {
            bArr = new byte[this.mMap.size() * 5][];
            arrayList = new ArrayList(this.mMap.entrySet());
            this.mEditorList.clear();
        }
        int i9 = 0;
        int i10 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Map.Entry entry = (Map.Entry) arrayList.get(size);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && str.trim().length() > 0 && value != null) {
                byte[] bytes = str.getBytes();
                byte[] bArrIntToBytes = ByteIntUtils.intToBytes(bytes.length);
                bArr[i10] = bArrIntToBytes;
                bArr[i10 + 1] = bytes;
                int length = i9 + bArrIntToBytes.length + bytes.length;
                byte[] bytes2 = getBytes(value);
                byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(bytes2.length);
                bArr[i10 + 2] = bArrIntToBytes2;
                bArr[i10 + 3] = bytes2;
                int length2 = length + bArrIntToBytes2.length + bytes2.length;
                bArr[i10 + 4] = new byte[]{(byte) getObjectType(value)};
                i9 = length2 + 1;
                i10 += 5;
            }
        }
        return new Pair<>(Integer.valueOf(i9), bArr);
    }

    private HandlerThread getHandlerThread() {
        int iNextInt = new Random().nextInt();
        if (iNextInt < 0) {
            iNextInt = -iNextInt;
        }
        return mHandlerThreadPool[iNextInt % 3];
    }

    private byte getMaskByte(byte[] bArr) {
        return getBCCCode(bArr);
    }

    private Object getObjectByType(byte[] bArr, int i9) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            if (i9 == 5) {
                return new String(bArr);
            }
            boolean z9 = true;
            if (i9 == 4) {
                if (bArr[0] != 1) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            }
            if (i9 == 2) {
                return Float.valueOf(ByteFloatUtils.bytesToFloat(bArr));
            }
            if (i9 == 1) {
                return Integer.valueOf(ByteIntUtils.bytesToInt(bArr));
            }
            if (i9 == 3) {
                return Long.valueOf(ByteLongUtils.bytesToLong(bArr));
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private int getObjectType(Object obj) {
        if (obj instanceof String) {
            return 5;
        }
        if (obj instanceof Boolean) {
            return 4;
        }
        if (obj instanceof Float) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 1;
        }
        return obj instanceof Long ? 3 : 0;
    }

    private Pair<byte[], Integer> getOneString(byte[] bArr, int i9) throws Exception {
        int i10;
        byte[] bArr2;
        byte[] bArr3 = new byte[4];
        System.arraycopy(bArr, i9, bArr3, 0, 4);
        byte b10 = bArr[i9 + 4];
        if (b10 != 18 && b10 != getMaskByte(bArr3)) {
            throw new Exception("length string's finish mark missing");
        }
        int i11 = i9 + 5;
        int iBytesToInt = ByteIntUtils.bytesToInt(bArr3);
        if (iBytesToInt < 0 || (i10 = i11 + iBytesToInt) >= bArr.length || iBytesToInt > Integer.MAX_VALUE) {
            throw new Exception("length string is invalid");
        }
        if (iBytesToInt != 0) {
            bArr2 = new byte[iBytesToInt];
            System.arraycopy(bArr, i11, bArr2, 0, iBytesToInt);
            byte b11 = bArr[i10];
            if (b11 != 18 && b11 != getMaskByte(bArr2)) {
                throw new Exception("Stored bytes' finish mark missing");
            }
            i11 = i10;
        } else {
            bArr2 = null;
        }
        return new Pair<>(bArr2, Integer.valueOf(i11 + 1));
    }

    private int increaseModifyID() {
        int i9 = (this.mModifyID + 1) % Integer.MAX_VALUE;
        this.mModifyID = i9;
        return i9;
    }

    private boolean initBuffer() throws IOException {
        boolean zExists = true;
        if (this.mMappedByteBuffer != null) {
            return true;
        }
        try {
            if (!this.mFile.exists()) {
                this.mFile.getParentFile().mkdirs();
                this.mFile.createNewFile();
                zExists = new File(this.mBackupFilePath).exists();
            } else if (this.mFile.length() == 0) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mFile.getAbsolutePath(), 4, this.mFile.length());
                }
                zExists = false;
            }
            this.mFileChannel = new RandomAccessFile(this.mFile, "rw").getChannel();
            allocBuffer(10);
            if (!zExists) {
                initFileHeader();
            }
            return zExists;
        } catch (Exception e10) {
            e10.printStackTrace();
            OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
            if (onSharedPreferenceErrorListener2 != null) {
                onSharedPreferenceErrorListener2.onError(this.mFile.getAbsolutePath() + " " + e10.getCause(), 10, -1L);
            }
            return false;
        }
    }

    private void initFileHeader() {
        if (this.mMappedByteBuffer != null) {
            byte[] bArr = new byte[10];
            byte[] bArrIntToBytes = ByteIntUtils.intToBytes(0);
            System.arraycopy(bArrIntToBytes, 0, bArr, 0, 4);
            bArr[4] = getMaskByte(bArrIntToBytes);
            byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(0);
            System.arraycopy(bArrIntToBytes2, 0, bArr, 5, 4);
            bArr[9] = getMaskByte(bArrIntToBytes2);
            this.mMappedByteBuffer.position(0);
            this.mMappedByteBuffer.put(bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00ac A[DONT_GENERATE, FINALLY_INSNS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L6
            r2 = r0
            goto La
        L6:
            java.nio.channels.FileLock r2 = r8.lockFile(r1)
        La:
            if (r2 != 0) goto L15
            if (r9 == 0) goto Lf
            goto L15
        Lf:
            if (r9 != 0) goto L9a
            r8.loadFromBakFile()
            return
        L15:
            r9 = 0
            r8.reallocBuffer()     // Catch: java.lang.Throwable -> L6c
            java.nio.MappedByteBuffer r3 = r8.mMappedByteBuffer     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L85
            int r3 = r3.capacity()     // Catch: java.lang.Throwable -> L6c
            if (r3 != 0) goto L24
            goto L85
        L24:
            int r3 = r8.getContentLength()     // Catch: java.lang.Throwable -> L6c
            long r3 = (long) r3
            r5 = 10
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto L4c
            boolean r9 = r8.parseBytesIntoMap(r0, r1)     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r0 = move-exception
            r0.printStackTrace()
        L38:
            if (r9 == 0) goto L3e
            int r9 = r8.mModifyID
            if (r9 >= 0) goto L41
        L3e:
            r8.loadFromBakFile()
        L41:
            if (r2 == 0) goto L9a
        L43:
            r2.release()     // Catch: java.lang.Exception -> L47
            goto L9a
        L47:
            r9 = move-exception
            r9.printStackTrace()
            return
        L4c:
            int r5 = r8.getModifyID()     // Catch: java.lang.Throwable -> L6c
            r8.mModifyID = r5     // Catch: java.lang.Throwable -> L6c
            if (r5 <= 0) goto L6e
            java.lang.Object r5 = r8.mSyncObj     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6c
            java.nio.MappedByteBuffer r6 = r8.mMappedByteBuffer     // Catch: java.lang.Throwable -> L69
            r7 = 10
            r6.position(r7)     // Catch: java.lang.Throwable -> L69
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L69
            int r3 = r3 - r7
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> L69
            java.nio.MappedByteBuffer r3 = r8.mMappedByteBuffer     // Catch: java.lang.Throwable -> L69
            r8.safeBufferGet(r3, r0)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L6c
        L6c:
            r3 = move-exception
            goto L9b
        L6e:
            boolean r9 = r8.parseBytesIntoMap(r0, r1)     // Catch: java.lang.Exception -> L73
            goto L77
        L73:
            r1 = move-exception
            r1.printStackTrace()
        L77:
            if (r9 == 0) goto L7f
            if (r0 != 0) goto L82
            int r9 = r8.mModifyID
            if (r9 >= 0) goto L82
        L7f:
            r8.loadFromBakFile()
        L82:
            if (r2 == 0) goto L9a
            goto L43
        L85:
            boolean r9 = r8.parseBytesIntoMap(r0, r1)     // Catch: java.lang.Exception -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            r0.printStackTrace()
        L8e:
            if (r9 == 0) goto L94
            int r9 = r8.mModifyID
            if (r9 >= 0) goto L97
        L94:
            r8.loadFromBakFile()
        L97:
            if (r2 == 0) goto L9a
            goto L43
        L9a:
            return
        L9b:
            boolean r9 = r8.parseBytesIntoMap(r0, r1)     // Catch: java.lang.Exception -> La0
            goto La4
        La0:
            r1 = move-exception
            r1.printStackTrace()
        La4:
            if (r9 == 0) goto Lac
            if (r0 != 0) goto Laf
            int r9 = r8.mModifyID
            if (r9 >= 0) goto Laf
        Lac:
            r8.loadFromBakFile()
        Laf:
            if (r2 == 0) goto Lb9
            r2.release()     // Catch: java.lang.Exception -> Lb5
            goto Lb9
        Lb5:
            r9 = move-exception
            r9.printStackTrace()
        Lb9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.load(boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    private boolean loadFromBakFile() throws IOException {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        int iBytesToInt;
        int length = 0;
        boolean bytesIntoMap = true;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        try {
            randomAccessFile = new RandomAccessFile(this.mBackupFilePath, "r");
        } catch (Throwable th) {
            th = th;
            bArr = null;
        }
        try {
            byte[] bArr3 = new byte[4];
            randomAccessFile.read(bArr3, 0, 4);
            iBytesToInt = ByteIntUtils.bytesToInt(bArr3);
        } catch (Throwable th2) {
            th = th2;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            try {
                th.printStackTrace();
                safeClose(randomAccessFile2);
                try {
                    bytesIntoMap = parseBytesIntoMap(bArr, false);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    onSharedPreferenceErrorListener.onError(this.mBackupFilePath + "#" + th.getCause() + "#" + bytesIntoMap, 12, bArr != null ? bArr.length : 0);
                }
                return bytesIntoMap;
            } finally {
            }
        }
        if (iBytesToInt <= 10) {
            safeClose(randomAccessFile);
            try {
                parseBytesIntoMap(null, false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }
        if (iBytesToInt > Integer.MAX_VALUE) {
            iBytesToInt = Integer.MAX_VALUE;
        }
        if (iBytesToInt > randomAccessFile.length()) {
            iBytesToInt = (int) randomAccessFile.length();
        }
        int i9 = iBytesToInt - 10;
        bArr2 = new byte[i9];
        randomAccessFile.seek(10L);
        randomAccessFile.read(bArr2);
        safeClose(randomAccessFile);
        try {
            bytesIntoMap = parseBytesIntoMap(bArr2, false);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener2 = this.mErrorListener;
        if (onSharedPreferenceErrorListener2 != null) {
            onSharedPreferenceErrorListener2.onError(this.mBackupFilePath + "#" + ((Object) "") + "#" + bytesIntoMap, 12, i9);
        }
        return bytesIntoMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadFromDiskLocked() throws IOException {
        if (this.mLoaded) {
            return;
        }
        load(false);
        this.mLoaded = true;
        notifyAll();
    }

    private FileLock lockFile(boolean z9) throws InterruptedException, IOException {
        FileChannel fileChannel = this.mFileChannel;
        FileLock fileLockTryLock = null;
        if (fileChannel == null) {
            return null;
        }
        if (z9) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            while (fileLockTryLock == null) {
                try {
                    fileLockTryLock = this.mFileChannel.tryLock();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (fileLockTryLock == null) {
                    try {
                        Thread.sleep(100L);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (SystemClock.uptimeMillis() - jUptimeMillis > 10000) {
                    break;
                }
            }
        } else {
            try {
                return fileChannel.tryLock();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        return fileLockTryLock;
    }

    private boolean merge(SharedPreferences.Editor editor, Map map, boolean z9) {
        if (editor == null) {
            return false;
        }
        EditorImpl editorImpl = (EditorImpl) editor;
        boolean zDoClear = editorImpl.doClear();
        if (zDoClear) {
            map.clear();
            this.mEditorList.clear();
        }
        HashMap<String, Object> all = editorImpl.getAll();
        if (all.size() == 0) {
            return zDoClear;
        }
        synchronized (editor) {
            try {
                for (Map.Entry<String, Object> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        map.remove(key);
                    } else {
                        if (map.containsKey(key)) {
                            map.remove(key);
                        }
                        map.put(key, value);
                    }
                    if (!z9) {
                        notifyDataChanged(key);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    private void mergeWhenReload() {
        synchronized (this.mMap) {
            try {
                if (this.mEditorList.size() > 0) {
                    Iterator<SharedPreferences.Editor> it = this.mEditorList.iterator();
                    while (it.hasNext()) {
                        merge(it.next(), this.mMap, true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyDataChanged(String str) {
        if (this.mListeners.size() > 0) {
            for (int i9 = 0; i9 < this.mListeners.size(); i9++) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.mListeners.get(i9);
                if (onSharedPreferenceChangeListener != null) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this, str);
                }
            }
        }
    }

    private byte[] obtainTotalBytes() {
        Pair<Integer, byte[][]> dataBytes = getDataBytes();
        int iIntValue = ((Integer) dataBytes.first).intValue() + 10 + ((byte[][]) dataBytes.second).length;
        if (iIntValue > Integer.MAX_VALUE) {
            iIntValue = Integer.MAX_VALUE;
        }
        byte[] bArr = new byte[iIntValue];
        byte[] bArrIntToBytes = ByteIntUtils.intToBytes(iIntValue);
        System.arraycopy(bArrIntToBytes, 0, bArr, 0, bArrIntToBytes.length);
        int length = bArrIntToBytes.length;
        bArr[length] = getMaskByte(bArrIntToBytes);
        int i9 = length + 1;
        byte[] bArrIntToBytes2 = ByteIntUtils.intToBytes(increaseModifyID());
        System.arraycopy(bArrIntToBytes2, 0, bArr, i9, bArrIntToBytes2.length);
        int length2 = i9 + bArrIntToBytes2.length;
        bArr[length2] = getMaskByte(bArrIntToBytes2);
        int i10 = length2 + 1;
        byte[][] bArr2 = (byte[][]) dataBytes.second;
        int length3 = bArr2.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                break;
            }
            byte[] bArr3 = bArr2[i11];
            if (bArr3 != null) {
                if (bArr3.length + i10 + 1 <= Integer.MAX_VALUE) {
                    System.arraycopy(bArr3, 0, bArr, i10, bArr3.length);
                    int length4 = i10 + bArr3.length;
                    bArr[length4] = getMaskByte(bArr3);
                    i10 = length4 + 1;
                } else {
                    StringBuilder sb = new StringBuilder("Write too much data in ");
                    File file = this.mFile;
                    sb.append(file != null ? file.getAbsolutePath() : null);
                    Log.e(TAG, sb.toString());
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(file2 != null ? file2.getAbsolutePath() : null, 7, -1L);
                        return bArr;
                    }
                }
            }
            i11++;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r3 = r12.mErrorListener;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r5 = r12.mFile;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        r5 = r5.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r3.onError(r5, 8, r13.length);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean parseBytesIntoMap(byte[] r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.parseBytesIntoMap(byte[], boolean):boolean");
    }

    private void reallocBuffer() {
        int contentLength;
        if (this.mMappedByteBuffer == null) {
            return;
        }
        synchronized (this.mSyncObj) {
            try {
                contentLength = getContentLength();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (contentLength > this.mMappedByteBuffer.capacity()) {
                allocBuffer(contentLength + 1024);
            }
        }
    }

    private boolean safeBufferGet(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return false;
        }
        Arrays.fill(bArr, (byte) 0);
        int iPosition = mappedByteBuffer.position();
        if (iPosition + bArr.length > mappedByteBuffer.capacity()) {
            return false;
        }
        mappedByteBuffer.get(bArr);
        return true;
    }

    private void safeBufferPut(MappedByteBuffer mappedByteBuffer, byte[] bArr) {
        if (mappedByteBuffer == null || bArr == null || bArr.length == 0) {
            return;
        }
        if (mappedByteBuffer.position() + bArr.length >= mappedByteBuffer.capacity()) {
            mappedByteBuffer = allocBuffer(mappedByteBuffer.position() + bArr.length + 1024);
        }
        mappedByteBuffer.put(bArr);
    }

    private void safeClose(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void save(SharedPreferences.Editor editor, boolean z9, boolean z10, boolean z11) {
        if (editor == null) {
            return;
        }
        synchronized (this.mMap) {
            try {
                this.mCurTryTime = 0;
                if (merge(editor, this.mMap, false)) {
                    this.mEditorList.add(editor);
                } else if (this.mEditorList.size() == 0) {
                    return;
                }
                if (z10) {
                    saveInner(z9);
                    return;
                }
                long j9 = z11 ? 1000L : 0L;
                this.mSaveRunnable.setArg(Boolean.valueOf(z9));
                Message messageObtain = Message.obtain(this.mHandler, this.mSaveRunnable);
                messageObtain.what = mSaveMessageID;
                this.mHandler.sendMessageDelayed(messageObtain, j9);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveInner(final boolean z9) {
        synchronized (this.mSyncSaveObj) {
            FileLock fileLockLockFile = lockFile(false);
            if (fileLockLockFile != null) {
                try {
                    this.mIsSaving = true;
                    if (tryReloadWhenSave()) {
                        mergeWhenReload();
                        notifyDataChanged(null);
                    }
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                        if (onSharedPreferenceErrorListener != null) {
                            onSharedPreferenceErrorListener.onError(th.getMessage(), 11, -1L);
                            try {
                                fileLockLockFile.release();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        } else {
                            fileLockLockFile.release();
                        }
                    } finally {
                        try {
                            fileLockLockFile.release();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        this.mIsSaving = false;
                    }
                }
                synchronized (this.mMap) {
                    if (this.mEditorList.size() <= 0) {
                        try {
                            fileLockLockFile.release();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        this.mIsSaving = false;
                        return;
                    }
                    saveToMappedBuffer(obtainTotalBytes(), z9);
                    backup();
                }
            }
            int i9 = this.mCurTryTime;
            this.mCurTryTime = i9 + 1;
            if (i9 < 6) {
                this.mHandler.postDelayed(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SharedPreferencesNewImpl.this.saveInner(z9);
                    }
                }, 2000L);
            }
        }
    }

    private void saveToMappedBuffer(byte[] bArr, boolean z9) {
        synchronized (this.mSyncObj) {
            try {
                this.mMappedByteBuffer.position(0);
                safeBufferPut(this.mMappedByteBuffer, bArr);
                if (z9) {
                    this.mMappedByteBuffer.force();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void startLoadFromDisk(boolean z9) {
        synchronized (this) {
            this.mLoaded = false;
        }
        Runnable runnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (SharedPreferencesNewImpl.this) {
                    SharedPreferencesNewImpl.this.loadFromDiskLocked();
                }
            }
        };
        if (z9) {
            runnable.run();
        } else {
            sCachedThreadPool.execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryReload() {
        if (SystemClock.uptimeMillis() - this.mTryReloadStartTime > 60) {
            this.mTryReloadStartTime = SystemClock.uptimeMillis();
            this.mHandler.removeCallbacks(this.mTryReloadRunnable);
            this.mHandler.post(this.mTryReloadRunnable);
        }
    }

    private boolean tryReloadWhenSave() throws IOException {
        int modifyID = getModifyID();
        if (modifyID <= 0 || modifyID == this.mModifyID) {
            return false;
        }
        load(true);
        return true;
    }

    public final boolean checkTypeValid(byte b10) {
        return b10 == 4 || b10 == 2 || b10 == 1 || b10 == 3 || b10 == 5;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean zContainsKey;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            zContainsKey = this.mMap.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        awaitLoadedLocked();
        return new EditorImpl();
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap map;
        awaitLoadedLocked();
        synchronized (this.mMap) {
            map = new HashMap(this.mMap);
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z9) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Boolean bool = (Boolean) this.mMap.get(str);
                if (bool != null) {
                    z9 = bool.booleanValue();
                }
            } catch (ClassCastException e10) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder sb = new StringBuilder();
                    File file = this.mFile;
                    sb.append(file != null ? file.getAbsolutePath() : null);
                    sb.append("#");
                    sb.append(str);
                    sb.append(e10);
                    String string = sb.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                }
                return z9;
            }
        }
        return z9;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Float f11 = (Float) this.mMap.get(str);
                if (f11 != null) {
                    f10 = f11.floatValue();
                }
            } catch (ClassCastException e10) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder sb = new StringBuilder();
                    File file = this.mFile;
                    sb.append(file != null ? file.getAbsolutePath() : null);
                    sb.append("#");
                    sb.append(str);
                    sb.append(e10);
                    String string = sb.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                }
                return f10;
            }
        }
        return f10;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i9) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Integer num = (Integer) this.mMap.get(str);
                if (num != null) {
                    i9 = num.intValue();
                }
            } catch (ClassCastException e10) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder sb = new StringBuilder();
                    File file = this.mFile;
                    sb.append(file != null ? file.getAbsolutePath() : null);
                    sb.append("#");
                    sb.append(str);
                    sb.append(e10);
                    String string = sb.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                }
                return i9;
            }
        }
        return i9;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j9) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                Long l9 = (Long) this.mMap.get(str);
                if (l9 != null) {
                    j9 = l9.longValue();
                }
            } catch (ClassCastException e10) {
                OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                if (onSharedPreferenceErrorListener != null) {
                    StringBuilder sb = new StringBuilder();
                    File file = this.mFile;
                    sb.append(file != null ? file.getAbsolutePath() : null);
                    sb.append("#");
                    sb.append(str);
                    sb.append(e10);
                    String string = sb.toString();
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                }
                return j9;
            }
        }
        return j9;
    }

    public final int getModifyID() {
        OnSharedPreferenceErrorListener onSharedPreferenceErrorListener;
        if (this.mMappedByteBuffer == null) {
            return -1;
        }
        synchronized (this.mSyncObj) {
            try {
                this.mMappedByteBuffer.position(5);
                byte[] bArr = new byte[4];
                safeBufferGet(this.mMappedByteBuffer, bArr);
                int iBytesToInt = ByteIntUtils.bytesToInt(bArr);
                this.mMappedByteBuffer.position(9);
                byte b10 = this.mMappedByteBuffer.get();
                if (b10 == 18 || b10 == getMaskByte(bArr)) {
                    if (iBytesToInt >= 0) {
                        return iBytesToInt;
                    }
                }
                int i9 = this.mModifyErrorCnt + 1;
                this.mModifyErrorCnt = i9;
                if (i9 < 3 && (onSharedPreferenceErrorListener = this.mErrorListener) != null) {
                    File file = this.mFile;
                    String absolutePath = file != null ? file.getAbsolutePath() : null;
                    File file2 = this.mFile;
                    onSharedPreferenceErrorListener.onError(absolutePath, 2, file2 != null ? file2.length() : 0L);
                }
                return -1;
            } finally {
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        awaitLoadedLocked();
        synchronized (this.mMap) {
            try {
                try {
                    String str3 = (String) this.mMap.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (ClassCastException e10) {
                    OnSharedPreferenceErrorListener onSharedPreferenceErrorListener = this.mErrorListener;
                    if (onSharedPreferenceErrorListener != null) {
                        StringBuilder sb = new StringBuilder();
                        File file = this.mFile;
                        sb.append(file != null ? file.getAbsolutePath() : null);
                        sb.append("#");
                        sb.append(str);
                        sb.append(e10);
                        String string = sb.toString();
                        File file2 = this.mFile;
                        onSharedPreferenceErrorListener.onError(string, 13, file2 != null ? file2.length() : 0L);
                    }
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        throw new RuntimeException("putStringSet is not supported!");
    }

    public final void onDestroy() {
        if (this.mIsSaving || this.mHandler.hasMessages(mSaveMessageID)) {
            saveInner(false);
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                this.mListeners.add(onSharedPreferenceChangeListener);
                if (this.mFileMonitor == null) {
                    try {
                        File file = new File(this.mBackupFilePath);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    this.mFileMonitor = new FileMonitor(this.mBackupFilePath, 2);
                }
            }
            synchronized (mFileMonitorSyncObj) {
                this.mFileMonitor.startWatching();
            }
        }
    }

    public final void setSharedPreferenceErrorListener(OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this.mErrorListener = onSharedPreferenceErrorListener;
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (onSharedPreferenceChangeListener != null) {
            synchronized (this.mListeners) {
                try {
                    this.mListeners.remove(onSharedPreferenceChangeListener);
                    if (this.mFileMonitor != null && this.mListeners.size() <= 0) {
                        this.mFileMonitor.stopWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SharedPreferencesNewImpl(File file, boolean z9) {
        this(file, 0, null, z9);
    }

    public SharedPreferencesNewImpl(File file, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, 0, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int i9, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener) {
        this(file, i9, onSharedPreferenceErrorListener, false);
    }

    public SharedPreferencesNewImpl(File file, int i9, OnSharedPreferenceErrorListener onSharedPreferenceErrorListener, boolean z9) {
        this.mMap = new LinkedHashMap<>();
        this.mListeners = new ArrayList<>();
        this.mLoaded = true;
        this.mSyncObj = new Object();
        this.mSyncSaveObj = new Object();
        this.mEditorList = new Vector<>();
        this.mIsSaving = false;
        this.mTryReloadRunnable = new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.2
            @Override // java.lang.Runnable
            public void run() {
                int modifyID = SharedPreferencesNewImpl.this.getModifyID();
                if (modifyID <= 0 || modifyID == SharedPreferencesNewImpl.this.mModifyID) {
                    return;
                }
                SharedPreferencesNewImpl.this.saveInner(false);
            }
        };
        this.mSaveRunnable = new RunnableEx() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.4
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferencesNewImpl.this.saveInner(((Boolean) getArg()).booleanValue());
            }
        };
        this.mErrorListener = onSharedPreferenceErrorListener;
        this.mHandler = new Handler(getHandlerThread().getLooper());
        this.mFile = file;
        this.mBackupFilePath = file.getAbsolutePath() + BACKUP_FILE_SUFFIX;
        if (initBuffer()) {
            startLoadFromDisk(z9);
        }
        this.mHandler.post(new Runnable() { // from class: com.efs.sdk.base.newsharedpreferences.SharedPreferencesNewImpl.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                try {
                    File file2 = new File(SharedPreferencesNewImpl.this.mBackupFilePath);
                    if (file2.exists()) {
                        return;
                    }
                    file2.createNewFile();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        });
    }
}
