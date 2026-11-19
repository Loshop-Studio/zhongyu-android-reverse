package com.zykj.gallery.oss;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileResource;", "", "value", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(ILjava/lang/String;)V", "getValue", "()I", "getName", "()Ljava/lang/String;", "Resource", "Log", "Other", "Lcom/zykj/gallery/oss/FileResource$Log;", "Lcom/zykj/gallery/oss/FileResource$Other;", "Lcom/zykj/gallery/oss/FileResource$Resource;", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public abstract class FileResource {
    public static final int $stable = 0;
    private final String name;
    private final int value;

    @StabilityInferred(parameters = 1)
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileResource$Log;", "Lcom/zykj/gallery/oss/FileResource;", "<init>", "()V", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Log extends FileResource {
        public static final int $stable = 0;
        public static final Log INSTANCE = new Log();

        private Log() {
            super(2, "log", null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileResource$Other;", "Lcom/zykj/gallery/oss/FileResource;", "<init>", "()V", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Other extends FileResource {
        public static final int $stable = 0;
        public static final Other INSTANCE = new Other();

        private Other() {
            super(3, "other", null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileResource$Resource;", "Lcom/zykj/gallery/oss/FileResource;", "<init>", "()V", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Resource extends FileResource {
        public static final int $stable = 0;
        public static final Resource INSTANCE = new Resource();

        private Resource() {
            super(1, "res", null);
        }
    }

    public /* synthetic */ FileResource(int i6, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6, str);
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    private FileResource(int i6, String str) {
        this.value = i6;
        this.name = str;
    }
}
