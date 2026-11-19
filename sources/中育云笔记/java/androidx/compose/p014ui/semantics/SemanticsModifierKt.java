package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.platform.ValueElementSequence;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10980x;

/* loaded from: classes2.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10410o.m21752e(AbstractC10967q0.m24038e(AbstractC10980x.m24153x(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Pair pairM22975a = AbstractC10776g.m22975a(key.getName(), entry.getValue());
            linkedHashMap.put(pairM22975a.m20051f(), pairM22975a.m20052g());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new ClearAndSetSemanticsElement(interfaceC9540l));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z10, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new AppendedSemanticsElement(z10, interfaceC9540l));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semantics(modifier, z10, interfaceC9540l);
    }
}
