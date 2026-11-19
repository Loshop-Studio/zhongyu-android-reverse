package android.view.serialization.serializers;

import android.util.Size;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.serialization.SavedStateDecoder;
import android.view.serialization.SavedStateEncoder;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/SizeSerializer;", "Li7/b;", "Landroid/util/Size;", "<init>", "()V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Landroid/util/Size;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Landroid/util/Size;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBuiltInSerializer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SizeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,421:1\n1#2:422\n106#3:423\n90#3:424\n*S KotlinDebug\n*F\n+ 1 BuiltInSerializer.android.kt\nandroidx/savedstate/serialization/serializers/SizeSerializer\n*L\n59#1:423\n66#1:424\n*E\n"})
/* loaded from: classes2.dex */
public final class SizeSerializer implements InterfaceC5686b {

    @NotNull
    public static final SizeSerializer INSTANCE = new SizeSerializer();

    @NotNull
    private static final InterfaceC5765g descriptor = AbstractC0000a.m5f("android.util.Size", new InterfaceC5765g[0]);

    private SizeSerializer() {
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public InterfaceC5765g getDescriptor() {
        return descriptor;
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public Size deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.decoderErrorMessage(INSTANCE.getDescriptor().mo5105h(), decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        return SavedStateReader.m13660getSizeimpl(SavedStateReader.m13597constructorimpl(savedStateDecoder.getSavedState()), savedStateDecoder.getKey());
    }

    @Override // p084i7.InterfaceC5689e
    public void serialize(@NotNull InterfaceC6072f encoder, @NotNull Size value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.encoderErrorMessage(INSTANCE.getDescriptor().mo5105h(), encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        SavedStateWriter.m13713putSizeimpl(SavedStateWriter.m13683constructorimpl(savedStateEncoder.getSavedState()), savedStateEncoder.getKey(), value);
    }
}
