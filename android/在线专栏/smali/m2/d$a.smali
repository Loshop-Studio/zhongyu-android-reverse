.class public final Lm2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm2/c;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm2/d$a;->a:Ljava/util/List;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lm2/d$a;->b:Z

    .line 4
    iput-boolean v0, p0, Lm2/d$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lm2/c;)Lm2/d$a;
    .locals 1
    .param p1    # Lm2/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm2/d$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()Lm2/d;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v6, Lm2/d;

    .line 2
    iget-object v0, p0, Lm2/d$a;->a:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/j;->K(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lm2/d$a;->b:Z

    .line 4
    iget-boolean v3, p0, Lm2/d$a;->c:Z

    .line 5
    iget-boolean v4, p0, Lm2/d$a;->d:Z

    const/4 v5, 0x0

    move-object v0, v6

    .line 6
    invoke-direct/range {v0 .. v5}, Lm2/d;-><init>(Ljava/util/List;ZZZLkotlin/jvm/internal/g;)V

    return-object v6
.end method
