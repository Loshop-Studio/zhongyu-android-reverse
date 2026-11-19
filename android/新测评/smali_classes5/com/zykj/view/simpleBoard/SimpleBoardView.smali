# RE note 本类字节码直接引用的读写或显示接口包括位图。
.class public final Lcom/zykj/view/simpleBoard/SimpleBoardView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Ly7/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010(\u001a\u00020\r2\u0006\u0010\'\u001a\u00020#\u00a2\u0006\u0004\u0008(\u0010&J\r\u0010)\u001a\u00020\r\u00a2\u0006\u0004\u0008)\u0010\u0016J\u001f\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00082\u0010\u0016J\u000f\u00103\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00083\u0010\u0016J\u000f\u00104\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u00084\u0010\u0016R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00106R\u0017\u0010<\u001a\u0002088\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00109\u001a\u0004\u0008:\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010J\u00a8\u0006L"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/SimpleBoardView;",
        "Landroid/widget/FrameLayout;",
        "Ly7/d;",
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
        "e",
        "()V",
        "",
        "f",
        "()Z",
        "",
        "scale",
        "j",
        "(F)Z",
        "d",
        "Lkotlin/Function0;",
        "listener",
        "setOnActionListener",
        "(Lkotlin/jvm/functions/Function0;)V",
        "",
        "path",
        "i",
        "(Ljava/lang/String;)V",
        "absolutePath",
        "g",
        "h",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "a",
        "c",
        "b",
        "Landroid/graphics/Matrix;",
        "Landroid/graphics/Matrix;",
        "mCameraMatrix",
        "Lw7/c;",
        "Lw7/c;",
        "getSimpleBoardConfig",
        "()Lw7/c;",
        "simpleBoardConfig",
        "Lw7/b;",
        "Lw7/b;",
        "mDrawControl",
        "Lw7/a;",
        "Lw7/a;",
        "mActionManager",
        "Ly7/c;",
        "Ly7/c;",
        "boardTempPathView",
        "Ly7/b;",
        "Ly7/b;",
        "boardPathView",
        "Ly7/a;",
        "Ly7/a;",
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
        "SMAP\nSimpleBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1310#2,2:263\n1310#2,2:265\n1310#2,2:271\n1310#2,2:277\n1310#2,2:279\n1310#2,2:281\n1563#3:267\n1634#3,3:268\n1563#3:273\n1634#3,3:274\n1#4:283\n*S KotlinDebug\n*F\n+ 1 SimpleBoardView.kt\ncom/zykj/view/simpleBoard/SimpleBoardView\n*L\n147#1:263,2\n156#1:265,2\n180#1:271,2\n199#1:277,2\n206#1:279,2\n221#1:281,2\n158#1:267\n158#1:268,3\n181#1:273\n181#1:274,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Lw7/c;

.field public c:Lw7/b;

.field public d:Lw7/a;

.field public final e:Ly7/c;

.field public final f:Ly7/b;

.field public final g:Ly7/a;


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
    new-instance v4, Lw7/c;

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

    invoke-direct/range {v4 .. v15}, Lw7/c;-><init>(ZZFFFIZFIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lw7/c;

    .line 6
    new-instance v2, Lw7/b;

    invoke-direct {v2, v4, v1, v0}, Lw7/b;-><init>(Lw7/c;Landroid/graphics/Matrix;Ly7/d;)V

    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 7
    new-instance v5, Lw7/a;

    invoke-direct {v5, v4, v1, v2}, Lw7/a;-><init>(Lw7/c;Landroid/graphics/Matrix;Lw7/b;)V

    iput-object v5, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lw7/a;

    .line 8
    new-instance v2, Ly7/c;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v2 .. v7}, Ly7/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .line 9
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    invoke-virtual {v1, v2}, Ly7/c;->setMDrawControl(Lw7/b;)V

    .line 10
    iput-object v1, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Ly7/c;

    .line 11
    new-instance v2, Ly7/b;

    invoke-direct/range {v2 .. v7}, Ly7/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v2

    .line 12
    iget-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    invoke-virtual {v8, v2}, Ly7/b;->setMDrawControl(Lw7/b;)V

    .line 13
    iput-object v8, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Ly7/b;

    .line 14
    new-instance v2, Ly7/a;

    invoke-direct/range {v2 .. v7}, Ly7/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    iget-object v3, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    invoke-virtual {v2, v3}, Ly7/a;->setMDrawControl(Lw7/b;)V

    .line 16
    iput-object v2, v0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Ly7/a;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Ly7/a;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->e:Ly7/c;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->f:Ly7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/b;->a()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/b;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/b;->s()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

# RE I/O 解码本地图片（BitmapFactory.decodeFile）。
.method public final g(Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "absolutePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const/4 v1, 0x2

    .line 16
    const-string v2, "getName(...)"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    array-length v5, p1

    .line 23
    move v6, v4

    .line 24
    :goto_0
    if-ge v6, v5, :cond_1

    .line 25
    .line 26
    aget-object v7, p1, v6

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v9, ".webp"

    .line 36
    .line 37
    invoke-static {v8, v9, v4, v1, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v7, v3

    .line 48
    :goto_1
    if-eqz v7, :cond_2

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object v5, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 61
    .line 62
    invoke-virtual {v5, p1}, Lw7/b;->u(Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_5

    .line 70
    .line 71
    array-length v0, p1

    .line 72
    move v5, v4

    .line 73
    :goto_2
    if-ge v5, v0, :cond_4

    .line 74
    .line 75
    aget-object v6, p1, v5

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v8, ".bin"

    .line 85
    .line 86
    invoke-static {v7, v8, v4, v1, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    move-object v3, v6

    .line 93
    goto :goto_3

    .line 94
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    :goto_3
    if-eqz v3, :cond_5

    .line 98
    .line 99
    sget-object p1, Lb8/t;->a:Lb8/t;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const-string v1, "getAbsolutePath(...)"

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lb8/t;->b(Ljava/lang/String;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lw7/b;->w(Ljava/util/List;)V

    .line 117
    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public final getImageBackground()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/b;->i()Landroid/graphics/Bitmap;

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

.method public final getSimpleBoardConfig()Lw7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->b:Lw7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw7/b;->t()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const/4 v2, 0x2

    .line 16
    const-string v3, ".webp"

    .line 17
    .line 18
    const-string v4, "getName(...)"

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    array-length v7, v1

    .line 25
    move v8, v6

    .line 26
    :goto_0
    if-ge v8, v7, :cond_1

    .line 27
    .line 28
    aget-object v9, v1, v8

    .line 29
    .line 30
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v10

    .line 34
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v10, v3, v6, v2, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v10

    .line 41
    if-eqz v10, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v9, v5

    .line 48
    :goto_1
    if-eqz v9, :cond_2

    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 54
    .line 55
    invoke-virtual {v1}, Lw7/b;->i()Landroid/graphics/Bitmap;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v7, "getAbsolutePath(...)"

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    new-instance v9, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    new-instance v8, Ljava/io/File;

    .line 83
    .line 84
    invoke-direct {v8, p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sget-object v3, Le5/j;->a:Le5/j;

    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v1, v8, v6}, Le5/j;->b(Landroid/graphics/Bitmap;Ljava/lang/String;Z)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, ".bin"

    .line 104
    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    array-length v3, v0

    .line 108
    move v8, v6

    .line 109
    :goto_2
    if-ge v8, v3, :cond_5

    .line 110
    .line 111
    aget-object v9, v0, v8

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v10, v1, v6, v2, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_4

    .line 125
    .line 126
    move-object v5, v9

    .line 127
    goto :goto_3

    .line 128
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    :goto_3
    if-eqz v5, :cond_6

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 134
    .line 135
    .line 136
    :cond_6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 137
    .line 138
    invoke-virtual {v0}, Lw7/b;->j()Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v2, Ljava/util/ArrayList;

    .line 147
    .line 148
    const/16 v3, 0xa

    .line 149
    .line 150
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_7

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Lx7/j;

    .line 172
    .line 173
    new-instance v4, Lcom/zykj/view/utils/ProtoPath;

    .line 174
    .line 175
    invoke-virtual {v3}, Lx7/j;->a()Landroid/graphics/Paint;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-virtual {v3}, Lx7/j;->c()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-direct {v4, v5, v3}, Lcom/zykj/view/utils/ProtoPath;-><init>(Landroid/graphics/Paint;Ljava/util/List;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v3, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v1, Ljava/io/File;

    .line 210
    .line 211
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    sget-object p1, Lb8/t;->a:Lb8/t;

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v2, v0}, Lb8/t;->c(Ljava/util/List;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public final j(F)Z
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw7/b;->x(F)V
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

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

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
    invoke-virtual {p1, p2, v0}, Lw7/b;->y(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lw7/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lw7/a;->a(Landroid/view/MotionEvent;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public final setActonMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d:Lw7/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw7/a;->b(I)V

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lw7/b;->u(Landroid/graphics/Bitmap;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->g:Ly7/a;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/SimpleBoardView;->c:Lw7/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lw7/b;->v(Lkotlin/jvm/functions/Function0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
