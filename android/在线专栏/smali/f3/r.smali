.class public final Lf3/r;
.super Lf3/o1;
.source "SourceFile"

# interfaces
.implements Lf3/q;


# instance fields
.field public final e:Lf3/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf3/s;)V
    .locals 0
    .param p1    # Lf3/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lf3/o1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/r;->e:Lf3/s;

    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf3/t1;->C(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()Lf3/m1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lf3/r;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lf3/r;->e:Lf3/s;

    invoke-virtual {p0}, Lf3/s1;->t()Lf3/t1;

    move-result-object v0

    invoke-interface {p1, v0}, Lf3/s;->b(Lf3/b2;)V

    return-void
.end method
