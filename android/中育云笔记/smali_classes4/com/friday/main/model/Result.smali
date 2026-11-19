.class public final Lcom/friday/main/model/Result;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final appType:I

.field private final appVersionId:I

.field private final creationTime:Ljava/lang/String;

.field private final creatorUserId:I

.field private final description:Ljava/lang/String;

.field private final disabled:Z

.field private final downloads:I

.field private final fileUrl:Ljava/lang/String;

.field private final forceUpdate:Z

.field private final icon:Ljava/lang/String;

.field private final id:I

.field private final lastModificationTime:Ljava/lang/Object;

.field private final name:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;

.field private final score:D

.field private final size:I

.field private final summary:Ljava/lang/String;

.field private final versionCode:I

.field private final versionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V
    .locals 8

    move-object/from16 v0, p8

    move-object/from16 v1, p10

    move-object/from16 v2, p12

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p18

    move-object/from16 v6, p20

    const-string v7, "creationTime"

    invoke-static {p3, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "description"

    invoke-static {p5, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "fileUrl"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "icon"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "lastModificationTime"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "name"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "packageName"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "summary"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "versionName"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/friday/main/model/Result;->appType:I

    .line 3
    iput p2, p0, Lcom/friday/main/model/Result;->appVersionId:I

    .line 4
    iput-object p3, p0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    .line 5
    iput p4, p0, Lcom/friday/main/model/Result;->creatorUserId:I

    .line 6
    iput-object p5, p0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    .line 7
    iput-boolean p6, p0, Lcom/friday/main/model/Result;->disabled:Z

    .line 8
    iput p7, p0, Lcom/friday/main/model/Result;->downloads:I

    .line 9
    iput-object v0, p0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    move/from16 p1, p9

    .line 10
    iput-boolean p1, p0, Lcom/friday/main/model/Result;->forceUpdate:Z

    .line 11
    iput-object v1, p0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    move/from16 p1, p11

    .line 12
    iput p1, p0, Lcom/friday/main/model/Result;->id:I

    .line 13
    iput-object v2, p0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    .line 14
    iput-object v3, p0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    .line 15
    iput-object v4, p0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    move-wide/from16 p1, p15

    .line 16
    iput-wide p1, p0, Lcom/friday/main/model/Result;->score:D

    move/from16 p1, p17

    .line 17
    iput p1, p0, Lcom/friday/main/model/Result;->size:I

    .line 18
    iput-object v5, p0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    move/from16 p1, p19

    .line 19
    iput p1, p0, Lcom/friday/main/model/Result;->versionCode:I

    .line 20
    iput-object v6, p0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/main/model/Result;IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcom/friday/main/model/Result;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/friday/main/model/Result;->appType:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/friday/main/model/Result;->appVersionId:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/friday/main/model/Result;->creatorUserId:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/friday/main/model/Result;->disabled:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/friday/main/model/Result;->downloads:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/friday/main/model/Result;->forceUpdate:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/friday/main/model/Result;->id:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-wide v1, v0, Lcom/friday/main/model/Result;->score:D

    goto :goto_e

    :cond_e
    move-wide/from16 v1, p15

    :goto_e
    const v16, 0x8000

    and-int v16, p21, v16

    move-wide/from16 p2, v1

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/friday/main/model/Result;->size:I

    goto :goto_f

    :cond_f
    move/from16 v1, p17

    :goto_f
    const/high16 v2, 0x10000

    and-int v2, p21, v2

    if-eqz v2, :cond_10

    iget-object v2, v0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v2, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move/from16 p4, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/friday/main/model/Result;->versionCode:I

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    if-eqz v16, :cond_12

    move/from16 p5, v1

    iget-object v1, v0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    move/from16 p20, p5

    move-object/from16 p21, v1

    :goto_12
    move-wide/from16 p16, p2

    move/from16 p18, p4

    move-object/from16 p19, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p21, p20

    move/from16 p20, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p21}, Lcom/friday/main/model/Result;->copy(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)Lcom/friday/main/model/Result;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->appType:I

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->id:I

    return v0
.end method

.method public final component12()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()D
    .locals 2

    iget-wide v0, p0, Lcom/friday/main/model/Result;->score:D

    return-wide v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->size:I

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->versionCode:I

    return v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->appVersionId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->creatorUserId:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/main/model/Result;->disabled:Z

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/friday/main/model/Result;->downloads:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/main/model/Result;->forceUpdate:Z

    return v0
.end method

.method public final copy(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)Lcom/friday/main/model/Result;
    .locals 22

    const-string v0, "creationTime"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileUrl"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "icon"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastModificationTime"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageName"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "summary"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionName"

    move-object/from16 v2, p20

    invoke-static {v2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/main/model/Result;

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    move/from16 v12, p11

    move-wide/from16 v16, p15

    move/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, v2

    move/from16 v2, p1

    invoke-direct/range {v1 .. v21}, Lcom/friday/main/model/Result;-><init>(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/main/model/Result;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/main/model/Result;

    iget v1, p0, Lcom/friday/main/model/Result;->appType:I

    iget v3, p1, Lcom/friday/main/model/Result;->appType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/main/model/Result;->appVersionId:I

    iget v3, p1, Lcom/friday/main/model/Result;->appVersionId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/friday/main/model/Result;->creatorUserId:I

    iget v3, p1, Lcom/friday/main/model/Result;->creatorUserId:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/main/model/Result;->disabled:Z

    iget-boolean v3, p1, Lcom/friday/main/model/Result;->disabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/friday/main/model/Result;->downloads:I

    iget v3, p1, Lcom/friday/main/model/Result;->downloads:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/friday/main/model/Result;->forceUpdate:Z

    iget-boolean v3, p1, Lcom/friday/main/model/Result;->forceUpdate:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/friday/main/model/Result;->id:I

    iget v3, p1, Lcom/friday/main/model/Result;->id:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    iget-object v3, p1, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lcom/friday/main/model/Result;->score:D

    iget-wide v5, p1, Lcom/friday/main/model/Result;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/friday/main/model/Result;->size:I

    iget v3, p1, Lcom/friday/main/model/Result;->size:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/friday/main/model/Result;->versionCode:I

    iget v3, p1, Lcom/friday/main/model/Result;->versionCode:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAppType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->appType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAppVersionId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->appVersionId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCreationTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCreatorUserId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->creatorUserId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDisabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/model/Result;->disabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDownloads()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->downloads:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getForceUpdate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/model/Result;->forceUpdate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLastModificationTime()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScore()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/main/model/Result;->score:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->size:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSummary()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVersionCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/main/model/Result;->versionCode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/friday/main/model/Result;->appType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->appVersionId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->creatorUserId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/main/model/Result;->disabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->downloads:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/main/model/Result;->forceUpdate:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/friday/main/model/Result;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->size:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/main/model/Result;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lcom/friday/main/model/Result;->appType:I

    iget v2, v0, Lcom/friday/main/model/Result;->appVersionId:I

    iget-object v3, v0, Lcom/friday/main/model/Result;->creationTime:Ljava/lang/String;

    iget v4, v0, Lcom/friday/main/model/Result;->creatorUserId:I

    iget-object v5, v0, Lcom/friday/main/model/Result;->description:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/friday/main/model/Result;->disabled:Z

    iget v7, v0, Lcom/friday/main/model/Result;->downloads:I

    iget-object v8, v0, Lcom/friday/main/model/Result;->fileUrl:Ljava/lang/String;

    iget-boolean v9, v0, Lcom/friday/main/model/Result;->forceUpdate:Z

    iget-object v10, v0, Lcom/friday/main/model/Result;->icon:Ljava/lang/String;

    iget v11, v0, Lcom/friday/main/model/Result;->id:I

    iget-object v12, v0, Lcom/friday/main/model/Result;->lastModificationTime:Ljava/lang/Object;

    iget-object v13, v0, Lcom/friday/main/model/Result;->name:Ljava/lang/String;

    iget-object v14, v0, Lcom/friday/main/model/Result;->packageName:Ljava/lang/String;

    move-object/from16 v16, v14

    iget-wide v14, v0, Lcom/friday/main/model/Result;->score:D

    move-wide/from16 v17, v14

    iget v14, v0, Lcom/friday/main/model/Result;->size:I

    iget-object v15, v0, Lcom/friday/main/model/Result;->summary:Ljava/lang/String;

    move-object/from16 v19, v15

    iget v15, v0, Lcom/friday/main/model/Result;->versionCode:I

    move/from16 v20, v15

    iget-object v15, v0, Lcom/friday/main/model/Result;->versionName:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v15

    const-string v15, "Result(appType="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", appVersionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", creationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", creatorUserId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", disabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", downloads="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fileUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", forceUpdate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", lastModificationTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", summary="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", versionName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
