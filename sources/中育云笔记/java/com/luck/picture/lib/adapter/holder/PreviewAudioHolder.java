package com.luck.picture.lib.adapter.holder;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.entity.LocalMedia;
import java.io.IOException;
import p008a7.AbstractC0071d;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0073f;
import p008a7.AbstractC0076i;
import p235l6.AbstractC10149c;
import p403x6.InterfaceC11807j;

/* loaded from: classes5.dex */
public class PreviewAudioHolder extends BasePreviewHolder {

    /* renamed from: j */
    public final Handler f12196j;

    /* renamed from: k */
    public ImageView f12197k;

    /* renamed from: l */
    public TextView f12198l;

    /* renamed from: m */
    public TextView f12199m;

    /* renamed from: n */
    public TextView f12200n;

    /* renamed from: o */
    public SeekBar f12201o;

    /* renamed from: p */
    public ImageView f12202p;

    /* renamed from: q */
    public ImageView f12203q;

    /* renamed from: r */
    public MediaPlayer f12204r;

    /* renamed from: s */
    public boolean f12205s;

    /* renamed from: t */
    public Runnable f12206t;

    /* renamed from: u */
    public final MediaPlayer.OnCompletionListener f12207u;

    /* renamed from: v */
    public final MediaPlayer.OnErrorListener f12208v;

