.class final Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/repository/RefreshRepositoryImp;->a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.repository.RefreshRepositoryImp"
    f = "RefreshRepositoryImp.kt"
    l = {
        0x2f,
        0x32,
        0x43,
        0x45,
        0x5a,
        0x5c,
        0x67
    }
    m = "refreshToken"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lcom/zykj/study/repository/RefreshRepositoryImp;

.field public k:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/repository/RefreshRepositoryImp;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->j:Lcom/zykj/study/repository/RefreshRepositoryImp;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lm7/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->i:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->k:I

    iget-object p1, p0, Lcom/zykj/study/repository/RefreshRepositoryImp$refreshToken$1;->j:Lcom/zykj/study/repository/RefreshRepositoryImp;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/study/repository/RefreshRepositoryImp;->a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
