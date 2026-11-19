package com.luck.picture.lib.basic;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.huawei.hms.framework.common.BundleUtil;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$raw;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.dialog.PhotoItemSelectedDialog;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.service.ForegroundService;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p008a7.AbstractC0068a;
import p008a7.AbstractC0070c;
import p008a7.AbstractC0071d;
import p008a7.AbstractC0074g;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0076i;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0081n;
import p008a7.AbstractC0083p;
import p204j6.C9685b;
import p219k6.AbstractC9820b;
import p219k6.C9822d;
import p219k6.C9824f;
import p235l6.AbstractC10147a;
import p235l6.AbstractC10149c;
import p235l6.AbstractC10150d;
import p248m6.DialogC10205b;
import p248m6.DialogC10206c;
import p260n6.InterfaceC10322a;
import p290p6.AbstractC10632a;
import p304q6.InterfaceC10742b;
import p304q6.InterfaceC10743c;
import p304q6.InterfaceC10748h;
import p304q6.InterfaceC10752l;
import p319r6.AbstractC10910b;
import p334s6.AbstractC11073a;
import p359u6.AbstractC11370a;
import p387w6.AbstractC11707b;
import p387w6.AbstractC11709d;
import p387w6.C11706a;
import p387w6.InterfaceC11708c;

/* loaded from: classes5.dex */
public abstract class PictureCommonFragment extends Fragment {

    /* renamed from: d */
    public InterfaceC11708c f12260d;

    /* renamed from: e */
    public int f12261e = 1;

    /* renamed from: f */
    public AbstractC11073a f12262f;

    /* renamed from: g */
    public PictureSelectionConfig f12263g;

    /* renamed from: h */
    public DialogC10205b f12264h;

    /* renamed from: i */
    public SoundPool f12265i;

    /* renamed from: j */
    public int f12266j;

    /* renamed from: k */
    public long f12267k;

    /* renamed from: l */
    public Dialog f12268l;

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$a */
    public class C7471a implements InterfaceC10742b {
        public C7471a() {
        }

        @Override // p304q6.InterfaceC10742b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9094a(ArrayList arrayList) {
            PictureCommonFragment.this.m9300u0(arrayList);
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$b */
    public class C7472b {

        /* renamed from: a */
        public final /* synthetic */ ConcurrentHashMap f12270a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f12271b;

