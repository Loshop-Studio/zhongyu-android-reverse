package com.zykj.huiwei.launcher.databinding;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.zykj.huiwei.launcher.bean.HomeTime;
import com.zykj.huiwei.launcher.bean.resp.WeatherCityBean;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.proto.C6069g;
import com.zykj.huiwei.launcher.proto.C6075m;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;

/* loaded from: classes4.dex */
public class HwIncludeHomeTitleBindingImpl extends HwIncludeHomeTitleBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    public HwIncludeHomeTitleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 21, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmIsMsgDotVisible(LiveData<Boolean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeVmIsShowWeather(LiveData<Boolean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeVmShowHomeTime(LiveData<HomeTime> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeVmStudentInfo(LiveData<C6069g> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeVmUserCacheBean(LiveData<C6075m> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeVmWeatherAfterTomorrow(LiveData<WeatherCityBean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeVmWeatherLocation(LiveData<String> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeVmWeatherToady(LiveData<WeatherCityBean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeVmWeatherTomorrow(LiveData<WeatherCityBean> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.databinding.HwIncludeHomeTitleBindingImpl.executeBindings():void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/databinding/HwIncludeHomeTitleBindingImpl.smali:930
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
            this.mDirtyFlags = PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        switch (i6) {
            case 0:
                return onChangeVmIsShowWeather((LiveData) obj, i7);
            case 1:
                return onChangeVmStudentInfo((LiveData) obj, i7);
            case 2:
                return onChangeVmShowHomeTime((LiveData) obj, i7);
            case 3:
                return onChangeVmUserCacheBean((LiveData) obj, i7);
            case 4:
                return onChangeVmWeatherAfterTomorrow((LiveData) obj, i7);
            case 5:
                return onChangeVmIsMsgDotVisible((LiveData) obj, i7);
            case 6:
                return onChangeVmWeatherTomorrow((LiveData) obj, i7);
            case 7:
                return onChangeVmWeatherLocation((LiveData) obj, i7);
            case 8:
                return onChangeVmWeatherToady((LiveData) obj, i7);
            default:
                return false;
        }
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeTitleBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((HomeViewModel) obj);
            return true;
        }
        if (2 != i6) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeTitleBinding
    public void setVm(@Nullable HomeViewModel homeViewModel) {
        this.mVm = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwIncludeHomeTitleBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 9, (View) objArr[4], (Group) objArr[3], (AppCompatImageView) objArr[5], (View) objArr[8], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[12], (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[19], (TextView) objArr[10], (TextView) objArr[1], (TextView) objArr[2], (NoPaddingTextView) objArr[6], (TextView) objArr[9], (TextView) objArr[13], (TextView) objArr[17], (TextView) objArr[20], (NoPaddingTextView) objArr[0], (TextView) objArr[14], (TextView) objArr[15], (TextView) objArr[18], (Group) objArr[11]);
        this.mDirtyFlags = -1L;
        this.clickUserInfo.setTag(null);
        this.groupInfo.setTag(null);
        this.ivAvatar.setTag(null);
        this.ivDot.setTag(null);
        this.ivEnvelope.setTag(null);
        this.ivWeather.setTag(null);
        this.ivWeather2.setTag(null);
        this.ivWeather3.setTag(null);
        this.tvClass.setTag(null);
        this.tvDate.setTag(null);
        this.tvLocation.setTag(null);
        this.tvName.setTag(null);
        this.tvStudyNo.setTag(null);
        this.tvTemp.setTag(null);
        this.tvTemp2.setTag(null);
        this.tvTemp3.setTag(null);
        this.tvTime.setTag(null);
        this.tvWeather.setTag(null);
        this.tvWeek2.setTag(null);
        this.tvWeek3.setTag(null);
        this.weatherGroup.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
