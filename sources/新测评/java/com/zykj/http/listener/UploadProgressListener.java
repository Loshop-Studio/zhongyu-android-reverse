package com.zykj.http.listener;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, m13558d2 = {"Lcom/zykj/http/listener/UploadProgressListener;", "", "onProgressUpdate", "", "currentLength", "", "totalLength", "http_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public interface UploadProgressListener {
    void onProgressUpdate(long currentLength, long totalLength);
}
