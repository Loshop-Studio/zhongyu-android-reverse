.class public final Lcom/zykj/study/ui/SuperPlayerActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/zykj/video/play/SuperPlayerView$f;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/SuperPlayerActivity$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/study/ui/SuperPlayerActivity$a;

.field public static final d:I


# instance fields
.field public a:Landroid/widget/ImageView;

.field public b:Lcom/zykj/video/play/SuperPlayerView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/SuperPlayerActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/SuperPlayerActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/SuperPlayerActivity;->c:Lcom/zykj/study/ui/SuperPlayerActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/SuperPlayerActivity;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mSuperPlayerView"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->p0()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.MAIN"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/high16 v1, 0x10000000

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string v1, "android.intent.category.HOME"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/SuperPlayerActivity;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_back:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "findViewById(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Landroid/widget/ImageView;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->a:Landroid/widget/ImageView;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "mImageBack"

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    move-object v0, v2

    .line 25
    :cond_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    .line 27
    .line 28
    sget v0, Lcom/zykj/study/R$id;->superVodPlayerView:I

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v0, Lcom/zykj/video/play/SuperPlayerView;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "mSuperPlayerView"

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v2, v0

    .line 50
    :goto_0
    invoke-virtual {v2, p0}, Lcom/zykj/video/play/SuperPlayerView;->setPlayerViewCallback(Lcom/zykj/video/play/SuperPlayerView$f;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final g(Lj5/h;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/video/play/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/video/play/b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Lj5/h;->c:I

    .line 7
    .line 8
    iput v1, v0, Lcom/zykj/video/play/b;->a:I

    .line 9
    .line 10
    iget-object v1, p1, Lj5/h;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p1, Lj5/h;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, v0, Lcom/zykj/video/play/b;->f:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lj5/h;->b:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v1, v0, Lcom/zykj/video/play/b;->b:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 33
    .line 34
    iget-object p1, p1, Lj5/h;->e:Ljava/util/List;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lcom/blankj/utilcode/util/p;->a(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v2

    .line 57
    :cond_1
    iget-object v1, p1, Lj5/h;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    new-instance v1, Li5/a;

    .line 66
    .line 67
    invoke-direct {v1}, Li5/a;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object v1, v0, Lcom/zykj/video/play/b;->e:Li5/a;

    .line 71
    .line 72
    iget-object p1, p1, Lj5/h;->d:Ljava/lang/String;

    .line 73
    .line 74
    iput-object p1, v1, Li5/a;->a:Ljava/lang/String;

    .line 75
    .line 76
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    const-string p1, "mSuperPlayerView"

    .line 81
    .line 82
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object v2, p1

    .line 87
    :goto_1
    invoke-virtual {v2, v0}, Lcom/zykj/video/play/SuperPlayerView;->l0(Lcom/zykj/video/play/b;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "mSuperPlayerView"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->p0()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget v0, Lcom/zykj/video/play/R$id;->superplayer_iv_back:I

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/SuperPlayerActivity;->h()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    # RE layout layout/activity_supervod_player (0x7f0c001d), APK res/9s.xml
    sget p1, Lcom/zykj/study/R$layout;->activity_supervod_player:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/16 v0, 0x80

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/ui/SuperPlayerActivity;->f()V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lj5/h;

    .line 22
    .line 23
    invoke-direct {p1}, Lj5/h;-><init>()V

    .line 24
    .line 25
    .line 26
    const v0, 0x4aa714ac    # 5474902.0f

    .line 27
    .line 28
    .line 29
    iput v0, p1, Lj5/h;->c:I

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "path"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p1, Lj5/h;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/SuperPlayerActivity;->g(Lj5/h;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "mSuperPlayerView"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->m0()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v1

    .line 26
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->getPlayMode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v3, 0x3

    .line 31
    if-eq v0, v3, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move-object v1, v0

    .line 42
    :goto_0
    invoke-virtual {v1}, Lcom/zykj/video/play/SuperPlayerView;->p0()V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public onPause()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "mSuperPlayerView"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->getPlayState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "onPause state :"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v3, "SuperPlayerActivity"

    .line 37
    .line 38
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v1

    .line 49
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->getPlayMode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v3, 0x3

    .line 54
    if-eq v0, v3, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v1, v0

    .line 65
    :goto_0
    invoke-virtual {v1}, Lcom/zykj/video/play/SuperPlayerView;->d0()V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-string v2, "mSuperPlayerView"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->getPlayState()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-ne v0, v3, :cond_4

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->e0()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/video/play/SuperPlayerView;->getPlayMode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v4, 0x3

    .line 46
    if-ne v0, v4, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v1

    .line 56
    :cond_3
    invoke-virtual {v0, v3}, Lcom/zykj/video/play/SuperPlayerView;->o0(I)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object v0, p0, Lcom/zykj/study/ui/SuperPlayerActivity;->b:Lcom/zykj/video/play/SuperPlayerView;

    .line 60
    .line 61
    if-nez v0, :cond_5

    .line 62
    .line 63
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    move-object v1, v0

    .line 68
    :goto_0
    invoke-virtual {v1}, Lcom/zykj/video/play/SuperPlayerView;->getPlayMode()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const/4 v1, 0x2

    .line 73
    if-ne v0, v1, :cond_7

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-nez v0, :cond_6

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    const/16 v1, 0x1006

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 89
    .line 90
    .line 91
    :cond_7
    :goto_1
    return-void
.end method
