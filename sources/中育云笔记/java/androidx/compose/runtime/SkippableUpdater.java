package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class SkippableUpdater<T> {
    private final Composer composer;

    private /* synthetic */ SkippableUpdater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m30276boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m30277constructorimpl(Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30278equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && AbstractC9979u.m20289b(composer, ((SkippableUpdater) obj).m30283unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30279equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC9979u.m20289b(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30280hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30281toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m30282updateimpl(Composer composer, InterfaceC9540l interfaceC9540l) {
        composer.startReplaceableGroup(509942095);
        interfaceC9540l.invoke(Updater.m30304boximpl(Updater.m30305constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m30278equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m30280hashCodeimpl(this.composer);
    }

    public String toString() {
        return m30281toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m30283unboximpl() {
        return this.composer;
    }
}
