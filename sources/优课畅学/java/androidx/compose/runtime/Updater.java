package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m23702boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m23703constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23704equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC9133u.m16128b(composer, ((Updater) obj).m23714unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23705equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC9133u.m16128b(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23706hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m23707initimpl(Composer composer, final InterfaceC10570l interfaceC10570l) {
        if (composer.getInserting()) {
            composer.apply(C8736p.f16368a, new InterfaceC10574p() { // from class: androidx.compose.runtime.Updater$init$1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Updater$init$1) obj, (C8736p) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(T t10, C8736p c8736p) {
                    interfaceC10570l.invoke(t10);
                }
            });
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m23708reconcileimpl(Composer composer, final InterfaceC10570l interfaceC10570l) {
        composer.apply(C8736p.f16368a, new InterfaceC10574p() { // from class: androidx.compose.runtime.Updater$reconcile$1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Updater$reconcile$1) obj, (C8736p) obj2);
                return C8736p.f16368a;
            }

            public final void invoke(T t10, C8736p c8736p) {
                interfaceC10570l.invoke(t10);
            }
        });
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m23709setimpl(Composer composer, int i10, InterfaceC10574p interfaceC10574p) {
        if (composer.getInserting() || !AbstractC9133u.m16128b(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            composer.apply(Integer.valueOf(i10), interfaceC10574p);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23711toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m23712updateimpl(Composer composer, int i10, InterfaceC10574p interfaceC10574p) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC9133u.m16128b(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i10), interfaceC10574p);
        }
    }

    public boolean equals(Object obj) {
        return m23704equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m23706hashCodeimpl(this.composer);
    }

    public String toString() {
        return m23711toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m23714unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m23710setimpl(Composer composer, V v10, InterfaceC10574p interfaceC10574p) {
        if (composer.getInserting() || !AbstractC9133u.m16128b(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            composer.apply(v10, interfaceC10574p);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m23713updateimpl(Composer composer, V v10, InterfaceC10574p interfaceC10574p) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC9133u.m16128b(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            if (inserting) {
                return;
            }
            composer.apply(v10, interfaceC10574p);
        }
    }
}
