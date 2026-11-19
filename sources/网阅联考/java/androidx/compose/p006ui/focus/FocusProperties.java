package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eRE\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aRE\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000eø\u0001\u0000¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR$\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR$\u0010.\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", "down", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", "left", "getLeft", "setLeft", "next", "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface FocusProperties {

    /* renamed from: androidx.compose.ui.focus.FocusProperties$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static FocusRequester m329a(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: b */
        public static FocusRequester m330b(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: c */
        public static Function1 m331c(FocusProperties focusProperties) {
            return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                    return m8893invoke3ESFkO8(focusDirection.getValue());
                }

                /* renamed from: invoke-3ESFkO8, reason: not valid java name */
                public final FocusRequester m8893invoke3ESFkO8(int i4) {
                    return FocusRequester.INSTANCE.getDefault();
                }
            };
        }

        /* renamed from: d */
        public static Function1 m332d(FocusProperties focusProperties) {
            return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                    return m8894invoke3ESFkO8(focusDirection.getValue());
                }

                /* renamed from: invoke-3ESFkO8, reason: not valid java name */
                public final FocusRequester m8894invoke3ESFkO8(int i4) {
                    return FocusRequester.INSTANCE.getDefault();
                }
            };
        }

        /* renamed from: e */
        public static FocusRequester m333e(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: f */
        public static FocusRequester m334f(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: g */
        public static FocusRequester m335g(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: h */
        public static FocusRequester m336h(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: i */
        public static FocusRequester m337i(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: j */
        public static FocusRequester m338j(FocusProperties focusProperties) {
            return FocusRequester.INSTANCE.getDefault();
        }

        /* renamed from: k */
        public static void m339k(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: l */
        public static void m340l(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: m */
        public static void m341m(FocusProperties focusProperties, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
        }

        /* renamed from: n */
        public static void m342n(FocusProperties focusProperties, Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "<anonymous parameter 0>");
        }

        /* renamed from: o */
        public static void m343o(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: p */
        public static void m344p(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: q */
        public static void m345q(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: r */
        public static void m346r(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: s */
        public static void m347s(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: t */
        public static void m348t(FocusProperties focusProperties, FocusRequester focusRequester) {
            Intrinsics.checkNotNullParameter(focusRequester, "<anonymous parameter 0>");
        }

        /* renamed from: u */
        public static /* synthetic */ void m349u() {
        }

        /* renamed from: v */
        public static /* synthetic */ void m350v() {
        }
    }

    boolean getCanFocus();

    FocusRequester getDown();

    FocusRequester getEnd();

    @ExperimentalComposeUiApi
    Function1<FocusDirection, FocusRequester> getEnter();

    @ExperimentalComposeUiApi
    Function1<FocusDirection, FocusRequester> getExit();

    FocusRequester getLeft();

    FocusRequester getNext();

    FocusRequester getPrevious();

    FocusRequester getRight();

    FocusRequester getStart();

    FocusRequester getUp();

    void setCanFocus(boolean z3);

    void setDown(FocusRequester focusRequester);

    void setEnd(FocusRequester focusRequester);

    @ExperimentalComposeUiApi
    void setEnter(Function1<? super FocusDirection, FocusRequester> function1);

    @ExperimentalComposeUiApi
    void setExit(Function1<? super FocusDirection, FocusRequester> function1);

    void setLeft(FocusRequester focusRequester);

    void setNext(FocusRequester focusRequester);

    void setPrevious(FocusRequester focusRequester);

    void setRight(FocusRequester focusRequester);

    void setStart(FocusRequester focusRequester);

    void setUp(FocusRequester focusRequester);
}
