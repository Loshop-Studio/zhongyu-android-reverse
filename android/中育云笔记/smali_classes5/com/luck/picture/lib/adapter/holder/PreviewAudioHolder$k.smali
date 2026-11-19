.class public Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->a(Lcom/luck/picture/lib/entity/LocalMedia;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/luck/picture/lib/entity/LocalMedia;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Lcom/luck/picture/lib/entity/LocalMedia;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->d:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, La7/f;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder;->i:Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->c:Lcom/luck/picture/lib/entity/LocalMedia;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/luck/picture/lib/entity/LocalMedia;->q()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {p1, v0}, Lcom/luck/picture/lib/adapter/holder/BasePreviewHolder$a;->c(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 22
    .line 23
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->m(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Landroid/media/MediaPlayer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->v(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catch_0
    move-exception p1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->w(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->x(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object p1, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->e:Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder$k;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1, v0}, Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;->y(Lcom/luck/picture/lib/adapter/holder/PreviewAudioHolder;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
