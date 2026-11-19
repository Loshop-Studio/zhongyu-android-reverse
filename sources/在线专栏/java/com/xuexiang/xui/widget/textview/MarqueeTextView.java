package com.xuexiang.xui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.textview.marqueen.DisplayEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MarqueeTextView extends AppCompatTextView {
    private static final int REDRAW_TEXT = 1;
    private int mBaseline;
    private int mCurrentIndex;
    private float mCurrentPosition;
    private List<DisplayEntity> mDisplayList;
    private float mDisplayTextWidth;
    private Handler mHandler;
    private boolean mIsAutoDisplay;
    private boolean mIsAutoFit;
    private boolean mIsRolling;
    private final Object mLock;
    private OnMarqueeListener mOnMarqueeListener;
    private int mScrollWidth;
    private DisplayEntity mShowDisplayEntity;
    private int mSpeed;
    private boolean mStopMarquee;

    public interface OnMarqueeListener {
        List<DisplayEntity> onMarqueeFinished(List<DisplayEntity> list);

        DisplayEntity onStartMarquee(DisplayEntity displayEntity, int i4);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDisplayList = new ArrayList();
        this.mCurrentIndex = 0;
        this.mSpeed = 3;
        this.mIsRolling = false;
        this.mLock = new Object();
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.textview.MarqueeTextView.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1) {
                    if (MarqueeTextView.this.mCurrentPosition < (-MarqueeTextView.this.mDisplayTextWidth)) {
                        MarqueeTextView.this.rollNextDisplay();
                    } else {
                        MarqueeTextView.this.mCurrentPosition -= MarqueeTextView.this.mSpeed;
                        MarqueeTextView.this.reDraw(30);
                    }
                }
                return true;
            }
        });
        init(attributeSet);
    }

    private boolean addEntity(DisplayEntity displayEntity) {
        boolean z3;
        if (TextUtils.isEmpty(displayEntity.getID())) {
            return this.mDisplayList.add(displayEntity);
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            z3 = true;
            if (i4 >= this.mDisplayList.size()) {
                z3 = false;
                break;
            }
            if (displayEntity.getID().equals(this.mDisplayList.get(i4).getID())) {
                this.mDisplayList.set(i4, displayEntity);
                z4 = true;
                break;
            }
            i4++;
        }
        return !z4 ? this.mDisplayList.add(displayEntity) : z3;
    }

    private int calculateBaseLine() {
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        return ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
    }

    private void handleRollFinished() {
        if (this.mOnMarqueeListener == null || onMarqueeFinished()) {
            initRoll();
        } else {
            this.mIsRolling = false;
        }
    }

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2042R.styleable.MarqueeTextView);
        this.mIsAutoFit = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MarqueeTextView_mtv_isAutoFit, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MarqueeTextView_mtv_isAutoDisplay, false);
        this.mIsAutoDisplay = z3;
        if (z3) {
            setVisibility(8);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initRoll() {
        List<DisplayEntity> list = this.mDisplayList;
        if (list == null || list.size() <= 0) {
            if (this.mIsAutoDisplay) {
                setVisibility(8);
            }
            this.mIsRolling = false;
        } else {
            if (this.mIsAutoDisplay) {
                setVisibility(0);
            }
            this.mCurrentIndex = 0;
            updateDisplayText(getDisplayItem(0));
        }
    }

    private boolean isRollingDisplayEntity(DisplayEntity displayEntity) {
        if (!this.mIsRolling || this.mShowDisplayEntity == null) {
            return false;
        }
        return TextUtils.isEmpty(displayEntity.getID()) ? displayEntity.getMessage().equals(this.mShowDisplayEntity.getMessage()) : displayEntity.getID().equals(this.mShowDisplayEntity.getID());
    }

    private boolean isShowDisplayEntityValid() {
        DisplayEntity displayEntity = this.mShowDisplayEntity;
        return displayEntity != null && displayEntity.isValid();
    }

    private boolean onMarqueeFinished() {
        List<DisplayEntity> listOnMarqueeFinished = this.mOnMarqueeListener.onMarqueeFinished(this.mDisplayList);
        if (listOnMarqueeFinished == null) {
            return false;
        }
        this.mDisplayList = listOnMarqueeFinished;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reDraw(int i4) {
        Handler handler;
        invalidate();
        if (this.mStopMarquee || (handler = this.mHandler) == null) {
            this.mIsRolling = false;
        } else {
            handler.sendEmptyMessageDelayed(1, i4);
        }
    }

    private boolean removeByDisplayEntity(DisplayEntity displayEntity) {
        if (getDisplaySize() <= 0) {
            return false;
        }
        Iterator<DisplayEntity> it = this.mDisplayList.iterator();
        synchronized (this.mLock) {
            while (it.hasNext()) {
                DisplayEntity next = it.next();
                if (TextUtils.isEmpty(displayEntity.getID())) {
                    if (displayEntity.getMessage().equals(next.getMessage())) {
                        it.remove();
                        return true;
                    }
                } else if (displayEntity.getID().equals(next.getID())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private void rollDisplayByIndex(int i4) {
        if (i4 <= this.mDisplayList.size() - 1) {
            updateDisplayText(getDisplayItem(i4));
        } else {
            handleRollFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rollNextDisplay() {
        int i4 = this.mCurrentIndex + 1;
        this.mCurrentIndex = i4;
        rollDisplayByIndex(i4);
    }

    private void showDisplayEntity(DisplayEntity displayEntity) {
        this.mShowDisplayEntity = displayEntity;
        this.mDisplayTextWidth = getPaint().measureText(this.mShowDisplayEntity.toString());
        this.mCurrentPosition = this.mScrollWidth;
        if (this.mHandler.hasMessages(1)) {
            this.mHandler.removeMessages(1);
        }
        if (this.mStopMarquee) {
            this.mIsRolling = false;
        } else {
            this.mHandler.sendEmptyMessageDelayed(1, 500L);
        }
    }

    private void updateDisplayText(DisplayEntity displayEntity) {
        if (displayEntity == null) {
            rollNextDisplay();
            return;
        }
        OnMarqueeListener onMarqueeListener = this.mOnMarqueeListener;
        if (onMarqueeListener != null) {
            displayEntity = onMarqueeListener.onStartMarquee(displayEntity, this.mCurrentIndex);
            if (displayEntity == null || !displayEntity.isValid()) {
                if (this.mCurrentIndex <= this.mDisplayList.size() - 1) {
                    this.mDisplayList.remove(this.mCurrentIndex);
                }
                rollDisplayByIndex(this.mCurrentIndex);
                return;
            }
            this.mDisplayList.set(this.mCurrentIndex, displayEntity);
        }
        showDisplayEntity(displayEntity);
    }

    public boolean addDisplayEntity(DisplayEntity displayEntity) {
        if (displayEntity == null || !displayEntity.isValid()) {
            return false;
        }
        if (this.mDisplayList == null) {
            this.mDisplayList = new ArrayList();
        }
        boolean zAddEntity = addEntity(displayEntity);
        if (this.mIsRolling) {
            return zAddEntity;
        }
        startRoll();
        return zAddEntity;
    }

    public boolean addDisplayString(String str) {
        return addDisplayEntity(new DisplayEntity(str));
    }

    public void clear() {
        this.mIsRolling = false;
        List<DisplayEntity> list = this.mDisplayList;
        if (list != null && list.size() > 0) {
            this.mDisplayList.clear();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.mIsAutoDisplay) {
            setVisibility(8);
        }
    }

    public int getCurrentIndex() {
        return this.mCurrentIndex;
    }

    public float getCurrentPosition() {
        return this.mCurrentPosition;
    }

    public DisplayEntity getDisplayItem(int i4) {
        if (this.mDisplayList == null || i4 < 0 || i4 > r0.size() - 1) {
            return null;
        }
        return this.mDisplayList.get(i4);
    }

    public List<DisplayEntity> getDisplayList() {
        return this.mDisplayList;
    }

    public int getDisplaySize() {
        List<DisplayEntity> list = this.mDisplayList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getScrollWidth() {
        return this.mScrollWidth;
    }

    public DisplayEntity getShowDisplayEntity() {
        return this.mShowDisplayEntity;
    }

    public int getSpeed() {
        return this.mSpeed;
    }

    public boolean hasDisplayMessage() {
        return getDisplaySize() > 0;
    }

    public boolean isRolling() {
        return this.mIsRolling;
    }

    public MarqueeTextView measureView() {
        this.mCurrentPosition = getWidth();
        this.mScrollWidth = getWidth();
        this.mBaseline = calculateBaseLine();
        return this;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        this.mStopMarquee = false;
        if (!isShowDisplayEntityValid()) {
            this.mIsRolling = false;
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.mStopMarquee = true;
        this.mIsRolling = false;
        if (this.mHandler.hasMessages(1)) {
            this.mHandler.removeMessages(1);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isShowDisplayEntityValid()) {
            this.mBaseline = calculateBaseLine();
            canvas.drawText(this.mShowDisplayEntity.toString(), this.mCurrentPosition, this.mBaseline, getPaint());
            this.mIsRolling = true;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (this.mIsAutoFit) {
            measureView();
        }
    }

    public boolean removeDisplayEntity(DisplayEntity displayEntity) {
        if (displayEntity == null || !displayEntity.isValid()) {
            return false;
        }
        if (!isRollingDisplayEntity(displayEntity)) {
            return removeByDisplayEntity(displayEntity);
        }
        if (this.mCurrentIndex > this.mDisplayList.size() - 1) {
            rollDisplayByIndex(this.mCurrentIndex);
            return false;
        }
        this.mDisplayList.remove(this.mCurrentIndex);
        rollDisplayByIndex(this.mCurrentIndex);
        return true;
    }

    public boolean removeDisplayString(String str) {
        return removeDisplayEntity(new DisplayEntity(str));
    }

    public MarqueeTextView setCurrentPosition(float f4) {
        this.mCurrentPosition = f4;
        return this;
    }

    public MarqueeTextView setDisplayList(List<DisplayEntity> list) {
        if (list != null && list.size() > 0) {
            this.mDisplayList.clear();
            this.mDisplayList.addAll(list);
        }
        return this;
    }

    public MarqueeTextView setDisplaySimpleList(List<String> list) {
        if (list != null && list.size() > 0) {
            this.mDisplayList.clear();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.mDisplayList.add(new DisplayEntity(str));
                }
            }
        }
        return this;
    }

    public MarqueeTextView setOnMarqueeListener(OnMarqueeListener onMarqueeListener) {
        this.mOnMarqueeListener = onMarqueeListener;
        return this;
    }

    public MarqueeTextView setScrollWidth(int i4) {
        this.mScrollWidth = i4;
        return this;
    }

    public MarqueeTextView setSpeed(int i4) {
        this.mSpeed = i4;
        return this;
    }

    public MarqueeTextView setViewWidth(int i4) {
        this.mCurrentPosition = i4;
        this.mScrollWidth = i4;
        return this;
    }

    public MarqueeTextView startRoll(List<DisplayEntity> list) {
        return setDisplayList(list).startRoll();
    }

    public MarqueeTextView startSimpleRoll(List<String> list) {
        return setDisplaySimpleList(list).startRoll();
    }

    public MarqueeTextView startRoll() {
        initRoll();
        return this;
    }
}
