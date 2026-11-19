package android.view.serialization.serializers;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import coil3.network.AbstractC3315g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.InterfaceC5959y;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.AbstractC5764f;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m5110d2 = {"Landroidx/savedstate/serialization/serializers/MutableStateFlowSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "Lkotlinx/coroutines/flow/y;", "valueSerializer", "<init>", "(Li7/b;)V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Lkotlinx/coroutines/flow/y;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Lkotlinx/coroutines/flow/y;", "Li7/b;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "getDescriptor$annotations", "()V", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MutableStateFlowSerializer<T> implements InterfaceC5686b {

    @NotNull
    private final InterfaceC5765g descriptor;

    @NotNull
    private final InterfaceC5686b valueSerializer;

    public MutableStateFlowSerializer(@NotNull InterfaceC5686b valueSerializer) {
        AbstractC5830k.m5330g(valueSerializer, "valueSerializer");
        this.valueSerializer = valueSerializer;
        AbstractC3315g kind = valueSerializer.getDescriptor().getKind();
        this.descriptor = kind instanceof AbstractC5764f ? AbstractC0000a.m1b("kotlinx.coroutines.flow.MutableStateFlow", (AbstractC5764f) kind) : AbstractC0000a.m2c("kotlinx.coroutines.flow.MutableStateFlow", valueSerializer.getDescriptor());
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p084i7.InterfaceC5689e, p084i7.InterfaceC5685a
    @NotNull
    public InterfaceC5765g getDescriptor() {
        return this.descriptor;
    }

    @Override // p084i7.InterfaceC5685a
    @NotNull
    public InterfaceC5959y deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        return AbstractC5914h.m5546b(decoder.decodeSerializableValue(this.valueSerializer));
    }

    @Override // p084i7.InterfaceC5689e
    public void serialize(@NotNull InterfaceC6072f encoder, @NotNull InterfaceC5959y value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        encoder.encodeSerializableValue(this.valueSerializer, ((C5946n0) value).getValue());
    }
}
