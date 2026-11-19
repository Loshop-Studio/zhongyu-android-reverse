.class final Lcom/friday/user/work/ClearCacheWork$doWork$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/user/work/ClearCacheWork;->doWork(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.user.work.ClearCacheWork"
    f = "ClearCacheWork.kt"
    l = {
        0x2c,
        0x2e,
        0x30,
        0x36,
        0x3a,
        0x4e,
        0x52
    }
    m = "doWork"
.end annotation


# instance fields
.field public c:J

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

.field public o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lcom/friday/user/work/ClearCacheWork;

.field public s:I


# direct methods
.method public constructor <init>(Lcom/friday/user/work/ClearCacheWork;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/user/work/ClearCacheWork$doWork$1;->r:Lcom/friday/user/work/ClearCacheWork;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/user/work/ClearCacheWork$doWork$1;->q:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/user/work/ClearCacheWork$doWork$1;->s:I

    iget-object p1, p0, Lcom/friday/user/work/ClearCacheWork$doWork$1;->r:Lcom/friday/user/work/ClearCacheWork;

    invoke-virtual {p1, p0}, Lcom/friday/user/work/ClearCacheWork;->doWork(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
