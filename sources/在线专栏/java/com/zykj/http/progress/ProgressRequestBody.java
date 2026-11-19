package com.zykj.http.progress;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p163v2.C3424a;

@Keep
/* loaded from: classes.dex */
public final class ProgressRequestBody extends RequestBody {

    @Nullable
    private final MediaType contentType;

    @NotNull
    private final File file;

    @Nullable
    private final UploadProgressListener listener;

    public /* synthetic */ ProgressRequestBody(File file, MediaType mediaType, UploadProgressListener uploadProgressListener, int i4, C2764g c2764g) {
        this(file, (i4 & 2) != 0 ? null : mediaType, (i4 & 4) != 0 ? null : uploadProgressListener);
    }

    @Override // okhttp3.RequestBody
    @Nullable
    public MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        C2769l.m9241e(sink, "sink");
        long length = this.file.length();
        byte[] bArr = new byte[1024];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        long j4 = 0;
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (i4 == -1) {
                    C2925r c2925r = C2925r.f11415a;
                    C3424a.m10441a(fileInputStream, null);
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

    public ProgressRequestBody(@NotNull File file, @Nullable MediaType mediaType, @Nullable UploadProgressListener uploadProgressListener) {
        C2769l.m9241e(file, "file");
        this.file = file;
        this.contentType = mediaType;
        this.listener = uploadProgressListener;
    }
}
