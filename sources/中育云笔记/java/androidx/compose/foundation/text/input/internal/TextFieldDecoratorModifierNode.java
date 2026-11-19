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
import androidx.compose.p014ui.autofill.ContentDataType;
import androidx.compose.p014ui.draganddrop.DragAndDropEvent;
import androidx.compose.p014ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.p014ui.focus.FocusEventModifierNode;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.focus.FocusRequesterModifierNode;
import androidx.compose.p014ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.input.key.KeyInputModifierNode;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.DrawModifierNode;
import androidx.compose.p014ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p014ui.node.LayoutAwareModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNode;
import androidx.compose.p014ui.node.SemanticsModifierNodeKt;
import androidx.compose.p014ui.platform.ClipEntry;
import androidx.compose.p014ui.platform.ClipMetadata;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.platform.PlatformTextInputModifierNode;
import androidx.compose.p014ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.p014ui.platform.PlatformTextInputSessionScope;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.platform.ViewConfiguration;
import androidx.compose.p014ui.platform.WindowInfo;
import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p014ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final MutableState autofillHighlightOn$delegate;
    private final InterfaceC9540l clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private InterfaceC10045g inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final InterfaceC9529a receiveContentConfigurationProvider;
    private boolean singleLine;
    private InterfaceC11602k stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private InterfaceC10045g toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {674}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1 */
    public static final class C18191 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C18191(InterfaceC11588c<? super C18191> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return TextFieldDecoratorModifierNode.this.new C18191(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TextFieldSelectionState textFieldSelectionState = TextFieldDecoratorModifierNode.this.getTextFieldSelectionState();
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C18191) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {759}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1 */
    public static final class C18251 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {760}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            public /* synthetic */ class C120751 extends FunctionReferenceImpl implements InterfaceC9540l {
                public C120751(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m28052invokeKlQnJC8(((ImeAction) obj).m33135unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m28052invokeKlQnJC8(int i10) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m28044onImeActionPerformedKlQnJC8(i10);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$receiveContentConfiguration, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC11588c<?> interfaceC11588c) {
                return ((AnonymousClass1) create(platformTextInputSessionScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    TransformedTextFieldState textFieldState = this.this$0.getTextFieldState();
                    TextLayoutState textLayoutState = this.this$0.getTextLayoutState();
                    ImeOptions imeOptions$foundation_release = this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine());
                    ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                    C120751 c120751 = new C120751(this.this$0);
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.startInputSession.1.1.2
                        {
                            super(0);
                        }

                        @Override // p181hd.InterfaceC9529a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m28053invoke();
                            return C10786q.f26013a;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m28053invoke() {
                            textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                        }
                    };
                    InterfaceC11602k stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger();
                    ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration());
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation_release, receiveContentConfiguration, c120751, interfaceC9529a, stylusHandwritingTrigger, viewConfiguration, this) == objM25952f) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18251(ReceiveContentConfiguration receiveContentConfiguration, InterfaceC11588c<? super C18251> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return TextFieldDecoratorModifierNode.this.new C18251(this.$receiveContentConfiguration, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this) == objM25952f) {
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
            return ((C18251) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {499}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1 */
    public static final class C18261 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18261(TextFieldSelectionState textFieldSelectionState, InterfaceC11588c<? super C18261> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$textFieldSelectionState = textFieldSelectionState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C18261(this.$textFieldSelectionState, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TextFieldSelectionState textFieldSelectionState = this.$textFieldSelectionState;
                this.label = 1;
                if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C18261) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC11602k interfaceC11602k) {
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
        this.stylusHandwritingTrigger = interfaceC11602k;
        textFieldSelectionState.setRequestAutofillAction(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28045invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m28045invoke() {
                DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
            }
        });
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1 */
            public static final class C18211 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C18211(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, InterfaceC11588c<? super C18211> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    C18211 c18211 = new C18211(this.this$0, this.$this_SuspendingPointerInputModifierNode, interfaceC11588c);
                    c18211.L$0 = obj;
                    return c18211;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC11725a.m25952f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    final TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    InterfaceC9529a interfaceC9529a = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR (r8v0 'interfaceC9529a' hd.a) = 
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
                        p393wc.AbstractC11725a.m25952f()
                        int r0 = r11.label
                        if (r0 != 0) goto L4c
                        kotlin.AbstractC9924b.m20071b(r12)
                        java.lang.Object r12 = r11.L$0
                        r0 = r12
                        sd.i0 r0 = (sd.InterfaceC11122i0) r0
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r12 = r11.this$0
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12 = r12.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r6 = r11.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r7 = r11.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1 r8 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$requestFocus$1
                        r8.<init>(r12, r6)
                        kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.f23479f
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r9 = 0
                        r3.<init>(r12, r7, r9)
                        r4 = 1
                        r5 = 0
                        r1 = 0
                        sd.AbstractC11109f.m24706d(r0, r1, r2, r3, r4, r5)
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
                        sd.AbstractC11109f.m24706d(r0, r1, r2, r3, r4, r5)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r3 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r3.<init>(r12, r6, r7, r9)
                        sd.AbstractC11109f.m24706d(r0, r1, r2, r3, r4, r5)
                        qc.q r12 = p309qc.C10786q.f26013a
                        return r12
                    L4c:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.C18211.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C18211) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                Object objM20748e = AbstractC10006d.m20748e(new C18211(this.this$0, pointerInputScope, null), interfaceC11588c);
                return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Set<MediaType> invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
            }
        }, new InterfaceC9544p() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            {
                super(2);
            }

            @Override // p181hd.InterfaceC9544p
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                this.this$0.emitDragExitEvent();
                this.this$0.getTextFieldSelectionState().clearHandleDragging();
                String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
                if (receiveContentConfiguration != null) {
                    TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m27057getDragAndDropkB6V9T0(), null, 8, null));
                    plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                String str = plainText;
                if (str != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), str, false, null, false, 14, null);
                }
                return Boolean.TRUE;
            }
        }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
                }
            }
        }, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C10786q.f26013a;
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
        }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m28046invokek4lQ0M(((Offset) obj).m30647unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m28046invokek4lQ0M(long j10) {
                long jM28075fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m28075fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j10);
                int iM28065getOffsetForPosition3MmeM6k$default = TextLayoutState.m28065getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM28075fromWindowToDecorationUv8p0NA, false, 2, null);
                if (iM28065getOffsetForPosition3MmeM6k$default >= 0) {
                    this.this$0.getTextFieldState().m28085selectCharsIn5zctL8(TextRangeKt.TextRange(iM28065getOffsetForPosition3MmeM6k$default));
                }
                this.this$0.getTextFieldSelectionState().m28135updateHandleDraggingUv8p0NA(Handle.Cursor, jM28075fromWindowToDecorationUv8p0NA);
            }
        }, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C10786q.f26013a;
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
        }, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DragAndDropEvent) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DragAndDropEvent dragAndDropEvent) {
                this.this$0.emitDragExitEvent();
            }
        }, 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m27979constructorimpl(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {385, 386, 387}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1 */
            public static final class C18161 extends SuspendLambda implements InterfaceC9544p {
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
                public C18161(KeyCommand keyCommand, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC11588c<? super C18161> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$keyCommand = keyCommand;
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C18161(this.$keyCommand, this.this$0, interfaceC11588c);
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
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r5.label
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L1d
                        if (r1 == r4) goto L11
                        if (r1 == r3) goto L11
                        if (r1 != r2) goto L15
                    L11:
                        kotlin.AbstractC9924b.m20071b(r6)
                        goto L5f
                    L15:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1d:
                        kotlin.AbstractC9924b.m20071b(r6)
                        androidx.compose.foundation.text.KeyCommand r6 = r5.$keyCommand
                        int[] r1 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C18161.WhenMappings.$EnumSwitchMapping$0
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
                        qc.q r6 = p309qc.C10786q.f26013a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1.C18161.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C18161) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((KeyCommand) obj);
                return C10786q.f26013a;
            }

            public final void invoke(KeyCommand keyCommand) {
                AbstractC11117h.m24726d(this.this$0.getCoroutineScope(), null, CoroutineStart.f23479f, new C18161(keyCommand, this.this$0, null), 1, null);
            }
        });
        this.receiveContentConfigurationProvider = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }
        };
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private final void disposeInputSession() {
        InterfaceC10045g interfaceC10045g = this.inputSessionJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.inputSessionJob = null;
        InterfaceC11602k interfaceC11602k = this.stylusHandwritingTrigger;
        if (interfaceC11602k != null) {
            interfaceC11602k.mo20856f();
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
    public final Object observeUntransformedTextChanges(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objCollect = AbstractC11596e.m25547R(AbstractC11596e.m25567q(SnapshotStateKt.snapshotFlow(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final String invoke() {
                return TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText().toString();
            }
        }), 1), 1).collect(new InterfaceC11595d() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.3
            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c2) {
                return emit((String) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c2);
            }

            public final Object emit(String str, InterfaceC11588c<? super C10786q> interfaceC11588c2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return C10786q.f26013a;
            }
        }, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C18191(null), 3, null);
        } else {
            if (isFocused()) {
                return;
            }
            InterfaceC10045g interfaceC10045g = this.toolbarAndHandlesVisibilityObserverJob;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m28044onImeActionPerformedKlQnJC8(final int i10) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m33132equalsimpl0(i10, companion.m33149getNoneeUduSuo()) || ImeAction.m33132equalsimpl0(i10, companion.m33145getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo27804defaultKeyboardActionKlQnJC8(i10);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28047invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28047invoke() {
                    this.this$0.keyboardActionScope.mo27804defaultKeyboardActionKlQnJC8(i10);
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
            this.inputSessionJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C18251(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long jM27947getSelectiond9O1mEE = outputText.m27947getSelectiond9O1mEE();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m32748setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, jM27947getSelectiond9O1mEE);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z10 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z10);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {536}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = textFieldDecoratorModifierNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new AnonymousClass1(this.this$0, interfaceC11588c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objM25952f = AbstractC11725a.m25952f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                        this.label = 1;
                        if (textFieldDecoratorModifierNode.observeUntransformedTextChanges(this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    return C10786q.f26013a;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(AnnotatedString annotatedString) {
                if (!z10) {
                    return Boolean.FALSE;
                }
                this.getTextFieldState().replaceAll(annotatedString);
                this.setAutofillHighlightOn(true);
                AbstractC11117h.m24726d(this.getCoroutineScope(), null, null, new AnonymousClass1(this, null), 3, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (z10) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(this.getTextFieldState(), annotatedString, true, null, false, 12, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i10, int i11, boolean z11) {
                TextFieldCharSequence untransformedText = z11 ? TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText() : TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                long jM27947getSelectiond9O1mEE2 = untransformedText.m27947getSelectiond9O1mEE();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i10, i11) < 0 || Math.max(i10, i11) > untransformedText.length()) {
                    return Boolean.FALSE;
                }
                if (i10 == TextRange.m32966getStartimpl(jM27947getSelectiond9O1mEE2) && i11 == TextRange.m32961getEndimpl(jM27947getSelectiond9O1mEE2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i10, i11);
                if (z11 || i10 == i11) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z11) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m28086selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m28085selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        final int iM27818getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m27818getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m32744onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM27818getImeActionOrDefaulteUduSuo$foundation_release, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m28044onImeActionPerformedKlQnJC8(iM27818getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m32960getCollapsedimpl(jM27947getSelectiond9O1mEE) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {622}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.this$0, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (TextFieldSelectionState.copy$default(textFieldSelectionState, false, this, 1, null) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    AbstractC11117h.m24726d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10

                    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {627}, m26213m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                        int label;
                        final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                            super(2, interfaceC11588c);
                            this.this$0 = textFieldDecoratorModifierNode;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                            return new AnonymousClass1(this.this$0, interfaceC11588c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) throws Throwable {
                            Object objM25952f = AbstractC11725a.m25952f();
                            int i10 = this.label;
                            if (i10 == 0) {
                                AbstractC9924b.m20071b(obj);
                                TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                                this.label = 1;
                                if (textFieldSelectionState.cut(this) == objM25952f) {
                                    return objM25952f;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC9924b.m20071b(obj);
                            }
                            return C10786q.f26013a;
                        }

                        @Override // p181hd.InterfaceC9544p
                        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                            return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public final Boolean invoke() {
                        AbstractC11117h.m24726d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (z10) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.11

                @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {634}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$11$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    int label;
                    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.this$0 = textFieldDecoratorModifierNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.this$0, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                            this.label = 1;
                            if (textFieldSelectionState.paste(this) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    AbstractC11117h.m24726d(TextFieldDecoratorModifierNode.this.getCoroutineScope(), null, null, new AnonymousClass1(TextFieldDecoratorModifierNode.this, null), 3, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m31423drawRectnJ9OG0$default(contentDrawScope, ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m30888unboximpl(), 0L, 0L, 0.0f, null, null, 0, Opcodes.IAND, null);
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

    @Override // androidx.compose.p014ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final InterfaceC11602k getStylusHandwritingTrigger() {
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

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
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

    @Override // androidx.compose.p014ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo26919onKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo27973onKeyEventCJ9ybgU(keyEvent, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, this.enabled && !this.readOnly, this.singleLine, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28048invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m28048invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m28044onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m27818getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28049invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m28049invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.pointerInputNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    @Override // androidx.compose.p014ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo26921onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo27974onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.p014ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo27087onRemeasuredozmzZPI(long j10) {
        this.dragAndDropNode.mo27087onRemeasuredozmzZPI(j10);
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

    public final void setStylusHandwritingTrigger(InterfaceC11602k interfaceC11602k) {
        this.stylusHandwritingTrigger = interfaceC11602k;
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

    public final void updateNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC11602k interfaceC11602k) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z14;
        InterfaceC10045g interfaceC10045g;
        boolean z15 = this.enabled;
        boolean z16 = z15 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        boolean z17 = this.isPassword;
        InterfaceC11602k interfaceC11602k2 = this.stylusHandwritingTrigger;
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
        this.stylusHandwritingTrigger = interfaceC11602k;
        if (z14 != z16 || !AbstractC9979u.m20289b(transformedTextFieldState, transformedTextFieldState2) || !AbstractC9979u.m20289b(keyboardOptions, keyboardOptions2) || !AbstractC9979u.m20289b(interfaceC11602k, interfaceC11602k2)) {
            if (z14 && isFocused()) {
                startInputSession(false);
            } else if (!z14) {
                disposeInputSession();
            }
        }
        if (z10 != z15 || z14 != z16 || !ImeAction.m33132equalsimpl0(keyboardOptions.m27818getImeActionOrDefaulteUduSuo$foundation_release(), keyboardOptions2.m27818getImeActionOrDefaulteUduSuo$foundation_release()) || z13 != z17) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!AbstractC9979u.m20289b(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (interfaceC10045g = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    if (interfaceC10045g != null) {
                        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                    }
                    this.toolbarAndHandlesVisibilityObserverJob = AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C18261(textFieldSelectionState, null), 3, null);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.updateNode.2
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28054invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28054invoke() {
                    DelegatableNodeKt.requestAutofill(TextFieldDecoratorModifierNode.this);
                }
            });
        }
        if (AbstractC9979u.m20289b(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
    }
}
