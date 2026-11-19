package com.zykj.video.play.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.rtmp.p056ui.TXCloudVideoView;
import com.zykj.video.play.C8161a;
import com.zykj.video.play.R$id;
import com.zykj.video.play.R$layout;
import java.util.List;
import p143j5.C9020g;
import p154k5.InterfaceC9057b;
import p154k5.InterfaceC9058c;

/* loaded from: classes5.dex */
public class TCControllerFloat extends RelativeLayout implements InterfaceC9057b, View.OnClickListener {

    /* renamed from: a */
    public TXCloudVideoView f14607a;

    /* renamed from: b */
    public InterfaceC9058c f14608b;

    /* renamed from: c */
    public int f14609c;

    /* renamed from: d */
    public float f14610d;

    /* renamed from: e */
    public float f14611e;

    /* renamed from: f */
    public float f14612f;

    /* renamed from: g */
    public float f14613g;

    /* renamed from: h */
    public float f14614h;

    /* renamed from: i */
    public float f14615i;

    public TCControllerFloat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12417a(context);
    }

    /* renamed from: a */
    private void m12417a(Context context) {
        LayoutInflater.from(context).inflate(R$layout.superplayer_vod_controller_float, this);
        this.f14607a = (TXCloudVideoView) findViewById(R$id.superplayer_float_cloud_video_view);
        ((ImageView) findViewById(R$id.superplayer_iv_close)).setOnClickListener(this);
    }

    private int getStatusBarHeight() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (this.f14609c == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                this.f14609c = getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return this.f14609c;
    }

    /* renamed from: b */
    public void m12418b() {
    }

    /* renamed from: c */
    public final void m12419c() {
        int i10 = (int) (this.f14612f - this.f14614h);
        int i11 = (int) (this.f14613g - this.f14615i);
        C8161a.a aVar = C8161a.m12416a().f14590b;
        if (aVar != null) {
            aVar.f14595a = i10;
            aVar.f14596b = i11;
        }
        InterfaceC9058c interfaceC9058c = this.f14608b;
        if (interfaceC9058c != null) {
            interfaceC9058c.mo12410f(i10, i11);
        }
    }

    public TXCloudVideoView getFloatVideoView() {
        return this.f14607a;
    }

    @Override // p154k5.InterfaceC9057b
    public void hide() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC9058c interfaceC9058c;
        if (view.getId() != R$id.superplayer_iv_close || (interfaceC9058c = this.f14608b) == null) {
            return;
        }
        interfaceC9058c.mo12406b(3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC9058c interfaceC9058c;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14614h = motionEvent.getX();
            this.f14615i = motionEvent.getY();
            this.f14610d = motionEvent.getRawX();
            this.f14611e = motionEvent.getRawY() - getStatusBarHeight();
            this.f14612f = motionEvent.getRawX();
            this.f14613g = motionEvent.getRawY() - getStatusBarHeight();
        } else if (action != 1) {
            if (action == 2) {
                this.f14612f = motionEvent.getRawX();
                this.f14613g = motionEvent.getRawY() - getStatusBarHeight();
                m12419c();
            }
        } else if (this.f14610d == this.f14612f && this.f14611e == this.f14613g && (interfaceC9058c = this.f14608b) != null) {
            interfaceC9058c.mo12414j(1);
        }
        return true;
    }

    public void setBackground(Bitmap bitmap) {
    }

    public void setCallback(InterfaceC9058c interfaceC9058c) {
        this.f14608b = interfaceC9058c;
    }

    public void setVideoQualityList(List<C9020g> list) {
    }
}
