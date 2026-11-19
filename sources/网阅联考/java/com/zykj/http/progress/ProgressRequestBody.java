package com.zykj.http.progress;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p086io.CloseableKt;
import okio.BufferedSink;
import p117r2.AbstractC4523z;
import p117r2.C4519v;

@Keep
@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m5175d2 = {"Lcom/zykj/http/progress/ProgressRequestBody;", "Lr2/z;", "Lr2/v;", "contentType", "Lokio/BufferedSink;", "sink", "", "writeTo", "Ljava/io/File;", "file", "Ljava/io/File;", "Lr2/v;", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "Lcom/zykj/http/listener/UploadProgressListener;", "<init>", "(Ljava/io/File;Lr2/v;Lcom/zykj/http/listener/UploadProgressListener;)V", "http_release"}, m5176k = 1, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ProgressRequestBody extends AbstractC4523z {
    private final C4519v contentType;
    private final File file;
    private final UploadProgressListener listener;

    public /* synthetic */ ProgressRequestBody(File file, C4519v c4519v, UploadProgressListener uploadProgressListener, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i4 & 2) != 0 ? null : c4519v, (i4 & 4) != 0 ? null : uploadProgressListener);
    }

    @Override // p117r2.AbstractC4523z
    /* renamed from: contentType, reason: from getter */
    public C4519v getContentType() {
        return this.contentType;
    }

    @Override // p117r2.AbstractC4523z
    public void writeTo(BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long length = this.file.length();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        long j4 = 0;
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (i4 == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                } else {
                    j4 += i4;
                    sink.write(bArr, 0, i4);
                    try {
                        UploadProgressListener uploadProgressListener = this.listener;
                        if (uploadProgressListener != null) {
                            uploadProgressListener.onProgressUpdate(j4, length);
                        }
                    } catch (Exception unused) {
                    }
                }
            } finally {
            }
        }
    }

    public ProgressRequestBody(File file, C4519v c4519v, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.contentType = c4519v;
        this.listener = uploadProgressListener;
    }
}
