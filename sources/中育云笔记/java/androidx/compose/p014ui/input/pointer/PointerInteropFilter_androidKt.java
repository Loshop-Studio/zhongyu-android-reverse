package androidx.compose.p014ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt {
    public static final Modifier motionEventSpy(Modifier modifier, final InterfaceC9540l interfaceC9540l) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, interfaceC9540l, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1

            @InterfaceC11829d(m26210c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", m26211f = "PointerInteropFilter.android.kt", m26212l = {334}, m26213m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC9544p {
                final /* synthetic */ InterfaceC9540l $watcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.$watcher = interfaceC9540l;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, interfaceC11588c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p181hd.InterfaceC9544p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC9924b.m20071b(r5)
                        goto L30
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.AbstractC9924b.m20071b(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.p014ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p014ui.input.pointer.PointerEventPass.Initial
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
                        if (r5 != r0) goto L30
                        return r0
                    L30:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.p014ui.input.pointer.PointerEvent) r5
                        android.view.MotionEvent r5 = r5.getMotionEvent$ui_release()
                        if (r5 == 0) goto L23
                        hd.l r3 = r4.$watcher
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.input.pointer.PointerInteropFilter_androidKt.C28871.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(interfaceC9540l, null), interfaceC11588c);
                return objAwaitPointerEventScope == AbstractC11725a.m25952f() ? objAwaitPointerEventScope : C10786q.f26013a;
            }
        });
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, final AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new InterfaceC9540l() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.3
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            }
        });
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, interfaceC9540l);
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, final RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, final InterfaceC9540l interfaceC9540l) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("pointerInteropFilter");
                inspectorInfo.getProperties().set("requestDisallowInterceptTouchEvent", requestDisallowInterceptTouchEvent);
                inspectorInfo.getProperties().set("onTouchEvent", interfaceC9540l);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC9545q() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.pointerInteropFilter.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(374375707);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(374375707, i10, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:77)");
                }
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new PointerInteropFilter();
                    composer.updateRememberedValue(objRememberedValue);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objRememberedValue;
                pointerInteropFilter.setOnTouchEvent(interfaceC9540l);
                pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pointerInteropFilter;
            }
        });
    }
}
