.class public Lk7/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk7/b;->onError(Ltv/danmaku/ijk/media/player/IMediaPlayer;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Lk7/b;


# direct methods
.method public constructor <init>(Lk7/b;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/b$e;->e:Lk7/b;

    .line 2
    .line 3
    iput p2, p0, Lk7/b$e;->c:I

    .line 4
    .line 5
    iput p3, p0, Lk7/b$e;->d:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lk7/b$e;->e:Lk7/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk7/b;->c()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7/b$e;->e:Lk7/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk7/b;->listener()Ll7/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lk7/b$e;->e:Lk7/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Lk7/b;->listener()Ll7/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p0, Lk7/b$e;->c:I

    .line 21
    .line 22
    iget v2, p0, Lk7/b$e;->d:I

    .line 23
    .line 24
    invoke-interface {v0, v1, v2}, Ll7/a;->onError(II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method
