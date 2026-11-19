.class public final Lt6/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Lt6/q0;

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:I

.field public final p:Z

.field public final q:Z

.field public final r:I

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)V
    .locals 2

    move-object/from16 v0, p20

    const-string v1, "title"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "topic"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "time"

    invoke-static {p9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "taskButtonState"

    invoke-static {p11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "address"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lt6/o0;->a:J

    .line 3
    iput-object p3, p0, Lt6/o0;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lt6/o0;->c:Ljava/lang/String;

    .line 5
    iput-boolean p5, p0, Lt6/o0;->d:Z

    .line 6
    iput-boolean p6, p0, Lt6/o0;->e:Z

    .line 7
    iput-boolean p7, p0, Lt6/o0;->f:Z

    .line 8
    iput p8, p0, Lt6/o0;->g:I

    .line 9
    iput-object p9, p0, Lt6/o0;->h:Ljava/lang/String;

    .line 10
    iput-boolean p10, p0, Lt6/o0;->i:Z

    .line 11
    iput-object p11, p0, Lt6/o0;->j:Lt6/q0;

    .line 12
    iput-boolean p12, p0, Lt6/o0;->k:Z

    move p1, p13

    .line 13
    iput-boolean p1, p0, Lt6/o0;->l:Z

    move/from16 p1, p14

    .line 14
    iput-boolean p1, p0, Lt6/o0;->m:Z

    move/from16 p1, p15

    .line 15
    iput-boolean p1, p0, Lt6/o0;->n:Z

    move/from16 p1, p16

    .line 16
    iput p1, p0, Lt6/o0;->o:I

    move/from16 p1, p17

    .line 17
    iput-boolean p1, p0, Lt6/o0;->p:Z

    move/from16 p1, p18

    .line 18
    iput-boolean p1, p0, Lt6/o0;->q:Z

    move/from16 p1, p19

    .line 19
    iput p1, p0, Lt6/o0;->r:I

    .line 20
    iput-object v0, p0, Lt6/o0;->s:Ljava/lang/String;

    move-wide/from16 p1, p21

    .line 21
    iput-wide p1, p0, Lt6/o0;->t:J

    move/from16 p1, p23

    .line 22
    iput p1, p0, Lt6/o0;->u:I

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 23
    const-string v1, "\u6d4b\u8bd5"

    goto :goto_1

    :cond_1
    move-object/from16 v1, p3

    :goto_1
    and-int/lit8 v6, v0, 0x4

    if-eqz v6, :cond_2

    .line 24
    const-string v6, "\u6570\u5b66"

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v7, v0, 0x8

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    move/from16 v7, p5

    :goto_3
    and-int/lit8 v9, v0, 0x10

    if-eqz v9, :cond_4

    move v9, v8

    goto :goto_4

    :cond_4
    move/from16 v9, p6

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    const/16 v10, 0x63

    goto :goto_6

    :cond_6
    move/from16 v10, p8

    :goto_6
    and-int/lit16 v11, v0, 0x80

    if-eqz v11, :cond_7

    .line 25
    const-string v11, "\u5f00\u59cb\u65f6\u95f4\uff1a2022-04-10 16:05    \u622a\u6b62\u65f6\u95f4\uff1a2022-04-11 16:05"

    goto :goto_7

    :cond_7
    move-object/from16 v11, p9

    :goto_7
    and-int/lit16 v12, v0, 0x100

    if-eqz v12, :cond_8

    const/4 v12, 0x0

    goto :goto_8

    :cond_8
    move/from16 v12, p10

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    .line 26
    sget-object v14, Lt6/q0$a$d;->e:Lt6/q0$a$d;

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move/from16 v15, p12

    :goto_a
    and-int/lit16 v2, v0, 0x800

    if-eqz v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    move/from16 v2, p13

    :goto_b
    and-int/lit16 v3, v0, 0x1000

    if-eqz v3, :cond_c

    const/4 v3, 0x0

    goto :goto_c

    :cond_c
    move/from16 v3, p14

    :goto_c
    and-int/lit16 v13, v0, 0x2000

    if-eqz v13, :cond_d

    const/4 v13, 0x0

    goto :goto_d

    :cond_d
    move/from16 v13, p15

    :goto_d
    move-object/from16 p2, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    goto :goto_e

    :cond_e
    move/from16 v1, p16

    :goto_e
    const v18, 0x8000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    const/16 v18, 0x0

    goto :goto_f

    :cond_f
    move/from16 v18, p17

    :goto_f
    const/high16 v19, 0x10000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    const/16 v19, 0x0

    goto :goto_10

    :cond_10
    move/from16 v19, p18

    :goto_10
    const/high16 v20, 0x20000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    const/16 v20, 0x0

    goto :goto_11

    :cond_11
    move/from16 v20, p19

    :goto_11
    const/high16 v21, 0x40000

    and-int v21, v0, v21

    if-eqz v21, :cond_12

    .line 27
    const-string v21, ""

    goto :goto_12

    :cond_12
    move-object/from16 v21, p20

    :goto_12
    const/high16 v22, 0x80000

    and-int v22, v0, v22

    if-eqz v22, :cond_13

    const-wide/16 v16, 0x0

    goto :goto_13

    :cond_13
    move-wide/from16 v16, p21

    :goto_13
    const/high16 v22, 0x100000

    and-int v0, v0, v22

    if-eqz v0, :cond_14

    const/16 p24, 0x0

    :goto_14
    move-object/from16 p1, p0

    move-object/from16 p4, p2

    move/from16 p17, v1

    move/from16 p14, v2

    move/from16 p15, v3

    move-wide/from16 p2, v4

    move-object/from16 p5, v6

    move/from16 p6, v7

    move/from16 p8, v8

    move/from16 p7, v9

    move/from16 p9, v10

    move-object/from16 p10, v11

    move/from16 p11, v12

    move/from16 p16, v13

    move-object/from16 p12, v14

    move/from16 p13, v15

    move-wide/from16 p22, v16

    move/from16 p18, v18

    move/from16 p19, v19

    move/from16 p20, v20

    move-object/from16 p21, v21

    goto :goto_15

    :cond_14
    move/from16 p24, p23

    goto :goto_14

    .line 28
    :goto_15
    invoke-direct/range {p1 .. p24}, Lt6/o0;-><init>(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)V

    return-void
.end method

.method public static synthetic b(Lt6/o0;JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JIILjava/lang/Object;)Lt6/o0;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p24

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    .line 1
    iget-wide v2, v0, Lt6/o0;->a:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lt6/o0;->b:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lt6/o0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-boolean v6, v0, Lt6/o0;->d:Z

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-boolean v7, v0, Lt6/o0;->e:Z

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-boolean v8, v0, Lt6/o0;->f:Z

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, Lt6/o0;->g:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lt6/o0;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lt6/o0;->i:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lt6/o0;->j:Lt6/q0;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lt6/o0;->k:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lt6/o0;->l:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-boolean v15, v0, Lt6/o0;->m:Z

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-boolean v2, v0, Lt6/o0;->n:Z

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    and-int/lit16 v3, v1, 0x4000

    if-eqz v3, :cond_e

    iget v3, v0, Lt6/o0;->o:I

    goto :goto_e

    :cond_e
    move/from16 v3, p16

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget-boolean v1, v0, Lt6/o0;->p:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p17

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p24, v18

    move/from16 p1, v1

    if-eqz v18, :cond_10

    iget-boolean v1, v0, Lt6/o0;->q:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p24, v18

    move/from16 p2, v1

    if-eqz v18, :cond_11

    iget v1, v0, Lt6/o0;->r:I

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, p24, v18

    move/from16 p3, v1

    if-eqz v18, :cond_12

    iget-object v1, v0, Lt6/o0;->s:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p20

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p24, v18

    move-object/from16 p5, v1

    move/from16 p4, v2

    if-eqz v18, :cond_13

    iget-wide v1, v0, Lt6/o0;->t:J

    goto :goto_13

    :cond_13
    move-wide/from16 v1, p21

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p24, v18

    if-eqz v18, :cond_14

    move-wide/from16 p6, v1

    iget v1, v0, Lt6/o0;->u:I

    move-wide/from16 p22, p6

    move/from16 p24, v1

    :goto_14
    move/from16 p18, p1

    move/from16 p19, p2

    move/from16 p20, p3

    move/from16 p16, p4

    move-object/from16 p21, p5

    move-object/from16 p1, v0

    move/from16 p17, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-wide/from16 p2, v16

    goto :goto_15

    :cond_14
    move/from16 p24, p23

    move-wide/from16 p22, v1

    goto :goto_14

    :goto_15
    invoke-virtual/range {p1 .. p24}, Lt6/o0;->a(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)Lt6/o0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)Lt6/o0;
    .locals 25

    .line 1
    const-string v0, "title"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topic"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskButtonState"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt6/o0;

    move-wide/from16 v2, p1

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-wide/from16 v22, p21

    move/from16 v24, p23

    invoke-direct/range {v1 .. v24}, Lt6/o0;-><init>(JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JI)V

    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/o0;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lt6/o0;->u:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Lt6/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/o0;->j:Lt6/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lt6/o0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lt6/o0;

    .line 12
    .line 13
    iget-wide v3, p0, Lt6/o0;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, Lt6/o0;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, Lt6/o0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lt6/o0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, Lt6/o0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lt6/o0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-boolean v1, p0, Lt6/o0;->d:Z

    .line 45
    .line 46
    iget-boolean v3, p1, Lt6/o0;->d:Z

    .line 47
    .line 48
    if-eq v1, v3, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-boolean v1, p0, Lt6/o0;->e:Z

    .line 52
    .line 53
    iget-boolean v3, p1, Lt6/o0;->e:Z

    .line 54
    .line 55
    if-eq v1, v3, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-boolean v1, p0, Lt6/o0;->f:Z

    .line 59
    .line 60
    iget-boolean v3, p1, Lt6/o0;->f:Z

    .line 61
    .line 62
    if-eq v1, v3, :cond_7

    .line 63
    .line 64
    return v2

    .line 65
    :cond_7
    iget v1, p0, Lt6/o0;->g:I

    .line 66
    .line 67
    iget v3, p1, Lt6/o0;->g:I

    .line 68
    .line 69
    if-eq v1, v3, :cond_8

    .line 70
    .line 71
    return v2

    .line 72
    :cond_8
    iget-object v1, p0, Lt6/o0;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v3, p1, Lt6/o0;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_9

    .line 81
    .line 82
    return v2

    .line 83
    :cond_9
    iget-boolean v1, p0, Lt6/o0;->i:Z

    .line 84
    .line 85
    iget-boolean v3, p1, Lt6/o0;->i:Z

    .line 86
    .line 87
    if-eq v1, v3, :cond_a

    .line 88
    .line 89
    return v2

    .line 90
    :cond_a
    iget-object v1, p0, Lt6/o0;->j:Lt6/q0;

    .line 91
    .line 92
    iget-object v3, p1, Lt6/o0;->j:Lt6/q0;

    .line 93
    .line 94
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    iget-boolean v1, p0, Lt6/o0;->k:Z

    .line 102
    .line 103
    iget-boolean v3, p1, Lt6/o0;->k:Z

    .line 104
    .line 105
    if-eq v1, v3, :cond_c

    .line 106
    .line 107
    return v2

    .line 108
    :cond_c
    iget-boolean v1, p0, Lt6/o0;->l:Z

    .line 109
    .line 110
    iget-boolean v3, p1, Lt6/o0;->l:Z

    .line 111
    .line 112
    if-eq v1, v3, :cond_d

    .line 113
    .line 114
    return v2

    .line 115
    :cond_d
    iget-boolean v1, p0, Lt6/o0;->m:Z

    .line 116
    .line 117
    iget-boolean v3, p1, Lt6/o0;->m:Z

    .line 118
    .line 119
    if-eq v1, v3, :cond_e

    .line 120
    .line 121
    return v2

    .line 122
    :cond_e
    iget-boolean v1, p0, Lt6/o0;->n:Z

    .line 123
    .line 124
    iget-boolean v3, p1, Lt6/o0;->n:Z

    .line 125
    .line 126
    if-eq v1, v3, :cond_f

    .line 127
    .line 128
    return v2

    .line 129
    :cond_f
    iget v1, p0, Lt6/o0;->o:I

    .line 130
    .line 131
    iget v3, p1, Lt6/o0;->o:I

    .line 132
    .line 133
    if-eq v1, v3, :cond_10

    .line 134
    .line 135
    return v2

    .line 136
    :cond_10
    iget-boolean v1, p0, Lt6/o0;->p:Z

    .line 137
    .line 138
    iget-boolean v3, p1, Lt6/o0;->p:Z

    .line 139
    .line 140
    if-eq v1, v3, :cond_11

    .line 141
    .line 142
    return v2

    .line 143
    :cond_11
    iget-boolean v1, p0, Lt6/o0;->q:Z

    .line 144
    .line 145
    iget-boolean v3, p1, Lt6/o0;->q:Z

    .line 146
    .line 147
    if-eq v1, v3, :cond_12

    .line 148
    .line 149
    return v2

    .line 150
    :cond_12
    iget v1, p0, Lt6/o0;->r:I

    .line 151
    .line 152
    iget v3, p1, Lt6/o0;->r:I

    .line 153
    .line 154
    if-eq v1, v3, :cond_13

    .line 155
    .line 156
    return v2

    .line 157
    :cond_13
    iget-object v1, p0, Lt6/o0;->s:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v3, p1, Lt6/o0;->s:Ljava/lang/String;

    .line 160
    .line 161
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_14

    .line 166
    .line 167
    return v2

    .line 168
    :cond_14
    iget-wide v3, p0, Lt6/o0;->t:J

    .line 169
    .line 170
    iget-wide v5, p1, Lt6/o0;->t:J

    .line 171
    .line 172
    cmp-long v1, v3, v5

    .line 173
    .line 174
    if-eqz v1, :cond_15

    .line 175
    .line 176
    return v2

    .line 177
    :cond_15
    iget v1, p0, Lt6/o0;->u:I

    .line 178
    .line 179
    iget p1, p1, Lt6/o0;->u:I

    .line 180
    .line 181
    if-eq v1, p1, :cond_16

    .line 182
    .line 183
    return v2

    .line 184
    :cond_16
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt6/o0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lt6/o0;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lt6/o0;->t:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lt6/o0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lt6/o0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lt6/o0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-boolean v1, p0, Lt6/o0;->d:Z

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-boolean v1, p0, Lt6/o0;->e:Z

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-boolean v1, p0, Lt6/o0;->f:Z

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget v1, p0, Lt6/o0;->g:I

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v1, p0, Lt6/o0;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-boolean v1, p0, Lt6/o0;->i:Z

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object v1, p0, Lt6/o0;->j:Lt6/q0;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v0, v1

    .line 88
    mul-int/lit8 v0, v0, 0x1f

    .line 89
    .line 90
    iget-boolean v1, p0, Lt6/o0;->k:Z

    .line 91
    .line 92
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v0, v1

    .line 97
    mul-int/lit8 v0, v0, 0x1f

    .line 98
    .line 99
    iget-boolean v1, p0, Lt6/o0;->l:Z

    .line 100
    .line 101
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    .line 107
    .line 108
    iget-boolean v1, p0, Lt6/o0;->m:Z

    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/2addr v0, v1

    .line 115
    mul-int/lit8 v0, v0, 0x1f

    .line 116
    .line 117
    iget-boolean v1, p0, Lt6/o0;->n:Z

    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    add-int/2addr v0, v1

    .line 124
    mul-int/lit8 v0, v0, 0x1f

    .line 125
    .line 126
    iget v1, p0, Lt6/o0;->o:I

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    add-int/2addr v0, v1

    .line 133
    mul-int/lit8 v0, v0, 0x1f

    .line 134
    .line 135
    iget-boolean v1, p0, Lt6/o0;->p:Z

    .line 136
    .line 137
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    add-int/2addr v0, v1

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    .line 143
    .line 144
    iget-boolean v1, p0, Lt6/o0;->q:Z

    .line 145
    .line 146
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    add-int/2addr v0, v1

    .line 151
    mul-int/lit8 v0, v0, 0x1f

    .line 152
    .line 153
    iget v1, p0, Lt6/o0;->r:I

    .line 154
    .line 155
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    add-int/2addr v0, v1

    .line 160
    mul-int/lit8 v0, v0, 0x1f

    .line 161
    .line 162
    iget-object v1, p0, Lt6/o0;->s:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    add-int/2addr v0, v1

    .line 169
    mul-int/lit8 v0, v0, 0x1f

    .line 170
    .line 171
    iget-wide v1, p0, Lt6/o0;->t:J

    .line 172
    .line 173
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    add-int/2addr v0, v1

    .line 178
    mul-int/lit8 v0, v0, 0x1f

    .line 179
    .line 180
    iget v1, p0, Lt6/o0;->u:I

    .line 181
    .line 182
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    add-int/2addr v0, v1

    .line 187
    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/o0;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/o0;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lt6/o0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Lt6/o0;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lt6/o0;->a:J

    .line 4
    .line 5
    iget-object v3, v0, Lt6/o0;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, v0, Lt6/o0;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v5, v0, Lt6/o0;->d:Z

    .line 10
    .line 11
    iget-boolean v6, v0, Lt6/o0;->e:Z

    .line 12
    .line 13
    iget-boolean v7, v0, Lt6/o0;->f:Z

    .line 14
    .line 15
    iget v8, v0, Lt6/o0;->g:I

    .line 16
    .line 17
    iget-object v9, v0, Lt6/o0;->h:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v10, v0, Lt6/o0;->i:Z

    .line 20
    .line 21
    iget-object v11, v0, Lt6/o0;->j:Lt6/q0;

    .line 22
    .line 23
    iget-boolean v12, v0, Lt6/o0;->k:Z

    .line 24
    .line 25
    iget-boolean v13, v0, Lt6/o0;->l:Z

    .line 26
    .line 27
    iget-boolean v14, v0, Lt6/o0;->m:Z

    .line 28
    .line 29
    iget-boolean v15, v0, Lt6/o0;->n:Z

    .line 30
    .line 31
    move/from16 v16, v15

    .line 32
    .line 33
    iget v15, v0, Lt6/o0;->o:I

    .line 34
    .line 35
    move/from16 v17, v15

    .line 36
    .line 37
    iget-boolean v15, v0, Lt6/o0;->p:Z

    .line 38
    .line 39
    move/from16 v18, v15

    .line 40
    .line 41
    iget-boolean v15, v0, Lt6/o0;->q:Z

    .line 42
    .line 43
    move/from16 v19, v15

    .line 44
    .line 45
    iget v15, v0, Lt6/o0;->r:I

    .line 46
    .line 47
    move/from16 v20, v15

    .line 48
    .line 49
    iget-object v15, v0, Lt6/o0;->s:Ljava/lang/String;

    .line 50
    .line 51
    move/from16 v21, v14

    .line 52
    .line 53
    move-object/from16 v22, v15

    .line 54
    .line 55
    iget-wide v14, v0, Lt6/o0;->t:J

    .line 56
    .line 57
    move-wide/from16 v23, v14

    .line 58
    .line 59
    iget v14, v0, Lt6/o0;->u:I

    .line 60
    .line 61
    new-instance v15, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v0, "HomeDataInfo(taskId="

    .line 67
    .line 68
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v15, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, ", title="

    .line 75
    .line 76
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", topic="

    .line 83
    .line 84
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", isCorrectSelf="

    .line 91
    .line 92
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, ", isOnline="

    .line 99
    .line 100
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, ", isNoNeedCommit="

    .line 107
    .line 108
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, ", urgeCount="

    .line 115
    .line 116
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v0, ", time="

    .line 123
    .line 124
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v0, ", isFavorite="

    .line 131
    .line 132
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v0, ", taskButtonState="

    .line 139
    .line 140
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, ", isUnread="

    .line 147
    .line 148
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, ", isTimeOver="

    .line 155
    .line 156
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, ", isCameraNewConfig="

    .line 163
    .line 164
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    move/from16 v0, v21

    .line 168
    .line 169
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, ", isNormalTrainingType="

    .line 173
    .line 174
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    move/from16 v0, v16

    .line 178
    .line 179
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v0, ", taskState="

    .line 183
    .line 184
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    move/from16 v0, v17

    .line 188
    .line 189
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    const-string v0, ", isNoStem="

    .line 193
    .line 194
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    move/from16 v0, v18

    .line 198
    .line 199
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v0, ", isFinish="

    .line 203
    .line 204
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    move/from16 v0, v19

    .line 208
    .line 209
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v0, ", specialType="

    .line 213
    .line 214
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    move/from16 v0, v20

    .line 218
    .line 219
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string v0, ", address="

    .line 223
    .line 224
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    move-object/from16 v0, v22

    .line 228
    .line 229
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v0, ", testPaperId="

    .line 233
    .line 234
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    move-wide/from16 v0, v23

    .line 238
    .line 239
    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v0, ", serialNum="

    .line 243
    .line 244
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v0, ")"

    .line 251
    .line 252
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    return-object v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt6/o0;->k:Z

    .line 2
    .line 3
    return v0
.end method
