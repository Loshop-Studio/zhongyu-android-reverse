package com.xuexiang.xui.widget.guidview;

import android.content.res.Resources;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class GuideCaseQueue implements DismissListener {
    private OnCompleteListener mCompleteListener;
    private GuideCaseView mCurrent;
    private Queue<GuideCaseView> mQueue = new LinkedList();
    private DismissListener mCurrentOriginalDismissListener = null;

    public GuideCaseQueue add(GuideCaseView guideCaseView) {
        this.mQueue.add(guideCaseView);
        return this;
    }

    public void cancel(boolean z3) throws Resources.NotFoundException {
        GuideCaseView guideCaseView;
        if (z3 && (guideCaseView = this.mCurrent) != null) {
            guideCaseView.hide();
        }
        if (this.mQueue.isEmpty()) {
            return;
        }
        this.mQueue.clear();
    }

    @Override // com.xuexiang.xui.widget.guidview.DismissListener
    public void onDismiss(String str) throws Resources.NotFoundException {
        DismissListener dismissListener = this.mCurrentOriginalDismissListener;
        if (dismissListener != null) {
            dismissListener.onDismiss(str);
        }
        show();
    }

    @Override // com.xuexiang.xui.widget.guidview.DismissListener
    public void onSkipped(String str) throws Resources.NotFoundException {
        DismissListener dismissListener = this.mCurrentOriginalDismissListener;
        if (dismissListener != null) {
            dismissListener.onSkipped(str);
        }
        show();
    }

    public GuideCaseQueue setCompleteListener(OnCompleteListener onCompleteListener) {
        this.mCompleteListener = onCompleteListener;
        return this;
    }

    public void show() throws Resources.NotFoundException {
        if (this.mQueue.isEmpty()) {
            OnCompleteListener onCompleteListener = this.mCompleteListener;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete();
                return;
            }
            return;
        }
        GuideCaseView guideCaseViewPoll = this.mQueue.poll();
        this.mCurrent = guideCaseViewPoll;
        this.mCurrentOriginalDismissListener = guideCaseViewPoll.getDismissListener();
        this.mCurrent.setDismissListener(this);
        this.mCurrent.show();
    }
}
