package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;

/* loaded from: classes.dex */
public class IconImageView extends AppCompatImageView {
    private Bitmap mIconBitmap;
    private Paint mIconPaint;
    private float mIconScale;
    private boolean mIsShow;

    public IconImageView(Context context) {
        super(context);
        this.mIconScale = 0.3f;
        this.mIsShow = true;
        initAttrs(context, null);
    }

    private RectF getIconBitmapRectF(Bitmap bitmap) {
        float height;
        float height2;
        float width = bitmap.getWidth();
        float height3 = bitmap.getHeight();
        if (width >= height3) {
            height2 = (getWidth() / width) * height3;
            height = getWidth();
        } else {
            height = (getHeight() / height3) * width;
            height2 = getHeight();
        }
        float width2 = (getWidth() - (height * this.mIconScale)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.mIconScale)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.IconImageView);
            Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.IconImageView_iiv_icon_res);
            if (drawableAttrRes != null) {
                this.mIconBitmap = Utils.getBitmapFromDrawable(drawableAttrRes);
            }
            this.mIconScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.IconImageView_iiv_icon_scale, this.mIconScale);
            this.mIsShow = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.IconImageView_iiv_is_show, this.mIsShow);
            typedArrayObtainStyledAttributes.recycle();
        }
        initPaint();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mIconPaint = paint;
        paint.setColor(ThemeUtils.getMainThemeColor(getContext()));
        this.mIconPaint.setAntiAlias(true);
        this.mIconPaint.setFilterBitmap(true);
        this.mIconPaint.setStyle(Paint.Style.STROKE);
        this.mIconPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.mIconBitmap;
        if (bitmap == null || !this.mIsShow) {
            return;
        }
        canvas.drawBitmap(bitmap, (Rect) null, getIconBitmapRectF(bitmap), this.mIconPaint);
    }

    public void recycle() {
        Bitmap bitmap = this.mIconBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mIconBitmap = null;
        }
        this.mIconPaint = null;
    }

    public IconImageView setIconBitmap(Bitmap bitmap) {
        this.mIconBitmap = bitmap;
        invalidate();
        return this;
    }

    public IconImageView setIconDrawable(Drawable drawable) {
        this.mIconBitmap = Utils.getBitmapFromDrawable(drawable);
        invalidate();
        return this;
    }

    public IconImageView setIconScale(float f4) {
        this.mIconScale = f4;
        invalidate();
        return this;
    }

    public IconImageView setIsShowIcon(boolean z3) {
        this.mIsShow = z3;
        invalidate();
        return this;
    }

    public IconImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIconScale = 0.3f;
        this.mIsShow = true;
        initAttrs(context, attributeSet);
    }

    public IconImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIconScale = 0.3f;
        this.mIsShow = true;
        initAttrs(context, attributeSet);
    }
}
