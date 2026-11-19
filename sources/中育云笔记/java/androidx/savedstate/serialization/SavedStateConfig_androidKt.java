package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.serialization.modules.C10056c;
import p049ce.InterfaceC5432b;
import p181hd.InterfaceC9540l;
import p182he.AbstractC9553a;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class SavedStateConfig_androidKt {
    public static final AbstractC9553a getDefaultSerializersModuleOnPlatform() {
        C10056c c10056c = new C10056c();
        c10056c.mo18786d(AbstractC9983y.m20315b(Size.class), SizeSerializer.INSTANCE);
        c10056c.mo18786d(AbstractC9983y.m20315b(SizeF.class), SizeFSerializer.INSTANCE);
        c10056c.mo18787e(AbstractC9983y.m20315b(SparseArray.class), new InterfaceC9540l() { // from class: androidx.savedstate.serialization.a
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return SavedStateConfig_androidKt.getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0((List) obj);
            }
        });
        return c10056c.m21045f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5432b getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        AbstractC9979u.m20294g(argSerializers, "argSerializers");
        return new SparseArraySerializer((InterfaceC5432b) AbstractC10947g0.m23944m0(argSerializers));
    }
}
