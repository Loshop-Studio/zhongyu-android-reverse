.class final Lf3/t1$b;
.super Lf3/s1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final e:Lf3/t1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final f:Lf3/t1$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final g:Lf3/r;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final h:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf3/t1;Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lf3/t1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lf3/t1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lf3/r;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lf3/s1;-><init>()V

    .line 2
    iput-object p1, p0, Lf3/t1$b;->e:Lf3/t1;

    .line 3
    iput-object p2, p0, Lf3/t1$b;->f:Lf3/t1$c;

    .line 4
    iput-object p3, p0, Lf3/t1$b;->g:Lf3/r;

    .line 5
    iput-object p4, p0, Lf3/t1$b;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lf3/t1$b;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object p1, p0, Lf3/t1$b;->e:Lf3/t1;

    iget-object v0, p0, Lf3/t1$b;->f:Lf3/t1$c;

    iget-object v1, p0, Lf3/t1$b;->g:Lf3/r;

    iget-object v2, p0, Lf3/t1$b;->h:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lf3/t1;->i(Lf3/t1;Lf3/t1$c;Lf3/r;Ljava/lang/Object;)V

    return-void
.end method
