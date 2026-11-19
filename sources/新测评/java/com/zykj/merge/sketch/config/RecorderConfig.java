package com.zykj.merge.sketch.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001)B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, m13558d2 = {"Lcom/zykj/merge/sketch/config/RecorderConfig;", "", "builder", "Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;)V", "isRecord", "", "()Ljava/lang/Boolean;", "setRecord", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isTouchable", "setTouchable", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "paintColor", "getPaintColor", "()Ljava/lang/Integer;", "setPaintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "paintWidth", "", "getPaintWidth", "()Ljava/lang/Float;", "setPaintWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "shapeType", "getShapeType", "setShapeType", "sourcePath", "", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "(Ljava/lang/String;)V", "Builder", "merge_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class RecorderConfig {
    private Boolean isRecord;
    private Boolean isTouchable;
    private int maxImageCount;
    private Integer paintColor;
    private Float paintWidth;
    private Integer shapeType;
    private String sourcePath;

    @Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020'J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010(J\u0015\u0010\u001d\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010)J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010*J\u0015\u0010\"\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010(J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010*R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0004¨\u0006+"}, m13558d2 = {"Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "", "sourcePath", "", "(Ljava/lang/String;)V", "isRecord", "", "()Ljava/lang/Boolean;", "setRecord", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isTouchable", "setTouchable", "maxImageCount", "", "getMaxImageCount", "()I", "setMaxImageCount", "(I)V", "paintColor", "getPaintColor", "()Ljava/lang/Integer;", "setPaintColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "paintWidth", "", "getPaintWidth", "()Ljava/lang/Float;", "setPaintWidth", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "shapeType", "getShapeType", "setShapeType", "getSourcePath", "()Ljava/lang/String;", "setSourcePath", "build", "Lcom/zykj/merge/sketch/config/RecorderConfig;", "(Ljava/lang/Integer;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Ljava/lang/Float;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "(Ljava/lang/Boolean;)Lcom/zykj/merge/sketch/config/RecorderConfig$Builder;", "merge_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Builder {
        private Boolean isRecord;
        private Boolean isTouchable;
        private int maxImageCount = 3;
        private Integer paintColor;
        private Float paintWidth;
        private Integer shapeType;
        private String sourcePath;

        public Builder(String str) {
            this.sourcePath = str;
        }

        public final RecorderConfig build() {
            return new RecorderConfig(this);
        }

        public final int getMaxImageCount() {
            return this.maxImageCount;
        }

        public final Integer getPaintColor() {
            return this.paintColor;
        }

        public final Float getPaintWidth() {
            return this.paintWidth;
        }

        public final Integer getShapeType() {
            return this.shapeType;
        }

        public final String getSourcePath() {
            return this.sourcePath;
        }

        /* renamed from: isRecord, reason: from getter */
        public final Boolean getIsRecord() {
            return this.isRecord;
        }

        /* renamed from: isTouchable, reason: from getter */
        public final Boolean getIsTouchable() {
            return this.isTouchable;
        }

        /* renamed from: setMaxImageCount, reason: collision with other method in class */
        public final void m24233setMaxImageCount(int i10) {
            this.maxImageCount = i10;
        }

        /* renamed from: setPaintColor, reason: collision with other method in class */
        public final void m24234setPaintColor(Integer num) {
            this.paintColor = num;
        }

        /* renamed from: setPaintWidth, reason: collision with other method in class */
        public final void m24235setPaintWidth(Float f10) {
            this.paintWidth = f10;
        }

        /* renamed from: setRecord, reason: collision with other method in class */
        public final void m24236setRecord(Boolean bool) {
            this.isRecord = bool;
        }

        /* renamed from: setShapeType, reason: collision with other method in class */
        public final void m24237setShapeType(Integer num) {
            this.shapeType = num;
        }

        /* renamed from: setSourcePath, reason: collision with other method in class */
        public final void m24238setSourcePath(String str) {
            this.sourcePath = str;
        }

        /* renamed from: setTouchable, reason: collision with other method in class */
        public final void m24239setTouchable(Boolean bool) {
            this.isTouchable = bool;
        }

        public final Builder setMaxImageCount(int maxImageCount) {
            this.maxImageCount = maxImageCount;
            return this;
        }

        public final Builder setPaintColor(Integer paintColor) {
            this.paintColor = paintColor;
            return this;
        }

        public final Builder setPaintWidth(Float paintWidth) {
            this.paintWidth = paintWidth;
            return this;
        }

        public final Builder setRecord(Boolean isRecord) {
            this.isRecord = isRecord;
            return this;
        }

        public final Builder setShapeType(Integer shapeType) {
            this.shapeType = shapeType;
            return this;
        }

        public final Builder setSourcePath(String sourcePath) {
            Intrinsics.checkNotNullParameter(sourcePath, "sourcePath");
            this.sourcePath = sourcePath;
            return this;
        }

        public final Builder setTouchable(Boolean isTouchable) {
            this.isTouchable = isTouchable;
            return this;
        }
    }

    public RecorderConfig(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
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

    public final Integer getPaintColor() {
        return this.paintColor;
    }

    public final Float getPaintWidth() {
        return this.paintWidth;
    }

    public final Integer getShapeType() {
        return this.shapeType;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    /* renamed from: isRecord, reason: from getter */
    public final Boolean getIsRecord() {
        return this.isRecord;
    }

    /* renamed from: isTouchable, reason: from getter */
    public final Boolean getIsTouchable() {
        return this.isTouchable;
    }

    public final void setMaxImageCount(int i10) {
        this.maxImageCount = i10;
    }

    public final void setPaintColor(Integer num) {
        this.paintColor = num;
    }

    public final void setPaintWidth(Float f10) {
        this.paintWidth = f10;
    }

    public final void setRecord(Boolean bool) {
        this.isRecord = bool;
    }

    public final void setShapeType(Integer num) {
        this.shapeType = num;
    }

    public final void setSourcePath(String str) {
        this.sourcePath = str;
    }

    public final void setTouchable(Boolean bool) {
        this.isTouchable = bool;
    }
}
