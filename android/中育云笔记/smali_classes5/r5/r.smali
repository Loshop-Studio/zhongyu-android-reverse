.class public Lr5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/u;


# instance fields
.field public c:[B

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/util/List;


# direct methods
.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, [B

    .line 9
    .line 10
    iput-object p1, p0, Lr5/r;->c:[B

    .line 11
    .line 12
    iput-object p2, p0, Lr5/r;->d:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lr5/r;->e:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p4, p0, Lr5/r;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p5, p0, Lr5/r;->f:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p6, p0, Lr5/r;->h:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, Lr5/r;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lr5/r;->g:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lr5/r;->f:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lr5/e0;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final b(Ljava/util/Map;)Lr5/n0;
    .locals 2

    .line 1
    iget-object v0, p0, Lr5/r;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lr5/r;->c:[B

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lcom/huawei/hms/hatool/w;->b(Ljava/lang/String;[BLjava/util/Map;)Lr5/n0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final c()V
    .locals 5

    .line 1
    new-instance v0, Lr5/k;

    .line 2
    .line 3
    iget-object v1, p0, Lr5/r;->h:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lr5/r;->e:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lr5/r;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lr5/r;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lr5/k;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lr5/e;->d()Lr5/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Lr5/e;->b(Lr5/u;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    const-string v0, "send data running"

    .line 2
    .line 3
    const-string v1, "hmsSdk"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lr5/f1;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lr5/r;->a()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lr5/r;->b(Ljava/util/Map;)Lr5/n0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lr5/n0;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v2, 0xc8

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lr5/r;->c()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lr5/r;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v3, p0, Lr5/r;->g:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v4, p0, Lr5/r;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    filled-new-array {v3, v4, v0}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v1, v2, v0}, Lr5/f1;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
