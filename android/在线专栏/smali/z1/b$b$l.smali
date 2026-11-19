.class final Lz1/b$b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz1/b$b;->w(La2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz1/b$b;

.field final synthetic b:La2/a;


# direct methods
.method constructor <init>(Lz1/b$b;La2/a;)V
    .locals 0

    iput-object p1, p0, Lz1/b$b$l;->a:Lz1/b$b;

    iput-object p2, p0, Lz1/b$b$l;->b:La2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/b$b$l;->a:Lz1/b$b;

    invoke-virtual {v0}, Lz1/b$b;->s()Lb2/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz1/b$b$l;->b:La2/a;

    invoke-interface {v0, v1}, Lb2/b;->r(Lb2/a;)V

    :cond_0
    return-void
.end method
