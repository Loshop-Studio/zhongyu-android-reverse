package com.friday.user.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AppUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.user.R$color;
import com.friday.user.R$id;
import com.friday.user.R$layout;
import com.friday.user.R$mipmap;
import kotlin.jvm.internal.AbstractC9979u;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class UserMenuAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    /* renamed from: a */
    public int f10592a;

    public UserMenuAdapter() {
        super(R$layout.user_menu, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, String item) {
        int iM26580a;
        String str;
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        View view = holder.getView(R$id.mContainer);
        TextView textView = (TextView) holder.getView(R$id.tv_name);
        TextView textView2 = (TextView) holder.getView(R$id.tv_info);
        ImageView imageView = (ImageView) holder.getView(R$id.iv_icon);
        ImageView imageView2 = (ImageView) holder.getView(R$id.next_step);
        int itemPosition = getItemPosition(item);
        if (this.f10592a == itemPosition) {
            textView.setTextColor(AbstractC11958b.m26580a(R$color.colorAccent));
            iM26580a = AbstractC11958b.m26580a(R$color.select);
        } else {
            textView.setTextColor(AbstractC11958b.m26580a(R$color.app_l_dark));
            iM26580a = AbstractC11958b.m26580a(R$color.transparent);
        }
        view.setBackgroundColor(iM26580a);
        if (itemPosition == 1) {
            str = ExifInterface.GPS_MEASUREMENT_INTERRUPTED + AppUtils.getAppVersionName();
        } else {
            str = "";
        }
        textView2.setText(str);
        textView.setText(item);
        if (itemPosition == 0) {
            imageView.setImageResource(R$mipmap.icon_person_info);
            return;
        }
        if (itemPosition == 1) {
            imageView.setImageResource(R$mipmap.icon_about);
            return;
        }
        if (itemPosition == 2) {
            imageView.setImageResource(R$mipmap.icon_help);
            return;
        }
        if (itemPosition == 3) {
            imageView.setImageResource(R$mipmap.icon_clear);
            imageView2.setVisibility(8);
        } else {
            if (itemPosition != 4) {
                return;
            }
            imageView.setImageResource(R$mipmap.icon_quit);
            imageView2.setVisibility(8);
        }
    }

    /* renamed from: j */
    public final void m7751j(int i10) {
        this.f10592a = i10;
        notifyDataSetChanged();
    }
}
