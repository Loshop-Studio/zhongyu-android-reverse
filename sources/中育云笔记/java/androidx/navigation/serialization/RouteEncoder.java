package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import ee.InterfaceC9129f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import p049ce.InterfaceC5432b;
import p049ce.InterfaceC5439i;
import p153fe.AbstractC9225b;
import p153fe.InterfaceC9229f;
import p182he.AbstractC9553a;
import p182he.AbstractC9554b;
import p325rc.AbstractC10976v;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class RouteEncoder<T> extends AbstractC9225b {
    private int elementIndex;
    private final Map<String, List<String>> map;
    private final InterfaceC5432b serializer;
    private final AbstractC9553a serializersModule;
    private final Map<String, NavType<Object>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteEncoder(InterfaceC5432b serializer, Map<String, ? extends NavType<Object>> typeMap) {
        AbstractC9979u.m20294g(serializer, "serializer");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = AbstractC9554b.m18782a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void internalEncodeValue(Object obj) {
        String strMo17959d = this.serializer.getDescriptor().mo17959d(this.elementIndex);
        NavType<Object> navType = this.typeMap.get(strMo17959d);
        if (navType != null) {
            this.map.put(strMo17959d, navType instanceof CollectionNavType ? ((CollectionNavType) navType).serializeAsValues(obj) : AbstractC10976v.m24126e(navType.serializeAsValue(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strMo17959d + ". Please provide NavType through typeMap.").toString());
    }

    @Override // p153fe.AbstractC9225b
    public boolean encodeElement(InterfaceC9129f descriptor, int i10) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        this.elementIndex = i10;
        return true;
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public InterfaceC9229f encodeInline(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementIndex = 0;
        }
        return super.encodeInline(descriptor);
    }

    @Override // p153fe.InterfaceC9229f
    public void encodeNull() {
        internalEncodeValue(null);
    }

    @Override // p153fe.AbstractC9225b, p153fe.InterfaceC9229f
    public <T> void encodeSerializableValue(InterfaceC5439i serializer, T t10) {
        AbstractC9979u.m20294g(serializer, "serializer");
        internalEncodeValue(t10);
    }

    public final Map<String, List<String>> encodeToArgMap(Object value) {
        AbstractC9979u.m20294g(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return AbstractC9925a.m20101u(this.map);
    }

    @Override // p153fe.AbstractC9225b
    public void encodeValue(Object value) {
        AbstractC9979u.m20294g(value, "value");
        internalEncodeValue(value);
    }

    @Override // p153fe.InterfaceC9229f
    public AbstractC9553a getSerializersModule() {
        return this.serializersModule;
    }
}
