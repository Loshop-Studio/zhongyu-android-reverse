package kotlin.p227io;

import cd.AbstractC5424c;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public abstract class FileSystemException extends IOException {

    /* renamed from: c */
    public final File f23374c;

    /* renamed from: d */
    public final File f23375d;

    /* renamed from: e */
    public final String f23376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(AbstractC5424c.m2904b(file, file2, str));
        AbstractC9979u.m20294g(file, "file");
        this.f23374c = file;
        this.f23375d = file2;
        this.f23376e = str;
    }
}
