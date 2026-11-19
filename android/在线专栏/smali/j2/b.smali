.class public final Lj2/b;
.super Lj2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj2/b$a;
    }
.end annotation


# static fields
.field public static final g:Lj2/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private e:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private f:Lg2/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj2/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lj2/b;->g:Lj2/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg2/b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lg2/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iMainView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lj2/a;-><init>(Landroid/content/Context;Lg2/a;)V

    iput-object p1, p0, Lj2/b;->e:Landroid/content/Context;

    iput-object p2, p0, Lj2/b;->f:Lg2/b;

    return-void
.end method


# virtual methods
.method public final e()Lg2/b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lj2/b;->f:Lg2/b;

    return-object v0
.end method

.method public final f()V
    .locals 6

    .line 1
    sget-object v0, Lh2/a;->a:Lh2/a;

    const-class v1, Lh2/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lh2/a;->e(Lh2/a;Ljava/lang/Class;Ljava/lang/String;Lokhttp3/OkHttpClient;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    invoke-interface {v0}, Lh2/b;->a()Lrx/Observable;

    move-result-object v0

    .line 2
    new-instance v1, Lj2/b$b;

    invoke-direct {v1, p0}, Lj2/b$b;-><init>(Lj2/b;)V

    invoke-virtual {p0, v0, v1}, Lj2/a;->d(Lrx/Observable;Lh2/c;)V

    return-void
.end method
