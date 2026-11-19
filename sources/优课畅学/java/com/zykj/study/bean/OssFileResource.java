package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class OssFileResource {
    public static final int $stable = 0;
    private final String name;
    private final int value;

    @StabilityInferred(parameters = 1)
    public static final class Log extends OssFileResource {
        public static final int $stable = 0;
        public static final Log INSTANCE = new Log();

        private Log() {
            super(2, "log", null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Other extends OssFileResource {
        public static final int $stable = 0;
        public static final Other INSTANCE = new Other();

        private Other() {
            super(3, "other", null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Resource extends OssFileResource {
        public static final int $stable = 0;
        public static final Resource INSTANCE = new Resource();

        private Resource() {
            super(1, SourceRouterRecord.SOURCE_RES_IMAGE, null);
        }
    }

    public /* synthetic */ OssFileResource(int i10, String str, AbstractC9126n abstractC9126n) {
        this(i10, str);
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    private OssFileResource(int i10, String str) {
        this.value = i10;
        this.name = str;
    }
}
