package com.friday.common.helper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.R$color;
import com.friday.common.R$drawable;
import com.friday.common.helper.RightListDecoration;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class RightListDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final InterfaceC10773d f6078a;

    /* renamed from: b */
    public Bitmap f6079b;

    public RightListDecoration(Context context) {
        AbstractC9979u.m20294g(context, "context");
        this.f6078a = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: f2.i
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return RightListDecoration.m5257b();
            }
        });
        Paint paintM5258c = m5258c();
        paintM5258c.setColor(ContextCompat.getColor(context, R$color.app_black));
        paintM5258c.setAntiAlias(true);
        Drawable drawable = ContextCompat.getDrawable(context, R$drawable.selector_note_list_tag);
        this.f6079b = drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null;
    }

    /* renamed from: b */
    public static final Paint m5257b() {
        return new Paint();
    }

    /* renamed from: c */
    public final Paint m5258c() {
        return (Paint) this.f6078a.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c10, RecyclerView parent, RecyclerView.State state) {
        AbstractC9979u.m20294g(c10, "c");
        AbstractC9979u.m20294g(parent, "parent");
        AbstractC9979u.m20294g(state, "state");
        int childCount = parent.getChildCount();
        int paddingLeft = parent.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = parent.getLayoutParams();
        float f10 = paddingLeft + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0) + 57.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            float top2 = parent.getChildAt(i10).getTop() + 54.0f;
            Bitmap bitmap = this.f6079b;
            if (bitmap != null) {
                c10.drawBitmap(bitmap, f10, top2, m5258c());
            }
        }
    }
}
