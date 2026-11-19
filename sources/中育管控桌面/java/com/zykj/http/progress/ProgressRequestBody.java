package com.zykj.http.progress;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p094io.CloseableKt;
import okio.BufferedSink;
import p058f5.AbstractC6360c0;
import p058f5.C6386y;

@Keep
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/http/progress/ProgressRequestBody;", "Lf5/c0;", "Ljava/io/File;", "file", "Lf5/y;", "contentType", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "<init>", "(Ljava/io/File;Lf5/y;Lcom/zykj/http/listener/UploadProgressListener;)V", "()Lf5/y;", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "Ljava/io/File;", "Lf5/y;", "Lcom/zykj/http/listener/UploadProgressListener;", "http_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nProgressRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressRequestBody.kt\ncom/zykj/http/progress/ProgressRequestBody\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes4.dex */
public final class ProgressRequestBody extends AbstractC6360c0 {
    private final C6386y contentType;
    private final File file;
    private final UploadProgressListener listener;

    public /* synthetic */ ProgressRequestBody(File file, C6386y c6386y, UploadProgressListener uploadProgressListener, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i6 & 2) != 0 ? null : c6386y, (i6 & 4) != 0 ? null : uploadProgressListener);
    }

    @Override // p058f5.AbstractC6360c0
    /* renamed from: contentType, reason: from getter */
    public C6386y getContentType() {
        return this.contentType;
    }

    @Override // p058f5.AbstractC6360c0
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long length = this.file.length();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        long j6 = 0;
        while (true) {
            try {
                int i6 = fileInputStream.read(bArr);
                if (i6 == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    return;
                } else {
                    j6 += i6;
                    sink.write(bArr, 0, i6);
                    try {
                        UploadProgressListener uploadProgressListener = this.listener;
                        if (uploadProgressListener != null) {
                            uploadProgressListener.onProgressUpdate(j6, length);
                        }
                    } catch (Exception unused) {
                    }
                }
            } finally {
            }
        }
    }

    public ProgressRequestBody(File file, C6386y c6386y, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.contentType = c6386y;
        this.listener = uploadProgressListener;
    }
}
