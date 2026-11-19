package com.zykj.sketch.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.version.GraphTaskParseVersion1;
import com.zykj.sketch.core.version.GraphTaskParseVersion2;
import com.zykj.sketch.core.version.GraphTaskParseVersion3;
import com.zykj.sketch.core.version.GraphTaskParseVersion4;
import com.zykj.sketch.core.version.GraphTaskParseVersion5;
import com.zykj.sketch.core.version.ITaskParse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13412d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13413d2 = {"Lcom/zykj/sketch/core/EventTaskParseFactory;", "", "()V", "Companion", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class EventTaskParseFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m13413d2 = {"Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;", "", "()V", "create", "Lcom/zykj/sketch/core/version/ITaskParse;", "versionCode", "", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ITaskParse create$default(Companion companion, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i9 = 5;
            }
            return companion.create(i9);
        }

        public final ITaskParse create(int versionCode) {
            return versionCode != 1 ? versionCode != 2 ? versionCode != 3 ? versionCode != 4 ? versionCode != 5 ? new GraphTaskParseVersion2() : new GraphTaskParseVersion5() : new GraphTaskParseVersion4() : new GraphTaskParseVersion3() : new GraphTaskParseVersion2() : new GraphTaskParseVersion1();
        }

        private Companion() {
        }
    }

    private EventTaskParseFactory() {
    }
}
