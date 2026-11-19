package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p011ui.graphics.Matrix;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.C5939k;
import kotlinx.coroutines.flow.C5955u;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0014\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "composeImm", "Lkotlinx/coroutines/v;", "monitorScope", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lkotlinx/coroutines/v;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "Ld6/s;", "requestUpdates", "(ZZZZZZ)V", "startOrStopMonitoring", "()V", "Landroid/view/inputmethod/CursorAnchorInfo;", "calculateCursorAnchorInfo", "()Landroid/view/inputmethod/CursorAnchorInfo;", "", "cursorUpdateMode", "(I)V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Lkotlinx/coroutines/v;", "monitorEnabled", "Z", "hasPendingImmediateRequest", "Lkotlinx/coroutines/w0;", "monitorJob", "Lkotlinx/coroutines/w0;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "[F", "Landroid/graphics/Matrix;", "androidMatrix", "Landroid/graphics/Matrix;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;

    @NotNull
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;

    @Nullable
    private InterfaceC6013w0 monitorJob;

    @NotNull
    private final InterfaceC6009v monitorScope;

    @NotNull
    private final TransformedTextFieldState textFieldState;

    @NotNull
    private final TextLayoutState textLayoutState;

    @NotNull
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    @NotNull
    private final float[] matrix = Matrix.m10912constructorimpl$default(null, 1, null);

    @NotNull
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
    @DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", m5303f = "CursorAnchorInfoController.android.kt", m5304i = {}, m5305l = {154}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1 */
    public static final class C13271 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C13271(InterfaceC5631c<? super C13271> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return CursorAnchorInfoController.this.new C13271(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5443s c5443s = C5443s.f8405a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                return c5443s;
            }
            AbstractC5774b.m5119b(obj);
            final CursorAnchorInfoController cursorAnchorInfoController = CursorAnchorInfoController.this;
            InterfaceC5910f interfaceC5910fSnapshotFlow = SnapshotStateKt.snapshotFlow(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final CursorAnchorInfo invoke() {
                    return cursorAnchorInfoController.calculateCursorAnchorInfo();
                }
            });
            final CursorAnchorInfoController cursorAnchorInfoController2 = CursorAnchorInfoController.this;
            InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.2
                public final Object emit(CursorAnchorInfo cursorAnchorInfo, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    cursorAnchorInfoController2.composeImm.updateCursorAnchorInfo(cursorAnchorInfo);
                    return C5443s.f8405a;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5912g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                    return emit((CursorAnchorInfo) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                }
            };
            this.label = 1;
            Object objCollect = interfaceC5910fSnapshotFlow.collect(new C5939k(new Ref$IntRef(), new C5955u(interfaceC5912g)), this);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objCollect = c5443s;
            }
            if (objCollect != coroutineSingletons) {
                objCollect = c5443s;
            }
            return objCollect == coroutineSingletons ? coroutineSingletons : c5443s;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C13271) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    public CursorAnchorInfoController(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull ComposeInputMethodManager composeInputMethodManager, @NotNull InterfaceC6009v interfaceC6009v) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = interfaceC6009v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                        return null;
                    }
                    TextFieldCharSequence visualText = this.textFieldState.getVisualText();
                    Matrix.m10921resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo12049transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m10552setFromEL8BTi8(this.androidMatrix, this.matrix);
                    Rect rectVisibleBounds = SelectionManagerKt.visibleBounds(coreNodeCoordinates);
                    Offset.Companion companion = Offset.INSTANCE;
                    return CursorAnchorInfoBuilder_androidKt.m7791buildvxqZcH0(this.builder, visualText, visualText.getSelection(), visualText.getComposition(), layoutResult, this.androidMatrix, rectVisibleBounds.m10478translatek4lQ0M(textLayoutNodeCoordinates.mo12042localPositionOfR5De75A(coreNodeCoordinates, companion.m10457getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m10478translatek4lQ0M(textLayoutNodeCoordinates.mo12042localPositionOfR5De75A(decoratorNodeCoordinates, companion.m10457getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        if (!this.monitorEnabled) {
            InterfaceC6013w0 interfaceC6013w0 = this.monitorJob;
            if (interfaceC6013w0 != null) {
                interfaceC6013w0.cancel(null);
            }
            this.monitorJob = null;
            return;
        }
        InterfaceC6013w0 interfaceC6013w02 = this.monitorJob;
        if (interfaceC6013w02 == null || !interfaceC6013w02.isActive()) {
            this.monitorJob = AbstractC6014x.m5651v(this.monitorScope, null, CoroutineStart.UNDISPATCHED, new C13271(null), 1);
        }
    }

    public final void requestUpdates(int cursorUpdateMode) {
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        boolean z13 = (cursorUpdateMode & 1) != 0;
        boolean z14 = (cursorUpdateMode & 2) != 0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            boolean z15 = (cursorUpdateMode & 16) != 0;
            boolean z16 = (cursorUpdateMode & 8) != 0;
            boolean z17 = (cursorUpdateMode & 4) != 0;
            if (i >= 34 && (cursorUpdateMode & 32) != 0) {
                z12 = true;
            }
            if (z15 || z16 || z17 || z12) {
                z9 = z12;
                z8 = z17;
                z11 = z16;
                z10 = z15;
                cursorAnchorInfoController = this;
            } else {
                cursorAnchorInfoController = this;
                if (i >= 34) {
                    z10 = true;
                    z11 = true;
                    z8 = true;
                    z9 = true;
                } else {
                    z9 = z12;
                    z10 = true;
                    z11 = true;
                    z8 = true;
                }
            }
        } else {
            cursorAnchorInfoController = this;
            z8 = false;
            z9 = false;
            z10 = true;
            z11 = true;
        }
        cursorAnchorInfoController.requestUpdates(z13, z14, z10, z11, z8, z9);
    }

    private final void requestUpdates(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        this.includeInsertionMarker = includeInsertionMarker;
        this.includeCharacterBounds = includeCharacterBounds;
        this.includeEditorBounds = includeEditorBounds;
        this.includeLineBounds = includeLineBounds;
        if (immediate) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo cursorAnchorInfoCalculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (cursorAnchorInfoCalculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(cursorAnchorInfoCalculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = monitor;
        startOrStopMonitoring();
    }
}
