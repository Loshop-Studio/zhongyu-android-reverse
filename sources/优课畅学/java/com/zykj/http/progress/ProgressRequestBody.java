package com.zykj.http.progress;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.BufferedSink;
import p123h7.C8736p;
import p136i9.AbstractC8901c0;
import p136i9.C8927y;
import p256t7.AbstractC10117b;

@Keep
/* loaded from: classes4.dex */
public final class ProgressRequestBody extends AbstractC8901c0 {
    private final C8927y contentType;
    private final File file;
    private final UploadProgressListener listener;

    public /* synthetic */ ProgressRequestBody(File file, C8927y c8927y, UploadProgressListener uploadProgressListener, int i10, AbstractC9126n abstractC9126n) {
        this(file, (i10 & 2) != 0 ? null : c8927y, (i10 & 4) != 0 ? null : uploadProgressListener);
    }

    @Override // p136i9.AbstractC8901c0
    public C8927y contentType() {
        return this.contentType;
    }

    @Override // p136i9.AbstractC8901c0
    public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(sink, "sink");
        long length = this.file.length();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        long j10 = 0;
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC10117b.m18861a(fileInputStream, null);
                    return;
                } else {
                    j10 += i10;
                    sink.write(bArr, 0, i10);
                    try {
                        UploadProgressListener uploadProgressListener = this.listener;
                        if (uploadProgressListener != null) {
                            uploadProgressListener.onProgressUpdate(j10, length);
                        }
                    } catch (Exception unused) {
                    }
                }
            } finally {
            }
        }
    }

    public ProgressRequestBody(File file, C8927y c8927y, UploadProgressListener uploadProgressListener) {
        AbstractC9133u.m16133g(file, "file");
        this.file = file;
        this.contentType = c8927y;
        this.listener = uploadProgressListener;
    }
}
