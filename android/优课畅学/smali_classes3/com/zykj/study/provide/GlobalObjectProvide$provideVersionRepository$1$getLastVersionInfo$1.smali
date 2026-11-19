.class final Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;->a(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.provide.GlobalObjectProvide$provideVersionRepository$1"
    f = "GlobalObjectProvide.kt"
    l = {
        0x1e
    }
    m = "getLastVersionInfo"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->e:Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;

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
    .locals 2

    iput-object p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    iget-object p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->e:Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v0, p0}, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;->a(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
