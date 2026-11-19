.class public Lcom/tencent/liteav/txcvodplayer/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:F

.field b:F

.field c:F

.field d:Z

.field e:Ljava/lang/String;

.field f:I

.field g:I

.field h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field i:Z

.field j:Z

.field k:Ljava/lang/String;

.field l:I

.field m:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40400000    # 3.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->a:F

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->b:F

    .line 9
    .line 10
    const/high16 v0, 0x41f00000    # 30.0f

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->c:F

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->d:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, p0, Lcom/tencent/liteav/txcvodplayer/d;->g:I

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->i:Z

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->a:F

    return-void
.end method

.method public a(I)V
    .locals 0

    .line 5
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->f:I

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->h:Ljava/util/Map;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->d:Z

    return-void
.end method

.method public a()Z
    .locals 1

    .line 3
    iget-boolean v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->d:Z

    return v0
.end method

.method public b()I
    .locals 1

    .line 3
    iget v0, p0, Lcom/tencent/liteav/txcvodplayer/d;->g:I

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->b:F

    return-void
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->g:I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->k:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->i:Z

    return-void
.end method

.method public c(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->c:F

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->l:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->j:Z

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/txcvodplayer/d;->m:I

    .line 2
    .line 3
    return-void
.end method
