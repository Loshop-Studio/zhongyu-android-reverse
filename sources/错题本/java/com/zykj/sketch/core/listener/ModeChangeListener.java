package com.zykj.sketch.core.listener;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.data.Mode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/ModeChangeListener;", "", "Lcom/zykj/sketch/core/data/Mode;", "mode", "Lcom/zykj/sketch/core/config/GraphConfig;", "graphConfig", "Ld6/s;", "onChange", "(Lcom/zykj/sketch/core/data/Mode;Lcom/zykj/sketch/core/config/GraphConfig;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface ModeChangeListener {
    void onChange(@NotNull Mode mode, @NotNull GraphConfig graphConfig);
}
