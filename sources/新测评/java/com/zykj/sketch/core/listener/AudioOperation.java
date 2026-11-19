package com.zykj.sketch.core.listener;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/AudioOperation;", "", "isRecord", "", "setProgressListener", "", "listener", "Lcom/zykj/sketch/core/listener/ProgressListener;", "startRecord", "stopRecord", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface AudioOperation {
    boolean isRecord();

    void setProgressListener(ProgressListener listener);

    void startRecord();

    void stopRecord();
}
