package com.canhub.cropper;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.view.result.ActivityResultLauncher;
import android.view.result.contract.ActivityResultContracts;
import androidx.camera.core.impl.C0362d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p129o2.C6268a;

/* renamed from: com.canhub.cropper.s */
/* loaded from: classes2.dex */
public final class C3448s {

    /* renamed from: a */
    public final C6268a f2625a;

    /* renamed from: b */
    public String f2626b;

    /* renamed from: c */
    public List f2627c;

    /* renamed from: d */
    public Uri f2628d;

    /* renamed from: e */
    public final ActivityResultLauncher f2629e;

    public C3448s(CropImageActivity cropImageActivity, C6268a c6268a) {
        this.f2625a = c6268a;
        String string = cropImageActivity.getString(R$string.pick_image_chooser_title);
        AbstractC5830k.m5329f(string, "getString(...)");
        this.f2626b = string;
        this.f2627c = AbstractC5806u.m5287z("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f2629e = cropImageActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new C0362d(this, 6));
    }

    /* renamed from: a */
    public final ArrayList m2492a(PackageManager packageManager, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Intent intent = str.equals("android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
        AbstractC5830k.m5327d(listQueryIntentActivities);
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f2627c) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i);
                i++;
                if (AbstractC5830k.m5325b(((Intent) obj).getPackage(), str2)) {
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
}
