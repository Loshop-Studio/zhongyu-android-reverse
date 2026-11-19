package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.serialization.modules.AbstractC9226d;
import p246s8.InterfaceC10051a;
import p268u8.InterfaceC10210f;
import p279v8.AbstractC10252a;
import p279v8.InterfaceC10256e;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class RouteDecoder extends AbstractC10252a {
    private int elementIndex;
    private String elementName;
    private final AbstractC10583a serializersModule;
    private final ArgStore store;

    public RouteDecoder(Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(bundle, "bundle");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC9226d.m16928a();
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

    @Override // p279v8.InterfaceC10254c
    public int decodeElementIndex(InterfaceC10210f descriptor) {
        String strMo19087d;
        AbstractC9133u.m16133g(descriptor, "descriptor");
        int i10 = this.elementIndex;
        do {
            i10++;
            if (i10 >= descriptor.mo19086c()) {
                return -1;
            }
            strMo19087d = descriptor.mo19087d(i10);
        } while (!this.store.contains(strMo19087d));
        this.elementIndex = i10;
        this.elementName = strMo19087d;
        return i10;
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public InterfaceC10256e decodeInline(InterfaceC10210f descriptor) {
        AbstractC9133u.m16133g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementName = descriptor.mo19087d(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(descriptor);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(InterfaceC10051a deserializer) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        return (T) super.decodeSerializableValue(deserializer);
    }

    @Override // p279v8.AbstractC10252a, p279v8.InterfaceC10256e
    public <T> T decodeSerializableValue(InterfaceC10051a deserializer) {
        AbstractC9133u.m16133g(deserializer, "deserializer");
        return (T) internalDecodeValue();
    }

    @Override // p279v8.AbstractC10252a
    public Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // p279v8.InterfaceC10254c
    public AbstractC10583a getSerializersModule() {
        return this.serializersModule;
    }

    public RouteDecoder(SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9133u.m16133g(handle, "handle");
        AbstractC9133u.m16133g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC9226d.m16928a();
        this.store = new SavedStateHandleArgStore(handle, typeMap);
    }
}
