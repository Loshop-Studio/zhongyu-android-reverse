package com.luck.picture.lib;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import java.util.List;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0083p;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p359u6.AbstractC11370a;
import p387w6.AbstractC11707b;
import p387w6.C11706a;
import p387w6.InterfaceC11708c;

/* loaded from: classes5.dex */
public class PictureSelectorSystemFragment extends PictureCommonFragment {

    /* renamed from: q */
    public static final String f12131q = "PictureSelectorSystemFragment";

    /* renamed from: m */
    public ActivityResultLauncher f12132m;

    /* renamed from: n */
    public ActivityResultLauncher f12133n;

    /* renamed from: o */
    public ActivityResultLauncher f12134o;

    /* renamed from: p */
    public ActivityResultLauncher f12135p;

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$a */
    public class C7429a implements ActivityResultCallback {
        public C7429a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.mo9087p0();
                return;
            }
            LocalMedia localMediaM9295s = PictureSelectorSystemFragment.this.m9295s(uri.toString());
            localMediaM9295s.m9386n0(AbstractC0077j.m217e() ? localMediaM9295s.m9401x() : localMediaM9295s.m9403z());
            if (PictureSelectorSystemFragment.this.m9250E(localMediaM9295s, false) == 0) {
                PictureSelectorSystemFragment.this.m9274R();
            } else {
                PictureSelectorSystemFragment.this.mo9087p0();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$b */
    public class C7430b implements InterfaceC11708c {
        public C7430b() {
        }

        @Override // p387w6.InterfaceC11708c
        public void onDenied() {
            PictureSelectorSystemFragment.this.m9282Y(AbstractC11707b.f27817b);
        }

        @Override // p387w6.InterfaceC11708c
        public void onGranted() {
            PictureSelectorSystemFragment.this.m9123k1();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$c */
    public class C7431c extends ActivityResultContract {
        public C7431c() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType(str);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List parseResult(int i10, Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        arrayList.add(clipData.getItemAt(i11).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$d */
    public class C7432d implements ActivityResultCallback {
        public C7432d() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.mo9087p0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaM9295s = PictureSelectorSystemFragment.this.m9295s(((Uri) list.get(i10)).toString());
                localMediaM9295s.m9386n0(AbstractC0077j.m217e() ? localMediaM9295s.m9401x() : localMediaM9295s.m9403z());
                AbstractC11370a.m25295c(localMediaM9295s);
            }
            PictureSelectorSystemFragment.this.m9274R();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$e */
    public class C7433e extends ActivityResultContract {
        public C7433e() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType(str);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$f */
    public class C7434f implements ActivityResultCallback {
        public C7434f() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Uri uri) throws Throwable {
            if (uri == null) {
                PictureSelectorSystemFragment.this.mo9087p0();
                return;
            }
            LocalMedia localMediaM9295s = PictureSelectorSystemFragment.this.m9295s(uri.toString());
            localMediaM9295s.m9386n0(AbstractC0077j.m217e() ? localMediaM9295s.m9401x() : localMediaM9295s.m9403z());
            if (PictureSelectorSystemFragment.this.m9250E(localMediaM9295s, false) == 0) {
                PictureSelectorSystemFragment.this.m9274R();
            } else {
                PictureSelectorSystemFragment.this.mo9087p0();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$g */
    public class C7435g extends ActivityResultContract {
        public C7435g() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            Intent intent = TextUtils.equals("video/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public List parseResult(int i10, Intent intent) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    int itemCount = clipData.getItemCount();
                    for (int i11 = 0; i11 < itemCount; i11++) {
                        arrayList.add(clipData.getItemAt(i11).getUri());
                    }
                } else if (intent.getData() != null) {
                    arrayList.add(intent.getData());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$h */
    public class C7436h implements ActivityResultCallback {
        public C7436h() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(List list) throws Throwable {
            if (list == null || list.size() == 0) {
                PictureSelectorSystemFragment.this.mo9087p0();
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                LocalMedia localMediaM9295s = PictureSelectorSystemFragment.this.m9295s(((Uri) list.get(i10)).toString());
                localMediaM9295s.m9386n0(AbstractC0077j.m217e() ? localMediaM9295s.m9401x() : localMediaM9295s.m9403z());
                AbstractC11370a.m25295c(localMediaM9295s);
            }
            PictureSelectorSystemFragment.this.m9274R();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorSystemFragment$i */
    public class C7437i extends ActivityResultContract {
        public C7437i() {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            return TextUtils.equals("video/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : TextUtils.equals("audio/*", str) ? new Intent("android.intent.action.PICK", MediaStore.Audio.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Uri parseResult(int i10, Intent intent) {
            if (intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* renamed from: j1 */
    public static PictureSelectorSystemFragment m9116j1() {
        return new PictureSelectorSystemFragment();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: W */
    public int mo8903W() {
        return R$layout.ps_empty;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: Z */
    public void mo8904Z(String[] strArr) {
        m9296s0(false, null);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        if ((AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25880d(getContext())) {
            m9123k1();
        } else {
            AbstractC0083p.m235c(getContext(), getString(R$string.ps_jurisdiction));
            mo9087p0();
        }
        AbstractC11707b.f27816a = new String[0];
    }

    /* renamed from: d1 */
    public final void m9117d1() {
        this.f12135p = registerForActivityResult(new C7437i(), new C7429a());
    }

    /* renamed from: e1 */
    public final void m9118e1() {
        this.f12134o = registerForActivityResult(new C7435g(), new C7436h());
    }

    /* renamed from: f1 */
    public final void m9119f1() {
        this.f12132m = registerForActivityResult(new C7431c(), new C7432d());
    }

    /* renamed from: g1 */
    public final void m9120g1() {
        this.f12133n = registerForActivityResult(new C7433e(), new C7434f());
    }

    /* renamed from: h1 */
    public final void m9121h1() {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12353l == 1) {
            if (pictureSelectionConfig.f12337c == AbstractC10150d.m21190a()) {
                m9120g1();
                return;
            } else {
                m9117d1();
                return;
            }
        }
        if (pictureSelectionConfig.f12337c == AbstractC10150d.m21190a()) {
            m9119f1();
        } else {
            m9118e1();
        }
    }

    /* renamed from: i1 */
    public final String m9122i1() {
        return this.f12263g.f12337c == AbstractC10150d.m21193d() ? "video/*" : this.f12263g.f12337c == AbstractC10150d.m21191b() ? "audio/*" : "image/*";
    }

    /* renamed from: k1 */
    public final void m9123k1() {
        m9296s0(false, null);
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12353l == 1) {
            if (pictureSelectionConfig.f12337c == AbstractC10150d.m21190a()) {
                this.f12133n.launch("image/*,video/*");
                return;
            } else {
                this.f12135p.launch(m9122i1());
                return;
            }
        }
        if (pictureSelectionConfig.f12337c == AbstractC10150d.m21190a()) {
            this.f12132m.launch("image/*,video/*");
        } else {
            this.f12134o.launch(m9122i1());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            mo9087p0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher activityResultLauncher = this.f12132m;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.f12133n;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        ActivityResultLauncher activityResultLauncher3 = this.f12134o;
        if (activityResultLauncher3 != null) {
            activityResultLauncher3.unregister();
        }
        ActivityResultLauncher activityResultLauncher4 = this.f12135p;
        if (activityResultLauncher4 != null) {
            activityResultLauncher4.unregister();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m9121h1();
        if ((AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25880d(getContext())) {
            m9123k1();
            return;
        }
        String[] strArr = AbstractC11707b.f27817b;
        m9296s0(true, strArr);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        C11706a.m25878b().m25885i(this, strArr, new C7430b());
    }
}
