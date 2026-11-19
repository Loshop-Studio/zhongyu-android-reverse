package android.view.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6131e0;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m5110d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Li7/b;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "keySerializer", "valueSerializer", "<init>", "(Li7/b;Li7/b;)V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "base", "Li7/b;", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "getDescriptor$annotations", "()V", "savedstate-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotStateMapSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMapSerializer.kt\nandroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateMapSerializer<K, V> implements InterfaceC5686b {

    @NotNull
    private final InterfaceC5686b base;

    @NotNull
    private final InterfaceC5765g descriptor;

    public SnapshotStateMapSerializer(@NotNull InterfaceC5686b keySerializer, @NotNull InterfaceC5686b valueSerializer) {
        AbstractC5830k.m5330g(keySerializer, "keySerializer");
        AbstractC5830k.m5330g(valueSerializer, "valueSerializer");
        C6131e0 c6131e0 = new C6131e0(keySerializer, valueSerializer, 1);
        this.base = c6131e0;
        this.descriptor = AbstractC0000a.m2c("androidx.compose.runtime.SnapshotStateMap", c6131e0.f9794d);
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
    public SnapshotStateMap<K, V> deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        Map<? extends K, ? extends V> map = (Map) decoder.decodeSerializableValue(this.base);
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }

    @Override // p084i7.InterfaceC5689e
    public void serialize(@NotNull InterfaceC6072f encoder, @NotNull SnapshotStateMap<K, V> value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }
}
