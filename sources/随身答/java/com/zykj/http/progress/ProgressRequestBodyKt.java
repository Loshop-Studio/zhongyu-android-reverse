package com.zykj.http.progress;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.listener.UploadProgressListener;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8921t;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13413d2 = {"Ljava/io/File;", "Ll8/t;", "contentType", "Lcom/zykj/http/listener/UploadProgressListener;", "listener", "Lcom/zykj/http/progress/ProgressRequestBody;", "asProgressRequestBody", "(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;", "http_release"}, m13414k = 2, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class ProgressRequestBodyKt {
    @Keep
    public static final ProgressRequestBody asProgressRequestBody(File file, C8921t c8921t, UploadProgressListener uploadProgressListener) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ProgressRequestBody(file, c8921t, uploadProgressListener);
    }
}
