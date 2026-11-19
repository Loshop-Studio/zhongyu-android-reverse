package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    long f2780a;

    /* renamed from: b */
    boolean f2781b;

    /* renamed from: c */
    boolean f2782c;

    /* renamed from: d */
    boolean f2783d;

    /* renamed from: e */
    private final Runnable f2784e;

    /* renamed from: f */
    private final Runnable f2785f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2780a = -1L;
        this.f2781b = false;
        this.f2782c = false;
        this.f2783d = false;
        this.f2784e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f2820a.m2133c();
            }
        };
        this.f2785f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2821a.m2134d();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m2133c() {
        this.f2781b = false;
        this.f2780a = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m2134d() {
        this.f2782c = false;
        if (this.f2783d) {
            return;
        }
        this.f2780a = System.currentTimeMillis();
        setVisibility(0);
    }

    /* renamed from: e */
    private void m2135e() {
        removeCallbacks(this.f2784e);
        removeCallbacks(this.f2785f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2135e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2135e();
    }
}
