package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;
import p246s8.InterfaceC10052b;
import p246s8.InterfaceC10059i;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10253b;
import p279v8.InterfaceC10257f;
import p301x8.AbstractC10583a;
import p301x8.AbstractC10584b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class RouteEncoder<T> extends AbstractC10253b {
    private int elementIndex;
    private final Map<String, List<String>> map;
    private final InterfaceC10052b serializer;
    private final AbstractC10583a serializersModule;
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(InterfaceC10052b serializer, Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC9133u.m16133g(serializer, "serializer");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = AbstractC10584b.m19742a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object obj) {
        String strMo19087d = this.serializer.getDescriptor().mo19087d(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strMo19087d);
        if (navType != null) {
            this.map.put(strMo19087d, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(obj) : AbstractC8807u.m14755e(navType.serializeAsValue(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strMo19087d + ". Please provide NavType through typeMap.").toString());
    }

    @Override // p279v8.AbstractC10253b
    public boolean encodeElement(InterfaceC10210f descriptor, int i10) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        this.elementIndex = i10;
        return true;
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public InterfaceC10257f encodeInline(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // p279v8.InterfaceC10257f
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // p279v8.AbstractC10253b, p279v8.InterfaceC10257f
    public <T> void encodeSerializableValue(InterfaceC10059i serializer, T t10) {
        AbstractC9133u.m16133g(serializer, "serializer");
        internalEncodeValue(t10);
    }

    public final Map<String, List<String>> encodeToArgMap(Object value) {
        AbstractC9133u.m16133g(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return AbstractC9080a.m15956u(this.map);
    }

    @Override // p279v8.AbstractC10253b
    public void encodeValue(Object value) {
        AbstractC9133u.m16133g(value, "value");
        internalEncodeValue(value);
    }

    @Override // p279v8.InterfaceC10257f
    public AbstractC10583a getSerializersModule() {
        return this.serializersModule;
    }
}
