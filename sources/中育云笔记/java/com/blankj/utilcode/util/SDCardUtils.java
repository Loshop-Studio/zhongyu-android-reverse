package com.blankj.utilcode.util;

import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class SDCardUtils {

    public static class SDCardInfo {
        private long availableSize;
        private boolean isRemovable;
        private String path;
        private String state;
        private long totalSize;

        public SDCardInfo(String str, String str2, boolean z10) {
            this.path = str;
            this.state = str2;
            this.isRemovable = z10;
            this.totalSize = UtilsBridge.getFsTotalSize(str);
            this.availableSize = UtilsBridge.getFsAvailableSize(str);
        }

        public long getAvailableSize() {
            return this.availableSize;
        }

        public String getPath() {
            return this.path;
        }

        public String getState() {
            return this.state;
        }

        public long getTotalSize() {
            return this.totalSize;
        }

        public boolean isRemovable() {
            return this.isRemovable;
        }

        public String toString() {
            return "SDCardInfo {path = " + this.path + ", state = " + this.state + ", isRemovable = " + this.isRemovable + ", totalSize = " + Formatter.formatFileSize(Utils.getApp(), this.totalSize) + ", availableSize = " + Formatter.formatFileSize(Utils.getApp(), this.availableSize) + '}';
        }
    }

    private SDCardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getExternalAvailableSize() {
        return UtilsBridge.getFsAvailableSize(getSDCardPathByEnvironment());
    }

    public static long getExternalTotalSize() {
        return UtilsBridge.getFsTotalSize(getSDCardPathByEnvironment());
    }

    public static long getInternalAvailableSize() {
        return UtilsBridge.getFsAvailableSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long getInternalTotalSize() {
        return UtilsBridge.getFsTotalSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> getMountedSDCardPath() throws NoSuchMethodException, SecurityException {
        ArrayList arrayList = new ArrayList();
        List<SDCardInfo> sDCardInfo = getSDCardInfo();
        if (sDCardInfo != null && !sDCardInfo.isEmpty()) {
            for (SDCardInfo sDCardInfo2 : sDCardInfo) {
                String str = sDCardInfo2.state;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(sDCardInfo2.path);
                }
            }
        }
        return arrayList;
    }

    public static List<SDCardInfo> getSDCardInfo() throws NoSuchMethodException, SecurityException {
        ArrayList arrayList = new ArrayList();
        StorageManager storageManager = (StorageManager) Utils.getApp().getSystemService("storage");
        if (storageManager != null) {
            List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
            try {
                Method method = StorageVolume.class.getMethod("getPath", null);
                for (StorageVolume storageVolume : storageVolumes) {
                    boolean zIsRemovable = storageVolume.isRemovable();
                    arrayList.add(new SDCardInfo((String) method.invoke(storageVolume, null), storageVolume.getState(), zIsRemovable));
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }
        return arrayList;
    }

    public static String getSDCardPathByEnvironment() {
        return isSDCardEnableByEnvironment() ? Environment.getExternalStorageDirectory().getAbsolutePath() : "";
    }

    public static boolean isSDCardEnableByEnvironment() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
