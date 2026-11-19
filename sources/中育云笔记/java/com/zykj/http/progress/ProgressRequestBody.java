package com.zykj.http.progress;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import cd.AbstractC5423b;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import je.AbstractC9744x;
import je.C9740t;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.BufferedSink;
import p309qc.C10786q;

@Keep
/* loaded from: classes6.dex */
public final class ProgressRequestBody extends AbstractC9744x {
    private final C9740t contentType;
    private final File file;
    private final UploadProgressListener listener;

    public /* synthetic */ ProgressRequestBody(File file, C9740t c9740t, UploadProgressListener uploadProgressListener, int i10, AbstractC9972n abstractC9972n) {
        this(file, (i10 & 2) != 0 ? null : c9740t, (i10 & 4) != 0 ? null : uploadProgressListener);
    }

    @Override // je.AbstractC9744x
    public C9740t contentType() {
        return this.contentType;
    }

    @Override // je.AbstractC9744x
    public void writeTo(BufferedSink sink) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(sink, "sink");
        long length = this.file.length();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        long j10 = 0;
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC5423b.m2902a(fileInputStream, null);
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

    public ProgressRequestBody(File file, C9740t c9740t, UploadProgressListener uploadProgressListener) {
        AbstractC9979u.m20294g(file, "file");
        this.file = file;
        this.contentType = c9740t;
        this.listener = uploadProgressListener;
    }
}
