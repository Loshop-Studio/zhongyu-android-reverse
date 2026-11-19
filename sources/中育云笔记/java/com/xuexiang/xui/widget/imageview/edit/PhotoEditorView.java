package com.xuexiang.xui.widget.imageview.edit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.imageview.edit.FilterImageView;
import java.util.Objects;

/* loaded from: classes5.dex */
public class PhotoEditorView extends RelativeLayout {

    /* renamed from: c */
    public FilterImageView f16141c;

    /* renamed from: d */
    public BrushDrawingView f16142d;

    /* renamed from: e */
    public C8136e f16143e;

    /* renamed from: com.xuexiang.xui.widget.imageview.edit.PhotoEditorView$a */
    public class C8131a implements FilterImageView.InterfaceC8130a {
        public C8131a() {
        }

        @Override // com.xuexiang.xui.widget.imageview.edit.FilterImageView.InterfaceC8130a
        /* renamed from: a */
        public void mo12746a(Bitmap bitmap) {
            PhotoEditorView.this.f16143e.m12760g(PhotoFilter.NONE);
            PhotoEditorView.this.f16143e.m12761h(bitmap);
            Objects.toString(bitmap);
        }
    }

    public PhotoEditorView(Context context) {
        super(context);
        m12748b(null);
    }

    /* renamed from: b */
    public final void m12748b(AttributeSet attributeSet) {
        Drawable drawable;
        FilterImageView filterImageView = new FilterImageView(getContext());
        this.f16141c = filterImageView;
        filterImageView.setId(1);
        this.f16141c.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        if (attributeSet != null && (drawable = getContext().obtainStyledAttributes(attributeSet, R$styleable.PhotoEditorView).getDrawable(R$styleable.PhotoEditorView_photo_src)) != null) {
            this.f16141c.setImageDrawable(drawable);
        }
        BrushDrawingView brushDrawingView = new BrushDrawingView(getContext());
        this.f16142d = brushDrawingView;
        brushDrawingView.setVisibility(8);
        this.f16142d.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13, -1);
        layoutParams2.addRule(6, 1);
        layoutParams2.addRule(8, 1);
        C8136e c8136e = new C8136e(getContext());
        this.f16143e = c8136e;
        c8136e.setId(3);
        this.f16143e.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(13, -1);
        layoutParams3.addRule(6, 1);
        layoutParams3.addRule(8, 1);
        this.f16141c.m12745a(new C8131a());
        addView(this.f16141c, layoutParams);
        addView(this.f16143e, layoutParams3);
        addView(this.f16142d, layoutParams2);
    }

    public BrushDrawingView getBrushDrawingView() {
        return this.f16142d;
    }

    public ImageView getSource() {
        return this.f16141c;
    }

    public void setFilterEffect(PhotoFilter photoFilter) {
        this.f16143e.setVisibility(0);
        this.f16143e.m12761h(this.f16141c.getBitmap());
        this.f16143e.m12760g(photoFilter);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12748b(attributeSet);
    }

    public void setFilterEffect(AbstractC8134c abstractC8134c) {
        this.f16143e.setVisibility(0);
        this.f16143e.m12761h(this.f16141c.getBitmap());
        this.f16143e.m12759f(abstractC8134c);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12748b(attributeSet);
    }
}
