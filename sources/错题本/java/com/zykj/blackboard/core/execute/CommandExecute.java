package com.zykj.blackboard.core.execute;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/CommandExecute;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "Ld6/s;", "execute", "(Ljava/lang/Object;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface CommandExecute<T> {
    @Nullable
    PlayThread asyncExecute(T data, long skipTime);

    void execute(T data);
}
