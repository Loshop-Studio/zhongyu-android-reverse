.class final Lz1/b$b$e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->c(Lx2/l;)V
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

.field final synthetic b:Lx2/l;


# direct methods
.method constructor <init>(Lz1/b$b;Lx2/l;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$e;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$e;->b:Lx2/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lz1/b$b$e$a;

    invoke-direct {v1, p0}, Lz1/b$b$e$a;-><init>(Lz1/b$b$e;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/b$b$e;->a()V

    sget-object v0, Lo2/r;->a:Lo2/r;

    return-object v0
.end method
