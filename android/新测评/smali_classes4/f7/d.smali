.class public final Lf7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf7/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lf7/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf7/d;->a:Lf7/d;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lr9/d0;)Lf7/c;
    .locals 1

    .line 1
    const-string v0, "retrofit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lf7/c;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lr9/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "create(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lf7/c;

    .line 18
    .line 19
    return-object p1
.end method

.method public final b(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 1

    .line 1
    const-string v0, "userFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ossTokenApi"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "database"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/evaluation/upload/OssTaskManger;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
