package com.zykj.sketch.core.listener;

import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.data.Mode;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/ModeChangeListener;", "", "onChange", "", "mode", "Lcom/zykj/sketch/core/data/Mode;", "graphConfig", "Lcom/zykj/sketch/core/config/GraphConfig;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface ModeChangeListener {
    void onChange(Mode mode, GraphConfig graphConfig);
}
