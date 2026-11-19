package com.zykj.view.simpleBoard;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.view.simpleBoard.action.WritePath;
import com.zykj.view.simpleBoard.view.BoardImageView;
import com.zykj.view.simpleBoard.view.BoardPathView;
import com.zykj.view.simpleBoard.view.BoardTempPathView;
import com.zykj.view.simpleBoard.view.IBoardView;
import com.zykj.view.utils.ProtoFileUtils;
import com.zykj.view.utils.ProtoPath;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u0011J\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\r2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b)\u0010&J\u0015\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020#¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0016J\u001f\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0016R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/SimpleBoardView;", "Landroid/widget/FrameLayout;", "Lcom/zykj/view/simpleBoard/view/IBoardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "bitmap", "Ld6/s;", "setImageBackground", "(Landroid/graphics/Bitmap;)V", "getImageBackground", "()Landroid/graphics/Bitmap;", "mode", "setActonMode", "(I)V", "clean", "()V", "", "isEmpty", "()Z", "", "scale", "setScale", "(F)Z", "buildBitmap", "Lkotlin/Function0;", "listener", "setOnActionListener", "(Lr6/a;)V", "", "path", "saveData", "(Ljava/lang/String;)V", "saveStrokeData", "absolutePath", "loadData", "loadStrokeData", "reset", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "updateImageView", "updatePathView", "updateTempPathView", "Landroid/graphics/Matrix;", "mCameraMatrix", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "simpleBoardConfig", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "getSimpleBoardConfig", "()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Lcom/zykj/view/simpleBoard/DrawControl;", "mDrawControl", "Lcom/zykj/view/simpleBoard/DrawControl;", "Lcom/zykj/view/simpleBoard/ActionManager;", "mActionManager", "Lcom/zykj/view/simpleBoard/ActionManager;", "Lcom/zykj/view/simpleBoard/view/BoardTempPathView;", "boardTempPathView", "Lcom/zykj/view/simpleBoard/view/BoardTempPathView;", "Lcom/zykj/view/simpleBoard/view/BoardPathView;", "boardPathView", "Lcom/zykj/view/simpleBoard/view/BoardPathView;", "Lcom/zykj/view/simpleBoard/view/BoardImageView;", "boardImageView", "Lcom/zykj/view/simpleBoard/view/BoardImageView;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1310#2,2:265\n1310#2,2:267\n1310#2,2:273\n1310#2,2:279\n1310#2,2:281\n1310#2,2:283\n1563#3:269\n1634#3,3:270\n1563#3:275\n1634#3,3:276\n1#4:285\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n147#1:265,2\n156#1:267,2\n180#1:273,2\n199#1:279,2\n206#1:281,2\n221#1:283,2\n158#1:269\n158#1:270,3\n181#1:275\n181#1:276,3\n*E\n"})
/* loaded from: classes3.dex */
public final class SimpleBoardView extends FrameLayout implements IBoardView {

    @NotNull
    private final BoardImageView boardImageView;

    @NotNull
    private final BoardPathView boardPathView;

    @NotNull
    private final BoardTempPathView boardTempPathView;

    @NotNull
    private ActionManager mActionManager;

    @NotNull
    private final Matrix mCameraMatrix;

    @NotNull
    private DrawControl mDrawControl;

    @NotNull
    private final SimpleBoardConfig simpleBoardConfig;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleBoardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    @NotNull
    public final Bitmap buildBitmap() {
        return this.mDrawControl.buildBitmap();
    }

    public final void clean() {
        this.mDrawControl.clean();
    }

    @Nullable
    public final Bitmap getImageBackground() {
        Bitmap mBackgroundBitmap = this.mDrawControl.getMBackgroundBitmap();
        if (mBackgroundBitmap != null) {
            return Bitmap.createBitmap(mBackgroundBitmap);
        }
        return null;
    }

    @NotNull
    public final SimpleBoardConfig getSimpleBoardConfig() {
        return this.simpleBoardConfig;
    }

    public final boolean isEmpty() {
        return this.mDrawControl.isEmpty();
    }

