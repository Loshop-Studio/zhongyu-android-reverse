.class public final Ly6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly6/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ly6/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly6/c;->a:Ly6/c;

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
.method public final a(Lc9/y;)Ly6/b;
    .locals 1

    .line 1
    const-string v0, "retrofit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Ly6/b;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lc9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

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
    check-cast p1, Ly6/b;

    .line 18
    .line 19
    return-object p1
.end method

.method public final b(Ly6/b;Lkotlinx/coroutines/flow/MutableStateFlow;)Lcom/zykj/student/dialogue/upload/OssTaskManger;
    .locals 1

    .line 1
    const-string v0, "ossTokenApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userInfoFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/zykj/student/dialogue/upload/OssTaskManger;-><init>(Ly6/b;Lkotlinx/coroutines/flow/MutableStateFlow;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
