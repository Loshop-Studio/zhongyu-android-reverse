package android.view.serialization.serializers;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import org.jetbrains.annotations.NotNull;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"", "serialName", "Ll7/f;", "encoder", "encoderErrorMessage", "(Ljava/lang/String;Ll7/f;)Ljava/lang/String;", "Ll7/e;", "decoder", "decoderErrorMessage", "(Ljava/lang/String;Ll7/e;)Ljava/lang/String;", "savedstate_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BuiltInSerializerKt {
    @NotNull
    public static final String decoderErrorMessage(@NotNull String serialName, @NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(serialName, "serialName");
        AbstractC5830k.m5330g(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + AbstractC5832m.m5340a(decoder.getClass()).m5320e() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    @NotNull
    public static final String encoderErrorMessage(@NotNull String serialName, @NotNull InterfaceC6072f encoder) {
        AbstractC5830k.m5330g(serialName, "serialName");
        AbstractC5830k.m5330g(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + AbstractC5832m.m5340a(encoder.getClass()).m5320e() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
