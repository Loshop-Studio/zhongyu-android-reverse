package androidx.navigation.serialization;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p084i7.InterfaceC5686b;
import p084i7.InterfaceC5689e;
import p101k7.InterfaceC5765g;
import p109l7.AbstractC6068b;
import p109l7.InterfaceC6070d;
import p109l7.InterfaceC6072f;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010$R\u0016\u0010,\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m5110d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ll7/b;", "Li7/b;", "serializer", "", "", "Landroidx/navigation/NavType;", "typeMap", "<init>", "(Li7/b;Ljava/util/Map;)V", "value", "Ld6/s;", "internalEncodeValue", "(Ljava/lang/Object;)V", "", "encodeToArgMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Li7/e;", "encodeSerializableValue", "(Li7/e;Ljava/lang/Object;)V", "Lk7/g;", "descriptor", "", "index", "", "encodeElement", "(Lk7/g;I)Z", "encodeValue", "encodeNull", "()V", "Ll7/f;", "encodeInline", "(Lk7/g;)Ll7/f;", "Li7/b;", "Ljava/util/Map;", "Lo7/e;", "serializersModule", "Lo7/e;", "getSerializersModule", "()Lo7/e;", "", "map", "elementIndex", "I", "navigation-common_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class RouteEncoder<T> extends AbstractC6068b {
    private int elementIndex;

    @NotNull
    private final Map<String, List<String>> map;

    @NotNull
    private final InterfaceC5686b serializer;

    @NotNull
    private final AbstractC6281e serializersModule;

    @NotNull
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(@NotNull InterfaceC5686b serializer, @NotNull Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC5830k.m5330g(serializer, "serializer");
        AbstractC5830k.m5330g(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = AbstractC6283g.f10039a;
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object value) {
        String strMo5102e = this.serializer.getDescriptor().mo5102e(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strMo5102e);
        if (navType == null) {
            throw new IllegalStateException(AbstractC0037f.m86k("Cannot find NavType for argument ", strMo5102e, ". Please provide NavType through typeMap.").toString());
        }
        this.map.put(strMo5102e, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(value) : AbstractC5806u.m5286y(navType.serializeAsValue(value)));
    }

    @Override // p109l7.InterfaceC6072f
    @NotNull
    public /* bridge */ /* synthetic */ InterfaceC6070d beginCollection(@NotNull InterfaceC5765g interfaceC5765g, int i) {
        return super.beginCollection(interfaceC5765g, i);
    }

    @Override // p109l7.AbstractC6068b
    public boolean encodeElement(@NotNull InterfaceC5765g descriptor, int index) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    @Override // p109l7.AbstractC6068b, p109l7.InterfaceC6072f
    @NotNull
    public InterfaceC6072f encodeInline(@NotNull InterfaceC5765g descriptor) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // p109l7.InterfaceC6072f
    @ExperimentalSerializationApi
    public /* bridge */ /* synthetic */ void encodeNotNullMark() {
    }

    @Override // p109l7.InterfaceC6072f
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // p109l7.InterfaceC6072f
    @ExperimentalSerializationApi
    public /* bridge */ /* synthetic */ void encodeNullableSerializableValue(@NotNull InterfaceC5689e interfaceC5689e, @Nullable Object obj) {
        super.encodeNullableSerializableValue(interfaceC5689e, obj);
    }

    @Override // p109l7.InterfaceC6072f
    public <T> void encodeSerializableValue(@NotNull InterfaceC5689e serializer, T value) {
        AbstractC5830k.m5330g(serializer, "serializer");
        internalEncodeValue(value);
    }

    @NotNull
    public final Map<String, List<String>> encodeToArgMap(@NotNull Object value) {
        AbstractC5830k.m5330g(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return AbstractC5785e0.m5156J(this.map);
    }

    @Override // p109l7.AbstractC6068b
    public void encodeValue(@NotNull Object value) {
        AbstractC5830k.m5330g(value, "value");
        internalEncodeValue(value);
    }

    @Override // p109l7.InterfaceC6072f
    @NotNull
    public AbstractC6281e getSerializersModule() {
        return this.serializersModule;
    }

    @Override // p109l7.InterfaceC6070d
    @ExperimentalSerializationApi
    public /* bridge */ /* synthetic */ boolean shouldEncodeElementDefault(@NotNull InterfaceC5765g interfaceC5765g, int i) {
        super.shouldEncodeElementDefault(interfaceC5765g, i);
        return true;
    }
}
