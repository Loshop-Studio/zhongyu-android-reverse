package com.xuexiang.xui.widget.banner.widget.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import com.xuexiang.xui.widget.imageview.ImageLoader;

/* loaded from: classes.dex */
public class SimpleGuideBanner extends BaseIndicatorBanner<Object, SimpleGuideBanner> {
    private OnJumpClickListener onJumpClickListener;

    public interface OnJumpClickListener {
        void onJumpClick();
    }

    public SimpleGuideBanner(Context context) {
        super(context);
        onCreateBanner();
    }

    protected void onCreateBanner() {
        setBarShowWhenLast(true);
        setAutoScrollEnable(false);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public View onCreateItemView(int i4) {
        View viewInflate = View.inflate(this.mContext, C2042R.layout.xui_adapter_simple_guide, null);
        ImageView imageView = (ImageView) viewInflate.findViewById(C2042R.id.f9656iv);
        TextView textView = (TextView) viewInflate.findViewById(C2042R.id.tv_jump);
        TextView textView2 = (TextView) viewInflate.findViewById(C2042R.id.tv_start);
        Object obj = this.mDatas.get(i4);
        textView.setVisibility(i4 == 0 ? 0 : 8);
        textView2.setVisibility(i4 != this.mDatas.size() + (-1) ? 8 : 0);
        ImageLoader.get().loadImage(imageView, obj);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SimpleGuideBanner.this.onJumpClickListener != null) {
                    SimpleGuideBanner.this.onJumpClickListener.onJumpClick();
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SimpleGuideBanner.this.onJumpClickListener != null) {
                    SimpleGuideBanner.this.onJumpClickListener.onJumpClick();
                }
            }
        });
        return viewInflate;
    }

    public void setOnJumpClickListener(OnJumpClickListener onJumpClickListener) {
        this.onJumpClickListener = onJumpClickListener;
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onCreateBanner();
    }

    public SimpleGuideBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        onCreateBanner();
    }
}
