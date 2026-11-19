.class public abstract Ln5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/a$a;
    }
.end annotation


# static fields
.field public static final b:Ln5/a$a;


# instance fields
.field public final a:Ln5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ln5/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ln5/a;->b:Ln5/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ln5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln5/a;->a:Ln5/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;
    .locals 11

    .line 1
    const-string v0, "commandEnum"

    .line 2
    .line 3
    move-object/from16 v9, p5

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "buildCallBack"

    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 16
    .line 17
    iget-object v0, p0, Ln5/a;->a:Ln5/e;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ln5/e;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne v0, v3, :cond_0

    .line 28
    .line 29
    move v8, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v8, v2

    .line 32
    :goto_0
    invoke-interface/range {p6 .. p6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/protobuf/Message;

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->toByteArray()[B

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const-string v0, "buildCallBack().toByteArray()"

    .line 43
    .line 44
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    move-wide v4, p1

    .line 50
    move-wide v6, p3

    .line 51
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final b(JJLcom/zykj/board/EzyCommandEnum$CommandEnum;Lkotlin/jvm/functions/Function0;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
    .locals 11

    .line 1
    const-string v0, "commandEnum"

    .line 2
    .line 3
    move-object/from16 v9, p5

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "buildCallBack"

    .line 9
    .line 10
    move-object/from16 v1, p6

    .line 11
    .line 12
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 16
    .line 17
    iget-object v0, p0, Ln5/a;->a:Ln5/e;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ln5/e;->e()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x1

    .line 27
    if-ne v0, v3, :cond_0

    .line 28
    .line 29
    move v8, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v8, v2

    .line 32
    :goto_0
    invoke-interface/range {p6 .. p6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/google/protobuf/Message;

    .line 37
    .line 38
    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->toByteArray()[B

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const-string v0, "buildCallBack().toByteArray()"

    .line 43
    .line 44
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    move-wide v4, p1

    .line 50
    move-wide v6, p3

    .line 51
    invoke-direct/range {v1 .. v10}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 52
    .line 53
    .line 54
    return-object v1
.end method

.method public final c(JJ)J
    .locals 8

    .line 1
    iget-object v0, p0, Ln5/a;->a:Ln5/e;

    .line 2
    .line 3
    const-wide/16 v6, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move-wide v1, p3

    .line 11
    invoke-static/range {v0 .. v5}, Ln5/b$a;->a(Ln5/b;JZILjava/lang/Object;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-wide p3, v6

    .line 17
    :goto_0
    sub-long/2addr p3, p1

    .line 18
    cmp-long p1, p3, v6

    .line 19
    .line 20
    if-gez p1, :cond_1

    .line 21
    .line 22
    return-wide v6

    .line 23
    :cond_1
    return-wide p3
.end method

.method public final d()Ln5/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ln5/a;->a:Ln5/e;

    .line 2
    .line 3
    return-object v0
.end method
