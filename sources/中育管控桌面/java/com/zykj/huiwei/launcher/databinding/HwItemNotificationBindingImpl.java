package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.zykj.huiwei.launcher.bean.resp.MessageInfo;
import com.zykj.huiwei.launcher.bean.resp.SenderInfo;
import p078i4.AbstractC6538h;

/* loaded from: classes4.dex */
public class HwItemNotificationBindingImpl extends HwItemNotificationBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    public HwItemNotificationBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j6;
        String str;
        String creationTime;
        String title;
        String str2;
        boolean zIsRead;
        SenderInfo senderInfo;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        MessageInfo messageInfo = this.mMessageInfo;
        View.OnClickListener onClickListener = this.mClickListener;
        long j7 = j6 & 5;
        String picture = null;
        if (j7 != 0) {
            if (messageInfo != null) {
                creationTime = messageInfo.getCreationTime();
                title = messageInfo.getTitle();
                zIsRead = messageInfo.isRead();
                senderInfo = messageInfo.getSenderInfo();
            } else {
                zIsRead = false;
                senderInfo = null;
                creationTime = null;
                title = null;
            }
            if (j7 != 0) {
                j6 |= zIsRead ? 80L : 40L;
            }
            str = zIsRead ? "#CECECE" : "#333333";
            str2 = zIsRead ? "#CECECE" : "#999999";
            if (senderInfo != null) {
                picture = senderInfo.getPicture();
            }
        } else {
            str = null;
            creationTime = null;
            title = null;
            str2 = null;
        }
        long j8 = 6 & j6;
        if ((j6 & 5) != 0) {
            AbstractC6538h.m7319b(this.ivAvatar, picture);
            TextViewBindingAdapter.setText(this.tvContent, creationTime);
            AbstractC6538h.m7321d(this.tvContent, str2);
            TextViewBindingAdapter.setText(this.tvTitle, title);
            AbstractC6538h.m7321d(this.tvTitle, str);
        }
        if (j8 != 0) {
            this.mboundView0.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        return false;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwItemNotificationBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwItemNotificationBinding
    public void setMessageInfo(@Nullable MessageInfo messageInfo) {
        this.mMessageInfo = messageInfo;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(5);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (5 == i6) {
            setMessageInfo((MessageInfo) obj);
            return true;
        }
        if (2 != i6) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    private HwItemNotificationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ShapeableImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.ivAvatar.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.tvContent.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
