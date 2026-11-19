.class final Lz1/b$b$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->g(Lx2/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;

.field final synthetic b:Lx2/l;


# direct methods
.method constructor <init>(Lz1/b$b;Lx2/l;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$n;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$n;->b:Lx2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lz1/b$b$n;->a:Lz1/b$b;

    invoke-virtual {v0}, Lz1/b$b;->s()Lb2/b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, La2/b;

    iget-object v2, p0, Lz1/b$b$n;->b:Lx2/l;

    sget-object v3, Lz1/b$b$n$a;->a:Lz1/b$b$n$a;

    invoke-direct {v1, v2, v3}, La2/b;-><init>(Lx2/l;Lx2/l;)V

    invoke-interface {v0, v1}, Lb2/b;->r(Lb2/a;)V

    :cond_0
    return-void
.end method
