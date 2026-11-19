.class public Lcom/zykj/video/play/SuperPlayerView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/SuperPlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/SuperPlayerView;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/SuperPlayerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/zykj/video/play/SuperPlayerView;->O(Lcom/zykj/video/play/SuperPlayerView;F)F

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->setRate(F)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const-string v3, "change_speed"

    .line 31
    .line 32
    invoke-virtual {p1, v3, v0, v1, v2}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public b(I)V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_1

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->r(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 18
    .line 19
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lcom/zykj/video/play/SuperPlayerView$f;->b()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p0, v1}, Lcom/zykj/video/play/SuperPlayerView$c;->j(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Lcom/zykj/video/play/SuperPlayerView$f;->d()V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 66
    .line 67
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->z(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-ne p1, v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/zykj/video/play/SuperPlayerView$c;->j(I)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->setMirror(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const-string v3, "mirror"

    .line 28
    .line 29
    invoke-virtual {p1, v3, v0, v1, v2}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lcom/zykj/video/play/SuperPlayerView$c$a;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lcom/zykj/video/play/SuperPlayerView$c$a;-><init>(Lcom/zykj/video/play/SuperPlayerView$c;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->snapshot(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x3

    .line 40
    if-ne v0, v1, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "\u65f6\u79fb\u76f4\u64ad\u65f6\u6682\u4e0d\u652f\u6301\u622a\u56fe"

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, Lcom/zykj/video/play/SuperPlayerView$c$b;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lcom/zykj/video/play/SuperPlayerView$c$b;-><init>(Lcom/zykj/video/play/SuperPlayerView$c;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->snapshot(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXLivePlayer;->resumeLive()I

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->X(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public f(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->r(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 24
    .line 25
    invoke-static {p2}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 30
    .line 31
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1, p2, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public g(Lj5/g;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->U(Lj5/g;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v0, p1, Lj5/g;->e:Ljava/lang/String;

    .line 29
    .line 30
    const-string v3, "SuperPlayerView"

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 35
    .line 36
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXVodPlayer;->getCurrentPlaybackTime()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 45
    .line 46
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4, v2}, Lcom/tencent/rtmp/TXVodPlayer;->stopPlay(Z)I

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v4, "onQualitySelect quality.url:"

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v4, p1, Lj5/g;->e:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v3, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 76
    .line 77
    invoke-static {v2}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, v0}, Lcom/tencent/rtmp/TXVodPlayer;->setStartTime(F)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 85
    .line 86
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object p1, p1, Lj5/g;->e:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->startPlay(Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v2, "setBitrateIndex quality.index:"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget v2, p1, Lj5/g;->a:I

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget p1, p1, Lj5/g;->a:I

    .line 126
    .line 127
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->setBitrateIndex(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 132
    .line 133
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-object v0, p1, Lj5/g;->e:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 148
    .line 149
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget-object v2, p1, Lj5/g;->e:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Lcom/tencent/rtmp/TXLivePlayer;->switchStream(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-gez v0, :cond_2

    .line 160
    .line 161
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 162
    .line 163
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v2, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v3, "\u5207\u6362"

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    iget-object p1, p1, Lj5/g;->d:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, "\u6e05\u6670\u5ea6\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u91cd\u8bd5"

    .line 183
    .line 184
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_2
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const-string v3, "\u6b63\u5728\u5207\u6362\u5230"

    .line 211
    .line 212
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget-object p1, p1, Lj5/g;->d:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p1, "..."

    .line 221
    .line 222
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 234
    .line 235
    .line 236
    :cond_3
    :goto_0
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    const-string v0, "change_resolution"

    .line 241
    .line 242
    const-wide/16 v2, 0x0

    .line 243
    .line 244
    invoke-virtual {p1, v0, v2, v3, v1}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 245
    .line 246
    .line 247
    return-void
.end method

.method public getSpeed()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->N(Lcom/zykj/video/play/SuperPlayerView;)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->K(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/view/TCDanmuView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->K(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/view/TCDanmuView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Lcom/zykj/video/play/view/TCDanmuView;->J(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public i(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->P(Lcom/zykj/video/play/SuperPlayerView;Z)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->enableHardwareDecode(Z)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/tencent/rtmp/TXVodPlayer;->getCurrentPlaybackTime()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    float-to-int v1, v1

    .line 43
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->R(Lcom/zykj/video/play/SuperPlayerView;I)I

    .line 44
    .line 45
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "save pos:"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 57
    .line 58
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->Q(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "SuperPlayerView"

    .line 70
    .line 71
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 75
    .line 76
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->S(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 80
    .line 81
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-nez v0, :cond_0

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 88
    .line 89
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->T(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 98
    .line 99
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->V(Lcom/zykj/video/play/SuperPlayerView;)Lm5/b;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->W(Lcom/zykj/video/play/SuperPlayerView;Lm5/b;)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 108
    .line 109
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXLivePlayer;->enableHardwareDecode(Z)Z

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 125
    .line 126
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->l0(Lcom/zykj/video/play/b;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 134
    const-wide/16 v1, 0x0

    .line 135
    .line 136
    if-eqz p1, :cond_3

    .line 137
    .line 138
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const-string v3, "hw_decode"

    .line 143
    .line 144
    invoke-virtual {p1, v3, v1, v2, v0}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-string v3, "soft_decode"

    .line 153
    .line 154
    invoke-virtual {p1, v3, v1, v2, v0}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public j(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->a(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->g(Lcom/zykj/video/play/SuperPlayerView;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    const/4 v1, 0x2

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne p1, v1, :cond_2

    .line 25
    .line 26
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 27
    .line 28
    invoke-static {v3, v2}, Lcom/zykj/video/play/SuperPlayerView;->h(Lcom/zykj/video/play/SuperPlayerView;Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 33
    .line 34
    invoke-static {v3, v0}, Lcom/zykj/video/play/SuperPlayerView;->h(Lcom/zykj/video/play/SuperPlayerView;Z)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 38
    .line 39
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->hide()V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 47
    .line 48
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->i(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Lcom/zykj/video/play/controller/TCControllerWindow;->hide()V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 56
    .line 57
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Lcom/zykj/video/play/controller/TCControllerFloat;->hide()V

    .line 62
    .line 63
    .line 64
    if-ne p1, v1, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->o(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :cond_3
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->i(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 86
    .line 87
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 92
    .line 93
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->k(Lcom/zykj/video/play/SuperPlayerView;)Landroid/widget/RelativeLayout$LayoutParams;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->o(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 110
    .line 111
    invoke-static {v0, v2}, Lcom/zykj/video/play/SuperPlayerView;->l(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 115
    .line 116
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-eqz v0, :cond_10

    .line 121
    .line 122
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 123
    .line 124
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, Lcom/zykj/video/play/SuperPlayerView$f;->e()V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_4
    const-string v3, "\u60ac\u6d6e\u64ad\u653e\u5931\u8d25"

    .line 134
    .line 135
    const/4 v4, 0x3

    .line 136
    if-ne p1, v2, :cond_a

    .line 137
    .line 138
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 139
    .line 140
    invoke-static {v5}, Lcom/zykj/video/play/SuperPlayerView;->a(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-ne v5, v4, :cond_8

    .line 145
    .line 146
    :try_start_0
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    instance-of v4, v1, Landroid/app/Activity;

    .line 153
    .line 154
    if-eqz v4, :cond_7

    .line 155
    .line 156
    new-instance v0, Landroid/content/Intent;

    .line 157
    .line 158
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 172
    .line 173
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 181
    .line 182
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->p(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 186
    .line 187
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->c(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-nez v0, :cond_5

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_5
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 196
    .line 197
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->r(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 202
    .line 203
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 211
    .line 212
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-ne v0, v2, :cond_6

    .line 217
    .line 218
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 219
    .line 220
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 225
    .line 226
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->M(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :catch_0
    move-exception v0

    .line 235
    goto :goto_2

    .line 236
    :cond_6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 237
    .line 238
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 243
    .line 244
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->M(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v0, v1}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 249
    .line 250
    .line 251
    :goto_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 252
    .line 253
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->v(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 254
    .line 255
    .line 256
    goto/16 :goto_6

    .line 257
    .line 258
    :cond_7
    invoke-static {v1, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_8
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 272
    .line 273
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->a(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-ne v0, v1, :cond_10

    .line 278
    .line 279
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 280
    .line 281
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->c(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-nez v0, :cond_9

    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_9
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 289
    .line 290
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->f(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 295
    .line 296
    .line 297
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 298
    .line 299
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->i(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerWindow;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 304
    .line 305
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->w(Lcom/zykj/video/play/SuperPlayerView;)Landroid/widget/RelativeLayout$LayoutParams;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 310
    .line 311
    .line 312
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 313
    .line 314
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->c(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/ViewGroup$LayoutParams;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 322
    .line 323
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->l(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 324
    .line 325
    .line 326
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 327
    .line 328
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    if-eqz v0, :cond_10

    .line 333
    .line 334
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 335
    .line 336
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->m(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$f;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-interface {v0}, Lcom/zykj/video/play/SuperPlayerView$f;->a()V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_6

    .line 344
    .line 345
    :cond_a
    if-ne p1, v4, :cond_10

    .line 346
    .line 347
    new-instance v1, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const-string v4, "requestPlayMode Float :"

    .line 353
    .line 354
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const-string v4, "SuperPlayerView"

    .line 367
    .line 368
    invoke-static {v4, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-static {}, Lcom/zykj/video/play/a;->a()Lcom/zykj/video/play/a;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    iget-boolean v4, v1, Lcom/zykj/video/play/a;->a:Z

    .line 376
    .line 377
    if-nez v4, :cond_b

    .line 378
    .line 379
    :goto_3
    return-void

    .line 380
    :cond_b
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 381
    .line 382
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 383
    .line 384
    invoke-static {v5}, Lcom/zykj/video/play/SuperPlayerView;->n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    invoke-static {v5}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-nez v5, :cond_c

    .line 393
    .line 394
    new-instance p1, Landroid/content/Intent;

    .line 395
    .line 396
    const-string v0, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 397
    .line 398
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 404
    .line 405
    .line 406
    const-string v1, "package:"

    .line 407
    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 412
    .line 413
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 436
    .line 437
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :cond_c
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 446
    .line 447
    invoke-static {v5}, Lcom/zykj/video/play/SuperPlayerView;->p(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 448
    .line 449
    .line 450
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 451
    .line 452
    invoke-static {v5}, Lcom/zykj/video/play/SuperPlayerView;->n(Lcom/zykj/video/play/SuperPlayerView;)Landroid/content/Context;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    const-string v7, "window"

    .line 461
    .line 462
    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    check-cast v6, Landroid/view/WindowManager;

    .line 467
    .line 468
    invoke-static {v5, v6}, Lcom/zykj/video/play/SuperPlayerView;->s(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/WindowManager;)Landroid/view/WindowManager;

    .line 469
    .line 470
    .line 471
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 472
    .line 473
    new-instance v6, Landroid/view/WindowManager$LayoutParams;

    .line 474
    .line 475
    invoke-direct {v6}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-static {v5, v6}, Lcom/zykj/video/play/SuperPlayerView;->y(Lcom/zykj/video/play/SuperPlayerView;Landroid/view/WindowManager$LayoutParams;)Landroid/view/WindowManager$LayoutParams;

    .line 479
    .line 480
    .line 481
    const/16 v5, 0x1a

    .line 482
    .line 483
    if-lt v4, v5, :cond_d

    .line 484
    .line 485
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 486
    .line 487
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    const/16 v5, 0x7f6

    .line 492
    .line 493
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 494
    .line 495
    goto :goto_4

    .line 496
    :cond_d
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 497
    .line 498
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    const/16 v5, 0x7d2

    .line 503
    .line 504
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 505
    .line 506
    :goto_4
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 507
    .line 508
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 509
    .line 510
    .line 511
    move-result-object v4

    .line 512
    const/16 v5, 0x28

    .line 513
    .line 514
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 515
    .line 516
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 517
    .line 518
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    const/4 v5, -0x3

    .line 523
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 524
    .line 525
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 526
    .line 527
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 528
    .line 529
    .line 530
    move-result-object v4

    .line 531
    const/16 v5, 0x33

    .line 532
    .line 533
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 534
    .line 535
    iget-object v1, v1, Lcom/zykj/video/play/a;->b:Lcom/zykj/video/play/a$a;

    .line 536
    .line 537
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 538
    .line 539
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    iget v5, v1, Lcom/zykj/video/play/a$a;->a:I

    .line 544
    .line 545
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 546
    .line 547
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 548
    .line 549
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    iget v5, v1, Lcom/zykj/video/play/a$a;->b:I

    .line 554
    .line 555
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 556
    .line 557
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 558
    .line 559
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    iget v5, v1, Lcom/zykj/video/play/a$a;->c:I

    .line 564
    .line 565
    iput v5, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 566
    .line 567
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 568
    .line 569
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    iget v1, v1, Lcom/zykj/video/play/a$a;->d:I

    .line 574
    .line 575
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 576
    .line 577
    :try_start_1
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 578
    .line 579
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->r(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    iget-object v4, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 584
    .line 585
    invoke-static {v4}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    iget-object v5, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 590
    .line 591
    invoke-static {v5}, Lcom/zykj/video/play/SuperPlayerView;->x(Lcom/zykj/video/play/SuperPlayerView;)Landroid/view/WindowManager$LayoutParams;

    .line 592
    .line 593
    .line 594
    move-result-object v5

    .line 595
    invoke-interface {v1, v4, v5}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 596
    .line 597
    .line 598
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 599
    .line 600
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->j(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/controller/TCControllerFloat;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-virtual {v1}, Lcom/zykj/video/play/controller/TCControllerFloat;->getFloatVideoView()Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    if-eqz v1, :cond_f

    .line 609
    .line 610
    iget-object v3, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 611
    .line 612
    invoke-static {v3}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    if-ne v3, v2, :cond_e

    .line 617
    .line 618
    iget-object v2, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 619
    .line 620
    invoke-static {v2}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    invoke-virtual {v2, v1}, Lcom/tencent/rtmp/TXVodPlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 625
    .line 626
    .line 627
    goto :goto_5

    .line 628
    :cond_e
    iget-object v2, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 629
    .line 630
    invoke-static {v2}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    invoke-virtual {v2, v1}, Lcom/tencent/rtmp/TXLivePlayer;->setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    .line 635
    .line 636
    .line 637
    :goto_5
    iget-object v1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 638
    .line 639
    invoke-static {v1}, Lcom/zykj/video/play/SuperPlayerView;->v(Lcom/zykj/video/play/SuperPlayerView;)V

    .line 640
    .line 641
    .line 642
    :cond_f
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    const-string v2, "floatmode"

    .line 647
    .line 648
    const-wide/16 v3, 0x0

    .line 649
    .line 650
    invoke-virtual {v1, v2, v3, v4, v0}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 651
    .line 652
    .line 653
    goto :goto_6

    .line 654
    :catch_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 655
    .line 656
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    invoke-static {p1, v3, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 661
    .line 662
    .line 663
    move-result-object p1

    .line 664
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :cond_10
    :goto_6
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 669
    .line 670
    invoke-static {v0, p1}, Lcom/zykj/video/play/SuperPlayerView;->b(Lcom/zykj/video/play/SuperPlayerView;I)I

    .line 671
    .line 672
    .line 673
    return-void
.end method

.method public k(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->seek(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->X(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ll5/b;->a()Ll5/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const-string v4, "timeshift"

    .line 42
    .line 43
    invoke-virtual {v0, v4, v1, v2, v3}, Ll5/b;->d(Ljava/lang/String;JI)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 55
    .line 56
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, p1}, Lcom/tencent/rtmp/TXLivePlayer;->seek(I)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->A(Lcom/zykj/video/play/SuperPlayerView;)Ln5/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/zykj/video/play/SuperPlayerView;->A(Lcom/zykj/video/play/SuperPlayerView;)Ln5/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ln5/c;->l()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXVodPlayer;->pause()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 37
    .line 38
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXLivePlayer;->pause()V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->A(Lcom/zykj/video/play/SuperPlayerView;)Ln5/c;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->A(Lcom/zykj/video/play/SuperPlayerView;)Ln5/c;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ln5/c;->l()V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->B(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->z(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->D(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;->c:Lcom/zykj/video/play/SuperPlayerView$PLAYER_TYPE;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ln5/e;->b(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-static {v0, v1, v3}, Lcom/zykj/video/play/SuperPlayerView;->F(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Ln5/e;->a(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 58
    .line 59
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->H(Lcom/zykj/video/play/SuperPlayerView;Lcom/zykj/video/play/b;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 67
    .line 68
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v0, v0, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 77
    .line 78
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->G(Lcom/zykj/video/play/SuperPlayerView;)Lcom/zykj/video/play/b;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, Lcom/zykj/video/play/b;->c:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_4

    .line 89
    .line 90
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 91
    .line 92
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->I(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 101
    .line 102
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->E(Lcom/zykj/video/play/SuperPlayerView;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v0, v1}, Lcom/zykj/video/play/SuperPlayerView;->J(Lcom/zykj/video/play/SuperPlayerView;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 111
    .line 112
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->z(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    const/4 v1, 0x2

    .line 117
    if-ne v0, v1, :cond_4

    .line 118
    .line 119
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 120
    .line 121
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->t(Lcom/zykj/video/play/SuperPlayerView;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-ne v0, v2, :cond_3

    .line 126
    .line 127
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 128
    .line 129
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v0, :cond_4

    .line 134
    .line 135
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 136
    .line 137
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->U(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXVodPlayer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXVodPlayer;->resume()V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_3
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 146
    .line 147
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 154
    .line 155
    invoke-static {v0}, Lcom/zykj/video/play/SuperPlayerView;->u(Lcom/zykj/video/play/SuperPlayerView;)Lcom/tencent/rtmp/TXLivePlayer;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/tencent/rtmp/TXLivePlayer;->resume()V

    .line 160
    .line 161
    .line 162
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/zykj/video/play/SuperPlayerView$c;->a:Lcom/zykj/video/play/SuperPlayerView;

    .line 163
    .line 164
    invoke-static {v0, v2}, Lcom/zykj/video/play/SuperPlayerView;->B(Lcom/zykj/video/play/SuperPlayerView;I)V

    .line 165
    .line 166
    .line 167
    return-void
.end method
