package com.zykj.sketch.core;

import com.zykj.sketch.core.version.GraphTaskParseVersion1;
import com.zykj.sketch.core.version.GraphTaskParseVersion2;
import com.zykj.sketch.core.version.GraphTaskParseVersion3;
import com.zykj.sketch.core.version.GraphTaskParseVersion4;
import com.zykj.sketch.core.version.GraphTaskParseVersion5;
import com.zykj.sketch.core.version.ITaskParse;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes6.dex */
public final class EventTaskParseFactory {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ ITaskParse create$default(Companion companion, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 5;
            }
            return companion.create(i10);
        }

        public final ITaskParse create(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new GraphTaskParseVersion2() : new GraphTaskParseVersion5() : new GraphTaskParseVersion4() : new GraphTaskParseVersion3() : new GraphTaskParseVersion2() : new GraphTaskParseVersion1();
        }

        private Companion() {
        }
    }

    private EventTaskParseFactory() {
    }
}
