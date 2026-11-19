.class final Lcom/friday/common/network/StudentSession$ensureReady$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/network/StudentSession;->i(Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.network.StudentSession"
    f = "StudentSession.kt"
    l = {
        0x40
    }
    m = "ensureReady"
.end annotation


# instance fields
.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/friday/common/network/StudentSession;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/friday/common/network/StudentSession;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$1;->d:Lcom/friday/common/network/StudentSession;

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

    iput-object p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$1;->c:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$1;->e:I

    iget-object p1, p0, Lcom/friday/common/network/StudentSession$ensureReady$1;->d:Lcom/friday/common/network/StudentSession;

    invoke-virtual {p1, p0}, Lcom/friday/common/network/StudentSession;->i(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
