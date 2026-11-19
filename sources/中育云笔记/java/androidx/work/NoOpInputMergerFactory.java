package androidx.work;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class NoOpInputMergerFactory extends InputMergerFactory {
    public static final NoOpInputMergerFactory INSTANCE = new NoOpInputMergerFactory();

    private NoOpInputMergerFactory() {
    }

    /* renamed from: createInputMerger, reason: collision with other method in class */
    public Void m33961createInputMerger(String className) {
        AbstractC9979u.m20294g(className, "className");
        return null;
    }

    @Override // androidx.work.InputMergerFactory
    public /* bridge */ /* synthetic */ InputMerger createInputMerger(String str) {
        return (InputMerger) m33961createInputMerger(str);
    }
}
