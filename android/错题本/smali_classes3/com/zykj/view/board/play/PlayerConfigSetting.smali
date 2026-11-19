.class public final Lcom/zykj/view/board/play/PlayerConfigSetting;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R(\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/view/board/play/PlayerConfigSetting;",
        "",
        "",
        "drawableId",
        "",
        "displayText",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "clickCallback",
        "<init>",
        "(ILjava/lang/String;Lr6/a;)V",
        "I",
        "getDrawableId",
        "()I",
        "setDrawableId",
        "(I)V",
        "Ljava/lang/String;",
        "getDisplayText",
        "()Ljava/lang/String;",
        "setDisplayText",
        "(Ljava/lang/String;)V",
        "Lr6/a;",
        "getClickCallback",
        "()Lr6/a;",
        "setClickCallback",
        "(Lr6/a;)V",
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


# instance fields
.field private clickCallback:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private displayText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private drawableId:I


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/zykj/view/board/play/PlayerConfigSetting;-><init>(ILjava/lang/String;Lr6/a;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lr6/a;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    const-string v0, "displayText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickCallback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->drawableId:I

    .line 4
    iput-object p2, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->displayText:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->clickCallback:Lr6/a;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lr6/a;ILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    const-string p2, ""

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    new-instance p3, Landroidx/lifecycle/k;

    const/16 p4, 0x1c

    invoke-direct {p3, p4}, Landroidx/lifecycle/k;-><init>(I)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/board/play/PlayerConfigSetting;-><init>(ILjava/lang/String;Lr6/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic a()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/PlayerConfigSetting;->_init_$lambda$0()Ld6/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getClickCallback()Lr6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->clickCallback:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDisplayText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->displayText:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDrawableId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->drawableId:I

    .line 2
    .line 3
    return v0
.end method

.method public final setClickCallback(Lr6/a;)V
    .locals 1
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
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
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->clickCallback:Lr6/a;

    .line 7
    .line 8
    return-void
.end method

.method public final setDisplayText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->displayText:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setDrawableId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/board/play/PlayerConfigSetting;->drawableId:I

    .line 2
    .line 3
    return-void
.end method
