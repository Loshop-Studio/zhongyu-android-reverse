.class public final Lcom/efs/sdk/base/a/g/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/base/a/g/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/base/a/f/b;

.field final synthetic b:Lcom/efs/sdk/base/a/g/d;


# direct methods
.method public constructor <init>(Lcom/efs/sdk/base/a/g/d;Lcom/efs/sdk/base/a/f/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/base/a/g/d$1;->b:Lcom/efs/sdk/base/a/g/d;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/efs/sdk/base/a/g/d$1;->a:Lcom/efs/sdk/base/a/f/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/a/g/d$1;->b:Lcom/efs/sdk/base/a/g/d;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/efs/sdk/base/a/g/d;->a:Lcom/efs/sdk/base/a/g/a;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/efs/sdk/base/a/g/d$1;->a:Lcom/efs/sdk/base/a/f/b;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/efs/sdk/base/a/g/a;->a(Lcom/efs/sdk/base/a/f/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
