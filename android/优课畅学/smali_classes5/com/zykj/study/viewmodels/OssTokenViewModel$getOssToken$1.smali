.class final Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/OssTokenViewModel;->a(Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.OssTokenViewModel"
    f = "OssTokenViewModel.kt"
    l = {
        0x54
    }
    m = "getOssToken"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:J

.field public p:J

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lcom/zykj/study/viewmodels/OssTokenViewModel;

.field public t:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->s:Lcom/zykj/study/viewmodels/OssTokenViewModel;

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
    .locals 9

    iput-object p1, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->r:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->t:I

    iget-object v0, p0, Lcom/zykj/study/viewmodels/OssTokenViewModel$getOssToken$1;->s:Lcom/zykj/study/viewmodels/OssTokenViewModel;

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v8, p0

    invoke-virtual/range {v0 .. v8}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->a(Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
