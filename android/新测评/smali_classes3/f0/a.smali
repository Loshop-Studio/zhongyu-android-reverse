.class public Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Lf0/a;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/Boolean;

.field public j:Ljava/lang/String;

.field public k:Lf0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf0/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf0/a;->l:Lf0/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lf0/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v0, p0, Lf0/a;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lf0/a;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lf0/a;->d:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lf0/a;->e:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lf0/a;->f:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v0, p0, Lf0/a;->g:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Lf0/a;->h:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    iput-object v1, p0, Lf0/a;->i:Ljava/lang/Boolean;

    .line 24
    .line 25
    iput-object v0, p0, Lf0/a;->j:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Lf0/b;

    .line 28
    .line 29
    invoke-direct {v0}, Lf0/b;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lf0/a;->k:Lf0/b;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 2

    .line 1
    iget-object v0, p0, Lf0/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lf0/a;->e:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lf0/a;->c:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lf0/a;->a:Landroid/content/Context;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "have send args is null\uff0cyou must init first. appId "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lf0/a;->b:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " appVersion "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lf0/a;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, " appKey "

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lf0/a;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lj0/e;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 64
    .line 65
    return-object v0
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf0/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lf0/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lf0/a;->c:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lf0/a;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lf0/a;->f:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lf0/a;->g:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public c(Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lf0/a;->a()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lf0/a;->h:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_0
    move-object v3, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const-string p1, "h-adashx.ut.taobao.com"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :goto_1
    iget-object v1, p0, Lf0/a;->c:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lf0/a;->a:Landroid/content/Context;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-wide v4, p2

    .line 28
    move-object/from16 v6, p4

    .line 29
    .line 30
    move/from16 v7, p5

    .line 31
    .line 32
    move-object/from16 v8, p6

    .line 33
    .line 34
    move-object/from16 v9, p7

    .line 35
    .line 36
    move-object/from16 v10, p8

    .line 37
    .line 38
    move-object/from16 v11, p9

    .line 39
    .line 40
    invoke-static/range {v0 .. v11}, Li0/b;->a(Lf0/a;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    return-object p1
.end method
