package androidx.navigation.serialization;

import android.os.Bundle;
import android.view.SavedStateHandle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5685a;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6067a;
import p109l7.InterfaceC6071e;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B-\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0000¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102¨\u00065"}, m5110d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "Ll7/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "", "internalDecodeValue", "()Ljava/lang/Object;", "Lk7/g;", "descriptor", "", "decodeElementIndex", "(Lk7/g;)I", "decodeValue", "", "decodeNull", "()Ljava/lang/Void;", "", "decodeNotNullMark", "()Z", "Ll7/e;", "decodeInline", "(Lk7/g;)Ll7/e;", ExifInterface.GPS_DIRECTION_TRUE, "Li7/a;", "deserializer", "decodeRouteWithArgs$navigation_common_release", "(Li7/a;)Ljava/lang/Object;", "decodeRouteWithArgs", "decodeSerializableValue", "Landroidx/navigation/serialization/ArgStore;", "store", "Landroidx/navigation/serialization/ArgStore;", "elementIndex", "I", "elementName", "Ljava/lang/String;", "Lo7/e;", "serializersModule", "Lo7/e;", "getSerializersModule", "()Lo7/e;", "getSerializersModule$annotations", "()V", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRouteDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDecoder.kt\nandroidx/navigation/serialization/RouteDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
/* loaded from: classes2.dex */
public final class RouteDecoder extends AbstractC6067a {
    private int elementIndex;

    @NotNull
    private String elementName;

    @NotNull
    private final AbstractC6281e serializersModule;

    @NotNull
    private final ArgStore store;

    public RouteDecoder(@NotNull Bundle bundle, @NotNull Map<String, ? extends NavType<?>> typeMap) {
        AbstractC5830k.m5330g(bundle, "bundle");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC6283g.f10039a;
        this.store = new SavedStateArgStore(bundle, typeMap);
    }

    public static /* synthetic */ void getSerializersModule$annotations() {
    }

    private final Object internalDecodeValue() {
        Object obj = this.store.get(this.elementName);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.elementName).toString());
    }

    @Override // p109l7.InterfaceC6069c
    public /* bridge */ /* synthetic */ int decodeCollectionSize(@NotNull InterfaceC5765g interfaceC5765g) {
        super.decodeCollectionSize(interfaceC5765g);
        return -1;
    }

    @Override // p109l7.InterfaceC6069c
    public int decodeElementIndex(@NotNull InterfaceC5765g descriptor) {
        String strMo5102e;
        AbstractC5830k.m5330g(descriptor, "descriptor");
        int i = this.elementIndex;
        do {
            i++;
            if (i >= descriptor.mo5101d()) {
                return -1;
            }
            strMo5102e = descriptor.mo5102e(i);
        } while (!this.store.contains(strMo5102e));
        this.elementIndex = i;
        this.elementName = strMo5102e;
        return i;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    @NotNull
    public InterfaceC6071e decodeInline(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementName = descriptor.mo5102e(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(descriptor);
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    public boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // p109l7.AbstractC6067a, p109l7.InterfaceC6071e
    @Nullable
    public Void decodeNull() {
        return null;
    }

    @Override // p109l7.InterfaceC6071e
    @ExperimentalSerializationApi
    @Nullable
    public /* bridge */ /* synthetic */ Object decodeNullableSerializableValue(@NotNull InterfaceC5685a interfaceC5685a) {
        return super.decodeNullableSerializableValue(interfaceC5685a);
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(@NotNull InterfaceC5685a deserializer) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (T) deserializer.deserialize(this);
    }

    @Override // p109l7.InterfaceC6069c
    @ExperimentalSerializationApi
    public /* bridge */ /* synthetic */ boolean decodeSequentially() {
        return false;
    }

    @Override // p109l7.InterfaceC6071e
    public <T> T decodeSerializableValue(@NotNull InterfaceC5685a deserializer) {
        AbstractC5830k.m5330g(deserializer, "deserializer");
        return (T) internalDecodeValue();
    }

    @Override // p109l7.AbstractC6067a
    @NotNull
    public Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // p109l7.InterfaceC6069c
    @NotNull
    public AbstractC6281e getSerializersModule() {
        return this.serializersModule;
    }

    public RouteDecoder(@NotNull SavedStateHandle handle, @NotNull Map<String, ? extends NavType<?>> typeMap) {
        AbstractC5830k.m5330g(handle, "handle");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC6283g.f10039a;
        this.store = new SavedStateHandleArgStore(handle, typeMap);
    }
}
