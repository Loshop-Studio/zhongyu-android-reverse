package androidx.compose.p013ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m13558d2 = {"dataType", "", "Landroidx/compose/ui/autofill/ContentDataType;", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "ContentDataType", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int i10) {
        return AndroidContentDataType.m20564boximpl(AndroidContentDataType.m20565constructorimpl(i10));
    }

    public static final int getDataType(ContentDataType contentDataType) {
        Intrinsics.checkNotNull(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m20570unboximpl();
    }
}
