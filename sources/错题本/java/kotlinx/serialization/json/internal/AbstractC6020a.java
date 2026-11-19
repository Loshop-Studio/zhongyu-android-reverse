package kotlinx.serialization.json.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.network.AbstractC3315g;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.text.AbstractC5862w;
import kotlinx.serialization.SerializationException;
import p084i7.C5687c;
import p084i7.InterfaceC5685a;
import p101k7.AbstractC5762d;
import p101k7.AbstractC5764f;
import p101k7.C5769k;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6071e;
import p118m7.AbstractC6120b;
import p118m7.AbstractC6152l0;
import p118m7.C6134f0;
import p125n7.AbstractC6227b;
import p125n7.AbstractC6235j;
import p125n7.AbstractC6236k;
import p125n7.AbstractC6250y;
import p125n7.C6229d;
import p125n7.C6232g;
import p125n7.C6241p;
import p125n7.C6243r;
import p125n7.C6246u;
import p125n7.InterfaceC6233h;
import p133o7.AbstractC6281e;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.serialization.json.internal.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6020a implements InterfaceC6233h, InterfaceC6071e, InterfaceC6069c {

    /* renamed from: a */
    public final ArrayList f9539a = new ArrayList();

    /* renamed from: b */
    public boolean f9540b;

    /* renamed from: c */
    public final AbstractC6227b f9541c;

    /* renamed from: d */
    public final String f9542d;

    /* renamed from: e */
    public final C6232g f9543e;

    public AbstractC6020a(AbstractC6227b abstractC6227b, String str) {
        this.f9541c = abstractC6227b;
        this.f9542d = str;
        this.f9543e = abstractC6227b.f9966a;
    }

    @Override // p125n7.InterfaceC6233h
    /* renamed from: a */
    public final AbstractC6235j mo5658a() {
        return m5660c();
    }

    /* renamed from: b */
    public abstract AbstractC6235j mo5659b(String str);

    @Override // p109l7.InterfaceC6071e
    public InterfaceC6069c beginStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC6235j abstractC6235jM5660c = m5660c();
        AbstractC3315g kind = descriptor.getKind();
        boolean zM5325b = AbstractC5830k.m5325b(kind, C5770l.f9147c);
        AbstractC6227b abstractC6227b = this.f9541c;
        if (zM5325b || (kind instanceof AbstractC5762d)) {
            String strMo5105h = descriptor.mo5105h();
            if (abstractC6235jM5660c instanceof C6229d) {
                return new C6034o(abstractC6227b, (C6229d) abstractC6235jM5660c);
            }
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(C6229d.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jM5660c.getClass()).m5320e() + " as the serialized body of " + strMo5105h + " at element: " + m5676s(), abstractC6235jM5660c.toString(), -1);
        }
        if (!AbstractC5830k.m5325b(kind, C5770l.f9148d)) {
            String strMo5105h2 = descriptor.mo5105h();
            if (abstractC6235jM5660c instanceof C6246u) {
                return new C6033n(abstractC6227b, (C6246u) abstractC6235jM5660c, this.f9542d, 8);
            }
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(C6246u.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jM5660c.getClass()).m5320e() + " as the serialized body of " + strMo5105h2 + " at element: " + m5676s(), abstractC6235jM5660c.toString(), -1);
        }
        InterfaceC5765g interfaceC5765gM5685f = AbstractC6029j.m5685f(descriptor.mo5104g(0), abstractC6227b.f9967b);
        AbstractC3315g kind2 = interfaceC5765gM5685f.getKind();
        if (!(kind2 instanceof AbstractC5764f) && !AbstractC5830k.m5325b(kind2, C5769k.f9145b)) {
            throw AbstractC6029j.m5682c(interfaceC5765gM5685f);
        }
        String strMo5105h3 = descriptor.mo5105h();
        if (abstractC6235jM5660c instanceof C6246u) {
            return new C6035p(abstractC6227b, (C6246u) abstractC6235jM5660c);
        }
        throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(C6246u.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jM5660c.getClass()).m5320e() + " as the serialized body of " + strMo5105h3 + " at element: " + m5676s(), abstractC6235jM5660c.toString(), -1);
    }

    /* renamed from: c */
    public final AbstractC6235j m5660c() {
        AbstractC6235j abstractC6235jMo5659b;
        String str = (String) AbstractC5805t.m5236p0(this.f9539a);
        return (str == null || (abstractC6235jMo5659b = mo5659b(str)) == null) ? mo5674q() : abstractC6235jMo5659b;
    }

    /* renamed from: d */
    public final Object m5661d(InterfaceC5685a deserializer, Object obj) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return decodeSerializableValue(deserializer);
    }

    @Override // p109l7.InterfaceC6071e
    public final boolean decodeBoolean() {
        return m5662e(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final boolean decodeBooleanElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5662e(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final byte decodeByte() {
        return m5663f(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final byte decodeByteElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5663f(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final char decodeChar() {
        return m5664g(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final char decodeCharElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5664g(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final double decodeDouble() {
        return m5665h(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final double decodeDoubleElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5665h(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final int decodeEnum(InterfaceC5765g enumDescriptor) {
        AbstractC5830k.m5330g(enumDescriptor, "enumDescriptor");
        String tag = (String) m5675r();
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        String strMo5105h = enumDescriptor.mo5105h();
        if (abstractC6235jMo5659b instanceof AbstractC6250y) {
            return AbstractC6029j.m5690k(enumDescriptor, this.f9541c, ((AbstractC6250y) abstractC6235jMo5659b).mo5854a(), "");
        }
        throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of " + strMo5105h + " at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
    }

    @Override // p109l7.InterfaceC6071e
    public final float decodeFloat() {
        return m5666i(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final float decodeFloatElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5666i(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final InterfaceC6071e decodeInline(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (AbstractC5805t.m5236p0(this.f9539a) != null) {
            return m5667j(m5675r(), descriptor);
        }
        return new C6032m(this.f9541c, mo5674q(), this.f9542d).decodeInline(descriptor);
    }

    @Override // p109l7.InterfaceC6069c
    public final InterfaceC6071e decodeInlineElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5667j(m5673p(descriptor, i), ((AbstractC6152l0) descriptor).mo5104g(i));
    }

    @Override // p109l7.InterfaceC6071e
    public final int decodeInt() {
        return m5668k(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final int decodeIntElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5668k(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final long decodeLong() {
        return m5669l(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final long decodeLongElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5669l(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public boolean decodeNotNullMark() {
        return !(m5660c() instanceof C6243r);
    }

    @Override // p109l7.InterfaceC6071e
    public final Void decodeNull() {
        return null;
    }

    @Override // p109l7.InterfaceC6069c
    public final Object decodeNullableSerializableElement(InterfaceC5765g descriptor, int i, InterfaceC5685a deserializer, Object obj) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(deserializer, "deserializer");
        this.f9539a.add(m5673p(descriptor, i));
        Object objM5661d = (deserializer.getDescriptor().mo5099b() || decodeNotNullMark()) ? m5661d(deserializer, obj) : null;
        if (!this.f9540b) {
            m5675r();
        }
        this.f9540b = false;
        return objM5661d;
    }

    @Override // p109l7.InterfaceC6069c
    public final Object decodeSerializableElement(InterfaceC5765g descriptor, int i, InterfaceC5685a deserializer, Object obj) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        AbstractC5830k.m5330g(deserializer, "deserializer");
        this.f9539a.add(m5673p(descriptor, i));
        Object objM5661d = m5661d(deserializer, obj);
        if (!this.f9540b) {
            m5675r();
        }
        this.f9540b = false;
        return objM5661d;
    }

    @Override // p109l7.InterfaceC6071e
    public final Object decodeSerializableValue(InterfaceC5685a deserializer) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC6120b)) {
            return deserializer.deserialize(this);
        }
        AbstractC6227b abstractC6227b = this.f9541c;
        C6232g c6232g = abstractC6227b.f9966a;
        C5687c c5687c = (C5687c) ((AbstractC6120b) deserializer);
        String strM5687h = AbstractC6029j.m5687h(c5687c.getDescriptor(), abstractC6227b);
        AbstractC6235j abstractC6235jM5660c = m5660c();
        String strMo5105h = c5687c.getDescriptor().mo5105h();
        if (!(abstractC6235jM5660c instanceof C6246u)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(C6246u.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jM5660c.getClass()).m5320e() + " as the serialized body of " + strMo5105h + " at element: " + m5676s(), abstractC6235jM5660c.toString(), -1);
        }
        C6246u c6246u = (C6246u) abstractC6235jM5660c;
        AbstractC6235j abstractC6235j = (AbstractC6235j) c6246u.get(strM5687h);
        String strMo5854a = null;
        if (abstractC6235j != null) {
            AbstractC6250y abstractC6250yM5851a = AbstractC6236k.m5851a(abstractC6235j);
            if (!(abstractC6250yM5851a instanceof C6243r)) {
                strMo5854a = abstractC6250yM5851a.mo5854a();
            }
        }
        try {
            return AbstractC6029j.m5695p(abstractC6227b, strM5687h, c6246u, AbstractC6683l.m6369i((AbstractC6120b) deserializer, this, strMo5854a));
        } catch (SerializationException e) {
            String message = e.getMessage();
            AbstractC5830k.m5327d(message);
            throw AbstractC6029j.m5684e(message, c6246u.toString(), -1);
        }
    }

    @Override // p109l7.InterfaceC6071e
    public final short decodeShort() {
        return m5670m(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final short decodeShortElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5670m(m5673p(descriptor, i));
    }

    @Override // p109l7.InterfaceC6071e
    public final String decodeString() {
        return m5671n(m5675r());
    }

    @Override // p109l7.InterfaceC6069c
    public final String decodeStringElement(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return m5671n(m5673p(descriptor, i));
    }

    /* renamed from: e */
    public final boolean m5662e(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of boolean at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            C6134f0 c6134f0 = AbstractC6236k.f9982a;
            AbstractC5830k.m5330g(abstractC6250y, "<this>");
            String strMo5854a = abstractC6250y.mo5854a();
            String[] strArr = AbstractC6044y.f9602a;
            AbstractC5830k.m5330g(strMo5854a, "<this>");
            Boolean bool = strMo5854a.equalsIgnoreCase("true") ? Boolean.TRUE : strMo5854a.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            m5678u(abstractC6250y, TypedValues.Custom.S_BOOLEAN, tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, TypedValues.Custom.S_BOOLEAN, tag);
            throw null;
        }
    }

    @Override // p109l7.InterfaceC6069c
    public void endStructure(InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
    }

    /* renamed from: f */
    public final byte m5663f(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of byte at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            long jM5852b = AbstractC6236k.m5852b(abstractC6250y);
            Byte bValueOf = (-128 > jM5852b || jM5852b > 127) ? null : Byte.valueOf((byte) jM5852b);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m5678u(abstractC6250y, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, "byte", tag);
            throw null;
        }
    }

    /* renamed from: g */
    public final char m5664g(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of char at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            String strMo5854a = abstractC6250y.mo5854a();
            AbstractC5830k.m5330g(strMo5854a, "<this>");
            int length = strMo5854a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo5854a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, "char", tag);
            throw null;
        }
    }

    @Override // p109l7.InterfaceC6069c
    public final AbstractC6281e getSerializersModule() {
        return this.f9541c.f9967b;
    }

    /* renamed from: h */
    public final double m5665h(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of double at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            C6134f0 c6134f0 = AbstractC6236k.f9982a;
            AbstractC5830k.m5330g(abstractC6250y, "<this>");
            double d9 = Double.parseDouble(abstractC6250y.mo5854a());
            C6232g c6232g = this.f9541c.f9966a;
            if (Math.abs(d9) <= Double.MAX_VALUE) {
                return d9;
            }
            throw AbstractC6029j.m5680a(Double.valueOf(d9), tag, m5660c().toString());
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, "double", tag);
            throw null;
        }
    }

    /* renamed from: i */
    public final float m5666i(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of float at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            C6134f0 c6134f0 = AbstractC6236k.f9982a;
            AbstractC5830k.m5330g(abstractC6250y, "<this>");
            float f = Float.parseFloat(abstractC6250y.mo5854a());
            C6232g c6232g = this.f9541c.f9966a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw AbstractC6029j.m5680a(Float.valueOf(f), tag, m5660c().toString());
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, TypedValues.Custom.S_FLOAT, tag);
            throw null;
        }
    }

    /* renamed from: j */
    public final InterfaceC6071e m5667j(Object obj, InterfaceC5765g inlineDescriptor) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC5830k.m5330g(inlineDescriptor, "inlineDescriptor");
        if (!AbstractC6042w.m5705a(inlineDescriptor)) {
            this.f9539a.add(tag);
            return this;
        }
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        String strMo5105h = inlineDescriptor.mo5105h();
        if (abstractC6235jMo5659b instanceof AbstractC6250y) {
            String source = ((AbstractC6250y) abstractC6235jMo5659b).mo5854a();
            AbstractC6227b json = this.f9541c;
            AbstractC5830k.m5330g(json, "json");
            AbstractC5830k.m5330g(source, "source");
            return new C6027h(new C6043x(source), json);
        }
        throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of " + strMo5105h + " at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
    }

    /* renamed from: k */
    public final int m5668k(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of int at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            long jM5852b = AbstractC6236k.m5852b(abstractC6250y);
            Integer numValueOf = (SieveCacheKt.NodeMetaAndPreviousMask > jM5852b || jM5852b > SieveCacheKt.NodeLinkMask) ? null : Integer.valueOf((int) jM5852b);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m5678u(abstractC6250y, "int", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, "int", tag);
            throw null;
        }
    }

    /* renamed from: l */
    public final long m5669l(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (abstractC6235jMo5659b instanceof AbstractC6250y) {
            AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
            try {
                return AbstractC6236k.m5852b(abstractC6250y);
            } catch (IllegalArgumentException unused) {
                m5678u(abstractC6250y, "long", tag);
                throw null;
            }
        }
        throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of long at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
    }

    /* renamed from: m */
    public final short m5670m(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of short at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        try {
            long jM5852b = AbstractC6236k.m5852b(abstractC6250y);
            Short shValueOf = (-32768 > jM5852b || jM5852b > 32767) ? null : Short.valueOf((short) jM5852b);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m5678u(abstractC6250y, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m5678u(abstractC6250y, "short", tag);
            throw null;
        }
    }

    /* renamed from: n */
    public final String m5671n(Object obj) {
        String tag = (String) obj;
        AbstractC5830k.m5330g(tag, "tag");
        AbstractC6235j abstractC6235jMo5659b = mo5659b(tag);
        if (!(abstractC6235jMo5659b instanceof AbstractC6250y)) {
            throw AbstractC6029j.m5684e("Expected " + AbstractC5832m.m5340a(AbstractC6250y.class).m5320e() + ", but had " + AbstractC5832m.m5340a(abstractC6235jMo5659b.getClass()).m5320e() + " as the serialized body of string at element: " + m5677t(tag), abstractC6235jMo5659b.toString(), -1);
        }
        AbstractC6250y abstractC6250y = (AbstractC6250y) abstractC6235jMo5659b;
        if (!(abstractC6250y instanceof C6241p)) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbM100y.append(m5677t(tag));
            throw AbstractC6029j.m5684e(sbM100y.toString(), m5660c().toString(), -1);
        }
        C6241p c6241p = (C6241p) abstractC6250y;
        if (c6241p.f9987a) {
            return c6241p.f9988b;
        }
        C6232g c6232g = this.f9541c.f9966a;
        StringBuilder sbM100y2 = AbstractC0037f.m100y("String literal for key '", tag, "' should be quoted at element: ");
        sbM100y2.append(m5677t(tag));
        sbM100y2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw AbstractC6029j.m5684e(sbM100y2.toString(), m5660c().toString(), -1);
    }

    /* renamed from: o */
    public String mo5672o(InterfaceC5765g descriptor, int i) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return descriptor.mo5102e(i);
    }

    /* renamed from: p */
    public final String m5673p(InterfaceC5765g interfaceC5765g, int i) {
        AbstractC5830k.m5330g(interfaceC5765g, "<this>");
        String nestedName = mo5672o(interfaceC5765g, i);
        AbstractC5830k.m5330g(nestedName, "nestedName");
        return nestedName;
    }

    /* renamed from: q */
    public abstract AbstractC6235j mo5674q();

    /* renamed from: r */
    public final Object m5675r() {
        ArrayList arrayList = this.f9539a;
        Object objRemove = arrayList.remove(AbstractC5806u.m5282u(arrayList));
        this.f9540b = true;
        return objRemove;
    }

    /* renamed from: s */
    public final String m5676s() {
        ArrayList arrayList = this.f9539a;
        return arrayList.isEmpty() ? "$" : AbstractC5805t.m5234n0(arrayList, ".", "$.", null, null, 60);
    }

    /* renamed from: t */
    public final String m5677t(String currentTag) {
        AbstractC5830k.m5330g(currentTag, "currentTag");
        return m5676s() + '.' + currentTag;
    }

    /* renamed from: u */
    public final void m5678u(AbstractC6250y abstractC6250y, String str, String str2) {
        throw AbstractC6029j.m5684e("Failed to parse literal '" + abstractC6250y + "' as " + (AbstractC5862w.m5409C(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + m5677t(str2), m5660c().toString(), -1);
    }
}
