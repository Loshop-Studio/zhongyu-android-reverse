package com.xuexiang.xui.widget.imageview.edit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.imageview.edit.FilterImageView;

/* loaded from: classes.dex */
public class PhotoEditorView extends RelativeLayout {
    private static final int BRUSH_SRC_ID = 2;
    private static final int GL_FILTER_ID = 3;
    private static final int IMG_SRC_ID = 1;
    private static final String TAG = "PhotoEditorView";
    private BrushDrawingView mBrushDrawingView;
    private ImageFilterView mImageFilterView;
    private FilterImageView mImgSource;

    public PhotoEditorView(Context context) {
        super(context);
        init(null);
    }

    @SuppressLint({"Recycle"})
    private void init(AttributeSet attributeSet) {
        Drawable drawable;
        FilterImageView filterImageView = new FilterImageView(getContext());
        this.mImgSource = filterImageView;
        filterImageView.setId(1);
        this.mImgSource.setAdjustViewBounds(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        if (attributeSet != null && (drawable = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.PhotoEditorView).getDrawable(C2042R.styleable.PhotoEditorView_photo_src)) != null) {
            this.mImgSource.setImageDrawable(drawable);
        }
        BrushDrawingView brushDrawingView = new BrushDrawingView(getContext());
        this.mBrushDrawingView = brushDrawingView;
        brushDrawingView.setVisibility(8);
        this.mBrushDrawingView.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13, -1);
        layoutParams2.addRule(6, 1);
        layoutParams2.addRule(8, 1);
        ImageFilterView imageFilterView = new ImageFilterView(getContext());
        this.mImageFilterView = imageFilterView;
        imageFilterView.setId(3);
        this.mImageFilterView.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(13, -1);
        layoutParams3.addRule(6, 1);
        layoutParams3.addRule(8, 1);
        this.mImgSource.setOnImageChangedListener(new FilterImageView.OnImageChangedListener() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditorView.1
            @Override // com.xuexiang.xui.widget.imageview.edit.FilterImageView.OnImageChangedListener
            public void onBitmapLoaded(Bitmap bitmap) {
                PhotoEditorView.this.mImageFilterView.setFilterEffect(PhotoFilter.NONE);
                PhotoEditorView.this.mImageFilterView.setSourceBitmap(bitmap);
                Log.d(PhotoEditorView.TAG, "onBitmapLoaded() called with: sourceBitmap = [" + bitmap + "]");
            }
        });
        addView(this.mImgSource, layoutParams);
        addView(this.mImageFilterView, layoutParams3);
        addView(this.mBrushDrawingView, layoutParams2);
    }

    BrushDrawingView getBrushDrawingView() {
        return this.mBrushDrawingView;
    }

    public ImageView getSource() {
        return this.mImgSource;
    }

    void saveFilter(final OnBitmapSaveListener onBitmapSaveListener) {
        if (this.mImageFilterView.getVisibility() == 0) {
            this.mImageFilterView.saveBitmap(new OnBitmapSaveListener() { // from class: com.xuexiang.xui.widget.imageview.edit.PhotoEditorView.2
                @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
                public void onBitmapReady(Bitmap bitmap) {
                    Log.e(PhotoEditorView.TAG, "saveFilter: " + bitmap);
                    PhotoEditorView.this.mImgSource.setImageBitmap(bitmap);
                    PhotoEditorView.this.mImageFilterView.setVisibility(8);
                    onBitmapSaveListener.onBitmapReady(bitmap);
                }

                @Override // com.xuexiang.xui.widget.imageview.edit.OnBitmapSaveListener
                public void onFailure(Exception exc) {
                    onBitmapSaveListener.onFailure(exc);
                }
            });
        } else {
            onBitmapSaveListener.onBitmapReady(this.mImgSource.getBitmap());
        }
    }

    void setFilterEffect(PhotoFilter photoFilter) {
        this.mImageFilterView.setVisibility(0);
        this.mImageFilterView.setSourceBitmap(this.mImgSource.getBitmap());
        this.mImageFilterView.setFilterEffect(photoFilter);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    void setFilterEffect(CustomEffect customEffect) {
        this.mImageFilterView.setVisibility(0);
        this.mImageFilterView.setSourceBitmap(this.mImgSource.getBitmap());
        this.mImageFilterView.setFilterEffect(customEffect);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(attributeSet);
    }

    public PhotoEditorView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        init(attributeSet);
    }
}
