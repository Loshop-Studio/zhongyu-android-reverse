package com.xuexiang.xui.widget.imageview.preview;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.widget.imageview.preview.enitity.IPreviewInfo;
import com.xuexiang.xui.widget.imageview.preview.loader.OnVideoClickListener;
import com.xuexiang.xui.widget.imageview.preview.p072ui.BasePhotoFragment;
import com.xuexiang.xui.widget.imageview.preview.p072ui.PreviewActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class PreviewBuilder {
    private Class className;
    private Intent intent = new Intent();
    private Activity mContext;
    private OnVideoClickListener videoClickListener;

    public enum IndicatorType {
        Dot,
        Number
    }

    private PreviewBuilder(Activity activity) {
        this.mContext = activity;
    }

    public static PreviewBuilder from(Activity activity) {
        return new PreviewBuilder(activity);
    }

    public PreviewBuilder setCurrentIndex(int i4) {
        this.intent.putExtra(PreviewActivity.KEY_POSITION, i4);
        return this;
    }

    public PreviewBuilder setDrag(boolean z3) {
        this.intent.putExtra(BasePhotoFragment.KEY_DRAG, z3);
        return this;
    }

    public PreviewBuilder setDuration(int i4) {
        this.intent.putExtra(PreviewActivity.KEY_DURATION, i4);
        return this;
    }

    public PreviewBuilder setFullscreen(boolean z3) {
        this.intent.putExtra(PreviewActivity.KEY_IS_FULLSCREEN, z3);
        return this;
    }

    public <E extends IPreviewInfo> PreviewBuilder setImg(E e4) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(e4);
        this.intent.putParcelableArrayListExtra(PreviewActivity.KEY_IMAGE_PATHS, arrayList);
        return this;
    }

    public <T extends IPreviewInfo> PreviewBuilder setImgs(List<T> list) {
        this.intent.putParcelableArrayListExtra(PreviewActivity.KEY_IMAGE_PATHS, new ArrayList<>(list));
        return this;
    }

    public PreviewBuilder setOnVideoPlayerListener(OnVideoClickListener onVideoClickListener) {
        this.videoClickListener = onVideoClickListener;
        return this;
    }

    public PreviewBuilder setPhotoFragment(Class<? extends BasePhotoFragment> cls) {
        this.intent.putExtra(PreviewActivity.KEY_CLASSNAME, cls);
        return this;
    }

    public PreviewBuilder setProgressColor(int i4) {
        this.intent.putExtra(BasePhotoFragment.KEY_PROGRESS_COLOR, i4);
        return this;
    }

    public PreviewBuilder setSingleFling(boolean z3) {
        this.intent.putExtra(BasePhotoFragment.KEY_SING_FILING, z3);
        return this;
    }

    public PreviewBuilder setSingleShowType(boolean z3) {
        this.intent.putExtra(PreviewActivity.KEY_IS_SHOW, z3);
        return this;
    }

    public PreviewBuilder setType(IndicatorType indicatorType) {
        this.intent.putExtra(PreviewActivity.KEY_TYPE, indicatorType);
        return this;
    }

    public void start() {
        Class<?> cls = this.className;
        if (cls == null) {
            this.intent.setClass(this.mContext, PreviewActivity.class);
        } else {
            this.intent.setClass(this.mContext, cls);
        }
        BasePhotoFragment.listener = this.videoClickListener;
        this.mContext.startActivity(this.intent);
        this.mContext.overridePendingTransition(0, 0);
        this.intent = null;
        this.mContext = null;
    }

    /* renamed from: to */
    public PreviewBuilder m7969to(Class cls) {
        this.className = cls;
        this.intent.setClass(this.mContext, cls);
        return this;
    }

    public static PreviewBuilder from(Fragment fragment) {
        return new PreviewBuilder(fragment.getActivity());
    }

    public PreviewBuilder setDrag(boolean z3, float f4) {
        this.intent.putExtra(BasePhotoFragment.KEY_DRAG, z3);
        this.intent.putExtra(BasePhotoFragment.KEY_SENSITIVITY, f4);
        return this;
    }
}
