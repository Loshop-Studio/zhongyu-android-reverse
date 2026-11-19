package p167t4;

import android.net.Uri;
import android.os.Bundle;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import androidx.compose.material3.AbstractC1923c;
import androidx.navigation.NavType;
import kotlin.collections.C5801p;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.AbstractC6029j;
import kotlinx.serialization.json.internal.C6022c;
import kotlinx.serialization.json.internal.C6039t;
import kotlinx.serialization.json.internal.C6043x;
import kotlinx.serialization.json.internal.WriteMode;
import p041d2.C5413c;
import p084i7.InterfaceC5686b;
import p125n7.C6240o;

/* renamed from: t4.c */
/* loaded from: classes3.dex */
public final class C6590c extends NavType {

    /* renamed from: a */
    public final InterfaceC5686b f11000a;

    /* renamed from: b */
    public final String f11001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6590c(String str, InterfaceC5686b serializer) {
        super(false);
        AbstractC5830k.m5330g(serializer, "serializer");
        this.f11000a = serializer;
        this.f11001b = str;
    }

    /* renamed from: a */
    public final Object m6220a(String str) {
        C6240o c6240o = AbstractC6596i.f11012a;
        InterfaceC5686b deserializer = this.f11000a;
        c6240o.getClass();
        AbstractC5830k.m5330g(deserializer, "deserializer");
        C6043x c6043x = new C6043x(str);
        Object objDecodeSerializableValue = new C6039t(c6240o, WriteMode.OBJ, c6043x, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        if (c6043x.m5711e() == 10) {
            return objDecodeSerializableValue;
        }
        C6043x.m5706m(c6043x, "Expected EOF after parsing, but had " + str.charAt(c6043x.f9597b - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* renamed from: b */
    public final String m6221b(Object obj) {
        char[] cArr;
        C6240o c6240o = AbstractC6596i.f11012a;
        InterfaceC5686b serializer = this.f11000a;
        c6240o.getClass();
        AbstractC5830k.m5330g(serializer, "serializer");
        C5413c c5413c = new C5413c(1, false);
        C6022c c6022c = C6022c.f9545c;
        synchronized (c6022c) {
            C5801p c5801p = c6022c.f9546a;
            cArr = null;
            char[] cArr2 = (char[]) (c5801p.isEmpty() ? null : c5801p.removeLast());
            if (cArr2 != null) {
                c6022c.f9547b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c5413c.f8375c = cArr;
        try {
            AbstractC6029j.m5688i(c6240o, c5413c, serializer, obj);
            return c5413c.toString();
        } finally {
            c5413c.m4805f();
        }
    }

    @Override // androidx.navigation.NavType
    public final Object get(Bundle bundle, String str) {
        String strM13668getStringimpl = SavedStateReader.m13668getStringimpl(AbstractC1923c.m1062z(bundle, "bundle", str, "key", bundle), str);
        if (strM13668getStringimpl != null) {
            return m6220a(strM13668getStringimpl);
        }
        return null;
    }

    @Override // androidx.navigation.NavType
    public final String getName() {
        return this.f11001b;
    }

    @Override // androidx.navigation.NavType
    public final Object parseValue(String value) {
        AbstractC5830k.m5330g(value, "value");
        return m6220a(value);
    }

    @Override // androidx.navigation.NavType
    public final void put(Bundle bundle, String key, Object value) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(key, "key");
        AbstractC5830k.m5330g(value, "value");
        SavedStateWriter.m13716putStringimpl(SavedStateWriter.m13683constructorimpl(bundle), key, m6221b(value));
    }

    @Override // androidx.navigation.NavType
    public final String serializeAsValue(Object value) {
        AbstractC5830k.m5330g(value, "value");
        String strEncode = Uri.encode(m6221b(value));
        AbstractC5830k.m5329f(strEncode, "encode(...)");
        return strEncode;
    }
}
