package kotlinx.coroutines.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p000a.AbstractC0001b;
import p000a.C0000a;

@Metadata(m13412d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u001f\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u000e\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b*\u0002H\nH\u0002¢\u0006\u0002\u0010\r\u001a,\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0080\b¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\n2\n\u0010\u000f\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a9\u0010\u0016\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\u0017\u001a\u0002H\n2\u0006\u0010\u0018\u001a\u0002H\n2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001aH\u0002¢\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u0002H\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f0\u001e\"\b\b\u0000\u0010\n*\u00020\u000b*\u0002H\nH\u0002¢\u0006\u0002\u0010 \u001a1\u0010!\u001a\u00020\"2\u0010\u0010#\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f2\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001aH\u0002¢\u0006\u0002\u0010$\u001a\u0016\u0010%\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0080H¢\u0006\u0002\u0010'\u001a \u0010(\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0081\b¢\u0006\u0002\u0010\r\u001a\u001f\u0010)\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0001¢\u0006\u0002\u0010\r\u001a\u001e\u0010*\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001a2\n\u0010\u000f\u001a\u00060\u0013j\u0002`\u0014H\u0002\u001a\u0010\u0010+\u001a\u00020,*\u00060\u0004j\u0002`\u001bH\u0000\u001a#\u0010-\u001a\u00020.*\f\u0012\b\u0012\u00060\u0004j\u0002`\u001b0\u001f2\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00100\u001a\u001c\u00101\u001a\u00020,*\u00060\u0004j\u0002`\u001b2\n\u00102\u001a\u00060\u0004j\u0002`\u001bH\u0002\u001a\u0014\u00105\u001a\u00020\"*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0018\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007*\f\b\u0000\u00103\"\u00020\u00132\u00020\u0013*\f\b\u0000\u00104\"\u00020\u00042\u00020\u0004¨\u00066"}, m13413d2 = {"baseContinuationImplClass", "", "stackTraceRecoveryClass", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "stackTraceRecoveryClassName", "recoverStackTrace", ExifInterface.LONGITUDE_EAST, "", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sanitizeStackTrace", "continuation", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "recoverFromStackFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "createFinalException", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "causeAndStacktrace", "Lkotlin/Pair;", "", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "mergeRecoveredTraces", "", "recoveredStacktrace", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "createStackTrace", "isArtificial", "", "firstFrameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "elementWiseEquals", "e", "CoroutineStackFrame", "StackTraceElement", "initCause", "kotlinx-coroutines-core"}, m13414k = 2, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1790#2,6:211\n12567#2,2:221\n1682#2,6:223\n12567#2,2:229\n1682#2,6:232\n37#3:217\n36#3,3:218\n1#4:231\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n39#1:211,6\n127#1:221,2\n137#1:223,6\n169#1:229,2\n190#1:232,6\n102#1:217\n102#1:218,3\n*E\n"})
/* loaded from: classes5.dex */
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = new C0000a().m0a();
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object objM24758constructorimpl;
        Object objM24758constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
            objM24758constructorimpl = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) objM24758constructorimpl;
        try {
            objM24758constructorimpl2 = Result.m24758constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM24758constructorimpl2 = Result.m24758constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl2) != null) {
            objM24758constructorimpl2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) objM24758constructorimpl2;
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e10) {
        Throwable cause = e10.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), e10.getClass())) {
            return TuplesKt.m13420to(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (isArtificial(stackTraceElement)) {
                return TuplesKt.m13420to(cause, stackTrace);
            }
        }
        return TuplesKt.m13420to(e10, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i9 = 0;
        if (iFirstFrameIndex == -1) {
            e11.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e11;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFirstFrameIndex];
        for (int i10 = 0; i10 < iFirstFrameIndex; i10++) {
            stackTraceElementArr[i10] = stackTrace[i10];
        }
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i9 + iFirstFrameIndex] = (StackTraceElement) it.next();
            i9++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.areEqual(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.areEqual(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i9].getClassName())) {
                return i9;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return StringsKt.startsWith$default(stackTraceElement.getClassName(), AbstractC0001b.m4c(), false, 2, (Object) null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                i9 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i9])) {
                break;
            } else {
                i9++;
            }
        }
        int i10 = i9 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i10 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i10) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e10, CoroutineStackFrame coroutineStackFrame) {
        Pair pairCauseAndStacktrace = causeAndStacktrace(e10);
        Throwable th = (Throwable) pairCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairCauseAndStacktrace.component2();
        Throwable thTryCopyException = ExceptionsConstructorKt.tryCopyException(th);
        if (thTryCopyException != null) {
            ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
            if (!arrayDequeCreateStackTrace.isEmpty()) {
                if (th != e10) {
                    mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
                }
                return (E) createFinalException(th, thTryCopyException, arrayDequeCreateStackTrace);
            }
        }
        return e10;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e10) {
        return e10;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i9 = length2 - 1;
                if (Intrinsics.areEqual(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                length2 = i9;
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i10 = length2 + 1;
        int iFirstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i11 = 0;
        int i12 = (length - length2) - (iFirstFrameIndex == -1 ? 0 : length - iFirstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        while (i11 < i12) {
            stackTraceElementArr[i11] = i11 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i10 + i11) - 1];
            i11++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    @PublishedApi
    public static final <E extends Throwable> E unwrap(E e10) {
        return e10;
    }

    @PublishedApi
    public static final <E extends Throwable> E unwrapImpl(E e10) {
        E e11 = (E) e10.getCause();
        if (e11 != null && Intrinsics.areEqual(e11.getClass(), e10.getClass())) {
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (isArtificial(stackTraceElement)) {
                    return e11;
                }
            }
        }
        return e10;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e10, Continuation<?> continuation) {
        return e10;
    }

    public static final Object recoverAndThrow(Throwable th, Continuation<?> continuation) throws Throwable {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, Continuation<?> continuation) throws Throwable {
        throw th;
    }
}
