package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class OssFileType {
    public static final int $stable = 0;
    private final int value;

    @StabilityInferred(parameters = 1)
    public static final class File extends OssFileType {
        public static final int $stable = 0;
        public static final File INSTANCE = new File();

        private File() {
            super(1, null);
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class Folder extends OssFileType {
        public static final int $stable = 0;
        public static final Folder INSTANCE = new Folder();

        private Folder() {
            super(2, null);
        }
    }

    public /* synthetic */ OssFileType(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    public final int getValue() {
        return this.value;
    }

    private OssFileType(int i10) {
        this.value = i10;
    }
}
