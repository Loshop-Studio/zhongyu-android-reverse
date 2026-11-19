package com.xuexiang.xui.widget.textview.label;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public final class LabelViewHelper {
    private static final int DEFAULT_BACKGROUND_COLOR = -1624781376;
    private static final int DEFAULT_DISTANCE = 40;
    private static final int DEFAULT_HEIGHT = 20;
    private static final int DEFAULT_ORIENTATION = 1;
    private static final int DEFAULT_STROKE_COLOR = 0;
    private static final int DEFAULT_STROKE_WIDTH = 1;
    private static final int DEFAULT_TEXT_COLOR = -1;
    private static final int DEFAULT_TEXT_SIZE = 14;
    private static final int DEFAULT_TEXT_STYLE = 0;
    private static final int LEFT_BOTTOM = 3;
    private static final int LEFT_TOP = 1;
    private static final int RIGHT_BOTTOM = 4;
    private static final int RIGHT_TOP = 2;
    private int mAlpha;
    private int mBackgroundColor;
    private Context mContext;
    private int mDistance;
    private int mHeight;
    private int mOrientation;
    private Paint mRectPaint;
    private Path mRectPath;
    private Paint mRectStrokePaint;
    private int mStrokeColor;
    private int mStrokeWidth;
    private String mText;
    private Rect mTextBound;
    private int mTextColor;
    private String mTextFont;
    private Paint mTextPaint;
    private Path mTextPath;
    private int mTextSize;
    private int mTextStyle;
    private boolean mVisual;

    public LabelViewHelper(Context context, AttributeSet attributeSet, int i4) {
        this.mContext = context;
        initAttrs(context, attributeSet, i4);
        initPaints();
    }

    private void calcOffset(int i4, int i5) {
        int i6 = this.mDistance;
        int i7 = this.mHeight;
        float f4 = (i4 - i6) - i7;
        float f5 = i4;
        float f6 = (i5 - i6) - i7;
        float f7 = i5;
        float f8 = i7 / 2.0f;
        int i8 = this.mOrientation;
        if (i8 == 1) {
            this.mRectPath.reset();
            this.mRectPath.moveTo(IGoodView.DEFAULT_TO_ALPHA, this.mDistance);
            this.mRectPath.lineTo(this.mDistance, IGoodView.DEFAULT_TO_ALPHA);
            this.mRectPath.lineTo(this.mDistance + this.mHeight, IGoodView.DEFAULT_TO_ALPHA);
            this.mRectPath.lineTo(IGoodView.DEFAULT_TO_ALPHA, this.mDistance + this.mHeight);
            this.mRectPath.close();
            this.mTextPath.reset();
            this.mTextPath.moveTo(IGoodView.DEFAULT_TO_ALPHA, this.mDistance + f8);
            this.mTextPath.lineTo(this.mDistance + f8, IGoodView.DEFAULT_TO_ALPHA);
            this.mTextPath.close();
            return;
        }
        if (i8 == 2) {
            this.mRectPath.reset();
            this.mRectPath.moveTo(f4, IGoodView.DEFAULT_TO_ALPHA);
            this.mRectPath.lineTo(this.mHeight + f4, IGoodView.DEFAULT_TO_ALPHA);
            this.mRectPath.lineTo(f5, this.mDistance);
            this.mRectPath.lineTo(f5, this.mDistance + this.mHeight);
            this.mRectPath.close();
            this.mTextPath.reset();
            this.mTextPath.moveTo(f4 + f8, IGoodView.DEFAULT_TO_ALPHA);
            this.mTextPath.lineTo(f5, this.mDistance + f8);
            this.mTextPath.close();
            return;
        }
        if (i8 == 3) {
            this.mRectPath.reset();
            this.mRectPath.moveTo(IGoodView.DEFAULT_TO_ALPHA, f6);
            this.mRectPath.lineTo(this.mDistance + this.mHeight, f7);
            this.mRectPath.lineTo(this.mDistance, f7);
            this.mRectPath.lineTo(IGoodView.DEFAULT_TO_ALPHA, this.mHeight + f6);
            this.mRectPath.close();
            this.mTextPath.reset();
            this.mTextPath.moveTo(IGoodView.DEFAULT_TO_ALPHA, f6 + f8);
            this.mTextPath.lineTo(this.mDistance + f8, f7);
            this.mTextPath.close();
            return;
        }
        if (i8 != 4) {
            return;
        }
        this.mRectPath.reset();
        this.mRectPath.moveTo(f4, f7);
        this.mRectPath.lineTo(f5, f6);
        this.mRectPath.lineTo(f5, this.mHeight + f6);
        this.mRectPath.lineTo(this.mHeight + f4, f7);
        this.mRectPath.close();
        this.mTextPath.reset();
        this.mTextPath.moveTo(f4 + f8, f7);
        this.mTextPath.lineTo(f5, f6 + f8);
        this.mTextPath.close();
    }

    private int dip2Px(float f4) {
        return (int) ((f4 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.LabelView, i4, 0);
        this.mDistance = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.LabelView_label_distance, dip2Px(40.0f));
        this.mHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.LabelView_label_height, dip2Px(20.0f));
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.LabelView_label_backgroundColor, DEFAULT_BACKGROUND_COLOR);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.LabelView_label_strokeWidth, dip2Px(1.0f));
        this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.LabelView_label_strokeColor, 0);
        this.mText = typedArrayObtainStyledAttributes.getString(C2042R.styleable.LabelView_label_text);
        this.mTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.LabelView_label_textSize, dip2Px(14.0f));
        this.mTextStyle = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.LabelView_label_textStyle, 0);
        this.mTextFont = typedArrayObtainStyledAttributes.getString(C2042R.styleable.LabelView_label_textFont);
        this.mTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.LabelView_label_textColor, -1);
        this.mVisual = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.LabelView_label_visual, true);
        this.mOrientation = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.LabelView_label_orientation, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initPaints() {
        Paint paint = new Paint();
        this.mRectPaint = paint;
        paint.setDither(true);
        this.mRectPaint.setAntiAlias(true);
        this.mRectPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mRectStrokePaint = paint2;
        paint2.setDither(true);
        this.mRectStrokePaint.setAntiAlias(true);
        this.mRectStrokePaint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        this.mRectPath = path;
        path.reset();
        Path path2 = new Path();
        this.mTextPath = path2;
        path2.reset();
        Paint paint3 = new Paint();
        this.mTextPaint = paint3;
        paint3.setDither(true);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mTextPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mTextBound = new Rect();
    }

    private int px2Dip(float f4) {
        return (int) ((f4 / this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getLabelBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getLabelDistance() {
        return px2Dip(this.mDistance);
    }

    public int getLabelHeight() {
        return px2Dip(this.mHeight);
    }

    public int getLabelOrientation() {
        return this.mOrientation;
    }

    public int getLabelStrokeColor() {
        return this.mStrokeColor;
    }

    public int getLabelStrokeWidth() {
        return px2Dip(this.mStrokeWidth);
    }

    public String getLabelText() {
        return this.mText;
    }

    public int getLabelTextColor() {
        return this.mTextColor;
    }

    public String getLabelTextFont() {
        return this.mTextFont;
    }

    public int getLabelTextSize() {
        return px2Dip(this.mTextSize);
    }

    public int getLabelTextStyle() {
        return this.mTextStyle;
    }

    public boolean isLabelVisual() {
        return this.mVisual;
    }

    public void onDraw(Canvas canvas, int i4, int i5) {
        if (!this.mVisual || this.mText == null) {
            return;
        }
        float f4 = this.mDistance + (this.mHeight / 2.0f);
        calcOffset(i4, i5);
        this.mRectPaint.setColor(this.mBackgroundColor);
        int i6 = this.mAlpha;
        if (i6 != 0) {
            this.mRectPaint.setAlpha(i6);
        }
        this.mRectStrokePaint.setColor(this.mStrokeColor);
        this.mRectStrokePaint.setStrokeWidth(this.mStrokeWidth);
        canvas.drawPath(this.mRectPath, this.mRectPaint);
        canvas.drawPath(this.mRectPath, this.mRectStrokePaint);
        this.mTextPaint.setTextSize(this.mTextSize);
        this.mTextPaint.setColor(this.mTextColor);
        Paint paint = this.mTextPaint;
        String str = this.mText;
        paint.getTextBounds(str, 0, str.length(), this.mTextBound);
        if (Utils.isNullOrEmpty(this.mTextFont)) {
            this.mTextPaint.setTypeface(Typeface.defaultFromStyle(this.mTextStyle));
        } else {
            this.mTextPaint.setTypeface(XUI.getDefaultTypeface(this.mTextFont));
        }
        float fWidth = ((f4 * 1.4142135f) / 2.0f) - (this.mTextBound.width() / 2.0f);
        canvas.drawTextOnPath(this.mText, this.mTextPath, fWidth < IGoodView.DEFAULT_TO_ALPHA ? IGoodView.DEFAULT_TO_ALPHA : fWidth, this.mTextBound.height() / 2.0f, this.mTextPaint);
    }

    public void setLabelBackgroundAlpha(View view, int i4) {
        if (this.mAlpha != i4) {
            this.mAlpha = i4;
            view.invalidate();
        }
    }

    public void setLabelBackgroundColor(View view, int i4) {
        if (this.mBackgroundColor != i4) {
            this.mBackgroundColor = i4;
            view.invalidate();
        }
    }

    public void setLabelDistance(View view, int i4) {
        float f4 = i4;
        if (this.mDistance != dip2Px(f4)) {
            this.mDistance = dip2Px(f4);
            view.invalidate();
        }
    }

    public void setLabelHeight(View view, int i4) {
        float f4 = i4;
        if (this.mHeight != dip2Px(f4)) {
            this.mHeight = dip2Px(f4);
            view.invalidate();
        }
    }

    public void setLabelOrientation(View view, int i4) {
        if (this.mOrientation == i4 || i4 > 4 || i4 < 1) {
            return;
        }
        this.mOrientation = i4;
        view.invalidate();
    }

    public void setLabelStrokeColor(View view, int i4) {
        if (this.mStrokeColor != i4) {
            this.mStrokeColor = i4;
            view.invalidate();
        }
    }

    public void setLabelStrokeWidth(View view, int i4) {
        float f4 = i4;
        if (this.mStrokeWidth != dip2Px(f4)) {
            this.mStrokeWidth = dip2Px(f4);
            view.invalidate();
        }
    }

    public void setLabelText(View view, String str) {
        String str2 = this.mText;
        if (str2 == null || !str2.equals(str)) {
            this.mText = str;
            view.invalidate();
        }
    }

    public void setLabelTextColor(View view, int i4) {
        if (this.mTextColor != i4) {
            this.mTextColor = i4;
            view.invalidate();
        }
    }

    public void setLabelTextFont(View view, String str) {
        this.mTextFont = str;
        view.invalidate();
    }

    public void setLabelTextSize(View view, int i4) {
        if (this.mTextSize != i4) {
            this.mTextSize = i4;
            view.invalidate();
        }
    }

    public void setLabelTextStyle(View view, int i4) {
        if (this.mTextStyle == i4) {
            return;
        }
        this.mTextStyle = i4;
        view.invalidate();
    }

    public void setLabelVisual(View view, boolean z3) {
        if (this.mVisual != z3) {
            this.mVisual = z3;
            view.invalidate();
        }
    }
}
