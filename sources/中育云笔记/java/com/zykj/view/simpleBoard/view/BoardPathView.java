package com.zykj.view.simpleBoard.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p308qb.C10768b;

/* loaded from: classes6.dex */
public final class BoardPathView extends View {

    /* renamed from: c */
    public C10768b f20746c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardPathView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public final C10768b getMDrawControl() {
        C10768b c10768b = this.f20746c;
        if (c10768b != null) {
            return c10768b;
        }
        AbstractC9979u.m20312y("mDrawControl");
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        super.onDraw(canvas);
        getMDrawControl().m22946e(canvas);
    }

    public final void setMDrawControl(C10768b c10768b) {
        AbstractC9979u.m20294g(c10768b, "<set-?>");
        this.f20746c = c10768b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardPathView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ BoardPathView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardPathView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
    }
}
