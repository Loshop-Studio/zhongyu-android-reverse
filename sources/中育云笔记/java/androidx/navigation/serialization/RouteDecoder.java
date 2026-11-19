package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import ee.InterfaceC9129f;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.serialization.modules.AbstractC10057d;
import p049ce.InterfaceC5431a;
import p153fe.AbstractC9224a;
import p153fe.InterfaceC9228e;
import p182he.AbstractC9553a;

/* loaded from: classes.dex */
public final class RouteDecoder extends AbstractC9224a {
    private int elementIndex;
    private String elementName;
    private final AbstractC9553a serializersModule;
    private final ArgStore store;

    public RouteDecoder(Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(bundle, "bundle");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC10057d.m21051a();
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

    @Override // p153fe.InterfaceC9226c
    public int decodeElementIndex(InterfaceC9129f descriptor) {
        String strMo17959d;
        AbstractC9979u.m20294g(descriptor, "descriptor");
        int i10 = this.elementIndex;
        do {
            i10++;
            if (i10 >= descriptor.mo17958c()) {
                return -1;
            }
            strMo17959d = descriptor.mo17959d(i10);
        } while (!this.store.contains(strMo17959d));
        this.elementIndex = i10;
        this.elementName = strMo17959d;
        return i10;
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public InterfaceC9228e decodeInline(InterfaceC9129f descriptor) {
        AbstractC9979u.m20294g(descriptor, "descriptor");
        if (RouteSerializerKt.isValueClass(descriptor)) {
            this.elementName = descriptor.mo17959d(0);
            this.elementIndex = 0;
        }
        return super.decodeInline(descriptor);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public boolean decodeNotNullMark() {
        return this.store.get(this.elementName) != null;
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public Void decodeNull() {
        return null;
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(InterfaceC5431a deserializer) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        return (T) super.decodeSerializableValue(deserializer);
    }

    @Override // p153fe.AbstractC9224a, p153fe.InterfaceC9228e
    public <T> T decodeSerializableValue(InterfaceC5431a deserializer) {
        AbstractC9979u.m20294g(deserializer, "deserializer");
        return (T) internalDecodeValue();
    }

    @Override // p153fe.AbstractC9224a
    public Object decodeValue() {
        return internalDecodeValue();
    }

    @Override // p153fe.InterfaceC9226c
    public AbstractC9553a getSerializersModule() {
        return this.serializersModule;
    }

    public RouteDecoder(SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        AbstractC9979u.m20294g(handle, "handle");
        AbstractC9979u.m20294g(typeMap, "typeMap");
        this.elementIndex = -1;
        this.elementName = "";
        this.serializersModule = AbstractC10057d.m21051a();
        this.store = new SavedStateHandleArgStore(handle, typeMap);
    }
}
