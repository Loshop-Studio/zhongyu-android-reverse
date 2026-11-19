package com.zykj.merge.sketch.config;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class RecorderConfig {
    private Boolean isRecord;
    private Boolean isTouchable;
    private int maxImageCount;
    private Integer paintColor;
    private Float paintWidth;
    private Integer shapeType;
    private String sourcePath;

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

        public final Boolean isRecord() {
            return this.isRecord;
        }

        public final Boolean isTouchable() {
            return this.isTouchable;
        }

        /* renamed from: setMaxImageCount, reason: collision with other method in class */
        public final void m34019setMaxImageCount(int i10) {
            this.maxImageCount = i10;
        }

        /* renamed from: setPaintColor, reason: collision with other method in class */
        public final void m34020setPaintColor(Integer num) {
            this.paintColor = num;
        }

        /* renamed from: setPaintWidth, reason: collision with other method in class */
        public final void m34021setPaintWidth(Float f10) {
            this.paintWidth = f10;
        }

        /* renamed from: setRecord, reason: collision with other method in class */
        public final void m34022setRecord(Boolean bool) {
            this.isRecord = bool;
        }

        /* renamed from: setShapeType, reason: collision with other method in class */
        public final void m34023setShapeType(Integer num) {
            this.shapeType = num;
        }

        /* renamed from: setSourcePath, reason: collision with other method in class */
        public final void m34024setSourcePath(String str) {
            this.sourcePath = str;
        }

        /* renamed from: setTouchable, reason: collision with other method in class */
        public final void m34025setTouchable(Boolean bool) {
            this.isTouchable = bool;
        }

        public final Builder setMaxImageCount(int i10) {
            this.maxImageCount = i10;
            return this;
        }

        public final Builder setPaintColor(Integer num) {
            this.paintColor = num;
            return this;
        }

        public final Builder setPaintWidth(Float f10) {
            this.paintWidth = f10;
            return this;
        }

        public final Builder setRecord(Boolean bool) {
            this.isRecord = bool;
            return this;
        }

        public final Builder setShapeType(Integer num) {
            this.shapeType = num;
            return this;
        }

        public final Builder setSourcePath(String sourcePath) {
            AbstractC9979u.m20294g(sourcePath, "sourcePath");
            this.sourcePath = sourcePath;
            return this;
        }

        public final Builder setTouchable(Boolean bool) {
            this.isTouchable = bool;
            return this;
        }
    }

    public RecorderConfig(Builder builder) {
        AbstractC9979u.m20294g(builder, "builder");
        this.maxImageCount = 3;
        this.isRecord = builder.isRecord();
        this.isTouchable = builder.isTouchable();
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

    public final Boolean isRecord() {
        return this.isRecord;
    }

    public final Boolean isTouchable() {
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
