.class public Lk7/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/b;->onBufferingUpdate(Ltv/danmaku/ijk/media/player/IMediaPlayer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lk7/b;


# direct methods
.method public constructor <init>(Lk7/b;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/b$c;->d:Lk7/b;

    .line 2
    .line 3
    iput p2, p0, Lk7/b$c;->c:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/b$c;->d:Lk7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk7/b;->listener()Ll7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v0, p0, Lk7/b$c;->c:I

    .line 10
    .line 11
    iget-object v1, p0, Lk7/b$c;->d:Lk7/b;

    .line 12
    .line 13
    iget v2, v1, Lk7/b;->o:I

    .line 14
    .line 15
    if-le v0, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lk7/b;->listener()Ll7/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, p0, Lk7/b$c;->c:I

    .line 22
    .line 23
    invoke-interface {v0, v1}, Ll7/a;->onBufferingUpdate(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {v1}, Lk7/b;->listener()Ll7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lk7/b$c;->d:Lk7/b;

    .line 32
    .line 33
    iget v1, v1, Lk7/b;->o:I

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ll7/a;->onBufferingUpdate(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method
