package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final InterfaceC10570l produceNewData;

    public ReplaceFileCorruptionHandler(InterfaceC10570l produceNewData) {
        AbstractC9133u.m16133g(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC9324c<? super T> interfaceC9324c) {
        return this.produceNewData.invoke(corruptionException);
    }
}
