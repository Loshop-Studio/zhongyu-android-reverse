package com.zykj.http.progress;

import androidx.annotation.Keep;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.jvm.internal.C2769l;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class ProgressRequestBodyKt {
    @Keep
    @NotNull
    public static final ProgressRequestBody asProgressRequestBody(@NotNull File file, @Nullable MediaType mediaType, @Nullable UploadProgressListener uploadProgressListener) {
        C2769l.m9241e(file, "<this>");
        return new ProgressRequestBody(file, mediaType, uploadProgressListener);
    }
}
