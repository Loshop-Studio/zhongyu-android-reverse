package com.zykj.view.simpleBoard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.zykj.view.simpleBoard.view.BoardImageView;
import com.zykj.view.simpleBoard.view.BoardPathView;
import com.zykj.view.simpleBoard.view.BoardTempPathView;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p308qb.C10767a;
import p308qb.C10768b;
import p308qb.C10769c;
import sb.InterfaceC11086a;

/* loaded from: classes6.dex */
public final class SimpleBoardView extends FrameLayout implements InterfaceC11086a {

    /* renamed from: c */
    public final Matrix f20738c;

    /* renamed from: d */
    public final C10769c f20739d;

    /* renamed from: e */
    public C10768b f20740e;

    /* renamed from: f */
    public C10767a f20741f;

    /* renamed from: g */
    public final BoardTempPathView f20742g;

    /* renamed from: h */
    public final BoardPathView f20743h;

    /* renamed from: i */
    public final BoardImageView f20744i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // sb.InterfaceC11086a
    /* renamed from: a */
    public void mo17363a() {
        this.f20744i.invalidate();
    }

    @Override // sb.InterfaceC11086a
    /* renamed from: b */
    public void mo17364b() {
        this.f20742g.invalidate();
    }

    @Override // sb.InterfaceC11086a
    /* renamed from: c */
    public void mo17365c() {
        this.f20743h.invalidate();
    }

    /* renamed from: d */
    public final void m17366d() {
        this.f20740e.m22944c();
    }

    public final Bitmap getImageBackground() {
        Bitmap bitmapM22948g = this.f20740e.m22948g();
        if (bitmapM22948g != null) {
            return Bitmap.createBitmap(bitmapM22948g);
        }
        return null;
    }

    public final C10769c getSimpleBoardConfig() {
        return this.f20739d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f20740e.m22959r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.f20741f.m22940a(event);
        return true;
    }

    public final void setActonMode(int i10) {
        this.f20741f.m22941b(i10);
    }

    public final void setImageBackground(Bitmap bitmap) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        this.f20740e.m22957p(bitmap);
        this.f20744i.postInvalidate();
    }

    public final void setOnActionListener(InterfaceC9529a interfaceC9529a) {
        this.f20740e.m22958q(interfaceC9529a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    public /* synthetic */ SimpleBoardView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        Matrix matrix = new Matrix();
        this.f20738c = matrix;
        C10769c c10769c = new C10769c(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
        this.f20739d = c10769c;
        C10768b c10768b = new C10768b(c10769c, matrix, this);
        this.f20740e = c10768b;
        this.f20741f = new C10767a(c10769c, matrix, c10768b);
        BoardTempPathView boardTempPathView = new BoardTempPathView(context, attributeSet, 0, 4, null);
        boardTempPathView.setMDrawControl(this.f20740e);
        this.f20742g = boardTempPathView;
        BoardPathView boardPathView = new BoardPathView(context, attributeSet, 0, 4, null);
        boardPathView.setMDrawControl(this.f20740e);
        this.f20743h = boardPathView;
        BoardImageView boardImageView = new BoardImageView(context, attributeSet, 0, 4, null);
        boardImageView.setMDrawControl(this.f20740e);
        this.f20744i = boardImageView;
        addView(boardImageView);
        addView(boardPathView);
        addView(boardTempPathView);
    }
}
