package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.concurrent.Executor;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PagingDataTransforms {
    @CheckResult
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, Executor executor, InterfaceC10570l interfaceC10570l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.filter(pagingData, executor, interfaceC10570l);
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, Executor executor, InterfaceC10570l interfaceC10570l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.flatMap(pagingData, executor, interfaceC10570l);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertFooterItem(pagingData, terminalSeparatorType, t10);
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertHeaderItem(pagingData, terminalSeparatorType, t10);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC10574p interfaceC10574p) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, terminalSeparatorType, executor, interfaceC10574p);
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, Executor executor, InterfaceC10570l interfaceC10570l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.map(pagingData, executor, interfaceC10570l);
    }

    public static final <T, R> PagingData<R> transform(PagingData<T> pagingData, InterfaceC10574p interfaceC10574p) {
        return PagingDataTransforms__PagingDataTransformsKt.transform(pagingData, interfaceC10574p);
    }

    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertFooterItem(pagingData, t10);
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertHeaderItem(pagingData, t10);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, InterfaceC10574p interfaceC10574p) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, executor, interfaceC10574p);
    }
}
