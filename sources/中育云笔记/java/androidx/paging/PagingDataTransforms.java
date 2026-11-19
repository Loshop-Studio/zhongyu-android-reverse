package androidx.paging;

import androidx.annotation.CheckResult;
import java.util.concurrent.Executor;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;

/* loaded from: classes3.dex */
public final class PagingDataTransforms {
    @CheckResult
    public static final <T> PagingData<T> insertFooterItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertFooterItem(pagingData, terminalSeparatorType, t10);
    }

    @CheckResult
    public static final <T> PagingData<T> insertHeaderItem(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, T t10) {
        return PagingDataTransforms__PagingDataTransformsKt.insertHeaderItem(pagingData, terminalSeparatorType, t10);
    }

    public static final <T, R> PagingData<R> transform(PagingData<T> pagingData, InterfaceC9544p interfaceC9544p) {
        return PagingDataTransforms__PagingDataTransformsKt.transform(pagingData, interfaceC9544p);
    }

    @CheckResult
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, Executor executor, InterfaceC9540l interfaceC9540l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.filter(pagingData, executor, interfaceC9540l);
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, Executor executor, InterfaceC9540l interfaceC9540l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.flatMap(pagingData, executor, interfaceC9540l);
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
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC9544p interfaceC9544p) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, terminalSeparatorType, executor, interfaceC9544p);
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, Executor executor, InterfaceC9540l interfaceC9540l) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.map(pagingData, executor, interfaceC9540l);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, InterfaceC9544p interfaceC9544p) {
        return PagingDataTransforms__PagingDataTransforms_jvmKt.insertSeparators(pagingData, executor, interfaceC9544p);
    }
}
