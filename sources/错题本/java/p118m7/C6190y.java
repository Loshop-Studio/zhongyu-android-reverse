package p118m7;

import android.support.v4.media.AbstractC0037f;
import androidx.navigation.C2827b;
import androidx.navigation.C2857e;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.SerializationException;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

/* renamed from: m7.y */
/* loaded from: classes4.dex */
public final class C6190y implements InterfaceC5686b {

    /* renamed from: a */
    public final /* synthetic */ int f9893a;

    /* renamed from: b */
    public final Serializable f9894b;

    /* renamed from: c */
    public final Object f9895c;

    public C6190y() {
        this.f9893a = 1;
        this.f9894b = EmptyList.INSTANCE;
        this.f9895c = AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C2827b(this, 18));
    }

    @Override // p084i7.InterfaceC5685a
    public final Object deserialize(InterfaceC6071e decoder) {
        int iDecodeElementIndex;
        switch (this.f9893a) {
            case 0:
                Enum[] enumArr = (Enum[]) this.f9894b;
                AbstractC5830k.m5330g(decoder, "decoder");
                int iDecodeEnum = decoder.decodeEnum(getDescriptor());
                if (iDecodeEnum >= 0 && iDecodeEnum < enumArr.length) {
                    return enumArr[iDecodeEnum];
                }
                throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().mo5105h() + " enum values, values size is " + enumArr.length);
            default:
                AbstractC5830k.m5330g(decoder, "decoder");
                InterfaceC5765g descriptor = getDescriptor();
                InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(descriptor);
                if (!interfaceC6069cBeginStructure.decodeSequentially() && (iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(getDescriptor())) != -1) {
                    throw new SerializationException(AbstractC0037f.m81f(iDecodeElementIndex, "Unexpected index "));
                }
                interfaceC6069cBeginStructure.endStructure(descriptor);
                return C5443s.f8405a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [d6.e, java.lang.Object] */
    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    public final InterfaceC5765g getDescriptor() {
        switch (this.f9893a) {
            case 0:
                return (InterfaceC5765g) ((InterfaceC5429e) this.f9895c).getValue();
            default:
                return (InterfaceC5765g) this.f9895c.getValue();
        }
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(InterfaceC6072f interfaceC6072f, Object value) {
        switch (this.f9893a) {
            case 0:
                Enum value2 = (Enum) value;
                AbstractC5830k.m5330g(value2, "value");
                Enum[] enumArr = (Enum[]) this.f9894b;
                int iM5196W = AbstractC5802q.m5196W(enumArr, value2);
                if (iM5196W != -1) {
                    interfaceC6072f.encodeEnum(getDescriptor(), iM5196W);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value2);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().mo5105h());
                sb.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC5830k.m5329f(string, "toString(...)");
                sb.append(string);
                throw new SerializationException(sb.toString());
            default:
                AbstractC5830k.m5330g(value, "value");
                interfaceC6072f.beginStructure(getDescriptor()).endStructure(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f9893a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo5105h() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6190y(String str, Enum[] values) {
        this.f9893a = 0;
        AbstractC5830k.m5330g(values, "values");
        this.f9894b = values;
        this.f9895c = AbstractC5773a.m5117b(new C2857e(23, this, str));
    }
}
