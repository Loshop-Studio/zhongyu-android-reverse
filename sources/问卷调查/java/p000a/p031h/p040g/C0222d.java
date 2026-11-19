package p000a.p031h.p040g;

import java.util.Comparator;

/* renamed from: a.h.g.d */
/* loaded from: classes.dex */
public class C0222d {

    /* renamed from: a */
    public static final Comparator<byte[]> f1490a = new a();

    /* renamed from: a.h.g.d$a */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i = 0; i < bArr3.length; i++) {
                    if (bArr3[i] != bArr4[i]) {
                        length = bArr3[i];
                        length2 = bArr4[i];
                    }
                }
                return 0;
            }
            length = bArr3.length;
            length2 = bArr4.length;
            return length - length2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[LOOP:1: B:15:0x004b->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0092 A[EDGE_INSN: B:81:0x0092->B:32:0x0092 BREAK  A[LOOP:1: B:15:0x004b->B:30:0x008e], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p031h.p040g.C0229k m792a(android.content.Context r20, p000a.p031h.p040g.C0223e r21, android.os.CancellationSignal r22) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p040g.C0222d.m792a(android.content.Context, a.h.g.e, android.os.CancellationSignal):a.h.g.k");
    }
}
