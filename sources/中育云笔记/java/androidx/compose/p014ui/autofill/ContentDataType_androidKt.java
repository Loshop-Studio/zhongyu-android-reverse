package androidx.compose.p014ui.autofill;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int i10) {
        return AndroidContentDataType.m30458boximpl(AndroidContentDataType.m30459constructorimpl(i10));
    }

    public static final int getDataType(ContentDataType contentDataType) {
        AbstractC9979u.m20292e(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m30464unboximpl();
    }
}
