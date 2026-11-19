package com.zykj.merge.sketch.listener;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m13558d2 = {"Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "", "onPlayEnd", "", "onPlayPause", "onPlayStart", "onPlayWait", "onProgress", "progress", "", "merge_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public interface PlayStatusListener {
    void onPlayEnd();

    void onPlayPause();

    void onPlayStart();

    void onPlayWait();

    void onProgress(long progress);
}
