.class public final Li9/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/d0$a;
    }
.end annotation


# instance fields
.field public final a:Li9/b0;

.field public final b:Lokhttp3/Protocol;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Lokhttp3/c;

.field public final f:Li9/v;

.field public final g:Li9/e0;

.field public final h:Li9/d0;

.field public final i:Li9/d0;

.field public final j:Li9/d0;

.field public final k:J

.field public final l:J

.field public final m:Ln9/h;

.field public n:Li9/g0;

.field public o:Li9/d;

.field public final p:Z

.field public final q:Z


# direct methods
.method public constructor <init>(Li9/b0;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/c;Li9/v;Li9/e0;Li9/d0;Li9/d0;Li9/d0;JJLn9/h;Li9/g0;)V
    .locals 2

    move-object/from16 v0, p16

    const-string v1, "request"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "protocol"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "message"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "headers"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "body"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "trailersSource"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li9/d0;->a:Li9/b0;

    .line 3
    iput-object p2, p0, Li9/d0;->b:Lokhttp3/Protocol;

    .line 4
    iput-object p3, p0, Li9/d0;->c:Ljava/lang/String;

    .line 5
    iput p4, p0, Li9/d0;->d:I

    .line 6
    iput-object p5, p0, Li9/d0;->e:Lokhttp3/c;

    .line 7
    iput-object p6, p0, Li9/d0;->f:Li9/v;

    .line 8
    iput-object p7, p0, Li9/d0;->g:Li9/e0;

    .line 9
    iput-object p8, p0, Li9/d0;->h:Li9/d0;

    .line 10
    iput-object p9, p0, Li9/d0;->i:Li9/d0;

    .line 11
    iput-object p10, p0, Li9/d0;->j:Li9/d0;

    .line 12
    iput-wide p11, p0, Li9/d0;->k:J

    move-wide p1, p13

    .line 13
    iput-wide p1, p0, Li9/d0;->l:J

    move-object/from16 p1, p15

    .line 14
    iput-object p1, p0, Li9/d0;->m:Ln9/h;

    .line 15
    iput-object v0, p0, Li9/d0;->n:Li9/g0;

    const/16 p1, 0xc8

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-gt p1, p4, :cond_0

    const/16 p1, 0x12c

    if-ge p4, p1, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    move p1, p3

    .line 16
    :goto_0
    iput-boolean p1, p0, Li9/d0;->p:Z

    const/16 p1, 0x133

    if-eq p4, p1, :cond_1

    const/16 p1, 0x134

    if-eq p4, p1, :cond_1

    packed-switch p4, :pswitch_data_0

    move p2, p3

    .line 17
    :cond_1
    :pswitch_0
    iput-boolean p2, p0, Li9/d0;->q:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic a(Li9/d0;)Li9/g0;
    .locals 0

    .line 1
    iget-object p0, p0, Li9/d0;->n:Li9/g0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Li9/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Li9/d0;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final b()Li9/e0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->g:Li9/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Li9/d;
    .locals 2

    .line 1
    iget-object v0, p0, Li9/d0;->o:Li9/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Li9/d;->n:Li9/d$b;

    .line 6
    .line 7
    iget-object v1, p0, Li9/d0;->f:Li9/v;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Li9/d$b;->a(Li9/v;)Li9/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Li9/d0;->o:Li9/d;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->g:Li9/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li9/e0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Li9/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->i:Li9/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Li9/d0;->f:Li9/v;

    .line 2
    .line 3
    iget v1, p0, Li9/d0;->d:I

    .line 4
    .line 5
    const/16 v2, 0x191

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/16 v2, 0x197

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v1, "Proxy-Authenticate"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v1, "WWW-Authenticate"

    .line 22
    .line 23
    :goto_0
    invoke-static {v0, v1}, Lo9/e;->a(Li9/v;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Li9/d0;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Ln9/h;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->m:Ln9/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lokhttp3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->e:Lokhttp3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p0, p1, v0, v1, v0}, Li9/d0;->k(Li9/d0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li9/d0;->f:Li9/v;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Li9/v;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    return-object p1
.end method

.method public final l()Li9/v;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->f:Li9/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Li9/d0;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Li9/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->h:Li9/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Li9/d0$a;
    .locals 1

    .line 1
    new-instance v0, Li9/d0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li9/d0$a;-><init>(Li9/d0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final q()Li9/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->j:Li9/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lokhttp3/Protocol;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->b:Lokhttp3/Protocol;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li9/d0;->l:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final t()Li9/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Li9/d0;->a:Li9/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Response{protocol="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Li9/d0;->b:Lokhttp3/Protocol;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", code="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Li9/d0;->d:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", message="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Li9/d0;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", url="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Li9/d0;->a:Li9/b0;

    .line 42
    .line 43
    invoke-virtual {v1}, Li9/b0;->l()Li9/w;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x7d

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final u()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li9/d0;->k:J

    .line 2
    .line 3
    return-wide v0
.end method
