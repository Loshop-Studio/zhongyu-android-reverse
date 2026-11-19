package androidx.compose.p011ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aJ\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u000e\u001af\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0010\u001ap\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0012\u001aj\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u0013\"\u0004\u0018\u00010\f2\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u0004¢\u0006\u0004\b\b\u0010\u0015\u001a\u001b\u0010\u001a\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u0019\u001a\u001b\u0010\u001c\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/runtime/Composable;", "factory", "composed", "(Landroidx/compose/ui/Modifier;Lr6/c;Lr6/f;)Landroidx/compose/ui/Modifier;", "", "fullyQualifiedName", "", "key1", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lr6/c;Lr6/f;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lr6/c;Lr6/f;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/c;Lr6/f;)Landroidx/compose/ui/Modifier;", "", "keys", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lr6/c;Lr6/f;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "materialize", "materializeImpl", "materializeWithCompositionLocalInjection", "materializeWithCompositionLocalInjectionInternal", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new ComposedModifier(interfaceC6471c, interfaceC6474f));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6471c = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, interfaceC6471c, interfaceC6474f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier materializeImpl(final Composer composer, Modifier modifier) {
        if (modifier.all(new InterfaceC6471c() { // from class: androidx.compose.ui.ComposedModifierKt.materializeImpl.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(Modifier.Element element) {
                return Boolean.valueOf(!(element instanceof ComposedModifier));
            }
        })) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.INSTANCE, new InterfaceC6473e() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public final Modifier invoke(Modifier modifier3, Modifier.Element element) {
                boolean z8 = element instanceof ComposedModifier;
                Modifier modifierMaterializeImpl = element;
                if (z8) {
                    InterfaceC6474f factory = ((ComposedModifier) element).getFactory();
                    AbstractC5830k.m5328e(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    AbstractC5835p.m5354c(3, factory);
                    modifierMaterializeImpl = ComposedModifierKt.materializeImpl(composer, (Modifier) factory.invoke(Modifier.INSTANCE, composer, 0));
                }
                return modifier3.then(modifierMaterializeImpl);
            }
        });
        composer.endReplaceableGroup();
        return modifier2;
    }

    @JvmName(name = "materializeModifier")
    @NotNull
    public static final Modifier materializeModifier(@NotNull Composer composer, @NotNull Modifier modifier) {
        composer.startReplaceGroup(439770924);
        Modifier modifierMaterializeImpl = materializeImpl(composer, modifier);
        composer.endReplaceGroup();
        return modifierMaterializeImpl;
    }

    @NotNull
    public static final Modifier materializeWithCompositionLocalInjectionInternal(@NotNull Composer composer, @NotNull Modifier modifier) {
        return modifier == Modifier.INSTANCE ? modifier : materializeModifier(composer, new CompositionLocalMapInjectionElement(composer.getCurrentCompositionLocalMap()).then(modifier));
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new KeyedComposedModifier1(str, obj, interfaceC6471c, interfaceC6474f));
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, interfaceC6471c, interfaceC6474f));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, int i, Object obj2) {
        if ((i & 4) != 0) {
            interfaceC6471c = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, interfaceC6471c, interfaceC6474f);
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, interfaceC6471c, interfaceC6474f));
    }

    @NotNull
    public static final Modifier composed(@NotNull Modifier modifier, @NotNull String str, @NotNull Object[] objArr, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        return modifier.then(new KeyedComposedModifierN(str, objArr, interfaceC6471c, interfaceC6474f));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, int i, Object obj3) {
        if ((i & 8) != 0) {
            interfaceC6471c = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, interfaceC6471c, interfaceC6474f);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, int i, Object obj4) {
        if ((i & 16) != 0) {
            interfaceC6471c = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, interfaceC6471c, interfaceC6474f);
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, InterfaceC6471c interfaceC6471c, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC6471c = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, interfaceC6471c, interfaceC6474f);
    }
}
