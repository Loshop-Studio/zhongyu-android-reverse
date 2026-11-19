.class public Lt7/b$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lt7/b;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lt7/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lt7/b$a;->a:Lt7/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    :goto_0
    iget-object p1, p0, Lt7/b$a;->a:Lt7/b;

    .line 7
    .line 8
    invoke-static {p1}, Lt7/b;->a(Lt7/b;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lt7/b$a;->a:Lt7/b;

    .line 20
    .line 21
    invoke-static {p1}, Lt7/b;->d(Lt7/b;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method
