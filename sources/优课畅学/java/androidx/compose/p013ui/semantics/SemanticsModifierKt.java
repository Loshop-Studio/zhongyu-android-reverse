package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.platform.ValueElementSequence;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import p077d8.AbstractC8323h;
import p123h7.AbstractC8726f;
import p134i7.AbstractC8798p0;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SemanticsModifierKt {
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8323h.m13510e(AbstractC8798p0.m14663e(AbstractC8811w.m14786x(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Pair pairM14230a = AbstractC8726f.m14230a(key.getName(), entry.getValue());
            linkedHashMap.put(pairM14230a.m15906e(), pairM14230a.m15907g());
        }
        properties.set("properties", linkedHashMap);
    }

    public static final Modifier clearAndSetSemantics(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new ClearAndSetSemanticsElement(interfaceC10570l));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    public static final Modifier semantics(Modifier modifier, boolean z10, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new AppendedSemanticsElement(z10, interfaceC10570l));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semantics(modifier, z10, interfaceC10570l);
    }
}
