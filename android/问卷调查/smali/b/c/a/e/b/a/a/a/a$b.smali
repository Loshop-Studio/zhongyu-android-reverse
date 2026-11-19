.class public Lb/c/a/e/b/a/a/a/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/c/a/e/b/a/a/a/a;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lb/c/a/e/b/a/a/a/a;


# direct methods
.method public constructor <init>(Lb/c/a/e/b/a/a/a/a;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/b/a/a/a/a$b;->b:Lb/c/a/e/b/a/a/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/b/a/a/a/a$b;->b:Lb/c/a/e/b/a/a/a/a;

    .line 1
    iget-object v0, v0, Lb/c/a/e/b/a/a/a/a;->s:Landroid/os/Handler;

    .line 2
    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
