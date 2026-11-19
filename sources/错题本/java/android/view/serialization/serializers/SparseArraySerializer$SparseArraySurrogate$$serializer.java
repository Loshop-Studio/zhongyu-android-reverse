package android.view.serialization.serializers;

import android.view.serialization.serializers.SparseArraySerializer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.UnknownFieldException;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p084i7.InterfaceC5685a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6069c;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6118a1;
import p118m7.C6127d;
import p118m7.InterfaceC6125c0;

@Metadata(m5109d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m5110d2 = {"androidx/savedstate/serialization/serializers/SparseArraySerializer.SparseArraySurrogate.$serializer", ExifInterface.GPS_DIRECTION_TRUE, "Lm7/c0;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "Li7/b;", "typeSerial0", "(Li7/b;)V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "", "childSerializers", "()[Li7/b;", "typeParametersSerializers", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements InterfaceC6125c0 {

    @NotNull
    private final InterfaceC5765g descriptor;
    private final /* synthetic */ InterfaceC5686b typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        C6118a1 c6118a1 = new C6118a1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        c6118a1.m5821j("keys", false);
        c6118a1.m5821j("values", false);
        this.descriptor = c6118a1;
    }

    private final /* synthetic */ InterfaceC5686b getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p118m7.InterfaceC6125c0
    @NotNull
    public final InterfaceC5686b[] childSerializers() {
        return new InterfaceC5686b[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new C6127d(this.typeSerial0, 0)};
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(@NotNull InterfaceC6071e decoder) {
        List list;
        List list2;
        int i;
        AbstractC5830k.m5330g(decoder, "decoder");
        InterfaceC5765g interfaceC5765g = this.descriptor;
        InterfaceC6069c interfaceC6069cBeginStructure = decoder.beginStructure(interfaceC5765g);
        InterfaceC5429e[] interfaceC5429eArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (interfaceC6069cBeginStructure.decodeSequentially()) {
            list = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), null);
            list2 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, new C6127d(this.typeSerial0, 0), null);
            i = 3;
        } else {
            boolean z8 = true;
            int i8 = 0;
            List list3 = null;
            List list4 = null;
            while (z8) {
                int iDecodeElementIndex = interfaceC6069cBeginStructure.decodeElementIndex(interfaceC5765g);
                if (iDecodeElementIndex == -1) {
                    z8 = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 0, (InterfaceC5685a) interfaceC5429eArr[0].getValue(), list3);
                    i8 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) interfaceC6069cBeginStructure.decodeSerializableElement(interfaceC5765g, 1, new C6127d(this.typeSerial0, 0), list4);
                    i8 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i = i8;
        }
        interfaceC6069cBeginStructure.endStructure(interfaceC5765g);
        return new SparseArraySerializer.SparseArraySurrogate<>(i, list, list2, null);
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public final InterfaceC5765g getDescriptor() {
        return this.descriptor;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(@NotNull InterfaceC6072f encoder, @NotNull SparseArraySerializer.SparseArraySurrogate<T> value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        InterfaceC5765g interfaceC5765g = this.descriptor;
        InterfaceC6070d interfaceC6070dBeginStructure = encoder.beginStructure(interfaceC5765g);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(value, interfaceC6070dBeginStructure, interfaceC5765g, this.typeSerial0);
        interfaceC6070dBeginStructure.endStructure(interfaceC5765g);
    }

    @Override // p118m7.InterfaceC6125c0
    @NotNull
    public final InterfaceC5686b[] typeParametersSerializers() {
        return new InterfaceC5686b[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(@NotNull InterfaceC5686b typeSerial0) {
        this();
        AbstractC5830k.m5330g(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
