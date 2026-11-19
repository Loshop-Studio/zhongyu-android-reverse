package android.view.serialization.serializers;

import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.serialization.SavedStateDecoder;
import android.view.serialization.SavedStateEncoder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "Ljava/io/Serializable;", ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "<init>", "()V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Ljava/io/Serializable;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Ljava/io/Serializable;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/JavaSerializableSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 4 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n321#4:425\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/JavaSerializableSerializer\n*L\n152#1:423\n160#1:424\n160#1:425\n*E\n"})
/* loaded from: classes2.dex */
public abstract class JavaSerializableSerializer<T extends Serializable> implements InterfaceC5686b {

    @NotNull
    private final InterfaceC5765g descriptor = AbstractC0000a.m5f("java.io.Serializable", new InterfaceC5765g[0]);

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public final InterfaceC5765g getDescriptor() {
        return this.descriptor;
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public final T deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(this.descriptor.mo5105h(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        T t8 = (T) SavedStateReader.m13635getJavaSerializableimpl(SavedStateReader.m13597constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey(), AbstractC5832m.m5340a(Serializable.class));
        AbstractC5830k.m5328e(t8, "null cannot be cast to non-null type T of androidx.savedstate.serialization.serializers.JavaSerializableSerializer");
        return t8;
    }

    @Override // p084i7.InterfaceC5689e
    public final void serialize(@NotNull InterfaceC6072f encoder, @NotNull T value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(this.descriptor.mo5105h(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.m13703putJavaSerializableimpl(SavedStateWriter.m13683constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }
}
