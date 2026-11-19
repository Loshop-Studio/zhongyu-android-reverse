package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.MediaStore;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import com.canhub.cropper.C5486c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8809v;

/* renamed from: com.canhub.cropper.c */
/* loaded from: classes3.dex */
public final class C5486c {

    /* renamed from: g */
    public static final a f3608g = new a(null);

    /* renamed from: a */
    public final ComponentActivity f3609a;

    /* renamed from: b */
    public final b f3610b;

    /* renamed from: c */
    public String f3611c;

    /* renamed from: d */
    public List f3612d;

    /* renamed from: e */
    public Uri f3613e;

    /* renamed from: f */
    public final ActivityResultLauncher f3614f;

    /* renamed from: com.canhub.cropper.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.canhub.cropper.c$b */
    public interface b {
        /* renamed from: a */
        void mo3268a(Uri uri);

        /* renamed from: b */
        void mo3269b();
    }

    public C5486c(ComponentActivity activity, b callback) {
        AbstractC9133u.m16133g(activity, "activity");
        AbstractC9133u.m16133g(callback, "callback");
        this.f3609a = activity;
        this.f3610b = callback;
        String string = activity.getString(R$string.pick_image_chooser_title);
        AbstractC9133u.m16132f(string, "getString(...)");
        this.f3611c = string;
        this.f3612d = AbstractC8809v.m14774q("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f3614f = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: j0.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5486c.m3399e(this.f17185a, (ActivityResult) obj);
            }
        });
    }

    /* renamed from: e */
    public static final void m3399e(C5486c this$0, ActivityResult activityRes) {
        Uri data;
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(activityRes, "activityRes");
        if (activityRes.getResultCode() != -1) {
            this$0.f3610b.mo3269b();
            return;
        }
        Intent data2 = activityRes.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            data = this$0.f3613e;
        }
        this$0.f3610b.mo3268a(data);
    }

    /* renamed from: b */
    public final List m3400b(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC9133u.m16130d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (context instanceof Activity) {
                ((Activity) context).grantUriPermission(resolveInfo.activityInfo.packageName, this.f3613e, 3);
            }
            intent2.putExtra("output", this.f3613e);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m3401c(PackageManager packageManager, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Intent intent = AbstractC9133u.m16128b(str, "android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC9133u.m16130d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f3612d) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9133u.m16128b(((Intent) next).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) next;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m3402d(Context context) {
        String packageName = context.getPackageName();
        try {
            String[] strArr = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(packageName, 4096)).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null && AbstractC8687z.m14093A(str, "android.permission.CAMERA", true)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public final boolean m3403f(Context context) {
        return m3402d(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    /* renamed from: g */
    public final C5486c m3404g(String title) {
        AbstractC9133u.m16133g(title, "title");
        this.f3611c = title;
        return this;
    }

    /* renamed from: h */
    public final C5486c m3405h(List appsList) {
        AbstractC9133u.m16133g(appsList, "appsList");
        this.f3612d = appsList;
        return this;
    }

    /* renamed from: i */
    public final void m3406i(boolean z10, boolean z11, Uri uri) {
        Intent intent;
        this.f3613e = uri;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f3609a.getPackageManager();
        if (!m3403f(this.f3609a) && z10) {
            ComponentActivity componentActivity = this.f3609a;
            AbstractC9133u.m16130d(packageManager);
            arrayList.addAll(m3400b(componentActivity, packageManager));
        }
        if (z11) {
            AbstractC9133u.m16130d(packageManager);
            List listM3401c = m3401c(packageManager, "android.intent.action.GET_CONTENT");
            if (listM3401c.isEmpty()) {
                listM3401c = m3401c(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(listM3401c);
        }
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            Intent intent2 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z11) {
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
            }
            intent = intent2;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, this.f3611c);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        ActivityResultLauncher activityResultLauncher = this.f3614f;
        AbstractC9133u.m16130d(intentCreateChooser);
        activityResultLauncher.launch(intentCreateChooser);
    }
}
