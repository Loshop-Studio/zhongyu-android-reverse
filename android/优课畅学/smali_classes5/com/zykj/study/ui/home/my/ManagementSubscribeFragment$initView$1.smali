.class final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment"
    f = "ManagementSubscribeFragment.kt"
    l = {
        0xdf
    }
    m = "initView"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public e:J

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

.field public h:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->g:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

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

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->f:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->h:I

    iget-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$initView$1;->g:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
