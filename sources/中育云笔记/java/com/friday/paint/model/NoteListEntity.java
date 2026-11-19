package com.friday.paint.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class NoteListEntity {
    public static final int $stable = 8;
    private boolean inClass;
    private String noteDir;
    private boolean selected;
    private String thumbnailFile;

    public NoteListEntity(String thumbnailFile, boolean z10, boolean z11, String noteDir) {
        AbstractC9979u.m20294g(thumbnailFile, "thumbnailFile");
        AbstractC9979u.m20294g(noteDir, "noteDir");
        this.thumbnailFile = thumbnailFile;
        this.selected = z10;
        this.inClass = z11;
        this.noteDir = noteDir;
    }

    public static /* synthetic */ NoteListEntity copy$default(NoteListEntity noteListEntity, String str, boolean z10, boolean z11, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = noteListEntity.thumbnailFile;
        }
        if ((i10 & 2) != 0) {
            z10 = noteListEntity.selected;
        }
        if ((i10 & 4) != 0) {
            z11 = noteListEntity.inClass;
        }
        if ((i10 & 8) != 0) {
            str2 = noteListEntity.noteDir;
        }
        return noteListEntity.copy(str, z10, z11, str2);
    }

    public final String component1() {
        return this.thumbnailFile;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final boolean component3() {
        return this.inClass;
    }

    public final String component4() {
        return this.noteDir;
    }

    public final NoteListEntity copy(String thumbnailFile, boolean z10, boolean z11, String noteDir) {
        AbstractC9979u.m20294g(thumbnailFile, "thumbnailFile");
        AbstractC9979u.m20294g(noteDir, "noteDir");
        return new NoteListEntity(thumbnailFile, z10, z11, noteDir);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteListEntity)) {
            return false;
        }
        NoteListEntity noteListEntity = (NoteListEntity) obj;
        return AbstractC9979u.m20289b(this.thumbnailFile, noteListEntity.thumbnailFile) && this.selected == noteListEntity.selected && this.inClass == noteListEntity.inClass && AbstractC9979u.m20289b(this.noteDir, noteListEntity.noteDir);
    }

    public final boolean getInClass() {
        return this.inClass;
    }

    public final String getNoteDir() {
        return this.noteDir;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getThumbnailFile() {
        return this.thumbnailFile;
    }

    public int hashCode() {
        return (((((this.thumbnailFile.hashCode() * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.inClass)) * 31) + this.noteDir.hashCode();
    }

    public final void setInClass(boolean z10) {
        this.inClass = z10;
    }

    public final void setNoteDir(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.noteDir = str;
    }

    public final void setSelected(boolean z10) {
        this.selected = z10;
    }

    public final void setThumbnailFile(String str) {
        AbstractC9979u.m20294g(str, "<set-?>");
        this.thumbnailFile = str;
    }

    public String toString() {
        return "NoteListEntity(thumbnailFile=" + this.thumbnailFile + ", selected=" + this.selected + ", inClass=" + this.inClass + ", noteDir=" + this.noteDir + ")";
    }

    public /* synthetic */ NoteListEntity(String str, boolean z10, boolean z11, String str2, int i10, AbstractC9972n abstractC9972n) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? "" : str2);
    }
}
