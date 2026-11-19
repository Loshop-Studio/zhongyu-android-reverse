package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.PlatformTextInputSession;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.channels.BufferOverflow;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11608q;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public static final int $stable = 8;
    private InterfaceC11602k backingStylusHandwritingTrigger;
    private LegacyTextInputMethodRequest currentRequest;
    private InterfaceC10045g job;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", m26211f = "LegacyPlatformTextInputServiceAdapter.android.kt", m26212l = {125}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 */
    public static final class C17672 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9540l $initializeRequest;
        final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", m26211f = "LegacyPlatformTextInputServiceAdapter.android.kt", m26212l = {Opcodes.FCMPL}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ PlatformTextInputSession $$this$launchTextInputSession;
            final /* synthetic */ InterfaceC9540l $initializeRequest;
            final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", m26211f = "LegacyPlatformTextInputServiceAdapter.android.kt", m26212l = {140, 141}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C120731 extends SuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InputMethodManager $inputMethodManager;
                int label;
                final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C120731(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, InputMethodManager inputMethodManager, InterfaceC11588c<? super C120731> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                    this.$inputMethodManager = inputMethodManager;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    return new C120731(this.this$0, this.$inputMethodManager, interfaceC11588c);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    if (r5.collect(r1, r4) == r0) goto L17;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r4.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L16:
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L44
                    L1a:
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L2c
                    L1e:
                        kotlin.AbstractC9924b.m20071b(r5)
                        androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1 r5 = new p181hd.InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1
                            static {
                                /*
                                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1 r0 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT (r0 I:androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1) androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.2.1.1.1.INSTANCE androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$1
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.C17672.AnonymousClass1.C120731.C120741.<clinit>():void");
                            }

                            {
                                /*
                                    r1 = this;
                                    r0 = 1
                                    r1.<init>(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.C17672.AnonymousClass1.C120731.C120741.<init>():void");
                            }

                            public final void invoke(long r1) {
                                /*
                                    r0 = this;
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.C17672.AnonymousClass1.C120731.C120741.invoke(long):void");
                            }

                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                                /*
                                    r2 = this;
                                    java.lang.Number r3 = (java.lang.Number) r3
                                    long r0 = r3.longValue()
                                    r2.invoke(r0)
                                    qc.q r3 = p309qc.C10786q.f26013a
                                    return r3
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.C17672.AnonymousClass1.C120731.C120741.invoke(java.lang.Object):java.lang.Object");
                            }
                        }
                        r4.label = r3
                        java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r4)
                        if (r5 != r0) goto L2c
                        goto L43
                    L2c:
                        androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter r5 = r4.this$0
                        vd.k r5 = androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.access$getStylusHandwritingTrigger(r5)
                        if (r5 == 0) goto L4a
                        androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$2
                        androidx.compose.foundation.text.input.internal.InputMethodManager r3 = r4.$inputMethodManager
                        r1.<init>()
                        r4.label = r2
                        java.lang.Object r5 = r5.collect(r1, r4)
                        if (r5 != r0) goto L44
                    L43:
                        return r0
                    L44:
                        kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                        r5.<init>()
                        throw r5
                    L4a:
                        qc.q r5 = p309qc.C10786q.f26013a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.C17672.AnonymousClass1.C120731.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((C120731) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlatformTextInputSession platformTextInputSession, InterfaceC9540l interfaceC9540l, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$launchTextInputSession = platformTextInputSession;
                this.$initializeRequest = interfaceC9540l;
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$node = legacyPlatformTextInputNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        AbstractC9924b.m20071b(obj);
                        InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                        InputMethodManager inputMethodManager = (InputMethodManager) LegacyPlatformTextInputServiceAdapter_androidKt.getInputMethodManagerFactory().invoke(this.$$this$launchTextInputSession.getView());
                        LegacyTextInputMethodRequest legacyTextInputMethodRequest = new LegacyTextInputMethodRequest(this.$$this$launchTextInputSession.getView(), new C1768x8f2ae8f3(this.$node), inputMethodManager);
                        if (StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
                            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C120731(this.this$0, inputMethodManager, null), 3, null);
                        }
                        InterfaceC9540l interfaceC9540l = this.$initializeRequest;
                        if (interfaceC9540l != null) {
                            interfaceC9540l.invoke(legacyTextInputMethodRequest);
                        }
                        this.this$0.currentRequest = legacyTextInputMethodRequest;
                        PlatformTextInputSession platformTextInputSession = this.$$this$launchTextInputSession;
                        this.label = 1;
                        if (platformTextInputSession.startInputMethod(legacyTextInputMethodRequest, this) == objM25952f) {
                            return objM25952f;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9924b.m20071b(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.this$0.currentRequest = null;
                    throw th;
                }
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<?> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17672(InterfaceC9540l interfaceC9540l, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, InterfaceC11588c<? super C17672> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$initializeRequest = interfaceC9540l;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = legacyPlatformTextInputNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C17672 c17672 = new C17672(this.$initializeRequest, this.this$0, this.$node, interfaceC11588c);
            c17672.L$0 = obj;
            return c17672;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(PlatformTextInputSession platformTextInputSession, InterfaceC11588c<?> interfaceC11588c) {
            return ((C17672) create(platformTextInputSession, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PlatformTextInputSession) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC11602k getStylusHandwritingTrigger() {
        InterfaceC11602k interfaceC11602k = this.backingStylusHandwritingTrigger;
        if (interfaceC11602k != null) {
            return interfaceC11602k;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        InterfaceC11602k interfaceC11602kM25592b = AbstractC11608q.m25592b(1, 0, BufferOverflow.f23521e, 2, null);
        this.backingStylusHandwritingTrigger = interfaceC11602kM25592b;
        return interfaceC11602kM25592b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInput$localToScreen(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, float[] fArr) {
        LayoutCoordinates layoutCoordinates = legacyPlatformTextInputNode.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return;
            }
            layoutCoordinates.mo32245transformToScreen58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(Rect rect) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.notifyFocusedRect(rect);
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void startInput(final TextFieldValue textFieldValue, final ImeOptions imeOptions, final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        startInput(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.startInput.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LegacyTextInputMethodRequest) obj);
                return C10786q.f26013a;
            }

            public final void invoke(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
                legacyTextInputMethodRequest.startInput(textFieldValue, this.getTextInputModifierNode(), imeOptions, interfaceC9540l, interfaceC9540l2);
            }
        });
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public void startStylusHandwriting() {
        InterfaceC11602k stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.mo20854a(C10786q.f26013a);
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void stopInput() {
        InterfaceC10045g interfaceC10045g = this.job;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.job = null;
        InterfaceC11602k stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.mo20856f();
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateState(textFieldValue, textFieldValue2);
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC9540l interfaceC9540l, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void startInput() {
        startInput(null);
    }

    private final void startInput(InterfaceC9540l interfaceC9540l) {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.launchTextInputSession(new C17672(interfaceC9540l, this, textInputModifierNode, null));
    }
}
