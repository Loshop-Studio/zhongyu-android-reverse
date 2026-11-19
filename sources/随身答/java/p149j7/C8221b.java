package p149j7;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.zykj.view.simpleBoard.C7719a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j7.b */
/* loaded from: classes5.dex */
public final class C8221b extends View {

    /* renamed from: a */
    public C7719a f14296a;

    public /* synthetic */ C8221b(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    public final C7719a getMDrawControl() {
        C7719a c7719a = this.f14296a;
        if (c7719a != null) {
            return c7719a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDrawControl");
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        getMDrawControl().m11975l(canvas);
    }

    public final void setMDrawControl(C7719a c7719a) {
        Intrinsics.checkNotNullParameter(c7719a, "<set-?>");
        this.f14296a = c7719a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8221b(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
