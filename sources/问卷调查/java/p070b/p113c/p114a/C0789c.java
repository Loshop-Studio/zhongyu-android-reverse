package p070b.p113c.p114a;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;

/* renamed from: b.c.a.c */
/* loaded from: classes.dex */
public class C0789c {

    /* renamed from: b */
    public static volatile C0789c f4457b;

    /* renamed from: a */
    public Drawable f4458a;

    public C0789c() throws Resources.NotFoundException {
        Drawable drawableLoadIcon;
        AnimationUtils.loadAnimation(C0787a.m2479m(), R.anim.fade_in);
        AnimationUtils.loadAnimation(C0787a.m2479m(), R.anim.fade_out);
        Context contextM2479m = C0787a.m2479m();
        try {
            PackageManager packageManager = contextM2479m.getPackageManager();
            drawableLoadIcon = packageManager.getApplicationInfo(contextM2479m.getPackageName(), 0).loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            drawableLoadIcon = null;
        }
        this.f4458a = drawableLoadIcon;
    }
}
