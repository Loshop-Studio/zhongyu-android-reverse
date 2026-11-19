.class public final Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lr5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr5/a;->a:Lr5/a;

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
.method public final a(Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 1

    .line 1
    const-string v0, "database"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ossTaskManger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitTaskManger;-><init>(Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
