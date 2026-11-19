.class Lcom/tencent/liteav/basic/d/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/basic/d/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:I

.field private f:[I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Lorg/json/JSONObject;

.field private p:I

.field private q:I


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->a:I

    .line 3
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/liteav/basic/d/c$a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->c:I

    .line 5
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->d:I

    .line 6
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->e:I

    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Lcom/tencent/liteav/basic/d/c$a;->f:[I

    .line 8
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->g:I

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/basic/d/c$a;->h:Ljava/lang/String;

    const/16 v0, 0x3c

    .line 10
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->i:I

    const/16 v0, 0x46

    .line 11
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->j:I

    const/16 v0, 0x50

    .line 12
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->k:I

    const/16 v0, 0x32

    .line 13
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->l:I

    const/16 v0, 0xa

    .line 14
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->m:I

    .line 15
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->n:I

    .line 16
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/basic/d/c$a;->o:Lorg/json/JSONObject;

    const/4 v0, -0x1

    .line 17
    iput v0, p0, Lcom/tencent/liteav/basic/d/c$a;->p:I

    .line 18
    iput v1, p0, Lcom/tencent/liteav/basic/d/c$a;->q:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/liteav/basic/d/c$1;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/tencent/liteav/basic/d/c$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->d:I

    return p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/d/c$a;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/basic/d/c$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/d/c$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/basic/d/c$a;->h:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/d/c$a;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/tencent/liteav/basic/d/c$a;->o:Lorg/json/JSONObject;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/liteav/basic/d/c$a;[I)[I
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/basic/d/c$a;->f:[I

    return-object p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->a:I

    return p0
.end method

.method public static synthetic b(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->e:I

    return p1
.end method

.method public static synthetic b(Lcom/tencent/liteav/basic/d/c$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/liteav/basic/d/c$a;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->c:I

    return p0
.end method

.method public static synthetic c(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->g:I

    return p1
.end method

.method public static synthetic d(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->n:I

    return p0
.end method

.method public static synthetic d(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->p:I

    return p1
.end method

.method public static synthetic e(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->q:I

    return p0
.end method

.method public static synthetic e(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->i:I

    return p1
.end method

.method public static synthetic f(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->m:I

    return p0
.end method

.method public static synthetic f(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->j:I

    return p1
.end method

.method public static synthetic g(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->k:I

    return p0
.end method

.method public static synthetic g(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->k:I

    return p1
.end method

.method public static synthetic h(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->l:I

    return p0
.end method

.method public static synthetic h(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->l:I

    return p1
.end method

.method public static synthetic i(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->i:I

    return p0
.end method

.method public static synthetic i(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->m:I

    return p1
.end method

.method public static synthetic j(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->j:I

    return p0
.end method

.method public static synthetic j(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->c:I

    return p1
.end method

.method public static synthetic k(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->a:I

    return p1
.end method

.method public static synthetic k(Lcom/tencent/liteav/basic/d/c$a;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/liteav/basic/d/c$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic l(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->d:I

    return p0
.end method

.method public static synthetic l(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->n:I

    return p1
.end method

.method public static synthetic m(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->e:I

    return p0
.end method

.method public static synthetic m(Lcom/tencent/liteav/basic/d/c$a;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/liteav/basic/d/c$a;->q:I

    return p1
.end method

.method public static synthetic n(Lcom/tencent/liteav/basic/d/c$a;)[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/basic/d/c$a;->f:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic p(Lcom/tencent/liteav/basic/d/c$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/basic/d/c$a;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic q(Lcom/tencent/liteav/basic/d/c$a;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/basic/d/c$a;->o:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object p0
.end method
