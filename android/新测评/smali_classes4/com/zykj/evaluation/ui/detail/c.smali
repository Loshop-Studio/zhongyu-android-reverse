.class public final Lcom/zykj/evaluation/ui/detail/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Li6/p0;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/zykj/evaluation/ui/detail/f;

.field public final j:Lcom/zykj/evaluation/ui/detail/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;)V
    .locals 1

    const-string v0, "uuid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sketchPath"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "comment"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "correctSelfResult"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    .line 3
    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    .line 5
    iput-object p5, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    .line 6
    iput-object p6, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    .line 7
    iput-object p7, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    .line 8
    iput-object p8, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    .line 9
    iput-object p9, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    .line 10
    iput-object p10, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    .line 11
    iput-object p11, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x2

    .line 12
    const-string v0, ""

    if-eqz p13, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_1

    .line 13
    sget-object p4, Li6/p0$c$a;->b:Li6/p0$c$a;

    :cond_1
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_3

    .line 14
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p6

    :cond_3
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_4

    .line 15
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p7

    :cond_4
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_5

    move-object p8, v0

    :cond_5
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_6

    move-object p9, v0

    :cond_6
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_7

    .line 16
    sget-object p10, Lcom/zykj/evaluation/ui/detail/f$c;->b:Lcom/zykj/evaluation/ui/detail/f$c;

    :cond_7
    and-int/lit16 p12, p12, 0x200

    if-eqz p12, :cond_8

    .line 17
    sget-object p11, Lcom/zykj/evaluation/ui/detail/e$c;->d:Lcom/zykj/evaluation/ui/detail/e$c;

    :cond_8
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 18
    invoke-direct/range {p1 .. p12}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/evaluation/ui/detail/c;JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/detail/c;
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 1
    iget-wide p1, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object/from16 v4, p4

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object/from16 v5, p5

    :goto_1
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    move-object v6, p1

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    move-object v7, p1

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    move-object v8, p1

    goto :goto_4

    :cond_6
    move-object/from16 v8, p8

    :goto_4
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    move-object v9, p1

    goto :goto_5

    :cond_7
    move-object/from16 v9, p9

    :goto_5
    and-int/lit16 p1, v0, 0x100

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    move-object v10, p1

    goto :goto_6

    :cond_8
    move-object/from16 v10, p10

    :goto_6
    and-int/lit16 p1, v0, 0x200

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    move-object v11, p1

    :goto_7
    move-object v0, p0

    goto :goto_8

    :cond_9
    move-object/from16 v11, p11

    goto :goto_7

    :goto_8
    invoke-virtual/range {v0 .. v11}, Lcom/zykj/evaluation/ui/detail/c;->a(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;)Lcom/zykj/evaluation/ui/detail/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;)Lcom/zykj/evaluation/ui/detail/c;
    .locals 13

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "type"

    .line 9
    .line 10
    move-object/from16 v5, p4

    .line 11
    .line 12
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "number"

    .line 16
    .line 17
    move-object/from16 v6, p5

    .line 18
    .line 19
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "options"

    .line 23
    .line 24
    move-object/from16 v7, p6

    .line 25
    .line 26
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "answers"

    .line 30
    .line 31
    move-object/from16 v8, p7

    .line 32
    .line 33
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "sketchPath"

    .line 37
    .line 38
    move-object/from16 v9, p8

    .line 39
    .line 40
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "comment"

    .line 44
    .line 45
    move-object/from16 v10, p9

    .line 46
    .line 47
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v0, "result"

    .line 51
    .line 52
    move-object/from16 v11, p10

    .line 53
    .line 54
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "correctSelfResult"

    .line 58
    .line 59
    move-object/from16 v12, p11

    .line 60
    .line 61
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lcom/zykj/evaluation/ui/detail/c;

    .line 65
    .line 66
    move-wide v2, p1

    .line 67
    invoke-direct/range {v1 .. v12}, Lcom/zykj/evaluation/ui/detail/c;-><init>(JLjava/lang/String;Li6/p0;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/ui/detail/f;Lcom/zykj/evaluation/ui/detail/e;)V

    .line 68
    .line 69
    .line 70
    return-object v1
.end method

.method public final c()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lcom/zykj/evaluation/ui/detail/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/ui/detail/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/ui/detail/c;

    iget-wide v3, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    iget-wide v5, p1, Lcom/zykj/evaluation/ui/detail/c;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    iget-object v3, p1, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    iget-object p1, p1, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/zykj/evaluation/ui/detail/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Li6/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-wide v0, p0, Lcom/zykj/evaluation/ui/detail/c;->a:J

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/c;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/c;->c:Li6/p0;

    iget-object v4, p0, Lcom/zykj/evaluation/ui/detail/c;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/evaluation/ui/detail/c;->e:Ljava/util/List;

    iget-object v6, p0, Lcom/zykj/evaluation/ui/detail/c;->f:Ljava/util/List;

    iget-object v7, p0, Lcom/zykj/evaluation/ui/detail/c;->g:Ljava/lang/String;

    iget-object v8, p0, Lcom/zykj/evaluation/ui/detail/c;->h:Ljava/lang/String;

    iget-object v9, p0, Lcom/zykj/evaluation/ui/detail/c;->i:Lcom/zykj/evaluation/ui/detail/f;

    iget-object v10, p0, Lcom/zykj/evaluation/ui/detail/c;->j:Lcom/zykj/evaluation/ui/detail/e;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "DetailSubQuestionState(questionId="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", uuid="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", number="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", answers="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sketchPath="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", comment="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", correctSelfResult="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
