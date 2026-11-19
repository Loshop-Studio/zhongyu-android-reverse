.class public final Lb/d/a/b/b$a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/d/a/b/b$a;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/d/a/b/b$a;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/b$a$f;->a:Lb/d/a/b/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb/d/a/b/b$a$f;->a:Lb/d/a/b/b$a;

    invoke-static {p1}, Lb/d/a/b/b$a;->h(Lb/d/a/b/b$a;)Landroid/app/Application;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lb/d/a/b/b$a;->i(Landroid/content/Context;Z)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
