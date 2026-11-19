package androidx.compose.p014ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p014ui.SessionMutex;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9924b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, InterfaceC11122i0 {
    public static final int $stable = 8;
    private final InterfaceC11122i0 coroutineScope;
    private final AtomicReference methodSessionMutex = SessionMutex.m30449constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", m26211f = "AndroidPlatformTextInputSession.android.kt", m26212l = {PatchStatus.CODE_LOAD_UNDEFINED}, m26213m = "startInputMethod")
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 */
    public static final class C29801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29801(InterfaceC11588c<? super C29801> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m26211f = "AndroidPlatformTextInputSession.android.kt", m26212l = {Opcodes.INVOKESTATIC}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 */
    public static final class C29823 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C29823(InterfaceC11588c<? super C29823> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C29823 c29823 = AndroidPlatformTextInputSession.this.new C29823(interfaceC11588c);
            c29823.L$0 = obj;
            return c29823;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InputMethodSession inputMethodSession, InterfaceC11588c<?> interfaceC11588c) {
            return ((C29823) create(inputMethodSession, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                final AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(this), 1);
                c9997c.m20503F();
                androidPlatformTextInputSession.textInputService.startInput();
                c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return C10786q.f26013a;
                    }

                    public final void invoke(Throwable th) {
                        inputMethodSession.dispose();
                        androidPlatformTextInputSession.textInputService.stopInput();
                    }
                });
                Object objM20538x = c9997c.m20538x();
                if (objM20538x == AbstractC11725a.m25952f()) {
                    AbstractC11831f.m26221c(this);
                }
                if (objM20538x == objM25952f) {
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

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, InterfaceC11122i0 interfaceC11122i0) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = interfaceC11122i0;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m30453getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.p014ui.platform.PlatformTextInputSessionScope, sd.InterfaceC11122i0
    public InterfaceC9945d getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.p014ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m30453getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(final androidx.compose.p014ui.platform.PlatformTextInputMethodRequest r6, vc.InterfaceC11588c<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.p014ui.platform.AndroidPlatformTextInputSession.C29801
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.p014ui.platform.AndroidPlatformTextInputSession.C29801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4a
        L31:
            kotlin.AbstractC9924b.m20071b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.p014ui.SessionMutex.m30456withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, vc.c):java.lang.Object");
    }
}
