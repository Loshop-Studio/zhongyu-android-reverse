package android.view.compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p084i7.InterfaceC5686b;
import p101k7.InterfaceC5765g;
import p109l7.InterfaceC6071e;
import p109l7.InterfaceC6072f;
import p118m7.C6124c;
import p118m7.C6127d;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R \u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m5110d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "Li7/b;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "elementSerializer", "<init>", "(Li7/b;)V", "Ll7/f;", "encoder", "value", "Ld6/s;", "serialize", "(Ll7/f;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "Ll7/e;", "decoder", "deserialize", "(Ll7/e;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Li7/b;", "", "base", "Lk7/g;", "descriptor", "Lk7/g;", "getDescriptor", "()Lk7/g;", "getDescriptor$annotations", "()V", "savedstate-compose_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotStateListSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateListSerializer.kt\nandroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotStateListSerializer<T> implements InterfaceC5686b {

    @NotNull
    private final InterfaceC5686b base;

    @NotNull
    private final InterfaceC5765g descriptor;

    @NotNull
    private final InterfaceC5686b elementSerializer;

    public SnapshotStateListSerializer(@NotNull InterfaceC5686b elementSerializer) {
        AbstractC5830k.m5330g(elementSerializer, "elementSerializer");
        this.elementSerializer = elementSerializer;
        C6127d c6127dM5264c = AbstractC5806u.m5264c(elementSerializer);
        this.base = c6127dM5264c;
        this.descriptor = AbstractC0000a.m2c("androidx.compose.runtime.SnapshotStateList", (C6124c) c6127dM5264c.f9784c);
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
    public SnapshotStateList<T> deserialize(@NotNull InterfaceC6071e decoder) {
        AbstractC5830k.m5330g(decoder, "decoder");
        List list = (List) decoder.decodeSerializableValue(this.base);
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(AbstractC5805t.m5217D0(list));
        return snapshotStateList;
    }

    @Override // p084i7.InterfaceC5689e
    public void serialize(@NotNull InterfaceC6072f encoder, @NotNull SnapshotStateList<T> value) {
        AbstractC5830k.m5330g(encoder, "encoder");
        AbstractC5830k.m5330g(value, "value");
        encoder.encodeSerializableValue(this.base, value);
    }
}
