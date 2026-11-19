.class public Lg5/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg5/c;


# direct methods
.method public constructor <init>(Lg5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg5/c$c;->a:Lg5/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg5/c$c;->a:Lg5/c;

    .line 2
    .line 3
    invoke-static {v0}, Lg5/c;->c(Lg5/c;)Landroid/hardware/Camera;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lg5/c$c;->a:Lg5/c;

    .line 10
    .line 11
    invoke-static {v0}, Lg5/c;->d(Lg5/c;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lg5/c$c;->a:Lg5/c;

    .line 18
    .line 19
    iget-boolean v1, v0, Lg5/c;->h:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, Lg5/c;->e(Lg5/c;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lg5/c;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "doAutoFocus \u81ea\u52a8\u5bf9\u7126-------->>>>>"

    .line 34
    .line 35
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lg5/c$c;->a:Lg5/c;

    .line 39
    .line 40
    invoke-static {v0}, Lg5/c;->c(Lg5/c;)Landroid/hardware/Camera;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lg5/c$c;->a:Lg5/c;

    .line 45
    .line 46
    iget-object v1, v1, Lg5/c;->l:Landroid/hardware/Camera$AutoFocusCallback;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method
