package com.zykj.view.simpleBoard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p129h7.C8105a;
import p129h7.C8107c;
import p129h7.C8108d;
import p129h7.C8109e;
import p149j7.C8220a;
import p149j7.C8221b;
import p149j7.C8222c;
import p149j7.InterfaceC8223d;

@Metadata(m13412d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\r2\u0016\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010\u001fJ\u000f\u0010-\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010\u001fJ\u000f\u0010.\u001a\u00020\rH\u0016¢\u0006\u0004\b.\u0010\u001fR\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0017\u00106\u001a\u0002028\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m13413d2 = {"Lcom/zykj/view/simpleBoard/SimpleBoardView;", "Landroid/widget/FrameLayout;", "Lj7/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "bitmap", "", "setImageBackground", "(Landroid/graphics/Bitmap;)V", "getImageBackground", "()Landroid/graphics/Bitmap;", "mode", "setActonMode", "(I)V", "Lh7/d;", "config", "setSelectionConfig", "(Lh7/d;)V", "Lkotlin/Function1;", "Lh7/e;", "listener", "setOnSelectionChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "d", "()V", "Lkotlin/Function0;", "setOnActionListener", "(Lkotlin/jvm/functions/Function0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "c", "b", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mCameraMatrix", "Lh7/c;", "Lh7/c;", "getSimpleBoardConfig", "()Lh7/c;", "simpleBoardConfig", "Lcom/zykj/view/simpleBoard/a;", "Lcom/zykj/view/simpleBoard/a;", "mDrawControl", "Lh7/a;", "Lh7/a;", "mActionManager", "Lj7/c;", "e", "Lj7/c;", "boardTempPathView", "Lj7/b;", "f", "Lj7/b;", "boardPathView", "Lj7/a;", "g", "Lj7/a;", "boardImageView", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1310#2,2:292\n1310#2,2:294\n1310#2,2:300\n1310#2,2:306\n1310#2,2:308\n1310#2,2:310\n1563#3:296\n1634#3,3:297\n1563#3:302\n1634#3,3:303\n1#4:312\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n174#1:292,2\n183#1:294,2\n207#1:300,2\n226#1:306,2\n233#1:308,2\n248#1:310,2\n185#1:296\n185#1:297,3\n208#1:302\n208#1:303,3\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleBoardView extends FrameLayout implements InterfaceC8223d {

    /* renamed from: a, reason: from kotlin metadata */
    public final Matrix mCameraMatrix;

    /* renamed from: b, reason: from kotlin metadata */
    public final C8107c simpleBoardConfig;

    /* renamed from: c, reason: from kotlin metadata */
    public C7719a mDrawControl;

    /* renamed from: d, reason: from kotlin metadata */
    public C8105a mActionManager;

    /* renamed from: e, reason: from kotlin metadata */
    public final C8222c boardTempPathView;

    /* renamed from: f, reason: from kotlin metadata */
    public final C8221b boardPathView;

    /* renamed from: g, reason: from kotlin metadata */
    public final C8220a boardImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p149j7.InterfaceC8223d
    /* renamed from: a */
    public void mo11925a() {
        this.boardImageView.invalidate();
    }

    @Override // p149j7.InterfaceC8223d
    /* renamed from: b */
    public void mo11926b() {
        this.boardTempPathView.invalidate();
    }

    @Override // p149j7.InterfaceC8223d
    /* renamed from: c */
    public void mo11927c() {
        this.boardPathView.invalidate();
    }

    /* renamed from: d */
    public final void m11928d() {
        this.mDrawControl.m11966f();
    }

    public final Bitmap getImageBackground() {
        Bitmap bitmapM11986w = this.mDrawControl.m11986w();
        if (bitmapM11986w != null) {
            return Bitmap.createBitmap(bitmapM11986w);
        }
        return null;
    }

    public final C8107c getSimpleBoardConfig() {
        return this.simpleBoardConfig;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mDrawControl.m11969g0(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return true;
        }
        this.mActionManager.m12952a(event);
        return true;
    }

    public final void setActonMode(int mode) {
        this.mActionManager.m12953b(mode);
    }

    public final void setImageBackground(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.mDrawControl.m11952W(bitmap);
        this.boardImageView.postInvalidate();
    }

    public final void setOnActionListener(Function0<Unit> listener) {
        this.mDrawControl.m11953X(listener);
    }

    public final void setOnSelectionChangedListener(Function1<? super C8109e, Unit> listener) {
        this.mDrawControl.m11954Y(listener);
    }

    public final void setSelectionConfig(C8108d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.mDrawControl.m11955Z(config);
    }

    public /* synthetic */ SimpleBoardView(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        Matrix matrix = new Matrix();
        this.mCameraMatrix = matrix;
        C8107c c8107c = new C8107c(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
        this.simpleBoardConfig = c8107c;
        C7719a c7719a = new C7719a(c8107c, matrix, this);
        this.mDrawControl = c7719a;
        this.mActionManager = new C8105a(c8107c, matrix, c7719a);
        C8222c c8222c = new C8222c(context, attributeSet, 0, 4, null);
        c8222c.setMDrawControl(this.mDrawControl);
        this.boardTempPathView = c8222c;
        C8221b c8221b = new C8221b(context, attributeSet, 0, 4, null);
        c8221b.setMDrawControl(this.mDrawControl);
        this.boardPathView = c8221b;
        C8220a c8220a = new C8220a(context, attributeSet, 0, 4, null);
        c8220a.setMDrawControl(this.mDrawControl);
        this.boardImageView = c8220a;
        addView(c8220a);
        addView(c8221b);
        addView(c8222c);
    }
}
