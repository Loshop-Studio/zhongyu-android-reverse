package p118m7;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.material3.AbstractC1923c;
import androidx.navigation.C2861i;
import coil3.network.AbstractC3315g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

/* renamed from: m7.y0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6191y0 {

    /* renamed from: a */
    public static final InterfaceC5765g[] f9896a = new InterfaceC5765g[0];

    /* renamed from: b */
    public static final InterfaceC5686b[] f9897b = new InterfaceC5686b[0];

    /* renamed from: c */
    public static final Object f9898c = new Object();

    /* renamed from: a */
    public static final C6134f0 m5831a(String str, InterfaceC5686b interfaceC5686b) {
        return new C6134f0(str, new C6137g0(interfaceC5686b));
    }

    /* renamed from: b */
    public static final Set m5832b(InterfaceC5765g interfaceC5765g) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        if (interfaceC5765g instanceof InterfaceC6151l) {
            return ((InterfaceC6151l) interfaceC5765g).mo5107a();
        }
        HashSet hashSet = new HashSet(interfaceC5765g.mo5101d());
        int iMo5101d = interfaceC5765g.mo5101d();
        for (int i = 0; i < iMo5101d; i++) {
            hashSet.add(interfaceC5765g.mo5102e(i));
        }
        return hashSet;
    }

    /* renamed from: c */
    public static final InterfaceC5765g[] m5833c(List list) {
        InterfaceC5765g[] interfaceC5765gArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC5765gArr = (InterfaceC5765g[]) list.toArray(new InterfaceC5765g[0])) == null) ? f9896a : interfaceC5765gArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p084i7.InterfaceC5686b m5834d(p207y6.InterfaceC6779c r16, p084i7.InterfaceC5686b... r17) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p118m7.AbstractC6191y0.m5834d(y6.c, i7.b[]):i7.b");
    }

    /* renamed from: e */
    public static final C6190y m5835e(String str, Enum[] values) {
        AbstractC5830k.m5330g(values, "values");
        return new C6190y(str, values);
    }

    /* renamed from: f */
    public static final int m5836f(InterfaceC5765g interfaceC5765g, InterfaceC5765g[] typeParams) {
        AbstractC5830k.m5330g(typeParams, "typeParams");
        int iHashCode = (interfaceC5765g.mo5105h().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iMo5101d = interfaceC5765g.mo5101d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo5101d > 0)) {
                break;
            }
            int i8 = iMo5101d - 1;
            int i9 = i * 31;
            String strMo5105h = interfaceC5765g.mo5104g(interfaceC5765g.mo5101d() - iMo5101d).mo5105h();
            if (strMo5105h != null) {
                iHashCode2 = strMo5105h.hashCode();
            }
            i = i9 + iHashCode2;
            iMo5101d = i8;
        }
        int iMo5101d2 = interfaceC5765g.mo5101d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo5101d2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i10 = iMo5101d2 - 1;
            int i11 = iHashCode3 * 31;
            AbstractC3315g kind = interfaceC5765g.mo5104g(interfaceC5765g.mo5101d() - iMo5101d2).getKind();
            iHashCode3 = i11 + (kind != null ? kind.hashCode() : 0);
            iMo5101d2 = i10;
        }
    }

    /* renamed from: g */
    public static final InterfaceC5686b m5837g(Object obj, InterfaceC5686b... interfaceC5686bArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC5686bArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC5686bArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC5686b.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC5686bArr, interfaceC5686bArr.length));
            if (objInvoke instanceof InterfaceC5686b) {
                return (InterfaceC5686b) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* renamed from: h */
    public static final boolean m5838h(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        return AbstractC6675d.m6349m(interfaceC6779c).isInterface();
    }

    /* renamed from: i */
    public static final InterfaceC6779c m5839i(InterfaceC6793q interfaceC6793q) {
        AbstractC5830k.m5330g(interfaceC6793q, "<this>");
        InterfaceC6779c interfaceC6779cMo5361b = interfaceC6793q.mo5361b();
        if (interfaceC6779cMo5361b instanceof InterfaceC6779c) {
            return interfaceC6779cMo5361b;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC6779cMo5361b);
    }

    /* renamed from: j */
    public static final void m5840j(InterfaceC6779c interfaceC6779c) {
        AbstractC5830k.m5330g(interfaceC6779c, "<this>");
        String strM5320e = ((C5823d) interfaceC6779c).m5320e();
        if (strM5320e == null) {
            strM5320e = "<local class name not available>";
        }
        throw new SerializationException(AbstractC0037f.m86k("Serializer for class '", strM5320e, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* renamed from: k */
    public static final void m5841k(InterfaceC5765g descriptor, int i, int i8) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i9 = (~i) & i8;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i9 & 1) != 0) {
                arrayList.add(descriptor.mo5102e(i10));
            }
            i9 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.mo5105h());
    }

    /* renamed from: l */
    public static final void m5842l(String str, InterfaceC6779c baseClass) {
        String string;
        AbstractC5830k.m5330g(baseClass, "baseClass");
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        C5823d c5823d = (C5823d) baseClass;
        sb.append(c5823d.m5320e());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = AbstractC1923c.m1047k('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbM101z = AbstractC0037f.m101z("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            AbstractC1923c.m1060x(sbM101z, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM101z.append(c5823d.m5320e());
            sbM101z.append("' has to be sealed and '@Serializable'.");
            string = sbM101z.toString();
        }
        throw new SerializationException(string);
    }

    /* renamed from: m */
    public static final String m5843m(InterfaceC5765g interfaceC5765g) {
        return AbstractC5805t.m5234n0(AbstractC5806u.m5260N(0, interfaceC5765g.mo5101d()), ", ", interfaceC5765g.mo5105h() + '(', ")", new C2861i(interfaceC5765g, 26), 24);
    }
}
