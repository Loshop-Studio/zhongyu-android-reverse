.class final Lz1/b$b$a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/a<",
        "Lo2/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lz1/b$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$a;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lz1/b$b$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lz1/b$b$a;->d:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lz1/b$b$a;->a:Lz1/b$b;

    invoke-virtual {v0}, Lz1/b$b;->s()Lb2/b;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/l;->n()V

    :cond_0
    iget-object v1, p0, Lz1/b$b$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lz1/b$b$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lz1/b$b$a;->d:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lb2/b;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/b$b$a;->a()V

    sget-object v0, Lo2/r;->a:Lo2/r;

    return-object v0
.end method
