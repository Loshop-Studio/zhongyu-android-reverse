package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6386y;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7880d2 = {"Ljava/io/File;", "Lf5/y;", "contentType", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "Lcom/zykj/http/progress/ProgressRequestBody;", "asProgressRequestBody", "(Ljava/io/File;Lf5/y;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;", "http_release"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C6386y c6386y, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ProgressRequestBody(file, c6386y, uploadProgressListener);
    }
}
