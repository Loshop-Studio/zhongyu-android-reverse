package com.zykj.view.simpleBoard;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.utils.ProtoPath;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p027b8.C5063t;
import p077e5.C7349j;
import p278w7.C9820a;
import p278w7.C9821b;
import p278w7.C9822c;
import p288x7.C9880j;
import p298y7.C9944a;
import p298y7.C9945b;
import p298y7.C9946c;
import p298y7.InterfaceC9947d;

@Metadata(m13557d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0011J\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010\u0016J\u001f\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\u0016J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010\u0016R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010J¨\u0006L"}, m13558d2 = {"Lcom/zykj/view/simpleBoard/SimpleBoardView;", "Landroid/widget/FrameLayout;", "Ly7/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "bitmap", "", "setImageBackground", "(Landroid/graphics/Bitmap;)V", "getImageBackground", "()Landroid/graphics/Bitmap;", "mode", "setActonMode", "(I)V", "e", "()V", "", "f", "()Z", "", "scale", "j", "(F)Z", "d", "Lkotlin/Function0;", "listener", "setOnActionListener", "(Lkotlin/jvm/functions/Function0;)V", "", "path", "i", "(Ljava/lang/String;)V", "absolutePath", "g", "h", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "a", "c", "b", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mCameraMatrix", "Lw7/c;", "Lw7/c;", "getSimpleBoardConfig", "()Lw7/c;", "simpleBoardConfig", "Lw7/b;", "Lw7/b;", "mDrawControl", "Lw7/a;", "Lw7/a;", "mActionManager", "Ly7/c;", "Ly7/c;", "boardTempPathView", "Ly7/b;", "Ly7/b;", "boardPathView", "Ly7/a;", "Ly7/a;", "boardImageView", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1310#2,2:263\n1310#2,2:265\n1310#2,2:271\n1310#2,2:277\n1310#2,2:279\n1310#2,2:281\n1563#3:267\n1634#3,3:268\n1563#3:273\n1634#3,3:274\n1#4:283\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n147#1:263,2\n156#1:265,2\n180#1:271,2\n199#1:277,2\n206#1:279,2\n221#1:281,2\n158#1:267\n158#1:268,3\n181#1:273\n181#1:274,3\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleBoardView extends FrameLayout implements InterfaceC9947d {

    /* renamed from: a, reason: from kotlin metadata */
    public final Matrix mCameraMatrix;

    /* renamed from: b, reason: from kotlin metadata */
    public final C9822c simpleBoardConfig;

    /* renamed from: c, reason: from kotlin metadata */
    public C9821b mDrawControl;

    /* renamed from: d, reason: from kotlin metadata */
    public C9820a mActionManager;

    /* renamed from: e, reason: from kotlin metadata */
    public final C9946c boardTempPathView;

    /* renamed from: f, reason: from kotlin metadata */
    public final C9945b boardPathView;

    /* renamed from: g, reason: from kotlin metadata */
    public final C9944a boardImageView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p298y7.InterfaceC9947d
    /* renamed from: a */
    public void mo11424a() {
        this.boardImageView.invalidate();
    }

    @Override // p298y7.InterfaceC9947d
    /* renamed from: b */
    public void mo11425b() {
        this.boardTempPathView.invalidate();
    }

    @Override // p298y7.InterfaceC9947d
    /* renamed from: c */
    public void mo11426c() {
        this.boardPathView.invalidate();
    }

    /* renamed from: d */
    public final Bitmap m11427d() {
        return this.mDrawControl.m16408a();
    }

    /* renamed from: e */
    public final void m11428e() {
        this.mDrawControl.m16411e();
    }

    /* renamed from: f */
    public final boolean m11429f() {
        return this.mDrawControl.m16425s();
    }

    /* renamed from: g */
    public final void m11430g(String absolutePath) {
        File file;
        Bitmap bitmapDecodeFile;
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        File file2 = new File(absolutePath);
        File[] fileArrListFiles = file2.listFiles();
        File file3 = null;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i10];
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.endsWith$default(name, ".webp", false, 2, (Object) null)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (file != null && (bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                this.mDrawControl.m16427u(bitmapDecodeFile);
            }
        }
        File[] fileArrListFiles2 = file2.listFiles();
        if (fileArrListFiles2 != null) {
            int length2 = fileArrListFiles2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                File file4 = fileArrListFiles2[i11];
                String name2 = file4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".bin", false, 2, (Object) null)) {
                    file3 = file4;
                    break;
                }
                i11++;
            }
            if (file3 != null) {
                C5063t c5063t = C5063t.f2628a;
                String absolutePath2 = file3.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                this.mDrawControl.m16429w(c5063t.m2576b(absolutePath2));
            }
        }
    }

    public final Bitmap getImageBackground() {
        Bitmap bitmapM16415i = this.mDrawControl.m16415i();
        if (bitmapM16415i != null) {
            return Bitmap.createBitmap(bitmapM16415i);
        }
        return null;
    }

    public final C9822c getSimpleBoardConfig() {
        return this.simpleBoardConfig;
    }

    /* renamed from: h */
    public final void m11431h() {
        this.mDrawControl.m16426t();
    }

    /* renamed from: i */
    public final void m11432i(String path) throws Throwable {
        File file;
        Intrinsics.checkNotNullParameter(path, "path");
        File file2 = new File(path);
        File[] fileArrListFiles = file2.listFiles();
        File file3 = null;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i10];
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.endsWith$default(name, ".webp", false, 2, (Object) null)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (file != null) {
                file.delete();
            }
        }
        Bitmap bitmapM16415i = this.mDrawControl.m16415i();
        if (bitmapM16415i != null) {
            File file4 = new File(path, UUID.randomUUID() + ".webp");
            C7349j c7349j = C7349j.f11917a;
            String absolutePath = file4.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            c7349j.m11764b(bitmapM16415i, absolutePath, false);
        }
        File[] fileArrListFiles2 = file2.listFiles();
        if (fileArrListFiles2 != null) {
            int length2 = fileArrListFiles2.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                File file5 = fileArrListFiles2[i11];
                String name2 = file5.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".bin", false, 2, (Object) null)) {
                    file3 = file5;
                    break;
                }
                i11++;
            }
            if (file3 != null) {
                file3.delete();
            }
        }
        List<C9880j> list = CollectionsKt.toList(this.mDrawControl.m16416j());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (C9880j c9880j : list) {
            arrayList.add(new ProtoPath(c9880j.m16586a(), c9880j.m16588c()));
        }
        File file6 = new File(path, UUID.randomUUID() + ".bin");
        C5063t c5063t = C5063t.f2628a;
        String absolutePath2 = file6.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
        c5063t.m2577c(arrayList, absolutePath2);
    }

    /* renamed from: j */
    public final boolean m11433j(float scale) {
        try {
            this.mDrawControl.m16430x(scale);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mDrawControl.m16431y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.mActionManager.m16405a(event);
        return true;
    }

    public final void setActonMode(int mode) {
        this.mActionManager.m16406b(mode);
    }

    public final void setImageBackground(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.mDrawControl.m16427u(bitmap);
        this.boardImageView.postInvalidate();
    }

    public final void setOnActionListener(Function0<Unit> listener) {
        this.mDrawControl.m16428v(listener);
    }

    public /* synthetic */ SimpleBoardView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Matrix matrix = new Matrix();
        this.mCameraMatrix = matrix;
        C9822c c9822c = new C9822c(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
        this.simpleBoardConfig = c9822c;
        C9821b c9821b = new C9821b(c9822c, matrix, this);
        this.mDrawControl = c9821b;
        this.mActionManager = new C9820a(c9822c, matrix, c9821b);
        C9946c c9946c = new C9946c(context, attributeSet, 0, 4, null);
        c9946c.setMDrawControl(this.mDrawControl);
        this.boardTempPathView = c9946c;
        C9945b c9945b = new C9945b(context, attributeSet, 0, 4, null);
        c9945b.setMDrawControl(this.mDrawControl);
        this.boardPathView = c9945b;
        C9944a c9944a = new C9944a(context, attributeSet, 0, 4, null);
        c9944a.setMDrawControl(this.mDrawControl);
        this.boardImageView = c9944a;
        addView(c9944a);
        addView(c9945b);
        addView(c9946c);
    }
}