    public final void loadData(@NotNull String absolutePath) {
        File file;
        Bitmap bitmapDecodeFile;
        AbstractC5830k.m5330g(absolutePath, "absolutePath");
        File file2 = new File(absolutePath);
        File[] fileArrListFiles = file2.listFiles();
        File file3 = null;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i];
                String name = file.getName();
                AbstractC5830k.m5329f(name, "getName(...)");
                if (AbstractC5862w.m5414u(name, ".webp", false)) {
                    break;
                } else {
                    i++;
                }
            }
            if (file != null && (bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath())) != null) {
                this.mDrawControl.setImageBackground(bitmapDecodeFile);
            }
        }
        File[] fileArrListFiles2 = file2.listFiles();
        if (fileArrListFiles2 != null) {
            int length2 = fileArrListFiles2.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                File file4 = fileArrListFiles2[i8];
                String name2 = file4.getName();
                AbstractC5830k.m5329f(name2, "getName(...)");
                if (AbstractC5862w.m5414u(name2, ".bin", false)) {
                    file3 = file4;
                    break;
                }
                i8++;
            }
            if (file3 != null) {
                ProtoFileUtils protoFileUtils = ProtoFileUtils.INSTANCE;
                String absolutePath2 = file3.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath2, "getAbsolutePath(...)");
                this.mDrawControl.setPathList(protoFileUtils.loadDataToList(absolutePath2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadStrokeData(@org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "absolutePath"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r7, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.io.File[] r7 = r0.listFiles()
            if (r7 == 0) goto L41
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L13:
            if (r2 >= r0) goto L2c
            r3 = r7[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "getName(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r4, r5)
            java.lang.String r5 = ".bin"
            boolean r4 = kotlin.text.AbstractC5862w.m5414u(r4, r5, r1)
            if (r4 == 0) goto L29
            goto L2d
        L29:
            int r2 = r2 + 1
            goto L13
        L2c:
            r3 = 0
        L2d:
            if (r3 == 0) goto L41
            com.zykj.view.utils.ProtoFileUtils r7 = com.zykj.view.utils.ProtoFileUtils.INSTANCE
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = "getAbsolutePath(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r1)
            java.util.List r7 = r7.loadDataToList(r0)
            if (r7 == 0) goto L41
            goto L43
        L41:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.INSTANCE
        L43:
            com.zykj.view.simpleBoard.DrawControl r0 = r6.mDrawControl
            r0.setPathList(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.simpleBoard.SimpleBoardView.loadStrokeData(java.lang.String):void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/simpleBoard/SimpleBoardView.smali:748
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.mDrawControl.updateSize(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (!isEnabled()) {
            return true;
        }
        this.mActionManager.handTouchEvent(event);
        return true;
    }

    public final void reset() {
        this.mDrawControl.reset();
    }

    public final void saveData(@NotNull String path) throws IOException {
        File file;
        AbstractC5830k.m5330g(path, "path");
        File file2 = new File(path);
        File[] fileArrListFiles = file2.listFiles();
        File file3 = null;
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i];
                String name = file.getName();
                AbstractC5830k.m5329f(name, "getName(...)");
                if (AbstractC5862w.m5414u(name, ".webp", false)) {
                    break;
                } else {
                    i++;
                }
            }
            if (file != null) {
                file.delete();
            }
        }
        Bitmap mBackgroundBitmap = this.mDrawControl.getMBackgroundBitmap();
        if (mBackgroundBitmap != null) {
            File file4 = new File(path, UUID.randomUUID() + ".webp");
            FileUtils fileUtils = FileUtils.INSTANCE;
            String absolutePath = file4.getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
            fileUtils.saveBitmap2SDCard(mBackgroundBitmap, absolutePath, false);
        }
        File[] fileArrListFiles2 = file2.listFiles();
        if (fileArrListFiles2 != null) {
            int length2 = fileArrListFiles2.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                File file5 = fileArrListFiles2[i8];
                String name2 = file5.getName();
                AbstractC5830k.m5329f(name2, "getName(...)");
                if (AbstractC5862w.m5414u(name2, ".bin", false)) {
                    file3 = file5;
                    break;
                }
                i8++;
            }
            if (file3 != null) {
                file3.delete();
            }
        }
        List<WritePath> listM5217D0 = AbstractC5805t.m5217D0(this.mDrawControl.getMPathList());
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5217D0, 10));
        for (WritePath writePath : listM5217D0) {
            arrayList.add(new ProtoPath(writePath.getPaint(), writePath.getPointList()));
        }
        File file6 = new File(path, UUID.randomUUID() + ".bin");
        ProtoFileUtils protoFileUtils = ProtoFileUtils.INSTANCE;
        String absolutePath2 = file6.getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath2, "getAbsolutePath(...)");
        protoFileUtils.saveListToFile(arrayList, absolutePath2);
    }

    public final void saveStrokeData(@NotNull String path) {
        File file;
        AbstractC5830k.m5330g(path, "path");
        File file2 = new File(path);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    file = null;
                    break;
                }
                file = fileArrListFiles[i];
                String name = file.getName();
                AbstractC5830k.m5329f(name, "getName(...)");
                if (AbstractC5862w.m5414u(name, ".bin", false)) {
                    break;
                } else {
                    i++;
                }
            }
            if (file != null) {
                file.delete();
            }
        }
        List<WritePath> listM5217D0 = AbstractC5805t.m5217D0(this.mDrawControl.getMPathList());
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5217D0, 10));
        for (WritePath writePath : listM5217D0) {
            arrayList.add(new ProtoPath(writePath.getPaint(), writePath.getPointList()));
        }
        File file3 = new File(path, UUID.randomUUID() + ".bin");
        ProtoFileUtils protoFileUtils = ProtoFileUtils.INSTANCE;
        String absolutePath = file3.getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
        protoFileUtils.saveListToFile(arrayList, absolutePath);
    }

    public final void setActonMode(int mode) {
        this.mActionManager.setActonMode(mode);
    }

    public final void setImageBackground(@NotNull Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        this.mDrawControl.setImageBackground(bitmap);
        this.boardImageView.postInvalidate();
    }

    public final void setOnActionListener(@Nullable InterfaceC6469a listener) {
        this.mDrawControl.setOnActionListener(listener);
    }

    public final boolean setScale(float scale) {
        try {
            this.mDrawControl.setScale(scale);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zykj.view.simpleBoard.view.IBoardView
    public void updateImageView() {
        this.boardImageView.invalidate();
    }

    @Override // com.zykj.view.simpleBoard.view.IBoardView
    public void updatePathView() {
        this.boardPathView.invalidate();
    }

    @Override // com.zykj.view.simpleBoard.view.IBoardView
    public void updateTempPathView() {
        this.boardTempPathView.invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleBoardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ SimpleBoardView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleBoardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        Matrix matrix = new Matrix();
        this.mCameraMatrix = matrix;
        SimpleBoardConfig simpleBoardConfig = new SimpleBoardConfig(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
        this.simpleBoardConfig = simpleBoardConfig;
        DrawControl drawControl = new DrawControl(simpleBoardConfig, matrix, this);
        this.mDrawControl = drawControl;
        this.mActionManager = new ActionManager(simpleBoardConfig, matrix, drawControl);
        BoardTempPathView boardTempPathView = new BoardTempPathView(context, attributeSet, 0, 4, null);
        boardTempPathView.setMDrawControl(this.mDrawControl);
        this.boardTempPathView = boardTempPathView;
        BoardPathView boardPathView = new BoardPathView(context, attributeSet, 0, 4, null);
        boardPathView.setMDrawControl(this.mDrawControl);
        this.boardPathView = boardPathView;
        BoardImageView boardImageView = new BoardImageView(context, attributeSet, 0, 4, null);
        boardImageView.setMDrawControl(this.mDrawControl);
        this.boardImageView = boardImageView;
        addView(boardImageView);
        addView(boardPathView);
        addView(boardTempPathView);
    }
}
