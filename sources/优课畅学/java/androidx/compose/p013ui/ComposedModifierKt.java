package androidx.compose.p013ui;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new ComposedModifier(interfaceC10570l, interfaceC10575q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, interfaceC10570l, interfaceC10575q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(final Composer composer, Modifier modifier) {
        if (modifier.all(new InterfaceC10570l() { // from class: androidx.compose.ui.ComposedModifierKt.materializeImpl.1
            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new InterfaceC10574p() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z10 = element instanceof ComposedModifier;
                Modifier modifierMaterializeImpl = element;
                if (z10) {
                    InterfaceC10575q factory = ((ComposedModifier) element).getFactory();
                    AbstractC9133u.m16131e(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    modifierMaterializeImpl = ComposedModifierKt.materializeImpl(composer, (Modifier) ((InterfaceC10575q) AbstractC9116d0.m16096e(factory, 3)).invoke(Modifier.Companion, composer, 0));
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

    public static final Modifier composed(Modifier modifier, String str, Object obj, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new KeyedComposedModifier1(str, obj, interfaceC10570l, interfaceC10575q));
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, interfaceC10570l, interfaceC10575q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC10570l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, interfaceC10570l, interfaceC10575q);
    }

    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, interfaceC10570l, interfaceC10575q));
    }

    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, interfaceC10570l, interfaceC10575q));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, int i10, Object obj3) {
        if ((i10 & 8) != 0) {
            interfaceC10570l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, interfaceC10570l, interfaceC10575q);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, int i10, Object obj4) {
        if ((i10 & 16) != 0) {
            interfaceC10570l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, interfaceC10570l, interfaceC10575q);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, InterfaceC10570l interfaceC10570l, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC10570l = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, interfaceC10570l, interfaceC10575q);
    }
}
