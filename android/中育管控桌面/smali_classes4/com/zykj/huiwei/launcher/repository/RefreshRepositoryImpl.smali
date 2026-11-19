# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;
.super Lq3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$a;

.field public static final f:I

.field public static final g:Ljava/lang/String;


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/AuthService;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public volatile d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->e:Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$a;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    sput v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->f:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getName(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/api/AuthService;Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 1

    .line 1
    const-string v0, "autoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "serverBeanDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headerBeanFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lq3/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->a:Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->b:Landroidx/datastore/core/DataStore;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 24
    .line 25
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;

    iget v4, v3, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    :goto_0
    move-object v10, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;

    invoke-direct {v3, v1, v2}, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;-><init>(Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v2, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eqz v4, :cond_7

    if-eq v4, v15, :cond_6

    if-eq v4, v6, :cond_4

    if-eq v4, v5, :cond_3

    if-eq v4, v12, :cond_2

    if-ne v4, v11, :cond_1

    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;

    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    :try_start_0
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_3
    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    iget-object v4, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    :try_start_1
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :cond_4
    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v24, v2

    move-object v2, v0

    move-object/from16 v0, v24

    goto :goto_3

    :cond_6
    iget-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    sget-object v2, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "oldToken -> "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-nez v2, :cond_9

    .line 4
    :cond_8
    :goto_2
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 5
    sget-object v2, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    const-string v4, "token\u6b63\u5728\u83b7\u53d6\u4e2d"

    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    iput v15, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    const-wide/16 v4, 0x64

    invoke-static {v4, v5, v10}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_8

    goto/16 :goto_9

    .line 7
    :cond_9
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->b:Landroidx/datastore/core/DataStore;

    invoke-interface {v2}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    iput-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    iput v6, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    invoke-static {v2, v10}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto/16 :goto_9

    .line 8
    :goto_3
    check-cast v0, Lcom/zykj/huiwei/launcher/proto/a;

    .line 9
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    const-string v6, "getAccessToken(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_a

    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    .line 10
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v15, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 12
    :cond_a
    sget-object v4, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    const-string v6, "\u6b63\u5728\u83b7\u53d6token"

    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    :try_start_2
    iget-object v4, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->a:Lcom/zykj/huiwei/launcher/api/AuthService;

    .line 14
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getServerUrl()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/api/TokenAuth/RefreshToken"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v7, v6

    .line 15
    const-string v6, "com.zykj.manage"

    .line 16
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "bearer "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 17
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/proto/a;->getRefreshToken()Ljava/lang/String;

    move-result-object v9

    const-string v11, "getRefreshToken(...)"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    iput v5, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    move-object v5, v7

    const/16 v7, 0x2732

    invoke-interface/range {v4 .. v10}, Lcom/zykj/huiwei/launcher/api/AuthService;->refreshToken(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v4, v3, :cond_b

    goto/16 :goto_9

    :cond_b
    move-object/from16 v24, v4

    move-object v4, v2

    move-object/from16 v2, v24

    .line 19
    :goto_4
    :try_start_3
    check-cast v2, Lcom/zykj/http/bean/ApiResp;

    .line 20
    invoke-static {v2}, La3/a;->a(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;

    .line 21
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    :cond_c
    invoke-interface {v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    .line 23
    move-object/from16 v16, v6

    check-cast v16, Lcom/zykj/http/bean/HeaderBean;

    .line 24
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;->getAccessToken()Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x17

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    .line 25
    invoke-static/range {v16 .. v23}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    move-result-object v7

    .line 26
    invoke-interface {v5, v6, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 27
    iget-object v5, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->b:Landroidx/datastore/core/DataStore;

    new-instance v6, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$3;

    invoke-direct {v6, v2, v13}, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$3;-><init>(Lcom/zykj/huiwei/launcher/bean/resp/TokenResp;Lkotlin/coroutines/Continuation;)V

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    iput v12, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    invoke-interface {v5, v6, v10}, Landroidx/datastore/core/DataStore;->updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    goto :goto_9

    .line 28
    :cond_d
    :goto_5
    sget-object v0, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    const-string v2, "token\u83b7\u53d6\u6210\u529f"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 29
    :goto_6
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v15, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v4, v2

    .line 30
    :goto_7
    :try_start_4
    sget-object v2, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "token\u83b7\u53d6\u5931\u8d25 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_6

    .line 31
    :goto_8
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-object v0, v4

    .line 32
    :cond_e
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->b:Landroidx/datastore/core/DataStore;

    invoke-interface {v2}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object v2

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->a:Ljava/lang/Object;

    iput-object v13, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->b:Ljava/lang/Object;

    iput-object v13, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->c:Ljava/lang/Object;

    const/4 v4, 0x5

    iput v4, v10, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl$refreshToken$1;->f:I

    invoke-static {v2, v10}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_f

    :goto_9
    return-object v3

    :cond_f
    :goto_a
    check-cast v2, Lcom/zykj/huiwei/launcher/proto/a;

    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/proto/a;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    .line 33
    sget-object v2, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " \u65b0token"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_2
    move-exception v0

    .line 35
    iget-object v2, v1, Lcom/zykj/huiwei/launcher/repository/RefreshRepositoryImpl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v15, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    throw v0
.end method
