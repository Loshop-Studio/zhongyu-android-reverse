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
import com.canhub.cropper.C5542c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.canhub.cropper.c */
/* loaded from: classes3.dex */
public final class C5542c {

    /* renamed from: g */
    public static final a f3963g = new a(null);

    /* renamed from: a */
    public final ComponentActivity f3964a;

    /* renamed from: b */
    public final b f3965b;

    /* renamed from: c */
    public String f3966c;

    /* renamed from: d */
    public List f3967d;

    /* renamed from: e */
    public Uri f3968e;

    /* renamed from: f */
    public final ActivityResultLauncher f3969f;

    /* renamed from: com.canhub.cropper.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.canhub.cropper.c$b */
    public interface b {
        /* renamed from: a */
        void mo3450a(Uri uri);

        /* renamed from: b */
        void mo3451b();
    }

    public C5542c(ComponentActivity activity, b callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f3964a = activity;
        this.f3965b = callback;
        String string = activity.getString(R$string.pick_image_chooser_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f3966c = string;
        this.f3967d = CollectionsKt.listOf((Object[]) new String[]{"com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery"});
        this.f3969f = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: g1.m
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C5542c.m3581e(this.f13479a, (ActivityResult) obj);
            }
        });
    }

    /* renamed from: e */
    public static final void m3581e(C5542c this$0, ActivityResult activityRes) {
        Uri data;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activityRes, "activityRes");
        if (activityRes.getResultCode() != -1) {
            this$0.f3965b.mo3451b();
            return;
        }
        Intent data2 = activityRes.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            data = this$0.f3968e;
        }
        this$0.f3965b.mo3450a(data);
    }

    /* renamed from: b */
    public final List m3582b(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (context instanceof Activity) {
                ((Activity) context).grantUriPermission(resolveInfo.activityInfo.packageName, this.f3968e, 3);
            }
            intent2.putExtra("output", this.f3968e);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m3583c(PackageManager packageManager, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Intent intent = Intrinsics.areEqual(str, "android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f3967d) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i9);
                i9++;
                if (Intrinsics.areEqual(((Intent) obj).getPackage(), str2)) {
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
    public final boolean m3584d(Context context) {
        String packageName = context.getPackageName();
        try {
            String[] strArr = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(packageName, 4096)).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if (str != null && StringsKt.equals(str, "android.permission.CAMERA", true)) {
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
    public final boolean m3585f(Context context) {
        return m3584d(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    /* renamed from: g */
    public final C5542c m3586g(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f3966c = title;
        return this;
    }

    /* renamed from: h */
    public final C5542c m3587h(List appsList) {
        Intrinsics.checkNotNullParameter(appsList, "appsList");
        this.f3967d = appsList;
        return this;
    }

    /* renamed from: i */
    public final void m3588i(boolean z9, boolean z10, Uri uri) {
        Intent intent;
        this.f3968e = uri;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f3964a.getPackageManager();
        if (!m3585f(this.f3964a) && z9) {
            ComponentActivity componentActivity = this.f3964a;
            Intrinsics.checkNotNull(packageManager);
            arrayList.addAll(m3582b(componentActivity, packageManager));
        }
        if (z10) {
            Intrinsics.checkNotNull(packageManager);
            List listM3583c = m3583c(packageManager, "android.intent.action.GET_CONTENT");
            if (listM3583c.isEmpty()) {
                listM3583c = m3583c(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(listM3583c);
        }
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            Intent intent2 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z10) {
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
            }
            intent = intent2;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, this.f3966c);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        ActivityResultLauncher activityResultLauncher = this.f3969f;
        Intrinsics.checkNotNull(intentCreateChooser);
        activityResultLauncher.launch(intentCreateChooser);
    }
}
