package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0057t;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Ljava/io/File;", "La9/t;", "contentType", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "Lcom/zykj/http/progress/ProgressRequestBody;", "asProgressRequestBody", "(Ljava/io/File;La9/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;", "http_release"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C0057t c0057t, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ProgressRequestBody(file, c0057t, uploadProgressListener);
    }
}
