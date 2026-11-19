package p298y7;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p278w7.C9821b;

/* renamed from: y7.b */
/* loaded from: classes5.dex */
public final class C9945b extends View {

    /* renamed from: a */
    public C9821b f17792a;

    public /* synthetic */ C9945b(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final C9821b getMDrawControl() {
        C9821b c9821b = this.f17792a;
        if (c9821b != null) {
            return c9821b;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDrawControl");
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        getMDrawControl().m16413g(canvas);
    }

    public final void setMDrawControl(C9821b c9821b) {
        Intrinsics.checkNotNullParameter(c9821b, "<set-?>");
        this.f17792a = c9821b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9945b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
