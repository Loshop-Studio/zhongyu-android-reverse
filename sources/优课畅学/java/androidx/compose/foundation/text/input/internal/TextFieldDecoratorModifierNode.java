package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p013ui.autofill.ContentDataType;
import androidx.compose.p013ui.draganddrop.DragAndDropEvent;
import androidx.compose.p013ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.focus.FocusRequesterModifierNode;
import androidx.compose.p013ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.input.key.KeyInputModifierNode;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerEventPass;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import androidx.compose.p013ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p013ui.node.LayoutAwareModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNode;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import androidx.compose.p013ui.node.PointerInputModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.ClipMetadata;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p013ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p013ui.platform.PlatformTextInputSessionScope;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.platform.WindowInfo;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final MutableState autofillHighlightOn$delegate;
    private final InterfaceC10570l clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private InterfaceC9212n inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final InterfaceC10559a receiveContentConfigurationProvider;
    private boolean singleLine;
    private InterfaceC9270g stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private InterfaceC9212n toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {674}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1 */
    public static final class C17891 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C17891(InterfaceC9324c<? super C17891> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return TextFieldDecoratorModifierNode.this.new C17891(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17891) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TextFieldSelectionState textFieldSelectionState = TextFieldDecoratorModifierNode.this.getTextFieldSelectionState();
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {759}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1 */
    public static final class C17951 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {760}, m17803m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C107671 extends FunctionReferenceImpl implements InterfaceC10570l {
                public C107671(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m21450invokeKlQnJC8(((ImeAction) obj).m26533unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m21450invokeKlQnJC8(int i10) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m21442onImeActionPerformedKlQnJC8(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, interfaceC9324c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC9324c<?> interfaceC9324c) {
                return ((AnonymousClass1) create(platformTextInputSessionScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                    TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                    ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                    ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                    C107671 c107671 = new C107671(this.this$0);
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                        {
                            super(0);
                        }

                        @Override // p300x7.InterfaceC10559a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m21451invoke();
                            return C8736p.f16368a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m21451invoke() {
                            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                        }
                    };
                    InterfaceC9270g stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                    ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c107671, interfaceC10559a, stylusHandwritingTrigger, viewConfiguration, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17951(ReceiveContentConfiguration receiveContentConfiguration, InterfaceC9324c<? super C17951> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return TextFieldDecoratorModifierNode.this.new C17951(this.$receiveContentConfiguration, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17951) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {499}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1 */
    public static final class C17961 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17961(TextFieldSelectionState textFieldSelectionState, InterfaceC9324c<? super C17961> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C17961(this.$textFieldSelectionState, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17961) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                TextFieldSelectionState textFieldSelectionState = this.$textFieldSelectionState;
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC9270g interfaceC9270g) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z10;
        this.readOnly = z11;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z12;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z13;
        this.stylusHandwritingTrigger = interfaceC9270g;
        textFieldSelectionState.setRequestAutofillAction(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21443invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21443invoke() {
                DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1 */
            public static final class C17911 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17911(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, InterfaceC9324c<? super C17911> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    C17911 c17911 = new C17911(this.this$0, this.$this_SuspendingPointerInputModifierNode, interfaceC9324c);
                    c17911.L$0 = obj;
                    return c17911;
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C17911) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC9434a.m17291f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    InterfaceC10559a interfaceC10559a = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r8v0 'interfaceC10559a' x7.a) = 
                          (r12v4 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r6v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:28) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        p190n7.AbstractC9434a.m17291f()
                        int r0 = r11.label
                        if (r0 != 0) goto L4c
                        kotlin.AbstractC9079b.m15926b(r12)
                        java.lang.Object r12 = r11.L$0
                        r0 = r12
                        i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r12 = r11.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r12.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r11.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r7 = r11.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r8 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r8.<init>(r12, r6)
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.f17555d
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r9 = 0
                        r3.<init>(r12, r7, r9)
                        r4 = 1
                        r5 = 0
                        r1 = 0
                        p135i8.AbstractC8833f.m14845d(r0, r1, r2, r3, r4, r5)
                        r10 = r2
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r2 = r6
                        r6 = 0
                        r3 = r12
                        r4 = r7
                        r5 = r8
                        r1.<init>(r2, r3, r4, r5, r6)
                        r6 = r4
                        r7 = r5
                        r4 = 1
                        r5 = 0
                        r3 = r1
                        r1 = 0
                        r2 = r10
                        p135i8.AbstractC8833f.m14845d(r0, r1, r2, r3, r4, r5)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r3.<init>(r12, r6, r7, r9)
                        p135i8.AbstractC8833f.m14845d(r0, r1, r2, r3, r4, r5)
                        h7.p r12 = p123h7.C8736p.f16368a
                        return r12
                    L4c:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.C17911.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                Object objM16556e = AbstractC9165e.m16556e(new C17911(this.this$0, pointerInputScope, null), interfaceC9324c);
                return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Set<MediaType> invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
            }
        }, new InterfaceC10574p() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration != null) {
                    TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m20455getDragAndDropkB6V9T0(), null, 8, null));
                    plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                String str = plainText;
                if (str != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), str, false, null, false, 14, null);
                }
                return Boolean.TRUE;
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
                }
            }
        }, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                HoverInteraction.Enter enter = new HoverInteraction.Enter();
                this.this$0.getInteractionSource().tryEmit(enter);
                textFieldDecoratorModifierNode.dragEnterEvent = enter;
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragEnter();
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m21444invokek4lQ0M(((Offset) obj).m24045unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m21444invokek4lQ0M(long j10) {
                long jM21473fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m21473fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j10);
                int iM21463getOffsetForPosition3MmeM6k$default = TextLayoutState.m21463getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM21473fromWindowToDecorationUv8p0NA, false, 2, null);
                if (iM21463getOffsetForPosition3MmeM6k$default >= 0) {
                    this.this$0.getTextFieldState().m21483selectCharsIn5zctL8(TextRangeKt.TextRange(iM21463getOffsetForPosition3MmeM6k$default));
                }
                this.this$0.getTextFieldSelectionState().m21533updateHandleDraggingUv8p0NA(Handle.Cursor, jM21473fromWindowToDecorationUv8p0NA);
            }
        }, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragExit();
            }
        }, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                this.this$0.emitDragExitEvent();
            }
        }, 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m21377constructorimpl(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {385, 386, 387}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 */
            public static final class C17861 extends SuspendLambda implements InterfaceC10574p {
                final /* synthetic */ KeyCommand $keyCommand;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[KeyCommand.values().length];
                        try {
                            iArr[KeyCommand.COPY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[KeyCommand.CUT.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[KeyCommand.PASTE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17861(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC9324c<? super C17861> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.$keyCommand = keyCommand;
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new C17861(this.$keyCommand, this.this$0, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((C17861) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
                
                    if (r6.paste(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
                
                    if (r6.cut(r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
                
                    if (r6.copy(false, r5) == r0) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
                
                    return r0;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                    /*
                        r5 = this;
                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                        int r1 = r5.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r4) goto L11
                        if (r1 == r3) goto L11
                        if (r1 != r2) goto L15
                    L11:
                        kotlin.AbstractC9079b.m15926b(r6)
                        goto L5f
                    L15:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1d:
                        kotlin.AbstractC9079b.m15926b(r6)
                        androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
                        int[] r1 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C17861.WhenMappings.$EnumSwitchMapping$0
                        int r6 = r6.ordinal()
                        r6 = r1[r6]
                        if (r6 == r4) goto L4f
                        if (r6 == r3) goto L40
                        if (r6 == r2) goto L31
                        goto L5f
                    L31:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r2
                        java.lang.Object r6 = r6.paste(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L40:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r3
                        java.lang.Object r6 = r6.cut(r5)
                        if (r6 != r0) goto L5f
                        goto L5e
                    L4f:
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r5.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r6.getTextFieldSelectionState()
                        r5.label = r4
                        r1 = 0
                        java.lang.Object r6 = r6.copy(r1, r5)
                        if (r6 != r0) goto L5f
                    L5e:
                        return r0
                    L5f:
                        h7.p r6 = p123h7.C8736p.f16368a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C17861.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeyCommand) obj);
                return C8736p.f16368a;
            }

            public final void invoke(KeyCommand keyCommand) {
                AbstractC8839h.m14861d(this.this$0.getCoroutineScope(), null, CoroutineStart.f17555d, new C17861(keyCommand, this.this$0, null), 1, null);
            }
        });
        this.receiveContentConfigurationProvider = new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }
        };
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final void disposeInputSession() {
        InterfaceC9212n interfaceC9212n = this.inputSessionJob;
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
        this.inputSessionJob = null;
        InterfaceC9270g interfaceC9270g = this.stylusHandwritingTrigger;
        if (interfaceC9270g != null) {
            interfaceC9270g.mo16673h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUntransformedTextChanges(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = AbstractC9268e.m17007S(AbstractC9268e.m17028r(SnapshotStateKt.snapshotFlow(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final String invoke() {
                return TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText().toString();
            }
        }), 1), 1).collect(new InterfaceC9267d() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.3
            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((String) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(String str, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C17891(null), 3, null);
        } else {
            if (isFocused()) {
                return;
            }
            InterfaceC9212n interfaceC9212n = this.toolbarAndHandlesVisibilityObserverJob;
            if (interfaceC9212n != null) {
                InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m21442onImeActionPerformedKlQnJC8(final int i10) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m26530equalsimpl0(i10, companion.m26547getNoneeUduSuo()) || ImeAction.m26530equalsimpl0(i10, companion.m26543getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo21202defaultKeyboardActionKlQnJC8(i10);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m21445invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m21445invoke() {
                    this.this$0.keyboardActionScope.mo21202defaultKeyboardActionKlQnJC8(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutofillHighlightOn(boolean z10) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z10) {
        if (z10 || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.inputSessionJob = AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C17951(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long jM21345getSelectiond9O1mEE = outputText.m21345getSelectiond9O1mEE();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m26146setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, jM21345getSelectiond9O1mEE);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z10 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z10);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {536}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    return new AnonymousClass1(this.this$0, interfaceC9324c);
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM17291f = AbstractC9434a.m17291f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9079b.m15926b(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                        this.label = 1;
                        if (textFieldDecoratorModifierNode.observeUntransformedTextChanges(this) == objM17291f) {
                            return objM17291f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9079b.m15926b(obj);
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z10) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().replaceAll(annotatedString);
                this.setAutofillHighlightOn(true);
                AbstractC8839h.m14861d(this.getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (z10) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new InterfaceC10575q() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i10, int i11, boolean z11) {
                TextFieldCharSequence untransformedText = z11 ? TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText() : TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                long jM21345getSelectiond9O1mEE2 = untransformedText.m21345getSelectiond9O1mEE();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i10, i11) < 0 || Math.max(i10, i11) > untransformedText.length()) {
                    return Boolean.FALSE;
                }
                if (i10 == TextRange.m26364getStartimpl(jM21345getSelectiond9O1mEE2) && i11 == TextRange.m26359getEndimpl(jM21345getSelectiond9O1mEE2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i10, i11);
                if (z11 || i10 == i11) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z11) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m21484selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m21483selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int iM21216getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m21216getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m26142onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM21216getImeActionOrDefaulteUduSuo$foundation_release, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m21442onImeActionPerformedKlQnJC8(iM21216getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m26358getCollapsedimpl(jM21345getSelectiond9O1mEE) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9

                @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {622}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        return new AnonymousClass1(this.this$0, interfaceC9324c);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM17291f = AbstractC9434a.m17291f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9079b.m15926b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (TextFieldSelectionState.copy$default(textFieldSelectionState, false, this, 1, null) == objM17291f) {
                                return objM17291f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9079b.m15926b(obj);
                        }
                        return C8736p.f16368a;
                    }
                }

                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    AbstractC8839h.m14861d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10

                    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {627}, m17803m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                        int label;
                        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                            super(2, interfaceC9324c);
                            this.this$0 = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                            return new AnonymousClass1(this.this$0, interfaceC9324c);
                        }

                        @Override // p300x7.InterfaceC10574p
                        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                            return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM17291f = AbstractC9434a.m17291f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9079b.m15926b(obj);
                                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                                this.label = 1;
                                if (textFieldSelectionState.cut(this) == objM17291f) {
                                    return objM17291f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9079b.m15926b(obj);
                            }
                            return C8736p.f16368a;
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public final Boolean invoke() {
                        AbstractC8839h.m14861d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z10) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.11

                @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", m17801f = "TextFieldDecoratorModifier.kt", m17802l = {634}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        return new AnonymousClass1(this.this$0, interfaceC9324c);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM17291f = AbstractC9434a.m17291f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9079b.m15926b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (textFieldSelectionState.paste(this) == objM17291f) {
                                return objM17291f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9079b.m15926b(obj);
                        }
                        return C8736p.f16368a;
                    }
                }

                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    AbstractC8839h.m14861d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m24821drawRectnJ9OG0$default(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m24286unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final InterfaceC9270g getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        boolean z10 = this.enabled && !this.readOnly;
        if (focusState.isFocused()) {
            if (z10) {
                startInputSession(false);
                return;
            }
            return;
        }
        disposeInputSession();
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.commitComposition$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.p013ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo20317onKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo21371onKeyEventCJ9ybgU(keyEvent, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21446invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21446invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m21442onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m21216getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.p013ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21447invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21447invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.p013ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo20318onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.pointerInputNode.mo20318onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    @Override // androidx.compose.p013ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo20319onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo21372onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.p013ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo20485onRemeasuredozmzZPI(long j10) {
        this.dragAndDropNode.mo20485onRemeasuredozmzZPI(j10);
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z10) {
        this.isPassword = z10;
    }

    public final void setReadOnly(boolean z10) {
        this.readOnly = z10;
    }

    public final void setSingleLine(boolean z10) {
        this.singleLine = z10;
    }

    public final void setStylusHandwritingTrigger(InterfaceC9270g interfaceC9270g) {
        this.stylusHandwritingTrigger = interfaceC9270g;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC9270g interfaceC9270g) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z14;
        InterfaceC9212n interfaceC9212n;
        boolean z15 = this.enabled;
        boolean z16 = z15 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        boolean z17 = this.isPassword;
        InterfaceC9270g interfaceC9270g2 = this.stylusHandwritingTrigger;
        if (!z10 || z11) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z14 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z14 = true;
        }
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z10;
        this.readOnly = z11;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z12;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z13;
        this.stylusHandwritingTrigger = interfaceC9270g;
        if (z14 != z16 || !AbstractC9133u.m16128b(transformedTextFieldState, transformedTextFieldState2) || !AbstractC9133u.m16128b(keyboardOptions, keyboardOptions2) || !AbstractC9133u.m16128b(interfaceC9270g, interfaceC9270g2)) {
            if (z14 && isFocused()) {
                startInputSession(false);
            } else if (!z14) {
                disposeInputSession();
            }
        }
        if (z10 != z15 || z14 != z16 || !ImeAction.m26530equalsimpl0(keyboardOptions.m21216getImeActionOrDefaulteUduSuo$foundation_release(), keyboardOptions2.m21216getImeActionOrDefaulteUduSuo$foundation_release()) || z13 != z17) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!AbstractC9133u.m16128b(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (interfaceC9212n = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    if (interfaceC9212n != null) {
                        InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
                    }
                    this.toolbarAndHandlesVisibilityObserverJob = AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C17961(textFieldSelectionState, null), 3, null);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.updateNode.2
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m21452invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m21452invoke() {
                    DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (AbstractC9133u.m16128b(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }
}
