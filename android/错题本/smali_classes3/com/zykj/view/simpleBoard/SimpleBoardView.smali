# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/view/simpleBoard/SimpleBoardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/simpleBoard/view/IBoardView;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010\'\u001a\u00020\r2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008\'\u0010&J\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020#\u00a2\u0006\u0004\u0008)\u0010&J\u0015\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020#\u00a2\u0006\u0004\u0008*\u0010&J\r\u0010+\u001a\u00020\r\u00a2\u0006\u0004\u0008+\u0010\u0016J\u001f\u0010.\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u000200H\u0016\u00a2\u0006\u0004\u00082\u00103J\u000f\u00104\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00084\u0010\u0016J\u000f\u00105\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00085\u0010\u0016J\u000f\u00106\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00086\u0010\u0016R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0017\u0010;\u001a\u00020:8\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010M\u00a8\u0006N"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/SimpleBoardView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/zykj/view/simpleBoard/view/IBoardView;",
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
        "Ld6/s;",
        "setImageBackground",
        "(Landroid/graphics/Bitmap;)V",
        "getImageBackground",
        "()Landroid/graphics/Bitmap;",
        "mode",
        "setActonMode",
        "(I)V",
        "clean",
        "()V",
        "",
        "isEmpty",
        "()Z",
        "",
        "scale",
        "setScale",
        "(F)Z",
        "buildBitmap",
        "Lkotlin/Function0;",
        "listener",
        "setOnActionListener",
        "(Lr6/a;)V",
        "",
        "path",
        "saveData",
        "(Ljava/lang/String;)V",
        "saveStrokeData",
        "absolutePath",
        "loadData",
        "loadStrokeData",
        "reset",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "updateImageView",
        "updatePathView",
        "updateTempPathView",
        "Landroid/graphics/Matrix;",
        "mCameraMatrix",
        "Landroid/graphics/Matrix;",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "simpleBoardConfig",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "getSimpleBoardConfig",
        "()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "mDrawControl",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "Lcom/zykj/view/simpleBoard/ActionManager;",
        "mActionManager",
        "Lcom/zykj/view/simpleBoard/ActionManager;",
        "Lcom/zykj/view/simpleBoard/view/BoardTempPathView;",
        "boardTempPathView",
        "Lcom/zykj/view/simpleBoard/view/BoardTempPathView;",
        "Lcom/zykj/view/simpleBoard/view/BoardPathView;",
        "boardPathView",
        "Lcom/zykj/view/simpleBoard/view/BoardPathView;",
        "Lcom/zykj/view/simpleBoard/view/BoardImageView;",
        "boardImageView",
        "Lcom/zykj/view/simpleBoard/view/BoardImageView;",
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
        "SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1310#2,2:265\n1310#2,2:267\n1310#2,2:273\n1310#2,2:279\n1310#2,2:281\n1310#2,2:283\n1563#3:269\n1634#3,3:270\n1563#3:275\n1634#3,3:276\n1#4:285\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n147#1:265,2\n156#1:267,2\n180#1:273,2\n199#1:279,2\n206#1:281,2\n221#1:283,2\n158#1:269\n158#1:270,3\n181#1:275\n181#1:276,3\n*E\n"
    }
.end annotation


