package androidx.compose.p014ui;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new ComposedModifier(interfaceC9540l, interfaceC9545q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, interfaceC9540l, interfaceC9545q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(final Composer composer, Modifier modifier) {
        if (modifier.all(new InterfaceC9540l() { // from class: androidx.compose.ui.ComposedModifierKt.materializeImpl.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new InterfaceC9544p() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z10 = element instanceof ComposedModifier;
                Modifier modifierMaterializeImpl = element;
                if (z10) {
                    InterfaceC9545q factory = ((ComposedModifier) element).getFactory();
                    AbstractC9979u.m20292e(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    modifierMaterializeImpl = ComposedModifierKt.materializeImpl(composer, (Modifier) ((InterfaceC9545q) AbstractC9962d0.m20254e(factory, 3)).invoke(Modifier.Companion, composer, 0));
                }
                return modifier3.then(modifierMaterializeImpl);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier modifierMaterializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return modifierMaterializeImpl;
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer composer, Modifier modifier) {
        return modifier == Modifier.Companion ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new KeyedComposedModifier1(str, obj, interfaceC9540l, interfaceC9545q));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, interfaceC9540l, interfaceC9545q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC9540l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, interfaceC9540l, interfaceC9545q);
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, interfaceC9540l, interfaceC9545q));
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, interfaceC9540l, interfaceC9545q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            interfaceC9540l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, interfaceC9540l, interfaceC9545q);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            interfaceC9540l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, interfaceC9540l, interfaceC9545q);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, InterfaceC9540l interfaceC9540l, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC9540l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, interfaceC9540l, interfaceC9545q);
    }
}
