package android.view.serialization;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6067a;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/savedstate/serialization/EmptyArrayDecoder;", "Ll7/a;", "<init>", "()V", "Lk7/g;", "descriptor", "", "decodeElementIndex", "(Lk7/g;)I", "Lo7/e;", "serializersModule", "Lo7/e;", "getSerializersModule", "()Lo7/e;", "savedstate_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class EmptyArrayDecoder extends AbstractC6067a {

    @NotNull
    public static final EmptyArrayDecoder INSTANCE = new EmptyArrayDecoder();

    @NotNull
    private static final AbstractC6281e serializersModule = AbstractC6283g.f10039a;

    private EmptyArrayDecoder() {
    }

    @Override // p109l7.InterfaceC6069c
    public /* bridge */ /* synthetic */ int decodeCollectionSize(@NotNull InterfaceC5765g interfaceC5765g) {
        super.decodeCollectionSize(interfaceC5765g);
        return -1;
    }

    @Override // p109l7.InterfaceC6069c
    public int decodeElementIndex(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        return -1;
    }

    @Override // p109l7.InterfaceC6071e
    @ExperimentalSerializationApi
    @Nullable
    public /* bridge */ /* synthetic */ Object decodeNullableSerializableValue(@NotNull InterfaceC5685a interfaceC5685a) {
        return super.decodeNullableSerializableValue(interfaceC5685a);
    }

    @Override // p109l7.InterfaceC6069c
    @ExperimentalSerializationApi
    public /* bridge */ /* synthetic */ boolean decodeSequentially() {
        return false;
    }

    @Override // p109l7.InterfaceC6071e
    public /* bridge */ /* synthetic */ Object decodeSerializableValue(@NotNull InterfaceC5685a interfaceC5685a) {
        return super.decodeSerializableValue(interfaceC5685a);
    }

    @Override // p109l7.InterfaceC6069c
    @NotNull
    public AbstractC6281e getSerializersModule() {
        return serializersModule;
    }
}
