package kotlin.p227io;

import java.io.File;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class AccessDeniedException extends FileSystemException {
    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i10, AbstractC9972n abstractC9972n) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessDeniedException(File file, File file2, String str) {
        super(file, file2, str);
        AbstractC9979u.m20294g(file, "file");
    }
}
