.class public Lb/c/a/e/b/a/a/a/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/c/a/e/b/a/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/c/a/e/b/a/a/a/a;


# direct methods
.method public constructor <init>(Lb/c/a/e/b/a/a/a/a;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/b/a/a/a/a$a;->a:Lb/c/a/e/b/a/a/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget-object p1, p0, Lb/c/a/e/b/a/a/a/a$a;->a:Lb/c/a/e/b/a/a/a/a;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Lb/c/a/e/b/a/a/a/a;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb/c/a/e/b/a/a/a/a;->e:La/t/a/b;

    invoke-virtual {p1, v1}, La/t/a/b;->setCurrentItem(I)V

    :cond_0
    return v1
.end method
