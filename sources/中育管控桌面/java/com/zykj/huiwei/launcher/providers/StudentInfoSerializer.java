package com.zykj.huiwei.launcher.providers;

// RE note: studentInfo.pb binds to launcher.proto.g. The original message retains unknown fields on a read/write round-trip.

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.Serializer;
import com.zykj.huiwei.launcher.proto.C6069g;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/providers/StudentInfoSerializer;", "Landroidx/datastore/core/Serializer;", "Lcom/zykj/huiwei/launcher/proto/g;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Lcom/zykj/huiwei/launcher/proto/g;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultValue", "Lcom/zykj/huiwei/launcher/proto/g;", "getDefaultValue", "()Lcom/zykj/huiwei/launcher/proto/g;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class StudentInfoSerializer implements Serializer<C6069g> {
    public static final int $stable = 0;
    public static final StudentInfoSerializer INSTANCE = new StudentInfoSerializer();
    private static final C6069g defaultValue;

    static {
        C6069g defaultInstance = C6069g.getDefaultInstance();
        Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
        defaultValue = defaultInstance;
    }

    private StudentInfoSerializer() {
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation<? super C6069g> continuation) {
        Object objM17183constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM17183constructorimpl = Result.m17183constructorimpl(C6069g.parseFrom(inputStream));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM17183constructorimpl = Result.m17183constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m17189isFailureimpl(objM17183constructorimpl)) {
            objM17183constructorimpl = null;
        }
        C6069g c6069g = (C6069g) objM17183constructorimpl;
        return c6069g == null ? getDefaultValue() : c6069g;
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(C6069g c6069g, OutputStream outputStream, Continuation continuation) {
        return writeTo2(c6069g, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public C6069g getDefaultValue() {
        return defaultValue;
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(C6069g c6069g, OutputStream outputStream, Continuation<? super Unit> continuation) {
        c6069g.writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
