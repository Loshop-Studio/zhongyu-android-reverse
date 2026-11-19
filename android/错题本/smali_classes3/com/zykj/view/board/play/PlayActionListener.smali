.class public final Lcom/zykj/view/board/play/PlayActionListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0016\u0018\u00002\u00020\u0001B]\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR(\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R(\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u0012\u0010\u000f\"\u0004\u0008\u0013\u0010\u0011R.\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R(\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\r\u001a\u0004\u0008\u0019\u0010\u000f\"\u0004\u0008\u001a\u0010\u0011R(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\r\u001a\u0004\u0008\u001b\u0010\u000f\"\u0004\u0008\u001c\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/view/board/play/PlayActionListener;",
        "",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "callbackForStart",
        "callbackForResume",
        "Lkotlin/Function1;",
        "",
        "callbackForRunning",
        "callbackForPause",
        "callbackForEnd",
        "<init>",
        "(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;)V",
        "Lr6/a;",
        "getCallbackForStart",
        "()Lr6/a;",
        "setCallbackForStart",
        "(Lr6/a;)V",
        "getCallbackForResume",
        "setCallbackForResume",
        "Lr6/c;",
        "getCallbackForRunning",
        "()Lr6/c;",
        "setCallbackForRunning",
        "(Lr6/c;)V",
        "getCallbackForPause",
        "setCallbackForPause",
        "getCallbackForEnd",
        "setCallbackForEnd",
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
.field private callbackForEnd:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private callbackForPause:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private callbackForResume:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private callbackForRunning:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private callbackForStart:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/play/PlayActionListener;-><init>(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;ILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;)V
    .locals 1
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    const-string v0, "callbackForStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackForResume"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackForRunning"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackForPause"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackForEnd"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForStart:Lr6/a;

    .line 4
    iput-object p2, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForResume:Lr6/a;

    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForRunning:Lr6/c;

    .line 6
    iput-object p4, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForPause:Lr6/a;

    .line 7
    iput-object p5, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForEnd:Lr6/a;

    return-void
.end method

.method public synthetic constructor <init>(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;ILkotlin/jvm/internal/e;)V
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 8
    new-instance p1, Landroidx/lifecycle/k;

    const/16 p7, 0x18

    invoke-direct {p1, p7}, Landroidx/lifecycle/k;-><init>(I)V

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    .line 9
    new-instance p2, Landroidx/lifecycle/k;

    const/16 p1, 0x19

    invoke-direct {p2, p1}, Landroidx/lifecycle/k;-><init>(I)V

    :cond_1
    move-object v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    .line 10
    new-instance p3, Lcom/zykj/mistake/feature/notebook/list/k1;

    const/16 p1, 0x14

    invoke-direct {p3, p1}, Lcom/zykj/mistake/feature/notebook/list/k1;-><init>(I)V

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    .line 11
    new-instance p4, Landroidx/lifecycle/k;

    const/16 p1, 0x1a

    invoke-direct {p4, p1}, Landroidx/lifecycle/k;-><init>(I)V

    :cond_3
    move-object v4, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    .line 12
    new-instance p5, Landroidx/lifecycle/k;

    const/16 p1, 0x1b

    invoke-direct {p5, p1}, Landroidx/lifecycle/k;-><init>(I)V

    :cond_4
    move-object v0, p0

    move-object v5, p5

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/zykj/view/board/play/PlayActionListener;-><init>(Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;)V

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

.method private static final _init_$lambda$1()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final _init_$lambda$2(J)Ld6/s;
    .locals 0

    .line 1
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object p0
.end method

.method private static final _init_$lambda$3()Ld6/s;
    .locals 1

    .line 1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final _init_$lambda$4()Ld6/s;
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
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->_init_$lambda$0()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->_init_$lambda$4()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->_init_$lambda$1()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ld6/s;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/view/board/play/PlayActionListener;->_init_$lambda$3()Ld6/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(J)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/PlayActionListener;->_init_$lambda$2(J)Ld6/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCallbackForEnd()Lr6/a;
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
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForEnd:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCallbackForPause()Lr6/a;
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
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForPause:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCallbackForResume()Lr6/a;
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
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForResume:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCallbackForRunning()Lr6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForRunning:Lr6/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCallbackForStart()Lr6/a;
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
    iget-object v0, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForStart:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setCallbackForEnd(Lr6/a;)V
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
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForEnd:Lr6/a;

    .line 7
    .line 8
    return-void
.end method

.method public final setCallbackForPause(Lr6/a;)V
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
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForPause:Lr6/a;

    .line 7
    .line 8
    return-void
.end method

.method public final setCallbackForResume(Lr6/a;)V
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
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForResume:Lr6/a;

    .line 7
    .line 8
    return-void
.end method

.method public final setCallbackForRunning(Lr6/c;)V
    .locals 1
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
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
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForRunning:Lr6/c;

    .line 7
    .line 8
    return-void
.end method

.method public final setCallbackForStart(Lr6/a;)V
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
    iput-object p1, p0, Lcom/zykj/view/board/play/PlayActionListener;->callbackForStart:Lr6/a;

    .line 7
    .line 8
    return-void
.end method
