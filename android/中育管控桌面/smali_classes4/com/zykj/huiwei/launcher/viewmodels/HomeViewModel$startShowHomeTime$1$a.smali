.class public final Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$a;->a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/huiwei/launcher/bean/HomeTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$a;->a:Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->o(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/huiwei/launcher/bean/HomeTime;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1$a;->a(Lcom/zykj/huiwei/launcher/bean/HomeTime;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
