package com.tencent.rtmp.p056ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.text.SimpleDateFormat;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class TXDashBoard extends LinearLayout {

    /* renamed from: a */
    protected TextView f6535a;

    /* renamed from: b */
    protected TextView f6536b;

    /* renamed from: c */
    protected ScrollView f6537c;

    /* renamed from: d */
    protected StringBuffer f6538d;

    /* renamed from: e */
    protected int f6539e;

    /* renamed from: f */
    private final SimpleDateFormat f6540f;

    /* renamed from: g */
    private boolean f6541g;

    public TXDashBoard(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m5822b() {
        if (this.f6535a != null) {
            return;
        }
        this.f6535a = new TextView(getContext());
        this.f6536b = new TextView(getContext());
        this.f6537c = new ScrollView(getContext());
        this.f6535a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f6535a.setTextColor(-49023);
        this.f6535a.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f6537c.setPadding(0, 10, 0, 0);
        this.f6537c.setLayoutParams(layoutParams);
        this.f6537c.setVerticalScrollBarEnabled(true);
        this.f6537c.setScrollbarFadingEnabled(true);
        this.f6536b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6536b.setTextColor(-49023);
        this.f6537c.addView(this.f6536b);
        addView(this.f6535a);
        addView(this.f6537c);
        if (this.f6538d.length() <= 0) {
            this.f6538d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        this.f6536b.setText(this.f6538d.toString());
    }

    /* renamed from: a */
    public void m5825a(int i10, int i11, int i12, int i13) {
        TextView textView = this.f6535a;
        if (textView != null) {
            textView.setPadding(i10, i11, i12, 0);
        }
        ScrollView scrollView = this.f6537c;
        if (scrollView != null) {
            scrollView.setPadding(i10, 0, i12, i13);
        }
    }

    public void setEventTextSize(float f10) {
        TextView textView = this.f6536b;
        if (textView != null) {
            textView.setTextSize(f10);
        }
    }

    public void setLogMsgLenLimit(int i10) {
        this.f6539e = i10;
    }

    public void setShowLevel(int i10) {
        if (i10 == 0) {
            TextView textView = this.f6535a;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f6537c;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i10 != 1) {
            m5822b();
            this.f6535a.setVisibility(0);
            this.f6537c.setVisibility(0);
            setVisibility(0);
            return;
        }
        m5822b();
        this.f6535a.setVisibility(0);
        this.f6537c.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusTextSize(float f10) {
        TextView textView = this.f6535a;
        if (textView != null) {
            textView.setTextSize(f10);
        }
    }

    public TXDashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6538d = new StringBuffer("");
        this.f6539e = 3000;
        this.f6540f = new SimpleDateFormat("HH:mm:ss.SSS");
        this.f6541g = false;
        setOrientation(1);
        setVisibility(4);
    }

    /* renamed from: a */
    public void m5828a(CharSequence charSequence) {
        TextView textView = this.f6535a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void m5829a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "[" + this.f6540f.format(Long.valueOf(System.currentTimeMillis())) + "]" + str + SignParameters.NEW_LINE;
        if (this.f6538d.length() <= 0) {
            this.f6538d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        while (this.f6538d.length() > this.f6539e) {
            int iIndexOf = this.f6538d.indexOf(SignParameters.NEW_LINE);
            if (iIndexOf == 0) {
                iIndexOf = 1;
            }
            this.f6538d = this.f6538d.delete(0, iIndexOf);
        }
        StringBuffer stringBuffer = this.f6538d;
        stringBuffer.append(str2);
        this.f6538d = stringBuffer;
        TextView textView = this.f6536b;
        if (textView != null) {
            textView.setText(stringBuffer.toString());
        }
    }

    /* renamed from: a */
    public void m5830a(boolean z10) {
        this.f6541g = z10;
    }

    /* renamed from: a */
    public void m5824a() {
        this.f6538d.setLength(0);
        TextView textView = this.f6535a;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.f6536b;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* renamed from: a */
    public void m5827a(Bundle bundle, Bundle bundle2, int i10) {
        String string;
        ScrollView scrollView;
        TextView textView;
        TextView textView2;
        if (this.f6541g || i10 == 2011 || i10 == 2012) {
            return;
        }
        if (bundle != null && (textView2 = this.f6535a) != null) {
            textView2.setText(m5823a(bundle));
        }
        if (this.f6538d.length() <= 0) {
            this.f6538d.append("liteav sdk version:" + TXCCommonUtil.getSDKVersionStr() + SignParameters.NEW_LINE);
        }
        if (bundle2 == null || (string = bundle2.getString(TXLiveConstants.EVT_DESCRIPTION)) == null || string.isEmpty()) {
            return;
        }
        m5826a(i10, string);
        TextView textView3 = this.f6536b;
        if (textView3 != null) {
            textView3.setText(this.f6538d.toString());
        }
        if (getVisibility() != 0 || (scrollView = this.f6537c) == null || (textView = this.f6536b) == null) {
            return;
        }
        m5821a(scrollView, textView);
    }

    /* renamed from: a */
    public void m5826a(int i10, String str) {
        if (i10 == 1020) {
            return;
        }
        String str2 = new SimpleDateFormat("HH:mm:ss.SSS").format(Long.valueOf(System.currentTimeMillis()));
        while (this.f6538d.length() > this.f6539e) {
            int iIndexOf = this.f6538d.indexOf(SignParameters.NEW_LINE);
            if (iIndexOf == 0) {
                iIndexOf = 1;
            }
            this.f6538d = this.f6538d.delete(0, iIndexOf);
        }
        StringBuffer stringBuffer = this.f6538d;
        stringBuffer.append("\n[" + str2 + "]" + str);
        this.f6538d = stringBuffer;
    }

    /* renamed from: a */
    public String m5823a(Bundle bundle) {
        return String.format("%-16s %-16s %-16s\n%-12s %-12s %-12s %-12s\n%-14s %-14s %-14s\n%-16s %-16s", "CPU:" + bundle.getString(TXLiveConstants.NET_STATUS_CPU_USAGE), "RES:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_WIDTH) + Marker.ANY_MARKER + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_HEIGHT), "SPD:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_SPEED) + "Kbps", "JIT:" + bundle.getInt(TXLiveConstants.NET_STATUS_NET_JITTER), "FPS:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_FPS), "GOP:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_GOP) + "s", "ARA:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_BITRATE) + "Kbps", "QUE:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_CACHE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_CACHE) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_V_SUM_CACHE_SIZE) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_V_DEC_CACHE_SIZE) + " | " + bundle.getInt(TXLiveConstants.NET_STATUS_AV_RECV_INTERVAL) + "," + bundle.getInt(TXLiveConstants.NET_STATUS_AV_PLAY_INTERVAL) + "," + String.format("%.1f", Float.valueOf(bundle.getFloat(TXLiveConstants.NET_STATUS_AUDIO_CACHE_THRESHOLD))).toString(), "VRA:" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE) + "Kbps", "DRP:" + bundle.getInt(TXLiveConstants.NET_STATUS_AUDIO_DROP) + "|" + bundle.getInt(TXLiveConstants.NET_STATUS_VIDEO_DROP), "SVR:" + bundle.getString(TXLiveConstants.NET_STATUS_SERVER_IP), "AUDIO:" + bundle.getString(TXLiveConstants.NET_STATUS_AUDIO_INFO));
    }

    /* renamed from: a */
    private void m5821a(ScrollView scrollView, View view) {
        if (scrollView == null || view == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight() - scrollView.getMeasuredHeight();
        if (measuredHeight < 0) {
            measuredHeight = 0;
        }
        scrollView.scrollTo(0, measuredHeight);
    }
}
