package com.zykj.sketch.core.config;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class SketchConfig {
    private final Context context;
    private boolean isTouchable;
    private int maxImageCount;
    private int maxPPTCount;
    private String sourcePath;

    public static final class Builder {
        private boolean isTouchable;
        private int maxImageCount;
        private String sourcePath;

        public Builder() {
            this.maxImageCount = 3;
            this.isTouchable = true;
            this.sourcePath = "";
        }

        public final SketchConfig build(Context context) {
            AbstractC9979u.m20294g(context, "context");
            return new SketchConfig(this, context, null);
        }

        public final int getMaxImageCount() {
            return this.maxImageCount;
        }

        public final String getSourcePath() {
            return this.sourcePath;
        }

        public final boolean isTouchable() {
            return this.isTouchable;
        }

        /* renamed from: setMaxImageCount, reason: collision with other method in class */
        public final void m34051setMaxImageCount(int i10) {
            this.maxImageCount = i10;
        }

        /* renamed from: setSourcePath, reason: collision with other method in class */
        public final void m34052setSourcePath(String str) {
            AbstractC9979u.m20294g(str, "<set-?>");
            this.sourcePath = str;
        }

        /* renamed from: setTouchable, reason: collision with other method in class */
        public final void m34053setTouchable(boolean z10) {
            this.isTouchable = z10;
        }

        public final Builder setMaxImageCount(int i10) {
            this.maxImageCount = i10;
            return this;
        }

        public final Builder setSourcePath(String sourcePath) {
            AbstractC9979u.m20294g(sourcePath, "sourcePath");
            this.sourcePath = sourcePath;
            return this;
        }

        public final Builder setTouchable(boolean z10) {
            this.isTouchable = z10;
            return this;
        }

        public Builder(SketchConfig config) {
            AbstractC9979u.m20294g(config, "config");
            this.maxImageCount = 3;
            this.isTouchable = true;
            this.sourcePath = "";
            this.maxImageCount = config.getMaxImageCount();
            this.isTouchable = config.isTouchable();
            this.sourcePath = config.getSourcePath();
        }
    }

    public /* synthetic */ SketchConfig(Builder builder, Context context, AbstractC9972n abstractC9972n) {
        this(builder, context);
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getMaxImageCount() {
        return this.maxImageCount;
    }

    public final int getMaxPPTCount() {
        return this.maxPPTCount;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final boolean isTouchable() {
        return this.isTouchable;
    }

    public final void setMaxImageCount(int i10) {
        this.maxImageCount = i10;
    }

    public final void setMaxPPTCount(int i10) {
        this.maxPPTCount = i10;
    }

    public final void setSourcePath(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.sourcePath = str;
    }

    public final void setTouchable(boolean z10) {
        this.isTouchable = z10;
    }

    private SketchConfig(Builder builder, Context context) {
        this.context = context;
        this.maxImageCount = 3;
        this.maxPPTCount = 1;
        this.sourcePath = "";
        this.isTouchable = builder.isTouchable();
        this.maxImageCount = builder.getMaxImageCount();
        if (builder.getSourcePath().length() > 0) {
            this.sourcePath = builder.getSourcePath();
            return;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        if (externalFilesDir != null) {
            this.sourcePath = externalFilesDir.getAbsolutePath() + File.separator + System.currentTimeMillis();
        }
    }
}
