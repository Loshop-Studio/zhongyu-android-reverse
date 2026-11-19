package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class Updater<T> {
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m30304boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m30305constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30306equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC9979u.m20289b(composer, ((Updater) obj).m30316unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30307equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC9979u.m20289b(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30308hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m30309initimpl(Composer composer, final InterfaceC9540l interfaceC9540l) {
        if (composer.getInserting()) {
            composer.apply(C10786q.f26013a, new InterfaceC9544p() { // from class: androidx.compose.runtime.Updater$init$1
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Updater$init$1) obj, (C10786q) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(T t10, C10786q c10786q) {
                    interfaceC9540l.invoke(t10);
                }
            });
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m30310reconcileimpl(Composer composer, final InterfaceC9540l interfaceC9540l) {
        composer.apply(C10786q.f26013a, new InterfaceC9544p() { // from class: androidx.compose.runtime.Updater$reconcile$1
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Updater$reconcile$1) obj, (C10786q) obj2);
                return C10786q.f26013a;
            }

            public final void invoke(T t10, C10786q c10786q) {
                interfaceC9540l.invoke(t10);
            }
        });
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m30311setimpl(Composer composer, int i10, InterfaceC9544p interfaceC9544p) {
        if (composer.getInserting() || !AbstractC9979u.m20289b(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            composer.apply(Integer.valueOf(i10), interfaceC9544p);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30313toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m30314updateimpl(Composer composer, int i10, InterfaceC9544p interfaceC9544p) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC9979u.m20289b(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i10), interfaceC9544p);
        }
    }

    public boolean equals(Object obj) {
        return m30306equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m30308hashCodeimpl(this.composer);
    }

    public String toString() {
        return m30313toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m30316unboximpl() {
        return this.composer;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m30312setimpl(Composer composer, V v10, InterfaceC9544p interfaceC9544p) {
        if (composer.getInserting() || !AbstractC9979u.m20289b(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            composer.apply(v10, interfaceC9544p);
        }
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m30315updateimpl(Composer composer, V v10, InterfaceC9544p interfaceC9544p) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC9979u.m20289b(composer.rememberedValue(), v10)) {
            composer.updateRememberedValue(v10);
            if (inserting) {
                return;
            }
            composer.apply(v10, interfaceC9544p);
        }
    }
}
