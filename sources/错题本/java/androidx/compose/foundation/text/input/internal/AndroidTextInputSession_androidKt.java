package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.p011ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p011ui.platform.PlatformTextInputSession;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5958x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a|\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015\u001a~\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0081@¢\u0006\u0004\b\u0014\u0010\u0018\u001a'\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001f\u001a\u00020\u001e8\u0000X\u0081T¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m5110d2 = {"Landroidx/compose/ui/platform/PlatformTextInputSession;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfiguration", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "Ld6/s;", "onImeAction", "Lkotlin/Function0;", "updateSelectionState", "Lkotlinx/coroutines/flow/x;", "stylusHandwritingTrigger", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "platformSpecificTextInputSession", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lr6/c;Lr6/a;Lkotlinx/coroutines/flow/x;Landroidx/compose/ui/platform/ViewConfiguration;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lr6/c;Lr6/a;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/flow/x;Landroidx/compose/ui/platform/ViewConfiguration;Lh6/c;)Ljava/lang/Object;", "", "tag", "content", "logDebug", "(Ljava/lang/String;Lr6/a;)V", "", "TIA_DEBUG", "Z", "getTIA_DEBUG$annotations", "()V", "TIA_TAG", "Ljava/lang/String;", "", "ALL_MIME_TYPES", "[Ljava/lang/String;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {

    @NotNull
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;

    @NotNull
    private static final String TIA_TAG = "AndroidTextInputSession";

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m5303f = "AndroidTextInputSession.android.kt", m5304i = {}, m5305l = {59}, m5306m = "platformSpecificTextInputSession", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 */
    public static final class C13071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13071(InterfaceC5631c<? super C13071> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m5303f = "AndroidTextInputSession.android.kt", m5304i = {}, m5305l = {84}, m5306m = "platformSpecificTextInputSession", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 */
    public static final class C13082 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C13082(InterfaceC5631c<? super C13082> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "<anonymous>", "(Lkotlinx/coroutines/v;)Ljava/lang/Void;"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", m5303f = "AndroidTextInputSession.android.kt", m5304i = {}, m5305l = {124}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    @SourceDebugExtension({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 */
    public static final class C13093 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextLayoutState $layoutState;
        final /* synthetic */ InterfaceC6471c $onImeAction;
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        final /* synthetic */ TransformedTextFieldState $state;
        final /* synthetic */ InterfaceC5958x $stylusHandwritingTrigger;
        final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        final /* synthetic */ InterfaceC6469a $updateSelectionState;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
        @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", m5303f = "AndroidTextInputSession.android.kt", m5304i = {}, m5305l = {86}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            final /* synthetic */ ComposeInputMethodManager $composeImm;
            final /* synthetic */ TransformedTextFieldState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.$state = transformedTextFieldState;
                this.$composeImm = composeInputMethodManager;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z8) {
                long selection = textFieldCharSequence.getSelection();
                TextRange composition = textFieldCharSequence.getComposition();
                long selection2 = textFieldCharSequence2.getSelection();
                TextRange composition2 = textFieldCharSequence2.getComposition();
                if (z8) {
                    composeInputMethodManager.restartInput();
                } else {
                    if (TextRange.m12763equalsimpl0(selection, selection2) && AbstractC5830k.m5325b(composition, composition2)) {
                        return;
                    }
                    composeInputMethodManager.updateSelection(TextRange.m12768getMinimpl(selection2), TextRange.m12767getMaximpl(selection2), composition2 != null ? TextRange.m12768getMinimpl(composition2.getPackedValue()) : -1, composition2 != null ? TextRange.m12767getMaximpl(composition2.getPackedValue()) : -1);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                return new AnonymousClass1(this.$state, this.$composeImm, interfaceC5631c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5774b.m5119b(obj);
                    TransformedTextFieldState transformedTextFieldState = this.$state;
                    final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                    TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.b
                        @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z8) {
                            AndroidTextInputSession_androidKt.C13093.AnonymousClass1.invokeSuspend$lambda$0(composeInputMethodManager, textFieldCharSequence, textFieldCharSequence2, z8);
                        }
                    };
                    this.label = 1;
                    if (transformedTextFieldState.collectImeNotifications(notifyImeListener, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC5774b.m5119b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13093(InterfaceC5958x interfaceC5958x, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, ViewConfiguration viewConfiguration, InterfaceC5631c<? super C13093> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$stylusHandwritingTrigger = interfaceC5958x;
            this.$state = transformedTextFieldState;
            this.$layoutState = textLayoutState;
            this.$composeImm = composeInputMethodManager;
            this.$this_platformSpecificTextInputSession = platformTextInputSession;
            this.$imeOptions = imeOptions;
            this.$receiveContentConfiguration = receiveContentConfiguration;
            this.$onImeAction = interfaceC6471c;
            this.$updateSelectionState = interfaceC6469a;
            this.$viewConfiguration = viewConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection invokeSuspend$lambda$2(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, InterfaceC6471c interfaceC6471c, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, InterfaceC6469a interfaceC6469a, ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
            AndroidTextInputSession_androidKt.logDebug$default(null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final String invoke() {
                    return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.getVisualText()) + "\")";
                }
            }, 1, null);
            C1312xc459376b c1312xc459376b = new C1312xc459376b(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, interfaceC6471c, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, interfaceC6469a, viewConfiguration);
            EditorInfo_androidKt.m7793updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().getSelection(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
            return new StatelessInputConnection(c1312xc459376b, editorInfo);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C13093 c13093 = new C13093(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, interfaceC5631c);
            c13093.L$0 = obj;
            return c13093;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                AbstractC6014x.m5651v(interfaceC6009v, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, null), 1);
                InterfaceC5958x interfaceC5958x = this.$stylusHandwritingTrigger;
                if (interfaceC5958x != null) {
                    AbstractC6014x.m5651v(interfaceC6009v, null, null, new C1310x2b7eadeb(interfaceC5958x, this.$composeImm, null), 3);
                }
                final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, interfaceC6009v);
                PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
                final TransformedTextFieldState transformedTextFieldState = this.$state;
                final ImeOptions imeOptions = this.$imeOptions;
                final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final InterfaceC6471c interfaceC6471c = this.$onImeAction;
                final TextLayoutState textLayoutState = this.$layoutState;
                final InterfaceC6469a interfaceC6469a = this.$updateSelectionState;
                final ViewConfiguration viewConfiguration = this.$viewConfiguration;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.a
                    @Override // androidx.compose.p011ui.platform.PlatformTextInputMethodRequest
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return AndroidTextInputSession_androidKt.C13093.invokeSuspend$lambda$2(transformedTextFieldState, imeOptions, receiveContentConfiguration, composeInputMethodManager, interfaceC6471c, cursorAnchorInfoController, textLayoutState, interfaceC6469a, viewConfiguration, editorInfo);
                    }
                };
                this.label = 1;
                if (platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<?> interfaceC5631c) {
            return ((C13093) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    public static /* synthetic */ void logDebug$default(String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = TIA_TAG;
        }
        logDebug(str, interfaceC6469a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.platform.PlatformTextInputSession r17, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.TransformedTextFieldState r18, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.TextLayoutState r19, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.text.input.ImeOptions r20, @org.jetbrains.annotations.Nullable androidx.compose.foundation.content.internal.ReceiveContentConfiguration r21, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r22, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r24, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.InterfaceC5958x r25, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.platform.ViewConfiguration r26, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<?> r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C13082
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C13082) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 == r4) goto L2d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.AbstractC5774b.m5119b(r0)
            goto L58
        L31:
            kotlin.AbstractC5774b.m5119b(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r16 = 0
            r10 = r17
            r7 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9 = r24
            r6 = r25
            r15 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.label = r4
            java.lang.Object r0 = kotlinx.coroutines.AbstractC6014x.m5637h(r5, r1)
            if (r0 != r2) goto L58
            return r2
        L58:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, r6.c, r6.a, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, kotlinx.coroutines.flow.x, androidx.compose.ui.platform.ViewConfiguration, h6.c):java.lang.Object");
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC6471c interfaceC6471c, InterfaceC6469a interfaceC6469a, InterfaceC5958x interfaceC5958x, ViewConfiguration viewConfiguration, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC6469a = null;
        }
        if ((i & 64) != 0) {
            interfaceC5958x = null;
        }
        if ((i & 128) != 0) {
            viewConfiguration = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, interfaceC6471c, interfaceC6469a, interfaceC5958x, viewConfiguration, interfaceC5631c);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.platform.PlatformTextInputSession r13, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.TransformedTextFieldState r14, @org.jetbrains.annotations.NotNull androidx.compose.foundation.text.input.internal.TextLayoutState r15, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.text.input.ImeOptions r16, @org.jetbrains.annotations.Nullable androidx.compose.foundation.content.internal.ReceiveContentConfiguration r17, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6471c r18, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6469a r19, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.InterfaceC5958x r20, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.platform.ViewConfiguration r21, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<?> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C13071
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C13071) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2f
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            kotlin.AbstractC5774b.m5119b(r0)
            goto L56
        L33:
            kotlin.AbstractC5774b.m5119b(r0)
            android.view.View r0 = r13.getView()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r9 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(r0)
            r12.label = r3
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            java.lang.Object r13 = platformSpecificTextInputSession(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r1) goto L56
            return r1
        L56:
            kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, r6.c, r6.a, kotlinx.coroutines.flow.x, androidx.compose.ui.platform.ViewConfiguration, h6.c):java.lang.Object");
    }

    private static final void logDebug(String str, InterfaceC6469a interfaceC6469a) {
    }
}