    /* renamed from: w */
    public final MediaPlayer.OnPreparedListener f12209w;

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$a */
    public class C7447a implements MediaPlayer.OnCompletionListener {
        public C7447a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
            PreviewAudioHolder.this.m9209O();
            PreviewAudioHolder.this.m9200F();
            PreviewAudioHolder.this.m9197C(true);
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$b */
    public class C7448b implements MediaPlayer.OnErrorListener {
        public C7448b() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) throws IllegalStateException {
            PreviewAudioHolder.this.m9200F();
            PreviewAudioHolder.this.m9197C(true);
            return false;
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$c */
    public class C7449c implements MediaPlayer.OnPreparedListener {
        public C7449c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
            if (mediaPlayer.isPlaying()) {
                PreviewAudioHolder.this.f12201o.setMax(mediaPlayer.getDuration());
                PreviewAudioHolder.this.m9208N();
                PreviewAudioHolder.this.m9198D();
            } else {
                PreviewAudioHolder.this.m9209O();
                PreviewAudioHolder.this.m9200F();
                PreviewAudioHolder.this.m9197C(true);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$d */
    public class RunnableC7450d implements Runnable {
        public RunnableC7450d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentPosition = PreviewAudioHolder.this.f12204r.getCurrentPosition();
            String strM153b = AbstractC0071d.m153b(currentPosition);
            if (!TextUtils.equals(strM153b, PreviewAudioHolder.this.f12200n.getText())) {
                PreviewAudioHolder.this.f12200n.setText(strM153b);
                if (PreviewAudioHolder.this.f12204r.getDuration() - currentPosition > 1000) {
                    PreviewAudioHolder.this.f12201o.setProgress((int) currentPosition);
                } else {
                    PreviewAudioHolder previewAudioHolder = PreviewAudioHolder.this;
                    previewAudioHolder.f12201o.setProgress(previewAudioHolder.f12204r.getDuration());
                }
            }
            PreviewAudioHolder.this.f12196j.postDelayed(this, 1000 - (currentPosition % 1000));
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$e */
    public class C7451e implements InterfaceC11807j {
        public C7451e() {
        }

        @Override // p403x6.InterfaceC11807j
        /* renamed from: a */
        public void mo9210a(View view, float f10, float f11) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewAudioHolder.this.f12173i;
            if (interfaceC7442a != null) {
                interfaceC7442a.mo9104a();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$f */
    public class ViewOnLongClickListenerC7452f implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12215c;

        public ViewOnLongClickListenerC7452f(LocalMedia localMedia) {
            this.f12215c = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewAudioHolder.this.f12173i;
            if (interfaceC7442a == null) {
                return false;
            }
            interfaceC7442a.mo9105b(this.f12215c);
            return false;
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$g */
    public class ViewOnClickListenerC7453g implements View.OnClickListener {
        public ViewOnClickListenerC7453g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalStateException {
            PreviewAudioHolder.this.m9206L();
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$h */
    public class ViewOnClickListenerC7454h implements View.OnClickListener {
        public ViewOnClickListenerC7454h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalStateException {
            PreviewAudioHolder.this.m9195A();
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$i */
    public class C7455i implements SeekBar.OnSeekBarChangeListener {
        public C7455i() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) throws IllegalStateException {
            if (z10) {
                seekBar.setProgress(i10);
                PreviewAudioHolder.this.m9203I(i10);
                if (PreviewAudioHolder.this.f12204r.isPlaying()) {
                    PreviewAudioHolder.this.f12204r.seekTo(seekBar.getProgress());
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$j */
    public class ViewOnClickListenerC7456j implements View.OnClickListener {
        public ViewOnClickListenerC7456j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewAudioHolder.this.f12173i;
            if (interfaceC7442a != null) {
                interfaceC7442a.mo9104a();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$k */
    public class ViewOnClickListenerC7457k implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12221c;

        /* renamed from: d */
        public final /* synthetic */ String f12222d;

        public ViewOnClickListenerC7457k(LocalMedia localMedia, String str) {
            this.f12221c = localMedia;
            this.f12222d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (AbstractC0073f.m171a()) {
                    return;
                }
                PreviewAudioHolder.this.f12173i.mo9106c(this.f12221c.m9391q());
                if (PreviewAudioHolder.this.f12204r.isPlaying()) {
                    PreviewAudioHolder.this.m9196B();
                } else if (PreviewAudioHolder.this.f12205s) {
                    PreviewAudioHolder.this.m9201G();
                } else {
                    PreviewAudioHolder.this.m9207M(this.f12222d);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewAudioHolder$l */
    public class ViewOnLongClickListenerC7458l implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12224c;

        public ViewOnLongClickListenerC7458l(LocalMedia localMedia) {
            this.f12224c = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewAudioHolder.this.f12173i;
            if (interfaceC7442a == null) {
                return false;
            }
            interfaceC7442a.mo9105b(this.f12224c);
            return false;
        }
    }

    public PreviewAudioHolder(View view) {
        super(view);
        this.f12196j = new Handler(Looper.getMainLooper());
        this.f12204r = new MediaPlayer();
        this.f12205s = false;
        this.f12206t = new RunnableC7450d();
        this.f12207u = new C7447a();
        this.f12208v = new C7448b();
        this.f12209w = new C7449c();
        this.f12197k = (ImageView) view.findViewById(R$id.iv_play_video);
        this.f12198l = (TextView) view.findViewById(R$id.tv_audio_name);
        this.f12200n = (TextView) view.findViewById(R$id.tv_current_time);
        this.f12199m = (TextView) view.findViewById(R$id.tv_total_duration);
        this.f12201o = (SeekBar) view.findViewById(R$id.music_seek_bar);
        this.f12202p = (ImageView) view.findViewById(R$id.iv_play_back);
        this.f12203q = (ImageView) view.findViewById(R$id.iv_play_fast);
    }

    /* renamed from: A */
    public final void m9195A() throws IllegalStateException {
        if (this.f12201o.getProgress() > 3000) {
            SeekBar seekBar = this.f12201o;
            seekBar.setProgress(seekBar.getMax());
        } else {
            this.f12201o.setProgress((int) (r0.getProgress() + 3000));
        }
        m9203I(this.f12201o.getProgress());
        this.f12204r.seekTo(this.f12201o.getProgress());
    }

    /* renamed from: B */
    public final void m9196B() throws IllegalStateException {
        this.f12204r.pause();
        this.f12205s = true;
        m9197C(false);
        m9209O();
    }

    /* renamed from: C */
    public final void m9197C(boolean z10) {
        m9209O();
        if (z10) {
            this.f12201o.setProgress(0);
            this.f12200n.setText("00:00");
        }
        m9202H(false);
        this.f12197k.setImageResource(R$drawable.ps_ic_audio_play);
        BasePreviewHolder.InterfaceC7442a interfaceC7442a = this.f12173i;
        if (interfaceC7442a != null) {
            interfaceC7442a.mo9106c(null);
        }
    }

    /* renamed from: D */
    public final void m9198D() {
        m9208N();
        m9202H(true);
        this.f12197k.setImageResource(R$drawable.ps_ic_audio_stop);
    }

    /* renamed from: E */
    public void m9199E() {
        this.f12196j.removeCallbacks(this.f12206t);
        if (this.f12204r != null) {
            m9205K();
            this.f12204r.release();
            this.f12204r = null;
        }
    }

    /* renamed from: F */
    public final void m9200F() throws IllegalStateException {
        this.f12205s = false;
        this.f12204r.stop();
        this.f12204r.reset();
    }

    /* renamed from: G */
    public final void m9201G() throws IllegalStateException {
        this.f12204r.seekTo(this.f12201o.getProgress());
        this.f12204r.start();
        m9208N();
        m9198D();
    }

    /* renamed from: H */
    public final void m9202H(boolean z10) {
        this.f12202p.setEnabled(z10);
        this.f12203q.setEnabled(z10);
        if (z10) {
            this.f12202p.setAlpha(1.0f);
            this.f12203q.setAlpha(1.0f);
        } else {
            this.f12202p.setAlpha(0.5f);
            this.f12203q.setAlpha(0.5f);
        }
    }

    /* renamed from: I */
    public final void m9203I(int i10) {
        this.f12200n.setText(AbstractC0071d.m153b(i10));
    }

    /* renamed from: J */
    public final void m9204J() {
        this.f12204r.setOnCompletionListener(this.f12207u);
        this.f12204r.setOnErrorListener(this.f12208v);
        this.f12204r.setOnPreparedListener(this.f12209w);
    }

    /* renamed from: K */
    public final void m9205K() {
        this.f12204r.setOnCompletionListener(null);
        this.f12204r.setOnErrorListener(null);
        this.f12204r.setOnPreparedListener(null);
    }

    /* renamed from: L */
    public final void m9206L() throws IllegalStateException {
        if (this.f12201o.getProgress() < 3000) {
            this.f12201o.setProgress(0);
        } else {
            this.f12201o.setProgress((int) (r0.getProgress() - 3000));
        }
        m9203I(this.f12201o.getProgress());
        this.f12204r.seekTo(this.f12201o.getProgress());
    }

    /* renamed from: M */
    public final void m9207M(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        try {
            if (AbstractC10149c.m21174c(str)) {
                this.f12204r.setDataSource(this.itemView.getContext(), Uri.parse(str));
            } else {
                this.f12204r.setDataSource(str);
            }
            this.f12204r.prepare();
            this.f12204r.seekTo(this.f12201o.getProgress());
            this.f12204r.start();
            this.f12205s = false;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: N */
    public final void m9208N() {
        this.f12196j.post(this.f12206t);
    }

    /* renamed from: O */
    public final void m9209O() {
        this.f12196j.removeCallbacks(this.f12206t);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: a */
    public void mo9161a(LocalMedia localMedia, int i10) {
        String strM9371g = localMedia.m9371g();
        String strM157f = AbstractC0071d.m157f(localMedia.m9387o());
        String strM200e = AbstractC0076i.m200e(localMedia.m9341B());
        mo9164e(localMedia, -1, -1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(localMedia.m9391q());
        sb2.append(SignParameters.NEW_LINE);
        sb2.append(strM157f);
        sb2.append(" - ");
        sb2.append(strM200e);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        String str = strM157f + " - " + strM200e;
        int iIndexOf = sb2.indexOf(str);
        int length = str.length() + iIndexOf;
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(AbstractC0072e.m161a(this.itemView.getContext(), 12.0f)), iIndexOf, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-10132123), iIndexOf, length, 17);
        this.f12198l.setText(spannableStringBuilder);
        this.f12199m.setText(AbstractC0071d.m153b(localMedia.m9389p()));
        this.f12201o.setMax((int) localMedia.m9389p());
        m9202H(false);
        this.f12202p.setOnClickListener(new ViewOnClickListenerC7453g());
        this.f12203q.setOnClickListener(new ViewOnClickListenerC7454h());
        this.f12201o.setOnSeekBarChangeListener(new C7455i());
        this.itemView.setOnClickListener(new ViewOnClickListenerC7456j());
        this.f12197k.setOnClickListener(new ViewOnClickListenerC7457k(localMedia, strM9371g));
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC7458l(localMedia));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: b */
    public void mo9162b(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: e */
    public void mo9164e(LocalMedia localMedia, int i10, int i11) {
        this.f12198l.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_audio_play_cover, 0, 0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: f */
    public void mo9165f() {
        this.f12172h.setOnViewTapListener(new C7451e());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: g */
    public void mo9166g(LocalMedia localMedia) {
        this.f12172h.setOnLongClickListener(new ViewOnLongClickListenerC7452f(localMedia));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: h */
    public void mo9167h() {
        this.f12205s = false;
        m9204J();
        m9197C(true);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: i */
    public void mo9168i() throws IllegalStateException {
        this.f12205s = false;
        this.f12196j.removeCallbacks(this.f12206t);
        m9205K();
        m9200F();
        m9197C(true);
    }
}
