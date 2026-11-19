package com.zykj.mistake.feature.notebook.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import coil3.C3333r;
import com.zykj.mistake.R;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.widget.ResizableImageView;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.AbstractC6534h;
import p154s.C6529c;
import p154s.C6532f;
import p154s.C6537k;

/* renamed from: com.zykj.mistake.feature.notebook.detail.d */
/* loaded from: classes3.dex */
public final class C4779d extends FrameLayout {

    /* renamed from: a */
    public final ResizableImageView f6946a;

    /* renamed from: b */
    public final ResizableImageView f6947b;

    /* renamed from: c */
    public final LinearLayout f6948c;

    /* renamed from: d */
    public String f6949d;

    /* renamed from: e */
    public String f6950e;

    /* renamed from: f */
    public boolean f6951f;

    /* renamed from: g */
    public C6537k f6952g;

    /* renamed from: h */
    public C6537k f6953h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4779d(Context context) {
        super(context);
        AbstractC5830k.m5330g(context, "context");
        ResizableImageView resizableImageViewM4178a = m4178a(R.id.iv_answer);
        this.f6946a = resizableImageViewM4178a;
        ResizableImageView resizableImageViewM4178a2 = m4178a(R.id.iv_comment);
        this.f6947b = resizableImageViewM4178a2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (82 * linearLayout.getContext().getResources().getDisplayMetrics().density)));
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageResource(R.drawable.ic_answer_load_error);
        float f = 40;
        imageView.setLayoutParams(new LinearLayout.LayoutParams((int) (imageView.getContext().getResources().getDisplayMetrics().density * f), (int) (f * imageView.getContext().getResources().getDisplayMetrics().density)));
        linearLayout.addView(imageView);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText("加载失败");
        textView.setTextColor(Color.parseColor("#999999"));
        textView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) (8 * textView.getContext().getResources().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        this.f6948c = linearLayout;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(resizableImageViewM4178a);
        addView(resizableImageViewM4178a2);
        addView(linearLayout);
    }

    /* renamed from: a */
    public final ResizableImageView m4178a(int i) {
        Context context = getContext();
        AbstractC5830k.m5329f(context, "getContext(...)");
        ResizableImageView resizableImageView = new ResizableImageView(context);
        resizableImageView.setId(i);
        resizableImageView.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        resizableImageView.setLayoutParams(layoutParams);
        return resizableImageView;
    }

    /* renamed from: b */
    public final C6537k m4179b(ResizableImageView resizableImageView, String str, boolean z8, C4765b c4765b, C4765b c4765b2) {
        resizableImageView.setTag(str);
        if (str == null || str.length() == 0) {
            resizableImageView.setVisibility(8);
            resizableImageView.setImageDrawable(null);
            return null;
        }
        resizableImageView.setVisibility(0);
        resizableImageView.setImageDrawable(null);
        Context context = getContext();
        AbstractC5830k.m5329f(context, "getContext(...)");
        C6529c c6529c = new C6529c(context);
        c6529c.f10820c = str;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        AbstractC6534h.m6185a(c6529c);
        c6529c.f10821d = new C4772c(resizableImageView, str, z8, c4765b, resizableImageView, str, c4765b2, z8);
        C6532f c6532fM6182a = c6529c.m6182a();
        C5100e c5100e = C5100e.f8035a;
        Context context2 = getContext();
        AbstractC5830k.m5329f(context2, "getContext(...)");
        return ((C3333r) c5100e.m4462a(context2)).m2274a(c6532fM6182a);
    }
}
