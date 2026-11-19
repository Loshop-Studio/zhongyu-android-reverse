package p124n6;

import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.p102io.AccessDeniedException;
import p152r6.InterfaceC6473e;

/* renamed from: n6.e */
/* loaded from: classes2.dex */
public final class C6220e extends AbstractC6217b {

    /* renamed from: b */
    public boolean f9953b;

    /* renamed from: c */
    public File[] f9954c;

    /* renamed from: d */
    public int f9955d;

    /* renamed from: e */
    public final /* synthetic */ C6222g f9956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6220e(C6222g c6222g, File file) {
        super(file);
        this.f9956e = c6222g;
    }

    @Override // p124n6.AbstractC6223h
    /* renamed from: a */
    public final File mo5849a() {
        InterfaceC6473e interfaceC6473e;
        boolean z8 = this.f9953b;
        File file = this.f9960a;
        if (!z8) {
            this.f9953b = true;
            return file;
        }
        File[] fileArr = this.f9954c;
        if (fileArr != null && this.f9955d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f9954c = fileArrListFiles;
            if (fileArrListFiles == null && (interfaceC6473e = this.f9956e.f9959d.f9963c) != null) {
                interfaceC6473e.invoke(file, new AccessDeniedException(file, null, "Cannot list files in a directory", 2, null));
            }
            File[] fileArr2 = this.f9954c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.f9954c;
        AbstractC5830k.m5327d(fileArr3);
        int i = this.f9955d;
        this.f9955d = i + 1;
        return fileArr3[i];
    }
}