# instance fields
.field private final boardImageView:Lcom/zykj/view/simpleBoard/view/BoardImageView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final boardPathView:Lcom/zykj/view/simpleBoard/view/BoardPathView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final boardTempPathView:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mActionManager:Lcom/zykj/view/simpleBoard/ActionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mCameraMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final simpleBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mCameraMatrix:Landroid/graphics/Matrix;

    .line 6
    new-instance v4, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

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

    invoke-direct/range {v4 .. v15}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;-><init>(ZZFFFIZFIILkotlin/jvm/internal/e;)V

    iput-object v4, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->simpleBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 7
    new-instance v2, Lcom/zykj/view/simpleBoard/DrawControl;

    invoke-direct {v2, v4, v1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/view/IBoardView;)V

    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 8
    new-instance v5, Lcom/zykj/view/simpleBoard/ActionManager;

    invoke-direct {v5, v4, v1, v2}, Lcom/zykj/view/simpleBoard/ActionManager;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    iput-object v5, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mActionManager:Lcom/zykj/view/simpleBoard/ActionManager;

    .line 9
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    move-object v1, v2

    .line 10
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    invoke-virtual {v1, v2}, Lcom/zykj/view/simpleBoard/view/BoardTempPathView;->setMDrawControl(Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 11
    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardTempPathView:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    .line 12
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardPathView;

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardPathView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    move-object v8, v2

    .line 13
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    invoke-virtual {v8, v2}, Lcom/zykj/view/simpleBoard/view/BoardPathView;->setMDrawControl(Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 14
    iput-object v8, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardPathView:Lcom/zykj/view/simpleBoard/view/BoardPathView;

    .line 15
    new-instance v2, Lcom/zykj/view/simpleBoard/view/BoardImageView;

    invoke-direct/range {v2 .. v7}, Lcom/zykj/view/simpleBoard/view/BoardImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 16
    iget-object v3, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    invoke-virtual {v2, v3}, Lcom/zykj/view/simpleBoard/view/BoardImageView;->setMDrawControl(Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 17
    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardImageView:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 18
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final buildBitmap()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->buildBitmap()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final clean()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->clean()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getImageBackground()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->getMBackgroundBitmap()Landroid/graphics/Bitmap;

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

.method public final getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->simpleBoardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final loadData(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "absolutePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v1, "getName(...)"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    array-length v4, p1

    .line 22
    move v5, v3

    .line 23
    :goto_0
    if-ge v5, v4, :cond_1

    .line 24
    .line 25
    aget-object v6, p1, v5

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v8, ".webp"

    .line 35
    .line 36
    invoke-static {v7, v8, v3}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v6, v2

    .line 47
    :goto_1
    if-eqz v6, :cond_2

    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    iget-object v4, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 60
    .line 61
    invoke-virtual {v4, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    move v4, v3

    .line 72
    :goto_2
    if-ge v4, v0, :cond_4

    .line 73
    .line 74
    aget-object v5, p1, v4

    .line 75
    .line 76
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v7, ".bin"

    .line 84
    .line 85
    invoke-static {v6, v7, v3}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_3

    .line 90
    .line 91
    move-object v2, v5

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    :goto_3
    if-eqz v2, :cond_5

    .line 97
    .line 98
    sget-object p1, Lcom/zykj/view/utils/ProtoFileUtils;->INSTANCE:Lcom/zykj/view/utils/ProtoFileUtils;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v1, "getAbsolutePath(...)"

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lcom/zykj/view/utils/ProtoFileUtils;->loadDataToList(Ljava/lang/String;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setPathList(Ljava/util/List;)V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-void
.end method

.method public final loadStrokeData(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "absolutePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    if-ge v2, v0, :cond_1

    .line 21
    .line 22
    aget-object v3, p1, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "getName(...)"

    .line 29
    .line 30
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v5, ".bin"

    .line 34
    .line 35
    invoke-static {v4, v5, v1}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v3, 0x0

    .line 46
    :goto_1
    if-eqz v3, :cond_2

    .line 47
    .line 48
    sget-object p1, Lcom/zykj/view/utils/ProtoFileUtils;->INSTANCE:Lcom/zykj/view/utils/ProtoFileUtils;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "getAbsolutePath(...)"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lcom/zykj/view/utils/ProtoFileUtils;->loadDataToList(Ljava/lang/String;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 67
    .line 68
    :goto_2
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 69
    .line 70
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setPathList(Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

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
    invoke-virtual {p1, p2, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->updateSize(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mActionManager:Lcom/zykj/view/simpleBoard/ActionManager;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/ActionManager;->handTouchEvent(Landroid/view/MotionEvent;)V

    .line 17
    .line 18
    .line 19
    return v1
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final saveData(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ".webp"

    .line 16
    .line 17
    const-string v3, "getName(...)"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    array-length v6, v1

    .line 24
    move v7, v5

    .line 25
    :goto_0
    if-ge v7, v6, :cond_1

    .line 26
    .line 27
    aget-object v8, v1, v7

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v9, v2, v5}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    if-eqz v9, :cond_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move-object v8, v4

    .line 47
    :goto_1
    if-eqz v8, :cond_2

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/view/simpleBoard/DrawControl;->getMBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v6, "getAbsolutePath(...)"

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    new-instance v8, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v7, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {v7, p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    sget-object v2, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1, v7, v5}, Lcom/zykj/blackboard/utils/FileUtils;->saveBitmap2SDCard(Landroid/graphics/Bitmap;Ljava/lang/String;Z)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v1, ".bin"

    .line 103
    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    array-length v2, v0

    .line 107
    move v7, v5

    .line 108
    :goto_2
    if-ge v7, v2, :cond_5

    .line 109
    .line 110
    aget-object v8, v0, v7

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v9, v1, v5}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    move-object v4, v8

    .line 126
    goto :goto_3

    .line 127
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    :goto_3
    if-eqz v4, :cond_6

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 133
    .line 134
    .line 135
    :cond_6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->getMPathList()Ljava/util/ArrayList;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    new-instance v2, Ljava/util/ArrayList;

    .line 146
    .line 147
    const/16 v3, 0xa

    .line 148
    .line 149
    invoke-static {v0, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    check-cast v3, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 171
    .line 172
    new-instance v4, Lcom/zykj/view/utils/ProtoPath;

    .line 173
    .line 174
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPaint()Landroid/graphics/Paint;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPointList()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-direct {v4, v5, v3}, Lcom/zykj/view/utils/ProtoPath;-><init>(Landroid/graphics/Paint;Ljava/util/List;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v3, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, Ljava/io/File;

    .line 209
    .line 210
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    sget-object p1, Lcom/zykj/view/utils/ProtoFileUtils;->INSTANCE:Lcom/zykj/view/utils/ProtoFileUtils;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, v2, v0}, Lcom/zykj/view/utils/ProtoFileUtils;->saveListToFile(Ljava/util/List;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final saveStrokeData(Ljava/lang/String;)V
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, ".bin"

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    array-length v2, v0

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    :goto_0
    if-ge v4, v2, :cond_2

    .line 32
    .line 33
    aget-object v5, v0, v4

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-string v7, "getName(...)"

    .line 40
    .line 41
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v6, v1, v3}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 v5, 0x0

    .line 55
    :goto_1
    if-eqz v5, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/DrawControl;->getMPathList()Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    const/16 v3, 0xa

    .line 73
    .line 74
    invoke-static {v0, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lcom/zykj/view/simpleBoard/action/WritePath;

    .line 96
    .line 97
    new-instance v4, Lcom/zykj/view/utils/ProtoPath;

    .line 98
    .line 99
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPaint()Landroid/graphics/Paint;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v3}, Lcom/zykj/view/simpleBoard/action/WritePath;->getPointList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {v4, v5, v3}, Lcom/zykj/view/utils/ProtoPath;-><init>(Landroid/graphics/Paint;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    new-instance v1, Ljava/io/File;

    .line 134
    .line 135
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lcom/zykj/view/utils/ProtoFileUtils;->INSTANCE:Lcom/zykj/view/utils/ProtoFileUtils;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    const-string v1, "getAbsolutePath(...)"

    .line 145
    .line 146
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v2, v0}, Lcom/zykj/view/utils/ProtoFileUtils;->saveListToFile(Ljava/util/List;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final setActonMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mActionManager:Lcom/zykj/view/simpleBoard/ActionManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/ActionManager;->setActonMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setImageBackground(Landroid/graphics/Bitmap;)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setImageBackground(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardImageView:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOnActionListener(Lr6/a;)V
    .locals 1
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setOnActionListener(Lr6/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setScale(F)Z
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->mDrawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/DrawControl;->setScale(F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1

    .line 8
    :catch_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public updateImageView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardImageView:Lcom/zykj/view/simpleBoard/view/BoardImageView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public updatePathView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardPathView:Lcom/zykj/view/simpleBoard/view/BoardPathView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public updateTempPathView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->boardTempPathView:Lcom/zykj/view/simpleBoard/view/BoardTempPathView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
