package ge;

import ee.InterfaceC9129f;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.MissingFieldException;

/* renamed from: ge.y1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9402y1 {
    /* renamed from: a */
    public static final void m18611a(int i10, int i11, InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.mo17959d(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.mo17961f());
    }
}
