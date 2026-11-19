package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4519v;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\u0007"}, m5175d2 = {"Ljava/io/File;", "Lr2/v;", "contentType", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "Lcom/zykj/http/progress/ProgressRequestBody;", "asProgressRequestBody", "http_release"}, m5176k = 2, m5177mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C4519v c4519v, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ProgressRequestBody(file, c4519v, uploadProgressListener);
    }
}
