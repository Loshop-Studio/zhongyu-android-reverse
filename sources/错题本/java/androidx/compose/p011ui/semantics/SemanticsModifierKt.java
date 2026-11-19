package androidx.compose.p011ui.semantics;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.platform.ValueElementSequence;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a4\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\u00020\b*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\u00060\u0014j\u0002`\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m5110d2 = {"", "generateSemanticsId", "()I", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "properties", "semantics", "(Landroidx/compose/ui/Modifier;ZLr6/c;)Landroidx/compose/ui/Modifier;", "clearAndSetSemantics", "(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration", "addSemanticsPropertiesFrom", "(Landroidx/compose/ui/platform/InspectorInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1179#2,2:206\n1253#2,4:208\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n203#1:206,2\n203#1:208,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsModifierKt {

    @NotNull
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getProperties();
        int iM5149C = AbstractC5785e0.m5149C(AbstractC5806u.m5277p(semanticsConfiguration, 10));
        if (iM5149C < 16) {
            iM5149C = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM5149C);
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            Pair pair = new Pair(entry.getKey().getName(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        properties.set("properties", linkedHashMap);
    }

    @NotNull
    public static final Modifier clearAndSetSemantics(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new ClearAndSetSemanticsElement(interfaceC6471c));
    }

    public static final int generateSemanticsId() {
        return lastIdentifier.addAndGet(1);
    }

    @NotNull
    public static final Modifier semantics(@NotNull Modifier modifier, boolean z8, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new AppendedSemanticsElement(z8, interfaceC6471c));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        return semantics(modifier, z8, interfaceC6471c);
    }
}
