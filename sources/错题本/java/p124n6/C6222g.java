package p124n6;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5777b;

/* renamed from: n6.g */
/* loaded from: classes2.dex */
public final class C6222g extends AbstractC5777b {

    /* renamed from: c */
    public final ArrayDeque f9958c;

    /* renamed from: d */
    public final /* synthetic */ C6224i f9959d;

    public C6222g(C6224i c6224i) {
        this.f9959d = c6224i;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f9958c = arrayDeque;
        File file = c6224i.f9961a;
        if (file.isDirectory()) {
            arrayDeque.push(m5850b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C6219d(file));
        } else {
            this.f9165a = 2;
        }
    }

    @Override // kotlin.collections.AbstractC5777b
    /* renamed from: a */
    public final void mo5120a() {
        File file;
        File fileMo5849a;
        while (true) {
            ArrayDeque arrayDeque = this.f9958c;
            AbstractC6223h abstractC6223h = (AbstractC6223h) arrayDeque.peek();
            if (abstractC6223h == null) {
                file = null;
                break;
            }
            fileMo5849a = abstractC6223h.mo5849a();
            if (fileMo5849a == null) {
                arrayDeque.pop();
            } else if (fileMo5849a.equals(abstractC6223h.f9960a) || !fileMo5849a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m5850b(fileMo5849a));
            }
        }
        file = fileMo5849a;
        if (file == null) {
            this.f9165a = 2;
        } else {
            this.f9166b = file;
            this.f9165a = 1;
        }
    }

    /* renamed from: b */
    public final AbstractC6217b m5850b(File file) {
        int i = AbstractC6221f.f9957a[this.f9959d.f9962b.ordinal()];
        if (i == 1) {
            return new C6220e(this, file);
        }
        if (i == 2) {
            return new C6218c(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
