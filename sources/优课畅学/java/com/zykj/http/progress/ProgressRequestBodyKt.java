package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8927y;

/* loaded from: classes4.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C8927y c8927y, UploadProgressListener uploadProgressListener) {
        AbstractC9133u.m16133g(file, "<this>");
        return new ProgressRequestBody(file, c8927y, uploadProgressListener);
    }
}
