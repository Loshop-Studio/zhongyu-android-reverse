.class public Ln6/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln6/b;->o(Lcom/luck/picture/lib/widget/MediaPlayerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln6/b;


# direct methods
.method public constructor <init>(Ln6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln6/b$c;->a:Ln6/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    move p2, p1

    .line 3
    :goto_0
    iget-object p3, p0, Ln6/b$c;->a:Ln6/b;

    .line 4
    .line 5
    invoke-static {p3}, Ln6/b;->k(Ln6/b;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-ge p2, p3, :cond_0

    .line 14
    .line 15
    iget-object p3, p0, Ln6/b$c;->a:Ln6/b;

    .line 16
    .line 17
    invoke-static {p3}, Ln6/b;->k(Ln6/b;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    check-cast p3, Lq6/d;

    .line 26
    .line 27
    invoke-interface {p3}, Lq6/d;->c()V

    .line 28
    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return p1
.end method
