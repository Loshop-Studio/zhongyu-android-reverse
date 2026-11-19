package kotlinx.coroutines.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CopyableThrowable;
import kotlinx.coroutines.InternalCoroutinesApi;

@Metadata(m5174d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m5175d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", ExifInterface.LONGITUDE_EAST, "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m5176k = 2, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class StackTraceRecoveryKt {
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object objM11788constructorimpl;
        Object objM11788constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11788constructorimpl = Result.m11788constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11788constructorimpl = Result.m11788constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11791exceptionOrNullimpl(objM11788constructorimpl) != null) {
            objM11788constructorimpl = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) objM11788constructorimpl;
        try {
            objM11788constructorimpl2 = Result.m11788constructorimpl(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM11788constructorimpl2 = Result.m11788constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m11791exceptionOrNullimpl(objM11788constructorimpl2) != null) {
            objM11788constructorimpl2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) objM11788constructorimpl2;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    @InternalCoroutinesApi
    public static final StackTraceElement artificialFrame(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> causeAndStacktrace(E e4) {
        boolean z3;
        Throwable cause = e4.getCause();
        if (cause == null || !Intrinsics.areEqual(cause.getClass(), e4.getClass())) {
            return TuplesKt.m5182to(e4, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int length = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z3 = false;
                break;
            }
            if (isArtificial(stackTrace[i4])) {
                z3 = true;
                break;
            }
            i4++;
        }
        return z3 ? TuplesKt.m5182to(cause, stackTrace) : TuplesKt.m5182to(e4, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E createFinalException(E e4, E e5, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(artificialFrame("Coroutine boundary"));
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int iFrameIndex = frameIndex(stackTrace, baseContinuationImplClassName);
        int i4 = 0;
        if (iFrameIndex == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            e5.setStackTrace((StackTraceElement[]) array);
            return e5;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iFrameIndex];
        for (int i5 = 0; i5 < iFrameIndex; i5++) {
            stackTraceElementArr[i5] = stackTrace[i5];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i4 + iFrameIndex] = it.next();
            i4++;
        }
        e5.setStackTrace(stackTraceElementArr);
        return e5;
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

    private static final int frameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (Intrinsics.areEqual(str, stackTraceElementArr[i4].getClassName())) {
                return i4;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return StringsKt__StringsJVMKt.startsWith$default(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i4])) {
                break;
            } else {
                i4++;
            }
        }
        int i5 = i4 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i5 > length2) {
            return;
        }
        while (true) {
            if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i5) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e4, CoroutineStackFrame coroutineStackFrame) {
        Pair pairCauseAndStacktrace = causeAndStacktrace(e4);
        Throwable th = (Throwable) pairCauseAndStacktrace.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairCauseAndStacktrace.component2();
        Throwable thTryCopyAndVerify = tryCopyAndVerify(th);
        if (thTryCopyAndVerify == null) {
            return e4;
        }
        ArrayDeque<StackTraceElement> arrayDequeCreateStackTrace = createStackTrace(coroutineStackFrame);
        if (arrayDequeCreateStackTrace.isEmpty()) {
            return e4;
        }
        if (th != e4) {
            mergeRecoveredTraces(stackTraceElementArr, arrayDequeCreateStackTrace);
        }
        return (E) createFinalException(th, thTryCopyAndVerify, arrayDequeCreateStackTrace);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e4) {
        return e4;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e4) {
        StackTraceElement[] stackTrace = e4.getStackTrace();
        int length = stackTrace.length;
        int iFrameIndex = frameIndex(stackTrace, stackTraceRecoveryClassName);
        int i4 = iFrameIndex + 1;
        int iFrameIndex2 = frameIndex(stackTrace, baseContinuationImplClassName);
        int i5 = 0;
        int i6 = (length - iFrameIndex) - (iFrameIndex2 == -1 ? 0 : length - iFrameIndex2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i6];
        while (i5 < i6) {
            stackTraceElementArr[i5] = i5 == 0 ? artificialFrame("Coroutine boundary") : stackTrace[(i4 + i5) - 1];
            i5++;
        }
        e4.setStackTrace(stackTraceElementArr);
        return e4;
    }

    private static final <E extends Throwable> E tryCopyAndVerify(E e4) {
        E e5 = (E) ExceptionsConstructorKt.tryCopyException(e4);
        if (e5 == null) {
            return null;
        }
        if ((e4 instanceof CopyableThrowable) || Intrinsics.areEqual(e5.getMessage(), e4.getMessage())) {
            return e5;
        }
        return null;
    }

    public static final <E extends Throwable> E unwrap(E e4) {
        return e4;
    }

    public static final <E extends Throwable> E unwrapImpl(E e4) {
        E e5 = (E) e4.getCause();
        if (e5 != null && Intrinsics.areEqual(e5.getClass(), e4.getClass())) {
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            boolean z3 = false;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (isArtificial(stackTrace[i4])) {
                    z3 = true;
                    break;
                }
                i4++;
            }
            if (z3) {
                return e5;
            }
        }
        return e4;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e4, Continuation<?> continuation) {
        return e4;
    }

    public static final Object recoverAndThrow(Throwable th, Continuation<?> continuation) throws Throwable {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, Continuation<?> continuation) throws Throwable {
        throw th;
    }
}
