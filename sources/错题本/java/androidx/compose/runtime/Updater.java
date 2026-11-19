package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072.\b\b\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0011\u001a\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0013JH\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072.\b\b\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\rH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0010JI\u0010\u0015\u001a\u00020\f\"\u0004\b\u0001\u0010\u00122\u0006\u0010\b\u001a\u00028\u00012,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\b\r¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0019\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\b\r¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\b\r¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010'\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u0012\u0004\b)\u0010*\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006+"}, m5110d2 = {"Landroidx/compose/runtime/Updater;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILr6/e;)V", "set", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lr6/c;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class Updater<T> {

    @NotNull
    private final Composer composer;

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m10108boximpl(Composer composer) {
        return new Updater(composer);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m10109constructorimpl(@NotNull Composer composer) {
        return composer;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10110equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && AbstractC5830k.m5325b(composer, ((Updater) obj).getComposer());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10111equalsimpl0(Composer composer, Composer composer2) {
        return AbstractC5830k.m5325b(composer, composer2);
    }

    @PublishedApi
    public static /* synthetic */ void getComposer$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10112hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* renamed from: init-impl, reason: not valid java name */
    public static final void m10113initimpl(Composer composer, @NotNull final InterfaceC6471c interfaceC6471c) {
        if (composer.getInserting()) {
            composer.apply(C5443s.f8405a, new InterfaceC6473e() { // from class: androidx.compose.runtime.Updater$init$1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Updater$init$1) obj, (C5443s) obj2);
                    return C5443s.f8405a;
                }

                public final void invoke(T t8, C5443s c5443s) {
                    interfaceC6471c.invoke(t8);
                }
            });
        }
    }

    /* renamed from: reconcile-impl, reason: not valid java name */
    public static final void m10114reconcileimpl(Composer composer, @NotNull final InterfaceC6471c interfaceC6471c) {
        composer.apply(C5443s.f8405a, new InterfaceC6473e() { // from class: androidx.compose.runtime.Updater$reconcile$1
            {
                super(2);
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Updater$reconcile$1) obj, (C5443s) obj2);
                return C5443s.f8405a;
            }

            public final void invoke(T t8, C5443s c5443s) {
                interfaceC6471c.invoke(t8);
            }
        });
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m10115setimpl(Composer composer, int i, @NotNull InterfaceC6473e interfaceC6473e) {
        if (composer.getInserting() || !AbstractC5830k.m5325b(composer.rememberedValue(), Integer.valueOf(i))) {
            AbstractC0584a.m918s(i, composer, i, interfaceC6473e);
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10117toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final void m10118updateimpl(Composer composer, int i, @NotNull InterfaceC6473e interfaceC6473e) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC5830k.m5325b(composer.rememberedValue(), Integer.valueOf(i))) {
            composer.updateRememberedValue(Integer.valueOf(i));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i), interfaceC6473e);
        }
    }

    public boolean equals(Object obj) {
        return m10110equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m10112hashCodeimpl(this.composer);
    }

    public String toString() {
        return m10117toStringimpl(this.composer);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getComposer() {
        return this.composer;
    }

    /* renamed from: update-impl, reason: not valid java name */
    public static final <V> void m10119updateimpl(Composer composer, V v2, @NotNull InterfaceC6473e interfaceC6473e) {
        boolean inserting = composer.getInserting();
        if (inserting || !AbstractC5830k.m5325b(composer.rememberedValue(), v2)) {
            composer.updateRememberedValue(v2);
            if (inserting) {
                return;
            }
            composer.apply(v2, interfaceC6473e);
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final <V> void m10116setimpl(Composer composer, V v2, @NotNull InterfaceC6473e interfaceC6473e) {
        if (composer.getInserting() || !AbstractC5830k.m5325b(composer.rememberedValue(), v2)) {
            composer.updateRememberedValue(v2);
            composer.apply(v2, interfaceC6473e);
        }
    }
}
