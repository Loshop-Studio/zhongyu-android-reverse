package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.p014ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.p014ui.platform.PlatformTextInputSession;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.ImeOptions;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.CoroutineStart;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;
    private static final String TIA_TAG = "AndroidTextInputSession";

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m26211f = "AndroidTextInputSession.android.kt", m26212l = {59}, m26213m = "platformSpecificTextInputSession")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 */
    public static final class C17691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17691(InterfaceC11588c<? super C17691> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", m26211f = "AndroidTextInputSession.android.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_METHOD}, m26213m = "platformSpecificTextInputSession")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 */
    public static final class C17702 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C17702(InterfaceC11588c<? super C17702> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", m26211f = "AndroidTextInputSession.android.kt", m26212l = {124}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 */
    public static final class C17713 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextLayoutState $layoutState;
        final /* synthetic */ InterfaceC9540l $onImeAction;
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        final /* synthetic */ TransformedTextFieldState $state;
        final /* synthetic */ InterfaceC11602k $stylusHandwritingTrigger;
        final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        final /* synthetic */ InterfaceC9529a $updateSelectionState;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", m26211f = "AndroidTextInputSession.android.kt", m26212l = {PatchStatus.CODE_LOAD_ILLEGAL_ACCESS}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ ComposeInputMethodManager $composeImm;
            final /* synthetic */ TransformedTextFieldState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$state = transformedTextFieldState;
                this.$composeImm = composeInputMethodManager;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z10) {
                long jM27947getSelectiond9O1mEE = textFieldCharSequence.m27947getSelectiond9O1mEE();
                TextRange textRangeM27946getCompositionMzsxiRA = textFieldCharSequence.m27946getCompositionMzsxiRA();
                long jM27947getSelectiond9O1mEE2 = textFieldCharSequence2.m27947getSelectiond9O1mEE();
                TextRange textRangeM27946getCompositionMzsxiRA2 = textFieldCharSequence2.m27946getCompositionMzsxiRA();
                if (z10) {
                    composeInputMethodManager.restartInput();
                } else {
                    if (TextRange.m32959equalsimpl0(jM27947getSelectiond9O1mEE, jM27947getSelectiond9O1mEE2) && AbstractC9979u.m20289b(textRangeM27946getCompositionMzsxiRA, textRangeM27946getCompositionMzsxiRA2)) {
                        return;
                    }
                    composeInputMethodManager.updateSelection(TextRange.m32964getMinimpl(jM27947getSelectiond9O1mEE2), TextRange.m32963getMaximpl(jM27947getSelectiond9O1mEE2), textRangeM27946getCompositionMzsxiRA2 != null ? TextRange.m32964getMinimpl(textRangeM27946getCompositionMzsxiRA2.m32970unboximpl()) : -1, textRangeM27946getCompositionMzsxiRA2 != null ? TextRange.m32963getMaximpl(textRangeM27946getCompositionMzsxiRA2.m32970unboximpl()) : -1);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$state, this.$composeImm, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    TransformedTextFieldState transformedTextFieldState = this.$state;
                    final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                    TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.b
                        @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z10) {
                            AndroidTextInputSession_androidKt.C17713.AnonymousClass1.invokeSuspend$lambda$0(composeInputMethodManager, textFieldCharSequence, textFieldCharSequence2, z10);
                        }
                    };
                    this.label = 1;
                    if (transformedTextFieldState.collectImeNotifications(notifyImeListener, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17713(InterfaceC11602k interfaceC11602k, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, ViewConfiguration viewConfiguration, InterfaceC11588c<? super C17713> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$stylusHandwritingTrigger = interfaceC11602k;
            this.$state = transformedTextFieldState;
            this.$layoutState = textLayoutState;
            this.$composeImm = composeInputMethodManager;
            this.$this_platformSpecificTextInputSession = platformTextInputSession;
            this.$imeOptions = imeOptions;
            this.$receiveContentConfiguration = receiveContentConfiguration;
            this.$onImeAction = interfaceC9540l;
            this.$updateSelectionState = interfaceC9529a;
            this.$viewConfiguration = viewConfiguration;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InputConnection invokeSuspend$lambda$2(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, InterfaceC9540l interfaceC9540l, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, InterfaceC9529a interfaceC9529a, ViewConfiguration viewConfiguration, EditorInfo editorInfo) {
            AndroidTextInputSession_androidKt.logDebug$default(null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final String invoke() {
                    return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.getVisualText()) + "\")";
                }
            }, 1, null);
            C1774xc459376b c1774xc459376b = new C1774xc459376b(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, interfaceC9540l, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, interfaceC9529a, viewConfiguration);
            EditorInfo_androidKt.m27989updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().m27947getSelectiond9O1mEE(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
            return new StatelessInputConnection(c1774xc459376b, editorInfo);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C17713 c17713 = new C17713(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, interfaceC11588c);
            c17713.L$0 = obj;
            return c17713;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                AbstractC11117h.m24726d(interfaceC11122i0, null, CoroutineStart.f23479f, new AnonymousClass1(this.$state, this.$composeImm, null), 1, null);
                InterfaceC11602k interfaceC11602k = this.$stylusHandwritingTrigger;
                if (interfaceC11602k != null) {
                    AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C1772x2b7eadeb(interfaceC11602k, this.$composeImm, null), 3, null);
                }
                final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, interfaceC11122i0);
                PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
                final TransformedTextFieldState transformedTextFieldState = this.$state;
                final ImeOptions imeOptions = this.$imeOptions;
                final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final InterfaceC9540l interfaceC9540l = this.$onImeAction;
                final TextLayoutState textLayoutState = this.$layoutState;
                final InterfaceC9529a interfaceC9529a = this.$updateSelectionState;
                final ViewConfiguration viewConfiguration = this.$viewConfiguration;
                PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.a
                    @Override // androidx.compose.p014ui.platform.PlatformTextInputMethodRequest
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return AndroidTextInputSession_androidKt.C17713.invokeSuspend$lambda$2(transformedTextFieldState, imeOptions, receiveContentConfiguration, composeInputMethodManager, interfaceC9540l, cursorAnchorInfoController, textLayoutState, interfaceC9529a, viewConfiguration, editorInfo);
                    }
                };
                this.label = 1;
                if (platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<?> interfaceC11588c) {
            return ((C17713) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    public static /* synthetic */ void logDebug$default(String str, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = TIA_TAG;
        }
        logDebug(str, interfaceC9529a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.p014ui.platform.PlatformTextInputSession r13, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r14, androidx.compose.foundation.text.input.internal.TextLayoutState r15, androidx.compose.p014ui.text.input.ImeOptions r16, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r17, p181hd.InterfaceC9540l r18, p181hd.InterfaceC9529a r19, p379vd.InterfaceC11602k r20, androidx.compose.p014ui.platform.ViewConfiguration r21, vc.InterfaceC11588c<?> r22) throws java.lang.Throwable {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C17691
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C17691) r1
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r12.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            kotlin.AbstractC9924b.m20071b(r0)
            goto L58
        L35:
            kotlin.AbstractC9924b.m20071b(r0)
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
            if (r13 != r1) goto L58
            return r1
        L58:
            kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, hd.l, hd.a, vd.k, androidx.compose.ui.platform.ViewConfiguration, vc.c):java.lang.Object");
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC11602k interfaceC11602k, ViewConfiguration viewConfiguration, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 64) != 0) {
            interfaceC11602k = null;
        }
        if ((i10 & 128) != 0) {
            viewConfiguration = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, interfaceC9540l, interfaceC9529a, interfaceC11602k, viewConfiguration, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.p014ui.platform.PlatformTextInputSession r17, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r18, androidx.compose.foundation.text.input.internal.TextLayoutState r19, androidx.compose.p014ui.text.input.ImeOptions r20, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r21, p181hd.InterfaceC9540l r22, p181hd.InterfaceC9529a r23, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r24, p379vd.InterfaceC11602k r25, androidx.compose.p014ui.platform.ViewConfiguration r26, vc.InterfaceC11588c<?> r27) throws java.lang.Throwable {
        /*
            r0 = r27
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C17702
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.C17702) r1
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
            java.lang.Object r2 = p393wc.AbstractC11725a.m25952f()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 == r4) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            kotlin.AbstractC9924b.m20071b(r0)
            goto L5a
        L33:
            kotlin.AbstractC9924b.m20071b(r0)
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
            java.lang.Object r0 = kotlinx.coroutines.AbstractC10006d.m20748e(r5, r1)
            if (r0 != r2) goto L5a
            return r2
        L5a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, hd.l, hd.a, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, vd.k, androidx.compose.ui.platform.ViewConfiguration, vc.c):java.lang.Object");
    }

    private static final void logDebug(String str, InterfaceC9529a interfaceC9529a) {
    }
}
