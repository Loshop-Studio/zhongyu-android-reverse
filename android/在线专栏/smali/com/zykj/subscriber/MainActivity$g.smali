.class final Lcom/zykj/subscriber/MainActivity$g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/l<",
        "Lx2/l<",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lo2/r;",
        ">;",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$g;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx2/l;)V
    .locals 3
    .param p1    # Lx2/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx2/l<",
            "-",
            "Ljava/lang/String;",
            "Lo2/r;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz1/b;->a:Lz1/b;

    new-instance v1, Lcom/zykj/subscriber/MainActivity$g$a;

    iget-object v2, p0, Lcom/zykj/subscriber/MainActivity$g;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {v1, v2, p1}, Lcom/zykj/subscriber/MainActivity$g$a;-><init>(Lcom/zykj/subscriber/MainActivity;Lx2/l;)V

    invoke-virtual {v0, v1}, Lz1/b;->f(Lx2/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx2/l;

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/MainActivity$g;->a(Lx2/l;)V

    sget-object p1, Lo2/r;->a:Lo2/r;

    return-object p1
.end method
