package com.zykj.sketch.core.config;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/sketch/core/config/SketchConfig;", "", "builder", "Lcom/zykj/sketch/core/config/SketchConfig$Builder;", "context", "Landroid/content/Context;", "(Lcom/zykj/sketch/core/config/SketchConfig$Builder;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isTouchable", "", "()Z", "setTouchable", "(Z)V", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "maxPPTCount", "getMaxPPTCount", "setMaxPPTCount", "sourcePath", "", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "(Ljava/lang/String;)V", "Builder", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class SketchConfig {
    private final Context context;
    private boolean isTouchable;
    private int maxImageCount;
    private int maxPPTCount;
    private String sourcePath;

    @Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/sketch/core/config/SketchConfig$Builder;", "", "()V", "config", "Lcom/zykj/sketch/core/config/SketchConfig;", "(Lcom/zykj/sketch/core/config/SketchConfig;)V", "isTouchable", "", "()Z", "setTouchable", "(Z)V", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "sourcePath", "", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "(Ljava/lang/String;)V", "build", "context", "Landroid/content/Context;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
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
            Intrinsics.checkNotNullParameter(context, "context");
            return new SketchConfig(this, context, null);
        }

        public final int getMaxImageCount() {
            return this.maxImageCount;
        }

        public final String getSourcePath() {
            return this.sourcePath;
        }

        /* renamed from: isTouchable, reason: from getter */
        public final boolean getIsTouchable() {
            return this.isTouchable;
        }

        /* renamed from: setMaxImageCount, reason: collision with other method in class */
        public final void m24256setMaxImageCount(int i10) {
            this.maxImageCount = i10;
        }

        /* renamed from: setSourcePath, reason: collision with other method in class */
        public final void m24257setSourcePath(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sourcePath = str;
        }

        /* renamed from: setTouchable, reason: collision with other method in class */
        public final void m24258setTouchable(boolean z9) {
            this.isTouchable = z9;
        }

        public final Builder setMaxImageCount(int maxImageCount) {
            this.maxImageCount = maxImageCount;
            return this;
        }

        public final Builder setSourcePath(String sourcePath) {
            Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
            this.sourcePath = sourcePath;
            return this;
        }

        public final Builder setTouchable(boolean isTouchable) {
            this.isTouchable = isTouchable;
            return this;
        }

        public Builder(SketchConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.maxImageCount = 3;
            this.isTouchable = true;
            this.sourcePath = "";
            this.maxImageCount = config.getMaxImageCount();
            this.isTouchable = config.getIsTouchable();
            this.sourcePath = config.getSourcePath();
        }
    }

    public /* synthetic */ SketchConfig(Builder builder, Context context, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* renamed from: isTouchable, reason: from getter */
    public final boolean getIsTouchable() {
        return this.isTouchable;
    }

    public final void setMaxImageCount(int i10) {
        this.maxImageCount = i10;
    }

    public final void setMaxPPTCount(int i10) {
        this.maxPPTCount = i10;
    }

    public final void setSourcePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourcePath = str;
    }

    public final void setTouchable(boolean z9) {
        this.isTouchable = z9;
    }

    private SketchConfig(Builder builder, Context context) {
        this.context = context;
        this.maxImageCount = 3;
        this.maxPPTCount = 1;
        this.sourcePath = "";
        this.isTouchable = builder.getIsTouchable();
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
