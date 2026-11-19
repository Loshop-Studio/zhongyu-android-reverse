.class public final synthetic Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/c0;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm7/c0;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
    message = "This synthesized declaration should not be used directly"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/zykj/mistake/entity/req/SearchMistakeCollectionReq.$serializer",
        "Lm7/c0;",
        "Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
        "<init>",
        "()V",
        "Ll7/f;",
        "encoder",
        "value",
        "Ld6/s;",
        "serialize",
        "(Ll7/f;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)V",
        "Ll7/e;",
        "decoder",
        "deserialize",
        "(Ll7/e;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;",
        "",
        "Li7/b;",
        "childSerializers",
        "()[Li7/b;",
        "Lk7/g;",
        "descriptor",
        "Lk7/g;",
        "getDescriptor",
        "()Lk7/g;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final descriptor:Lk7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->INSTANCE:Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    sput v1, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->$stable:I

    .line 11
    .line 12
    new-instance v1, Lm7/a1;

    .line 13
    .line 14
    const-string v2, "com.zykj.mistake.entity.req.SearchMistakeCollectionReq"

    .line 15
    .line 16
    const/16 v3, 0xe

    .line 17
    .line 18
    invoke-direct {v1, v2, v0, v3}, Lm7/a1;-><init>(Ljava/lang/String;Lm7/c0;I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "collectionId"

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "timeRange"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "startTime"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "endTime"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const-string v0, "topicIds"

    .line 43
    .line 44
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "diff"

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    const-string v0, "attainedLevel"

    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    const-string v0, "errorReason"

    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    const-string v0, "currentCollectionStatus"

    .line 63
    .line 64
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    const-string v0, "otherCollectionStatus"

    .line 68
    .line 69
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    const-string v0, "tagIdList"

    .line 73
    .line 74
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    const-string v0, "sortType"

    .line 78
    .line 79
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    const-string v0, "skipCount"

    .line 83
    .line 84
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    const-string v0, "maxResultCount"

    .line 88
    .line 89
    invoke-virtual {v1, v0, v2}, Lm7/a1;->j(Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    sput-object v1, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->descriptor:Lk7/g;

    .line 93
    .line 94
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Li7/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Li7/b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->access$get$childSerializers$cp()[Ld6/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0xe

    .line 6
    .line 7
    new-array v1, v1, [Li7/b;

    .line 8
    .line 9
    sget-object v2, Lm7/j0;->a:Lm7/j0;

    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const/4 v4, 0x0

    .line 16
    aput-object v3, v1, v4

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v3, Lm7/m1;->a:Lm7/m1;

    .line 22
    .line 23
    invoke-static {v3}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x2

    .line 28
    aput-object v4, v1, v5

    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-static {v3}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    aput-object v3, v1, v4

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    aget-object v4, v0, v3

    .line 39
    .line 40
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    aput-object v4, v1, v3

    .line 45
    .line 46
    const/4 v3, 0x5

    .line 47
    aget-object v4, v0, v3

    .line 48
    .line 49
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    aput-object v4, v1, v3

    .line 54
    .line 55
    const/4 v3, 0x6

    .line 56
    aget-object v4, v0, v3

    .line 57
    .line 58
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    aput-object v4, v1, v3

    .line 63
    .line 64
    const/4 v3, 0x7

    .line 65
    aget-object v4, v0, v3

    .line 66
    .line 67
    invoke-interface {v4}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    aput-object v4, v1, v3

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    aput-object v2, v1, v3

    .line 76
    .line 77
    const/16 v3, 0x9

    .line 78
    .line 79
    aput-object v2, v1, v3

    .line 80
    .line 81
    const/16 v3, 0xa

    .line 82
    .line 83
    aget-object v0, v0, v3

    .line 84
    .line 85
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    aput-object v0, v1, v3

    .line 90
    .line 91
    const/16 v0, 0xb

    .line 92
    .line 93
    aput-object v2, v1, v0

    .line 94
    .line 95
    const/16 v0, 0xc

    .line 96
    .line 97
    aput-object v2, v1, v0

    .line 98
    .line 99
    const/16 v0, 0xd

    .line 100
    .line 101
    aput-object v2, v1, v0

    .line 102
    .line 103
    return-object v1
.end method

.method public final deserialize(Ll7/e;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
    .locals 46
    .param p1    # Ll7/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->descriptor:Lk7/g;

    invoke-interface {v0, v1}, Ll7/e;->beginStructure(Lk7/g;)Ll7/c;

    move-result-object v0

    invoke-static {}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->access$get$childSerializers$cp()[Ld6/e;

    move-result-object v2

    invoke-interface {v0}, Ll7/c;->decodeSequentially()Z

    move-result v3

    const/16 v7, 0x9

    const/4 v8, 0x3

    const/16 v9, 0x8

    const/4 v10, 0x2

    const/16 v11, 0xa

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lm7/j0;->a:Lm7/j0;

    invoke-interface {v0, v1, v5, v3, v6}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-interface {v0, v1, v4}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v4

    sget-object v5, Lm7/m1;->a:Lm7/m1;

    invoke-interface {v0, v1, v10, v5, v6}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v1, v8, v5, v6}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    aget-object v8, v2, v15

    invoke-interface {v8}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li7/a;

    invoke-interface {v0, v1, v15, v8, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    aget-object v15, v2, v14

    invoke-interface {v15}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li7/a;

    invoke-interface {v0, v1, v14, v15, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/ArrayList;

    aget-object v15, v2, v13

    invoke-interface {v15}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li7/a;

    invoke-interface {v0, v1, v13, v15, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/ArrayList;

    aget-object v15, v2, v12

    invoke-interface {v15}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Li7/a;

    invoke-interface {v0, v1, v12, v15, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/ArrayList;

    invoke-interface {v0, v1, v9}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v9

    invoke-interface {v0, v1, v7}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v7

    aget-object v2, v2, v11

    invoke-interface {v2}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/a;

    invoke-interface {v0, v1, v11, v2, v6}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    const/16 v6, 0xb

    invoke-interface {v0, v1, v6}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v6

    const/16 v11, 0xc

    invoke-interface {v0, v1, v11}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v11

    const/16 v15, 0xd

    invoke-interface {v0, v1, v15}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v15

    const/16 v16, 0x3fff

    move-object/from16 v41, v2

    move-object/from16 v31, v3

    move/from16 v32, v4

    move-object/from16 v34, v5

    move/from16 v42, v6

    move/from16 v40, v7

    move-object/from16 v35, v8

    move/from16 v39, v9

    move-object/from16 v33, v10

    move/from16 v43, v11

    move-object/from16 v38, v12

    move-object/from16 v37, v13

    move-object/from16 v36, v14

    move/from16 v44, v15

    move/from16 v30, v16

    goto/16 :goto_8

    :cond_0
    const/16 v3, 0xd

    move/from16 v28, v4

    move/from16 v22, v5

    move/from16 v23, v22

    move/from16 v24, v23

    move/from16 v25, v24

    move/from16 v26, v25

    move-object v4, v6

    move-object v8, v4

    move-object v10, v8

    move-object/from16 v18, v10

    move/from16 v27, v12

    move/from16 v21, v13

    move/from16 v20, v14

    move/from16 v19, v15

    move/from16 v6, v26

    move v12, v6

    move-object/from16 v5, v18

    move-object v13, v5

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v28, :cond_1

    invoke-interface {v0, v1}, Ll7/c;->decodeElementIndex(Lk7/g;)I

    move-result v9

    packed-switch v9, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    invoke-interface {v0, v1, v3}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v26

    or-int/lit16 v12, v12, 0x2000

    :goto_1
    const/16 v9, 0x8

    goto :goto_0

    :pswitch_1
    const/16 v9, 0xc

    invoke-interface {v0, v1, v9}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v25

    or-int/lit16 v12, v12, 0x1000

    goto :goto_1

    :pswitch_2
    const/16 v3, 0xb

    const/16 v9, 0xc

    invoke-interface {v0, v1, v3}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v22

    or-int/lit16 v12, v12, 0x800

    :goto_2
    const/16 v3, 0xd

    goto :goto_1

    :pswitch_3
    const/16 v3, 0xb

    const/16 v9, 0xc

    aget-object v17, v2, v11

    invoke-interface/range {v17 .. v17}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Li7/a;

    invoke-interface {v0, v1, v11, v3, v13}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/ArrayList;

    or-int/lit16 v12, v12, 0x400

    goto :goto_2

    :pswitch_4
    const/16 v9, 0xc

    invoke-interface {v0, v1, v7}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v23

    or-int/lit16 v12, v12, 0x200

    goto :goto_2

    :pswitch_5
    const/16 v3, 0x8

    const/16 v9, 0xc

    invoke-interface {v0, v1, v3}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v24

    or-int/lit16 v12, v12, 0x100

    move v9, v3

    const/16 v3, 0xd

    goto :goto_0

    :pswitch_6
    const/16 v3, 0x8

    const/16 v9, 0xc

    aget-object v17, v2, v27

    invoke-interface/range {v17 .. v17}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v3, v17

    check-cast v3, Li7/a;

    move/from16 v7, v27

    invoke-interface {v0, v1, v7, v3, v14}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Ljava/util/ArrayList;

    or-int/lit16 v12, v12, 0x80

    const/16 v3, 0xd

    const/16 v7, 0x9

    goto :goto_1

    :pswitch_7
    move/from16 v7, v27

    const/16 v9, 0xc

    aget-object v3, v2, v21

    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/a;

    move/from16 v7, v21

    invoke-interface {v0, v1, v7, v3, v15}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/util/ArrayList;

    or-int/lit8 v12, v12, 0x40

    const/16 v3, 0xd

    const/16 v7, 0x9

    const/16 v9, 0x8

    :goto_3
    const/16 v27, 0x7

    goto/16 :goto_0

    :pswitch_8
    move/from16 v7, v21

    const/16 v9, 0xc

    aget-object v3, v2, v20

    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/a;

    move/from16 v7, v20

    invoke-interface {v0, v1, v7, v3, v8}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/ArrayList;

    or-int/lit8 v12, v12, 0x20

    const/16 v3, 0xd

    const/16 v7, 0x9

    const/16 v9, 0x8

    :goto_4
    const/16 v21, 0x6

    goto :goto_3

    :pswitch_9
    move/from16 v7, v20

    const/16 v9, 0xc

    aget-object v3, v2, v19

    invoke-interface {v3}, Ld6/e;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/a;

    move/from16 v7, v19

    invoke-interface {v0, v1, v7, v3, v10}, Ll7/c;->decodeSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/util/ArrayList;

    or-int/lit8 v12, v12, 0x10

    const/16 v3, 0xd

    const/16 v7, 0x9

    const/16 v9, 0x8

    :goto_5
    const/16 v20, 0x5

    goto :goto_4

    :pswitch_a
    move/from16 v7, v19

    const/16 v9, 0xc

    sget-object v3, Lm7/m1;->a:Lm7/m1;

    const/4 v7, 0x3

    invoke-interface {v0, v1, v7, v3, v4}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x8

    :goto_6
    const/16 v3, 0xd

    :goto_7
    const/16 v7, 0x9

    const/16 v9, 0x8

    const/16 v19, 0x4

    goto :goto_5

    :pswitch_b
    const/4 v7, 0x3

    const/16 v9, 0xc

    sget-object v3, Lm7/m1;->a:Lm7/m1;

    const/4 v7, 0x2

    invoke-interface {v0, v1, v7, v3, v5}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    or-int/lit8 v12, v12, 0x4

    goto :goto_6

    :pswitch_c
    const/4 v3, 0x1

    const/4 v7, 0x2

    const/16 v9, 0xc

    invoke-interface {v0, v1, v3}, Ll7/c;->decodeIntElement(Lk7/g;I)I

    move-result v6

    or-int/lit8 v12, v12, 0x2

    goto :goto_6

    :pswitch_d
    const/4 v7, 0x2

    const/16 v9, 0xc

    sget-object v3, Lm7/j0;->a:Lm7/j0;

    move-object/from16 v7, v18

    const/4 v9, 0x0

    invoke-interface {v0, v1, v9, v3, v7}, Ll7/c;->decodeNullableSerializableElement(Lk7/g;ILi7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    or-int/lit8 v12, v12, 0x1

    move-object/from16 v18, v3

    goto :goto_6

    :pswitch_e
    move-object/from16 v7, v18

    const/4 v9, 0x0

    move/from16 v28, v9

    goto :goto_7

    :cond_1
    move-object/from16 v7, v18

    move-object/from16 v34, v4

    move-object/from16 v33, v5

    move/from16 v32, v6

    move-object/from16 v31, v7

    move-object/from16 v36, v8

    move-object/from16 v35, v10

    move/from16 v30, v12

    move-object/from16 v41, v13

    move-object/from16 v38, v14

    move-object/from16 v37, v15

    move/from16 v42, v22

    move/from16 v40, v23

    move/from16 v39, v24

    move/from16 v43, v25

    move/from16 v44, v26

    :goto_8
    invoke-interface {v0, v1}, Ll7/c;->endStructure(Lk7/g;)V

    new-instance v29, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    const/16 v45, 0x0

    invoke-direct/range {v29 .. v45}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;-><init>(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/util/ArrayList;IIILm7/i1;)V

    return-object v29

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->deserialize(Ll7/e;)Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->descriptor:Lk7/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)V
    .locals 1
    .param p1    # Ll7/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->descriptor:Lk7/g;

    invoke-interface {p1, v0}, Ll7/f;->beginStructure(Lk7/g;)Ll7/d;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;->write$Self$app_release(Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;Ll7/d;Lk7/g;)V

    invoke-interface {p1, v0}, Ll7/d;->endStructure(Lk7/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq$$serializer;->serialize(Ll7/f;Lcom/zykj/mistake/entity/req/SearchMistakeCollectionReq;)V

    return-void
.end method

.method public typeParametersSerializers()[Li7/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Li7/b;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lm7/y0;->b:[Li7/b;

    .line 2
    .line 3
    return-object v0
.end method
