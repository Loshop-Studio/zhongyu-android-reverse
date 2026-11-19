package retrofit2;

import android.support.v4.media.AbstractC0037f;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: retrofit2.b0 */
/* loaded from: classes4.dex */
public final class C6485b0 extends AbstractC6522v {

    /* renamed from: d */
    public final /* synthetic */ int f10679d;

    /* renamed from: e */
    public final Method f10680e;

    /* renamed from: f */
    public final int f10681f;

    /* renamed from: g */
    public final boolean f10682g;

    public /* synthetic */ C6485b0(Method method, int i, boolean z8, int i8) {
        this.f10679d = i8;
        this.f10680e = method;
        this.f10681f = i;
        this.f10682g = z8;
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        switch (this.f10679d) {
            case 0:
                Map map = (Map) obj;
                int i = this.f10681f;
                Method method = this.f10680e;
                if (map == null) {
                    throw AbstractC6522v.m6172n(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC6522v.m6172n(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC6522v.m6172n(method, i, AbstractC0037f.m86k("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC6522v.m6172n(method, i, "Field map value '" + value + "' converted to null by " + C6484b.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c6503k0.m6146a(str, string, this.f10682g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                int i8 = this.f10681f;
                Method method2 = this.f10680e;
                if (map2 == null) {
                    throw AbstractC6522v.m6172n(method2, i8, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC6522v.m6172n(method2, i8, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC6522v.m6172n(method2, i8, AbstractC0037f.m86k("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c6503k0.m6147b(str2, value2.toString(), this.f10682g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i9 = this.f10681f;
                Method method3 = this.f10680e;
                if (map3 == null) {
                    throw AbstractC6522v.m6172n(method3, i9, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC6522v.m6172n(method3, i9, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC6522v.m6172n(method3, i9, AbstractC0037f.m86k("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC6522v.m6172n(method3, i9, "Query map value '" + value3 + "' converted to null by " + C6484b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c6503k0.m6149d(str3, string2, this.f10682g);
                }
                return;
        }
    }
}
