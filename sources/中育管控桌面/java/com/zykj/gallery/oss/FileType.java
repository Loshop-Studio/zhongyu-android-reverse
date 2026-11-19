package com.zykj.gallery.oss;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileType;", "", "value", "", "<init>", "(I)V", "getValue", "()I", "File", "Folder", "Lcom/zykj/gallery/oss/FileType$File;", "Lcom/zykj/gallery/oss/FileType$Folder;", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public abstract class FileType {
    public static final int $stable = 0;
    private final int value;

    @StabilityInferred(parameters = 1)
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileType$File;", "Lcom/zykj/gallery/oss/FileType;", "<init>", "()V", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class File extends FileType {
        public static final int $stable = 0;
        public static final File INSTANCE = new File();

        private File() {
            super(1, null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m7879d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"Lcom/zykj/gallery/oss/FileType$Folder;", "Lcom/zykj/gallery/oss/FileType;", "<init>", "()V", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Folder extends FileType {
        public static final int $stable = 0;
        public static final Folder INSTANCE = new Folder();

        private Folder() {
            super(2, null);
        }
    }

    public /* synthetic */ FileType(int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i6);
    }

    public final int getValue() {
        return this.value;
    }

    private FileType(int i6) {
        this.value = i6;
    }
}
