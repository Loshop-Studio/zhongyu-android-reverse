.class public final Lp4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final Companion:Lp4/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:[Ld6/e;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lp4/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp4/e;->Companion:Lp4/d;

    .line 7
    .line 8
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 9
    .line 10
    new-instance v1, Lcom/zykj/view/board/play/b;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lr6/a;)Ld6/e;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/16 v1, 0xb

    .line 22
    .line 23
    new-array v1, v1, [Ld6/e;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v3, v1, v2

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    aput-object v3, v1, v2

    .line 31
    .line 32
    const/4 v2, 0x2

    .line 33
    aput-object v3, v1, v2

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    aput-object v3, v1, v2

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    aput-object v3, v1, v2

    .line 40
    .line 41
    const/4 v2, 0x5

    .line 42
    aput-object v3, v1, v2

    .line 43
    .line 44
    const/4 v2, 0x6

    .line 45
    aput-object v3, v1, v2

    .line 46
    .line 47
    const/4 v2, 0x7

    .line 48
    aput-object v3, v1, v2

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    aput-object v3, v1, v2

    .line 53
    .line 54
    const/16 v2, 0x9

    .line 55
    .line 56
    aput-object v3, v1, v2

    .line 57
    .line 58
    const/16 v2, 0xa

    .line 59
    .line 60
    aput-object v0, v1, v2

    .line 61
    .line 62
    sput-object v1, Lp4/e;->l:[Ld6/e;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_a

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lp4/e;->a:I

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_0

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lp4/e;->b:J

    goto :goto_0

    :cond_0
    iput-wide p3, p0, Lp4/e;->b:J

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const-string p3, ""

    if-nez p2, :cond_1

    iput-object p3, p0, Lp4/e;->c:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p5, p0, Lp4/e;->c:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lp4/e;->d:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p6, p0, Lp4/e;->d:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lp4/e;->e:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p7, p0, Lp4/e;->e:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lp4/e;->f:Ljava/lang/String;

    goto :goto_4

    :cond_4
    iput-object p8, p0, Lp4/e;->f:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-boolean p3, p0, Lp4/e;->g:Z

    goto :goto_5

    :cond_5
    iput-boolean p9, p0, Lp4/e;->g:Z

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-boolean p3, p0, Lp4/e;->h:Z

    goto :goto_6

    :cond_6
    iput-boolean p10, p0, Lp4/e;->h:Z

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_7

    iput-boolean v1, p0, Lp4/e;->i:Z

    goto :goto_7

    :cond_7
    iput-boolean p11, p0, Lp4/e;->i:Z

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_8

    iput-boolean p3, p0, Lp4/e;->j:Z

    goto :goto_8

    :cond_8
    iput-boolean p12, p0, Lp4/e;->j:Z

    :goto_8
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_9

    .line 2
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 3
    iput-object p1, p0, Lp4/e;->k:Ljava/util/List;

    return-void

    :cond_9
    iput-object p13, p0, Lp4/e;->k:Ljava/util/List;

    return-void

    :cond_a
    sget-object p2, Lp4/c;->a:Lp4/c;

    invoke-virtual {p2}, Lp4/c;->getDescriptor()Lk7/g;

    move-result-object p2

    invoke-static {p2, p1, v1}, Lm7/y0;->k(Lk7/g;II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/util/List;I)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    .line 16
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v13, v0

    goto :goto_0

    :cond_0
    move-object/from16 v13, p11

    :goto_0
    const/4 v12, 0x0

    move-object v1, p0

    move v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    .line 17
    invoke-direct/range {v1 .. v13}, Lp4/e;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;)V
    .locals 1

    const-string v0, "subject"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "examName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stemShoot"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lp4/e;->a:I

    .line 6
    iput-wide p2, p0, Lp4/e;->b:J

    .line 7
    iput-object p4, p0, Lp4/e;->c:Ljava/lang/String;

    .line 8
    iput-object p5, p0, Lp4/e;->d:Ljava/lang/String;

    .line 9
    iput-object p6, p0, Lp4/e;->e:Ljava/lang/String;

    .line 10
    iput-object p7, p0, Lp4/e;->f:Ljava/lang/String;

    .line 11
    iput-boolean p8, p0, Lp4/e;->g:Z

    .line 12
    iput-boolean p9, p0, Lp4/e;->h:Z

    .line 13
    iput-boolean p10, p0, Lp4/e;->i:Z

    .line 14
    iput-boolean p11, p0, Lp4/e;->j:Z

    .line 15
    iput-object p12, p0, Lp4/e;->k:Ljava/util/List;

    return-void
.end method

.method public static a(Lp4/e;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Lp4/e;
    .locals 13

    .line 1
    iget v1, p0, Lp4/e;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, p8, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide p1, p0, Lp4/e;->b:J

    .line 8
    .line 9
    :cond_0
    move-wide v2, p1

    .line 10
    and-int/lit8 p1, p8, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lp4/e;->c:Ljava/lang/String;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object/from16 v4, p3

    .line 19
    .line 20
    :goto_0
    and-int/lit8 p1, p8, 0x8

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Lp4/e;->d:Ljava/lang/String;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object/from16 v5, p4

    .line 29
    .line 30
    :goto_1
    and-int/lit8 p1, p8, 0x10

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lp4/e;->e:Ljava/lang/String;

    .line 35
    .line 36
    move-object v6, p1

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move-object/from16 v6, p5

    .line 39
    .line 40
    :goto_2
    and-int/lit8 p1, p8, 0x20

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, Lp4/e;->f:Ljava/lang/String;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    goto :goto_3

    .line 48
    :cond_4
    move-object/from16 v7, p6

    .line 49
    .line 50
    :goto_3
    iget-boolean v8, p0, Lp4/e;->g:Z

    .line 51
    .line 52
    iget-boolean v9, p0, Lp4/e;->h:Z

    .line 53
    .line 54
    iget-boolean v10, p0, Lp4/e;->i:Z

    .line 55
    .line 56
    iget-boolean v11, p0, Lp4/e;->j:Z

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string p0, "subject"

    .line 62
    .line 63
    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p0, "examName"

    .line 67
    .line 68
    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p0, "title"

    .line 72
    .line 73
    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p0, "stemShoot"

    .line 77
    .line 78
    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lp4/e;

    .line 82
    .line 83
    move-object/from16 v12, p7

    .line 84
    .line 85
    invoke-direct/range {v0 .. v12}, Lp4/e;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/util/List;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/e;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/e;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/e;->k:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/e;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lp4/e;

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
    check-cast p1, Lp4/e;

    .line 12
    .line 13
    iget v1, p0, Lp4/e;->a:I

    .line 14
    .line 15
    iget v3, p1, Lp4/e;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, Lp4/e;->b:J

    .line 21
    .line 22
    iget-wide v5, p1, Lp4/e;->b:J

    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return v2

    .line 29
    :cond_3
    iget-object v1, p0, Lp4/e;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lp4/e;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-object v1, p0, Lp4/e;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lp4/e;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, Lp4/e;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p1, Lp4/e;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, Lp4/e;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p1, Lp4/e;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    iget-boolean v1, p0, Lp4/e;->g:Z

    .line 74
    .line 75
    iget-boolean v3, p1, Lp4/e;->g:Z

    .line 76
    .line 77
    if-eq v1, v3, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-boolean v1, p0, Lp4/e;->h:Z

    .line 81
    .line 82
    iget-boolean v3, p1, Lp4/e;->h:Z

    .line 83
    .line 84
    if-eq v1, v3, :cond_9

    .line 85
    .line 86
    return v2

    .line 87
    :cond_9
    iget-boolean v1, p0, Lp4/e;->i:Z

    .line 88
    .line 89
    iget-boolean v3, p1, Lp4/e;->i:Z

    .line 90
    .line 91
    if-eq v1, v3, :cond_a

    .line 92
    .line 93
    return v2

    .line 94
    :cond_a
    iget-boolean v1, p0, Lp4/e;->j:Z

    .line 95
    .line 96
    iget-boolean v3, p1, Lp4/e;->j:Z

    .line 97
    .line 98
    if-eq v1, v3, :cond_b

    .line 99
    .line 100
    return v2

    .line 101
    :cond_b
    iget-object v1, p0, Lp4/e;->k:Ljava/util/List;

    .line 102
    .line 103
    iget-object p1, p1, Lp4/e;->k:Ljava/util/List;

    .line 104
    .line 105
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_c

    .line 110
    .line 111
    return v2

    .line 112
    :cond_c
    return v0
.end method

.method public final f()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lp4/e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lp4/e;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, Lp4/e;->b:J

    .line 11
    .line 12
    invoke-static {v2, v3, v0, v1}, Landroidx/collection/a;->B(JII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lp4/e;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lp4/e;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lp4/e;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lp4/e;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Landroidx/collection/a;->d(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lp4/e;->g:Z

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, Lp4/e;->h:Z

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, Lp4/e;->i:Z

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, Lp4/e;->j:Z

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->i(ZII)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, p0, Lp4/e;->k:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr v1, v0

    .line 71
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MistakeNavItem(itemId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lp4/e;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", topicId="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Lp4/e;->b:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", subject="

    .line 24
    .line 25
    const-string v2, ", examName="

    .line 26
    .line 27
    iget-object v3, p0, Lp4/e;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lp4/e;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", title="

    .line 35
    .line 36
    const-string v2, ", stemShoot="

    .line 37
    .line 38
    iget-object v3, p0, Lp4/e;->e:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, p0, Lp4/e;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/material3/c;->x(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v1, ", isCustomMistake="

    .line 46
    .line 47
    const-string v2, ", isRelatedQstGroup="

    .line 48
    .line 49
    iget-boolean v3, p0, Lp4/e;->g:Z

    .line 50
    .line 51
    iget-boolean v4, p0, Lp4/e;->h:Z

    .line 52
    .line 53
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 54
    .line 55
    .line 56
    const-string v1, ", hasStem="

    .line 57
    .line 58
    const-string v2, ", isMastered="

    .line 59
    .line 60
    iget-boolean v3, p0, Lp4/e;->i:Z

    .line 61
    .line 62
    iget-boolean v4, p0, Lp4/e;->j:Z

    .line 63
    .line 64
    invoke-static {v1, v2, v0, v3, v4}, Lg/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 65
    .line 66
    .line 67
    const-string v1, ", tags="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, Lp4/e;->k:Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ")"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method
