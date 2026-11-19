package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
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
            super(3, DispatchConstants.OTHER, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Resource extends OssFileResource {
        public static final int $stable = 0;
        public static final Resource INSTANCE = new Resource();

        private Resource() {
            super(1, Constants.SEND_TYPE_RES, null);
        }
    }

    public /* synthetic */ OssFileResource(int i10, String str, AbstractC9972n abstractC9972n) {
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
