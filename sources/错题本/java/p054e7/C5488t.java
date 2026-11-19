package p054e7;

import android.support.v4.media.AbstractC0037f;
import com.zykj.mistake.feature.notebook.detail.C4849o3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.InterfaceC5985n1;
import p075h6.C5632d;
import p075h6.InterfaceC5633e;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5636h;
import p084i7.InterfaceC5686b;
import p133o7.AbstractC6283g;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p204y1.AbstractC6768a;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

/* renamed from: e7.t */
/* loaded from: classes4.dex */
public final /* synthetic */ class C5488t implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f8483a;

    public /* synthetic */ C5488t(int i) {
        this.f8483a = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        switch (this.f8483a) {
            case 0:
                InterfaceC5634f interfaceC5634f = (InterfaceC5634f) obj2;
                if (!(interfaceC5634f instanceof InterfaceC5985n1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC5634f : Integer.valueOf(iIntValue + 1);
            case 1:
                InterfaceC5985n1 interfaceC5985n1 = (InterfaceC5985n1) obj;
                InterfaceC5634f interfaceC5634f2 = (InterfaceC5634f) obj2;
                if (interfaceC5985n1 != null) {
                    return interfaceC5985n1;
                }
                if (interfaceC5634f2 instanceof InterfaceC5985n1) {
                    return (InterfaceC5985n1) interfaceC5634f2;
                }
                return null;
            case 2:
                C5490v c5490v = (C5490v) obj;
                InterfaceC5634f interfaceC5634f3 = (InterfaceC5634f) obj2;
                if (interfaceC5634f3 instanceof InterfaceC5985n1) {
                    InterfaceC5985n1 interfaceC5985n12 = (InterfaceC5985n1) interfaceC5634f3;
                    Object objUpdateThreadContext = interfaceC5985n12.updateThreadContext(c5490v.f8486a);
                    Object[] objArr = c5490v.f8487b;
                    int i = c5490v.f8489d;
                    objArr[i] = objUpdateThreadContext;
                    InterfaceC5985n1[] interfaceC5985n1Arr = c5490v.f8488c;
                    c5490v.f8489d = i + 1;
                    interfaceC5985n1Arr[i] = interfaceC5985n12;
                }
                return c5490v;
            case 3:
                String acc = (String) obj;
                InterfaceC5634f element = (InterfaceC5634f) obj2;
                AbstractC5830k.m5330g(acc, "acc");
                AbstractC5830k.m5330g(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 4:
                InterfaceC5636h acc2 = (InterfaceC5636h) obj;
                InterfaceC5634f element2 = (InterfaceC5634f) obj2;
                AbstractC5830k.m5330g(acc2, "acc");
                AbstractC5830k.m5330g(element2, "element");
                InterfaceC5636h interfaceC5636hMinusKey = acc2.minusKey(element2.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (interfaceC5636hMinusKey == emptyCoroutineContext) {
                    return element2;
                }
                C5632d c5632d = C5632d.f8764a;
                InterfaceC5633e interfaceC5633e = (InterfaceC5633e) interfaceC5636hMinusKey.get(c5632d);
                if (interfaceC5633e == null) {
                    combinedContext = new CombinedContext(interfaceC5636hMinusKey, element2);
                } else {
                    InterfaceC5636h interfaceC5636hMinusKey2 = interfaceC5636hMinusKey.minusKey(c5632d);
                    if (interfaceC5636hMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(element2, interfaceC5633e);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(interfaceC5636hMinusKey2, element2), interfaceC5633e);
                }
                return combinedContext;
            case 5:
                InterfaceC6779c clazz = (InterfaceC6779c) obj;
                final List types = (List) obj2;
                AbstractC5830k.m5330g(clazz, "clazz");
                AbstractC5830k.m5330g(types, "types");
                ArrayList arrayListM6455t = AbstractC6768a.m6455t(AbstractC6283g.f10039a, types, true);
                AbstractC5830k.m5327d(arrayListM6455t);
                final int i8 = 0;
                return AbstractC6768a.m6452q(clazz, arrayListM6455t, new InterfaceC6469a() { // from class: i7.f
                    @Override // p152r6.InterfaceC6469a
                    public final Object invoke() {
                        switch (i8) {
                        }
                        return ((InterfaceC6793q) types.get(0)).mo5361b();
                    }
                });
            case 6:
                InterfaceC6779c clazz2 = (InterfaceC6779c) obj;
                final List types2 = (List) obj2;
                AbstractC5830k.m5330g(clazz2, "clazz");
                AbstractC5830k.m5330g(types2, "types");
                ArrayList arrayListM6455t2 = AbstractC6768a.m6455t(AbstractC6283g.f10039a, types2, true);
                AbstractC5830k.m5327d(arrayListM6455t2);
                final int i9 = 1;
                InterfaceC5686b interfaceC5686bM6452q = AbstractC6768a.m6452q(clazz2, arrayListM6455t2, new InterfaceC6469a() { // from class: i7.f
                    @Override // p152r6.InterfaceC6469a
                    public final Object invoke() {
                        switch (i9) {
                        }
                        return ((InterfaceC6793q) types2.get(0)).mo5361b();
                    }
                });
                if (interfaceC5686bM6452q != null) {
                    return AbstractC5806u.m5283v(interfaceC5686bM6452q);
                }
                return null;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 8:
                return ((InterfaceC5636h) obj).plus((InterfaceC5634f) obj2);
            case 9:
                return ((InterfaceC5636h) obj).plus((InterfaceC5634f) obj2);
            case 10:
                return Boolean.valueOf(AbstractC5830k.m5325b(obj, obj2));
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 12:
                ((Integer) obj).intValue();
                C4849o3 answer = (C4849o3) obj2;
                AbstractC5830k.m5330g(answer, "answer");
                String str = answer.f7230a;
                return AbstractC5855p.m5382P(str) ? "优秀解答" : str;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                AbstractC5830k.m5330g((C4849o3) obj2, "<unused var>");
                return AbstractC0037f.m81f(iIntValue2 + 1, "典错");
        }
    }
}
