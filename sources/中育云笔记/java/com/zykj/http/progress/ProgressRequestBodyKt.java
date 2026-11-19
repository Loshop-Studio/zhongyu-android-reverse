package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import je.C9740t;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C9740t c9740t, UploadProgressListener uploadProgressListener) {
        AbstractC9979u.m20294g(file, "<this>");
        return new ProgressRequestBody(file, c9740t, uploadProgressListener);
    }
}
