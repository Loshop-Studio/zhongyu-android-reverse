package com.xuexiang.xui.widget.picker.wheelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.picker.wheelview.adapter.WheelAdapter;
import com.xuexiang.xui.widget.picker.wheelview.interfaces.IPickerViewItem;
import com.xuexiang.xui.widget.picker.wheelview.listener.LoopViewGestureListener;
import com.xuexiang.xui.widget.picker.wheelview.listener.OnItemSelectedListener;
import com.xuexiang.xui.widget.picker.wheelview.timer.InertiaTimerTask;
import com.xuexiang.xui.widget.picker.wheelview.timer.MessageHandler;
import com.xuexiang.xui.widget.picker.wheelview.timer.SmoothScrollTimerTask;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WheelView extends View implements HasTypeface {
    private static final float DEFAULT_TEXT_TARGET_SKEWX = 0.5f;
    private static final float SCALE_CONTENT = 0.8f;
    private static final int VELOCITY_FLING = 5;
    private float CENTER_CONTENT_OFFSET;
    private WheelAdapter adapter;
    private float centerY;
    private Context context;
    private int dividerColor;
    private DividerType dividerType;
    private int drawCenterContentStart;
    private int drawOutContentStart;
    private float firstLineY;
    private GestureDetector gestureDetector;
    private Handler handler;
    private int initPosition;
    private boolean isCenterLabel;
    private boolean isLoop;
    private boolean isOptions;
    private float itemHeight;
    private int itemsVisible;
    private String label;
    private float lineSpacingMultiplier;
    private ScheduledExecutorService mExecutor;
    private ScheduledFuture<?> mFuture;
    private int mGravity;
    private int mOffset;
    private int maxTextHeight;
    private int maxTextWidth;
    private int measuredHeight;
    private int measuredWidth;
    private OnItemSelectedListener onItemSelectedListener;
    private TextPaint paintCenterText;
    private Paint paintIndicator;
    private TextPaint paintOuterText;
    private int preCurrentIndex;
    private float previousY;
    private int radius;
    private float secondLineY;
    private int selectedItem;
    private long startTime;
    private int textColorCenter;
    private int textColorOut;
    private int textSize;
    private int textXOffset;
    private float totalScrollY;
    private Typeface typeface;
    private int widthMeasureSpec;

    public enum ACTION {
        CLICK,
        FLING,
        DAGGLE
    }

    public enum DividerType {
        FILL,
        WRAP
    }

    public WheelView(Context context) {
        this(context, null);
    }

    private String getContentText(Object obj) {
        return obj == null ? "" : obj instanceof IPickerViewItem ? ((IPickerViewItem) obj).getPickerViewText() : obj instanceof Integer ? String.format(Locale.getDefault(), "%02d", obj) : obj.toString();
    }

    private int getLoopMappingIndex(int i4) {
        return i4 < 0 ? getLoopMappingIndex(i4 + this.adapter.getItemsCount()) : i4 > this.adapter.getItemsCount() + (-1) ? getLoopMappingIndex(i4 - this.adapter.getItemsCount()) : i4;
    }

    private void initLoopView(Context context) {
        this.context = context;
        this.handler = new MessageHandler(this);
        GestureDetector gestureDetector = new GestureDetector(context, new LoopViewGestureListener(this));
        this.gestureDetector = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.isLoop = true;
        this.totalScrollY = IGoodView.DEFAULT_TO_ALPHA;
        this.initPosition = -1;
        initPaints();
    }

    private void initPaints() {
        TextPaint textPaint = new TextPaint();
        this.paintOuterText = textPaint;
        textPaint.setColor(this.textColorOut);
        this.paintOuterText.setAntiAlias(true);
        this.paintOuterText.setTypeface(this.typeface);
        this.paintOuterText.setTextSize(this.textSize);
        TextPaint textPaint2 = new TextPaint();
        this.paintCenterText = textPaint2;
        textPaint2.setColor(this.textColorCenter);
        this.paintCenterText.setAntiAlias(true);
        this.paintCenterText.setTextScaleX(1.1f);
        this.paintCenterText.setTypeface(this.typeface);
        this.paintCenterText.setTextSize(this.textSize);
        Paint paint = new Paint();
        this.paintIndicator = paint;
        paint.setColor(this.dividerColor);
        this.paintIndicator.setAntiAlias(true);
        setLayerType(1, null);
    }

    private void judgeLineSpace() {
        float f4 = this.lineSpacingMultiplier;
        if (f4 < 1.0f) {
            this.lineSpacingMultiplier = 1.0f;
        } else if (f4 > 4.0f) {
            this.lineSpacingMultiplier = 4.0f;
        }
    }

    private void measureTextWidthHeight() {
        Rect rect = new Rect();
        for (int i4 = 0; i4 < this.adapter.getItemsCount(); i4++) {
            String contentText = getContentText(this.adapter.getItem(i4));
            this.paintCenterText.getTextBounds(contentText, 0, contentText.length(), rect);
            int iWidth = rect.width();
            if (iWidth > this.maxTextWidth) {
                this.maxTextWidth = iWidth;
            }
            this.paintCenterText.getTextBounds("星期", 0, 2, rect);
            this.maxTextHeight = rect.height() + 2;
        }
        this.itemHeight = this.lineSpacingMultiplier * this.maxTextHeight;
    }

    private void measuredCenterContentStart(String str) {
        String str2;
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.mGravity;
        if (i4 == 3) {
            this.drawCenterContentStart = 0;
            return;
        }
        if (i4 == 5) {
            this.drawCenterContentStart = (this.measuredWidth - rect.width()) - ((int) this.CENTER_CONTENT_OFFSET);
            return;
        }
        if (i4 != 17) {
            return;
        }
        if (this.isOptions || (str2 = this.label) == null || "".equals(str2) || !this.isCenterLabel) {
            this.drawCenterContentStart = (int) ((this.measuredWidth - rect.width()) * 0.5d);
        } else {
            this.drawCenterContentStart = (int) ((this.measuredWidth - rect.width()) * 0.25d);
        }
    }

    private void measuredOutContentStart(String str) {
        String str2;
        Rect rect = new Rect();
        this.paintOuterText.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.mGravity;
        if (i4 == 3) {
            this.drawOutContentStart = 0;
            return;
        }
        if (i4 == 5) {
            this.drawOutContentStart = (this.measuredWidth - rect.width()) - ((int) this.CENTER_CONTENT_OFFSET);
            return;
        }
        if (i4 != 17) {
            return;
        }
        if (this.isOptions || (str2 = this.label) == null || "".equals(str2) || !this.isCenterLabel) {
            this.drawOutContentStart = (int) ((this.measuredWidth - rect.width()) * 0.5d);
        } else {
            this.drawOutContentStart = (int) ((this.measuredWidth - rect.width()) * 0.25d);
        }
    }

    private void reMeasureTextSize(String str) {
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        int i4 = this.textSize;
        for (int iWidth = rect.width(); iWidth > this.measuredWidth; iWidth = rect.width()) {
            i4--;
            this.paintCenterText.setTextSize(i4);
            this.paintCenterText.getTextBounds(str, 0, str.length(), rect);
        }
        this.paintOuterText.setTextSize(i4);
    }

    private void remeasure() {
        if (this.adapter == null) {
            return;
        }
        measureTextWidthHeight();
        int i4 = (int) (this.itemHeight * (this.itemsVisible - 1));
        this.measuredHeight = (int) ((i4 * 2) / 3.141592653589793d);
        this.radius = (int) (i4 / 3.141592653589793d);
        this.measuredWidth = View.MeasureSpec.getSize(this.widthMeasureSpec);
        int i5 = this.measuredHeight;
        float f4 = this.itemHeight;
        this.firstLineY = (i5 - f4) / 2.0f;
        float f5 = (i5 + f4) / 2.0f;
        this.secondLineY = f5;
        this.centerY = (f5 - ((f4 - this.maxTextHeight) / 2.0f)) - this.CENTER_CONTENT_OFFSET;
        if (this.initPosition == -1) {
            if (this.isLoop) {
                this.initPosition = (this.adapter.getItemsCount() + 1) / 2;
            } else {
                this.initPosition = 0;
            }
        }
        this.preCurrentIndex = this.initPosition;
    }

    public void cancelFuture() {
        ScheduledFuture<?> scheduledFuture = this.mFuture;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.mFuture.cancel(true);
        this.mFuture = null;
    }

    public final WheelAdapter getAdapter() {
        return this.adapter;
    }

    public final int getCurrentItem() {
        int i4;
        WheelAdapter wheelAdapter = this.adapter;
        if (wheelAdapter == null) {
            return 0;
        }
        return (!this.isLoop || ((i4 = this.selectedItem) >= 0 && i4 < wheelAdapter.getItemsCount())) ? Math.max(0, Math.min(this.selectedItem, this.adapter.getItemsCount() - 1)) : Math.max(0, Math.min(Math.abs(Math.abs(this.selectedItem) - this.adapter.getItemsCount()), this.adapter.getItemsCount() - 1));
    }

    @Override // android.view.View
    public Handler getHandler() {
        return this.handler;
    }

    public int getInitPosition() {
        return this.initPosition;
    }

    public float getItemHeight() {
        return this.itemHeight;
    }

    public int getItemsCount() {
        WheelAdapter wheelAdapter = this.adapter;
        if (wheelAdapter != null) {
            return wheelAdapter.getItemsCount();
        }
        return 0;
    }

    public int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int iCeil = 0;
        for (int i4 = 0; i4 < length; i4++) {
            iCeil += (int) Math.ceil(r2[i4]);
        }
        return iCeil;
    }

    public float getTotalScrollY() {
        return this.totalScrollY;
    }

    public void isCenterLabel(boolean z3) {
        this.isCenterLabel = z3;
    }

    public boolean isLoop() {
        return this.isLoop;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f4;
        float f5;
        if (this.adapter == null) {
            return;
        }
        int iMin = Math.min(Math.max(0, this.initPosition), this.adapter.getItemsCount() - 1);
        this.initPosition = iMin;
        Object[] objArr = new Object[this.itemsVisible];
        try {
            this.preCurrentIndex = iMin + (((int) (this.totalScrollY / this.itemHeight)) % this.adapter.getItemsCount());
        } catch (ArithmeticException unused) {
            UILog.eTag("WheelView", "出错了！adapter.getItemsCount() == 0，联动数据不匹配");
        }
        if (this.isLoop) {
            if (this.preCurrentIndex < 0) {
                this.preCurrentIndex = this.adapter.getItemsCount() + this.preCurrentIndex;
            }
            if (this.preCurrentIndex > this.adapter.getItemsCount() - 1) {
                this.preCurrentIndex -= this.adapter.getItemsCount();
            }
        } else {
            if (this.preCurrentIndex < 0) {
                this.preCurrentIndex = 0;
            }
            if (this.preCurrentIndex > this.adapter.getItemsCount() - 1) {
                this.preCurrentIndex = this.adapter.getItemsCount() - 1;
            }
        }
        float f6 = this.totalScrollY % this.itemHeight;
        int i4 = 0;
        while (true) {
            int i5 = this.itemsVisible;
            if (i4 >= i5) {
                break;
            }
            int i6 = this.preCurrentIndex - ((i5 / 2) - i4);
            if (this.isLoop) {
                objArr[i4] = this.adapter.getItem(getLoopMappingIndex(i6));
            } else if (i6 < 0) {
                objArr[i4] = "";
            } else if (i6 > this.adapter.getItemsCount() - 1) {
                objArr[i4] = "";
            } else {
                objArr[i4] = this.adapter.getItem(i6);
            }
            i4++;
        }
        if (this.dividerType == DividerType.WRAP) {
            if (TextUtils.isEmpty(this.label)) {
                f4 = this.measuredWidth - this.maxTextWidth;
                f5 = 2.0f;
            } else {
                f4 = this.measuredWidth - this.maxTextWidth;
                f5 = 4.0f;
            }
            float f7 = (f4 / f5) - 12.0f;
            float f8 = f7 <= IGoodView.DEFAULT_TO_ALPHA ? 10.0f : f7;
            float f9 = this.measuredWidth - f8;
            float f10 = this.firstLineY;
            float f11 = f8;
            canvas.drawLine(f11, f10, f9, f10, this.paintIndicator);
            float f12 = this.secondLineY;
            canvas.drawLine(f11, f12, f9, f12, this.paintIndicator);
        } else {
            float f13 = this.firstLineY;
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, f13, this.measuredWidth, f13, this.paintIndicator);
            float f14 = this.secondLineY;
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, f14, this.measuredWidth, f14, this.paintIndicator);
        }
        if (!TextUtils.isEmpty(this.label) && this.isCenterLabel) {
            canvas.drawText(this.label, (this.measuredWidth - getTextWidth(this.paintCenterText, this.label)) - this.CENTER_CONTENT_OFFSET, this.centerY, this.paintCenterText);
        }
        for (int i7 = 0; i7 < this.itemsVisible; i7++) {
            canvas.save();
            double d4 = ((this.itemHeight * i7) - f6) / this.radius;
            float f15 = (float) (90.0d - ((d4 / 3.141592653589793d) * 180.0d));
            if (f15 >= 90.0f || f15 <= -90.0f) {
                canvas.restore();
            } else {
                float fPow = (float) Math.pow(Math.abs(f15) / 90.0f, 2.2d);
                String contentText = (this.isCenterLabel || TextUtils.isEmpty(this.label) || TextUtils.isEmpty(getContentText(objArr[i7]))) ? getContentText(objArr[i7]) : getContentText(objArr[i7]) + this.label;
                reMeasureTextSize(contentText);
                measuredCenterContentStart(contentText);
                measuredOutContentStart(contentText);
                float fCos = (float) ((this.radius - (Math.cos(d4) * this.radius)) - ((Math.sin(d4) * this.maxTextHeight) / 2.0d));
                canvas.translate(IGoodView.DEFAULT_TO_ALPHA, fCos);
                float f16 = this.firstLineY;
                if (fCos > f16 || this.maxTextHeight + fCos < f16) {
                    float f17 = this.secondLineY;
                    if (fCos > f17 || this.maxTextHeight + fCos < f17) {
                        if (fCos >= f16) {
                            int i8 = this.maxTextHeight;
                            if (i8 + fCos <= f17) {
                                canvas.drawText(contentText, this.drawCenterContentStart, i8 - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                                this.selectedItem = this.preCurrentIndex - ((this.itemsVisible / 2) - i7);
                            }
                        }
                        canvas.save();
                        canvas.clipRect(0, 0, this.measuredWidth, (int) this.itemHeight);
                        canvas.scale(1.0f, ((float) Math.sin(d4)) * SCALE_CONTENT);
                        TextPaint textPaint = this.paintOuterText;
                        int i9 = this.textXOffset;
                        textPaint.setTextSkewX((i9 == 0 ? 0 : i9 > 0 ? 1 : -1) * (f15 <= IGoodView.DEFAULT_TO_ALPHA ? 1 : -1) * DEFAULT_TEXT_TARGET_SKEWX * fPow);
                        this.paintOuterText.setAlpha((int) ((1.0f - fPow) * 255.0f));
                        canvas.drawText(contentText, this.drawOutContentStart + (this.textXOffset * fPow), this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                        canvas.restore();
                        this.paintCenterText.setTextSize(this.textSize);
                    } else {
                        canvas.save();
                        canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.measuredWidth, this.secondLineY - fCos);
                        canvas.scale(1.0f, ((float) Math.sin(d4)) * 1.0f);
                        canvas.drawText(contentText, this.drawCenterContentStart, this.maxTextHeight - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, this.secondLineY - fCos, this.measuredWidth, (int) this.itemHeight);
                        canvas.scale(1.0f, ((float) Math.sin(d4)) * SCALE_CONTENT);
                        canvas.drawText(contentText, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.measuredWidth, this.firstLineY - fCos);
                    canvas.scale(1.0f, ((float) Math.sin(d4)) * SCALE_CONTENT);
                    canvas.drawText(contentText, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(IGoodView.DEFAULT_TO_ALPHA, this.firstLineY - fCos, this.measuredWidth, (int) this.itemHeight);
                    canvas.scale(1.0f, ((float) Math.sin(d4)) * 1.0f);
                    canvas.drawText(contentText, this.drawCenterContentStart, this.maxTextHeight - this.CENTER_CONTENT_OFFSET, this.paintCenterText);
                    canvas.restore();
                }
                canvas.restore();
                this.paintCenterText.setTextSize(this.textSize);
            }
        }
    }

    public final void onItemSelected() {
        if (this.onItemSelectedListener != null) {
            postDelayed(new Runnable() { // from class: com.xuexiang.xui.widget.picker.wheelview.WheelView.1
                @Override // java.lang.Runnable
                public void run() {
                    WheelView.this.onItemSelectedListener.onItemSelected(WheelView.this.getCurrentItem());
                }
            }, 200L);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        this.widthMeasureSpec = i4;
        remeasure();
        setMeasuredDimension(this.measuredWidth, this.measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = this.gestureDetector.onTouchEvent(motionEvent);
        float f4 = (-this.initPosition) * this.itemHeight;
        float itemsCount = ((this.adapter.getItemsCount() - 1) - this.initPosition) * this.itemHeight;
        int action = motionEvent.getAction();
        boolean z3 = false;
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            cancelFuture();
            this.previousY = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.previousY - motionEvent.getRawY();
            this.previousY = motionEvent.getRawY();
            float f5 = this.totalScrollY + rawY;
            this.totalScrollY = f5;
            if (!this.isLoop) {
                float f6 = this.itemHeight;
                if ((f5 - (f6 * 0.25f) < f4 && rawY < IGoodView.DEFAULT_TO_ALPHA) || ((f6 * 0.25f) + f5 > itemsCount && rawY > IGoodView.DEFAULT_TO_ALPHA)) {
                    this.totalScrollY = f5 - rawY;
                    z3 = true;
                }
            }
        } else if (!zOnTouchEvent) {
            float y3 = motionEvent.getY();
            int i4 = this.radius;
            double dAcos = Math.acos((i4 - y3) / i4) * this.radius;
            float f7 = this.itemHeight;
            this.mOffset = (int) (((((int) ((dAcos + (f7 / 2.0f)) / f7)) - (this.itemsVisible / 2)) * f7) - (((this.totalScrollY % f7) + f7) % f7));
            if (System.currentTimeMillis() - this.startTime > 120) {
                smoothScroll(ACTION.DAGGLE);
            } else {
                smoothScroll(ACTION.CLICK);
            }
        }
        if (!z3 && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void scrollBy(float f4) {
        cancelFuture();
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new InertiaTimerTask(this, f4), 0L, 5L, TimeUnit.MILLISECONDS);
    }

    public final void setAdapter(WheelAdapter wheelAdapter) {
        this.adapter = wheelAdapter;
        remeasure();
        invalidate();
    }

    public final void setCurrentItem(int i4) {
        this.selectedItem = i4;
        this.initPosition = i4;
        this.totalScrollY = IGoodView.DEFAULT_TO_ALPHA;
        invalidate();
    }

    public final void setCyclic(boolean z3) {
        this.isLoop = z3;
    }

    public void setDividerColor(int i4) {
        this.dividerColor = i4;
        this.paintIndicator.setColor(i4);
    }

    public void setDividerType(DividerType dividerType) {
        this.dividerType = dividerType;
    }

    public void setGravity(int i4) {
        this.mGravity = i4;
    }

    public void setIsOptions(boolean z3) {
        this.isOptions = z3;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setLineSpacingMultiplier(float f4) {
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            this.lineSpacingMultiplier = f4;
            judgeLineSpace();
        }
    }

    public final void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }

    public void setTextColorCenter(int i4) {
        this.textColorCenter = i4;
        this.paintCenterText.setColor(i4);
    }

    public void setTextColorOut(int i4) {
        this.textColorOut = i4;
        this.paintOuterText.setColor(i4);
    }

    public final void setTextSize(float f4) {
        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
            int i4 = (int) (this.context.getResources().getDisplayMetrics().density * f4);
            this.textSize = i4;
            this.paintOuterText.setTextSize(i4);
            this.paintCenterText.setTextSize(this.textSize);
        }
    }

    public void setTextXOffset(int i4) {
        this.textXOffset = i4;
        if (i4 != 0) {
            this.paintCenterText.setTextScaleX(1.0f);
        }
    }

    public void setTotalScrollY(float f4) {
        this.totalScrollY = f4;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public final void setTypeface(Typeface typeface) {
        this.typeface = typeface;
        this.paintOuterText.setTypeface(typeface);
        this.paintCenterText.setTypeface(this.typeface);
    }

    public void smoothScroll(ACTION action) {
        cancelFuture();
        if (action == ACTION.FLING || action == ACTION.DAGGLE) {
            float f4 = this.totalScrollY;
            float f5 = this.itemHeight;
            int i4 = (int) (((f4 % f5) + f5) % f5);
            this.mOffset = i4;
            if (i4 > f5 / 2.0f) {
                this.mOffset = (int) (f5 - i4);
            } else {
                this.mOffset = -i4;
            }
        }
        this.mFuture = this.mExecutor.scheduleWithFixedDelay(new SmoothScrollTimerTask(this, this.mOffset), 0L, 10L, TimeUnit.MILLISECONDS);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isOptions = false;
        this.isCenterLabel = true;
        this.mExecutor = Executors.newSingleThreadScheduledExecutor();
        this.typeface = Typeface.MONOSPACE;
        this.lineSpacingMultiplier = 1.6f;
        this.itemsVisible = 11;
        this.mOffset = 0;
        this.previousY = IGoodView.DEFAULT_TO_ALPHA;
        this.startTime = 0L;
        this.mGravity = 17;
        this.drawCenterContentStart = 0;
        this.drawOutContentStart = 0;
        this.textSize = getResources().getDimensionPixelSize(C2042R.dimen.default_wheel_view_text_size);
        float f4 = getResources().getDisplayMetrics().density;
        if (f4 < 1.0f) {
            this.CENTER_CONTENT_OFFSET = 2.4f;
        } else if (1.0f <= f4 && f4 < 1.5f) {
            this.CENTER_CONTENT_OFFSET = 3.6f;
        } else if (1.5f <= f4 && f4 < 2.0f) {
            this.CENTER_CONTENT_OFFSET = 4.5f;
        } else if (2.0f <= f4 && f4 < 3.0f) {
            this.CENTER_CONTENT_OFFSET = 6.0f;
        } else if (f4 >= 3.0f) {
            this.CENTER_CONTENT_OFFSET = f4 * 2.5f;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.WheelView, 0, 0);
            this.mGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.WheelView_wv_gravity, 17);
            this.textColorOut = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.WheelView_wv_textColorOut, -5723992);
            this.textColorCenter = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.WheelView_wv_textColorCenter, -14013910);
            this.dividerColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.WheelView_wv_dividerColor, -2763307);
            this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.WheelView_wv_textSize, this.textSize);
            this.lineSpacingMultiplier = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.WheelView_wv_lineSpacingMultiplier, this.lineSpacingMultiplier);
            typedArrayObtainStyledAttributes.recycle();
        }
        judgeLineSpace();
        initLoopView(context);
    }
}
