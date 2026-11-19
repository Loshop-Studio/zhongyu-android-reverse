package p124n6;

import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.p102io.AccessDeniedException;
import p152r6.InterfaceC6473e;

/* renamed from: n6.c */
/* loaded from: classes2.dex */
public final class C6218c extends AbstractC6217b {

    /* renamed from: b */
    public boolean f9947b;

    /* renamed from: c */
    public File[] f9948c;

    /* renamed from: d */
    public int f9949d;

    /* renamed from: e */
    public boolean f9950e;

    /* renamed from: f */
    public final /* synthetic */ C6222g f9951f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6218c(C6222g c6222g, File file) {
        super(file);
        this.f9951f = c6222g;
    }

    @Override // p124n6.AbstractC6223h
    /* renamed from: a */
    public final File mo5849a() {
        boolean z8 = this.f9950e;
        File file = this.f9960a;
        if (!z8 && this.f9948c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f9948c = fileArrListFiles;
            if (fileArrListFiles == null) {
                InterfaceC6473e interfaceC6473e = this.f9951f.f9959d.f9963c;
                if (interfaceC6473e != null) {
                    interfaceC6473e.invoke(file, new AccessDeniedException(file, null, "Cannot list files in a directory", 2, null));
                }
                this.f9950e = true;
            }
        }
        File[] fileArr = this.f9948c;
        if (fileArr == null || this.f9949d >= fileArr.length) {
            if (this.f9947b) {
                return null;
            }
            this.f9947b = true;
            return file;
        }
        AbstractC5830k.m5327d(fileArr);
        int i = this.f9949d;
        this.f9949d = i + 1;
        return fileArr[i];
    }
}
