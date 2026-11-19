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
import com.canhub.cropper.C5905c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;

/* renamed from: com.canhub.cropper.c */
/* loaded from: classes3.dex */
public final class C5905c {

    /* renamed from: g */
    public static final a f5378g = new a(null);

    /* renamed from: a */
    public final ComponentActivity f5379a;

    /* renamed from: b */
    public final b f5380b;

    /* renamed from: c */
    public String f5381c;

    /* renamed from: d */
    public List f5382d;

    /* renamed from: e */
    public Uri f5383e;

    /* renamed from: f */
    public final ActivityResultLauncher f5384f;

    /* renamed from: com.canhub.cropper.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.canhub.cropper.c$b */
    public interface b {
        /* renamed from: a */
        void mo4469a(Uri uri);

        /* renamed from: b */
        void mo4470b();
    }

    public C5905c(ComponentActivity activity, b callback) {
        AbstractC9979u.m20294g(activity, "activity");
        AbstractC9979u.m20294g(callback, "callback");
        this.f5379a = activity;
        this.f5380b = callback;
        String string = activity.getString(R$string.pick_image_chooser_title);
        AbstractC9979u.m20293f(string, "getString(...)");
        this.f5381c = string;
        this.f5382d = AbstractC10978w.m24139q("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f5384f = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: f1.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5905c.m4601e(this.f21402a, (ActivityResult) obj);
            }
        });
    }

    /* renamed from: e */
    public static final void m4601e(C5905c this$0, ActivityResult activityRes) {
        Uri data;
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(activityRes, "activityRes");
        if (activityRes.getResultCode() != -1) {
            this$0.f5380b.mo4470b();
            return;
        }
        Intent data2 = activityRes.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            data = this$0.f5383e;
        }
        this$0.f5380b.mo4469a(data);
    }

    /* renamed from: b */
    public final List m4602b(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC9979u.m20291d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (context instanceof Activity) {
                ((Activity) context).grantUriPermission(resolveInfo.activityInfo.packageName, this.f5383e, 3);
            }
            intent2.putExtra("output", this.f5383e);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m4603c(PackageManager packageManager, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Intent intent = AbstractC9979u.m20289b(str, "android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC9979u.m20291d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f5382d) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i10);
                i10++;
                if (AbstractC9979u.m20289b(((Intent) obj).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) obj;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    /* renamed from: d */
    public final boolean m4604d(Context context) {
        String packageName = context.getPackageName();
        try {
            String[] strArr = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(packageName, 4096)).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null && AbstractC10819z.m23230C(str, "android.permission.CAMERA", true)) {
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
    public final boolean m4605f(Context context) {
        return m4604d(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    /* renamed from: g */
    public final C5905c m4606g(String title) {
        AbstractC9979u.m20294g(title, "title");
        this.f5381c = title;
        return this;
    }

    /* renamed from: h */
    public final C5905c m4607h(List appsList) {
        AbstractC9979u.m20294g(appsList, "appsList");
        this.f5382d = appsList;
        return this;
    }

    /* renamed from: i */
    public final void m4608i(boolean z10, boolean z11, Uri uri) {
        Intent intent;
        this.f5383e = uri;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f5379a.getPackageManager();
        if (!m4605f(this.f5379a) && z10) {
            ComponentActivity componentActivity = this.f5379a;
            AbstractC9979u.m20291d(packageManager);
            arrayList.addAll(m4602b(componentActivity, packageManager));
        }
        if (z11) {
            AbstractC9979u.m20291d(packageManager);
            List listM4603c = m4603c(packageManager, "android.intent.action.GET_CONTENT");
            if (listM4603c.isEmpty()) {
                listM4603c = m4603c(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(listM4603c);
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
        Intent intentCreateChooser = Intent.createChooser(intent, this.f5381c);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        ActivityResultLauncher activityResultLauncher = this.f5384f;
        AbstractC9979u.m20291d(intentCreateChooser);
        activityResultLauncher.launch(intentCreateChooser);
    }
}
