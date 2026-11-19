.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lz4/e;

.field public final synthetic d:Lw4/c;

.field public final synthetic e:Landroid/os/Messenger;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Ljava/lang/String;Lz4/e;Lw4/c;Landroid/os/Messenger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->a:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->c:Lz4/e;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->d:Lw4/c;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->e:Landroid/os/Messenger;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->a:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 4
    .line 5
    iget-object v0, v0, Lkotlinx/coroutines/flow/a0;->a:Lkotlinx/coroutines/flow/m0;

    .line 6
    .line 7
    invoke-interface {v0}, Lkotlinx/coroutines/flow/m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->I:Lcom/zykj/mistake/feature/notebook/detail/k3;

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/notebook/detail/k3;->f:Z

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->c:Lz4/e;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, v1, Lz4/e;->c:Lcom/zykj/view/utils/ImagePicker;

    .line 22
    .line 23
    iget-object v1, v1, Lz4/e;->a:Lcom/zykj/mistake/activity/MainActivity;

    .line 24
    .line 25
    new-instance v2, Ljava/io/File;

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v3, ".jpg"

    .line 40
    .line 41
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v2, v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Lcom/blankj/utilcode/util/e;->d(Ljava/io/File;)Z

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lcom/blankj/utilcode/util/c;->c(Ljava/io/File;)Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "file2Uri(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/h0;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->d:Lw4/c;

    .line 69
    .line 70
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/i0;->e:Landroid/os/Messenger;

    .line 71
    .line 72
    invoke-direct {v3, v5, v1, v6, v4}, Lcom/zykj/mistake/feature/notebook/detail/h0;-><init>(Lw4/c;Lcom/zykj/mistake/activity/MainActivity;Landroid/os/Messenger;I)V

    .line 73
    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-virtual {v0, v2, v1, v3}, Lcom/zykj/view/utils/ImagePicker;->startSystemCamera(Landroid/net/Uri;ZLr6/c;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, v1, Lz4/e;->d:Ll4/d;

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 85
    .line 86
    .line 87
    :cond_1
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 88
    .line 89
    return-object v0
.end method
