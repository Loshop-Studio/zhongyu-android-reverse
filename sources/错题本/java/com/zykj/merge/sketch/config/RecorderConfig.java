package com.zykj.merge.sketch.config;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m5110d2 = {"Lcom/zykj/merge/sketch/config/RecorderConfig;", "", "builder", "Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;)V", "isRecord", "", "()Ljava/lang/Boolean;", "setRecord", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isTouchable", "setTouchable", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "paintColor", "getPaintColor", "()Ljava/lang/Integer;", "setPaintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "paintWidth", "", "getPaintWidth", "()Ljava/lang/Float;", "setPaintWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "shapeType", "getShapeType", "setShapeType", "sourcePath", "", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "(Ljava/lang/String;)V", "Builder", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RecorderConfig {

    @Nullable
    private Boolean isRecord;

    @Nullable
    private Boolean isTouchable;
    private int maxImageCount;

    @Nullable
    private Integer paintColor;

    @Nullable
    private Float paintWidth;

    @Nullable
    private Integer shapeType;

    @Nullable
    private String sourcePath;

    @Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020'J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010(J\u0015\u0010\u001d\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010)J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010*J\u0015\u0010\"\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010(J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010*R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0004¨\u0006+"}, m5110d2 = {"Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "", "sourcePath", "", "(Ljava/lang/String;)V", "isRecord", "", "()Ljava/lang/Boolean;", "setRecord", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isTouchable", "setTouchable", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "paintColor", "getPaintColor", "()Ljava/lang/Integer;", "setPaintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "paintWidth", "", "getPaintWidth", "()Ljava/lang/Float;", "setPaintWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "shapeType", "getShapeType", "setShapeType", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "build", "Lcom/zykj/merge/sketch/config/RecorderConfig;", "(Ljava/lang/Integer;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Ljava/lang/Float;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Ljava/lang/Boolean;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "merge_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Builder {

        @Nullable
        private Boolean isRecord;

        @Nullable
        private Boolean isTouchable;
        private int maxImageCount = 3;

        @Nullable
        private Integer paintColor;

        @Nullable
        private Float paintWidth;

        @Nullable
        private Integer shapeType;

        @Nullable
        private String sourcePath;

        public Builder(@Nullable String str) {
            this.sourcePath = str;
        }

        @NotNull
        public final RecorderConfig build() {
            return new RecorderConfig(this);
        }

        public final int getMaxImageCount() {
            return this.maxImageCount;
        }

        @Nullable
        public final Integer getPaintColor() {
            return this.paintColor;
        }

        @Nullable
        public final Float getPaintWidth() {
            return this.paintWidth;
        }

        @Nullable
        public final Integer getShapeType() {
            return this.shapeType;
        }

        @Nullable
        public final String getSourcePath() {
            return this.sourcePath;
        }

        @Nullable
        /* renamed from: isRecord, reason: from getter */
        public final Boolean getIsRecord() {
            return this.isRecord;
        }

        @Nullable
        /* renamed from: isTouchable, reason: from getter */
        public final Boolean getIsTouchable() {
            return this.isTouchable;
        }

        /* renamed from: setMaxImageCount, reason: collision with other method in class */
        public final void m13816setMaxImageCount(int i) {
            this.maxImageCount = i;
        }

        /* renamed from: setPaintColor, reason: collision with other method in class */
        public final void m13817setPaintColor(@Nullable Integer num) {
            this.paintColor = num;
        }

        /* renamed from: setPaintWidth, reason: collision with other method in class */
        public final void m13818setPaintWidth(@Nullable Float f) {
            this.paintWidth = f;
        }

        /* renamed from: setRecord, reason: collision with other method in class */
        public final void m13819setRecord(@Nullable Boolean bool) {
            this.isRecord = bool;
        }

        /* renamed from: setShapeType, reason: collision with other method in class */
        public final void m13820setShapeType(@Nullable Integer num) {
            this.shapeType = num;
        }

        /* renamed from: setSourcePath, reason: collision with other method in class */
        public final void m13821setSourcePath(@Nullable String str) {
            this.sourcePath = str;
        }

        /* renamed from: setTouchable, reason: collision with other method in class */
        public final void m13822setTouchable(@Nullable Boolean bool) {
            this.isTouchable = bool;
        }

        @NotNull
        public final Builder setMaxImageCount(int maxImageCount) {
            this.maxImageCount = maxImageCount;
            return this;
        }

        @NotNull
        public final Builder setPaintColor(@Nullable Integer paintColor) {
            this.paintColor = paintColor;
            return this;
        }

        @NotNull
        public final Builder setPaintWidth(@Nullable Float paintWidth) {
            this.paintWidth = paintWidth;
            return this;
        }

        @NotNull
        public final Builder setRecord(@Nullable Boolean isRecord) {
            this.isRecord = isRecord;
            return this;
        }

        @NotNull
        public final Builder setShapeType(@Nullable Integer shapeType) {
            this.shapeType = shapeType;
            return this;
        }

        @NotNull
        public final Builder setSourcePath(@NotNull String sourcePath) {
            AbstractC5830k.m5330g(sourcePath, "sourcePath");
            this.sourcePath = sourcePath;
            return this;
        }

        @NotNull
        public final Builder setTouchable(@Nullable Boolean isTouchable) {
            this.isTouchable = isTouchable;
            return this;
        }
    }

    public RecorderConfig(@NotNull Builder builder) {
        AbstractC5830k.m5330g(builder, "builder");
        this.maxImageCount = 3;
        this.isRecord = builder.getIsRecord();
        this.isTouchable = builder.getIsTouchable();
        this.sourcePath = builder.getSourcePath();
        this.paintColor = builder.getPaintColor();
        this.shapeType = builder.getShapeType();
        this.paintWidth = builder.getPaintWidth();
        this.maxImageCount = builder.getMaxImageCount();
    }

    public final int getMaxImageCount() {
        return this.maxImageCount;
    }

    @Nullable
    public final Integer getPaintColor() {
        return this.paintColor;
    }

    @Nullable
    public final Float getPaintWidth() {
        return this.paintWidth;
    }

    @Nullable
    public final Integer getShapeType() {
        return this.shapeType;
    }

    @Nullable
    public final String getSourcePath() {
        return this.sourcePath;
    }

    @Nullable
    /* renamed from: isRecord, reason: from getter */
    public final Boolean getIsRecord() {
        return this.isRecord;
    }

    @Nullable
    /* renamed from: isTouchable, reason: from getter */
    public final Boolean getIsTouchable() {
        return this.isTouchable;
    }

    public final void setMaxImageCount(int i) {
        this.maxImageCount = i;
    }

    public final void setPaintColor(@Nullable Integer num) {
        this.paintColor = num;
    }

    public final void setPaintWidth(@Nullable Float f) {
        this.paintWidth = f;
    }

    public final void setRecord(@Nullable Boolean bool) {
        this.isRecord = bool;
    }

    public final void setShapeType(@Nullable Integer num) {
        this.shapeType = num;
    }

    public final void setSourcePath(@Nullable String str) {
        this.sourcePath = str;
    }

    public final void setTouchable(@Nullable Boolean bool) {
        this.isTouchable = bool;
    }
}
