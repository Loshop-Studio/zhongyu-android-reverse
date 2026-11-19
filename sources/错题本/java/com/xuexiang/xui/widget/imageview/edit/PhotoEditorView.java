package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xuexiang.xui.R$styleable;
import p129o2.C6268a;

/* loaded from: classes3.dex */
public class PhotoEditorView extends RelativeLayout {

    /* renamed from: a */
    public FilterImageView f4401a;

    /* renamed from: b */
    public BrushDrawingView f4402b;

    /* renamed from: c */
    public C4179d f4403c;

    public PhotoEditorView(Context context) {
        super(context);
        m3502a(null);
    }

    /* renamed from: a */
    public final void m3502a(AttributeSet attributeSet) {
        Drawable drawable;
        FilterImageView filterImageView = new FilterImageView(getContext());
        this.f4401a = filterImageView;
        filterImageView.setId(1);
        this.f4401a.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        if (attributeSet != null && (drawable = getContext().obtainStyledAttributes(attributeSet, R$styleable.PhotoEditorView).getDrawable(R$styleable.PhotoEditorView_photo_src)) != null) {
            this.f4401a.setImageDrawable(drawable);
        }
        BrushDrawingView brushDrawingView = new BrushDrawingView(getContext());
        this.f4402b = brushDrawingView;
        brushDrawingView.setVisibility(8);
        this.f4402b.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13, -1);
        layoutParams2.addRule(6, 1);
        layoutParams2.addRule(8, 1);
        C4179d c4179d = new C4179d(getContext());
        c4179d.f4406a = new int[2];
        c4179d.f4409d = new C4181f();
        c4179d.f4412g = false;
        c4179d.setEGLContextClientVersion(2);
        c4179d.setRenderer(c4179d);
        c4179d.setRenderMode(0);
        c4179d.f4413h = PhotoFilter.NONE;
        c4179d.requestRender();
        this.f4403c = c4179d;
        c4179d.setId(3);
        this.f4403c.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(13, -1);
        layoutParams3.addRule(6, 1);
        layoutParams3.addRule(8, 1);
        FilterImageView filterImageView2 = this.f4401a;
        filterImageView2.f4400a = new C6268a(this, 9);
        addView(filterImageView2, layoutParams);
        addView(this.f4403c, layoutParams3);
        addView(this.f4402b, layoutParams2);
    }

    public BrushDrawingView getBrushDrawingView() {
        return this.f4402b;
    }

    public ImageView getSource() {
        return this.f4401a;
    }

    public void setFilterEffect(PhotoFilter photoFilter) {
        this.f4403c.setVisibility(0);
        C4179d c4179d = this.f4403c;
        c4179d.f4414i = this.f4401a.getBitmap();
        c4179d.f4412g = false;
        C4179d c4179d2 = this.f4403c;
        c4179d2.f4413h = photoFilter;
        c4179d2.requestRender();
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3502a(attributeSet);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3502a(attributeSet);
    }

    public void setFilterEffect(AbstractC4177b abstractC4177b) {
        this.f4403c.setVisibility(0);
        C4179d c4179d = this.f4403c;
        c4179d.f4414i = this.f4401a.getBitmap();
        c4179d.f4412g = false;
        this.f4403c.requestRender();
    }
}
