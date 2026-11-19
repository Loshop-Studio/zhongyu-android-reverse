.class final Lz1/b$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->b(Lx2/l;)V
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

    iput-object p1, p0, Lz1/b$b$b;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$b;->b:Lx2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$b;->a:Lz1/b$b;

    invoke-static {v0}, Lz1/b$b;->n(Lz1/b$b;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lz1/b$b$b$a;

    invoke-direct {v1, p0}, Lz1/b$b$b$a;-><init>(Lz1/b$b$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
