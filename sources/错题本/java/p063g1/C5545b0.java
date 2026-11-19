package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.b0 */
/* loaded from: classes2.dex */
public class C5545b0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        ArrayList arrayList = new ArrayList();
        c6046a.m5743a();
        while (c6046a.m5751k()) {
            try {
                arrayList.add(Integer.valueOf(c6046a.m5756p()));
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException(e);
            }
        }
        c6046a.m5747e();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5768b();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            c6047b.m5781q(r6.get(i));
        }
        c6047b.m5771e();
    }
}
