.class public final Lcom/zykj/view/simpleBoard/SimpleBoardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lj7/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\r2\u0016\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\r\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\r2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010 \u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\'H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u000f\u0010-\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008-\u0010\u001fJ\u000f\u0010.\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008.\u0010\u001fR\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u00100R\u0017\u00106\u001a\u0002028\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u00103\u001a\u0004\u00084\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010G\u00a8\u0006I"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/SimpleBoardView;",
        "Landroid/widget/FrameLayout;",
        "Lj7/d;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "setImageBackground",
        "(Landroid/graphics/Bitmap;)V",
        "getImageBackground",
        "()Landroid/graphics/Bitmap;",
        "mode",
        "setActonMode",
        "(I)V",
        "Lh7/d;",
        "config",
        "setSelectionConfig",
        "(Lh7/d;)V",
        "Lkotlin/Function1;",
        "Lh7/e;",
        "listener",
        "setOnSelectionChangedListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "d",
        "()V",
        "Lkotlin/Function0;",
        "setOnActionListener",
        "(Lkotlin/jvm/functions/Function0;)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "a",
        "c",
        "b",
        "Landroid/graphics/Matrix;",
        "Landroid/graphics/Matrix;",
        "mCameraMatrix",
        "Lh7/c;",
        "Lh7/c;",
        "getSimpleBoardConfig",
        "()Lh7/c;",
        "simpleBoardConfig",
        "Lcom/zykj/view/simpleBoard/a;",
        "Lcom/zykj/view/simpleBoard/a;",
        "mDrawControl",
        "Lh7/a;",
        "Lh7/a;",
        "mActionManager",
        "Lj7/c;",
        "e",
        "Lj7/c;",
        "boardTempPathView",
        "Lj7/b;",
        "f",
        "Lj7/b;",
        "boardPathView",
        "Lj7/a;",
        "g",
        "Lj7/a;",
        "boardImageView",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1310#2,2:292\n1310#2,2:294\n1310#2,2:300\n1310#2,2:306\n1310#2,2:308\n1310#2,2:310\n1563#3:296\n1634#3,3:297\n1563#3:302\n1634#3,3:303\n1#4:312\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n174#1:292,2\n183#1:294,2\n207#1:300,2\n226#1:306,2\n233#1:308,2\n248#1:310,2\n185#1:296\n185#1:297,3\n208#1:302\n208#1:303,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Lh7/c;

.field public c:Lcom/zykj/view/simpleBoard/a;

.field public d:Lh7/a;

.field public final e:Lj7/c;

.field public final f:Lj7/b;

.field public final g:Lj7/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->a:Landroid/graphics/Matrix;

    .line 5
    new-instance v4, Lh7/c;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lh7/c;-><init>(ZZFFFIZFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lh7/c;

    .line 6
    new-instance v2, Lcom/zykj/view/simpleBoard/a;

    invoke-direct {v2, v4, v1, v0}, Lcom/zykj/view/simpleBoard/a;-><init>(Lh7/c;Landroid/graphics/Matrix;Lj7/d;)V

    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 7
    new-instance v5, Lh7/a;

    invoke-direct {v5, v4, v1, v2}, Lh7/a;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    iput-object v5, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lh7/a;

    .line 8
    new-instance v2, Lj7/c;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v2 .. v7}, Lj7/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .line 9
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    invoke-virtual {v1, v2}, Lj7/c;->setMDrawControl(Lcom/zykj/view/simpleBoard/a;)V

    .line 10
    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lj7/c;

    .line 11
    new-instance v2, Lj7/b;

    invoke-direct/range {v2 .. v7}, Lj7/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v2

    .line 12
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    invoke-virtual {v8, v2}, Lj7/b;->setMDrawControl(Lcom/zykj/view/simpleBoard/a;)V

    .line 13
    iput-object v8, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lj7/b;

    .line 14
    new-instance v2, Lj7/a;

    invoke-direct/range {v2 .. v7}, Lj7/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    iget-object v3, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    invoke-virtual {v2, v3}, Lj7/a;->setMDrawControl(Lcom/zykj/view/simpleBoard/a;)V

    .line 16
    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lj7/a;

    .line 17
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 18
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lj7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Lj7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Lj7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/a;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getImageBackground()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/a;->w()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public final getSimpleBoardConfig()Lh7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lh7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, p2, v0}, Lcom/zykj/view/simpleBoard/a;->g0(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lh7/a;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lh7/a;->a(Landroid/view/MotionEvent;)V

    .line 17
    .line 18
    .line 19
    return v1
.end method

.method public final setActonMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lh7/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh7/a;->b(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setImageBackground(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->W(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Lj7/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOnActionListener(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->X(Lkotlin/jvm/functions/Function0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOnSelectionChangedListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lh7/e;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->Y(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSelectionConfig(Lh7/d;)V
    .locals 1

    .line 1
    const-string v0, "config"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->Z(Lh7/d;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
