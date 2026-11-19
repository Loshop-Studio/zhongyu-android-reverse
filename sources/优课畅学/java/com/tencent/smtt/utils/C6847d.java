package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.tencent.smtt.utils.d */
/* loaded from: classes4.dex */
public class C6847d implements Closeable {

    /* renamed from: a */
    private final RandomAccessFile f6963a;

    /* renamed from: b */
    private final File f6964b;

    /* renamed from: c */
    private final byte[] f6965c;

    /* renamed from: d */
    private boolean f6966d;

    public C6847d(File file) {
        this.f6965c = new byte[8];
        this.f6964b = file;
        this.f6963a = new RandomAccessFile(file, "r");
    }

    /* renamed from: a */
    public final int m6282a() throws IOException {
        int i10 = this.f6963a.readInt();
        if (!this.f6966d) {
            return i10;
        }
        return ((i10 & (-16777216)) >>> 24) | ((i10 & 255) << 24) | ((65280 & i10) << 8) | ((16711680 & i10) >>> 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f6963a.close();
        } catch (IOException e10) {
            System.out.println(e10);
        }
    }

    public C6847d(String str) {
        this(new File(str));
    }

    /* renamed from: a */
    public final int m6283a(char[] cArr) throws IOException {
        byte[] bArr = new byte[cArr.length];
        int i10 = this.f6963a.read(bArr);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            cArr[i11] = (char) bArr[i11];
        }
        return i10;
    }

    /* renamed from: a */
    public void m6284a(long j10) throws IOException {
        this.f6963a.seek(j10);
    }

    /* renamed from: a */
    public void m6285a(boolean z10) {
        this.f6966d = z10;
    }
}
