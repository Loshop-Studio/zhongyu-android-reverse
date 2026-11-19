package com.friday.lecture.floatwindow.homework;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.activity.PusherService;
import com.friday.common.entity.EventBusKey;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.floatwindow.homework.HomeworkLayout;
import com.google.android.material.tabs.TabLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.xuexiang.xui.widget.imageview.crop.CropImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p111d3.C8925a;
import p215k2.AbstractC9796n;
import p215k2.AbstractC9804v;
import p215k2.C9793k;
import p215k2.C9800r;
import p219k6.C9824f;
import p235l6.AbstractC10150d;
import p304q6.InterfaceC10752l;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.C11157r0;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HomeworkLayout extends FrameLayout {

    /* renamed from: c */
    public boolean f8731c;

    /* renamed from: d */
    public boolean f8732d;

    /* renamed from: e */
    public CropImageView f8733e;

    /* renamed from: f */
    public ConstraintLayout f8734f;

    /* renamed from: g */
    public ImageView f8735g;

    /* renamed from: h */
    public ImageView f8736h;

    /* renamed from: i */
    public Bitmap f8737i;

    /* renamed from: j */
    public ImageView f8738j;

    /* renamed from: k */
    public ImageView f8739k;

    /* renamed from: l */
    public ImageView f8740l;

    /* renamed from: m */
    public ImageView f8741m;

    /* renamed from: n */
    public ImageView f8742n;

    /* renamed from: o */
    public Group f8743o;

    /* renamed from: p */
    public TabLayout f8744p;

    /* renamed from: q */
    public View f8745q;

    /* renamed from: r */
    public View f8746r;

    /* renamed from: s */
    public ImageView f8747s;

    /* renamed from: t */
    public CardView f8748t;

    /* renamed from: u */
    public TextView f8749u;

    /* renamed from: v */
    public TextView f8750v;

    /* renamed from: w */
    public TextView f8751w;

    /* renamed from: x */
    public int f8752x;

    /* renamed from: y */
    public int f8753y;

    /* renamed from: com.friday.lecture.floatwindow.homework.HomeworkLayout$a */
    public static final class C6145a implements TabLayout.OnTabSelectedListener {
        public C6145a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                HomeworkLayout homeworkLayout = HomeworkLayout.this;
                if (tab.getPosition() == 0) {
                    View view = homeworkLayout.f8745q;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = homeworkLayout.f8746r;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    homeworkLayout.f8731c = true;
                    return;
                }
                View view3 = homeworkLayout.f8745q;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view4 = homeworkLayout.f8746r;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                homeworkLayout.f8731c = false;
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.friday.lecture.floatwindow.homework.HomeworkLayout$b */
    public static final class C6146b implements PermissionUtils.SimpleCallback {
        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public void onDenied() {
            ToastUtils.showShort("没有拍照权限", new Object[0]);
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public void onGranted() {
            C6148b.f8768d.m6626a().m6623g();
            AbstractC9796n.f22990a.m19794f(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeworkLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f8731c = true;
        this.f8732d = true;
        m6610A();
        this.f8752x = 4;
        this.f8753y = 1;
    }

    /* renamed from: B */
    public static final void m6572B(HomeworkLayout homeworkLayout, TextView textView, View view) {
        int i10 = homeworkLayout.f8752x;
        if (3 > i10 || i10 >= 9) {
            return;
        }
        int i11 = i10 - 1;
        homeworkLayout.f8752x = i11;
        textView.setText(String.valueOf(i11));
    }

    /* renamed from: C */
    public static final void m6573C(HomeworkLayout homeworkLayout, TextView textView, View view) {
        int i10 = homeworkLayout.f8752x;
        if (2 > i10 || i10 >= 8) {
            return;
        }
        int i11 = i10 + 1;
        homeworkLayout.f8752x = i11;
        textView.setText(String.valueOf(i11));
    }

    /* renamed from: D */
    public static final void m6574D(HomeworkLayout homeworkLayout, View view) {
        view.setSelected(true);
        TextView textView = homeworkLayout.f8750v;
        if (textView != null) {
            textView.setSelected(false);
        }
        homeworkLayout.f8732d = true;
    }

    /* renamed from: E */
    public static final void m6575E(HomeworkLayout homeworkLayout, View view) {
        view.setSelected(true);
        TextView textView = homeworkLayout.f8749u;
        if (textView != null) {
            textView.setSelected(false);
        }
        homeworkLayout.f8732d = false;
    }

    /* renamed from: F */
    public static final void m6576F(View view) {
        C8925a.f20887a.m17517a();
    }

    /* renamed from: G */
    public static final void m6577G(HomeworkLayout homeworkLayout, View view) {
        homeworkLayout.m6611x();
        AbstractC9804v.f23002a.m19815a("Test");
    }

    /* renamed from: H */
    public static final void m6578H(HomeworkLayout homeworkLayout, TextView textView, View view) {
        int i10 = homeworkLayout.f8753y;
        if (2 > i10 || i10 >= 11) {
            return;
        }
        int i11 = i10 - 1;
        homeworkLayout.f8753y = i11;
        textView.setText(String.valueOf(i11));
    }

    /* renamed from: I */
    public static final void m6579I(HomeworkLayout homeworkLayout, TextView textView, View view) {
        int i10 = homeworkLayout.f8753y;
        if (1 > i10 || i10 >= 10) {
            return;
        }
        int i11 = i10 + 1;
        homeworkLayout.f8753y = i11;
        textView.setText(String.valueOf(i11));
    }

    /* renamed from: J */
    public static final void m6580J(HomeworkLayout homeworkLayout, View view) {
        if (!ServiceUtils.isServiceRunning((Class<?>) PusherService.class)) {
            C9793k.m19779k(homeworkLayout.getContext()).m19782n("截图失败，请稍后重试");
        } else {
            C6148b.f8768d.m6626a().m6623g();
            LiveEventBus.get(EventBusKey.KEY_START_SCREEN_CAPTURE).postDelay(null, 100L);
        }
    }

    /* renamed from: K */
    public static final void m6581K(HomeworkLayout homeworkLayout, View view) {
        CropImageView cropImageView = homeworkLayout.f8733e;
        if (cropImageView != null) {
            cropImageView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = homeworkLayout.f8734f;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        CropImageView cropImageView2 = homeworkLayout.f8733e;
        Bitmap croppedImage = cropImageView2 != null ? cropImageView2.getCroppedImage() : null;
        homeworkLayout.f8737i = croppedImage;
        ImageView imageView = homeworkLayout.f8741m;
        if (imageView != null) {
            imageView.setImageBitmap(croppedImage);
        }
        ImageView imageView2 = homeworkLayout.f8742n;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        TextView textView = homeworkLayout.f8751w;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: L */
    public static final void m6582L(HomeworkLayout homeworkLayout, View view) {
        CropImageView cropImageView = homeworkLayout.f8733e;
        if (cropImageView != null) {
            cropImageView.setVisibility(8);
        }
        ConstraintLayout constraintLayout = homeworkLayout.f8734f;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        Group group = homeworkLayout.f8743o;
        if (group != null) {
            group.setVisibility(0);
        }
    }

    /* renamed from: M */
    public static final void m6583M(final HomeworkLayout homeworkLayout, View view) {
        C6148b.f8768d.m6626a().m6623g();
        C9824f.m19900a(ActivityUtils.getTopActivity()).m19904d(AbstractC10150d.m21192c()).m19898d(1).m19896b(false).m19897c(C9800r.m19802g()).m19895a(new InterfaceC10752l() { // from class: com.friday.lecture.floatwindow.homework.HomeworkLayout$initView$8$1
            @Override // p304q6.InterfaceC10752l
            /* renamed from: a */
            public void mo6615a(ArrayList arrayList) {
                AbstractC11117h.m24726d(AbstractC10006d.m20745b(), null, null, new HomeworkLayout$initView$8$1$onResult$1(arrayList, this.f8757a, null), 3, null);
            }

            @Override // p304q6.InterfaceC10752l
            public void onCancel() {
                C6148b.f8768d.m6626a().m6625i();
            }
        });
    }

    /* renamed from: N */
    public static final void m6584N(View view) {
        PermissionUtils.permission(PermissionConstants.CAMERA).callback(new C6146b()).request();
    }

    /* renamed from: O */
    public static final void m6585O(HomeworkLayout homeworkLayout, View view) {
        ImageView imageView = homeworkLayout.f8741m;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ImageView imageView2 = homeworkLayout.f8742n;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        Group group = homeworkLayout.f8743o;
        if (group != null) {
            group.setVisibility(0);
        }
        TextView textView = homeworkLayout.f8751w;
        if (textView != null) {
            textView.setVisibility(0);
        }
        homeworkLayout.f8737i = null;
    }

    /* renamed from: z */
    public static final void m6609z(Bitmap bitmap, HomeworkLayout homeworkLayout) {
        if (bitmap != null) {
            CropImageView cropImageView = homeworkLayout.f8733e;
            if (cropImageView != null) {
                cropImageView.setVisibility(0);
            }
            CropImageView cropImageView2 = homeworkLayout.f8733e;
            if (cropImageView2 != null) {
                cropImageView2.setImageBitmap(bitmap);
            }
            Group group = homeworkLayout.f8743o;
            if (group != null) {
                group.setVisibility(8);
            }
            ConstraintLayout constraintLayout = homeworkLayout.f8734f;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
        C6148b.f8768d.m6626a().m6625i();
    }

    /* renamed from: A */
    public final void m6610A() {
        addView(View.inflate(getContext(), R$layout.window_lecture_homework, null));
        this.f8738j = (ImageView) findViewById(R$id.iv_capture);
        this.f8739k = (ImageView) findViewById(R$id.iv_photograph);
        this.f8741m = (ImageView) findViewById(R$id.iv_homework);
        this.f8742n = (ImageView) findViewById(R$id.iv_delete);
        this.f8740l = (ImageView) findViewById(R$id.iv_photo_album);
        this.f8743o = (Group) findViewById(R$id.group_get_image);
        this.f8744p = (TabLayout) findViewById(R$id.tab_layout);
        this.f8745q = findViewById(R$id.layout_subjective);
        this.f8746r = findViewById(R$id.layout_objective);
        this.f8747s = (ImageView) findViewById(R$id.iv_close);
        this.f8748t = (CardView) findViewById(R$id.cv_arrange);
        this.f8749u = (TextView) findViewById(R$id.tv_single_option);
        this.f8750v = (TextView) findViewById(R$id.tv_multi_options);
        this.f8751w = (TextView) findViewById(R$id.tv_tips);
        this.f8733e = (CropImageView) findViewById(R$id.iv_screen_capture);
        this.f8734f = (ConstraintLayout) findViewById(R$id.ll_crop);
        this.f8735g = (ImageView) findViewById(R$id.iv_cancel);
        this.f8736h = (ImageView) findViewById(R$id.iv_ensure);
        ImageView imageView = (ImageView) findViewById(R$id.iv_minus_option);
        ImageView imageView2 = (ImageView) findViewById(R$id.iv_plus_option);
        ImageView imageView3 = (ImageView) findViewById(R$id.iv_minus_question);
        ImageView imageView4 = (ImageView) findViewById(R$id.iv_plus_question);
        final TextView textView = (TextView) findViewById(R$id.tv_option_count);
        final TextView textView2 = (TextView) findViewById(R$id.tv_question_count);
        TextView textView3 = this.f8749u;
        if (textView3 != null) {
            textView3.setSelected(true);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: f3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeworkLayout.m6572B(this.f21429c, textView, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: f3.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeworkLayout.m6573C(this.f21439c, textView, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: f3.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeworkLayout.m6578H(this.f21441c, textView2, view);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: f3.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeworkLayout.m6579I(this.f21443c, textView2, view);
            }
        });
        ImageView imageView5 = this.f8738j;
        if (imageView5 != null) {
            imageView5.setOnClickListener(new View.OnClickListener() { // from class: f3.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6580J(this.f21445c, view);
                }
            });
        }
        ImageView imageView6 = this.f8736h;
        if (imageView6 != null) {
            imageView6.setOnClickListener(new View.OnClickListener() { // from class: f3.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6581K(this.f21446c, view);
                }
            });
        }
        ImageView imageView7 = this.f8735g;
        if (imageView7 != null) {
            imageView7.setOnClickListener(new View.OnClickListener() { // from class: f3.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6582L(this.f21431c, view);
                }
            });
        }
        ImageView imageView8 = this.f8740l;
        if (imageView8 != null) {
            imageView8.setOnClickListener(new View.OnClickListener() { // from class: f3.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6583M(this.f21432c, view);
                }
            });
        }
        ImageView imageView9 = this.f8739k;
        if (imageView9 != null) {
            imageView9.setOnClickListener(new View.OnClickListener() { // from class: f3.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6584N(view);
                }
            });
        }
        ImageView imageView10 = this.f8742n;
        if (imageView10 != null) {
            imageView10.setOnClickListener(new View.OnClickListener() { // from class: f3.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6585O(this.f21433c, view);
                }
            });
        }
        TabLayout tabLayout = this.f8744p;
        if (tabLayout != null) {
            tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C6145a());
        }
        TextView textView4 = this.f8749u;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: f3.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6574D(this.f21436c, view);
                }
            });
        }
        TextView textView5 = this.f8750v;
        if (textView5 != null) {
            textView5.setOnClickListener(new View.OnClickListener() { // from class: f3.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6575E(this.f21437c, view);
                }
            });
        }
        ImageView imageView11 = this.f8747s;
        if (imageView11 != null) {
            imageView11.setOnClickListener(new View.OnClickListener() { // from class: f3.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HomeworkLayout.m6576F(view);
                }
            });
        }
        ClickUtils.applySingleDebouncing(this.f8748t, CoroutineLiveDataKt.DEFAULT_TIMEOUT, new View.OnClickListener() { // from class: f3.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeworkLayout.m6577G(this.f21438c, view);
            }
        });
    }

    /* renamed from: x */
    public final void m6611x() {
        if (NetworkUtils.isWifiConnected()) {
            AbstractC11117h.m24726d(AbstractC10006d.m20745b(), C11157r0.m24799b(), null, new HomeworkLayout$arrangeTask$1(this, null), 2, null);
        } else {
            AbstractC11958b.m26588i("网络未连接");
        }
    }

    /* renamed from: y */
    public final void m6612y(final Bitmap bitmap) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: f3.f
            @Override // java.lang.Runnable
            public final void run() {
                HomeworkLayout.m6609z(bitmap, this);
            }
        });
    }
}
