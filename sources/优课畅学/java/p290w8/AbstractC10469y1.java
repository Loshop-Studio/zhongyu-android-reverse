package p290w8;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.MissingFieldException;
import p268u8.InterfaceC10210f;

/* renamed from: w8.y1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10469y1 {
    /* renamed from: a */
    public static final void m19583a(int i10, int i11, InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.mo19087d(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.mo19089f());
    }
}
