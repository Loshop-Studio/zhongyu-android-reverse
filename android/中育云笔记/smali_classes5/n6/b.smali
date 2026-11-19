.class public Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/d;


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic k(Ln6/b;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 1
    new-instance v0, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->q(Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->l(Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Lq6/d;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p1, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->p(Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ln6/b;->r(Lcom/luck/picture/lib/widget/MediaPlayerView;Lcom/luck/picture/lib/entity/LocalMedia;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->o(Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public h(Lq6/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ln6/b;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->n(Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/luck/picture/lib/widget/MediaPlayerView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ln6/b;->m(Lcom/luck/picture/lib/widget/MediaPlayerView;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public l(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public m(Lcom/luck/picture/lib/widget/MediaPlayerView;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->getMediaPlayer()Landroid/media/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public n(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->getMediaPlayer()Landroid/media/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->pause()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public o(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->d()Landroid/media/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ln6/b$a;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ln6/b$a;-><init>(Ln6/b;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ln6/b$b;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1}, Ln6/b$b;-><init>(Ln6/b;Lcom/luck/picture/lib/widget/MediaPlayerView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Ln6/b$c;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Ln6/b$c;-><init>(Ln6/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public p(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public q(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->getMediaPlayer()Landroid/media/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public r(Lcom/luck/picture/lib/widget/MediaPlayerView;Lcom/luck/picture/lib/entity/LocalMedia;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/luck/picture/lib/widget/MediaPlayerView;->getMediaPlayer()Landroid/media/MediaPlayer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/luck/picture/lib/config/PictureSelectionConfig;->c()Lcom/luck/picture/lib/config/PictureSelectionConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v1, v1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->H0:Z

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/luck/picture/lib/entity/LocalMedia;->g()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p1, p2}, Lcom/luck/picture/lib/widget/MediaPlayerView;->f(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
