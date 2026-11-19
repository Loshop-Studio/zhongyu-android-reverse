package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.serialization.modules.C9225c;
import p134i7.AbstractC8778f0;
import p246s8.InterfaceC10052b;
import p300x7.InterfaceC10570l;
import p301x8.AbstractC10583a;

/* loaded from: classes3.dex */
public final class SavedStateConfig_androidKt {
    public static final AbstractC10583a getDefaultSerializersModuleOnPlatform() {
        C9225c c9225c = new C9225c();
        c9225c.mo16917a(AbstractC9137y.m16154b(Size.class), SizeSerializer.INSTANCE);
        c9225c.mo16917a(AbstractC9137y.m16154b(SizeF.class), SizeFSerializer.INSTANCE);
        c9225c.mo16919c(AbstractC9137y.m16154b(SparseArray.class), new InterfaceC10570l() { // from class: androidx.savedstate.serialization.a
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            }
        });
        return c9225c.m16922f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC10052b getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        AbstractC9133u.m16133g(argSerializers, "argSerializers");
        return new SparseArraySerializer((InterfaceC10052b) AbstractC8778f0.m14566l0(argSerializers));
    }
}
