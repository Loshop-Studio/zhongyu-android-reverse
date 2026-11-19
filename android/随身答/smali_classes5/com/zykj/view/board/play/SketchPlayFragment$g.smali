.class public final Lcom/zykj/view/board/play/SketchPlayFragment$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/merge/sketch/listener/PlayStatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->g(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->f(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic c(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->i(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/view/board/play/SketchPlayFragment;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->j(Lcom/zykj/view/board/play/SketchPlayFragment;J)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment$g;->h(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    return-void
.end method

.method public static final f(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "mBinding"

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r(Lcom/zykj/view/board/play/SketchPlayFragment;)Le7/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Le7/a;->h()Le7/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final g(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "mBinding"

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_play:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r(Lcom/zykj/view/board/play/SketchPlayFragment;)Le7/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Le7/a;->h()Le7/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final h(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "mBinding"

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v1, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r(Lcom/zykj/view/board/play/SketchPlayFragment;)Le7/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Le7/a;->h()Le7/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :catch_0
    move-exception p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final i(Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "mBinding"

    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    sget v0, Lcom/zykj/view/R$drawable;->selector_btn_music_pause:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final j(Lcom/zykj/view/board/play/SketchPlayFragment;J)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "mBinding"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->d:Landroid/widget/SeekBar;

    .line 17
    .line 18
    long-to-int v3, p1

    .line 19
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/zykj/view/board/play/SketchPlayFragment;->s:Lcom/zykj/view/board/play/SketchPlayFragment$a;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$a;->a(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->B(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, p1

    .line 42
    :goto_0
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 43
    .line 44
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->t(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->u(Lcom/zykj/view/board/play/SketchPlayFragment;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p2, "/"

    .line 63
    .line 64
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r(Lcom/zykj/view/board/play/SketchPlayFragment;)Le7/a;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, Le7/a;->h()Le7/b;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 84
    .line 85
    .line 86
    :cond_2
    return-void

    .line 87
    :catch_0
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 89
    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public onPlayEnd()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->y(Lcom/zykj/view/board/play/SketchPlayFragment;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "mBinding"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 26
    .line 27
    new-instance v2, Le7/z;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Le7/z;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onPlayPause()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 20
    .line 21
    new-instance v2, Le7/x;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Le7/x;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onPlayStart()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 20
    .line 21
    new-instance v2, Le7/a0;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Le7/a0;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onPlayWait()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 20
    .line 21
    new-instance v2, Le7/b0;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Le7/b0;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public onProgress(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "mBinding"

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->f:Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$g;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 20
    .line 21
    new-instance v2, Le7/y;

    .line 22
    .line 23
    invoke-direct {v2, v1, p1, p2}, Le7/y;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;J)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