        public C7472b(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f12270a = concurrentHashMap;
            this.f12271b = arrayList;
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$c */
    public class C7473c {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f12273a;

        /* renamed from: b */
        public final /* synthetic */ ConcurrentHashMap f12274b;

        public C7473c(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f12273a = arrayList;
            this.f12274b = concurrentHashMap;
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$d */
    public class C7474d extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ ConcurrentHashMap f12276h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList f12277i;

        /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$d$a */
        public class a {
            public a() {
            }
        }

        public C7474d(ConcurrentHashMap concurrentHashMap, ArrayList arrayList) {
            this.f12276h = concurrentHashMap;
            this.f12277i = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList mo192d() {
            Iterator it = this.f12276h.entrySet().iterator();
            while (it.hasNext()) {
                LocalMedia localMedia = (LocalMedia) ((Map.Entry) it.next()).getValue();
                if (PictureCommonFragment.this.f12263g.f12330T || TextUtils.isEmpty(localMedia.m9340A())) {
                    InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                    PictureCommonFragment.this.getContext();
                    localMedia.m9401x();
                    localMedia.m9397t();
                    new a();
                    throw null;
                }
            }
            return this.f12277i;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(ArrayList arrayList) {
            PictureThreadUtils.m9580d(this);
            PictureCommonFragment.this.m9276S(arrayList);
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$e */
    public class C7475e extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ ArrayList f12280h;

        /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$e$a */
        public class a {
            public a() {
            }
        }

        public C7475e(ArrayList arrayList) {
            this.f12280h = arrayList;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList mo192d() {
            if (this.f12280h.size() <= 0) {
                return this.f12280h;
            }
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            PictureCommonFragment.this.getContext();
            boolean z10 = PictureCommonFragment.this.f12263g.f12330T;
            new a();
            throw null;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(ArrayList arrayList) {
            PictureThreadUtils.m9580d(this);
            PictureCommonFragment.this.m9276S(arrayList);
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$f */
    public class ViewOnKeyListenerC7476f implements View.OnKeyListener {
        public ViewOnKeyListenerC7476f() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            PictureCommonFragment.this.mo9087p0();
            return true;
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$g */
    public class C7477g implements InterfaceC10743c {
        public C7477g() {
        }

        @Override // p304q6.InterfaceC10743c
        /* renamed from: a */
        public void mo9315a(View view, int i10) {
            if (i10 == 0) {
                InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                PictureCommonFragment.this.m9309z0();
            } else {
                if (i10 != 1) {
                    return;
                }
                InterfaceC10322a interfaceC10322a2 = PictureSelectionConfig.f12293N0;
                PictureCommonFragment.this.m9247C0();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$h */
    public class C7478h implements PhotoItemSelectedDialog.InterfaceC7484a {
        public C7478h() {
        }

        @Override // com.luck.picture.lib.dialog.PhotoItemSelectedDialog.InterfaceC7484a
        /* renamed from: a */
        public void mo9316a(boolean z10, DialogInterface dialogInterface) {
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            if (pictureCommonFragment.f12263g.f12338d && z10) {
                pictureCommonFragment.mo9087p0();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$i */
    public class C7479i implements InterfaceC11708c {
        public C7479i() {
        }

        @Override // p387w6.InterfaceC11708c
        public void onDenied() {
            PictureCommonFragment.this.m9282Y(AbstractC11707b.f27819d);
        }

        @Override // p387w6.InterfaceC11708c
        public void onGranted() {
            PictureCommonFragment.this.m9273Q0();
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$j */
    public class C7480j implements InterfaceC11708c {
        public C7480j() {
        }

        @Override // p387w6.InterfaceC11708c
        public void onDenied() {
            PictureCommonFragment.this.m9282Y(AbstractC11707b.f27819d);
        }

        @Override // p387w6.InterfaceC11708c
        public void onGranted() {
            PictureCommonFragment.this.m9275R0();
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$k */
    public class C7481k extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ Intent f12288h;

        public C7481k(Intent intent) {
            this.f12288h = intent;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public LocalMedia mo192d() {
            String strM9281V = PictureCommonFragment.this.m9281V(this.f12288h);
            if (!TextUtils.isEmpty(strM9281V)) {
                PictureCommonFragment.this.f12263g.f12342f0 = strM9281V;
            }
            if (TextUtils.isEmpty(PictureCommonFragment.this.f12263g.f12342f0)) {
                return null;
            }
            if (PictureCommonFragment.this.f12263g.f12337c == AbstractC10150d.m21191b()) {
                PictureCommonFragment.this.m9253G();
            }
            PictureCommonFragment pictureCommonFragment = PictureCommonFragment.this;
            return pictureCommonFragment.m9295s(pictureCommonFragment.f12263g.f12342f0);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(LocalMedia localMedia) {
            PictureThreadUtils.m9580d(this);
            if (localMedia != null) {
                PictureCommonFragment.this.m9302v0(localMedia);
                PictureCommonFragment.this.mo8902P(localMedia);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.basic.PictureCommonFragment$l */
    public class C7482l {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f12290a;

        /* renamed from: b */
        public final /* synthetic */ ConcurrentHashMap f12291b;

        public C7482l(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
            this.f12290a = arrayList;
            this.f12291b = concurrentHashMap;
        }
    }

    /* renamed from: X */
    public static String m9238X(Context context, String str, int i10) {
        return AbstractC10149c.m21180i(str) ? context.getString(R$string.ps_message_video_max_num, String.valueOf(i10)) : AbstractC10149c.m21175d(str) ? context.getString(R$string.ps_message_audio_max_num, String.valueOf(i10)) : context.getString(R$string.ps_message_max_num, String.valueOf(i10));
    }

    /* renamed from: A */
    public boolean m9242A(boolean z10, String str, String str2, long j10, long j11) {
        if (!AbstractC10149c.m21182k(str2, str)) {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_rule));
            return true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        long j12 = pictureSelectionConfig.f12300B;
        if (j12 > 0 && j10 > j12) {
            InterfaceC10322a interfaceC10322a2 = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_select_max_size, AbstractC0076i.m201f(j12)));
            return true;
        }
        long j13 = pictureSelectionConfig.f12302C;
        if (j13 > 0 && j10 < j13) {
            InterfaceC10322a interfaceC10322a3 = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_select_min_size, AbstractC0076i.m201f(j13)));
            return true;
        }
        if (AbstractC10149c.m21180i(str)) {
            PictureSelectionConfig pictureSelectionConfig2 = this.f12263g;
            if (pictureSelectionConfig2.f12353l == 2) {
                int i10 = pictureSelectionConfig2.f12359o;
                if (i10 <= 0) {
                    i10 = pictureSelectionConfig2.f12355m;
                }
                pictureSelectionConfig2.f12359o = i10;
                if (!z10 && AbstractC11370a.m25304l() >= this.f12263g.f12359o) {
                    InterfaceC10322a interfaceC10322a4 = PictureSelectionConfig.f12293N0;
                    m9271P0(m9238X(getContext(), str, this.f12263g.f12359o));
                    return true;
                }
            }
            if (!z10 && this.f12263g.f12373v > 0) {
                long jM160i = AbstractC0071d.m160i(j11);
                int i11 = this.f12263g.f12373v;
                if (jM160i < i11) {
                    InterfaceC10322a interfaceC10322a5 = PictureSelectionConfig.f12293N0;
                    m9271P0(getString(R$string.ps_select_video_min_second, Integer.valueOf(i11 / 1000)));
                    return true;
                }
            }
            if (z10 || this.f12263g.f12371u <= 0) {
                return false;
            }
            long jM160i2 = AbstractC0071d.m160i(j11);
            int i12 = this.f12263g.f12371u;
            if (jM160i2 <= i12) {
                return false;
            }
            InterfaceC10322a interfaceC10322a6 = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_select_video_max_second, Integer.valueOf(i12 / 1000)));
            return true;
        }
        if (!AbstractC10149c.m21175d(str)) {
            if (this.f12263g.f12353l != 2 || z10 || AbstractC11370a.m25306n().size() < this.f12263g.f12355m) {
                return false;
            }
            InterfaceC10322a interfaceC10322a7 = PictureSelectionConfig.f12293N0;
            m9271P0(m9238X(getContext(), str, this.f12263g.f12355m));
            return true;
        }
        if (this.f12263g.f12353l == 2 && !z10 && AbstractC11370a.m25306n().size() >= this.f12263g.f12355m) {
            InterfaceC10322a interfaceC10322a8 = PictureSelectionConfig.f12293N0;
            m9271P0(m9238X(getContext(), str, this.f12263g.f12355m));
            return true;
        }
        if (!z10 && this.f12263g.f12373v > 0) {
            long jM160i3 = AbstractC0071d.m160i(j11);
            int i13 = this.f12263g.f12373v;
            if (jM160i3 < i13) {
                InterfaceC10322a interfaceC10322a9 = PictureSelectionConfig.f12293N0;
                m9271P0(getString(R$string.ps_select_audio_min_second, Integer.valueOf(i13 / 1000)));
                return true;
            }
        }
        if (z10 || this.f12263g.f12371u <= 0) {
            return false;
        }
        long jM160i4 = AbstractC0071d.m160i(j11);
        int i14 = this.f12263g.f12371u;
        if (jM160i4 <= i14) {
            return false;
        }
        InterfaceC10322a interfaceC10322a10 = PictureSelectionConfig.f12293N0;
        m9271P0(getString(R$string.ps_select_audio_max_second, Integer.valueOf(i14 / 1000)));
        return true;
    }

    /* renamed from: A0 */
    public void m9243A0() {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        int i10 = pictureSelectionConfig.f12337c;
        if (i10 == 0) {
            if (pictureSelectionConfig.f12368s0 == AbstractC10150d.m21192c()) {
                m9309z0();
                return;
            } else if (this.f12263g.f12368s0 == AbstractC10150d.m21193d()) {
                m9247C0();
                return;
            } else {
                m9307y0();
                return;
            }
        }
        if (i10 == 1) {
            m9309z0();
        } else if (i10 == 2) {
            m9247C0();
        } else {
            if (i10 != 3) {
                return;
            }
            m9245B0();
        }
    }

    /* renamed from: B */
    public boolean m9244B() {
        if (!AbstractC0077j.m217e()) {
            return false;
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: B0 */
    public void m9245B0() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        throw new NullPointerException(InterfaceC10748h.class.getSimpleName() + " interface needs to be implemented for recording");
    }

    /* renamed from: C */
    public boolean m9246C() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: C0 */
    public void m9247C0() {
        String[] strArr = AbstractC11707b.f27819d;
        m9296s0(true, strArr);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        C11706a.m25878b().m25885i(this, strArr, new C7480j());
    }

    /* renamed from: D */
    public boolean m9248D(boolean z10, String str, int i10, long j10, long j11) {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        long j12 = pictureSelectionConfig.f12300B;
        if (j12 > 0 && j10 > j12) {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_select_max_size, AbstractC0076i.m201f(j12)));
            return true;
        }
        long j13 = pictureSelectionConfig.f12302C;
        if (j13 > 0 && j10 < j13) {
            InterfaceC10322a interfaceC10322a2 = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_select_min_size, AbstractC0076i.m201f(j13)));
            return true;
        }
        if (!AbstractC10149c.m21180i(str)) {
            if (this.f12263g.f12353l != 2 || z10) {
                return false;
            }
            int size = AbstractC11370a.m25306n().size();
            int i11 = this.f12263g.f12355m;
            if (size < i11) {
                return false;
            }
            InterfaceC10322a interfaceC10322a3 = PictureSelectionConfig.f12293N0;
            m9271P0(getString(R$string.ps_message_max_num, Integer.valueOf(i11)));
            return true;
        }
        PictureSelectionConfig pictureSelectionConfig2 = this.f12263g;
        if (pictureSelectionConfig2.f12353l == 2) {
            if (pictureSelectionConfig2.f12359o <= 0) {
                InterfaceC10322a interfaceC10322a4 = PictureSelectionConfig.f12293N0;
                m9271P0(getString(R$string.ps_rule));
                return true;
            }
            if (!z10) {
                int size2 = AbstractC11370a.m25306n().size();
                int i12 = this.f12263g.f12355m;
                if (size2 >= i12) {
                    InterfaceC10322a interfaceC10322a5 = PictureSelectionConfig.f12293N0;
                    m9271P0(getString(R$string.ps_message_max_num, Integer.valueOf(i12)));
                    return true;
                }
            }
            if (!z10 && i10 >= this.f12263g.f12359o) {
                InterfaceC10322a interfaceC10322a6 = PictureSelectionConfig.f12293N0;
                m9271P0(m9238X(getContext(), str, this.f12263g.f12359o));
                return true;
            }
        }
        if (!z10 && this.f12263g.f12373v > 0) {
            long jM160i = AbstractC0071d.m160i(j11);
            int i13 = this.f12263g.f12373v;
            if (jM160i < i13) {
                InterfaceC10322a interfaceC10322a7 = PictureSelectionConfig.f12293N0;
                m9271P0(getString(R$string.ps_select_video_min_second, Integer.valueOf(i13 / 1000)));
                return true;
            }
        }
        if (z10 || this.f12263g.f12371u <= 0) {
            return false;
        }
        long jM160i2 = AbstractC0071d.m160i(j11);
        int i14 = this.f12263g.f12371u;
        if (jM160i2 <= i14) {
            return false;
        }
        InterfaceC10322a interfaceC10322a8 = PictureSelectionConfig.f12293N0;
        m9271P0(getString(R$string.ps_select_video_max_second, Integer.valueOf(i14 / 1000)));
        return true;
    }

    /* renamed from: D0 */
    public final void m9249D0() {
        SoundPool soundPool = this.f12265i;
        if (soundPool == null || !this.f12263g.f12324N) {
            return;
        }
        soundPool.play(this.f12266j, 0.1f, 0.5f, 0, 1, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public int m9250E(LocalMedia localMedia, boolean z10) {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        if (m9284b0(localMedia, z10) != 200) {
            return -1;
        }
        ArrayList arrayListM25306n = AbstractC11370a.m25306n();
        int i10 = 1;
        if (z10) {
            arrayListM25306n.remove(localMedia);
        } else {
            if (this.f12263g.f12353l == 1 && arrayListM25306n.size() > 0) {
                m9254G0((LocalMedia) arrayListM25306n.get(0));
                arrayListM25306n.clear();
            }
            arrayListM25306n.add(localMedia);
            localMedia.m9378j0(arrayListM25306n.size());
            m9249D0();
            i10 = 0;
        }
        m9256H0(i10 ^ 1, localMedia);
        return i10;
    }

    /* renamed from: E0 */
    public final void m9251E0() {
        try {
            SoundPool soundPool = this.f12265i;
            if (soundPool != null) {
                soundPool.release();
                this.f12265i = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: F */
    public final void m9252F(ArrayList arrayList) {
        m9270O0();
        PictureThreadUtils.m9584h(new C7475e(arrayList));
    }

    /* renamed from: F0 */
    public void mo8948F0(boolean z10) {
    }

    /* renamed from: G */
    public final void m9253G() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f12263g.f12335Y) || !AbstractC10149c.m21174c(this.f12263g.f12342f0)) {
                return;
            }
            InputStream inputStreamM19892a = AbstractC9820b.m19892a(getContext(), Uri.parse(this.f12263g.f12342f0));
            if (TextUtils.isEmpty(this.f12263g.f12333W)) {
                str = "";
            } else {
                PictureSelectionConfig pictureSelectionConfig = this.f12263g;
                if (pictureSelectionConfig.f12338d) {
                    str = pictureSelectionConfig.f12333W;
                } else {
                    str = System.currentTimeMillis() + BundleUtil.UNDERLINE_TAG + this.f12263g.f12333W;
                }
            }
            Context context = getContext();
            PictureSelectionConfig pictureSelectionConfig2 = this.f12263g;
            File fileM197b = AbstractC0076i.m197b(context, pictureSelectionConfig2.f12337c, str, "", pictureSelectionConfig2.f12335Y);
            if (AbstractC0076i.m212q(inputStreamM19892a, new FileOutputStream(fileM197b.getAbsolutePath()))) {
                AbstractC0075h.m179b(getContext(), this.f12263g.f12342f0);
                this.f12263g.f12342f0 = fileM197b.getAbsolutePath();
            }
        } catch (FileNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: G0 */
    public void m9254G0(LocalMedia localMedia) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).mo8979n0(localMedia);
            }
        }
    }

    /* renamed from: H */
    public final void m9255H() {
        if (PictureSelectionConfig.m9328c().f12380y0) {
            C9685b.m19172c().mo19170a();
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: H0 */
    public void m9256H0(boolean z10, LocalMedia localMedia) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).mo8988x0(z10, localMedia);
            }
        }
    }

    /* renamed from: I */
    public final void m9257I() {
        if (PictureSelectionConfig.f12293N0 == null) {
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: I0 */
    public void m9258I0() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).mo8971g0();
            }
        }
    }

    /* renamed from: J */
    public final void m9259J() {
        if (PictureSelectionConfig.m9328c().f12376w0) {
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: J0 */
    public void m9260J0(long j10) {
        this.f12267k = j10;
    }

    /* renamed from: K */
    public final void m9261K() {
        if (PictureSelectionConfig.m9328c().f12382z0) {
            C9685b.m19172c().mo19170a();
        }
        if (PictureSelectionConfig.m9328c().f12299A0) {
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: K0 */
    public void m9262K0(InterfaceC11708c interfaceC11708c) {
        this.f12260d = interfaceC11708c;
    }

    /* renamed from: L */
    public final void m9263L() {
        if (PictureSelectionConfig.m9328c().f12374v0 && PictureSelectionConfig.f12296Q0 == null) {
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: L0 */
    public void m9264L0() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        getActivity().setRequestedOrientation(this.f12263g.f12349j);
    }

    /* renamed from: M */
    public final void m9265M() {
        if (PictureSelectionConfig.m9328c().f12301B0) {
            C9685b.m19172c().mo19170a();
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: M0 */
    public void m9266M0(View view) {
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new ViewOnKeyListenerC7476f());
    }

    /* renamed from: N */
    public final void m9267N() {
        if (PictureSelectionConfig.f12294O0 == null) {
            C9685b.m19172c().mo19170a();
        }
    }

    /* renamed from: N0 */
    public final void m9268N0() {
        if (this.f12263g.f12320L) {
            AbstractC10632a.m22484c(getActivity(), PictureSelectionConfig.f12295P0.m26627c().m9525V());
        }
    }

    /* renamed from: O */
    public void m9269O() {
        try {
            if (!AbstractC0068a.m142c(getActivity()) && this.f12264h.isShowing()) {
                this.f12264h.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: O0 */
    public void m9270O0() {
        try {
            if (AbstractC0068a.m142c(getActivity()) || this.f12264h.isShowing()) {
                return;
            }
            this.f12264h.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: P */
    public void mo8902P(LocalMedia localMedia) {
    }

    /* renamed from: P0 */
    public final void m9271P0(String str) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        try {
            Dialog dialog = this.f12268l;
            if (dialog == null || !dialog.isShowing()) {
                DialogC10206c dialogC10206cM21333a = DialogC10206c.m21333a(getContext(), str);
                this.f12268l = dialogC10206cM21333a;
                dialogC10206cM21333a.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: Q */
    public final void m9272Q(Intent intent) {
        PictureThreadUtils.m9584h(new C7481k(intent));
    }

    /* renamed from: Q0 */
    public void m9273Q0() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        m9296s0(false, null);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.m9470c(getContext());
            Uri uriM174c = AbstractC0074g.m174c(getContext(), this.f12263g);
            if (uriM174c != null) {
                if (this.f12263g.f12351k) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                }
                intent.putExtra("output", uriM174c);
                startActivityForResult(intent, 909);
            }
        }
    }

    /* renamed from: R */
    public void m9274R() {
        if (m9299u()) {
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC11370a.m25306n());
        if (m9303w()) {
            m9290i0(arrayList);
            return;
        }
        if (m9306y()) {
            m9294r0(arrayList);
            return;
        }
        if (m9301v()) {
            m9289h0(arrayList);
        } else if (m9305x()) {
            m9292q0(arrayList);
        } else {
            m9300u0(arrayList);
        }
    }

    /* renamed from: R0 */
    public void m9275R0() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        m9296s0(false, null);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            ForegroundService.m9470c(getContext());
            Uri uriM175d = AbstractC0074g.m175d(getContext(), this.f12263g);
            if (uriM175d != null) {
                intent.putExtra("output", uriM175d);
                if (this.f12263g.f12351k) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                }
                intent.putExtra("android.intent.extra.quickCapture", this.f12263g.f12360o0);
                intent.putExtra("android.intent.extra.durationLimit", this.f12263g.f12375w);
                intent.putExtra("android.intent.extra.videoQuality", this.f12263g.f12365r);
                startActivityForResult(intent, 909);
            }
        }
    }

    /* renamed from: S */
    public final void m9276S(ArrayList arrayList) {
        m9270O0();
        if (m9297t()) {
            m9293r(arrayList);
        } else if (m9246C()) {
            m9279T0(arrayList);
        } else {
            m9288f0(arrayList);
        }
    }

    /* renamed from: S0 */
    public final void m9277S0(ArrayList arrayList) {
        m9270O0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
            concurrentHashMap.put(localMedia.m9401x(), localMedia);
        }
        if (concurrentHashMap.size() == 0) {
            m9276S(arrayList);
        } else {
            PictureThreadUtils.m9584h(new C7474d(concurrentHashMap, arrayList));
        }
    }

    /* renamed from: T */
    public final void m9278T(ArrayList arrayList) {
        if (m9246C()) {
            m9279T0(arrayList);
        } else {
            m9288f0(arrayList);
        }
    }

    /* renamed from: T0 */
    public final void m9279T0(ArrayList arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
            String strM9371g = localMedia.m9371g();
            if (AbstractC10149c.m21180i(localMedia.m9397t()) || AbstractC10149c.m21183l(strM9371g)) {
                concurrentHashMap.put(strM9371g, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            m9288f0(arrayList);
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            getContext();
            new C7472b(concurrentHashMap, arrayList);
            throw null;
        }
    }

    /* renamed from: U */
    public long m9280U() {
        long j10 = this.f12267k;
        if (j10 > 50) {
            j10 -= 50;
        }
        if (j10 >= 0) {
            return j10;
        }
        return 0L;
    }

    /* renamed from: V */
    public String m9281V(Intent intent) {
        Uri uri;
        if (intent == null || (uri = (Uri) intent.getParcelableExtra("output")) == null) {
            return null;
        }
        return AbstractC10149c.m21174c(uri.toString()) ? uri.toString() : uri.getPath();
    }

    /* renamed from: W */
    public int mo8903W() {
        return 0;
    }

    /* renamed from: Y */
    public void m9282Y(String[] strArr) {
        AbstractC11707b.f27816a = strArr;
        boolean z10 = false;
        if (strArr != null && strArr.length > 0) {
            AbstractC0081n.m224b(getContext(), strArr[0], true);
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        if (!this.f12263g.f12317J0) {
            AbstractC11709d.m25886a(this, 1102);
            return;
        }
        if (strArr != null && strArr.length > 0) {
            boolean z11 = false;
            for (String str : strArr) {
                z11 = TextUtils.equals(str, "android.permission.READ_EXTERNAL_STORAGE") || TextUtils.equals(str, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            z10 = z11;
        }
        AbstractC11709d.m25887b(this, z10, 1102);
    }

    /* renamed from: Z */
    public void mo8904Z(String[] strArr) {
    }

    /* renamed from: a0 */
    public void m9283a0() {
        PictureSelectionConfig pictureSelectionConfigM9328c = PictureSelectionConfig.m9328c();
        if (pictureSelectionConfigM9328c.f12304D != -2) {
            AbstractC10910b.m23751d(getActivity(), pictureSelectionConfigM9328c.f12304D);
        }
    }

    /* renamed from: b0 */
    public int m9284b0(LocalMedia localMedia, boolean z10) {
        String strM9397t = localMedia.m9397t();
        long jM9389p = localMedia.m9389p();
        long jM9341B = localMedia.m9341B();
        ArrayList arrayListM25306n = AbstractC11370a.m25306n();
        if (!this.f12263g.f12327Q) {
            return m9242A(z10, strM9397t, AbstractC11370a.m25307o(), jM9341B, jM9389p) ? -1 : 200;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayListM25306n.size(); i11++) {
            if (AbstractC10149c.m21180i(((LocalMedia) arrayListM25306n.get(i11)).m9397t())) {
                i10++;
            }
        }
        return m9248D(z10, strM9397t, i10, jM9341B, jM9389p) ? -1 : 200;
    }

    /* renamed from: c0 */
    public boolean m9285c0() {
        return (getActivity() instanceof PictureSelectorSupporterActivity) || (getActivity() instanceof PictureSelectorTransparentActivity);
    }

    /* renamed from: d0 */
    public final void m9286d0(ArrayList arrayList) {
        if (this.f12263g.f12330T) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
                localMedia.m9380k0(true);
                localMedia.m9382l0(localMedia.m9401x());
            }
        }
    }

    /* renamed from: e0 */
    public void m9287e0() {
        if (!AbstractC0068a.m142c(getActivity()) && !isStateSaved()) {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            getActivity().getSupportFragmentManager().popBackStack();
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        for (int i10 = 0; i10 < fragments.size(); i10++) {
            Fragment fragment = fragments.get(i10);
            if (fragment instanceof PictureCommonFragment) {
                ((PictureCommonFragment) fragment).mo8981o0();
            }
        }
    }

    /* renamed from: f0 */
    public final void m9288f0(ArrayList arrayList) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        m9269O();
        if (this.f12263g.f12378x0) {
            getActivity().setResult(-1, C9824f.m19902e(arrayList));
            m9304w0(-1, arrayList);
        } else {
            InterfaceC10752l interfaceC10752l = PictureSelectionConfig.f12296Q0;
            if (interfaceC10752l != null) {
                interfaceC10752l.mo6615a(arrayList);
            }
        }
        mo9083m0();
    }

    /* renamed from: g0 */
    public void mo8971g0() {
    }

    /* renamed from: h0 */
    public void m9289h0(ArrayList arrayList) {
        m9270O0();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
            if (AbstractC10149c.m21179h(localMedia.m9397t())) {
                String strM9371g = localMedia.m9371g();
                arrayList2.add(AbstractC10149c.m21174c(strM9371g) ? Uri.parse(strM9371g) : Uri.fromFile(new File(strM9371g)));
                concurrentHashMap.put(strM9371g, localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            m9300u0(arrayList);
            return;
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        getContext();
        new C7482l(arrayList, concurrentHashMap);
        throw null;
    }

    /* renamed from: i0 */
    public void m9290i0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Uri uriFromFile = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
            arrayList2.add(localMedia.m9371g());
            if (uriFromFile == null && AbstractC10149c.m21179h(localMedia.m9397t())) {
                String strM9371g = localMedia.m9371g();
                uriFromFile = (AbstractC10149c.m21174c(strM9371g) || AbstractC10149c.m21178g(strM9371g)) ? Uri.parse(strM9371g) : Uri.fromFile(new File(strM9371g));
                Uri.fromFile(new File(requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath(), AbstractC0071d.m154c("CROP_") + ".jpg"));
            }
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        throw null;
    }

    /* renamed from: j0 */
    public void mo9078j0(Intent intent) {
    }

    /* renamed from: k0 */
    public void m9291k0() {
    }

    /* renamed from: l0 */
    public void mo9081l0() {
    }

    /* renamed from: m0 */
    public void mo9083m0() {
        if (!AbstractC0068a.m142c(getActivity())) {
            if (m9285c0()) {
                InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                getActivity().finish();
            } else {
                List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
                for (int i10 = 0; i10 < fragments.size(); i10++) {
                    if (fragments.get(i10) instanceof PictureCommonFragment) {
                        m9287e0();
                    }
                }
            }
        }
        PictureSelectionConfig.m9326a();
    }

    /* renamed from: n0 */
    public void mo8979n0(LocalMedia localMedia) {
    }

    /* renamed from: o0 */
    public void mo8981o0() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        ForegroundService.m9471d(getContext());
        if (i11 != -1) {
            if (i11 == 96) {
                Throwable thM21163a = intent != null ? AbstractC10147a.m21163a(intent) : new Throwable("image crop error");
                if (thM21163a != null) {
                    AbstractC0083p.m235c(getContext(), thM21163a.getMessage());
                    return;
                }
                return;
            }
            if (i11 == 0) {
                if (i10 == 909) {
                    AbstractC0075h.m179b(getContext(), this.f12263g.f12342f0);
                    return;
                } else {
                    if (i10 == 1102) {
                        mo8904Z(AbstractC11707b.f27816a);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i10 == 909) {
            m9272Q(intent);
            return;
        }
        if (i10 == 696) {
            mo9078j0(intent);
            return;
        }
        if (i10 == 69) {
            ArrayList arrayListM25306n = AbstractC11370a.m25306n();
            try {
                if (arrayListM25306n.size() == 1) {
                    LocalMedia localMedia = (LocalMedia) arrayListM25306n.get(0);
                    Uri uriM21164b = AbstractC10147a.m21164b(intent);
                    localMedia.m9364Z(uriM21164b != null ? uriM21164b.getPath() : "");
                    localMedia.m9363Y(!TextUtils.isEmpty(localMedia.m9385n()));
                    localMedia.m9358T(AbstractC10147a.m21170h(intent));
                    localMedia.m9357S(AbstractC10147a.m21167e(intent));
                    localMedia.m9359U(AbstractC10147a.m21168f(intent));
                    localMedia.m9360V(AbstractC10147a.m21169g(intent));
                    localMedia.m9361W(AbstractC10147a.m21165c(intent));
                    localMedia.m9362X(AbstractC10147a.m21166d(intent));
                    localMedia.m9392q0(localMedia.m9385n());
                } else {
                    String stringExtra = intent.getStringExtra("output");
                    if (TextUtils.isEmpty(stringExtra)) {
                        stringExtra = intent.getStringExtra("com.yalantis.ucrop.OutputUri");
                    }
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    if (jSONArray.length() == arrayListM25306n.size()) {
                        for (int i12 = 0; i12 < arrayListM25306n.size(); i12++) {
                            LocalMedia localMedia2 = (LocalMedia) arrayListM25306n.get(i12);
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                            localMedia2.m9364Z(jSONObjectOptJSONObject.optString("outPutPath"));
                            localMedia2.m9363Y(!TextUtils.isEmpty(localMedia2.m9385n()));
                            localMedia2.m9358T(jSONObjectOptJSONObject.optInt("imageWidth"));
                            localMedia2.m9357S(jSONObjectOptJSONObject.optInt("imageHeight"));
                            localMedia2.m9359U(jSONObjectOptJSONObject.optInt("offsetX"));
                            localMedia2.m9360V(jSONObjectOptJSONObject.optInt("offsetY"));
                            localMedia2.m9361W((float) jSONObjectOptJSONObject.optDouble("aspectRatio"));
                            localMedia2.m9362X(jSONObjectOptJSONObject.optString("customExtraData"));
                            localMedia2.m9392q0(localMedia2.m9385n());
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC0083p.m235c(getContext(), e10.getMessage());
            }
            ArrayList arrayList = new ArrayList(arrayListM25306n);
            if (m9301v()) {
                m9289h0(arrayList);
            } else if (m9305x()) {
                m9292q0(arrayList);
            } else {
                m9300u0(arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        m9283a0();
        m9298t0();
        super.onAttach(context);
        getParentFragment();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9283a0();
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        PictureWindowAnimationStyle pictureWindowAnimationStyleM26629e = PictureSelectionConfig.f12295P0.m26629e();
        if (!z10) {
            Animation animationLoadAnimation = pictureWindowAnimationStyleM26629e.f12500d != 0 ? AnimationUtils.loadAnimation(getContext(), pictureWindowAnimationStyleM26629e.f12500d) : AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_alpha_exit);
            mo9081l0();
            return animationLoadAnimation;
        }
        Animation animationLoadAnimation2 = pictureWindowAnimationStyleM26629e.f12499c != 0 ? AnimationUtils.loadAnimation(getContext(), pictureWindowAnimationStyleM26629e.f12499c) : AnimationUtils.loadAnimation(getContext(), R$anim.ps_anim_alpha_enter);
        m9260J0(animationLoadAnimation2.getDuration());
        m9291k0();
        return animationLoadAnimation2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return mo8903W() != 0 ? layoutInflater.inflate(mo8903W(), viewGroup, false) : super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m9251E0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (this.f12260d != null) {
            C11706a.m25878b().m25883g(iArr, this.f12260d);
            this.f12260d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig != null) {
            bundle.putParcelable("com.luck.picture.lib.PictureSelectorConfig", pictureSelectionConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f12264h = new DialogC10205b(getContext());
        if (bundle != null) {
            this.f12263g = (PictureSelectionConfig) bundle.getParcelable("com.luck.picture.lib.PictureSelectorConfig");
        }
        if (this.f12263g == null) {
            this.f12263g = PictureSelectionConfig.m9328c();
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        m9264L0();
        m9268N0();
        m9266M0(requireView());
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (!pictureSelectionConfig.f12324N || pictureSelectionConfig.f12338d) {
            return;
        }
        SoundPool soundPool = new SoundPool(1, 3, 0);
        this.f12265i = soundPool;
        this.f12266j = soundPool.load(getContext(), R$raw.ps_click_music, 1);
    }

    /* renamed from: p0 */
    public void mo9087p0() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (this.f12263g.f12378x0) {
            getActivity().setResult(0);
            m9304w0(0, null);
        } else {
            InterfaceC10752l interfaceC10752l = PictureSelectionConfig.f12296Q0;
            if (interfaceC10752l != null) {
                interfaceC10752l.onCancel();
            }
        }
        mo9083m0();
    }

    /* renamed from: q0 */
    public void m9292q0(ArrayList arrayList) {
        m9270O0();
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        getContext();
        new C7471a();
        throw null;
    }

    /* renamed from: r */
    public final void m9293r(ArrayList arrayList) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
            if (!AbstractC10149c.m21175d(localMedia.m9397t())) {
                concurrentHashMap.put(localMedia.m9371g(), localMedia);
            }
        }
        if (concurrentHashMap.size() == 0) {
            m9278T(arrayList);
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LocalMedia localMedia2 = (LocalMedia) entry.getValue();
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            getContext();
            localMedia2.m9397t();
            new C7473c(arrayList, concurrentHashMap);
            throw null;
        }
    }

    /* renamed from: r0 */
    public void m9294r0(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (AbstractC10149c.m21179h(((LocalMedia) arrayList.get(i10)).m9397t())) {
                break;
            }
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        throw null;
    }

    /* renamed from: s */
    public LocalMedia m9295s(String str) throws Throwable {
        LocalMedia localMediaM9339c = LocalMedia.m9339c(getContext(), str);
        localMediaM9339c.m9356R(this.f12263g.f12337c);
        if (!AbstractC0077j.m217e() || AbstractC10149c.m21174c(str)) {
            localMediaM9339c.m9392q0(null);
        } else {
            localMediaM9339c.m9392q0(str);
        }
        if (this.f12263g.f12362p0 && AbstractC10149c.m21179h(localMediaM9339c.m9397t())) {
            AbstractC0070c.m149e(getContext(), str);
        }
        return localMediaM9339c;
    }

    /* renamed from: s0 */
    public void m9296s0(boolean z10, String[] strArr) {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
    }

    /* renamed from: t */
    public boolean m9297t() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: t0 */
    public void m9298t0() {
        m9257I();
        m9267N();
        m9255H();
        m9265M();
        m9261K();
        m9263L();
        m9259J();
    }

    /* renamed from: u */
    public final boolean m9299u() {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12353l == 2 && !pictureSelectionConfig.f12338d) {
            if (pictureSelectionConfig.f12327Q) {
                ArrayList arrayListM25306n = AbstractC11370a.m25306n();
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < arrayListM25306n.size(); i12++) {
                    if (AbstractC10149c.m21180i(((LocalMedia) arrayListM25306n.get(i12)).m9397t())) {
                        i11++;
                    } else {
                        i10++;
                    }
                }
                PictureSelectionConfig pictureSelectionConfig2 = this.f12263g;
                int i13 = pictureSelectionConfig2.f12357n;
                if (i13 > 0 && i10 < i13) {
                    InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                    getContext();
                    throw null;
                }
                int i14 = pictureSelectionConfig2.f12361p;
                if (i14 > 0 && i11 < i14) {
                    InterfaceC10322a interfaceC10322a2 = PictureSelectionConfig.f12293N0;
                    getContext();
                    throw null;
                }
            } else {
                String strM25307o = AbstractC11370a.m25307o();
                if (AbstractC10149c.m21179h(strM25307o) && this.f12263g.f12357n > 0) {
                    int iM25304l = AbstractC11370a.m25304l();
                    int i15 = this.f12263g.f12357n;
                    if (iM25304l < i15) {
                        InterfaceC10322a interfaceC10322a3 = PictureSelectionConfig.f12293N0;
                        m9271P0(getString(R$string.ps_min_img_num, String.valueOf(i15)));
                        return true;
                    }
                }
                if (AbstractC10149c.m21180i(strM25307o) && this.f12263g.f12361p > 0) {
                    int iM25304l2 = AbstractC11370a.m25304l();
                    int i16 = this.f12263g.f12361p;
                    if (iM25304l2 < i16) {
                        InterfaceC10322a interfaceC10322a4 = PictureSelectionConfig.f12293N0;
                        m9271P0(getString(R$string.ps_min_video_num, String.valueOf(i16)));
                        return true;
                    }
                }
                if (AbstractC10149c.m21175d(strM25307o) && this.f12263g.f12363q > 0) {
                    int iM25304l3 = AbstractC11370a.m25304l();
                    int i17 = this.f12263g.f12363q;
                    if (iM25304l3 < i17) {
                        InterfaceC10322a interfaceC10322a5 = PictureSelectionConfig.f12293N0;
                        m9271P0(getString(R$string.ps_min_audio_num, String.valueOf(i17)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: u0 */
    public void m9300u0(ArrayList arrayList) {
        if (m9244B()) {
            m9277S0(arrayList);
        } else if (m9308z()) {
            m9252F(arrayList);
        } else {
            m9286d0(arrayList);
            m9276S(arrayList);
        }
    }

    /* renamed from: v */
    public boolean m9301v() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: v0 */
    public final void m9302v0(LocalMedia localMedia) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (AbstractC0077j.m217e()) {
            if (AbstractC10149c.m21180i(localMedia.m9397t()) && AbstractC10149c.m21174c(this.f12263g.f12342f0)) {
                new C9822d(getActivity(), localMedia.m9403z());
                return;
            }
            return;
        }
        String strM9403z = AbstractC10149c.m21174c(this.f12263g.f12342f0) ? localMedia.m9403z() : this.f12263g.f12342f0;
        new C9822d(getActivity(), strM9403z);
        if (AbstractC10149c.m21179h(localMedia.m9397t())) {
            int iM182e = AbstractC0075h.m182e(getContext(), new File(strM9403z).getParent());
            if (iM182e != -1) {
                AbstractC0075h.m191n(getContext(), iM182e);
            }
        }
    }

    /* renamed from: w */
    public boolean m9303w() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: w0 */
    public void m9304w0(int i10, ArrayList arrayList) {
    }

    /* renamed from: x */
    public boolean m9305x() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: x0 */
    public void mo8988x0(boolean z10, LocalMedia localMedia) {
    }

    /* renamed from: y */
    public boolean m9306y() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: y0 */
    public void m9307y0() {
        PhotoItemSelectedDialog photoItemSelectedDialogM9332p = PhotoItemSelectedDialog.m9332p();
        photoItemSelectedDialogM9332p.m9335r(new C7477g());
        photoItemSelectedDialogM9332p.m9334q(new C7478h());
        photoItemSelectedDialogM9332p.show(getChildFragmentManager(), "PhotoItemSelectedDialog");
    }

    /* renamed from: z */
    public boolean m9308z() {
        if (!AbstractC0077j.m217e()) {
            return false;
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return false;
    }

    /* renamed from: z0 */
    public void m9309z0() {
        String[] strArr = AbstractC11707b.f27819d;
        m9296s0(true, strArr);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        C11706a.m25878b().m25885i(this, strArr, new C7479i());
    }
}
