package p070b.p074b.p075a.p076a.p088k;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: b.b.a.a.k.a */
/* loaded from: classes.dex */
public class C0600a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f3630a;

    public C0600a(Chip chip) {
        this.f3630a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        C0601b c0601b = this.f3630a.f4905e;
        if (c0601b != null) {
            c0601b.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
