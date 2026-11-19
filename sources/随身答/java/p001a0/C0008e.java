package p001a0;

import android.graphics.Canvas;
import android.support.v4.media.session.PlaybackStateCompat;
import com.caverock.androidsvg.C5623a;
import com.caverock.androidsvg.SVG;
import p151k.InterfaceC8239j;

/* renamed from: a0.e */
/* loaded from: classes3.dex */
public final class C0008e implements InterfaceC8239j {

    /* renamed from: a */
    public final SVG f13a;

    /* renamed from: b */
    public final C5623a f14b;

    /* renamed from: c */
    public final int f15c;

    /* renamed from: d */
    public final int f16d;

    public C0008e(SVG svg, C5623a c5623a, int i9, int i10) {
        this.f13a = svg;
        this.f14b = c5623a;
        this.f15c = i9;
        this.f16d = i10;
    }

    @Override // p151k.InterfaceC8239j
    /* renamed from: a */
    public boolean mo12a() {
        return true;
    }

    @Override // p151k.InterfaceC8239j
    public void draw(Canvas canvas) {
        this.f13a.m3682o(canvas, this.f14b);
    }

    @Override // p151k.InterfaceC8239j
    public int getHeight() {
        return this.f16d;
    }

    @Override // p151k.InterfaceC8239j
    public long getSize() {
        return PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
    }

    @Override // p151k.InterfaceC8239j
    public int getWidth() {
        return this.f15c;
    }
}
