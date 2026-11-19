package androidx.compose.p013ui.autofill;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int i10) {
        return AndroidContentDataType.m23856boximpl(AndroidContentDataType.m23857constructorimpl(i10));
    }

    public static final int getDataType(ContentDataType contentDataType) {
        AbstractC9133u.m16131e(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m23862unboximpl();
    }
}
