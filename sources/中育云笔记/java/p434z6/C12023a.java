package p434z6;

import com.luck.picture.lib.style.AlbumWindowStyle;
import com.luck.picture.lib.style.BottomNavBarStyle;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.style.TitleBarStyle;

/* renamed from: z6.a */
/* loaded from: classes5.dex */
public class C12023a {

    /* renamed from: a */
    public AlbumWindowStyle f28390a;

    /* renamed from: b */
    public TitleBarStyle f28391b;

    /* renamed from: c */
    public SelectMainStyle f28392c;

    /* renamed from: d */
    public BottomNavBarStyle f28393d;

    /* renamed from: e */
    public PictureWindowAnimationStyle f28394e;

    /* renamed from: a */
    public AlbumWindowStyle m26625a() {
        AlbumWindowStyle albumWindowStyle = this.f28390a;
        return albumWindowStyle == null ? new AlbumWindowStyle() : albumWindowStyle;
    }

    /* renamed from: b */
    public BottomNavBarStyle m26626b() {
        BottomNavBarStyle bottomNavBarStyle = this.f28393d;
        return bottomNavBarStyle == null ? new BottomNavBarStyle() : bottomNavBarStyle;
    }

    /* renamed from: c */
    public SelectMainStyle m26627c() {
        SelectMainStyle selectMainStyle = this.f28392c;
        return selectMainStyle == null ? new SelectMainStyle() : selectMainStyle;
    }

    /* renamed from: d */
    public TitleBarStyle m26628d() {
        TitleBarStyle titleBarStyle = this.f28391b;
        return titleBarStyle == null ? new TitleBarStyle() : titleBarStyle;
    }

    /* renamed from: e */
    public PictureWindowAnimationStyle m26629e() {
        if (this.f28394e == null) {
            this.f28394e = PictureWindowAnimationStyle.m9501a();
        }
        return this.f28394e;
    }
}
