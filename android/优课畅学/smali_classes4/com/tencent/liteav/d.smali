.class public Lcom/tencent/liteav/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public c:F

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/String;

.field public m:I

.field public n:Ljava/lang/String;

.field public o:I

.field public p:I

.field public q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Ljava/lang/String;

.field public w:I

.field public x:I

.field public y:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40a00000    # 5.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/liteav/d;->a:F

    .line 7
    .line 8
    iput v0, p0, Lcom/tencent/liteav/d;->b:F

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Lcom/tencent/liteav/d;->c:F

    .line 13
    .line 14
    const/16 v0, 0x320

    .line 15
    .line 16
    iput v0, p0, Lcom/tencent/liteav/d;->d:I

    .line 17
    .line 18
    const/4 v0, 0x5

    .line 19
    iput v0, p0, Lcom/tencent/liteav/d;->e:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput v0, p0, Lcom/tencent/liteav/d;->f:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/liteav/d;->g:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/liteav/d;->h:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/liteav/d;->i:Z

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iput-boolean v1, p0, Lcom/tencent/liteav/d;->j:Z

    .line 32
    .line 33
    iput-boolean v1, p0, Lcom/tencent/liteav/d;->k:Z

    .line 34
    .line 35
    const-string v1, ""

    .line 36
    .line 37
    iput-object v1, p0, Lcom/tencent/liteav/d;->l:Ljava/lang/String;

    .line 38
    .line 39
    iput v0, p0, Lcom/tencent/liteav/d;->m:I

    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    iput v0, p0, Lcom/tencent/liteav/d;->r:I

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-object v0, p0, Lcom/tencent/liteav/d;->y:Lorg/json/JSONArray;

    .line 47
    .line 48
    return-void
.end method
