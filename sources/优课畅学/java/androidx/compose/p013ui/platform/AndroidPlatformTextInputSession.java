package androidx.compose.p013ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p013ui.SessionMutex;
import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, InterfaceC8822b0 {
    public static final int $stable = 8;
    private final InterfaceC8822b0 coroutineScope;
    private final AtomicReference methodSessionMutex = SessionMutex.m23847constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    @InterfaceC9539d(m17800c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", m17801f = "AndroidPlatformTextInputSession.android.kt", m17802l = {71}, m17803m = "startInputMethod")
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 */
    public static final class C29501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29501(InterfaceC9324c<? super C29501> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", m17801f = "AndroidPlatformTextInputSession.android.kt", m17802l = {184}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 */
    public static final class C29523 extends SuspendLambda implements InterfaceC10574p {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public C29523(InterfaceC9324c<? super C29523> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C29523 c29523 = AndroidPlatformTextInputSession.this.new C29523(interfaceC9324c);
            c29523.L$0 = obj;
            return c29523;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InputMethodSession inputMethodSession, InterfaceC9324c<?> interfaceC9324c) {
            return ((C29523) create(inputMethodSession, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                final AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(this), 1);
                c9155c.m16343D();
                androidPlatformTextInputSession.textInputService.startInput();
                c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Throwable th) {
                        inputMethodSession.dispose();
                        androidPlatformTextInputSession.textInputService.stopInput();
                    }
                });
                Object objM16372x = c9155c.m16372x();
                if (objM16372x == AbstractC9434a.m17291f()) {
                    AbstractC9541f.m17811c(this);
                }
                if (objM16372x == objM17291f) {
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

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, InterfaceC8822b0 interfaceC8822b0) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = interfaceC8822b0;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m23851getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // androidx.compose.p013ui.platform.PlatformTextInputSessionScope, p135i8.InterfaceC8822b0
    public InterfaceC9100d getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.p013ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m23851getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p013ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(final androidx.compose.p013ui.platform.PlatformTextInputMethodRequest r6, p179m7.InterfaceC9324c<?> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.p013ui.platform.AndroidPlatformTextInputSession.C29501
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.p013ui.platform.AndroidPlatformTextInputSession.C29501) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4a
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.p013ui.SessionMutex.m23854withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, m7.c):java.lang.Object");
    }
}
