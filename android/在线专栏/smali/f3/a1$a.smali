.class final Lf3/a1$a;
.super Lf3/a1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final d:Lf3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf3/l<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final synthetic e:Lf3/a1;


# direct methods
.method public constructor <init>(Lf3/a1;JLf3/l;)V
    .locals 0
    .param p2    # J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lf3/l<",
            "-",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lf3/a1$a;->e:Lf3/a1;

    .line 2
    invoke-direct {p0, p2, p3}, Lf3/a1$b;-><init>(J)V

    .line 3
    iput-object p4, p0, Lf3/a1$a;->d:Lf3/l;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lf3/a1$a;->d:Lf3/l;

    iget-object v1, p0, Lf3/a1$a;->e:Lf3/a1;

    sget-object v2, Lo2/r;->a:Lo2/r;

    invoke-interface {v0, v1, v2}, Lf3/l;->f(Lf3/e0;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-super {p0}, Lf3/a1$b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lf3/a1$a;->d:Lf3/l;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
