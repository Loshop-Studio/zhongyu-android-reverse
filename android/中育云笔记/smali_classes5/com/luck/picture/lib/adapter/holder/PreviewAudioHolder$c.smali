.class public Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o:Landroid/widget/SeekBar;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->q(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->r(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->z(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->o(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$c;->a:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-static {p1, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->p(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
