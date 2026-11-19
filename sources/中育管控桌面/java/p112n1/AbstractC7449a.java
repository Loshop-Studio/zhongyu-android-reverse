package p112n1;

import java.util.Comparator;
import java.util.List;
import p087k.AbstractC6619r;
import p186x5.AbstractC7866a;
import p186x5.AbstractC7867b;

/* renamed from: n1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7449a {

    /* renamed from: a */
    public static final a f9520a = new a();

    /* renamed from: n1.a$a */
    public static final class a implements Comparator {
        /* renamed from: a */
        public int m8498a(AbstractC7866a abstractC7866a, AbstractC7866a abstractC7866a2) {
            throw null;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            AbstractC6619r.m7572a(obj);
            AbstractC6619r.m7572a(obj2);
            return m8498a(null, null);
        }
    }

    /* renamed from: a */
    public static String m8497a(String str, AbstractC7867b abstractC7867b, List list, String str2, InterfaceC7455g interfaceC7455g) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i6 = 0; i6 < str.length(); i6++) {
            stringBuffer.append(AbstractC7450b.m8502d(str.charAt(i6)));
            if (i6 != str.length() - 1) {
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }
}
