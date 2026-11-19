package kotlin.p159io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9133u;
import p256t7.AbstractC10118c;

/* loaded from: classes5.dex */
public abstract class FileSystemException extends IOException {

    /* renamed from: a */
    public final File f17461a;

    /* renamed from: b */
    public final File f17462b;

    /* renamed from: c */
    public final String f17463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(AbstractC10118c.m18863b(file, file2, str));
        AbstractC9133u.m16133g(file, "file");
        this.f17461a = file;
        this.f17462b = file2;
        this.f17463c = str;
    }
}
