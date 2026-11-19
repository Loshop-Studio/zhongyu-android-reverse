package com.lzy.okgo.exception;

/* loaded from: classes5.dex */
public class StorageException extends Exception {
    public StorageException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static StorageException m9653a() {
        return new StorageException("SDCard isn't available, please check SD card and permission: WRITE_EXTERNAL_STORAGE, and you must pay attention to Android6.0 RunTime Permissions!");
    }
}
