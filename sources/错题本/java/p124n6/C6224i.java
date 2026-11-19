package p124n6;

import java.io.File;
import java.util.Iterator;
import kotlin.p102io.C5819b;
import kotlin.p102io.FileWalkDirection;
import p152r6.InterfaceC6473e;
import p214z6.InterfaceC6830h;

/* renamed from: n6.i */
/* loaded from: classes2.dex */
public final class C6224i implements InterfaceC6830h {

    /* renamed from: a */
    public final File f9961a;

    /* renamed from: b */
    public final FileWalkDirection f9962b;

    /* renamed from: c */
    public final InterfaceC6473e f9963c;

    public C6224i(File file, FileWalkDirection fileWalkDirection, C5819b c5819b) {
        this.f9961a = file;
        this.f9962b = fileWalkDirection;
        this.f9963c = c5819b;
    }

    @Override // p214z6.InterfaceC6830h
    public final Iterator iterator() {
        return new C6222g(this);
    }
}
