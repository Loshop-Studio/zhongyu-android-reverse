.class public final synthetic Lcom/zykj/merge/sketch/view/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/RelativeLayout;ILr6/c;Lr6/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/merge/sketch/view/f;->a:I

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/f;->c:Ljava/lang/Object;

    iput p2, p0, Lcom/zykj/merge/sketch/view/f;->b:I

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/f;->d:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/merge/sketch/view/f;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/f;Lcom/zykj/mistake/widget/StemWebView;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/merge/sketch/view/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/merge/sketch/view/f;->e:Ljava/lang/Object;

    iput p4, p0, Lcom/zykj/merge/sketch/view/f;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/merge/sketch/view/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/f;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/f;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lr6/c;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/merge/sketch/view/f;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lr6/c;

    .line 17
    .line 18
    iget v3, p0, Lcom/zykj/merge/sketch/view/f;->b:I

    .line 19
    .line 20
    invoke-static {v0, v3, v1, v2}, Lcom/zykj/sketch/core/player/SketchPlayerView;->m(Lcom/zykj/sketch/core/player/SketchPlayerView;ILr6/c;Lr6/c;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/f;->c:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/f;->d:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v6, v0

    .line 32
    check-cast v6, Lcom/zykj/mistake/feature/notebook/detail/f;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/f;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lcom/zykj/mistake/widget/StemWebView;

    .line 37
    .line 38
    invoke-virtual {v2, v6}, Lcom/zykj/mistake/feature/notebook/detail/a5;->g(Lcom/zykj/mistake/feature/notebook/detail/f;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/mistake/widget/StemWebView;->a()Landroid/graphics/Bitmap;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    new-instance v3, Ljava/io/File;

    .line 52
    .line 53
    const-string v0, "AskMaterial"

    .line 54
    .line 55
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Ljava/io/File;

    .line 63
    .line 64
    const-string v0, "stem_snapshot_"

    .line 65
    .line 66
    const-string v1, ".jpg"

    .line 67
    .line 68
    iget v7, p0, Lcom/zykj/merge/sketch/view/f;->b:I

    .line 69
    .line 70
    invoke-static {v7, v0, v1}, Landroid/support/v4/media/f;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {v4, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/u4;

    .line 78
    .line 79
    invoke-direct/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/u4;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Ljava/io/File;Ljava/io/File;Landroid/graphics/Bitmap;Lcom/zykj/mistake/feature/notebook/detail/f;I)V

    .line 80
    .line 81
    .line 82
    const-string v0, "StemSnapshotWriter"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lh4/a;->o(Ljava/lang/String;Lr6/a;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v6, v5}, Lcom/zykj/mistake/feature/notebook/detail/a5;->l(Lcom/zykj/mistake/feature/notebook/detail/f;Landroid/graphics/Bitmap;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->a:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 92
    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Lcom/zykj/mistake/feature/notebook/detail/a5;->d(Lcom/zykj/view/simpleBoard/SimpleBoardView;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-virtual {v2, v6}, Lcom/zykj/mistake/feature/notebook/detail/a5;->j(Lcom/zykj/mistake/feature/notebook/detail/f;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    iget-object v0, v2, Lcom/zykj/mistake/feature/notebook/detail/a5;->b:Landroid/widget/FrameLayout;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 106
    .line 107
    .line 108
    :cond_3
    :goto_1
    return-void

    .line 109
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/f;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 112
    .line 113
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/f;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v1, Lr6/c;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/zykj/merge/sketch/view/f;->e:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Lr6/c;

    .line 120
    .line 121
    iget v3, p0, Lcom/zykj/merge/sketch/view/f;->b:I

    .line 122
    .line 123
    invoke-static {v0, v3, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->e(Lcom/zykj/merge/sketch/view/OldSketchProxyView;ILr6/c;Lr6/c;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
