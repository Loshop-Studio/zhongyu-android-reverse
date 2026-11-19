package com.zykj.mistake.feature.notebook.detail;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import kotlin.text.Regex;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p118m7.C6187x;
import p152r6.InterfaceC6469a;

/* renamed from: com.zykj.mistake.feature.notebook.detail.w4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4898w4 implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f7394a = 2;

    /* renamed from: b */
    public final /* synthetic */ int f7395b;

    /* renamed from: c */
    public final /* synthetic */ Object f7396c;

    /* renamed from: d */
    public final /* synthetic */ Object f7397d;

    public /* synthetic */ C4898w4(int i, String str, C6187x c6187x) {
        this.f7395b = i;
        this.f7396c = str;
        this.f7397d = c6187x;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        File parentFile;
        File[] fileArrListFiles;
        switch (this.f7394a) {
            case 0:
                C4764a5 c4764a5 = (C4764a5) this.f7396c;
                int i = this.f7395b;
                final File file = (File) this.f7397d;
                if (c4764a5.f6899f == i && (parentFile = file.getParentFile()) != null && (fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: com.zykj.mistake.feature.notebook.detail.x4
                    @Override // java.io.FileFilter
                    public final boolean accept(File file2) {
                        if (file2.isFile()) {
                            String name = file2.getName();
                            AbstractC5830k.m5329f(name, "getName(...)");
                            if (AbstractC5862w.m5409C(name, "stem_snapshot_", false)) {
                                String name2 = file2.getName();
                                AbstractC5830k.m5329f(name2, "getName(...)");
                                if (AbstractC5862w.m5414u(name2, ".jpg", false) && !AbstractC5830k.m5325b(file2.getAbsolutePath(), file.getAbsolutePath())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                })) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (c4764a5.f6899f == i) {
                            file2.delete();
                        }
                    }
                }
                return C5443s.f8405a;
            case 1:
                return ((Regex) this.f7396c).find((CharSequence) this.f7397d, this.f7395b);
            default:
                int i8 = this.f7395b;
                String str = (String) this.f7396c;
                C6187x c6187x = (C6187x) this.f7397d;
                InterfaceC5765g[] interfaceC5765gArr = new InterfaceC5765g[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    interfaceC5765gArr[i9] = AbstractC0000a.m7h(str + '.' + c6187x.f9768e[i9], C5770l.f9149e, new InterfaceC5765g[0]);
                }
                return interfaceC5765gArr;
        }
    }

    public /* synthetic */ C4898w4(C4764a5 c4764a5, int i, File file) {
        this.f7396c = c4764a5;
        this.f7395b = i;
        this.f7397d = file;
    }

    public /* synthetic */ C4898w4(Regex regex, CharSequence charSequence, int i) {
        this.f7396c = regex;
        this.f7397d = charSequence;
        this.f7395b = i;
    }
}
