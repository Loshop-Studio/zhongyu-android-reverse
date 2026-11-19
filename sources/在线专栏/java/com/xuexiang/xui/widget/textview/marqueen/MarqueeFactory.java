package com.xuexiang.xui.widget.textview.marqueen;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MarqueeFactory<T extends View, E> {
    private boolean isOnItemClickRegistered;
    protected Context mContext;
    protected List<E> mDatas;
    private MarqueeView mMarqueeView;
    protected OnItemClickListener<T, E> mOnItemClickListener;
    protected List<T> mViews;

    public interface OnItemClickListener<V extends View, E> {
        void onItemClick(View view, ViewHolder<V, E> viewHolder);
    }

    public static class ViewHolder<V extends View, P> {
        public P mData;
        public int mPosition;
        public V mView;

        public ViewHolder(V v3, P p3, int i4) {
            this.mView = v3;
            this.mData = p3;
            this.mPosition = i4;
        }

        public P getData() {
            return this.mData;
        }

        public int getPosition() {
            return this.mPosition;
        }

        public V getView() {
            return this.mView;
        }

        public ViewHolder setData(P p3) {
            this.mData = p3;
            return this;
        }

        public ViewHolder setPosition(int i4) {
            this.mPosition = i4;
            return this;
        }

        public ViewHolder setView(V v3) {
            this.mView = v3;
            return this;
        }
    }

    public MarqueeFactory(Context context) {
        this.mContext = context;
    }

    private void registerOnItemClick() {
        if (this.isOnItemClickRegistered || this.mOnItemClickListener == null || this.mDatas == null) {
            return;
        }
        for (int i4 = 0; i4 < this.mDatas.size(); i4++) {
            T t3 = this.mViews.get(i4);
            final ViewHolder viewHolder = new ViewHolder(t3, this.mDatas.get(i4), i4);
            t3.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.marqueen.MarqueeFactory.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MarqueeFactory.this.mOnItemClickListener.onItemClick(view, viewHolder);
                }
            });
        }
        this.isOnItemClickRegistered = true;
    }

    public abstract T generateMarqueeItemView(E e4);

    public List<T> getMarqueeViews() {
        return this.mViews;
    }

    public void setAttachedToMarqueeView(MarqueeView marqueeView) {
        this.mMarqueeView = marqueeView;
    }

    public void setData(List<E> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.mDatas = list;
        this.mViews = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.mViews.add(generateMarqueeItemView(list.get(i4)));
        }
        registerOnItemClick();
        MarqueeView marqueeView = this.mMarqueeView;
        if (marqueeView != null) {
            marqueeView.setMarqueeFactory(this);
        }
    }

    public void setOnItemClickListener(OnItemClickListener<T, E> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        registerOnItemClick();
    }
}
