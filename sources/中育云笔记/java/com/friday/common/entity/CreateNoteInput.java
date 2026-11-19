package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class CreateNoteInput {
    public static final int $stable = 0;
    private final String fileType;
    private final String localPath;
    private final String noteId;
    private final String noteName;
    private final String parentId;
    private final long userId;

    public CreateNoteInput(String noteId, String noteName, String parentId, long j10, String localPath, String fileType) {
        AbstractC9979u.m20294g(noteId, "noteId");
        AbstractC9979u.m20294g(noteName, "noteName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(localPath, "localPath");
        AbstractC9979u.m20294g(fileType, "fileType");
        this.noteId = noteId;
        this.noteName = noteName;
        this.parentId = parentId;
        this.userId = j10;
        this.localPath = localPath;
        this.fileType = fileType;
    }

    public static /* synthetic */ CreateNoteInput copy$default(CreateNoteInput createNoteInput, String str, String str2, String str3, long j10, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = createNoteInput.noteId;
        }
        if ((i10 & 2) != 0) {
            str2 = createNoteInput.noteName;
        }
        if ((i10 & 4) != 0) {
            str3 = createNoteInput.parentId;
        }
        if ((i10 & 8) != 0) {
            j10 = createNoteInput.userId;
        }
        if ((i10 & 16) != 0) {
            str4 = createNoteInput.localPath;
        }
        if ((i10 & 32) != 0) {
            str5 = createNoteInput.fileType;
        }
        long j11 = j10;
        String str6 = str3;
        return createNoteInput.copy(str, str2, str6, j11, str4, str5);
    }

    public final String component1() {
        return this.noteId;
    }

    public final String component2() {
        return this.noteName;
    }

    public final String component3() {
        return this.parentId;
    }

    public final long component4() {
        return this.userId;
    }

    public final String component5() {
        return this.localPath;
    }

    public final String component6() {
        return this.fileType;
    }

    public final CreateNoteInput copy(String noteId, String noteName, String parentId, long j10, String localPath, String fileType) {
        AbstractC9979u.m20294g(noteId, "noteId");
        AbstractC9979u.m20294g(noteName, "noteName");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(localPath, "localPath");
        AbstractC9979u.m20294g(fileType, "fileType");
        return new CreateNoteInput(noteId, noteName, parentId, j10, localPath, fileType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateNoteInput)) {
            return false;
        }
        CreateNoteInput createNoteInput = (CreateNoteInput) obj;
        return AbstractC9979u.m20289b(this.noteId, createNoteInput.noteId) && AbstractC9979u.m20289b(this.noteName, createNoteInput.noteName) && AbstractC9979u.m20289b(this.parentId, createNoteInput.parentId) && this.userId == createNoteInput.userId && AbstractC9979u.m20289b(this.localPath, createNoteInput.localPath) && AbstractC9979u.m20289b(this.fileType, createNoteInput.fileType);
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getNoteName() {
        return this.noteName;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((this.noteId.hashCode() * 31) + this.noteName.hashCode()) * 31) + this.parentId.hashCode()) * 31) + Long.hashCode(this.userId)) * 31) + this.localPath.hashCode()) * 31) + this.fileType.hashCode();
    }

    public String toString() {
        return "CreateNoteInput(noteId=" + this.noteId + ", noteName=" + this.noteName + ", parentId=" + this.parentId + ", userId=" + this.userId + ", localPath=" + this.localPath + ", fileType=" + this.fileType + ")";
    }

    public /* synthetic */ CreateNoteInput(String str, String str2, String str3, long j10, String str4, String str5, int i10, AbstractC9972n abstractC9972n) {
        this(str, str2, str3, j10, str4, (i10 & 32) != 0 ? "1" : str5);
    }
}
