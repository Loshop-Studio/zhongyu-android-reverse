package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m23674boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m23675constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23676equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && AbstractC9133u.m16128b(composer, ((SkippableUpdater) obj).m23681unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23677equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC9133u.m16128b(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23678hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23679toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m23680updateimpl(Composer composer, InterfaceC10570l interfaceC10570l) {
        composer.startReplaceableGroup(509942095);
        interfaceC10570l.invoke(Updater.m23702boximpl(Updater.m23703constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m23676equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m23678hashCodeimpl(this.composer);
    }

    public String toString() {
        return m23679toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m23681unboximpl() {
        return this.composer;
    }
}
