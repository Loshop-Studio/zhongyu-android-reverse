package p118m7;

import android.support.v4.media.AbstractC0037f;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.C5823d;
import kotlin.text.AbstractC5856q;
import kotlin.uuid.Uuid;
import p008a7.C0019a;
import p045d6.C5433i;
import p045d6.C5435k;
import p045d6.C5436l;
import p045d6.C5437m;
import p045d6.C5438n;
import p045d6.C5439o;
import p045d6.C5441q;
import p045d6.C5442r;
import p045d6.C5443s;
import p084i7.InterfaceC5686b;

/* renamed from: m7.f1 */
/* loaded from: classes4.dex */
public abstract class AbstractC6135f1 {

    /* renamed from: a */
    public static final Map f9799a;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(AbstractC5832m.m5340a(String.class), C6156m1.f9829a);
        mapBuilder.put(AbstractC5832m.m5340a(Character.TYPE), C6163p.f9843a);
        mapBuilder.put(AbstractC5832m.m5340a(char[].class), C6160o.f9838c);
        mapBuilder.put(AbstractC5832m.m5340a(Double.TYPE), C6178u.f9869a);
        mapBuilder.put(AbstractC5832m.m5340a(double[].class), C6175t.f9864c);
        mapBuilder.put(AbstractC5832m.m5340a(Float.TYPE), C6121b0.f9777a);
        mapBuilder.put(AbstractC5832m.m5340a(float[].class), C6117a0.f9763c);
        mapBuilder.put(AbstractC5832m.m5340a(Long.TYPE), C6161o0.f9839a);
        mapBuilder.put(AbstractC5832m.m5340a(long[].class), C6158n0.f9833c);
        mapBuilder.put(AbstractC5832m.m5340a(C5438n.class), C6186w1.f9886a);
        mapBuilder.put(AbstractC5832m.m5340a(Integer.TYPE), C6146j0.f9816a);
        mapBuilder.put(AbstractC5832m.m5340a(int[].class), C6143i0.f9813c);
        mapBuilder.put(AbstractC5832m.m5340a(C5436l.class), C6177t1.f9867a);
        mapBuilder.put(AbstractC5832m.m5340a(Short.TYPE), C6153l1.f9824a);
        mapBuilder.put(AbstractC5832m.m5340a(short[].class), C6150k1.f9822c);
        mapBuilder.put(AbstractC5832m.m5340a(C5441q.class), C6195z1.f9904a);
        mapBuilder.put(AbstractC5832m.m5340a(Byte.TYPE), C6145j.f9814a);
        mapBuilder.put(AbstractC5832m.m5340a(byte[].class), C6142i.f9812c);
        mapBuilder.put(AbstractC5832m.m5340a(C5433i.class), C6168q1.f9851a);
        mapBuilder.put(AbstractC5832m.m5340a(Boolean.TYPE), C6136g.f9800a);
        mapBuilder.put(AbstractC5832m.m5340a(boolean[].class), C6133f.f9797c);
        mapBuilder.put(AbstractC5832m.m5340a(C5443s.class), C6119a2.f9775b);
        mapBuilder.put(AbstractC5832m.m5340a(Void.class), C6182v0.f9876a);
        try {
            C5823d c5823dM5340a = AbstractC5832m.m5340a(C0019a.class);
            int i = C0019a.f57d;
            mapBuilder.put(c5823dM5340a, C6181v.f9874a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapBuilder.put(AbstractC5832m.m5340a(C5439o.class), C6183v1.f9878c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapBuilder.put(AbstractC5832m.m5340a(C5437m.class), C6174s1.f9863c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapBuilder.put(AbstractC5832m.m5340a(C5442r.class), C6192y1.f9899c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapBuilder.put(AbstractC5832m.m5340a(C5435k.class), C6165p1.f9848c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            C5823d c5823dM5340a2 = AbstractC5832m.m5340a(Uuid.class);
            AbstractC5830k.m5330g(Uuid.Companion, "<this>");
            mapBuilder.put(c5823dM5340a2, C6123b2.f9779a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        f9799a = mapBuilder.build();
    }

    /* renamed from: a */
    public static final void m5829a(String str) {
        for (InterfaceC5686b interfaceC5686b : f9799a.values()) {
            if (str.equals(interfaceC5686b.getDescriptor().mo5105h())) {
                StringBuilder sbM100y = AbstractC0037f.m100y("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM100y.append(AbstractC5832m.m5340a(interfaceC5686b.getClass()).m5320e());
                sbM100y.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(AbstractC5856q.m5404p(sbM100y.toString()));
            }
        }
    }
}
