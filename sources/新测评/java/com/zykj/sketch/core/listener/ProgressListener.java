package com.zykj.sketch.core.listener;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/ProgressListener;", "", "progress", "", "", "recordError", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface ProgressListener {
    void progress(long progress);

    void recordError();
}
