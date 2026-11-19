.class final Lz1/b$b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b$b;


# direct methods
.method constructor <init>(Lz1/b$b$b;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$b$a;->a:Lz1/b$b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$b$a;->a:Lz1/b$b$b;

    iget-object v1, v0, Lz1/b$b$b;->b:Lx2/l;

    iget-object v0, v0, Lz1/b$b$b;->a:Lz1/b$b;

    invoke-virtual {v0}, Lz1/b$b;->s()Lb2/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb2/b;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lx2/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
